/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.codehaus.groovy.parser.antlr4;

import groovy.lang.IntRange;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.codehaus.groovy.ast.*;
import org.codehaus.groovy.ast.expr.*;
import org.codehaus.groovy.ast.stmt.*;
import org.codehaus.groovy.control.CompilationFailedException;
import org.codehaus.groovy.control.CompilePhase;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.control.messages.SyntaxErrorMessage;
import org.codehaus.groovy.parser.antlr4.util.StringUtil;
import org.codehaus.groovy.runtime.IOGroovyMethods;
import org.codehaus.groovy.runtime.StringGroovyMethods;
import org.codehaus.groovy.syntax.Numbers;
import org.codehaus.groovy.syntax.SyntaxException;
import org.codehaus.groovy.syntax.Types;
import org.objectweb.asm.Opcodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static org.codehaus.groovy.parser.antlr4.GroovyParser.*;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.*;

/**
 * Created by Daniel.Sun on 2016/8/14.
 */
public class ASTBuilder extends GroovyParserBaseVisitor<Object> implements GroovyParserVisitor<Object> {

    public ASTBuilder(SourceUnit sourceUnit, ClassLoader classLoader) {
        this.sourceUnit = sourceUnit;
        this.moduleNode = new ModuleNode(sourceUnit);

        this.lexer = new GroovyLangLexer(
                new ANTLRInputStream(
                        this.readSourceCode(sourceUnit)));
        this.parser = new GroovyLangParser(
                new CommonTokenStream(this.lexer));

        this.setupErrorListener(this.parser);
    }

    public ModuleNode buildAST() {
        try {
            return (ModuleNode) this.visit(parser.compilationUnit());
        } catch (CompilationFailedException e) {
            LOGGER.log(Level.SEVERE, "Failed to build AST", e);

            throw e;
        }
    }

    @Override
    public ModuleNode visitCompilationUnit(CompilationUnitContext ctx) {
        this.visit(ctx.packageDeclaration());

        ctx.statement().stream()
                .map(this::visit)
                .filter(e -> e instanceof Statement)
                .forEach(e -> {
                    if (e instanceof DeclarationListStatement) {
                        ((DeclarationListStatement) e).getDeclarationStatements().forEach(moduleNode::addStatement);
                    } else {
                        moduleNode.addStatement((Statement) e);
                    }
                });

        // if groovy source file only contains blank(including EOF), add "return null" to the AST
        if (this.isBlankScript(ctx)) {
            this.addEmptyReturnStatement();
            return moduleNode;
        }

        return moduleNode;
    }

    @Override
    public PackageNode visitPackageDeclaration(PackageDeclarationContext ctx) {
        String packageName = this.visitQualifiedName(ctx.qualifiedName());
        moduleNode.setPackageName(packageName + DOT_STR);

        PackageNode packageNode = moduleNode.getPackage();

        this.visitAnnotationsOpt(ctx.annotationsOpt()).stream()
                .forEach(packageNode::addAnnotation);

        return this.configureAST(packageNode, ctx);
    }

    @Override
    public ImportNode visitImportDeclaration(ImportDeclarationContext ctx) {
        // GROOVY-6094
        moduleNode.putNodeMetaData(IMPORT_NODE_CLASS, IMPORT_NODE_CLASS);

        ImportNode importNode = null;

        boolean hasStatic = asBoolean(ctx.STATIC());
        boolean hasStar = asBoolean(ctx.MUL());
        boolean hasAlias = asBoolean(ctx.Identifier());

        List<AnnotationNode> annotationNodeList = this.visitAnnotationsOpt(ctx.annotationsOpt());

        if (hasStatic) {
            if (hasStar) { // e.g. import static java.lang.Math.*
                String qualifiedName = this.visitQualifiedName(ctx.qualifiedName());
                ClassNode type = ClassHelper.make(qualifiedName);


                moduleNode.addStaticStarImport(type.getText(), type, annotationNodeList);

                importNode = last(moduleNode.getStaticStarImports().values());
            } else { // e.g. import static java.lang.Math.pow
                List<TerminalNode> identifierList = new LinkedList<>(ctx.qualifiedName().Identifier());
                String name = pop(identifierList).getText();
                ClassNode classNode =
                        ClassHelper.make(
                                identifierList.stream()
                                        .map(ParseTree::getText)
                                        .collect(Collectors.joining(DOT_STR)));
                String alias = hasAlias
                        ? ctx.Identifier().getText()
                        : name;

                moduleNode.addStaticImport(classNode, name, alias, annotationNodeList);

                importNode = last(moduleNode.getStaticImports().values());
            }
        } else {
            if (hasStar) { // e.g. import java.util.*
                String qualifiedName = this.visitQualifiedName(ctx.qualifiedName());

                moduleNode.addStarImport(qualifiedName + DOT_STR, annotationNodeList);

                importNode = last(moduleNode.getStarImports());
            } else { // e.g. import java.util.Map
                String qualifiedName = this.visitQualifiedName(ctx.qualifiedName());
                String name = last(ctx.qualifiedName().Identifier()).getText();
                ClassNode classNode = ClassHelper.make(qualifiedName);
                String alias = hasAlias
                        ? ctx.Identifier().getText()
                        : name;

                moduleNode.addImport(alias, classNode, annotationNodeList);

                importNode = last(moduleNode.getImports());
            }
        }

        // TODO verify whether the following code is useful or not
        // we're using node metadata here in order to fix GROOVY-6094
        // without breaking external APIs
        Object node = moduleNode.getNodeMetaData(IMPORT_NODE_CLASS);
        if (null != node && IMPORT_NODE_CLASS != node) {
            this.configureAST((ImportNode) node, importNode);
        }
        moduleNode.removeNodeMetaData(IMPORT_NODE_CLASS);

        return this.configureAST(importNode, ctx);
    }

    // statement {    --------------------------------------------------------------------
    @Override
    public AssertStatement visitAssertStmtAlt(AssertStmtAltContext ctx) {
        Expression conditionExpression = (Expression) this.visit(ctx.ce);
        BooleanExpression booleanExpression =
                this.configureAST(
                        new BooleanExpression(conditionExpression), conditionExpression);

        if (!asBoolean(ctx.me)) {
            return this.configureAST(
                    new AssertStatement(booleanExpression), ctx);
        }

        return this.configureAST(new AssertStatement(booleanExpression,
                        (Expression) this.visit(ctx.me)),
                ctx);

    }

