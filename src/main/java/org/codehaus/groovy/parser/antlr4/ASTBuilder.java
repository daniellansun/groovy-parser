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

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.codehaus.groovy.ast.*;
import org.codehaus.groovy.ast.expr.*;
import org.codehaus.groovy.ast.stmt.ExpressionStatement;
import org.codehaus.groovy.ast.stmt.ReturnStatement;
import org.codehaus.groovy.ast.stmt.Statement;
import org.codehaus.groovy.control.CompilationFailedException;
import org.codehaus.groovy.control.CompilePhase;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.control.messages.SyntaxErrorMessage;
import org.codehaus.groovy.runtime.IOGroovyMethods;
import org.codehaus.groovy.syntax.Numbers;
import org.codehaus.groovy.syntax.SyntaxException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static org.codehaus.groovy.parser.antlr4.GroovyParser.*;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.*;

/**
 * Created by Daniel.Sun on 2016/8/14.
 */
public class ASTBuilder extends GroovyParserBaseVisitor<Object> implements GroovyParserVisitor<Object> {

    public ASTBuilder(SourceUnit sourceUnit, ClassLoader classLoader) {
        this.classLoader = classLoader;
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
        return (ModuleNode) this.visit(parser.compilationUnit());
    }

    @Override
    public ModuleNode visitCompilationUnit(CompilationUnitContext ctx) {
        this.visit(ctx.packageDeclaration());

        ctx.statement().stream()
                .map(e -> this.visit(e))
                .filter(e -> e instanceof Statement)
                .forEach(e -> moduleNode.addStatement((Statement) e));

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
        moduleNode.setPackageName(packageName + ".");

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
                                        .collect(Collectors.joining(".")));
                String alias = hasAlias
                        ? ctx.Identifier().getText()
                        : name;

                moduleNode.addStaticImport(classNode, name, alias, annotationNodeList);

