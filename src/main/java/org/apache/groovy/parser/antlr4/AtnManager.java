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

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Manage ATN for lexer and parser to avoid memory leak
 *
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * @date 2016/08/14
 */
public class AtnManager {
    private final Class ownerClass;
    private static final Map<Class, AtnWrapper> ATN_MAP = new HashMap<>();
    private ATN atn;

    public AtnManager(GroovyLangLexer lexer) {
        this.ownerClass = lexer.getClass();

        this.atn = getAtnWrapper(this.ownerClass, lexer.getATN()).checkAndClear();
    }

    public AtnManager(GroovyLangParser parser) {
        this.ownerClass = parser.getClass();

        this.atn = getAtnWrapper(this.ownerClass, parser.getATN()).checkAndClear();
    }

    public ATN getATN() {
        return this.atn;
    }

    private static AtnWrapper getAtnWrapper(Class ownerClass, ATN atn) {
        synchronized (ATN_MAP) {
            AtnWrapper atnWrapper = ATN_MAP.get(ownerClass);

            if (null == atnWrapper) {
                atnWrapper = new AtnWrapper(atn, ownerClass);
                ATN_MAP.put(ownerClass, atnWrapper);
            }

            return atnWrapper;
        }
    }

    private static class AtnWrapper {
        private final ATN atn;
        private final Class ownerClass;
        private final AtomicLong counter = new AtomicLong(0);

        public AtnWrapper(ATN atn, Class ownerClass) {
            this.atn = atn;
            this.ownerClass = ownerClass;
        }

        public ATN checkAndClear() {
            if (0 != counter.incrementAndGet() % 100) {
                return atn;
            }

            synchronized (this.ownerClass) {
                atn.clearDFA();
            }

            return atn;
        }
    }
}
