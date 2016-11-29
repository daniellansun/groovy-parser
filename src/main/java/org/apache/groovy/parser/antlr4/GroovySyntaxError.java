package org.apache.groovy.parser.antlr4;

/**
 * Created by Daniel on 2016/11/29.
 */
public class GroovySyntaxError extends AssertionError {
    public GroovySyntaxError(String message) {
        super(message, null);
    }
}
