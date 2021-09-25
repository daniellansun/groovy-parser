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
import groovy.util.logging.Log
import org.antlr.v4.gui.TestRig
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.ATNSimulator
import org.antlr.v4.runtime.atn.DecisionInfo
import org.antlr.v4.runtime.atn.ProfilingATNSimulator
import org.apache.groovy.parser.antlr4.GroovyLangLexer
import org.apache.groovy.parser.antlr4.GroovyLangParser
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.Phases

import java.text.DecimalFormat

/**
 * A basic debug tool for investigating the parse trees and tokens of Groovy source code
 *
 * @author <ahref="mailto:realbluesun@hotmail.com" > Daniel.Sun</a>
 * Created on    2016/08/14
 */
@Log
class GroovyTestRig extends TestRig {
    GroovyTestRig(String[] args) throws Exception {
        super(['Groovy', args.contains('-lexer') ? 'tokens' : 'compilationUnit', *args] as String[])
    }

    void inspectParseTree() {
        def inputFile = new File(this.inputFiles[0])

        if (!(inputFile.exists() && inputFile.isFile())) {
            log.info "Input file[${inputFile.absolutePath}] does not exist."
            return
        }

        byte[] content = inputFile.bytes
        String text = new String(content, this.encoding ?: 'UTF-8')

        CharStream charStream = CharStreams.fromReader(new StringReader(text))
        GroovyLangLexer lexer = new GroovyLangLexer(charStream)
        CommonTokenStream tokens = new CommonTokenStream(lexer)
        GroovyLangParser parser = new GroovyLangParser(tokens)
        ATNSimulator interpreter = parser.getInterpreter()
        boolean profile = interpreter instanceof ProfilingATNSimulator

        long beginTime = System.nanoTime()
        this.process(lexer, GroovyLangParser.class, parser, charStream)
        long endTime = System.nanoTime()

        if (profile) {
            DecisionInfo[] decisionInfos = ((ProfilingATNSimulator) interpreter).decisionInfo
            if (decisionInfos) {
                println "${'-' * 10} BEGIN PROFILING RESULT ${'-' * 10}"
                long sumTimeInPrediction = 0
                decisionInfos
                        .sort { d1, d2 -> d2.timeInPrediction <=> d1.timeInPrediction }
                        .each { DecisionInfo decisionInfo ->
                            sumTimeInPrediction += decisionInfo.timeInPrediction
                            String detail = String.format("Time: %15s in %5d calls - LL_TotalLook: %5d LL_MaxLook: %5d - SLL_TotalLook: %5d SLL_MaxLook: %5d - Ambiguities: %5d Errors: %5d - Rule: %s",
                                    new DecimalFormat("0.0000000000").format(decisionInfo.timeInPrediction / 10D**9), decisionInfo.invocations,
                                    decisionInfo.LL_TotalLook, decisionInfo.LL_MaxLook,
                                    decisionInfo.SLL_TotalLook, decisionInfo.SLL_MaxLook,
                                    decisionInfo.ambiguities.size(), decisionInfo.errors.size(),
                                    GroovyLangParser.ruleNames[GroovyLangParser._ATN.getDecisionState(decisionInfo.decision).ruleIndex]
                            )
                            println detail
                        }
                println "Sum time in prediction: ${sumTimeInPrediction / 10D**9}s, Sum time in processing: ${(endTime - beginTime) / 10D**9}s"
                println "${'-' * 10} END PROFILING RESULT ${'-' * 10}"
            }
        }
    }

    static void main(String[] args) {
        if (args.length == 0) {
            log.info "Usage: [-tokens] [-lexer] [-tree] [-gui] [-ps file.ps] [-encoding encodingname] [-trace] [-diagnostics] [-profile] [-SLL] input-filename"
            return
        }

        if (args.every { it.startsWith('-') }) {
            log.info "input-filename is required!"
            return
        }

        if (args.contains('-profile')) {
            System.setProperty("groovy.antlr4.profile", "true")
        }

        GroovyTestRig groovyTestRig = new GroovyTestRig(args)

        groovyTestRig.inspectParseTree()
    }

    static String inspect(String src) {
        String result = new AstNodeToScriptAdapter()
                .compileToScript(src, Phases.CONVERSION,
                        new GroovyClassLoader(), false, true,
                        new CompilerConfiguration(CompilerConfiguration.DEFAULT))

        return result
    }
}

