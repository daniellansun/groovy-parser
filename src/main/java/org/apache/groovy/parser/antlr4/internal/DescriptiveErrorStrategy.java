package org.apache.groovy.parser.antlr4.internal;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * Provide friendly error messages when parsing errors occurred.
 *
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 *         Created on 2016/10/19
 */
public class DescriptiveErrorStrategy extends BailErrorStrategy {
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

    protected String createNoViableAlternativeErrorMessage(Parser recognizer, NoViableAltException e) {
        TokenStream tokens = recognizer.getInputStream();
        String input;
        if (tokens != null) {
            if (e.getStartToken().getType() == Token.EOF) input = "<EOF>";
            else input = tokens.getText(e.getStartToken(), e.getOffendingToken());
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
