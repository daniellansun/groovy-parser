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

import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.Arrays;

/**
 * Manage DFA cache and prediction context cache for lexer and parser to avoid memory leak
 *
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * @date 2016/08/14
 */
public class AntlrCacheManager {
    private final ATN atn;

    public AntlrCacheManager(GroovyLangLexer lexer) {
        this.atn = lexer.getATN();
    }

    public AntlrCacheManager(GroovyLangParser parser) {
        this.atn = parser.getATN();
    }

    public DFA[] createDecisionToDFA() {
        DFA[] decisionToDFA = new DFA[atn.getNumberOfDecisions()];
        Arrays.setAll(decisionToDFA, i -> new DFA(atn.getDecisionState(i), i));

        return decisionToDFA;
    }

    public PredictionContextCache createPredictionContextCache() {
        return new PredictionContextCache();
    }
}