    @Override
    public IfStatement visitIfElseStmtAlt(IfElseStmtAltContext ctx) {
        Expression conditionExpression = this.visitParExpression(ctx.parExpression());
        BooleanExpression booleanExpression =
                this.configureAST(
                        new BooleanExpression(conditionExpression), conditionExpression);

        return this.configureAST(
                new IfStatement(booleanExpression,
                        (Statement) this.visit(ctx.tb),
                        asBoolean(ctx.ELSE()) ? (Statement) this.visit(ctx.fb) : EmptyStatement.INSTANCE),
                ctx);
    }

    @Override
    public ForStatement visitForStmtAlt(ForStmtAltContext ctx) {
        Pair<Parameter, Expression> controlPair = this.visitForControl(ctx.forControl());

        return this.configureAST(
                new ForStatement(controlPair.getKey(), controlPair.getValue(), (Statement) this.visit(ctx.statement())),
                ctx);
    }

    @Override
    public Pair<Parameter, Expression> visitForControl(ForControlContext ctx) {
        if (asBoolean(ctx.enhancedForControl())) { // e.g. for(int i in 0..<10) {}
            return this.visitEnhancedForControl(ctx.enhancedForControl());
        }

        if (asBoolean(ctx.SEMI())) { // e.g. for(int i = 0; i < 10; i++) {}
            ClosureListExpression closureListExpression = new ClosureListExpression();

            closureListExpression.addExpression(this.visitForInit(ctx.forInit()));
            closureListExpression.addExpression(asBoolean(ctx.expression()) ? (Expression) this.visit(ctx.expression()) : EmptyExpression.INSTANCE);
            closureListExpression.addExpression(this.visitForUpdate(ctx.forUpdate()));

            return new Pair<>(ForStatement.FOR_LOOP_DUMMY, closureListExpression);
        }

        throw createParsingFailedException("Unsupported for control: " + ctx.getText(), ctx);
    }

    @Override
    public Expression visitForInit(ForInitContext ctx) {
        if (!asBoolean(ctx)) {
            return EmptyExpression.INSTANCE;
        }

        if (asBoolean(ctx.localVariableDeclaration())) {
            DeclarationListStatement declarationListStatement = this.visitLocalVariableDeclaration(ctx.localVariableDeclaration());

            List<?> declarationExpressionList = declarationListStatement.getDeclarationExpressions();

            if (declarationExpressionList.size() == 1) {
                return this.configureAST((Expression) declarationExpressionList.get(0), ctx);
            } else {
                return this.configureAST(new ClosureListExpression((List<Expression>) declarationExpressionList), ctx);
            }
        }

        if (asBoolean(ctx.expression())) {
            return this.configureAST((Expression) this.visit(ctx.expression()), ctx);
        }

        throw createParsingFailedException("Unsupported for init: " + ctx.getText(), ctx);
    }

    @Override
    public Expression visitForUpdate(ForUpdateContext ctx) {
        if (!asBoolean(ctx)) {
            return EmptyExpression.INSTANCE;
        }

        return this.configureAST((Expression) this.visit(ctx.expression()), ctx);
    }


    @Override
    public Pair<Parameter, Expression> visitEnhancedForControl(EnhancedForControlContext ctx) {
        Parameter parameter = this.configureAST(
                new Parameter(this.visitType(ctx.type()), this.visitVariableDeclaratorId(ctx.variableDeclaratorId())),
                ctx.variableDeclaratorId());

        // FIXME Groovy will ignore variableModifier of parameter in the for control
        // In order to make the new parser behave same with the old one, we do not process variableModifier*

        return new Pair<>(parameter, (Expression) this.visit(ctx.expression()));
    }


    @Override
    public WhileStatement visitWhileStmtAlt(WhileStmtAltContext ctx) {
        Expression conditionExpression = this.visitParExpression(ctx.parExpression());
        BooleanExpression booleanExpression =
                this.configureAST(
                        new BooleanExpression(conditionExpression), conditionExpression);

        return this.configureAST(
                new WhileStatement(booleanExpression, (Statement) this.visit(ctx.statement())),
                ctx);
    }

    @Override
    public TryCatchStatement visitTryCatchStmtAlt(TryCatchStmtAltContext ctx) {
        TryCatchStatement tryCatchStatement =
                new TryCatchStatement((Statement) this.visit(ctx.block()),
                        this.visitFinallyBlock(ctx.finallyBlock()));


        ctx.catchClause().stream().map(this::visitCatchClause)
                .reduce(new LinkedList<CatchStatement>(), (r, e) -> {
                    r.addAll(e); // merge several LinkedList<CatchStatement> instances into one LinkedList<CatchStatement> instance
                    return r;
                })
                .forEach(tryCatchStatement::addCatch);

        return this.configureAST(tryCatchStatement, ctx);
    }

