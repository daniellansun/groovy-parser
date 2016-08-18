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
import org.codehaus.groovy.ast.expr.ConstantExpression;
import org.codehaus.groovy.ast.stmt.ReturnStatement;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.control.messages.SyntaxErrorMessage;
import org.codehaus.groovy.runtime.IOGroovyMethods;
import org.codehaus.groovy.syntax.SyntaxException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;
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
        ModuleNode moduleNode = (ModuleNode) this.visit(parser.compilationUnit());

        return moduleNode;
    }

    @Override
    public ModuleNode visitCompilationUnit(CompilationUnitContext ctx) {

        ctx.children.stream().forEach(this::visit);

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

        ctx.annotation().stream().forEach(e -> { packageNode.addAnnotation(this.visitAnnotation(e)); });

        return configureAST(packageNode, ctx);
    }

    @Override
    public AnnotationNode visitAnnotation(AnnotationContext ctx) {
        String annotationName = this.visitAnnotationName(ctx.annotationName());

        AnnotationNode annotationNode = new AnnotationNode(ClassHelper.make(annotationName));

        if (asBoolean(ctx.elementValuePairs())) {
            // TODO
        } else if (asBoolean(ctx.elementValue())) {
            // TODO
        }

        return configureAST(annotationNode, ctx);
    }

    @Override
    public String visitAnnotationName(GroovyParser.AnnotationNameContext ctx) {
        return this.visitQualifiedName(ctx.qualifiedName());
    }

    @Override
    public String visitQualifiedName(QualifiedNameContext ctx) {
        return ctx.Identifier().stream()
                .map(ParseTree::getText)
                .collect(Collectors.joining("."));
    }

    @Override
    public ImportNode visitImportDeclaration(ImportDeclarationContext ctx) {
        // GROOVY-6094
        moduleNode.putNodeMetaData(IMPORT_NODE_CLASS, IMPORT_NODE_CLASS);

        ImportNode importNode = null;

        boolean hasStatic = asBoolean(ctx.STATIC());
        boolean hasStar = asBoolean(ctx.MUL());
        boolean hasAlias = asBoolean(ctx.Identifier());

        if (hasStatic) {

            if (hasStar) { // e.g. import static java.lang.Math.*
                String qualifiedName = this.visitQualifiedName(ctx.qualifiedName());
                ClassNode type = ClassHelper.make(qualifiedName);

                // TODO support annotations
                moduleNode.addStaticStarImport(type.getText(), type, new ArrayList<AnnotationNode>());

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

                // TODO support annotations
                moduleNode.addStaticImport(classNode, name, alias, new ArrayList<AnnotationNode>());

                importNode = last(moduleNode.getStaticImports().values());
            }
        } else {
            if (hasStar) { // e.g. import java.util.*
                String qualifiedName = this.visitQualifiedName(ctx.qualifiedName());

                // TODO support annotations
                moduleNode.addStarImport(qualifiedName + ".", new ArrayList<AnnotationNode>());

                importNode = last(moduleNode.getStarImports());
            } else { // e.g. import java.util.Map
                String qualifiedName = this.visitQualifiedName(ctx.qualifiedName());
                String name = last(ctx.qualifiedName().Identifier()).getText();
                ClassNode classNode = ClassHelper.make(qualifiedName);
                String alias = hasAlias
                        ? ctx.Identifier().getText()
                        : name;

                // TODO support annotations
                moduleNode.addImport(alias, classNode, new ArrayList<AnnotationNode>());

                importNode = last(moduleNode.getImports());
            }
        }

        // TODO verify whether the following code is useful or not
        // we're using node metadata here in order to fix GROOVY-6094
        // without breaking external APIs
        Object node = moduleNode.getNodeMetaData(IMPORT_NODE_CLASS);
        if (null != node && IMPORT_NODE_CLASS != node) {
            configureAST((ImportNode) node, importNode);
        }
        moduleNode.removeNodeMetaData(IMPORT_NODE_CLASS);


        return configureAST(importNode, ctx);
    }


    private boolean isBlankScript(CompilationUnitContext ctx) {
        long blankCnt =
                ctx.children.stream()
                        .filter(e -> e instanceof NlsContext
                                || e instanceof PackageDeclarationContext
                                || e instanceof SepContext
                                || e instanceof StatementContext && asBoolean(((StatementContext) e).importDeclaration())
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


    private final ModuleNode moduleNode;
    private final SourceUnit sourceUnit;
    private final ClassLoader classLoader;
    private final GroovyLangLexer lexer;
    private final GroovyLangParser parser;
    private static final Class<ImportNode> IMPORT_NODE_CLASS = ImportNode.class;
    private static final Logger LOGGER = Logger.getLogger(ASTBuilder.class.getName());
}
