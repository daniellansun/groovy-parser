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

import groovy.lang.GroovyClassLoader;
import org.codehaus.groovy.ast.ModuleNode;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.ErrorCollector;
import org.codehaus.groovy.control.SourceUnit;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The base parser for creating a module node.
 * The concrete compiler configuration can be specified by the sub-classes of the base parser(e.g. Antlr2Parser, Antlr4Parser)
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * @date    2016/08/14
 */
public abstract class AbstractParser {
    private static final Logger LOGGER = Logger.getLogger(AbstractParser.class.getName());

    public ModuleNode parse(File file) {
        if (null == file || !file.exists()) {
            throw new IllegalArgumentException(file + " does not exist.");
        }

        try {
            CompilerConfiguration configuration = this.getCompilerConfiguration();
            SourceUnit sourceUnit = new SourceUnit(file, configuration, new GroovyClassLoader(), new ErrorCollector(configuration));

            sourceUnit.parse();
            sourceUnit.completePhase();
            sourceUnit.nextPhase();
            sourceUnit.convert();

            return sourceUnit.getAST();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to parse " + file.getName(), e);

            return null;
        }
    }

    protected abstract CompilerConfiguration getCompilerConfiguration();
}