    /**
     * Multi-catch(1..*) clause will be unpacked to several normal catch clauses, so the return type is List
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public List<CatchStatement> visitCatchClause(CatchClauseContext ctx) {
        // FIXME Groovy will ignore variableModifier of parameter in the catch clause
        // In order to make the new parser behave same with the old one, we do not process variableModifier*

        return this.visitCatchType(ctx.catchType()).stream()
                .map(e -> this.configureAST(
                        new CatchStatement(
                                // FIXME The old parser does not set location info for the parameter of the catch clause.
                                // we could make it better
                                //this.configureAST(new Parameter(e, ctx.Identifier().getText()), ctx.Identifier()),

                                new Parameter(e, ctx.Identifier().getText()),
                                this.visitBlock(ctx.block())),
                        ctx.block()))
                .collect(Collectors.toList());
    }

    @Override
    public List<ClassNode> visitCatchType(CatchTypeContext ctx) {
        if (!asBoolean(ctx)) {
            return Collections.singletonList(ClassHelper.OBJECT_TYPE);
        }

        return ctx.qualifiedClassName().stream()
                .map(this::visitQualifiedClassName)
                .collect(Collectors.toList());
    }


    @Override
    public Statement visitFinallyBlock(FinallyBlockContext ctx) {
        if (!asBoolean(ctx)) {
            return EmptyStatement.INSTANCE;
        }

        return this.configureAST(
                this.createBlockStatement((Statement) this.visit(ctx.block())),
                ctx);
    }


    @Override
    public SynchronizedStatement visitSynchronizedStmtAlt(SynchronizedStmtAltContext ctx) {
        return this.configureAST(
                new SynchronizedStatement(this.visitParExpression(ctx.parExpression()), this.visitBlock(ctx.block())),
                ctx);
    }


    @Override
    public ExpressionStatement visitExpressionStmtAlt(ExpressionStmtAltContext ctx) {
        return this.visitStatementExpression(ctx.statementExpression());
    }

    @Override
    public ReturnStatement visitReturnStmtAlt(ReturnStmtAltContext ctx) {
        return this.configureAST(new ReturnStatement(asBoolean(ctx.expression())
                        ? (Expression) this.visit(ctx.expression())
                        : new ConstantExpression(null)),
                ctx);
    }

    @Override
    public ThrowStatement visitThrowStmtAlt(ThrowStmtAltContext ctx) {
        return this.configureAST(
                new ThrowStatement((Expression) this.visit(ctx.expression())),
                ctx);
    }

    @Override
    public Statement visitLabelStmtAlt(LabelStmtAltContext ctx) {
        Statement statement = (Statement) this.visit(ctx.statement());

        statement.setStatementLabel(ctx.Identifier().getText());

        return statement; // this.configureAST(statement, ctx);
    }

    @Override
    public BreakStatement visitBreakStmtAlt(BreakStmtAltContext ctx) {
        String label = asBoolean(ctx.Identifier())
                ? ctx.Identifier().getText()
                : null;

        return this.configureAST(new BreakStatement(label), ctx);
    }

    @Override
    public ContinueStatement visitContinueStmtAlt(ContinueStmtAltContext ctx) {
        String label = asBoolean(ctx.Identifier())
                ? ctx.Identifier().getText()
                : null;

        return this.configureAST(new ContinueStatement(label), ctx);
    }

    @Override
    public Statement visitLocalVariableDeclarationStmtAlt(LocalVariableDeclarationStmtAltContext ctx) {
        return this.configureAST(this.visitLocalVariableDeclaration(ctx.localVariableDeclaration()), ctx);
    }

// } statement    --------------------------------------------------------------------

    @Override
    public DeclarationListStatement visitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
        List<ModifierNode> modifierNodeList =
                ctx.variableModifier().stream()
                        .map(this::visitVariableModifier)
                        .collect(Collectors.toList());

        ClassNode classNode = this.visitType(ctx.type());
        List<DeclarationExpression> declarationExpressionList = this.visitVariableDeclarators(ctx.variableDeclarators());

        declarationExpressionList.stream().forEach(e -> {
            DeclarationExpression declarationExpression = (DeclarationExpression) e;

            VariableExpression veDTO = (VariableExpression) declarationExpression.getLeftExpression();

            VariableExpression variableExpression =
                    this.configureAST(
                            new VariableExpression(
                                    veDTO.getName(),
                                    classNode),
                            veDTO);

            ModifierManager modifierManager = new ModifierManager(modifierNodeList);
            modifierManager.processVariableExpression(variableExpression);

            declarationExpression.setLeftExpression(variableExpression);

            modifierManager.processDeclarationExpression(declarationExpression);
        });

        int size = declarationExpressionList.size();
        if (size > 0) {
            DeclarationExpression declarationExpression = declarationExpressionList.get(0);

            if (1 == size) {
                this.configureAST(declarationExpression, ctx);
            } else {
                // Tweak start of first declaration
                declarationExpression.setLineNumber(ctx.getStart().getLine());
                declarationExpression.setColumnNumber(ctx.getStart().getCharPositionInLine() + 1);
            }
        }

        return this.configureAST(new DeclarationListStatement(declarationExpressionList), ctx);
    }

    @Override
    public List<DeclarationExpression> visitVariableDeclarators(VariableDeclaratorsContext ctx) {
        return ctx.variableDeclarator().stream().map(this::visitVariableDeclarator).collect(Collectors.toList());
    }

    @Override
    public DeclarationExpression visitVariableDeclarator(VariableDeclaratorContext ctx) {
        org.codehaus.groovy.syntax.Token token;
        if (asBoolean(ctx.ASSIGN())) {
            token = createGroovyTokenByType(ctx.ASSIGN().getSymbol(), Types.ASSIGN);
        } else {
            token = new org.codehaus.groovy.syntax.Token(Types.ASSIGN, "=", ctx.start.getLine(), 1);
        }

        return this.configureAST(
                new DeclarationExpression(
                        this.configureAST(
                                new VariableExpression( // Act as a DTO
                                        this.visitVariableDeclaratorId(ctx.variableDeclaratorId()),
                                        ClassHelper.OBJECT_TYPE
                                ),
                                ctx.variableDeclaratorId()),
                        token,
                        this.visitVariableInitializer(ctx.variableInitializer())),
                ctx);
    }

    @Override
    public Expression visitVariableInitializer(VariableInitializerContext ctx) {
        if (!asBoolean(ctx)) {
            return EmptyExpression.INSTANCE;
        }

        if (asBoolean(ctx.arrayInitializer())) {
            return null; // TODO
        }

        if (asBoolean(ctx.expression())) {
            return this.configureAST((Expression) this.visit(ctx.expression()), ctx);
        }

        throw createParsingFailedException("Unsupported variable initializer: " + ctx.getText(), ctx);
    }


    @Override
    public Statement visitBlock(BlockContext ctx) {
        if (!asBoolean(ctx)) {
            return this.createBlockStatement();
        }

        return this.configureAST(
                this.createBlockStatement(
                        ctx.blockStatement().stream()
                                .map(e -> (Statement) this.visit(e))
                                .collect(Collectors.toList())),
                ctx);
    }

    @Override
    public ExpressionStatement visitStatementExpression(StatementExpressionContext ctx) {
        return this.configureAST(new ExpressionStatement((Expression) this.visit(ctx.expression())), ctx);
    }


    // expression {    --------------------------------------------------------------------
    @Override
    public Expression visitParExpression(ParExpressionContext ctx) {
        return this.configureAST((Expression) this.visit(ctx.expression()), ctx);
    }


    @Override
    public Expression visitPathExprAlt(PathExprAltContext ctx) {
        return this.configureAST(this.visitPathExpression(ctx.pathExpression()), ctx);
    }

    @Override
    public Expression visitPathExpression(PathExpressionContext ctx) {
        return this.configureAST((Expression) this.visit(ctx.primary()), ctx);
    }

    @Override
    public Expression visitUnaryNotExprAlt(UnaryNotExprAltContext ctx) {
        if (asBoolean(ctx.NOT())) {
            return this.configureAST(
                    new NotExpression((Expression) this.visit(ctx.expression())),
                    ctx);
        }

        if (asBoolean(ctx.BITNOT())) {
            return this.configureAST(
                    new BitwiseNegationExpression((Expression) this.visit(ctx.expression())),
                    ctx);
        }

        if (asBoolean(ctx.LPAREN())) { // TODO cast
            return null;
        }

        throw createParsingFailedException("Unsupported unary expression: " + ctx.getText(), ctx);
    }


    @Override
    public Expression visitUnaryAddExprAlt(UnaryAddExprAltContext ctx) {
        ExpressionContext expressionCtx = ctx.expression();

        switch (ctx.op.getType()) {
            case ADD: {
                Expression expression = (Expression) this.visit(expressionCtx);

                if (expression instanceof ConstantExpression) {
                    return this.configureAST((ConstantExpression) this.visit(expressionCtx), ctx);
                }

                return this.configureAST(new UnaryPlusExpression(expression), ctx);
            }
            case SUB: {
                Expression expression = (Expression) this.visit(expressionCtx);

                if (expression instanceof ConstantExpression) {
                    ConstantExpression constantExpression = (ConstantExpression) expression;

                    Object value = constantExpression.getValue();

                    if (value instanceof Integer) {
                        value = -((Integer) value);
                    } else if (value instanceof Long) {
                        value = -((Long) value);
                    } else if (value instanceof Float) {
                        value = -((Float) value);
                    } else if (value instanceof Double) {
                        value = -((Double) value);
                    } else if (value instanceof BigDecimal) {
                        value = ((BigDecimal) value).negate();
                    } else if (value instanceof BigInteger) {
                        value = ((BigInteger) value).negate();
                    } else {
                        throw createParsingFailedException("Unexprected value: " + value, ctx);
                    }

                    return this.configureAST(new ConstantExpression(value, false), ctx);
                }

                return this.configureAST(new UnaryMinusExpression(expression), ctx);
            }

            case INC:
            case DEC:
                return this.configureAST(new PrefixExpression(this.createGroovyToken(ctx.op), (Expression) this.visit(ctx.expression())), ctx);

            default:
                throw createParsingFailedException("Unsupported unary operation: " + ctx.getText(), ctx);
        }
    }

    @Override
    public Expression visitMultiplicativeExprAlt(MultiplicativeExprAltContext ctx) {
        return this.configureAST(
                this.createBinaryExpression(ctx.left, ctx.op, ctx.right),
                ctx);
    }

    @Override
    public Expression visitAdditiveExprAlt(AdditiveExprAltContext ctx) {
        return this.configureAST(
                this.createBinaryExpression(ctx.left, ctx.op, ctx.right),
                ctx);
    }


// } expression    --------------------------------------------------------------------


    // primary {       --------------------------------------------------------------------
    @Override
    public VariableExpression visitIdentifierPrmrAlt(IdentifierPrmrAltContext ctx) {
        return this.configureAST(new VariableExpression(ctx.Identifier().getText()), ctx);
    }

    @Override
    public ConstantExpression visitLiteralPrmrAlt(LiteralPrmrAltContext ctx) {
        return this.configureAST((ConstantExpression) this.visit(ctx.literal()), ctx);
    }

    @Override
    public GStringExpression visitGstringPrmrAlt(GstringPrmrAltContext ctx) {
        return this.configureAST((GStringExpression) this.visit(ctx.gstring()), ctx);
    }

    @Override
    public Expression visitParenPrmrAlt(ParenPrmrAltContext ctx) {
        return this.configureAST(this.visitParExpression(ctx.parExpression()), ctx);
    }

    @Override
    public ListExpression visitListPrmrAlt(ListPrmrAltContext ctx) {
        return this.configureAST(
                this.visitList(ctx.list()),
                ctx);
    }

// } primary       --------------------------------------------------------------------

    @Override
    public ListExpression visitList(ListContext ctx) {
        return this.configureAST(
                new ListExpression(
                        this.visitExpressionList(ctx.expressionList())),
                ctx);
    }

    @Override
    public List<Expression> visitExpressionList(ExpressionListContext ctx) {
        if (!asBoolean(ctx)) {
            return Collections.EMPTY_LIST;
        }

        return ctx.expression().stream()
                .map(e -> (Expression) this.visit(e))
                .collect(Collectors.toList());
    }


    // literal {       --------------------------------------------------------------------
    @Override
    public ConstantExpression visitIntegerLiteralAlt(IntegerLiteralAltContext ctx) {
        String text = ctx.IntegerLiteral().getText();

        return this.configureAST(new ConstantExpression(Numbers.parseInteger(null, text), !text.startsWith(SUB_STR)), ctx);
    }

    @Override
    public ConstantExpression visitFloatingPointLiteralAlt(FloatingPointLiteralAltContext ctx) {
        String text = ctx.FloatingPointLiteral().getText();

        return this.configureAST(new ConstantExpression(Numbers.parseDecimal(text), !text.startsWith(SUB_STR)), ctx);
    }

    @Override
    public ConstantExpression visitStringLiteralAlt(StringLiteralAltContext ctx) {
        String text = ctx.StringLiteral().getText();

        int slashyType = text.startsWith("/") ? StringUtil.SLASHY :
                text.startsWith("$/") ? StringUtil.DOLLAR_SLASHY : StringUtil.NONE_SLASHY;

        if (text.startsWith("'''") || text.startsWith("\"\"\"")) {
            text = StringUtil.removeCR(text); // remove CR in the multiline string

            text = text.length() == 6 ? "" : text.substring(3, text.length() - 3);
        } else if (text.startsWith("'") || text.startsWith("/") || text.startsWith("\"")) {
            text = text.length() == 2 ? "" : text.substring(1, text.length() - 1);
        } else if (text.startsWith("$/")) {
            text = StringUtil.removeCR(text);

            text = text.length() == 4 ? "" : text.substring(2, text.length() - 2);
        }

        //handle escapes.
        text = StringUtil.replaceEscapes(text, slashyType);

        return this.configureAST(new ConstantExpression(text, true), ctx);
    }


    @Override
    public ConstantExpression visitBooleanLiteralAlt(BooleanLiteralAltContext ctx) {
        return this.configureAST(new ConstantExpression("true".equals(ctx.BooleanLiteral().getText()), true), ctx);
    }

    @Override
    public ConstantExpression visitNullLiteralAlt(NullLiteralAltContext ctx) {
        return this.configureAST(new ConstantExpression(null), ctx);
    }
// } literal       --------------------------------------------------------------------

    // gstring {       --------------------------------------------------------------------
    @Override
    public GStringExpression visitGstring(GstringContext ctx) {
        List<ConstantExpression> strings = new LinkedList<>();

        String begin = ctx.GStringBegin().getText();
        final int slashyType = begin.startsWith("/")
                ? StringUtil.SLASHY
                : begin.startsWith("$/") ? StringUtil.DOLLAR_SLASHY : StringUtil.NONE_SLASHY;

        {
            String it = begin;
            if (it.startsWith("\"\"\"")) {
                it = StringUtil.removeCR(it);
                it = it.substring(2); // translate leading """ to "
            } else if (it.startsWith("$/")) {
                it = StringUtil.removeCR(it);
                it = "\"" + it.substring(2); // translate leading $/ to "
            }

            it = StringUtil.replaceEscapes(it, slashyType);
            it = (it.length() == 2)
                    ? ""
                    : StringGroovyMethods.getAt(it, new IntRange(true, 1, -2));

            strings.add(this.configureAST(new ConstantExpression(it), ctx.GStringBegin()));
        }

        List<ConstantExpression> partStrings =
                ctx.GStringPart().stream()
                        .map(e -> {
                            String it = e.getText();

                            it = StringUtil.removeCR(it);
                            it = StringUtil.replaceEscapes(it, slashyType);
                            it = it.length() == 1 ? "" : StringGroovyMethods.getAt(it, new IntRange(true, 0, -2));

                            return this.configureAST(new ConstantExpression(it), e);
                        }).collect(Collectors.toList());
        strings.addAll(partStrings);

        {
            String it = ctx.GStringEnd().getText();
            if (it.endsWith("\"\"\"")) {
                it = StringUtil.removeCR(it);
                it = StringGroovyMethods.getAt(it, new IntRange(true, 0, -3)); // translate tailing """ to "
            } else if (it.endsWith("/$")) {
                it = StringUtil.removeCR(it);
                it = StringGroovyMethods.getAt(it, new IntRange(false, 0, -2)) + "\""; // translate tailing /$ to "
            }

            it = StringUtil.replaceEscapes(it, slashyType);
            it = (it.length() == 1)
                    ? ""
                    : StringGroovyMethods.getAt(it, new IntRange(true, 0, -2));

            strings.add(this.configureAST(new ConstantExpression(it), ctx.GStringEnd()));
        }

        List<Expression> values = ctx.gstringValue().stream()
                .map(e -> {
                    Expression expression = this.visitGstringValue(e);

                    if (expression instanceof ClosureExpression && !asBoolean(e.closure().ARROW())) {
                        return this.configureAST(new MethodCallExpression(expression, CALL_STR, new ArgumentListExpression()), e);
                    }

                    return expression;
                })
                .collect(Collectors.toList());

        StringBuilder verbatimText = new StringBuilder(ctx.getText().length());
        for (int i = 0, n = strings.size(), s = values.size(); i < n; i++) {
            verbatimText.append(strings.get(i).getValue());

            if (i == s) {
                continue;
            }

            Expression value = values.get(i);
            if (!asBoolean(value)) {
                continue;
            }

            verbatimText.append(DOLLAR_STR);
            verbatimText.append(value.getText());
        }

        return this.configureAST(new GStringExpression(verbatimText.toString(), strings, values), ctx);
    }

    @Override
    public Expression visitGstringValue(GstringValueContext ctx) {
        if (asBoolean(ctx.gstringPath())) {
            return this.configureAST(this.visitGstringPath(ctx.gstringPath()), ctx);
        }

        if (asBoolean(ctx.LBRACE())) {
            if (asBoolean(ctx.expression())) {
                return this.configureAST((Expression) this.visit(ctx.expression()), ctx);
            } else { // e.g. "${}"
                return this.configureAST(new ConstantExpression(null), ctx);
            }
        }

        if (asBoolean(ctx.closure())) {
            return this.configureAST(this.visitClosure(ctx.closure()), ctx);
        }

        throw createParsingFailedException("Unsupported gstring value: " + ctx.getText(), ctx);
    }

    @Override
    public Expression visitGstringPath(GstringPathContext ctx) {
        VariableExpression variableExpression = new VariableExpression(ctx.Identifier().getText());

        if (asBoolean(ctx.GStringPathPart())) {
            Expression propertyExpression = ctx.GStringPathPart().stream()
                    .map(e -> this.configureAST((Expression) new ConstantExpression(e.getText().substring(1)), e))
                    .reduce(this.configureAST(variableExpression, ctx.Identifier()), (r, e) -> this.configureAST(new PropertyExpression(r, e), e));

            return this.configureAST(propertyExpression, ctx);
        }

        return this.configureAST(variableExpression, ctx);
    }
// } gstring       --------------------------------------------------------------------


    @Override
    public ClosureExpression visitClosure(ClosureContext ctx) {
        Parameter[] parameters = asBoolean(ctx.formalParameterList())
                ? this.visitFormalParameterList(ctx.formalParameterList())
                : null;
        Statement code = this.visitBlockStatementsOpt(ctx.blockStatementsOpt());

        return this.configureAST(new ClosureExpression(parameters, code), ctx);
    }

    @Override
    public Parameter[] visitFormalParameterList(FormalParameterListContext ctx) {
        List<Parameter> parameterList = new LinkedList<>();

        if (asBoolean(ctx.formalParameter())) {
            parameterList.addAll(
                    ctx.formalParameter().stream()
                            .map(this::visitFormalParameter)
                            .collect(Collectors.toList()));
        }

        if (asBoolean(ctx.lastFormalParameter())) {
            parameterList.add(this.visitLastFormalParameter(ctx.lastFormalParameter()));
        }

        return parameterList.toArray(new Parameter[0]);
    }

    @Override
    public Parameter visitFormalParameter(FormalParameterContext ctx) {
        return this.processFormalParameter(ctx, ctx.variableModifier(), ctx.type(), null, ctx.variableDeclaratorId());
    }

    @Override
    public Parameter visitLastFormalParameter(LastFormalParameterContext ctx) {
        return this.processFormalParameter(ctx, ctx.variableModifier(), ctx.type(), ctx.ELLIPSIS(), ctx.variableDeclaratorId());
    }

    @Override
    public ModifierNode visitVariableModifier(VariableModifierContext ctx) {
        if (asBoolean(ctx.annotation())) {
            return this.configureAST(new ModifierNode(this.visitAnnotation(ctx.annotation()), ctx.getText()), ctx);
        }

        Integer modifierType = null;
        if (asBoolean(ctx.FINAL())) {
            modifierType = ctx.FINAL().getSymbol().getType();
        } else if (asBoolean(ctx.DEF())) {
            modifierType = ctx.DEF().getSymbol().getType();
        }

        if (asBoolean((Object) modifierType)) {
            return this.configureAST(new ModifierNode(modifierType, ctx.getText()), ctx);
        }

        throw createParsingFailedException("Unsupported variable modifier", ctx);
    }

    // type {       --------------------------------------------------------------------
    @Override
    public ClassNode visitType(TypeContext ctx) {
        if (!asBoolean(ctx)) {
            return ClassHelper.OBJECT_TYPE;
        }

        ClassNode classNode = null;

        if (asBoolean(ctx.classOrInterfaceType())) {
            classNode = this.visitClassOrInterfaceType(ctx.classOrInterfaceType());

            if (asBoolean(ctx.LBRACK())) {
                classNode.setGenericsTypes(null); // clear array's generics type info. Groovy's bug? array's generics type will be ignored. e.g. List<String>[]... p
            }
        }

        if (asBoolean(ctx.primitiveType())) {
            classNode = this.visitPrimitiveType(ctx.primitiveType());
        }

        if (asBoolean(ctx.LBRACK())) {
            for (int i = 0, n = ctx.LBRACK().size(); i < n; i++) {
                classNode = this.configureAST(classNode.makeArray(), classNode);
            }
        }

        if (!asBoolean(classNode)) {
            throw createParsingFailedException("Unsupported type: " + ctx.getText(), ctx);
        }

        return this.configureAST(classNode, ctx);
    }

    @Override
    public ClassNode visitClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
        ClassNode classNode = this.visitQualifiedClassName(ctx.qualifiedClassName());

        if (asBoolean(ctx.typeArguments())) {
            classNode.setGenericsTypes(
                    this.visitTypeArguments(ctx.typeArguments()));
        }

        return this.configureAST(classNode, ctx);
    }

    @Override
    public GenericsType[] visitTypeArguments(TypeArgumentsContext ctx) {
        return ctx.typeArgument().stream().map(this::visitTypeArgument).toArray(GenericsType[]::new);
    }

    @Override
    public GenericsType visitTypeArgument(TypeArgumentContext ctx) {
        if (asBoolean(ctx.QUESTION())) {
            ClassNode baseType = this.configureAST(ClassHelper.makeWithoutCaching(QUESTION_STR), ctx.QUESTION());

            if (!asBoolean(ctx.type())) {
                GenericsType genericsType = new GenericsType(baseType);
                genericsType.setWildcard(true);
                genericsType.setName(QUESTION_STR);

                return this.configureAST(genericsType, ctx);
            }

            ClassNode[] upperBounds = null;
            ClassNode lowerBound = null;

            ClassNode classNode = this.visitType(ctx.type());
            if (asBoolean(ctx.EXTENDS())) {
                upperBounds = new ClassNode[]{classNode};
            } else if (asBoolean(ctx.SUPER())) {
                lowerBound = classNode;
            }

            GenericsType genericsType = new GenericsType(baseType, upperBounds, lowerBound);
            genericsType.setWildcard(true);
            genericsType.setName(QUESTION_STR);

            return this.configureAST(genericsType, ctx);
        } else if (asBoolean(ctx.type())) {
            return this.configureAST(new GenericsType(this.visitType(ctx.type())), ctx);
        }

        throw createParsingFailedException("Unsupported type argument: " + ctx.getText(), ctx);
    }


    @Override
    public ClassNode visitPrimitiveType(PrimitiveTypeContext ctx) {
        return this.configureAST(ClassHelper.make(ctx.getText()), ctx);
    }
// } type       --------------------------------------------------------------------

    @Override
    public String visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        return ctx.Identifier().getText();
    }

    @Override
    public BlockStatement visitBlockStatementsOpt(BlockStatementsOptContext ctx) {
        return this.configureAST(
                this.createBlockStatement(
                        ctx.blockStatement().stream()
                                .map(this::visitBlockStatement).collect(Collectors.toList())),
                ctx);
    }


    @Override
    public Statement visitBlockStatement(BlockStatementContext ctx) {
        if (asBoolean(ctx.localVariableDeclaration())) {
            return null; // TODO
        }

        if (asBoolean(ctx.statement())) {
            return (Statement) this.visit(ctx.statement()); //this.configureAST((Statement) this.visit(ctx.statement()), ctx);
        }

        if (asBoolean(ctx.typeDeclaration())) {
            return null; // TODO
        }

        throw createParsingFailedException("Unsupported block statement: " + ctx.getText(), ctx);
    }


    @Override
    public List<AnnotationNode> visitAnnotationsOpt(AnnotationsOptContext ctx) {
        return ctx.annotation().stream()
                .map(this::visitAnnotation)
                .collect(Collectors.toList());
    }

    @Override
    public AnnotationNode visitAnnotation(AnnotationContext ctx) {
        String annotationName = this.visitAnnotationName(ctx.annotationName());

        AnnotationNode annotationNode = new AnnotationNode(ClassHelper.make(annotationName));

        if (asBoolean(ctx.elementValuePairs())) {
            this.visitElementValuePairs(ctx.elementValuePairs()).entrySet().stream().forEach(e -> {
                annotationNode.addMember(e.getKey(), e.getValue());
            });
        } else if (asBoolean(ctx.elementValue())) {
            annotationNode.addMember(VALUE_STR, this.visitElementValue(ctx.elementValue()));
        }

        return this.configureAST(annotationNode, ctx);
    }

    @Override
    public String visitAnnotationName(AnnotationNameContext ctx) {
        return this.visitQualifiedName(ctx.qualifiedName());
    }

    @Override
    public Map<String, Expression> visitElementValuePairs(ElementValuePairsContext ctx) {
        return ctx.elementValuePair().stream()
                .map(this::visitElementValuePair)
                .collect(Collectors.toMap(Pair::getKey, Pair::getValue));
    }

    @Override
    public Pair<String, Expression> visitElementValuePair(ElementValuePairContext ctx) {
        return new Pair<>(ctx.Identifier().getText(), this.visitElementValue(ctx.elementValue()));
    }

    @Override
    public Expression visitElementValue(ElementValueContext ctx) {
        if (asBoolean(ctx.expression())) {
            return this.configureAST((Expression) this.visit(ctx.expression()), ctx);
        }

        if (asBoolean(ctx.annotation())) {
            return this.configureAST(new AnnotationConstantExpression(this.visitAnnotation(ctx.annotation())), ctx);
        }

        if (asBoolean(ctx.elementValueArrayInitializer())) {
            return this.configureAST(this.visitElementValueArrayInitializer(ctx.elementValueArrayInitializer()), ctx);
        }

        throw createParsingFailedException("Unsupported element value: " + ctx.getText(), ctx);
    }

    @Override
    public ListExpression visitElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {
        return this.configureAST(new ListExpression(ctx.elementValue().stream().map(this::visitElementValue).collect(Collectors.toList())), ctx);
    }

    @Override
    public String visitQualifiedName(QualifiedNameContext ctx) {
        return ctx.Identifier().stream()
                .map(ParseTree::getText)
                .collect(Collectors.joining(DOT_STR));
    }

    @Override
    public ClassNode visitQualifiedClassName(QualifiedClassNameContext ctx) {
        String upperCaseName = this.visitUpperCaseIdentifier(ctx.upperCaseIdentifier());

        if (asBoolean(ctx.Identifier())) {
            return ClassHelper.make(ctx.Identifier().stream().map(e -> e.getText()).collect(Collectors.joining("."))
                    + "."
                    + upperCaseName);
        }

        return ClassHelper.make(upperCaseName);
    }

    @Override
    public String visitUpperCaseIdentifier(UpperCaseIdentifierContext ctx) {
        return ctx.Identifier().getText();
    }

    /**
     * Visit tree safely, no NPE occurred when the tree is null.
     *
     * @param tree an AST node
     * @return the visiting result
     */
    @Override
    public Object visit(ParseTree tree) {
        if (!asBoolean(tree)) {
            return null;
        }

        return super.visit(tree);
    }

