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

import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.dfa.DFA;

/**
 * Created by Daniel.Sun on 2016/8/14.
 */
public class DfaInitializer {
    private ATN atn;

    public DfaInitializer(GroovyLangLexer lexer) {
        atn = lexer.getATN();
    }

    public DfaInitializer(GroovyLangParser parser) {
        atn = parser.getATN();
    }

    public DFA[] createDecisionToDFA() {
        DFA[] decisionToDFA = new DFA[atn.getNumberOfDecisions()];

        for(int i = 0; i < decisionToDFA.length; i++) {
            decisionToDFA[i] = new DFA(atn.getDecisionState(i), i);
        }

        return decisionToDFA;
    }
}
