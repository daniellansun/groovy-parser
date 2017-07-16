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
package org.apache.groovy.parser.antlr4.internal;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * Provide friendly error messages when parsing errors occurred.
 *
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 *         Created on 2016/10/19
 */
public class DescriptiveErrorStrategy extends BailErrorStrategy {
    private CharStream charStream;

    public DescriptiveErrorStrategy(CharStream charStream) {
        this.charStream = charStream;
    }

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
            context.exception = e;
        }

        if (PredictionMode.LL.equals(recognizer.getInterpreter().getPredictionMode())) {
            if (e instanceof NoViableAltException) {
                this.reportNoViableAlternative(recognizer, (NoViableAltException) e);
            } else if (e instanceof InputMismatchException) {
                this.reportInputMismatch(recognizer, (InputMismatchException) e);
            } else if (e instanceof FailedPredicateException) {
                this.reportFailedPredicate(recognizer, (FailedPredicateException) e);
            }
        }

        throw new ParseCancellationException(e);
    }

    @Override
    public Token recoverInline(Parser recognizer)
            throws RecognitionException {

        this.recover(recognizer, new InputMismatchException(recognizer)); // stop parsing
        return null;
    }

    protected String createNoViableAlternativeErrorMessage(Parser recognizer, NoViableAltException e) {
        TokenStream tokens = recognizer.getInputStream();
        String input;
        if (tokens != null) {
            if (e.getStartToken().getType() == Token.EOF) {
                input = "<EOF>";
            } else {
                input = charStream.getText(Interval.of(e.getStartToken().getStartIndex(), e.getOffendingToken().getStopIndex()));
            }
        } else {
            input = "<unknown input>";
        }

        return "Unexpected input: " + escapeWSAndQuote(input);
    }

    @Override
    protected void reportNoViableAlternative(@NotNull Parser recognizer,
                                             @NotNull NoViableAltException e) {

        notifyErrorListeners(recognizer, this.createNoViableAlternativeErrorMessage(recognizer, e), e);
    }

    protected String createInputMismatchErrorMessage(@NotNull Parser recognizer,
                                                     @NotNull InputMismatchException e) {
        return "Unexpected input: " + getTokenErrorDisplay(e.getOffendingToken(recognizer)) +
                "; Expecting " + e.getExpectedTokens().toString(recognizer.getVocabulary());
    }

    protected void reportInputMismatch(@NotNull Parser recognizer,
                                       @NotNull InputMismatchException e) {

        notifyErrorListeners(recognizer, this.createInputMismatchErrorMessage(recognizer, e), e);
    }


    protected String createFailedPredicateErrorMessage(@NotNull Parser recognizer,
                                                       @NotNull FailedPredicateException e) {
        return e.getMessage();
    }

    protected void reportFailedPredicate(@NotNull Parser recognizer,
                                         @NotNull FailedPredicateException e) {
        notifyErrorListeners(recognizer, this.createFailedPredicateErrorMessage(recognizer, e), e);
    }
}