    private Parameter processFormalParameter(ParserRuleContext ctx,
                                             List<VariableModifierContext> variableModifierContextList,
                                             TypeContext typeContext,
                                             TerminalNode ellipsis,
                                             VariableDeclaratorIdContext variableDeclaratorIdContext) {

        ClassNode classNode = this.visitType(typeContext);

        if (asBoolean(ellipsis)) {
            classNode = this.configureAST(classNode.makeArray(), classNode);
        }

        Parameter parameter = this.configureAST(
                new Parameter(classNode, this.visitVariableDeclaratorId(variableDeclaratorIdContext)),
                ctx);

        new ModifierManager(variableModifierContextList.stream()
                .map(this::visitVariableModifier)
                .collect(Collectors.toList()))
                .processParameter(parameter);

        return parameter;
    }

    private BinaryExpression createBinaryExpression(ExpressionContext left, Token op, ExpressionContext right) {
        return new BinaryExpression((Expression) this.visit(left), this.createGroovyToken(op), (Expression) this.visit(right));
    }

    private BlockStatement createBlockStatement(Statement... statements) {
        return this.createBlockStatement(Arrays.asList(statements));
    }

    private BlockStatement createBlockStatement(List<Statement> statementList) {
        return (BlockStatement) statementList.stream()
                .reduce(new BlockStatement(), (r, e) -> {
                    ((BlockStatement) r).addStatement(e);
                    return r;
                });
    }

