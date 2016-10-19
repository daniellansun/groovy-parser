package org.apache.groovy.parser.antlr4.internal;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Provide friendly error messages when parsing errors occurred.
 *
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 *         Created on 2016/10/19
 */
public class DescriptiveErrorStrategy extends BailErrorStrategy {
    @Override
    protected void reportNoViableAlternative(@NotNull Parser recognizer,
                                             @NotNull NoViableAltException e) {
        TokenStream tokens = recognizer.getInputStream();
        String input;
        if (tokens != null) {
            if (e.getStartToken().getType() == Token.EOF) input = "<EOF>";
            else input = tokens.getText(e.getStartToken(), e.getOffendingToken());
        } else {
            input = "<unknown input>";
        }

        String msg = "Unexpected input: " + escapeWSAndQuote(input);

        notifyErrorListeners(recognizer, msg, e);
    }

    protected void reportInputMismatch(@NotNull Parser recognizer,
                                       @NotNull InputMismatchException e) {
        String msg = "Unexpected input: " + getTokenErrorDisplay(e.getOffendingToken(recognizer)) +
                "; Expecting " + e.getExpectedTokens().toString(recognizer.getVocabulary());

        notifyErrorListeners(recognizer, msg, e);
    }

    protected void reportFailedPredicate(@NotNull Parser recognizer,
                                         @NotNull FailedPredicateException e) {
        notifyErrorListeners(recognizer, e.getMessage(), e);
    }
}
