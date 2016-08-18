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
import org.codehaus.groovy.parser.Antlr4Parser
import org.codehaus.groovy.parser.Antlr2Parser
import org.codehaus.groovy.parser.antlr4.util.ASTComparatorCategory
import org.codehaus.groovy.parser.antlr4.util.GroovySourceGenerator

/**
 * Created by Daniel.Sun on 2016/8/14.
 */
class GroovyParserTest extends GroovyTestCase {
    public static final String RESOURCES_PATH = 'src/test/resources';

    void setUp() {}

    void tearDown() {}

    void "test groovy core - Comments"() {
        test('core/Comments.groovy');
    }

    void "test groovy core - PackageDeclaration"() {
        test('core/PackageDeclaration_01.groovy');
        test('core/PackageDeclaration_02.groovy');
        test('core/PackageDeclaration_03.groovy');
        test('core/PackageDeclaration_04.groovy');
        test('core/PackageDeclaration_05.groovy');
    }

    void "test groovy core - ImportDeclaration"() {
        test('core/ImportDeclaration_01.groovy');
        test('core/ImportDeclaration_02.groovy');
        test('core/ImportDeclaration_03.groovy');
        test('core/ImportDeclaration_04.groovy');
        test('core/ImportDeclaration_05.groovy');
        test('core/ImportDeclaration_06.groovy');
        test('core/ImportDeclaration_07.groovy');
        test('core/ImportDeclaration_08.groovy');
    }

    static test(String path) {
        test(path, ASTComparatorCategory.DEFAULT_CONFIGURATION)
    }

    static test(String path, conf) {
        AbstractParser antlr2Parser = new Antlr2Parser()
        AbstractParser antlr4Parser = new Antlr4Parser()

        File file = new File("$RESOURCES_PATH/$path");
        def (oldAST, oldElapsedTime) = profile { antlr2Parser.parse(file) }
        def (newAST, newElapsedTime) = profile { antlr4Parser.parse(file) }

        assertAST(newAST, oldAST, conf);

        log.info "${path}\t\t\t\t\tdiff:${(newElapsedTime - oldElapsedTime) / 1000}ms,\tnew:${newElapsedTime / 1000}ms,\told:${oldElapsedTime / 1000}ms."
    }

    static assertAST(ast1, ast2, conf) {
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