    private boolean isBlankScript(CompilationUnitContext ctx) {
        long blankCnt =
                ctx.children.stream()
                        .filter(e -> e instanceof NlsContext
                                || e instanceof PackageDeclarationContext
                                || e instanceof SepContext
                                || e instanceof ImportStmtAltContext
                                || e instanceof TerminalNode && (((TerminalNode) e).getSymbol().getType() == EOF)
                        ).count();


        return blankCnt == ctx.children.size();
    }

    private void addEmptyReturnStatement() {
        moduleNode.addStatement(new ReturnStatement(new ConstantExpression(null)));
    }


    private org.codehaus.groovy.syntax.Token createGroovyTokenByType(Token token, int type) {
        if (null == token) {
            throw new IllegalArgumentException("token should not be null");
        }

        return new org.codehaus.groovy.syntax.Token(type, token.getText(), token.getLine(), token.getCharPositionInLine());
    }

    private org.codehaus.groovy.syntax.Token createGroovyToken(TerminalNode node) {
        return this.createGroovyToken(node, 1);
    }

    private org.codehaus.groovy.syntax.Token createGroovyToken(Token token) {
        return this.createGroovyToken(token, 1);
    }

    /**
     * @param node
     * @param cardinality Used for handling GT ">" operator, which can be repeated to give bitwise shifts >> or >>>
     * @return
     */
    private org.codehaus.groovy.syntax.Token createGroovyToken(TerminalNode node, int cardinality) {
        return this.createGroovyToken(node.getSymbol(), cardinality);
    }