                importNode = last(moduleNode.getStaticImports().values());
            }
        } else {
            if (hasStar) { // e.g. import java.util.*
                String qualifiedName = this.visitQualifiedName(ctx.qualifiedName());

                moduleNode.addStarImport(qualifiedName + ".", annotationNodeList);

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
    public ExpressionStatement visitExpressionStmtAlt(ExpressionStmtAltContext ctx) {
        return this.visitStatementExpression(ctx.statementExpression());
    }
// } statement    --------------------------------------------------------------------


    @Override
    public ExpressionStatement visitStatementExpression(StatementExpressionContext ctx) {
        return this.configureAST(new ExpressionStatement((Expression) this.visit(ctx.expression())), ctx);
    }


// expression {    --------------------------------------------------------------------
    @Override
    public Expression visitPrimaryExprAlt(PrimaryExprAltContext ctx) {
        return (Expression) this.visit(ctx.primary());
    }

    @Override
    public Expression visitUnaryExprAlt(UnaryExprAltContext ctx) {
        ExpressionContext expressionCtx = ctx.expression();

        switch (ctx.op.getType()) {
            case ADD:
                if (expressionCtx instanceof PrimaryExprAltContext) {
                    return this.configureAST((ConstantExpression) this.visit(expressionCtx), ctx);
                }

                return this.configureAST(new UnaryPlusExpression((Expression) this.visit(expressionCtx)), ctx);
            case SUB:
                if (expressionCtx instanceof PrimaryExprAltContext) {
                    ConstantExpression constantExpression = (ConstantExpression) this.visit(expressionCtx);

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

                return this.configureAST(new UnaryMinusExpression((Expression) this.visit(expressionCtx)), ctx);
            case TILDE:
                return this.configureAST(new BitwiseNegationExpression((Expression) this.visit(expressionCtx)), ctx);
            case BANG:
                return this.configureAST(new NotExpression((Expression) this.visit(expressionCtx)), ctx);
            default:
                throw createParsingFailedException("Unsupported unary operation: " + ctx.getText(), ctx);
        }
    }

// } expression    --------------------------------------------------------------------


// primary {       --------------------------------------------------------------------
    @Override
    public ConstantExpression visitLiteralPrmrAlt(LiteralPrmrAltContext ctx) {
        return (ConstantExpression) this.visit(ctx.literal());
    }
// } primary       --------------------------------------------------------------------


// literal {       --------------------------------------------------------------------
    @Override
    public ConstantExpression visitIntegerLiteralAlt(IntegerLiteralAltContext ctx) {
        String text = ctx.IntegerLiteral().getText();

        return this.configureAST(new ConstantExpression(Numbers.parseInteger(null, text), !text.startsWith("-")), ctx);
    }

    @Override
    public ConstantExpression visitFloatingPointLiteralAlt(FloatingPointLiteralAltContext ctx) {
        String text = ctx.FloatingPointLiteral().getText();

        return this.configureAST(new ConstantExpression(Numbers.parseDecimal(text), !text.startsWith("-")), ctx);
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
        } else if (asBoolean(ctx.annotation())) {
            return this.configureAST(new AnnotationConstantExpression(this.visitAnnotation(ctx.annotation())), ctx);
        } else if (asBoolean(ctx.elementValueArrayInitializer())) {
            return this.configureAST(this.visitElementValueArrayInitializer(ctx.elementValueArrayInitializer()), ctx);
        } else {
            throw createParsingFailedException("Unsupported element value: " + ctx.getText(), ctx);
        }
    }

    @Override
    public ListExpression visitElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {
        return this.configureAST(new ListExpression(ctx.elementValue().stream().map(this::visitElementValue).collect(Collectors.toList())), ctx);
    }

    @Override
    public String visitQualifiedName(QualifiedNameContext ctx) {
        return ctx.Identifier().stream()
                .map(ParseTree::getText)
                .collect(Collectors.joining("."));
    }

    /**
     * Visit tree safely, no NPE occurred when the tree is null.
     *
     * @param tree an AST node
     * @return the visiting result
     */
    @Override
    public Object visit(ParseTree tree) {
        if (null == tree) {
            return null;
        }

        return super.visit(tree);
    }

    private boolean isBlankScript(CompilationUnitContext ctx) {
        long blankCnt =
                ctx.children.stream()
                        .filter(e -> e instanceof NlsContext
                                || e instanceof PackageDeclarationContext
                                || e instanceof SepContext
                                || e instanceof ImportStmtAltContext
                                || e instanceof TerminalNode && (((TerminalNode) e).getSymbol().getType() == GroovyLangParser.EOF)
                        ).count();


        return blankCnt == ctx.children.size();
    }

    private void addEmptyReturnStatement() {
        moduleNode.addStatement(new ReturnStatement(new ConstantExpression(null)));
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
        if (null == ctx) {
            return astNode;
        }

        Token start = ctx.getStart();
        Token stop = ctx.getStop();

        astNode.setLineNumber(start.getLine());
        astNode.setColumnNumber(start.getCharPositionInLine() + 1);
        astNode.setLastLineNumber(stop.getLine());
        astNode.setLastColumnNumber(stop.getCharPositionInLine() + 1 + stop.getText().length());

        return astNode;
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
        public int hashCode() {
            return Objects.hash(key, value);
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Pair))
                return false;

            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(this.key, pair.key) &&
                    Objects.equals(this.value, pair.value);
        }

    }

    private final ModuleNode moduleNode;
    private final SourceUnit sourceUnit;
    private final ClassLoader classLoader;
    private final GroovyLangLexer lexer;
    private final GroovyLangParser parser;
    private static final Class<ImportNode> IMPORT_NODE_CLASS = ImportNode.class;
    private static final String VALUE_STR = "value";
    private static final Logger LOGGER = Logger.getLogger(ASTBuilder.class.getName());
}
