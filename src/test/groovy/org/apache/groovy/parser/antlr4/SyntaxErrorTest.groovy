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
package org.apache.groovy.parser.antlr4

import org.apache.groovy.parser.antlr4.util.ASTComparatorCategory

import static org.apache.groovy.parser.antlr4.TestUtils.COMMON_IGNORE_CLASS_LIST
import static org.apache.groovy.parser.antlr4.TestUtils.shouldFail

/**
 * Some syntax error test cases for the new parser
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * @date    2016/09/02
 */
class SyntaxErrorTest extends GroovyTestCase {
    public static final String RESOURCES_PATH = 'src/test/resources';

    void setUp() {}

    void tearDown() {}

    void "test groovy core - List"() {
        shouldFail('fail/List_01.groovy');
    }

    void "test groovy core - Expression"() {
        shouldFail('fail/Expression_01.groovy');
        shouldFail('fail/Expression_02.groovy');
        shouldFail('fail/Expression_03.groovy');
        shouldFail('fail/Expression_04.groovy', true);
        shouldFail('fail/Expression_05.groovy', true);
        shouldFail('fail/Expression_06.groovy');
        shouldFail('fail/Expression_07.groovy');
        shouldFail('fail/Expression_08.groovy');
        shouldFail('fail/Expression_09.groovy');
    }

    void "test groovy core - Switch"() {
        shouldFail('fail/Switch_01.groovy');
    }

    void "test groovy core - LocalVariableDeclaration"() {
        shouldFail('fail/LocalVariableDeclaration_01.groovy');
    }

    void "test CompilerErrorTest_001.groovy"() {
        unzipAndFailScript("scripts/CompilerErrorTest_001.groovy", [])
    }

    void "test CompilerErrorTest_002.groovy"() {
        unzipAndFailScript("scripts/CompilerErrorTest_002.groovy", [])
    }

    void "test DifferencesFromJavaTest_002.groovy"() {
        unzipAndFailScript("scripts/DifferencesFromJavaTest_002.groovy", [])
    }

    /**************************************/
    static unzipAndFailScript(String entryName, List ignoreClazzList, Map<String, String> replacementsMap=[:], boolean toCheckNewParserOnly = false) {
        ignoreClazzList.addAll(COMMON_IGNORE_CLASS_LIST)

        TestUtils.unzipAndFail(SCRIPT_ZIP_PATH, entryName, TestUtils.addIgnore(ignoreClazzList, ASTComparatorCategory.LOCATION_IGNORE_LIST), replacementsMap, toCheckNewParserOnly)
    }

    public static final String SCRIPT_ZIP_PATH = "$TestUtils.RESOURCES_PATH/groovy-2.5.0/groovy-2.5.0-SNAPSHOT-20160921-allscripts.zip";
}