    private org.codehaus.groovy.syntax.Token createGroovyToken(Token token, int cardinality) {
        String text = StringGroovyMethods.multiply((CharSequence) token.getText(), cardinality);
        return new org.codehaus.groovy.syntax.Token(
                "..<".equals(token.getText()) || "..".equals(token.getText())
                        ? Types.RANGE_OPERATOR
                        : Types.lookup(text, Types.ANY),
                text,
                token.getLine(),
                token.getCharPositionInLine() + 1
        );
    }


    /**
     * Sets location(lineNumber, colNumber, lastLineNumber, lastColumnNumber) for node using standard context information.
     * Note: this method is implemented to be closed over ASTNode. It returns same node as it received in arguments.
     *
     * @param astNode Node to be modified.
     * @param ctx     Context from which information is obtained.
     * @return Modified astNode.
     */
    private <T extends ASTNode> T configureAST(T astNode, ParserRuleContext ctx) {
        Token start = ctx.getStart();
        Token stop = ctx.getStop();

        astNode.setLineNumber(start.getLine());
        astNode.setColumnNumber(start.getCharPositionInLine() + 1);
        astNode.setLastLineNumber(stop.getLine());
        astNode.setLastColumnNumber(stop.getCharPositionInLine() + 1 + stop.getText().length());

        return astNode;
    }

