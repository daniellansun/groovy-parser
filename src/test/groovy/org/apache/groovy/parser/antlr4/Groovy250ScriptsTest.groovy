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
import org.codehaus.groovy.ast.stmt.AssertStatement
import org.codehaus.groovy.ast.stmt.ExpressionStatement

/**
 * Add Groovy 2.5.0 scripts as test cases
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * @date    2016/09/21
 */
class Groovy250ScriptsTest extends GroovyTestCase {

    void setUp() {}

    void tearDown() {}

    void "test AnnotationClosureWithNonLocalVariable_001.groovy"() {
        unzipAndTest("scripts/AnnotationClosureWithNonLocalVariable_001.groovy", [ExpressionStatement, AssertStatement])
    }

    /*************************************/
    static unzipAndTest(String entryName, List ignoreClazzList) {
        TestUtils.unzipAndTest(ZIP_PATH, entryName, TestUtils.addIgnore(ignoreClazzList, ASTComparatorCategory.LOCATION_IGNORE_LIST))
    }

    static unzipAndTest(String entryName) {
        TestUtils.unzipAndTest(ZIP_PATH, entryName);
    }

    public static final String ZIP_PATH = "$TestUtils.RESOURCES_PATH/groovy-2.5.0/groovy-2.5.0-SNAPSHOT-20160921-allscripts.zip";
}
