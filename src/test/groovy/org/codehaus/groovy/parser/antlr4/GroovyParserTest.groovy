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

import org.codehaus.groovy.parser.AbstractParser
import org.codehaus.groovy.parser.Antlr4Parser
import org.codehaus.groovy.parser.DefaultParser
import org.codehaus.groovy.parser.antlr4.util.ASTComparatorCategory

/**
 * Created by Daniel.Sun on 2016/8/14.
 */
class GroovyParserTest extends GroovyTestCase {
    public static final String RESOURCES_PATH = 'src/test/resources';
    private AbstractParser defaultParser;
    private AbstractParser antlr4Parser;

    void setUp() {
        this.defaultParser = new DefaultParser();
        this.antlr4Parser = new Antlr4Parser();
    }

    void tearDown() {}

    void "test groovy core"() {
        File file = new File("$RESOURCES_PATH/core/Comments.groovy");
        def oldAST = defaultParser.parse(file)
        def newAST = antlr4Parser.parse(file);

        ASTComparatorCategory.apply(ASTComparatorCategory.DEFAULT_CONFIGURATION) {
            assert newAST == oldAST
        }

    }

}