    private <T extends ASTNode> T configureAST(T astNode, TerminalNode terminalNode) {
        return this.configureAST(astNode, terminalNode.getSymbol());
    }

    private <T extends ASTNode> T configureAST(T astNode, Token token) {
        astNode.setLineNumber(token.getLine());
        astNode.setColumnNumber(token.getCharPositionInLine() + 1);
        astNode.setLastLineNumber(token.getLine());
        astNode.setLastColumnNumber(token.getCharPositionInLine() + 1 + token.getText().length());

        return astNode;
    }

    private <T extends ASTNode> T configureAST(T astNode, ASTNode source) {
        astNode.setLineNumber(source.getLineNumber());
        astNode.setColumnNumber(source.getColumnNumber());
        astNode.setLastLineNumber(source.getLastLineNumber());
        astNode.setLastColumnNumber(source.getLastColumnNumber());

        return astNode;
    }


    private CompilationFailedException createParsingFailedException(String msg, ParserRuleContext ctx) {
        return createParsingFailedException(new SyntaxException(msg,
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine() + 1,
                ctx.stop.getLine(),
                ctx.stop.getCharPositionInLine() + 1 + ctx.stop.getText().length()));
    }

    private CompilationFailedException createParsingFailedException(Exception e) {
        return new CompilationFailedException(
                CompilePhase.PARSING.getPhaseNumber(),
                this.sourceUnit,
                e);
    }

    private String readSourceCode(SourceUnit sourceUnit) {
        String text = null;
        try {
            text = IOGroovyMethods.getText(
                    new BufferedReader(
                            sourceUnit.getSource().getReader()));
        } catch (IOException e) {
            LOGGER.severe(createExceptionMessage(e));
            throw new RuntimeException("Error occurred when reading source code.", e);
        }

        return text;
    }

