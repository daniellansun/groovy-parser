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
import org.codehaus.groovy.ast.ModuleNode;
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
import java.util.BitSet;
import java.util.logging.Logger;

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
    public Object visitCompilationUnit(GroovyParser.CompilationUnitContext ctx) {
        int blankCnt = 0;

        for (ParseTree child : ctx.children) {
            if (child instanceof GroovyParser.NlsContext
                    || ((TerminalNode) child).getSymbol().getType() == GroovyLangParser.EOF) {
                blankCnt++;
            }

            this.visit(child);
        }

        // if groovy source file only contains blank(including EOF), add "return null" to the AST
        if (blankCnt == ctx.children.size()) {
            this.addEmptyReturnStatement();
        }

        return moduleNode;
    }

    private void addEmptyReturnStatement() {
        moduleNode.addStatement(new ReturnStatement(new ConstantExpression(null)));
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
    private final Logger LOGGER = Logger.getLogger(ASTBuilder.class.getName());
}
