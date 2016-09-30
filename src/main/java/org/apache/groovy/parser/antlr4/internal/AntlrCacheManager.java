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

import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.apache.groovy.parser.antlr4.GroovyLangLexer;
import org.apache.groovy.parser.antlr4.GroovyLangParser;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Manage DFA cache and prediction context cache for lexer and parser to avoid memory leak
 *
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * @date 2016/08/14
 */
public class AntlrCacheManager {
    private static final Map<Class, PredictionContextCache> CACHE_MAP;
    private static final Map<Class, DFA[]> DFA_MAP;
    private final ATN atn;
    private final Class ownerClass;

    static {
        Map<Class, PredictionContextCache> cacheMap = new HashMap<>();

        // TODO evaluate the size of caches reasonably
        cacheMap.put(GroovyLangLexer.class, new PredictionContextLruCache(2048));
        cacheMap.put(GroovyLangParser.class, new PredictionContextLruCache(4096));

        CACHE_MAP = Collections.unmodifiableMap(cacheMap);
        DFA_MAP = new HashMap<>();
    }

    public AntlrCacheManager(GroovyLangLexer lexer) {
        this.atn = lexer.getATN();
        this.ownerClass = lexer.getClass();
    }

    public AntlrCacheManager(GroovyLangParser parser) {
        this.atn = parser.getATN();
        this.ownerClass = parser.getClass();
    }

    public DFA[] createDecisionToDFA() {
        DFA[] decisionToDFA = DFA_MAP.get(ownerClass);

        if (null != decisionToDFA) {
            return decisionToDFA;
        }

        synchronized (DFA_MAP) {
            if (null == DFA_MAP.get(ownerClass)) {
                decisionToDFA = new DFA[atn.getNumberOfDecisions()];
                Arrays.setAll(decisionToDFA, i -> new DfaWrapper(atn, i));

                DFA_MAP.put(ownerClass, decisionToDFA);
            }
        }

        return decisionToDFA;
    }

    public PredictionContextCache createPredictionContextCache() {
        return CACHE_MAP.get(this.ownerClass);
    }
}
