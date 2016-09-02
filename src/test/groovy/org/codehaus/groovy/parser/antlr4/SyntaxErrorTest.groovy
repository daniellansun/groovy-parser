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
package org.codehaus.groovy.parser.antlr4

import org.codehaus.groovy.ast.ModuleNode
import org.codehaus.groovy.parser.AbstractParser
import org.codehaus.groovy.parser.Antlr2Parser
import org.codehaus.groovy.parser.Antlr4Parser
import org.codehaus.groovy.parser.antlr4.util.ASTComparatorCategory
import org.codehaus.groovy.parser.antlr4.util.GroovySourceGenerator

/**
 * Created by Daniel.Sun on 2016/9/2.
 */
class SyntaxErrorTest extends GroovyTestCase {
    public static final String RESOURCES_PATH = 'src/test/resources';

    void setUp() {}

    void tearDown() {}

    void "test groovy core - List"() {
        fail('fail/List_01.groovy');
    }
    // ************************************************************
    static fail(String path) {
        fail(path, ASTComparatorCategory.DEFAULT_CONFIGURATION)
    }

    static fail(String path, List ignoreClazzList) {
        fail(path, addIgnore(ignoreClazzList, ASTComparatorCategory.LOCATION_IGNORE_LIST))
    }

    static fail(String path, conf) {
        AbstractParser antlr4Parser = new Antlr4Parser()
        AbstractParser antlr2Parser = new Antlr2Parser()

        File file = new File("$RESOURCES_PATH/$path");
        def (newAST, newElapsedTime) = profile { antlr4Parser.parse(file) }
        def (oldAST, oldElapsedTime) = profile { antlr2Parser.parse(file) }

        assert (newAST == null || newAST.context.errorCollector.hasErrors()) &&
                (oldAST == null || oldAST.context.errorCollector.hasErrors())

        long diffInMillis = newElapsedTime - oldElapsedTime;

        if (diffInMillis >= 500) {
            log.warning "${path}\t\t\t\t\tdiff:${diffInMillis / 1000}s,\tnew:${newElapsedTime / 1000}s,\told:${oldElapsedTime / 1000}s."
        }
    }

    static assertAST(ast1, ast2, conf) {
        assert null != ast1 && null != ast2

        ASTComparatorCategory.apply(conf) {
            assert ast1 == ast2
        }
        assert genSrc(ast1) == genSrc(ast2)
    }

    static String genSrc(ModuleNode ast) {
        return new GroovySourceGenerator(ast).gen();
    }

    static profile(Closure c) {
        long begin = System.currentTimeMillis()
        def result = c.call()
        long end = System.currentTimeMillis()

        return [result, end - begin];
    }

    static addIgnore(Class aClass, ArrayList<String> ignore, Map<Class, List<String>> c = null) {
        c = c ?: ASTComparatorCategory.DEFAULT_CONFIGURATION.clone() as Map<Class, List<String>>;
        c[aClass].addAll(ignore)
        return c
    }

    static addIgnore(Collection<Class> aClass, ArrayList<String> ignore, Map<Class, List<String>> c = null) {
        c = c ?: ASTComparatorCategory.DEFAULT_CONFIGURATION.clone() as Map<Class, List<String>>;
        aClass.each { c[it].addAll(ignore) }
        return c
    }
}
