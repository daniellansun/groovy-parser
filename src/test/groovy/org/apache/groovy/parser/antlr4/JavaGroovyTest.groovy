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

import groovy.transform.CompileStatic
import org.apache.groovy.parser.antlr4.util.JavaGroovyComparator

@CompileStatic
class JavaGroovyTest extends GroovyTestCase {
    public static final String DEFAULT_RESOURCES_PATH = 'subprojects/groovy-antlr4-grammar/src/test/resources';
    public static final String RESOURCES_PATH = new File(DEFAULT_RESOURCES_PATH).exists() ? DEFAULT_RESOURCES_PATH : 'src/test/resources';

    void testHelloWorld() {
        File file = new File("$RESOURCES_PATH/jcore/HelloWorld.java")
        def jr = JavaGroovyComparator.compileJava("HelloWorld", file.text).call("hello").get()
        def gr = JavaGroovyComparator.compileStaticGroovy(file.text).call("hello").get()

        assert jr == gr
    }
}
