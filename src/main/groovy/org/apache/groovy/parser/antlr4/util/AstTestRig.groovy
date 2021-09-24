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

package org.apache.groovy.parser.antlr4.util

import groovy.console.ui.AstNodeToScriptAdapter
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.Phases

/**
 * The test rig for AST
 */
class AstTestRig {
    static String inspect(String src) {
        String result = new AstNodeToScriptAdapter()
                .compileToScript(src, Phases.CONVERSION,
                        new GroovyClassLoader(), false, true,
                        new CompilerConfiguration(CompilerConfiguration.DEFAULT))

        return result
    }


    static void main(String... args) {
        def result = inspect '''\
try {
    def a = 6
    def result = switch(a) {
        case 6 : throw new RuntimeException('a')
    }
} catch (e) {
    assert 'a' == e.message
}
'''
        println result
    }
}