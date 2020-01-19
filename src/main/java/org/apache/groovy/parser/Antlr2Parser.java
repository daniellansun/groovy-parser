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
package org.apache.groovy.parser;

import org.codehaus.groovy.antlr.AntlrParserPluginFactory;
import org.codehaus.groovy.control.CompilerConfiguration;

/**
 * The Antlr2 parser for creating a module node.
 */
public class Antlr2Parser extends AbstractParser {
    private final CompilerConfiguration compilerConfiguration;

    public Antlr2Parser() {
        this(new CompilerConfiguration(CompilerConfiguration.DEFAULT));
    }

    public Antlr2Parser(CompilerConfiguration compilerConfiguration) {
        this.compilerConfiguration = compilerConfiguration;
        compilerConfiguration.setPluginFactory(new AntlrParserPluginFactory());
    }

    @Override
    protected CompilerConfiguration getCompilerConfiguration() {
        return compilerConfiguration;
    }
}
