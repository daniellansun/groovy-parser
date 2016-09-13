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

import static org.apache.groovy.parser.antlr4.GroovyParser.*;

/**
 * Created by Daniel.Sun on 2016/8/20.
 */
public class GrammarPredicates {
    public static boolean isFollowedByJavaLetterInGString(CharStream cs) {
        int c1 = cs.LA(1);
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
     * Method name should not end with RPAREN and RBRACE
     *
     * @param ts the token stream
     * @return
     */
    public static boolean isFollowingMethodName(TokenStream ts) {
        int tokenType = ts.LA(-1);

        // FIXME         ((int)) 1        => 'int'.call(1)
        return !(RPAREN == tokenType || RBRACE == tokenType);
    }
}
