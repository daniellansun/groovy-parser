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
package org.apache.groovy.parser.antlr4;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;

import static org.apache.groovy.parser.antlr4.GroovyParser.CapitalizedIdentifier;
import static org.apache.groovy.parser.antlr4.GroovyParser.Identifier;
import static org.apache.groovy.parser.antlr4.GroovyParser.StringLiteral;

/**
 * Some semantic predicates for altering the behaviour of the lexer and parser
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * Created on    2016/08/20
 */
public class SemanticPredicates {
    public static boolean isFollowedByWhiteSpaces(CharStream cs) {
        for (int index = 1, c = cs.LA(index); !('\r' == c || '\n' == c || CharStream.EOF == c); index++, c = cs.LA(index)) {
            if (String.valueOf((char) c).matches("\\S+?")) {
                return false;
            }
        }

        return true;
    }

    public static boolean isFollowedBy(CharStream cs, char... chars) {
        int c1 = cs.LA(1);

        for (char c : chars) {
            if (c1 == c) {
                return true;
            }
        }

        return false;
    }

    public static boolean isFollowedByJavaLetterInGString(CharStream cs) {
        int c1 = cs.LA(1);

        if ('$' == c1) { // single $ is not a valid identifier
            return false;
        }

        String str1 = String.valueOf((char) c1);

        if (str1.matches("[a-zA-Z_{]")) {
            return true;
        }

        if (str1.matches("[^\u0000-\u007F\uD800-\uDBFF]")
                && Character.isJavaIdentifierPart(c1)) {
            return true;
        }

        int c2 = cs.LA(2);
        String str2 = String.valueOf((char) c2);

        if (str1.matches("[\uD800-\uDBFF]")
                && str2.matches("[\uDC00-\uDFFF]")
                && Character.isJavaIdentifierPart(Character.toCodePoint((char) c1, (char) c2))) {

            return true;
        }

        return false;
    }

    /**
     * Check whether following a method name of command expression.
     * Method name should not end with "2: arguments" and "3: closure"
     *
     * @param t the type of pathExpression
     * @return
     */
    public static boolean isFollowingMethodName(int t) {
        return !(2 == t || 3 == t);
    }

    /**
     * Distinguish between method declaration and method call/constructor declaration
     */
    public static boolean isInvalidMethodDeclaration(TokenStream ts) {
        int tokenType = ts.LT(1).getType();

        return (Identifier == tokenType || CapitalizedIdentifier == tokenType || StringLiteral == tokenType)
                && GroovyLangParser.LPAREN == (ts.LT(2).getType());
    }
}
