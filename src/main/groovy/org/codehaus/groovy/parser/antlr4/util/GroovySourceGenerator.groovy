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
package org.codehaus.groovy.parser.antlr4.util

import groovy.inspect.swingui.AstNodeToScriptVisitor
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.ModuleNode
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.control.io.ReaderSource

/**
 * Created by Daniel.Sun on 2016/8/16.
 */
class GroovySourceGenerator {
    private ModuleNode ast;

    public GroovySourceGenerator(ModuleNode ast) {
        this.ast = ast;
    }

    /**
     * Generate the groovy source code according the AST
     *
     * @return the groovy source code
     */
    public String gen() {
        StringWriter out = new StringWriter();

        try {
            AstNodeToScriptVisitor visitor = new AstNodeToScriptVisitor(out, true, true);

            new LinkedList<ClassNode>(this.ast?.classes ?: []).sort { c1, c2 -> c1.name <=> c2.name }?.each {
                visitor.call(new SourceUnit((String) null, (ReaderSource) null, null, null, null) {
                    @Override
                    public ModuleNode getAST() {
                        return GroovySourceGenerator.this.ast;
                    }
                }, null, it)
            }

            return out.toString().replaceAll(/([\w_$]+)@[0-9a-z]+/, '$1@<hashcode>');
        } finally {
            out.close();
        }
    }
}
