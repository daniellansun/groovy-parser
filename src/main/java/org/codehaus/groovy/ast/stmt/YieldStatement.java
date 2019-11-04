package org.codehaus.groovy.ast.stmt;

import org.codehaus.groovy.ast.expr.Expression;

/**
 * Represents a break statement in a switch statement
 */
public class YieldStatement extends Statement {
    private Expression valueExpression;

    public YieldStatement(Expression valueExpression) {
        this.valueExpression = valueExpression;
    }

    public Expression getValueExpression() {
        return valueExpression;
    }
}
