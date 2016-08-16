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
import org.codehaus.groovy.parser.DefaultParser
import org.codehaus.groovy.parser.antlr4.util.ASTComparatorCategory
import org.codehaus.groovy.parser.antlr4.util.GroovySourceGenerator

/**
 * Created by Daniel.Sun on 2016/8/14.
 */
class GroovyParserTest extends GroovyTestCase {
    public static final String RESOURCES_PATH = 'src/test/resources';

    void setUp() {}

    void tearDown() {}

    void "test groovy core"() {
        test('core/Comments.groovy', ASTComparatorCategory.DEFAULT_CONFIGURATION);
    }

    static test(String path, conf) {
        AbstractParser defaultParser = new DefaultParser()
        AbstractParser antlr4Parser = new Antlr4Parser()

        File file = new File("$RESOURCES_PATH/$path");
        def (oldAST, oldElapsedTime) = profile { defaultParser.parse(file) }
        def (newAST, newElapsedTime) = profile { antlr4Parser.parse(file) }

        ASTComparatorCategory.apply(conf) {
            assert newAST == oldAST
        }

        assert genSrc(newAST) == genSrc(oldAST)

        log.info "${path}\t\t\t\t\tdiff:${(newElapsedTime - oldElapsedTime) / 1000}ms,\tnew:${newElapsedTime / 1000}ms,\told:${oldElapsedTime / 1000}ms."
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
}
