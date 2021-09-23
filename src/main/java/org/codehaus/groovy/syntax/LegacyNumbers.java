package org.codehaus.groovy.syntax;

import antlr.collections.AST;
import org.codehaus.groovy.antlr.ASTRuntimeException;

import java.math.BigInteger;

import static org.codehaus.groovy.syntax.Numbers.isNumericTypeSpecifier;

public class LegacyNumbers {
    /**
     * Builds a Number from the given integer descriptor.  Creates the narrowest
     * type possible, or a specific type, if specified.
     *
     * @param reportNode at node for error reporting in the parser
     * @param text       literal text to parse
     * @return instantiated Number object
     * @throws NumberFormatException if the number does not fit within the type requested by the type
     *                               specifier suffix (invalid numbers don't make it here)
     */
    @Deprecated
    public static Number parseInteger(AST reportNode, String text) {
        // remove place holder underscore before starting
        text = text.replace("_", "");

        char c = ' ';
        int length = text.length();

        //
        // Strip off the sign, if present

        boolean negative = false;
        if ((c = text.charAt(0)) == '-' || c == '+') {
            negative = (c == '-');
            text = text.substring(1, length);
            length -= 1;
        }

        //
        // Determine radix (default is 10).

        int radix = 10;
        if (text.charAt(0) == '0' && length > 1) {
            c = text.charAt(1);
            if (c == 'X' || c == 'x') {
                radix = 16;
                text = text.substring(2, length);
                length -= 2;
            } else if (c == 'B' || c == 'b') {
                radix = 2;
                text = text.substring(2, length);
                length -= 2;
            } else {
                radix = 8;
            }
        }

        //
        // Strip off any type specifier and convert it to lower
        // case, if present.

        char type = 'x';  // pick best fit
        if (isNumericTypeSpecifier(text.charAt(length - 1), false)) {
            type = Character.toLowerCase(text.charAt(length - 1));
            text = text.substring(0, length - 1);

            length -= 1;
        }

        //
        // Add the sign back, if necessary

        if (negative) {
            text = "-" + text;
        }

        //
        // Build the specified type or, if no type was specified, the
        // smallest type in which the number will fit.

        BigInteger value = new BigInteger(text, radix);

        switch (type) {
            case 'i':
                if (radix == 10 && (value.compareTo(MAX_INTEGER) > 0 || value.compareTo(MIN_INTEGER) < 0)) {
                    throw new ASTRuntimeException(reportNode, "Number of value " + value + " does not fit in the range of int, but int was enforced.");
                } else {
                    return value.intValue();
                }
            case 'l':
                if (radix == 10 && (value.compareTo(MAX_LONG) > 0 || value.compareTo(MIN_LONG) < 0)) {
                    throw new ASTRuntimeException(reportNode, "Number of value " + value + " does not fit in the range of long, but long was enforced.");
                } else {
                    return value.longValue();
                }
            case 'g':
                return value;
            default:
                // If not specified, we will return the narrowest possible
                // of Integer, Long, and BigInteger.
                if (value.compareTo(MAX_INTEGER) <= 0 && value.compareTo(MIN_INTEGER) >= 0) {
                    return value.intValue();
                } else if (value.compareTo(MAX_LONG) <= 0 && value.compareTo(MIN_LONG) >= 0) {
                    return value.longValue();
                }
                return value;
        }
    }

    private static final BigInteger MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);
    private static final BigInteger MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);

    private static final BigInteger MAX_INTEGER = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger MIN_INTEGER = BigInteger.valueOf(Integer.MIN_VALUE);

}