    private void setupErrorListener(GroovyLangParser parser) {
        parser.removeErrorListeners();
        parser.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(
                    Recognizer<?, ?> recognizer,
                    Object offendingSymbol, int line, int charPositionInLine,
                    String msg, RecognitionException e) {

                sourceUnit.getErrorCollector().addFatalError(new SyntaxErrorMessage(new SyntaxException(msg, line, charPositionInLine + 1), sourceUnit));
            }

            @Override
            public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {

                LOGGER.fine("Ambiguity at " + startIndex + " - " + stopIndex);
            }

            @Override
            public void reportAttemptingFullContext(
                    Parser recognizer,
                    DFA dfa, int startIndex, int stopIndex,
                    BitSet conflictingAlts, ATNConfigSet configs) {

                LOGGER.fine("Attempting Full Context at " + startIndex + " - " + stopIndex);
            }

            @Override
            public void reportContextSensitivity(
                    Parser recognizer,
                    DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {

                LOGGER.fine("Context Sensitivity at " + startIndex + " - " + stopIndex);
            }
        });
    }

    private String createExceptionMessage(Throwable t) {
        StringWriter sw = new StringWriter();

        try (PrintWriter pw = new PrintWriter(sw)) {
            t.printStackTrace(pw);
        }

        return sw.toString();
    }

    private class DeclarationListStatement extends Statement {
        private List<ExpressionStatement> declarationStatements;

        public DeclarationListStatement(List<DeclarationExpression> declarations) {
            this.declarationStatements =
                    declarations.stream()
                            .map(e -> configureAST(new ExpressionStatement(e), e))
                            .collect(Collectors.toList());
        }

        public List<ExpressionStatement> getDeclarationStatements() {
            return this.declarationStatements;
        }

        public List<DeclarationExpression> getDeclarationExpressions() {
            return this.declarationStatements.stream()
                    .map(e -> (DeclarationExpression) e.getExpression())
                    .collect(Collectors.toList());
        }
    }

    private static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(key, pair.key) &&
                    Objects.equals(value, pair.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    /**
     * Process modifiers for AST nodes
     * <p>
     * Created by Daniel.Sun on 2016/8/27.
     */
    private static class ModifierManager {
        private List<ModifierNode> modifierNodeList;

        public ModifierManager(List<ModifierNode> modifierNodeList) {
            this.modifierNodeList = modifierNodeList;
        }

        public List<AnnotationNode> getAnnotations() {
            return modifierNodeList.stream()
                    .filter(ModifierNode::isAnnotation)
                    .map(ModifierNode::getAnnotationNode)
                    .collect(Collectors.toList());
        }

        public void processParameter(Parameter parameter) {
            modifierNodeList.forEach(e -> {
                parameter.setModifiers(parameter.getModifiers() | e.getOpCode());

                if (e.isAnnotation()) {
                    parameter.addAnnotation(e.getAnnotationNode());
                }
            });
        }

        public void processVariableExpression(VariableExpression ve) {
            modifierNodeList.forEach(e -> {
                ve.setModifiers(ve.getModifiers() | e.getOpCode());

                // local variable does not attach annotations
            });
        }

        public void processDeclarationExpression(DeclarationExpression de) {
            this.getAnnotations().forEach(de::addAnnotation);
        }
    }

    /**
     * Represents a modifier, which is better to place in the package org.codehaus.groovy.ast
     * <p>
     * Created by Daniel.Sun on 2016/8/23.
     */
    private static class ModifierNode extends ASTNode {
        private Integer type;
        private Integer opCode; // ASM opcode
        private String text;
        private AnnotationNode annotationNode;

        public static final int ANNOTATION_TYPE = -999;
        private static final Map<Integer, Integer> MAP = new HashMap<Integer, Integer>() {
            {
                put(ANNOTATION_TYPE, 0);
                put(DEF, 0);

                put(NATIVE, Opcodes.ACC_NATIVE);
                put(SYNCHRONIZED, Opcodes.ACC_SYNCHRONIZED);
                put(TRANSIENT, Opcodes.ACC_TRANSIENT);
                put(VOLATILE, Opcodes.ACC_VOLATILE);

                put(PUBLIC, Opcodes.ACC_PUBLIC);
                put(PROTECTED, Opcodes.ACC_PROTECTED);
                put(PRIVATE, Opcodes.ACC_PRIVATE);
                put(STATIC, Opcodes.ACC_STATIC);
                put(ABSTRACT, Opcodes.ACC_ABSTRACT);
                put(FINAL, Opcodes.ACC_FINAL);
                put(STRICTFP, Opcodes.ACC_STRICT);
            }
        };

        public ModifierNode(Integer type) {
            this.type = type;
            this.opCode = MAP.get(type);

            if (!asBoolean((Object) this.opCode)) {
                throw new IllegalArgumentException("Unsupported modifier type: " + type);
            }
        }

        /**
         * @param type the modifier type, which is same as the token type
         * @param text text of the ast node
         */
        public ModifierNode(Integer type, String text) {
            this(type);
            this.text = text;
        }

        /**
         * @param annotationNode the annotation node
         * @param text           text of the ast node
         */
        public ModifierNode(AnnotationNode annotationNode, String text) {
            this(ModifierNode.ANNOTATION_TYPE, text);
            this.annotationNode = annotationNode;

            if (!asBoolean(annotationNode)) {
                throw new IllegalArgumentException("annotationNode can not be null");
            }
        }

        public boolean isOp() {
            return !this.isAnnotation() && !this.isDef();
        }

        public boolean isAnnotation() {
            return Objects.equals(ANNOTATION_TYPE, this.type);
        }

        public boolean isDef() {
            return Objects.equals(DEF, this.type);
        }

        public Integer getType() {
            return type;
        }

        public Integer getOpCode() {
            return opCode;
        }

        @Override
        public String getText() {
            return text;
        }

        public AnnotationNode getAnnotationNode() {
            return annotationNode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ModifierNode that = (ModifierNode) o;
            return Objects.equals(type, that.type) &&
                    Objects.equals(text, that.text) &&
                    Objects.equals(annotationNode, that.annotationNode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(type, text, annotationNode);
        }
    }

    private final ModuleNode moduleNode;
    private final SourceUnit sourceUnit;
    private final GroovyLangLexer lexer;
    private final GroovyLangParser parser;
    private static final Class<ImportNode> IMPORT_NODE_CLASS = ImportNode.class;
    private static final String QUESTION_STR = "?";
    private static final String DOT_STR = ".";
    private static final String SUB_STR = "-";
    private static final String VALUE_STR = "value";
    private static final String DOLLAR_STR = "$";
    private static final String CALL_STR = "call";
    private static final Logger LOGGER = Logger.getLogger(ASTBuilder.class.getName());
}
