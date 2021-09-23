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

import groovy.test.GroovyTestCase
import groovy.transform.CompileStatic
import org.apache.groovy.parser.antlr4.util.ASTComparatorCategory

/**
 * Add Groovy 2.5.0 sources as test cases
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * Created on    2016/09/22
 */
@CompileStatic
class Groovy250SourcesTest extends GroovyTestCase {


    void "test benchmark/bench_groovy"() {
        unzipAndTest("benchmark/bench.groovy", [])
    }

    void "test benchmark/bench/ackermann_groovy"() {
        unzipAndTest("benchmark/bench/ackermann.groovy", [])
    }

    void "test benchmark/bench/ary_groovy"() {
        unzipAndTest("benchmark/bench/ary.groovy", [])
    }

    void "test benchmark/bench/binarytrees_groovy"() {
        unzipAndTest("benchmark/bench/binarytrees.groovy", [])
    }

    void "test benchmark/bench/fannkuch_groovy"() {
        unzipAndTest("benchmark/bench/fannkuch.groovy", [])
    }

    void "test benchmark/bench/fibo_groovy"() {
        unzipAndTest("benchmark/bench/fibo.groovy", [])
    }

    void "test benchmark/bench/heapsort_groovy"() {
        unzipAndTest("benchmark/bench/heapsort.groovy", [])
    }

    void "test benchmark/bench/hello_groovy"() {
        unzipAndTest("benchmark/bench/hello.groovy", [])
    }

    void "test benchmark/bench/mandelbrot_groovy"() {
        unzipAndTest("benchmark/bench/mandelbrot.groovy", [])
    }

    void "test benchmark/bench/nsieve_groovy"() {
        unzipAndTest("benchmark/bench/nsieve.groovy", [])
    }

    void "test benchmark/bench/random_groovy"() {
        unzipAndTest("benchmark/bench/random.groovy", [])
    }

    void "test benchmark/bench/recursive_groovy"() {
        unzipAndTest("benchmark/bench/recursive.groovy", [])
    }

    void "test benchmark/bench/regexdna_groovy"() {
        unzipAndTest("benchmark/bench/regexdna.groovy", [])
    }

    void "test benchmark/bench/revcomp_groovy"() {
        unzipAndTest("benchmark/bench/revcomp.groovy", [])
    }

    void "test benchmark/bench/spectralnorm_groovy"() {
        unzipAndTest("benchmark/bench/spectralnorm.groovy", [])
    }

    void "test benchmark/bench/threadring_groovy"() {
        unzipAndTest("benchmark/bench/threadring.groovy", [])
    }

    void "test benchmark/bench/wordfreq_groovy"() {
        unzipAndTest("benchmark/bench/wordfreq.groovy", [])
    }

    void "test buildSrc/src/main/groovy/org/codehaus/groovy/gradle/WriteExtensionDescriptorTask_groovy"() {
        unzipAndTest("buildSrc/src/main/groovy/org/codehaus/groovy/gradle/WriteExtensionDescriptorTask.groovy", [])
    }

    void "test config/binarycompatibility/binarycompat-report_groovy"() {
        unzipAndTest("config/binarycompatibility/binarycompat-report.groovy", [])
    }

    void "test config/checkstyle/checkstyle-report_groovy"() {
        unzipAndTest("config/checkstyle/checkstyle-report.groovy", [])
    }

    void "test config/codenarc/codenarc_groovy"() {
        unzipAndTest("config/codenarc/codenarc.groovy", [])
    }

    void "test src/examples/astbuilder/Main_groovy"() {
        unzipAndTest("src/examples/astbuilder/Main.groovy", [])
    }

    void "test src/examples/astbuilder/MainExample_groovy"() {
        unzipAndTest("src/examples/astbuilder/MainExample.groovy", [])
    }

    void "test src/examples/astbuilder/MainIntegrationTest_groovy"() {
        unzipAndTest("src/examples/astbuilder/MainIntegrationTest.groovy", [])
    }

    void "test src/examples/astbuilder/MainTransformation_groovy"() {
        unzipAndTest("src/examples/astbuilder/MainTransformation.groovy", [])
    }

    void "test src/examples/commandLineTools/AntMap_groovy"() {
        unzipAndTest("src/examples/commandLineTools/AntMap.groovy", [])
    }

    void "test src/examples/commandLineTools/BigTests_groovy"() {
        unzipAndTest("src/examples/commandLineTools/BigTests.groovy", [])
    }

    void "test src/examples/commandLineTools/ListFiles_groovy"() {
        unzipAndTest("src/examples/commandLineTools/ListFiles.groovy", [])
    }

    void "test src/examples/commandLineTools/Reflections_groovy"() {
        unzipAndTest("src/examples/commandLineTools/Reflections.groovy", [])
    }

    void "test src/examples/commandLineTools/SimpleWebServer_groovy"() {
        unzipAndTest("src/examples/commandLineTools/SimpleWebServer.groovy", [])
    }

    void "test src/examples/console/MortgageCalculator_groovy"() {
        unzipAndTest("src/examples/console/MortgageCalculator.groovy", [])
    }

    void "test src/examples/console/knowYourTables_groovy"() {
        unzipAndTest("src/examples/console/knowYourTables.groovy", [])
    }

    void "test src/examples/console/thinkOfANumber_groovy"() {
        unzipAndTest("src/examples/console/thinkOfANumber.groovy", [])
    }

    void "test src/examples/groovy2d/paintingByNumbers_groovy"() {
        unzipAndTest("src/examples/groovy2d/paintingByNumbers.groovy", [])
    }

    void "test src/examples/groovyShell/ArithmeticShell_groovy"() {
        unzipAndTest("src/examples/groovyShell/ArithmeticShell.groovy", [])
    }

    void "test src/examples/groovyShell/ArithmeticShellTest_groovy"() {
        unzipAndTest("src/examples/groovyShell/ArithmeticShellTest.groovy", [])
    }

    void "test src/examples/groovyShell/BlacklistingShell_groovy"() {
        unzipAndTest("src/examples/groovyShell/BlacklistingShell.groovy", [])
    }

    void "test src/examples/groovyShell/BlacklistingShellTest_groovy"() {
        unzipAndTest("src/examples/groovyShell/BlacklistingShellTest.groovy", [])
    }

    void "test src/examples/groovy/j2ee/CreateData_groovy"() {
        unzipAndTest("src/examples/groovy/j2ee/CreateData.groovy", [])
    }

    void "test src/examples/groovy/model/MvcDemo_groovy"() {
        unzipAndTest("src/examples/groovy/model/MvcDemo.groovy", [])
    }

    void "test src/examples/groovy/swing/SwingDemo_groovy"() {
        unzipAndTest("src/examples/groovy/swing/SwingDemo.groovy", [])
    }

    void "test src/examples/groovy/swing/TableDemo_groovy"() {
        unzipAndTest("src/examples/groovy/swing/TableDemo.groovy", [])
    }

    void "test src/examples/groovy/swing/TableLayoutDemo_groovy"() {
        unzipAndTest("src/examples/groovy/swing/TableLayoutDemo.groovy", [])
    }

    void "test src/examples/osgi/hello-groovy-bundle/org/codehaus/groovy/osgi/Activator_groovy"() {
        unzipAndTest("src/examples/osgi/hello-groovy-bundle/org/codehaus/groovy/osgi/Activator.groovy", [])
    }

    void "test src/examples/osgi/hello-groovy-bundle/org/codehaus/groovy/osgi/GroovyGreeter_groovy"() {
        unzipAndTest("src/examples/osgi/hello-groovy-bundle/org/codehaus/groovy/osgi/GroovyGreeter.groovy", [])
    }

    void "test src/examples/osgi/hello-groovy-bundle/org/codehaus/groovy/osgi/GroovyGreeterImpl_groovy"() {
        unzipAndTest("src/examples/osgi/hello-groovy-bundle/org/codehaus/groovy/osgi/GroovyGreeterImpl.groovy", [])
    }

    void "test src/examples/osgi/hello-groovy-test-harness/org/codehaus/groovy/osgi/harness/HarnessActivator_groovy"() {
        unzipAndTest("src/examples/osgi/hello-groovy-test-harness/org/codehaus/groovy/osgi/harness/HarnessActivator.groovy", [])
    }

    void "test src/examples/searchEngine/Indexer_groovy"() {
        unzipAndTest("src/examples/searchEngine/Indexer.groovy", [])
    }

    void "test src/examples/searchEngine/Searcher_groovy"() {
        unzipAndTest("src/examples/searchEngine/Searcher.groovy", [])
    }

    void "test src/examples/swing/BindingExample_groovy"() {
        unzipAndTest("src/examples/swing/BindingExample.groovy", [])
    }

    void "test src/examples/swing/BloglinesClient_groovy"() {
        unzipAndTest("src/examples/swing/BloglinesClient.groovy", [])
    }

    void "test src/examples/swing/ModelNodeExample_groovy"() {
        unzipAndTest("src/examples/swing/ModelNodeExample.groovy", [])
    }

    void "test src/examples/swing/RegexCoach_groovy"() {
        unzipAndTest("src/examples/swing/RegexCoach.groovy", [])
    }

    void "test src/examples/swing/RegexCoachController_groovy"() {
        unzipAndTest("src/examples/swing/RegexCoachController.groovy", [])
    }

    void "test src/examples/swing/RegexCoachView_groovy"() {
        unzipAndTest("src/examples/swing/RegexCoachView.groovy", [])
    }

    void "test src/examples/swing/Widgets_groovy"() {
        unzipAndTest("src/examples/swing/Widgets.groovy", [])
    }

    void "test src/examples/swing/binding/caricature/Caricature_groovy"() {
        unzipAndTest("src/examples/swing/binding/caricature/Caricature.groovy", [])
    }

    void "test src/examples/swing/greet/Greet_groovy"() {
        unzipAndTest("src/examples/swing/greet/Greet.groovy", [])
    }

    void "test src/examples/swing/greet/TwitterAPI_groovy"() {
        unzipAndTest("src/examples/swing/greet/TwitterAPI.groovy", [])
    }

    void "test src/examples/swing/greet/View_groovy"() {
        unzipAndTest("src/examples/swing/greet/View.groovy", [])
    }

    void "test src/examples/swing/timelog/TimeLogMain_groovy"() {
        unzipAndTest("src/examples/swing/timelog/TimeLogMain.groovy", [])
    }

    void "test src/examples/swing/timelog/TimeLogModel_groovy"() {
        unzipAndTest("src/examples/swing/timelog/TimeLogModel.groovy", [])
    }

    void "test src/examples/swing/timelog/TimeLogView_groovy"() {
        unzipAndTest("src/examples/swing/timelog/TimeLogView.groovy", [])
    }

    void "test src/examples/transforms/global/CompiledAtASTTransformation_groovy"() {
        unzipAndTest("src/examples/transforms/global/CompiledAtASTTransformation.groovy", [])
    }

    void "test src/examples/transforms/global/CompiledAtExample_groovy"() {
        unzipAndTest("src/examples/transforms/global/CompiledAtExample.groovy", [])
    }

    void "test src/examples/transforms/global/CompiledAtIntegrationTest_groovy"() {
        unzipAndTest("src/examples/transforms/global/CompiledAtIntegrationTest.groovy", [])
    }

    void "test src/examples/transforms/global/LoggingASTTransformation_groovy"() {
        unzipAndTest("src/examples/transforms/global/LoggingASTTransformation.groovy", [])
    }

    void "test src/examples/transforms/global/LoggingExample_groovy"() {
        unzipAndTest("src/examples/transforms/global/LoggingExample.groovy", [])
    }

    void "test src/examples/transforms/local/LoggingASTTransformation_groovy"() {
        unzipAndTest("src/examples/transforms/local/LoggingASTTransformation.groovy", [])
    }

    void "test src/examples/transforms/local/LoggingExample_groovy"() {
        unzipAndTest("src/examples/transforms/local/LoggingExample.groovy", [])
    }

    void "test src/examples/transforms/local/WithLogging_groovy"() {
        unzipAndTest("src/examples/transforms/local/WithLogging.groovy", [])
    }

    void "test src/examples/webapps/groovlet-examples/WEB-INF/groovy/Animal_groovy"() {
        unzipAndTest("src/examples/webapps/groovlet-examples/WEB-INF/groovy/Animal.groovy", [])
    }

    void "test src/examples/webapps/groovlet-examples/WEB-INF/groovy/zoo/Fish_groovy"() {
        unzipAndTest("src/examples/webapps/groovlet-examples/WEB-INF/groovy/zoo/Fish.groovy", [])
    }

    void "test src/examples/webapps/groovlet-examples/WEB-INF/groovy/zoo/fish/Shark_groovy"() {
        unzipAndTest("src/examples/webapps/groovlet-examples/WEB-INF/groovy/zoo/fish/Shark.groovy", [])
    }

    void "test src/examples/webapps/groovlet-examples/WEB-INF/groovy/zoo/fish/Trout_groovy"() {
        unzipAndTest("src/examples/webapps/groovlet-examples/WEB-INF/groovy/zoo/fish/Trout.groovy", [])
    }

    void "test src/examples/webapps/groovlet-examples/hello/hello_groovy"() {
        unzipAndTest("src/examples/webapps/groovlet-examples/hello/hello.groovy", [])
    }

    void "test src/examples/webapps/groovlet-examples/index_groovy"() {
        unzipAndTest("src/examples/webapps/groovlet-examples/index.groovy", [])
    }

    void "test src/examples/webapps/groovlet-examples/zoo/HommingbergerGepardenforelle_groovy"() {
        unzipAndTest("src/examples/webapps/groovlet-examples/zoo/HommingbergerGepardenforelle.groovy", [])
    }

    void "test src/examples/webapps/groovlet-examples/zoo/visit_groovy"() {
        unzipAndTest("src/examples/webapps/groovlet-examples/zoo/visit.groovy", [])
    }

    void "test src/examples/webapps/groovlet-examples/zoo/zoo_groovy"() {
        unzipAndTest("src/examples/webapps/groovlet-examples/zoo/zoo.groovy", [])
    }

    void "test src/main/groovy/beans/ListenerList_groovy"() {
        unzipAndTest("src/main/groovy/beans/ListenerList.groovy", [])
    }

    void "test src/main/groovy/beans/ListenerListASTTransformation_groovy"() {
        unzipAndTest("src/main/groovy/beans/ListenerListASTTransformation.groovy", [])
    }

    void "test src/main/groovy/cli/CliBuilderException_groovy"() {
        unzipAndTest("src/main/groovy/cli/CliBuilderException.groovy", [])
    }

    void "test src/main/groovy/cli/OptionField_groovy"() {
        unzipAndTest("src/main/groovy/cli/OptionField.groovy", [])
    }

    void "test src/main/groovy/cli/UnparsedField_groovy"() {
        unzipAndTest("src/main/groovy/cli/UnparsedField.groovy", [])
    }

    void "test src/main/groovy/grape/GrapeIvy_groovy"() {
        unzipAndTest("src/main/groovy/grape/GrapeIvy.groovy", [])
    }

    void "test src/main/groovy/transform/AutoExternalize_groovy"() {
        unzipAndTest("src/main/groovy/transform/AutoExternalize.groovy", [])
    }

    void "test src/main/groovy/transform/Canonical_groovy"() {
        unzipAndTest("src/main/groovy/transform/Canonical.groovy", [])
    }

    void "test src/main/groovy/transform/CompileDynamic_groovy"() {
        unzipAndTest("src/main/groovy/transform/CompileDynamic.groovy", [])
    }

    void "test src/main/groovy/transform/ConditionalInterrupt_groovy"() {
        unzipAndTest("src/main/groovy/transform/ConditionalInterrupt.groovy", [])
    }

    void "test src/main/groovy/transform/TailRecursive_groovy"() {
        unzipAndTest("src/main/groovy/transform/TailRecursive.groovy", [])
    }

    void "test src/main/groovy/transform/ThreadInterrupt_groovy"() {
        unzipAndTest("src/main/groovy/transform/ThreadInterrupt.groovy", [])
    }

    void "test src/main/groovy/transform/TimedInterrupt_groovy"() {
        unzipAndTest("src/main/groovy/transform/TimedInterrupt.groovy", [])
    }

    void "test src/main/groovy/util/CliBuilder_groovy"() {
        unzipAndTest("src/main/groovy/util/CliBuilder.groovy", [])
    }

    void "test src/main/groovy/util/ConfigSlurper_groovy"() {
        unzipAndTest("src/main/groovy/util/ConfigSlurper.groovy", [])
    }

    void "test src/main/groovy/util/FileNameByRegexFinder_groovy"() {
        unzipAndTest("src/main/groovy/util/FileNameByRegexFinder.groovy", [])
    }

    void "test src/main/groovy/util/FileTreeBuilder_groovy"() {
        unzipAndTest("src/main/groovy/util/FileTreeBuilder.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/ast/builder/AstBuilder_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/ast/builder/AstBuilder.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/ast/builder/AstSpecificationCompiler_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/ast/builder/AstSpecificationCompiler.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/ast/builder/AstStringCompiler_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/ast/builder/AstStringCompiler.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/classgen/genArrayAccess_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/classgen/genArrayAccess.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/classgen/genArrays_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/classgen/genArrays.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/classgen/genDgmMath_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/classgen/genDgmMath.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/classgen/genMathModification_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/classgen/genMathModification.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/control/customizers/ASTTransformationCustomizer_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/control/customizers/ASTTransformationCustomizer.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/control/customizers/builder/ASTTransformationCustomizerFactory_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/control/customizers/builder/ASTTransformationCustomizerFactory.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/control/customizers/builder/CompilerCustomizationBuilder_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/control/customizers/builder/CompilerCustomizationBuilder.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/tools/GrapeMain_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/tools/GrapeMain.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/tools/ast/TransformTestHelper_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/tools/ast/TransformTestHelper.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/ASTTestTransformation_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/ASTTestTransformation.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/ConditionalInterruptibleASTTransformation_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/ConditionalInterruptibleASTTransformation.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/ThreadInterruptibleASTTransformation_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/ThreadInterruptibleASTTransformation.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/TimedInterruptibleASTTransformation_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/TimedInterruptibleASTTransformation.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/AstHelper_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/AstHelper.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/CollectRecursiveCalls_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/CollectRecursiveCalls.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/HasRecursiveCalls_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/HasRecursiveCalls.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/InWhileLoopWrapper_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/InWhileLoopWrapper.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/RecursivenessTester_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/RecursivenessTester.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/ReturnAdderForClosures_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/ReturnAdderForClosures.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/ReturnStatementToIterationConverter_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/ReturnStatementToIterationConverter.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/StatementReplacer_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/StatementReplacer.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/TailRecursiveASTTransformation_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/TailRecursiveASTTransformation.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/TernaryToIfStatementConverter_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/TernaryToIfStatementConverter.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/VariableAccessReplacer_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/VariableAccessReplacer.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/VariableExpressionReplacer_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/VariableExpressionReplacer.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/transform/tailrec/VariableExpressionTransformer_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/transform/tailrec/VariableExpressionTransformer.groovy", [])
    }

    void "test src/main/org/codehaus/groovy/util/StringUtil_groovy"() {
        unzipAndTest("src/main/org/codehaus/groovy/util/StringUtil.groovy", [])
    }

    void "test src/spec/test-resources/aftermethodcall_groovy"() {
        unzipAndTest("src/spec/test-resources/aftermethodcall.groovy", [])
    }

    void "test src/spec/test-resources/aftervisitclass_groovy"() {
        unzipAndTest("src/spec/test-resources/aftervisitclass.groovy", [])
    }

    void "test src/spec/test-resources/aftervisitmethod_groovy"() {
        unzipAndTest("src/spec/test-resources/aftervisitmethod.groovy", [])
    }

    void "test src/spec/test-resources/ambiguousmethods_groovy"() {
        unzipAndTest("src/spec/test-resources/ambiguousmethods.groovy", [])
    }

    void "test src/spec/test-resources/beforemethodcall_groovy"() {
        unzipAndTest("src/spec/test-resources/beforemethodcall.groovy", [])
    }

    void "test src/spec/test-resources/beforevisitclass_groovy"() {
        unzipAndTest("src/spec/test-resources/beforevisitclass.groovy", [])
    }

    void "test src/spec/test-resources/beforevisitmethod_groovy"() {
        unzipAndTest("src/spec/test-resources/beforevisitmethod.groovy", [])
    }

    void "test src/spec/test-resources/finish_groovy"() {
        unzipAndTest("src/spec/test-resources/finish.groovy", [])
    }

    void "test src/spec/test-resources/incompatibleassignment_groovy"() {
        unzipAndTest("src/spec/test-resources/incompatibleassignment.groovy", [])
    }

    void "test src/spec/test-resources/methodnotfound_groovy"() {
        unzipAndTest("src/spec/test-resources/methodnotfound.groovy", [])
    }

    void "test src/spec/test-resources/newmethod_groovy"() {
        unzipAndTest("src/spec/test-resources/newmethod.groovy", [])
    }

    void "test src/spec/test-resources/onmethodselection_groovy"() {
        unzipAndTest("src/spec/test-resources/onmethodselection.groovy", [])
    }

    void "test src/spec/test-resources/reloading/dependency1_groovy"() {
        unzipAndTest("src/spec/test-resources/reloading/dependency1.groovy", [])
    }

    void "test src/spec/test-resources/reloading/dependency2_groovy"() {
        unzipAndTest("src/spec/test-resources/reloading/dependency2.groovy", [])
    }

    void "test src/spec/test-resources/reloading/source1_groovy"() {
        unzipAndTest("src/spec/test-resources/reloading/source1.groovy", [])
    }

    void "test src/spec/test-resources/reloading/source2_groovy"() {
        unzipAndTest("src/spec/test-resources/reloading/source2.groovy", [])
    }

    void "test src/spec/test-resources/reloading/source3_groovy"() {
        unzipAndTest("src/spec/test-resources/reloading/source3.groovy", [])
    }

    void "test src/spec/test-resources/robotextension_groovy"() {
        unzipAndTest("src/spec/test-resources/robotextension.groovy", [])
    }

    void "test src/spec/test-resources/robotextension2_groovy"() {
        unzipAndTest("src/spec/test-resources/robotextension2.groovy", [])
    }

    void "test src/spec/test-resources/robotextension3_groovy"() {
        unzipAndTest("src/spec/test-resources/robotextension3.groovy", [])
    }

    void "test src/spec/test-resources/scoping_groovy"() {
        unzipAndTest("src/spec/test-resources/scoping.groovy", [])
    }

    void "test src/spec/test-resources/scoping_alt_groovy"() {
        unzipAndTest("src/spec/test-resources/scoping_alt.groovy", [])
    }

    void "test src/spec/test-resources/selfcheck_groovy"() {
        unzipAndTest("src/spec/test-resources/selfcheck.groovy", [])
    }

    void "test src/spec/test-resources/setup_groovy"() {
        unzipAndTest("src/spec/test-resources/setup.groovy", [])
    }

    void "test src/spec/test-resources/unresolvedattribute_groovy"() {
        unzipAndTest("src/spec/test-resources/unresolvedattribute.groovy", [])
    }

    void "test src/spec/test-resources/unresolvedproperty_groovy"() {
        unzipAndTest("src/spec/test-resources/unresolvedproperty.groovy", [])
    }

    void "test src/spec/test-resources/unresolvedvariable_groovy"() {
        unzipAndTest("src/spec/test-resources/unresolvedvariable.groovy", [])
    }

    void "test src/spec/test/BaseScriptSpecTest_groovy"() {
        unzipAndTest("src/spec/test/BaseScriptSpecTest.groovy", [])
    }

    void "test src/spec/test/ClassDesignASTTransformsTest_groovy"() {
        unzipAndTest("src/spec/test/ClassDesignASTTransformsTest.groovy", [])
    }

    void "test src/spec/test/ClassTest_groovy"() {
        unzipAndTest("src/spec/test/ClassTest.groovy", [])
    }

    void "test src/spec/test/CloningASTTransformsTest_groovy"() {
        unzipAndTest("src/spec/test/CloningASTTransformsTest.groovy", [])
    }

    void "test src/spec/test/ClosuresSpecTest_groovy"() {
        unzipAndTest("src/spec/test/ClosuresSpecTest.groovy", [])
    }

    void "test src/spec/test/CodeGenerationASTTransformsTest_groovy"() {
        unzipAndTest("src/spec/test/CodeGenerationASTTransformsTest.groovy", [])
    }

    void "test src/spec/test/CoercionTest_groovy"() {
        unzipAndTest("src/spec/test/CoercionTest.groovy", [])
    }

    void "test src/spec/test/CommandChainsTest_groovy"() {
        unzipAndTest("src/spec/test/CommandChainsTest.groovy", [])
    }

    void "test src/spec/test/CompilerDirectivesASTTransformsTest_groovy"() {
        unzipAndTest("src/spec/test/CompilerDirectivesASTTransformsTest.groovy", [])
    }

    void "test src/spec/test/CustomizersTest_groovy"() {
        unzipAndTest("src/spec/test/CustomizersTest.groovy", [])
    }

    void "test src/spec/test/DeclarativeConcurrencyASTTransformsTest_groovy"() {
        unzipAndTest("src/spec/test/DeclarativeConcurrencyASTTransformsTest.groovy", [])
    }

    void "test src/spec/test/DelegatesToSpecTest_groovy"() {
        unzipAndTest("src/spec/test/DelegatesToSpecTest.groovy", [])
    }

    void "test src/spec/test/DesignPatternsTest_groovy"() {
        unzipAndTest("src/spec/test/DesignPatternsTest.groovy", [])
    }

    void "test src/spec/test/DifferencesFromJavaTest_groovy"() {
        unzipAndTest("src/spec/test/DifferencesFromJavaTest.groovy", [])
    }

    void "test src/spec/test/ExtensionModuleSpecTest_groovy"() {
        unzipAndTest("src/spec/test/ExtensionModuleSpecTest.groovy", [])
    }

    void "test src/spec/test/IntegrationTest_groovy"() {
        unzipAndTest("src/spec/test/IntegrationTest.groovy", [])
    }

    void "test src/spec/test/LogImprovementsASTTransformsTest_groovy"() {
        unzipAndTest("src/spec/test/LogImprovementsASTTransformsTest.groovy", [])
    }

    void "test src/spec/test/OperatorsTest_groovy"() {
        unzipAndTest("src/spec/test/OperatorsTest.groovy", [])
    }

    void "test src/spec/test/PackageTest_groovy"() {
        unzipAndTest("src/spec/test/PackageTest.groovy", [])
    }

    void "test src/spec/test/PrimitiveTest_groovy"() {
        unzipAndTest("src/spec/test/PrimitiveTest.groovy", [])
    }

    void "test src/spec/test/SaferScriptingASTTransformsTest_groovy"() {
        unzipAndTest("src/spec/test/SaferScriptingASTTransformsTest.groovy", [])
    }

    void "test src/spec/test/ScriptsAndClassesSpecTest_groovy"() {
        unzipAndTest("src/spec/test/ScriptsAndClassesSpecTest.groovy", [])
    }

    void "test src/spec/test/SemanticsTest_groovy"() {
        unzipAndTest("src/spec/test/SemanticsTest.groovy", [])
    }

    void "test src/spec/test/SwingASTTransformsTest_groovy"() {
        unzipAndTest("src/spec/test/SwingASTTransformsTest.groovy", [])
    }

    void "test src/spec/test/SyntaxTest_groovy"() {
        unzipAndTest("src/spec/test/SyntaxTest.groovy", [])
    }

    void "test src/spec/test/TestingASTTransformsTest_groovy"() {
        unzipAndTest("src/spec/test/TestingASTTransformsTest.groovy", [])
    }

    void "test src/spec/test/TraitsSpecificationTest_groovy"() {
        unzipAndTest("src/spec/test/TraitsSpecificationTest.groovy", [])
    }

    void "test src/spec/test/asciidoctor/Utils_groovy"() {
        unzipAndTest("src/spec/test/asciidoctor/Utils.groovy", [])
    }

    void "test src/spec/test/builder/CliBuilderTest_groovy"() {
        unzipAndTest("src/spec/test/builder/CliBuilderTest.groovy", [])
    }

    void "test src/spec/test/builder/FileTreeBuilderTest_groovy"() {
        unzipAndTest("src/spec/test/builder/FileTreeBuilderTest.groovy", [])
    }

    void "test src/spec/test/builder/NodeBuilderTest_groovy"() {
        unzipAndTest("src/spec/test/builder/NodeBuilderTest.groovy", [])
    }

    void "test src/spec/test/builder/ObjectGraphBuilderTest_groovy"() {
        unzipAndTest("src/spec/test/builder/ObjectGraphBuilderTest.groovy", [])
    }

    void "test src/spec/test/gdk/ConfigSlurperTest_groovy"() {
        unzipAndTest("src/spec/test/gdk/ConfigSlurperTest.groovy", [])
    }

    void "test src/spec/test/gdk/ExpandoTest_groovy"() {
        unzipAndTest("src/spec/test/gdk/ExpandoTest.groovy", [])
    }

    void "test src/spec/test/gdk/ObservableTest_groovy"() {
        unzipAndTest("src/spec/test/gdk/ObservableTest.groovy", [])
    }

    void "test src/spec/test/gdk/WorkingWithCollectionsTest_groovy"() {
        unzipAndTest("src/spec/test/gdk/WorkingWithCollectionsTest.groovy", [])
    }

    void "test src/spec/test/gdk/WorkingWithIOSpecTest_groovy"() {
        unzipAndTest("src/spec/test/gdk/WorkingWithIOSpecTest.groovy", [])
    }

    void "test src/spec/test/metaprogramming/ASTXFormSpecTest_groovy"() {
        unzipAndTest("src/spec/test/metaprogramming/ASTXFormSpecTest.groovy", [])
    }

    void "test src/spec/test/metaprogramming/CategoryTest_groovy"() {
        unzipAndTest("src/spec/test/metaprogramming/CategoryTest.groovy", [])
    }

    void "test src/spec/test/metaprogramming/ExpandoMetaClassTest_groovy"() {
        unzipAndTest("src/spec/test/metaprogramming/ExpandoMetaClassTest.groovy", [])
    }

    void "test src/spec/test/metaprogramming/GroovyObjectTest_groovy"() {
        unzipAndTest("src/spec/test/metaprogramming/GroovyObjectTest.groovy", [])
    }

    void "test src/spec/test/metaprogramming/InterceptableTest_groovy"() {
        unzipAndTest("src/spec/test/metaprogramming/InterceptableTest.groovy", [])
    }

    void "test src/spec/test/metaprogramming/InterceptionThroughMetaClassTest_groovy"() {
        unzipAndTest("src/spec/test/metaprogramming/InterceptionThroughMetaClassTest.groovy", [])
    }

    void "test src/spec/test/metaprogramming/MethodPropertyMissingTest_groovy"() {
        unzipAndTest("src/spec/test/metaprogramming/MethodPropertyMissingTest.groovy", [])
    }

    void "test src/spec/test/metaprogramming/MyTransformToDebug_groovy"() {
        unzipAndTest("src/spec/test/metaprogramming/MyTransformToDebug.groovy", [])
    }

    void "test src/spec/test/objectorientation/MethodsTest_groovy"() {
        unzipAndTest("src/spec/test/objectorientation/MethodsTest.groovy", [])
    }

    void "test src/spec/test/semantics/GPathTest_groovy"() {
        unzipAndTest("src/spec/test/semantics/GPathTest.groovy", [])
    }

    void "test src/spec/test/semantics/LabelsTest_groovy"() {
        unzipAndTest("src/spec/test/semantics/LabelsTest.groovy", [])
    }

    void "test src/spec/test/semantics/OptionalityTest_groovy"() {
        unzipAndTest("src/spec/test/semantics/OptionalityTest.groovy", [])
    }

    void "test src/spec/test/semantics/PowerAssertTest_groovy"() {
        unzipAndTest("src/spec/test/semantics/PowerAssertTest.groovy", [])
    }

    void "test src/spec/test/semantics/TheGroovyTruthTest_groovy"() {
        unzipAndTest("src/spec/test/semantics/TheGroovyTruthTest.groovy", [])
    }

    void "test src/spec/test/support/MaxRetriesExtension_groovy"() {
        unzipAndTest("src/spec/test/support/MaxRetriesExtension.groovy", [])
    }

    void "test src/spec/test/support/StaticStringExtension_groovy"() {
        unzipAndTest("src/spec/test/support/StaticStringExtension.groovy", [])
    }

    void "test src/spec/test/testingguide/GDKMethodTests_groovy"() {
        unzipAndTest("src/spec/test/testingguide/GDKMethodTests.groovy", [])
    }

    void "test src/spec/test/testingguide/GroovyTestCaseExampleTests_groovy"() {
        unzipAndTest("src/spec/test/testingguide/GroovyTestCaseExampleTests.groovy", [])
    }

    void "test src/spec/test/testingguide/JUnit4ExampleTests_groovy"() {
        unzipAndTest("src/spec/test/testingguide/JUnit4ExampleTests.groovy", [])
    }

    void "test src/spec/test/testingguide/MockingExampleTests_groovy"() {
        unzipAndTest("src/spec/test/testingguide/MockingExampleTests.groovy", [])
    }

    void "test src/spec/test/typing/OptionalTypingTest_groovy"() {
        unzipAndTest("src/spec/test/typing/OptionalTypingTest.groovy", [])
    }

    void "test src/spec/test/typing/PrecompiledExtension_groovy"() {
        unzipAndTest("src/spec/test/typing/PrecompiledExtension.groovy", [])
    }

    void "test src/spec/test/typing/Robot_groovy"() {
        unzipAndTest("src/spec/test/typing/Robot.groovy", [])
    }

    void "test src/spec/test/typing/StaticCompilationIntroTest_groovy"() {
        unzipAndTest("src/spec/test/typing/StaticCompilationIntroTest.groovy", [])
    }

    void "test src/spec/test/typing/TypeCheckingExtensionSpecTest_groovy"() {
        unzipAndTest("src/spec/test/typing/TypeCheckingExtensionSpecTest.groovy", [])
    }

    void "test src/spec/test/typing/TypeCheckingHintsTest_groovy"() {
        unzipAndTest("src/spec/test/typing/TypeCheckingHintsTest.groovy", [])
    }

    void "test src/spec/test/typing/TypeCheckingTest_groovy"() {
        unzipAndTest("src/spec/test/typing/TypeCheckingTest.groovy", [])
    }

    void "test src/tck/src/org/codehaus/groovy/tck/BatchGenerate_groovy"() {
        unzipAndTest("src/tck/src/org/codehaus/groovy/tck/BatchGenerate.groovy", [])
    }

    void "test src/tck/src/org/codehaus/groovy/tck/TestGenerator_groovy"() {
        unzipAndTest("src/tck/src/org/codehaus/groovy/tck/TestGenerator.groovy", [])
    }

    void "test src/tck/test/gls/ch03/s01/Unicode1_groovy"() {
        unzipAndTest("src/tck/test/gls/ch03/s01/Unicode1.groovy", [])
    }

    /*
    void "test src/tck/test/gls/ch03/s01/Unicode2_groovy"() {
        unzipAndTest("src/tck/test/gls/ch03/s01/Unicode2.groovy", [])
    }
    */

    void "test src/tck/test/gls/ch03/s02/LexicalTranslation1_groovy"() {
        unzipAndTest("src/tck/test/gls/ch03/s02/LexicalTranslation1.groovy", [])
    }

    void "test src/tck/test/gls/ch03/s02/Longest1_groovy"() {
        unzipAndTest("src/tck/test/gls/ch03/s02/Longest1.groovy", [])
    }

    /*
    void "test src/tck/test/gls/ch03/s03/UnicodeEscapes1_groovy"() {
        unzipAndTest("src/tck/test/gls/ch03/s03/UnicodeEscapes1.groovy", [])
    }
    */

    // https://github.com/danielsun1106/groovy-parser/issues/3
    /*
    void "test src/tck/test/gls/ch03/s03/UnicodeEscapes2_groovy"() {
        unzipAndTest("src/tck/test/gls/ch03/s03/UnicodeEscapes2.groovy", [], ['\\ufffg': '/ufffg', '\\uu006g': '/uu006g', '\\uab cd': '/uab cd'])
    }
    */

    void "test src/test-resources/groovy/transform/sc/MixedMode_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/sc/MixedMode.groovy", [])
    }

    void "test src/test-resources/groovy/transform/sc/MixedMode2_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/sc/MixedMode2.groovy", [])
    }

    void "test src/test-resources/groovy/transform/sc/MixedModeDynamicBuilder_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/sc/MixedModeDynamicBuilder.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/AmbiguousMethods_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/AmbiguousMethods.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/AnnotatedByTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/AnnotatedByTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/ArgumentsTestingTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/ArgumentsTestingTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/BeforeAfterClassTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/BeforeAfterClassTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/BinaryOperatorTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/BinaryOperatorTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/DelegatesToTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/DelegatesToTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/FinishTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/FinishTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/FirstArgumentsTestingTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/FirstArgumentsTestingTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/Groovy6047Extension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/Groovy6047Extension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/IncompatibleAssignmentTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/IncompatibleAssignmentTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/IncompatibleReturnTypeTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/IncompatibleReturnTypeTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/MissingMethod1TestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/MissingMethod1TestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/MissingMethod2TestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/MissingMethod2TestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/NewMethodAndIsGeneratedTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/NewMethodAndIsGeneratedTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/NthArgumentTestingTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/NthArgumentTestingTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/OnMethodSelectionTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/OnMethodSelectionTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/PrefixChangerTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/PrefixChangerTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/RobotMove_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/RobotMove.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/ScopeEnterExitTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/ScopeEnterExitTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/SetupTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/SetupTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/SilentTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/SilentTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/SprintfExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/SprintfExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/UndefinedVariableNoHandleTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/UndefinedVariableNoHandleTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/UndefinedVariableTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/UndefinedVariableTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/UnresolvedAttributeTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/UnresolvedAttributeTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/UnresolvedPropertyTestExtension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/UnresolvedPropertyTestExtension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/UpperCaseMethodTest1Extension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/UpperCaseMethodTest1Extension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/UpperCaseMethodTest2Extension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/UpperCaseMethodTest2Extension.groovy", [])
    }

    void "test src/test-resources/groovy/transform/stc/UpperCaseMethodTest3Extension_groovy"() {
        unzipAndTest("src/test-resources/groovy/transform/stc/UpperCaseMethodTest3Extension.groovy", [])
    }

    void "test src/test-resources/stubgenerator/circularLanguageReference/Rectangle_groovy"() {
        unzipAndTest("src/test-resources/stubgenerator/circularLanguageReference/Rectangle.groovy", [])
    }

    void "test src/test-resources/stubgenerator/propertyUsageFromJava/somepackage/GroovyPogo_groovy"() {
        unzipAndTest("src/test-resources/stubgenerator/propertyUsageFromJava/somepackage/GroovyPogo.groovy", [])
    }

    void "test src/test/MainJavadocAssertionTest_groovy"() {
        unzipAndTest("src/test/MainJavadocAssertionTest.groovy", [])
    }

    void "test src/test/Outer3_groovy"() {
        unzipAndTest("src/test/Outer3.groovy", [])
    }

    void "test src/test/Outer4_groovy"() {
        unzipAndTest("src/test/Outer4.groovy", [])
    }

    void "test src/test/gls/CompilableTestSupport_groovy"() {
        unzipAndTest("src/test/gls/CompilableTestSupport.groovy", [])
    }

    void "test src/test/gls/annotations/AnnotationTest_groovy"() {
        unzipAndTest("src/test/gls/annotations/AnnotationTest.groovy", [])
    }

    void "test src/test/gls/annotations/XmlEnum_groovy"() {
        unzipAndTest("src/test/gls/annotations/XmlEnum.groovy", [])
    }

    void "test src/test/gls/annotations/XmlEnumValue_groovy"() {
        unzipAndTest("src/test/gls/annotations/XmlEnumValue.groovy", [])
    }

    void "test src/test/gls/annotations/closures/AnnotationClosureExhaustiveTestSupport_groovy"() {
        unzipAndTest("src/test/gls/annotations/closures/AnnotationClosureExhaustiveTestSupport.groovy", [])
    }

    void "test src/test/gls/annotations/closures/AnnotationClosureOwnerCallTest_groovy"() {
        unzipAndTest("src/test/gls/annotations/closures/AnnotationClosureOwnerCallTest.groovy", [])
    }

    void "test src/test/gls/annotations/closures/AnnotationClosureTest_groovy"() {
        unzipAndTest("src/test/gls/annotations/closures/AnnotationClosureTest.groovy", [])
    }

    void "test src/test/gls/annotations/closures/AnnotationClosureThisObjectCallTest_groovy"() {
        unzipAndTest("src/test/gls/annotations/closures/AnnotationClosureThisObjectCallTest.groovy", [])
    }

    void "test src/test/gls/annotations/closures/AnnotationClosureUnqualifiedCallTest_groovy"() {
        unzipAndTest("src/test/gls/annotations/closures/AnnotationClosureUnqualifiedCallTest.groovy", [])
    }

    void "test src/test/gls/annotations/closures/AnnotationClosureWithNonLocalVariable_groovy"() {
        unzipAndTest("src/test/gls/annotations/closures/AnnotationClosureWithNonLocalVariable.groovy", [])
    }

    void "test src/test/gls/annotations/closures/AnnotationClosureWithParametersTest_groovy"() {
        unzipAndTest("src/test/gls/annotations/closures/AnnotationClosureWithParametersTest.groovy", [])
    }

    void "test src/test/gls/annotations/closures/JavaCompatibility_groovy"() {
        unzipAndTest("src/test/gls/annotations/closures/JavaCompatibility.groovy", [])
    }

    void "test src/test/gls/annotations/closures/JavaCompatibilityParameterized_groovy"() {
        unzipAndTest("src/test/gls/annotations/closures/JavaCompatibilityParameterized.groovy", [])
    }

    void "test src/test/gls/ch06/s05/GName1Test_groovy"() {
        unzipAndTest("src/test/gls/ch06/s05/GName1Test.groovy", [])
    }

    void "test src/test/gls/ch08/s04/FormalParameterTest_groovy"() {
        unzipAndTest("src/test/gls/ch08/s04/FormalParameterTest.groovy", [])
    }

    void "test src/test/gls/ch08/s04/RepetitiveMethodTest_groovy"() {
        unzipAndTest("src/test/gls/ch08/s04/RepetitiveMethodTest.groovy", [])
    }

    void "test src/test/gls/enums/EnumTest_groovy"() {
        unzipAndTest("src/test/gls/enums/EnumTest.groovy", [])
    }

    void "test src/test/gls/generics/GenericsTest_groovy"() {
        unzipAndTest("src/test/gls/generics/GenericsTest.groovy", [])
    }

    void "test src/test/gls/innerClass/InnerClassTest_groovy"() {
        unzipAndTest("src/test/gls/innerClass/InnerClassTest.groovy", [])
    }

    void "test src/test/gls/innerClass/InnerInterfaceTest_groovy"() {
        unzipAndTest("src/test/gls/innerClass/InnerInterfaceTest.groovy", [])
    }

    void "test src/test/gls/invocation/ClassDuplicationTest_groovy"() {
        unzipAndTest("src/test/gls/invocation/ClassDuplicationTest.groovy", [])
    }

    void "test src/test/gls/invocation/ClosureDelegationTest_groovy"() {
        unzipAndTest("src/test/gls/invocation/ClosureDelegationTest.groovy", [])
    }

    void "test src/test/gls/invocation/ConstructorDelegationTest_groovy"() {
        unzipAndTest("src/test/gls/invocation/ConstructorDelegationTest.groovy", [])
    }

    void "test src/test/gls/invocation/CovariantReturnTest_groovy"() {
        unzipAndTest("src/test/gls/invocation/CovariantReturnTest.groovy", [])
    }

    void "test src/test/gls/invocation/DefaultParamTest_groovy"() {
        unzipAndTest("src/test/gls/invocation/DefaultParamTest.groovy", [])
    }

    void "test src/test/gls/invocation/GroovyObjectInheritanceTest_groovy"() {
        unzipAndTest("src/test/gls/invocation/GroovyObjectInheritanceTest.groovy", [])
    }

    void "test src/test/gls/invocation/MethodDeclarationTest_groovy"() {
        unzipAndTest("src/test/gls/invocation/MethodDeclarationTest.groovy", [])
    }

    void "test src/test/gls/invocation/MethodSelectionTest_groovy"() {
        unzipAndTest("src/test/gls/invocation/MethodSelectionTest.groovy", [])
    }

    void "test src/test/gls/invocation/StaticMethodInvocationTest_groovy"() {
        unzipAndTest("src/test/gls/invocation/StaticMethodInvocationTest.groovy", [])
    }

    void "test src/test/gls/property/MetaClassOverridingTest_groovy"() {
        unzipAndTest("src/test/gls/property/MetaClassOverridingTest.groovy", [])
    }

    void "test src/test/gls/scope/BlockScopeVisibilityTest_groovy"() {
        unzipAndTest("src/test/gls/scope/BlockScopeVisibilityTest.groovy", [])
    }

    void "test src/test/gls/scope/ClassVariableHidingTest_groovy"() {
        unzipAndTest("src/test/gls/scope/ClassVariableHidingTest.groovy", [])
    }

    void "test src/test/gls/scope/FinalAccessTest_groovy"() {
        unzipAndTest("src/test/gls/scope/FinalAccessTest.groovy", [])
    }

    void "test src/test/gls/scope/MultipleDefinitionOfSameVariableTest_groovy"() {
        unzipAndTest("src/test/gls/scope/MultipleDefinitionOfSameVariableTest.groovy", [])
    }

    void "test src/test/gls/scope/NameResolvingTest_groovy"() {
        unzipAndTest("src/test/gls/scope/NameResolvingTest.groovy", [])
    }

    void "test src/test/gls/scope/StaticScopeTest_groovy"() {
        unzipAndTest("src/test/gls/scope/StaticScopeTest.groovy", [])
    }

    void "test src/test/gls/scope/VariablePrecedenceTest_groovy"() {
        unzipAndTest("src/test/gls/scope/VariablePrecedenceTest.groovy", [])
    }

    void "test src/test/gls/sizelimits/StringSizeTest_groovy"() {
        unzipAndTest("src/test/gls/sizelimits/StringSizeTest.groovy", [])
    }

    void "test src/test/gls/statements/DeclarationTest_groovy"() {
        unzipAndTest("src/test/gls/statements/DeclarationTest.groovy", [])
    }

    void "test src/test/gls/statements/MultipleAssignmentDeclarationTest_groovy"() {
        unzipAndTest("src/test/gls/statements/MultipleAssignmentDeclarationTest.groovy", [])
    }

    void "test src/test/gls/statements/MultipleAssignmentTest_groovy"() {
        unzipAndTest("src/test/gls/statements/MultipleAssignmentTest.groovy", [])
    }

    void "test src/test/gls/statements/ReturnTest_groovy"() {
        unzipAndTest("src/test/gls/statements/ReturnTest.groovy", [])
    }

    void "test src/test/gls/syntax/AssertTest_groovy"() {
        unzipAndTest("src/test/gls/syntax/AssertTest.groovy", [])
    }

    void "test src/test/gls/syntax/BinaryLiteralTest_groovy"() {
        unzipAndTest("src/test/gls/syntax/BinaryLiteralTest.groovy", [])
    }

    void "test src/test/gls/syntax/Gep3OrderDslTest_groovy"() {
        unzipAndTest("src/test/gls/syntax/Gep3OrderDslTest.groovy", [])
    }

    void "test src/test/gls/syntax/Gep3Test_groovy"() {
        unzipAndTest("src/test/gls/syntax/Gep3Test.groovy", [])
    }

    void "test src/test/gls/syntax/MethodCallValidationTest_groovy"() {
        unzipAndTest("src/test/gls/syntax/MethodCallValidationTest.groovy", [])
    }

    void "test src/test/gls/syntax/NumberLiteralTest_groovy"() {
        unzipAndTest("src/test/gls/syntax/NumberLiteralTest.groovy", [])
    }

    void "test src/test/gls/syntax/OldClosureSyntaxRemovalTest_groovy"() {
        unzipAndTest("src/test/gls/syntax/OldClosureSyntaxRemovalTest.groovy", [])
    }

    void "test src/test/gls/syntax/OldPropertySyntaxRemovalTest_groovy"() {
        unzipAndTest("src/test/gls/syntax/OldPropertySyntaxRemovalTest.groovy", [])
    }

    void "test src/test/gls/syntax/OldSpreadTest_groovy"() {
        unzipAndTest("src/test/gls/syntax/OldSpreadTest.groovy", [])
    }

    void "test src/test/gls/syntax/ParsingTest_groovy"() {
        unzipAndTest("src/test/gls/syntax/ParsingTest.groovy", [])
    }

    void "test src/test/gls/syntax/UnderscoreInNumbersTest_groovy"() {
        unzipAndTest("src/test/gls/syntax/UnderscoreInNumbersTest.groovy", [])
    }

    void "test src/test/gls/types/BooleanExpressionConversionTest_groovy"() {
        unzipAndTest("src/test/gls/types/BooleanExpressionConversionTest.groovy", [])
    }

    void "test src/test/gls/types/GroovyCastTest_groovy"() {
        unzipAndTest("src/test/gls/types/GroovyCastTest.groovy", [])
    }

    void "test src/test/gls/types/OperationsResultTypeTest_groovy"() {
        unzipAndTest("src/test/gls/types/OperationsResultTypeTest.groovy", [])
    }

    void "test src/test/groovy/AbstractClassAndInterfaceTest_groovy"() {
        unzipAndTest("src/test/groovy/AbstractClassAndInterfaceTest.groovy", [])
    }

    void "test src/test/groovy/ActorTest_groovy"() {
        unzipAndTest("src/test/groovy/ActorTest.groovy", [])
    }

    void "test src/test/groovy/AmbiguousInvocationTest_groovy"() {
        unzipAndTest("src/test/groovy/AmbiguousInvocationTest.groovy", [])
    }

    void "test src/test/groovy/ArrayAutoboxingTest_groovy"() {
        unzipAndTest("src/test/groovy/ArrayAutoboxingTest.groovy", [])
    }

    void "test src/test/groovy/ArrayCoerceTest_groovy"() {
        unzipAndTest("src/test/groovy/ArrayCoerceTest.groovy", [])
    }

    void "test src/test/groovy/ArrayParamMethodTest_groovy"() {
        unzipAndTest("src/test/groovy/ArrayParamMethodTest.groovy", [])
    }

    void "test src/test/groovy/ArrayTest_groovy"() {
        unzipAndTest("src/test/groovy/ArrayTest.groovy", [])
    }

    void "test src/test/groovy/ArrayTypeTest_groovy"() {
        unzipAndTest("src/test/groovy/ArrayTypeTest.groovy", [])
    }

    void "test src/test/groovy/AsTest_groovy"() {
        unzipAndTest("src/test/groovy/AsTest.groovy", [])
    }

    void "test src/test/groovy/AssertNumberTest_groovy"() {
        unzipAndTest("src/test/groovy/AssertNumberTest.groovy", [])
    }

    void "test src/test/groovy/AssertTest_groovy"() {
        unzipAndTest("src/test/groovy/AssertTest.groovy", [])
    }

    void "test src/test/groovy/Bar_groovy"() {
        unzipAndTest("src/test/groovy/Bar.groovy", [])
    }

    void "test src/test/groovy/Base64Test_groovy"() {
        unzipAndTest("src/test/groovy/Base64Test.groovy", [])
    }

    void "test src/test/groovy/BinaryStreamsTest_groovy"() {
        unzipAndTest("src/test/groovy/BinaryStreamsTest.groovy", [])
    }

    void "test src/test/groovy/BindingTest_groovy"() {
        unzipAndTest("src/test/groovy/BindingTest.groovy", [])
    }

    void "test src/test/groovy/BitSetTest_groovy"() {
        unzipAndTest("src/test/groovy/BitSetTest.groovy", [])
    }

    void "test src/test/groovy/BreakContinueLabelTest_groovy"() {
        unzipAndTest("src/test/groovy/BreakContinueLabelTest.groovy", [])
    }

    void "test src/test/groovy/CallInnerClassCtorTest_groovy"() {
        unzipAndTest("src/test/groovy/CallInnerClassCtorTest.groovy", [])
    }

    void "test src/test/groovy/CastTest_groovy"() {
        unzipAndTest("src/test/groovy/CastTest.groovy", [])
    }

    void "test src/test/groovy/CategoryTest_groovy"() {
        unzipAndTest("src/test/groovy/CategoryTest.groovy", [])
    }

    void "test src/test/groovy/ChainedAssignmentTest_groovy"() {
        unzipAndTest("src/test/groovy/ChainedAssignmentTest.groovy", [])
    }

    void "test src/test/groovy/ClassExpressionTest_groovy"() {
        unzipAndTest("src/test/groovy/ClassExpressionTest.groovy", [])
    }

    void "test src/test/groovy/ClassLoaderBug_groovy"() {
        unzipAndTest("src/test/groovy/ClassLoaderBug.groovy", [])
    }

    void "test src/test/groovy/ClassTest_groovy"() {
        unzipAndTest("src/test/groovy/ClassTest.groovy", [])
    }

    void "test src/test/groovy/ClosureAsParamTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureAsParamTest.groovy", [])
    }

    void "test src/test/groovy/ClosureCloneTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureCloneTest.groovy", [])
    }

    void "test src/test/groovy/ClosureComparatorTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureComparatorTest.groovy", [])
    }

    void "test src/test/groovy/ClosureComposeTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureComposeTest.groovy", [])
    }

    void "test src/test/groovy/ClosureCurryTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureCurryTest.groovy", [])
    }

    void "test src/test/groovy/ClosureDefaultParameterTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureDefaultParameterTest.groovy", [])
    }

    void "test src/test/groovy/ClosureInClosureTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureInClosureTest.groovy", [])
    }

    void "test src/test/groovy/ClosureInStaticMethodTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureInStaticMethodTest.groovy", [])
    }

    void "test src/test/groovy/ClosureMethodCallTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureMethodCallTest.groovy", [])
    }

    void "test src/test/groovy/ClosureMethodTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureMethodTest.groovy", [])
    }

    void "test src/test/groovy/ClosureMethodsOnFileTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureMethodsOnFileTest.groovy", [])
    }

    void "test src/test/groovy/ClosureMissingMethodTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureMissingMethodTest.groovy", [])
    }

    void "test src/test/groovy/ClosureReturnTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureReturnTest.groovy", [])
    }

    void "test src/test/groovy/ClosureReturnWithoutReturnStatementTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureReturnWithoutReturnStatementTest.groovy", [])
    }

    void "test src/test/groovy/ClosureSugarTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureSugarTest.groovy", [])
    }

    void "test src/test/groovy/ClosureTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureTest.groovy", [])
    }

    void "test src/test/groovy/ClosureUsingOuterVariablesTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureUsingOuterVariablesTest.groovy", [])
    }

    void "test src/test/groovy/ClosureWithDefaultParamTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureWithDefaultParamTest.groovy", [])
    }

    void "test src/test/groovy/ClosureWithEmptyParametersTest_groovy"() {
        unzipAndTest("src/test/groovy/ClosureWithEmptyParametersTest.groovy", [])
    }

    void "test src/test/groovy/CollateTest_groovy"() {
        unzipAndTest("src/test/groovy/CollateTest.groovy", [])
    }

    void "test src/test/groovy/CompareEqualsTest_groovy"() {
        unzipAndTest("src/test/groovy/CompareEqualsTest.groovy", [])
    }

    void "test src/test/groovy/CompareToTest_groovy"() {
        unzipAndTest("src/test/groovy/CompareToTest.groovy", [])
    }

    void "test src/test/groovy/CompareTypesTest_groovy"() {
        unzipAndTest("src/test/groovy/CompareTypesTest.groovy", [])
    }

    void "test src/test/groovy/CompileOrderTest_groovy"() {
        unzipAndTest("src/test/groovy/CompileOrderTest.groovy", [])
    }

    void "test src/test/groovy/CompilerErrorTest_groovy"() {
        unzipAndTest("src/test/groovy/CompilerErrorTest.groovy", [])
    }

    void "test src/test/groovy/Constructor2Test_groovy"() {
        unzipAndTest("src/test/groovy/Constructor2Test.groovy", [])
    }

    void "test src/test/groovy/ConstructorTest_groovy"() {
        unzipAndTest("src/test/groovy/ConstructorTest.groovy", [])
    }

    void "test src/test/groovy/CurlyBracketLayoutTest_groovy"() {
        unzipAndTest("src/test/groovy/CurlyBracketLayoutTest.groovy", [])
    }

    void "test src/test/groovy/DateTest_groovy"() {
        unzipAndTest("src/test/groovy/DateTest.groovy", [])
    }

    void "test src/test/groovy/DefaultParamClosureTest_groovy"() {
        unzipAndTest("src/test/groovy/DefaultParamClosureTest.groovy", [])
    }

    void "test src/test/groovy/DoWhileLoopTest_groovy"() {
        unzipAndTest("src/test/groovy/DoWhileLoopTest.groovy", [])
    }

    void "test src/test/groovy/DollarEscapingTest_groovy"() {
        unzipAndTest("src/test/groovy/DollarEscapingTest.groovy", [])
    }

    void "test src/test/groovy/DownUpStepTest_groovy"() {
        unzipAndTest("src/test/groovy/DownUpStepTest.groovy", [])
    }

    void "test src/test/groovy/DummyMethodsGroovy_groovy"() {
        unzipAndTest("src/test/groovy/DummyMethodsGroovy.groovy", [])
    }

    void "test src/test/groovy/DynamicMemberTest_groovy"() {
        unzipAndTest("src/test/groovy/DynamicMemberTest.groovy", [])
    }

    void "test src/test/groovy/EqualsTest_groovy"() {
        unzipAndTest("src/test/groovy/EqualsTest.groovy", [])
    }

    /* FIXME find a better way to translate code written in unicode escapes
    void "test src/test/groovy/EscapedUnicodeTest_groovy"() {
        unzipAndTest("src/test/groovy/EscapedUnicodeTest.groovy", [])
    }
    */

    void "test src/test/groovy/ExceptionInClosureTest_groovy"() {
        unzipAndTest("src/test/groovy/ExceptionInClosureTest.groovy", [])
    }

    void "test src/test/groovy/ExpandoPropertyTest_groovy"() {
        unzipAndTest("src/test/groovy/ExpandoPropertyTest.groovy", [])
    }

    void "test src/test/groovy/FileTest_groovy"() {
        unzipAndTest("src/test/groovy/FileTest.groovy", [])
    }

    void "test src/test/groovy/FilterLineTest_groovy"() {
        unzipAndTest("src/test/groovy/FilterLineTest.groovy", [])
    }

    void "test src/test/groovy/FinallyTest_groovy"() {
        unzipAndTest("src/test/groovy/FinallyTest.groovy", [])
    }

    void "test src/test/groovy/Foo_groovy"() {
        unzipAndTest("src/test/groovy/Foo.groovy", [])
    }

    void "test src/test/groovy/ForLoopTest_groovy"() {
        unzipAndTest("src/test/groovy/ForLoopTest.groovy", [])
    }

    void "test src/test/groovy/ForLoopWithLocalVariablesTest_groovy"() {
        unzipAndTest("src/test/groovy/ForLoopWithLocalVariablesTest.groovy", [])
    }

    void "test src/test/groovy/GStringTest_groovy"() {
        unzipAndTest("src/test/groovy/GStringTest.groovy", [])
    }

    void "test src/test/groovy/GeneratorTest_groovy"() {
        unzipAndTest("src/test/groovy/GeneratorTest.groovy", [])
    }

    void "test src/test/groovy/GlobalPrintlnTest_groovy"() {
        unzipAndTest("src/test/groovy/GlobalPrintlnTest.groovy", [])
    }

    void "test src/test/groovy/GroovyCharSequenceMethodsTest_groovy"() {
        unzipAndTest("src/test/groovy/GroovyCharSequenceMethodsTest.groovy", [])
    }

    void "test src/test/groovy/GroovyClosureMethodsTest_groovy"() {
        unzipAndTest("src/test/groovy/GroovyClosureMethodsTest.groovy", [])
    }

    void "test src/test/groovy/GroovyInterceptableTest_groovy"() {
        unzipAndTest("src/test/groovy/GroovyInterceptableTest.groovy", [])
    }

    void "test src/test/groovy/GroovyMethodsTest_groovy"() {
        unzipAndTest("src/test/groovy/GroovyMethodsTest.groovy", [])
    }

    /* FIXME `testFalse [:]`, antlr4 parser parses it into `testFalse[:]`, but antlr2 parser parses it into `testFalse([:])`
    void "test src/test/groovy/GroovyTruthTest_groovy"() {
        unzipAndTest("src/test/groovy/GroovyTruthTest.groovy", [])
    }
    */

    void "test src/test/groovy/HeredocsTest_groovy"() {
        unzipAndTest("src/test/groovy/HeredocsTest.groovy", [])
    }

    void "test src/test/groovy/HexTest_groovy"() {
        unzipAndTest("src/test/groovy/HexTest.groovy", [])
    }

    void "test src/test/groovy/HomepageTest_groovy"() {
        unzipAndTest("src/test/groovy/HomepageTest.groovy", [])
    }

    void "test src/test/groovy/IdentityClosureTest_groovy"() {
        unzipAndTest("src/test/groovy/IdentityClosureTest.groovy", [])
    }

    void "test src/test/groovy/IfElseCompactTest_groovy"() {
        unzipAndTest("src/test/groovy/IfElseCompactTest.groovy", [])
    }

    void "test src/test/groovy/IfElseTest_groovy"() {
        unzipAndTest("src/test/groovy/IfElseTest.groovy", [])
    }

    void "test src/test/groovy/IfPropertyTest_groovy"() {
        unzipAndTest("src/test/groovy/IfPropertyTest.groovy", [])
    }

    void "test src/test/groovy/IfTest_groovy"() {
        unzipAndTest("src/test/groovy/IfTest.groovy", [])
    }

    void "test src/test/groovy/IfWithMethodCallTest_groovy"() {
        unzipAndTest("src/test/groovy/IfWithMethodCallTest.groovy", [])
    }

    void "test src/test/groovy/ImmutableModificationTest_groovy"() {
        unzipAndTest("src/test/groovy/ImmutableModificationTest.groovy", [])
    }

    void "test src/test/groovy/ImportTest_groovy"() {
        unzipAndTest("src/test/groovy/ImportTest.groovy", [])
    }

    void "test src/test/groovy/InstanceofTest_groovy"() {
        unzipAndTest("src/test/groovy/InstanceofTest.groovy", [])
    }

    void "test src/test/groovy/InterfaceTest_groovy"() {
        unzipAndTest("src/test/groovy/InterfaceTest.groovy", [])
    }

    void "test src/test/groovy/InvokeNormalMethodsFirstTest_groovy"() {
        unzipAndTest("src/test/groovy/InvokeNormalMethodsFirstTest.groovy", [])
    }

    void "test src/test/groovy/JointGroovy_groovy"() {
        unzipAndTest("src/test/groovy/JointGroovy.groovy", [])
    }

    void "test src/test/groovy/KeywordsInPropertyNamesTest_groovy"() {
        unzipAndTest("src/test/groovy/KeywordsInPropertyNamesTest.groovy", [])
    }

    void "test src/test/groovy/LeftShiftTest_groovy"() {
        unzipAndTest("src/test/groovy/LeftShiftTest.groovy", [])
    }

    void "test src/test/groovy/ListIteratingTest_groovy"() {
        unzipAndTest("src/test/groovy/ListIteratingTest.groovy", [])
    }

    void "test src/test/groovy/ListTest_groovy"() {
        unzipAndTest("src/test/groovy/ListTest.groovy", [])
    }

    void "test src/test/groovy/LiteralTypesTest_groovy"() {
        unzipAndTest("src/test/groovy/LiteralTypesTest.groovy", [])
    }

    void "test src/test/groovy/LittleClosureTest_groovy"() {
        unzipAndTest("src/test/groovy/LittleClosureTest.groovy", [])
    }

    void "test src/test/groovy/LocalFieldTest_groovy"() {
        unzipAndTest("src/test/groovy/LocalFieldTest.groovy", [])
    }

    void "test src/test/groovy/LocalPropertyTest_groovy"() {
        unzipAndTest("src/test/groovy/LocalPropertyTest.groovy", [])
    }

    void "test src/test/groovy/LocalVariableTest_groovy"() {
        unzipAndTest("src/test/groovy/LocalVariableTest.groovy", [])
    }

    void "test src/test/groovy/LogicTest_groovy"() {
        unzipAndTest("src/test/groovy/LogicTest.groovy", [])
    }

    void "test src/test/groovy/LoopBreakTest_groovy"() {
        unzipAndTest("src/test/groovy/LoopBreakTest.groovy", [])
    }

    void "test src/test/groovy/MapConstructionTest_groovy"() {
        unzipAndTest("src/test/groovy/MapConstructionTest.groovy", [])
    }

    void "test src/test/groovy/MapPropertyTest_groovy"() {
        unzipAndTest("src/test/groovy/MapPropertyTest.groovy", [])
    }

    void "test src/test/groovy/MapTest_groovy"() {
        unzipAndTest("src/test/groovy/MapTest.groovy", [])
    }

    void "test src/test/groovy/MethodCallTest_groovy"() {
        unzipAndTest("src/test/groovy/MethodCallTest.groovy", [])
    }

    void "test src/test/groovy/MethodCallWithoutParenthesisTest_groovy"() {
        unzipAndTest("src/test/groovy/MethodCallWithoutParenthesisTest.groovy", [])
    }

    void "test src/test/groovy/MethodInBadPositionTest_groovy"() {
        unzipAndTest("src/test/groovy/MethodInBadPositionTest.groovy", [])
    }

    void "test src/test/groovy/MethodParameterAccessWithinClosureTest_groovy"() {
        unzipAndTest("src/test/groovy/MethodParameterAccessWithinClosureTest.groovy", [])
    }

    void "test src/test/groovy/MinMaxTest_groovy"() {
        unzipAndTest("src/test/groovy/MinMaxTest.groovy", [])
    }

    void "test src/test/groovy/MinusEqualsTest_groovy"() {
        unzipAndTest("src/test/groovy/MinusEqualsTest.groovy", [])
    }

    void "test src/test/groovy/ModifiersTest_groovy"() {
        unzipAndTest("src/test/groovy/ModifiersTest.groovy", [])
    }

    void "test src/test/groovy/ModuloTest_groovy"() {
        unzipAndTest("src/test/groovy/ModuloTest.groovy", [])
    }

    void "test src/test/groovy/MultiCatchTest_groovy"() {
        unzipAndTest("src/test/groovy/MultiCatchTest.groovy", [])
    }

    void "test src/test/groovy/MultiDimArraysTest_groovy"() {
        unzipAndTest("src/test/groovy/MultiDimArraysTest.groovy", [])
    }

    void "test src/test/groovy/MultilineChainExpressionTest_groovy"() {
        unzipAndTest("src/test/groovy/MultilineChainExpressionTest.groovy", [])
    }

    void "test src/test/groovy/MultilineStringTest_groovy"() {
        unzipAndTest("src/test/groovy/MultilineStringTest.groovy", [])
    }

    void "test src/test/groovy/MultiplyDivideEqualsTest_groovy"() {
        unzipAndTest("src/test/groovy/MultiplyDivideEqualsTest.groovy", [])
    }

    void "test src/test/groovy/NamedParameterTest_groovy"() {
        unzipAndTest("src/test/groovy/NamedParameterTest.groovy", [])
    }

    void "test src/test/groovy/NestedClassTest_groovy"() {
        unzipAndTest("src/test/groovy/NestedClassTest.groovy", [])
    }

    void "test src/test/groovy/NewExpressionTest_groovy"() {
        unzipAndTest("src/test/groovy/NewExpressionTest.groovy", [])
    }

    void "test src/test/groovy/NoPackageTest_groovy"() {
        unzipAndTest("src/test/groovy/NoPackageTest.groovy", [])
    }

    void "test src/test/groovy/NullPropertyTest_groovy"() {
        unzipAndTest("src/test/groovy/NullPropertyTest.groovy", [])
    }

    void "test src/test/groovy/OptionalReturnTest_groovy"() {
        unzipAndTest("src/test/groovy/OptionalReturnTest.groovy", [])
    }

    void "test src/test/groovy/OverloadInvokeMethodTest_groovy"() {
        unzipAndTest("src/test/groovy/OverloadInvokeMethodTest.groovy", [])
    }

    void "test src/test/groovy/OverridePropertyGetterTest_groovy"() {
        unzipAndTest("src/test/groovy/OverridePropertyGetterTest.groovy", [])
    }

    void "test src/test/groovy/OverrideTest_groovy"() {
        unzipAndTest("src/test/groovy/OverrideTest.groovy", [])
    }

    void "test src/test/groovy/PlusEqualsTest_groovy"() {
        unzipAndTest("src/test/groovy/PlusEqualsTest.groovy", [])
    }

    void "test src/test/groovy/PostfixTest_groovy"() {
        unzipAndTest("src/test/groovy/PostfixTest.groovy", [])
    }

    void "test src/test/groovy/PrefixTest_groovy"() {
        unzipAndTest("src/test/groovy/PrefixTest.groovy", [])
    }

    void "test src/test/groovy/PrimitiveArraysTest_groovy"() {
        unzipAndTest("src/test/groovy/PrimitiveArraysTest.groovy", [])
    }

    void "test src/test/groovy/PrimitiveDefaultValueTest_groovy"() {
        unzipAndTest("src/test/groovy/PrimitiveDefaultValueTest.groovy", [])
    }

    void "test src/test/groovy/PrimitiveTypeFieldTest_groovy"() {
        unzipAndTest("src/test/groovy/PrimitiveTypeFieldTest.groovy", [])
    }

    void "test src/test/groovy/PrimitiveTypesTest_groovy"() {
        unzipAndTest("src/test/groovy/PrimitiveTypesTest.groovy", [])
    }

    void "test src/test/groovy/PrintTest_groovy"() {
        unzipAndTest("src/test/groovy/PrintTest.groovy", [])
    }

    void "test src/test/groovy/PrivateVariableAccessFromAnotherInstanceTest_groovy"() {
        unzipAndTest("src/test/groovy/PrivateVariableAccessFromAnotherInstanceTest.groovy", [])
    }

    void "test src/test/groovy/ProcessTest_groovy"() {
        unzipAndTest("src/test/groovy/ProcessTest.groovy", [])
    }

    void "test src/test/groovy/Property2Test_groovy"() {
        unzipAndTest("src/test/groovy/Property2Test.groovy", [])
    }

    void "test src/test/groovy/PropertyTest_groovy"() {
        unzipAndTest("src/test/groovy/PropertyTest.groovy", [])
    }

    void "test src/test/groovy/PropertyWithoutDotTest_groovy"() {
        unzipAndTest("src/test/groovy/PropertyWithoutDotTest.groovy", [])
    }

    void "test src/test/groovy/RangeTest_groovy"() {
        unzipAndTest("src/test/groovy/RangeTest.groovy", [])
    }

    void "test src/test/groovy/ReadLineTest_groovy"() {
        unzipAndTest("src/test/groovy/ReadLineTest.groovy", [])
    }

    void "test src/test/groovy/RegularExpressionsTest_groovy"() {
        unzipAndTest("src/test/groovy/RegularExpressionsTest.groovy", [])
    }

    void "test src/test/groovy/ReturnTest_groovy"() {
        unzipAndTest("src/test/groovy/ReturnTest.groovy", [])
    }

    void "test src/test/groovy/SafeNavigationTest_groovy"() {
        unzipAndTest("src/test/groovy/SafeNavigationTest.groovy", [])
    }

    void "test src/test/groovy/SampleMain_groovy"() {
        unzipAndTest("src/test/groovy/SampleMain.groovy", [])
    }

    void "test src/test/groovy/SerializeTest_groovy"() {
        unzipAndTest("src/test/groovy/SerializeTest.groovy", [])
    }

    void "test src/test/groovy/SetTest_groovy"() {
        unzipAndTest("src/test/groovy/SetTest.groovy", [])
    }

    void "test src/test/groovy/ShellTest_groovy"() {
        unzipAndTest("src/test/groovy/ShellTest.groovy", [])
    }

    void "test src/test/groovy/SimplePostfixTest_groovy"() {
        unzipAndTest("src/test/groovy/SimplePostfixTest.groovy", [])
    }

    void "test src/test/groovy/SingletonBugTest_groovy"() {
        unzipAndTest("src/test/groovy/SingletonBugTest.groovy", [])
    }

    void "test src/test/groovy/SliceTest_groovy"() {
        unzipAndTest("src/test/groovy/SliceTest.groovy", [])
    }

    void "test src/test/groovy/SocketTest_groovy"() {
        unzipAndTest("src/test/groovy/SocketTest.groovy", [])
    }

    void "test src/test/groovy/SortTest_groovy"() {
        unzipAndTest("src/test/groovy/SortTest.groovy", [])
    }

    void "test src/test/groovy/SpreadDotTest_groovy"() {
        unzipAndTest("src/test/groovy/SpreadDotTest.groovy", [])
    }

    void "test src/test/groovy/SqlDateTest_groovy"() {
        unzipAndTest("src/test/groovy/SqlDateTest.groovy", [])
    }

    void "test src/test/groovy/StackTraceTest_groovy"() {
        unzipAndTest("src/test/groovy/StackTraceTest.groovy", [])
    }

    void "test src/test/groovy/StaticImportTarget_groovy"() {
        unzipAndTest("src/test/groovy/StaticImportTarget.groovy", [])
    }

    void "test src/test/groovy/StaticImportTest_groovy"() {
        unzipAndTest("src/test/groovy/StaticImportTest.groovy", [])
    }

    void "test src/test/groovy/StaticMessageTest_groovy"() {
        unzipAndTest("src/test/groovy/StaticMessageTest.groovy", [])
    }

    void "test src/test/groovy/StaticThisTest_groovy"() {
        unzipAndTest("src/test/groovy/StaticThisTest.groovy", [])
    }

    void "test src/test/groovy/StringBufferTest_groovy"() {
        unzipAndTest("src/test/groovy/StringBufferTest.groovy", [])
    }

    void "test src/test/groovy/StringTest_groovy"() {
        unzipAndTest("src/test/groovy/StringTest.groovy", [])
    }

    void "test src/test/groovy/SubscriptTest_groovy"() {
        unzipAndTest("src/test/groovy/SubscriptTest.groovy", [])
    }

    void "test src/test/groovy/SwitchTest_groovy"() {
        unzipAndTest("src/test/groovy/SwitchTest.groovy", [])
    }

    void "test src/test/groovy/SwitchWithDifferentTypesTest_groovy"() {
        unzipAndTest("src/test/groovy/SwitchWithDifferentTypesTest.groovy", [])
    }

    void "test src/test/groovy/TextPropertyTest_groovy"() {
        unzipAndTest("src/test/groovy/TextPropertyTest.groovy", [])
    }

    void "test src/test/groovy/ThisAndSuperTest_groovy"() {
        unzipAndTest("src/test/groovy/ThisAndSuperTest.groovy", [])
    }

    void "test src/test/groovy/ThreadMethodsTest_groovy"() {
        unzipAndTest("src/test/groovy/ThreadMethodsTest.groovy", [])
    }

    void "test src/test/groovy/ThrowTest_groovy"() {
        unzipAndTest("src/test/groovy/ThrowTest.groovy", [])
    }

    void "test src/test/groovy/ToArrayBugTest_groovy"() {
        unzipAndTest("src/test/groovy/ToArrayBugTest.groovy", [])
    }

    void "test src/test/groovy/TripleQuotedStringTest_groovy"() {
        unzipAndTest("src/test/groovy/TripleQuotedStringTest.groovy", [])
    }

    void "test src/test/groovy/TryCatchTest_groovy"() {
        unzipAndTest("src/test/groovy/TryCatchTest.groovy", [])
    }

    void "test src/test/groovy/TypesafeMethodTest_groovy"() {
        unzipAndTest("src/test/groovy/TypesafeMethodTest.groovy", [])
    }

    void "test src/test/groovy/UniqueOnCollectionTest_groovy"() {
        unzipAndTest("src/test/groovy/UniqueOnCollectionTest.groovy", [])
    }

    void "test src/test/groovy/UniqueOnCollectionWithClosureTest_groovy"() {
        unzipAndTest("src/test/groovy/UniqueOnCollectionWithClosureTest.groovy", [])
    }

    void "test src/test/groovy/UniqueOnCollectionWithComparatorTest_groovy"() {
        unzipAndTest("src/test/groovy/UniqueOnCollectionWithComparatorTest.groovy", [])
    }

    void "test src/test/groovy/UnitTestAsScriptTest_groovy"() {
        unzipAndTest("src/test/groovy/UnitTestAsScriptTest.groovy", [])
    }

    void "test src/test/groovy/UnsafeNavigationTest_groovy"() {
        unzipAndTest("src/test/groovy/UnsafeNavigationTest.groovy", [])
    }

    void "test src/test/groovy/VArgsTest_groovy"() {
        unzipAndTest("src/test/groovy/VArgsTest.groovy", [])
    }

    void "test src/test/groovy/ValidNameTest_groovy"() {
        unzipAndTest("src/test/groovy/ValidNameTest.groovy", [])
    }

    void "test src/test/groovy/VarargsMethodTest_groovy"() {
        unzipAndTest("src/test/groovy/VarargsMethodTest.groovy", [])
    }

    void "test src/test/groovy/VerbatimGStringTest_groovy"() {
        unzipAndTest("src/test/groovy/VerbatimGStringTest.groovy", [])
    }

    void "test src/test/groovy/WhileLoopTest_groovy"() {
        unzipAndTest("src/test/groovy/WhileLoopTest.groovy", [])
    }

    void "test src/test/groovy/annotations/MyClass_groovy"() {
        unzipAndTest("src/test/groovy/annotations/MyClass.groovy", [])
    }

    void "test src/test/groovy/annotations/MyIntegerAnno_groovy"() {
        unzipAndTest("src/test/groovy/annotations/MyIntegerAnno.groovy", [])
    }

    void "test src/test/groovy/annotations/PackageAndImportAnnotationTest_groovy"() {
        unzipAndTest("src/test/groovy/annotations/PackageAndImportAnnotationTest.groovy", [])
    }

    void "test src/test/groovy/annotations/ParameterAnnotationTest_groovy"() {
        unzipAndTest("src/test/groovy/annotations/ParameterAnnotationTest.groovy", [])
    }

    void "test src/test/groovy/annotations/package-info_groovy"() {
        unzipAndTest("src/test/groovy/annotations/package-info.groovy", [])
    }

    void "test src/test/groovy/beans/BindableTest_groovy"() {
        unzipAndTest("src/test/groovy/beans/BindableTest.groovy", [])
    }

    void "test src/test/groovy/beans/ListenerListASTTest_groovy"() {
        unzipAndTest("src/test/groovy/beans/ListenerListASTTest.groovy", [])
    }

    void "test src/test/groovy/beans/ListenerListHelper_groovy"() {
        unzipAndTest("src/test/groovy/beans/ListenerListHelper.groovy", [])
    }

    void "test src/test/groovy/beans/VetoableTest_groovy"() {
        unzipAndTest("src/test/groovy/beans/VetoableTest.groovy", [])
    }

    void "test src/test/groovy/benchmarks/createLoop_groovy"() {
        unzipAndTest("src/test/groovy/benchmarks/createLoop.groovy", [])
    }

    void "test src/test/groovy/benchmarks/loop_groovy"() {
        unzipAndTest("src/test/groovy/benchmarks/loop.groovy", [])
    }

    void "test src/test/groovy/benchmarks/loop2_groovy"() {
        unzipAndTest("src/test/groovy/benchmarks/loop2.groovy", [])
    }

    void "test src/test/groovy/bugs/AmbiguousListOrMethodTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/AmbiguousListOrMethodTest.groovy", [])
    }

    void "test src/test/groovy/bugs/ArrayMethodCallBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ArrayMethodCallBug.groovy", [])
    }

    void "test src/test/groovy/bugs/AsBoolBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/AsBoolBug.groovy", [])
    }

    void "test src/test/groovy/bugs/AssignmentInsideExpressionBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/AssignmentInsideExpressionBug.groovy", [])
    }

    void "test src/test/groovy/bugs/AttributeSetExpressionBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/AttributeSetExpressionBug.groovy", [])
    }

    void "test src/test/groovy/bugs/AutoboxingOfComparisonsBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/AutoboxingOfComparisonsBug.groovy", [])
    }

    void "test src/test/groovy/bugs/BadLineNumberOnExceptionBugTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/BadLineNumberOnExceptionBugTest.groovy", [])
    }

    void "test src/test/groovy/bugs/BadScriptNameBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/BadScriptNameBug.groovy", [])
    }

    void "test src/test/groovy/bugs/BenchmarkBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/BenchmarkBug.groovy", [])
    }

    void "test src/test/groovy/bugs/BlockAsClosureBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/BlockAsClosureBug.groovy", [])
    }

    void "test src/test/groovy/bugs/BooleanBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/BooleanBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ByteIndexBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ByteIndexBug.groovy", [])
    }

    void "test src/test/groovy/bugs/Bytecode2Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Bytecode2Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Bytecode3Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Bytecode3Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Bytecode4Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Bytecode4Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Bytecode5Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Bytecode5Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Bytecode6Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Bytecode6Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Bytecode7Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Bytecode7Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/BytecodeBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/BytecodeBug.groovy", [])
    }

    void "test src/test/groovy/bugs/CallingClosuresWithClosuresBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/CallingClosuresWithClosuresBug.groovy", [])
    }

    void "test src/test/groovy/bugs/CastWhenUsingClosuresBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/CastWhenUsingClosuresBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ChristofsPropertyBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ChristofsPropertyBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ClassGeneratorFixesTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ClassGeneratorFixesTest.groovy", [])
    }

    void "test src/test/groovy/bugs/ClassInNamedParamsBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ClassInNamedParamsBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ClosureInClosureBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ClosureInClosureBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ClosureParameterPassingBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ClosureParameterPassingBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ClosureTypedVariableBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ClosureTypedVariableBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ClosureVariableBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ClosureVariableBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ClosureWithBitwiseDefaultParamTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ClosureWithBitwiseDefaultParamTest.groovy", [])
    }

    void "test src/test/groovy/bugs/ClosureWithStaticVariablesBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ClosureWithStaticVariablesBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ConstructorBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ConstructorBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ConstructorParameterBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ConstructorParameterBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ConstructorThisCallBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ConstructorThisCallBug.groovy", [])
    }

    void "test src/test/groovy/bugs/CustomMetaClassTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/CustomMetaClassTest.groovy", [])
    }

    void "test src/test/groovy/bugs/DefVariableBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/DefVariableBug.groovy", [])
    }

    void "test src/test/groovy/bugs/DirectMethodCallWithVargsTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/DirectMethodCallWithVargsTest.groovy", [])
    }

    void "test src/test/groovy/bugs/DoubleSizeParametersBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/DoubleSizeParametersBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ForLoopBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ForLoopBug.groovy", [])
    }

    void "test src/test/groovy/bugs/FullyQualifiedClassBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/FullyQualifiedClassBug.groovy", [])
    }

    void "test src/test/groovy/bugs/FullyQualifiedMethodReturnTypeBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/FullyQualifiedMethodReturnTypeBug.groovy", [])
    }

    void "test src/test/groovy/bugs/FullyQualifiedVariableTypeBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/FullyQualifiedVariableTypeBug.groovy", [])
    }

    void "test src/test/groovy/bugs/GROOVY3934Helper_groovy"() {
        unzipAndTest("src/test/groovy/bugs/GROOVY3934Helper.groovy", [])
    }

    void "test src/test/groovy/bugs/GetterBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/GetterBug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy1018_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy1018_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy1059_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy1059_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy1081_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy1081_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy1407_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy1407_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy1462_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy1462_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy1465Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy1465Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy1593_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy1593.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy1617_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy1617_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy1706_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy1706_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy1759_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy1759_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2271Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2271Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2339Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2339Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2348Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2348Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2350Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2350Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2351Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2351Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2365Base_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2365Base.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2391Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2391Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy239_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy239_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2432Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2432Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2490Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2490Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy252_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy252_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2549Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2549Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2556Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2556Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2557Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2557Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2558Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2558Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2666Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2666Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2706Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2706Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy278_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy278_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2801Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2801Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2816Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2816Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2849Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2849Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2949Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2949Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy2951Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy2951Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3069Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3069Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy308_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy308_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3135Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3135Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3139Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3139Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3156And2621Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3156And2621Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3163Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3163Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3175_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3175_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3205Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3205Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3208Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3208Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3235Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3235Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3238Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3238Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy325_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy325_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3304Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3304Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3305Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3305Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3311Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3311Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3335Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3335Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3339Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3339Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3383Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3383Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3389Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3389Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3403Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3403Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3405Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3405Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3410Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3410Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3424Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3424Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3426Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3426Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3462Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3462Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3464Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3464Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3465Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3465Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3465Helper_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3465Helper.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3498Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3498Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3509Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3509Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3511Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3511Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3519Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3519Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3560Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3560Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3574Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3574Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3590Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3590Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3596Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3596Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3645Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3645Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3658Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3658Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3679Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3679Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3716Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3716Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3718Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3718Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3719Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3719Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3719Bug_script_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3719Bug_script.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3720Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3720Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3721Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3721Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3723Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3723Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3726Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3726Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3731Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3731Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3749Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3749Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3768Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3768Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3770Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3770Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3776Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3776Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3784Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3784Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3789Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3789Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3799Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3799Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3801Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3801Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3817Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3817Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3818Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3818Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3827Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3827Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3830Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3830Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3831Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3831Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3834Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3834Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3839Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3839Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3852Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3852Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3857Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3857Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3863Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3863Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3868Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3868Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3871Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3871Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3873Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3873Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3876Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3876Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3894Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3894Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy389_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy389_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3904Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3904Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3948Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3948Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3949Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3949Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy3989Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy3989Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4006Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4006Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4009Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4009Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4025Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4025Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4029Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4029Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4035Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4035Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4038Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4038Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4043Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4043Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4046Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4046Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4069Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4069Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4075Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4075Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4078Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4078Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4080Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4080Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4081Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4081Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4098Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4098Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4098Child_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4098Child.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4098Parent_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4098Parent.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4104Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4104Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4106Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4106Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4107Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4107Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4111Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4111Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4116Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4116Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4119Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4119Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4120Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4120Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4121Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4121Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4129Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4129Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4131Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4131Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4133Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4133Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4134Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4134Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4139Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4139Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4145_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4145.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4151Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4151Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4169Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4169Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4170Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4170Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4188Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4188Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4190Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4190Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4191Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4191Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4193Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4193Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4202Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4202Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4206Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4206Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4235Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4235Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4241Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4241Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4243Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4243Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4246Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4246Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4247Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4247Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4252Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4252Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4257Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4257Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4264Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4264Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4272Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4272Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4273Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4273Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4293Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4293Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4325Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4325Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4356Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4356Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4386_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4386_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4393Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4393Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4410Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4410Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4414Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4414Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4415Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4415Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4416Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4416Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4418Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4418Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4435Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4435Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4449Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4449Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4457GenericTypeDeclarationLeakTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4457GenericTypeDeclarationLeakTest.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4471Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4471Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4480Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4480Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4497Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4497Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4516Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4516Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4584Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4584Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4607Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4607Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4614Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4614Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4720Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4720Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4857Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4857Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4861Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4861Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4922Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4922Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4958Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4958Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4966Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4966Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4967Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4967Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4973Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4973Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4980Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4980Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4986Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4986Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4989Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4989Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy4999Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy4999Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5025Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5025Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5030Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5030Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5033Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5033Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5056Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5056Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5061_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5061.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5101Test_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5101Test.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5109Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5109Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5122Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5122Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5137Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5137Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy513_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy513_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5150Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5150Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5152Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5152Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5185Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5185Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5193Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5193Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5210Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5210Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5212Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5212Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5259Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5259Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5260Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5260Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5267Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5267Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5272Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5272Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5285Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5285Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5396Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5396Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5418Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5418Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5425_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5425_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5572Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5572Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy558_616_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy558_616_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5687Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5687Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5783Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5783Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5802Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5802Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5806Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5806Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy5915Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy5915Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy596_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy596_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6041Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6041Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6042Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6042Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6045Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6045Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6072Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6072Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6086Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6086Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6374Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6374Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6396Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6396Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6508Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6508Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6522Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6522Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy662Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy662Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy666_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy666_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6722Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6722Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy674_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy674_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6755Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6755Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy675_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy675_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6764Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6764Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6786Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6786Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6804Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6804Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6808Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6808Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6811Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6811Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6821Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6821Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6830Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6830Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6841Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6841Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy6932Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy6932Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7081Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7081Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7520Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7520Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7620Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7620Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7709Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7709Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy770_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy770_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy779_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy779_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7876Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7876Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7912Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7912Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7916Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7916Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7917Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7917Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7920Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7920Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7921Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7921Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7922Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7922Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7924Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7924Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7925Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7925Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7937Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7937Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy7938Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy7938Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy831_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy831_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy872Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy872Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy965_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy965_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/Groovy996_Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/Groovy996_Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/GroovyInnerEnumBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/GroovyInnerEnumBug.groovy", [])
    }

    void "test src/test/groovy/bugs/GuillaumesBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/GuillaumesBug.groovy", [])
    }

    void "test src/test/groovy/bugs/GuillaumesMapBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/GuillaumesMapBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ImportNodeLineNumberTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ImportNodeLineNumberTest.groovy", [])
    }

    void "test src/test/groovy/bugs/InconsistentStackHeightBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/InconsistentStackHeightBug.groovy", [])
    }

    void "test src/test/groovy/bugs/InterfaceImplBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/InterfaceImplBug.groovy", [])
    }

    void "test src/test/groovy/bugs/InvokeNormalMethodFromBuilder_Groovy657Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/InvokeNormalMethodFromBuilder_Groovy657Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/IterateOverCustomTypeBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/IterateOverCustomTypeBug.groovy", [])
    }

    void "test src/test/groovy/bugs/MarkupAndMethodBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/MarkupAndMethodBug.groovy", [])
    }

    void "test src/test/groovy/bugs/MetaClassCachingBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/MetaClassCachingBug.groovy", [])
    }

    void "test src/test/groovy/bugs/MethodCallWithoutParensInStaticMethodBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/MethodCallWithoutParensInStaticMethodBug.groovy", [])
    }

    void "test src/test/groovy/bugs/MethodClosureTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/MethodClosureTest.groovy", [])
    }

    void "test src/test/groovy/bugs/MethodDispatchBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/MethodDispatchBug.groovy", [])
    }

    void "test src/test/groovy/bugs/MethodPointerBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/MethodPointerBug.groovy", [])
    }

    void "test src/test/groovy/bugs/MorgansBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/MorgansBug.groovy", [])
    }

    void "test src/test/groovy/bugs/MyConstantsASTTransformation4272_groovy"() {
        unzipAndTest("src/test/groovy/bugs/MyConstantsASTTransformation4272.groovy", [])
    }

    void "test src/test/groovy/bugs/NestedClosure2Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/NestedClosure2Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/NestedClosureBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/NestedClosureBug.groovy", [])
    }

    void "test src/test/groovy/bugs/NullAsBooleanCoercionTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/NullAsBooleanCoercionTest.groovy", [])
    }

    void "test src/test/groovy/bugs/NullCompareBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/NullCompareBug.groovy", [])
    }

    void "test src/test/groovy/bugs/OverloadInvokeMethodBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/OverloadInvokeMethodBug.groovy", [])
    }

    void "test src/test/groovy/bugs/POJOCallSiteBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/POJOCallSiteBug.groovy", [])
    }

    void "test src/test/groovy/bugs/PrimitivePropertyBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/PrimitivePropertyBug.groovy", [])
    }

    void "test src/test/groovy/bugs/PrintlnWithNewBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/PrintlnWithNewBug.groovy", [])
    }

    void "test src/test/groovy/bugs/PropertyNameBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/PropertyNameBug.groovy", [])
    }

    void "test src/test/groovy/bugs/RodsBooleanBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/RodsBooleanBug.groovy", [])
    }

    void "test src/test/groovy/bugs/RodsBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/RodsBug.groovy", [])
    }

    void "test src/test/groovy/bugs/RussellsOptionalParenTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/RussellsOptionalParenTest.groovy", [])
    }

    void "test src/test/groovy/bugs/SingleEvalTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/SingleEvalTest.groovy", [])
    }

    void "test src/test/groovy/bugs/StaticClosurePropertyBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/StaticClosurePropertyBug.groovy", [])
    }

    void "test src/test/groovy/bugs/StaticMethodCallBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/StaticMethodCallBug.groovy", [])
    }

    void "test src/test/groovy/bugs/StaticMethodImportBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/StaticMethodImportBug.groovy", [])
    }

    void "test src/test/groovy/bugs/StaticMethodImportGroovy935Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/StaticMethodImportGroovy935Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/StaticPropertyBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/StaticPropertyBug.groovy", [])
    }

    void "test src/test/groovy/bugs/SubscriptAndExpressionBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/SubscriptAndExpressionBug.groovy", [])
    }

    void "test src/test/groovy/bugs/SubscriptOnPrimitiveTypeArrayBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/SubscriptOnPrimitiveTypeArrayBug.groovy", [])
    }

    void "test src/test/groovy/bugs/SubscriptOnStringArrayBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/SubscriptOnStringArrayBug.groovy", [])
    }

    void "test src/test/groovy/bugs/SuperMethod2Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/SuperMethod2Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/SuperMethodBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/SuperMethodBug.groovy", [])
    }

    void "test src/test/groovy/bugs/SynchronizedBytecodeBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/SynchronizedBytecodeBug.groovy", [])
    }

    void "test src/test/groovy/bugs/TernaryOperatorTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/TernaryOperatorTest.groovy", [])
    }

    void "test src/test/groovy/bugs/TestBase_groovy"() {
        unzipAndTest("src/test/groovy/bugs/TestBase.groovy", [])
    }

    void "test src/test/groovy/bugs/TestCaseBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/TestCaseBug.groovy", [])
    }

    void "test src/test/groovy/bugs/TestDerived_groovy"() {
        unzipAndTest("src/test/groovy/bugs/TestDerived.groovy", [])
    }

    void "test src/test/groovy/bugs/ToStringBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ToStringBug.groovy", [])
    }

    void "test src/test/groovy/bugs/TryCatch2Bug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/TryCatch2Bug.groovy", [])
    }

    void "test src/test/groovy/bugs/TryCatchBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/TryCatchBug.groovy", [])
    }

    void "test src/test/groovy/bugs/UnknownVariableBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/UnknownVariableBug.groovy", [])
    }

    void "test src/test/groovy/bugs/UseClosureInClosureBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/UseClosureInClosureBug.groovy", [])
    }

    void "test src/test/groovy/bugs/UseStaticInClosureBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/UseStaticInClosureBug.groovy", [])
    }

    void "test src/test/groovy/bugs/VariablePrecedence_groovy"() {
        unzipAndTest("src/test/groovy/bugs/VariablePrecedence.groovy", [])
    }

    void "test src/test/groovy/bugs/VariablePrecedenceTest_groovy"() {
        unzipAndTest("src/test/groovy/bugs/VariablePrecedenceTest.groovy", [])
    }

    void "test src/test/groovy/bugs/VariableScopingBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/VariableScopingBug.groovy", [])
    }

    void "test src/test/groovy/bugs/VerifyErrorBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/VerifyErrorBug.groovy", [])
    }

    void "test src/test/groovy/bugs/WriteOnlyPropertyBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/WriteOnlyPropertyBug.groovy", [])
    }

    void "test src/test/groovy/bugs/ZoharsBug_groovy"() {
        unzipAndTest("src/test/groovy/bugs/ZoharsBug.groovy", [])
    }

    void "test src/test/groovy/bugs/bug1567_script_groovy"() {
        unzipAndTest("src/test/groovy/bugs/bug1567_script.groovy", [])
    }

    void "test src/test/groovy/execute/ExecuteTest_groovy"() {
        unzipAndTest("src/test/groovy/execute/ExecuteTest.groovy", [])
    }

    void "test src/test/groovy/execute/ExecuteTest_LinuxSolaris_groovy"() {
        unzipAndTest("src/test/groovy/execute/ExecuteTest_LinuxSolaris.groovy", [])
    }

    void "test src/test/groovy/execute/ExecuteTest_Windows_groovy"() {
        unzipAndTest("src/test/groovy/execute/ExecuteTest_Windows.groovy", [])
    }

    void "test src/test/groovy/gpath/GPathTest_groovy"() {
        unzipAndTest("src/test/groovy/gpath/GPathTest.groovy", [])
    }

    void "test src/test/groovy/gpath/NodeGPathTest_groovy"() {
        unzipAndTest("src/test/groovy/gpath/NodeGPathTest.groovy", [])
    }

    void "test src/test/groovy/grape/GrabErrorIsolationTest_groovy"() {
        unzipAndTest("src/test/groovy/grape/GrabErrorIsolationTest.groovy", [])
    }

    void "test src/test/groovy/grape/GrabExcludeTest_groovy"() {
        unzipAndTest("src/test/groovy/grape/GrabExcludeTest.groovy", [])
    }

    void "test src/test/groovy/grape/GrabResolverTest_groovy"() {
        unzipAndTest("src/test/groovy/grape/GrabResolverTest.groovy", [])
    }

    void "test src/test/groovy/grape/GrapeClassLoaderTest_groovy"() {
        unzipAndTest("src/test/groovy/grape/GrapeClassLoaderTest.groovy", [])
    }

    void "test src/test/groovy/grape/GrapeIvyTest_groovy"() {
        unzipAndTest("src/test/groovy/grape/GrapeIvyTest.groovy", [])
    }

    void "test src/test/groovy/io/LineColumnReaderTest_groovy"() {
        unzipAndTest("src/test/groovy/io/LineColumnReaderTest.groovy", [])
    }

    void "test src/test/groovy/lang/BenchmarkInterceptorTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/BenchmarkInterceptorTest.groovy", [])
    }

    void "test src/test/groovy/lang/CategoryAnnotationTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/CategoryAnnotationTest.groovy", [])
    }

    void "test src/test/groovy/lang/ClassReloadingTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/ClassReloadingTest.groovy", [])
    }

    void "test src/test/groovy/lang/ClosureResolvingTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/ClosureResolvingTest.groovy", [])
    }

    void "test src/test/groovy/lang/DelegatingMetaClassTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/DelegatingMetaClassTest.groovy", [])
    }

    void "test src/test/groovy/lang/ExceptionTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/ExceptionTest.groovy", [])
    }

    void "test src/test/groovy/lang/ExpandoMetaClassCreationHandleTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/ExpandoMetaClassCreationHandleTest.groovy", [])
    }

    void "test src/test/groovy/lang/ExpandoMetaClassTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/ExpandoMetaClassTest.groovy", [])
    }

    void "test src/test/groovy/lang/GetMethodsTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/GetMethodsTest.groovy", [])
    }

    void "test src/test/groovy/lang/Groovy3406Test_groovy"() {
        unzipAndTest("src/test/groovy/lang/Groovy3406Test.groovy", [])
    }

    void "test src/test/groovy/lang/GroovyClassLoaderTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/GroovyClassLoaderTest.groovy", [])
    }

    void "test src/test/groovy/lang/GroovyCodeSourceTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/GroovyCodeSourceTest.groovy", [])
    }

    void "test src/test/groovy/lang/GroovyShellTest2_groovy"() {
        unzipAndTest("src/test/groovy/lang/GroovyShellTest2.groovy", [])
    }

    void "test src/test/groovy/lang/GroovySystemTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/GroovySystemTest.groovy", [])
    }

    void "test src/test/groovy/lang/InnerClassResolvingTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/InnerClassResolvingTest.groovy", [])
    }

    void "test src/test/groovy/lang/IntRangeTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/IntRangeTest.groovy", [])
    }

    void "test src/test/groovy/lang/InterceptorTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/InterceptorTest.groovy", [])
    }

    void "test src/test/groovy/lang/MapOfClosureTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/MapOfClosureTest.groovy", [])
    }

    void "test src/test/groovy/lang/MetaClassPropertyTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/MetaClassPropertyTest.groovy", [])
    }

    void "test src/test/groovy/lang/MetaClassRegistryTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/MetaClassRegistryTest.groovy", [])
    }

    void "test src/test/groovy/lang/MethodMissingTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/MethodMissingTest.groovy", [])
    }

    void "test src/test/groovy/lang/MixinAnnotationTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/MixinAnnotationTest.groovy", [])
    }

    void "test src/test/groovy/lang/MixinTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/MixinTest.groovy", [])
    }

    void "test src/test/groovy/lang/PropertyMissingTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/PropertyMissingTest.groovy", [])
    }

    void "test src/test/groovy/lang/ReferenceSerializationTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/ReferenceSerializationTest.groovy", [])
    }

    void "test src/test/groovy/lang/RespondsToTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/RespondsToTest.groovy", [])
    }

    void "test src/test/groovy/lang/ScriptCacheTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/ScriptCacheTest.groovy", [])
    }

    void "test src/test/groovy/lang/ScriptSourcePositionInAstTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/ScriptSourcePositionInAstTest.groovy", [])
    }

    void "test src/test/groovy/lang/StringConcatTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/StringConcatTest.groovy", [])
    }

    void "test src/test/groovy/lang/StripMarginTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/StripMarginTest.groovy", [])
    }

    void "test src/test/groovy/lang/SyntheticReturnTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/SyntheticReturnTest.groovy", [])
    }

    void "test src/test/groovy/lang/WithMethodTest_groovy"() {
        unzipAndTest("src/test/groovy/lang/WithMethodTest.groovy", [])
    }

    void "test src/test/groovy/lang/gcldeadlock/DeadlockBugUtil_groovy"() {
        unzipAndTest("src/test/groovy/lang/gcldeadlock/DeadlockBugUtil.groovy", [])
    }

    void "test src/test/groovy/lang/gcldeadlock/script0_groovy"() {
        unzipAndTest("src/test/groovy/lang/gcldeadlock/script0.groovy", [])
    }

    void "test src/test/groovy/lang/gcldeadlock/script1_groovy"() {
        unzipAndTest("src/test/groovy/lang/gcldeadlock/script1.groovy", [])
    }

    void "test src/test/groovy/mock/example/CheeseSlicer_groovy"() {
        unzipAndTest("src/test/groovy/mock/example/CheeseSlicer.groovy", [])
    }

    void "test src/test/groovy/mock/example/SandwichMaker_groovy"() {
        unzipAndTest("src/test/groovy/mock/example/SandwichMaker.groovy", [])
    }

    void "test src/test/groovy/mock/example/SandwichMakerTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/example/SandwichMakerTest.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/Caller_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/Caller.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/Collaborator_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/Collaborator.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/HalfMockTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/HalfMockTest.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/MockCallSequenceTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/MockCallSequenceTest.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/MockForJavaTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/MockForJavaTest.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/MockNestedCallTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/MockNestedCallTest.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/MockSingleCallTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/MockSingleCallTest.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/MockWithZeroRangeTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/MockWithZeroRangeTest.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/StubCallSequenceTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/StubCallSequenceTest.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/StubForJavaTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/StubForJavaTest.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/StubSingleCallTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/StubSingleCallTest.groovy", [])
    }

    void "test src/test/groovy/mock/interceptor/StubTest_groovy"() {
        unzipAndTest("src/test/groovy/mock/interceptor/StubTest.groovy", [])
    }

    void "test src/test/groovy/operator/BigDecimalOperatorsTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/BigDecimalOperatorsTest.groovy", [])
    }

    void "test src/test/groovy/operator/BigIntegerOperationsTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/BigIntegerOperationsTest.groovy", [])
    }

    void "test src/test/groovy/operator/BitwiseOperatorsTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/BitwiseOperatorsTest.groovy", [])
    }

    void "test src/test/groovy/operator/BooleanOperationsTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/BooleanOperationsTest.groovy", [])
    }

    void "test src/test/groovy/operator/DoubleOperationTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/DoubleOperationTest.groovy", [])
    }

    void "test src/test/groovy/operator/IntegerOperatorsTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/IntegerOperatorsTest.groovy", [])
    }

    void "test src/test/groovy/operator/MyColor_groovy"() {
        unzipAndTest("src/test/groovy/operator/MyColor.groovy", [])
    }

    void "test src/test/groovy/operator/MyColorCategory_groovy"() {
        unzipAndTest("src/test/groovy/operator/MyColorCategory.groovy", [])
    }

    void "test src/test/groovy/operator/MyColorOperatorOverloadingTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/MyColorOperatorOverloadingTest.groovy", [])
    }

    void "test src/test/groovy/operator/NegateListsTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/NegateListsTest.groovy", [])
    }

    void "test src/test/groovy/operator/PowerOperatorsTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/PowerOperatorsTest.groovy", [])
    }

    void "test src/test/groovy/operator/SpreadListOperatorTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/SpreadListOperatorTest.groovy", [])
    }

    void "test src/test/groovy/operator/SpreadMapOperatorTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/SpreadMapOperatorTest.groovy", [])
    }

    void "test src/test/groovy/operator/StringOperatorsTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/StringOperatorsTest.groovy", [])
    }

    void "test src/test/groovy/operator/TernaryOperatorsTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/TernaryOperatorsTest.groovy", [])
    }

    void "test src/test/groovy/operator/UnaryMinusNumberTests_groovy"() {
        unzipAndTest("src/test/groovy/operator/UnaryMinusNumberTests.groovy", [])
    }

    void "test src/test/groovy/operator/UnaryMinusOperatorTest_groovy"() {
        unzipAndTest("src/test/groovy/operator/UnaryMinusOperatorTest.groovy", [])
    }

    void "test src/test/groovy/runtime/metaclass/groovy/bugs/CustomMetaClassTestMetaClass_groovy"() {
        unzipAndTest("src/test/groovy/runtime/metaclass/groovy/bugs/CustomMetaClassTestMetaClass.groovy", [])
    }

    void "test src/test/groovy/script/CallAnotherScript_groovy"() {
        unzipAndTest("src/test/groovy/script/CallAnotherScript.groovy", [])
    }

    void "test src/test/groovy/script/ClassWithScript_groovy"() {
        unzipAndTest("src/test/groovy/script/ClassWithScript.groovy", [])
    }

    void "test src/test/groovy/script/EvalInScript_groovy"() {
        unzipAndTest("src/test/groovy/script/EvalInScript.groovy", [])
    }

    void "test src/test/groovy/script/HelloWorld_groovy"() {
        unzipAndTest("src/test/groovy/script/HelloWorld.groovy", [])
    }

    void "test src/test/groovy/script/HelloWorld2_groovy"() {
        unzipAndTest("src/test/groovy/script/HelloWorld2.groovy", [])
    }

    void "test src/test/groovy/script/MethodTestScript_groovy"() {
        unzipAndTest("src/test/groovy/script/MethodTestScript.groovy", [])
    }

    void "test src/test/groovy/script/PackageScript_groovy"() {
        unzipAndTest("src/test/groovy/script/PackageScript.groovy", [])
    }

    void "test src/test/groovy/script/ScriptTest_groovy"() {
        unzipAndTest("src/test/groovy/script/ScriptTest.groovy", [])
    }

    void "test src/test/groovy/script/ScriptWithFunctions_groovy"() {
        unzipAndTest("src/test/groovy/script/ScriptWithFunctions.groovy", [])
    }

    void "test src/test/groovy/script/ShowArgs_groovy"() {
        unzipAndTest("src/test/groovy/script/ShowArgs.groovy", [])
    }

    void "test src/test/groovy/script/StreamClassloaderInScriptTest_groovy"() {
        unzipAndTest("src/test/groovy/script/StreamClassloaderInScriptTest.groovy", [])
    }

    void "test src/test/groovy/script/UseClosureInScript_groovy"() {
        unzipAndTest("src/test/groovy/script/UseClosureInScript.groovy", [])
    }

    void "test src/test/groovy/time/DurationTest_groovy"() {
        unzipAndTest("src/test/groovy/time/DurationTest.groovy", [])
    }

    void "test src/test/groovy/time/TimeCategoryTest_groovy"() {
        unzipAndTest("src/test/groovy/time/TimeCategoryTest.groovy", [])
    }

    void "test src/test/groovy/transform/AnnotationCollectorTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/AnnotationCollectorTest.groovy", [])
    }

    void "test src/test/groovy/transform/ConditionalInterruptTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/ConditionalInterruptTest.groovy", [])
    }

    void "test src/test/groovy/transform/LazyTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/LazyTest.groovy", [])
    }

    void "test src/test/groovy/transform/ReadWriteLockTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/ReadWriteLockTest.groovy", [])
    }

    void "test src/test/groovy/transform/ThreadInterruptTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/ThreadInterruptTest.groovy", [])
    }

    void "test src/test/groovy/transform/TimedInterruptTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/TimedInterruptTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/AnonymousInnerClassSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/AnonymousInnerClassSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/ArraysAndCollectionsSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/ArraysAndCollectionsSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/BugsSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/BugsSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/CategoriesSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/CategoriesSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/ClosureParamTypeInferenceSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/ClosureParamTypeInferenceSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/ClosureParamTypeResolverSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/ClosureParamTypeResolverSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/ClosuresSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/ClosuresSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/CoercionSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/CoercionSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/ConstructorsSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/ConstructorsSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/CustomErrorCollectorSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/CustomErrorCollectorSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/DefaultGroovyMethodsSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/DefaultGroovyMethodsSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/DelegatesToSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/DelegatesToSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/FieldsAndPropertiesSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/FieldsAndPropertiesSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/GenericsSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/GenericsSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/Groovy7184Bug_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/Groovy7184Bug.groovy", [])
    }

    void "test src/test/groovy/transform/stc/Groovy7542Bug_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/Groovy7542Bug.groovy", [])
    }

    void "test src/test/groovy/transform/stc/Groovy7774Bug_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/Groovy7774Bug.groovy", [])
    }

    void "test src/test/groovy/transform/stc/Groovy7880Bug_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/Groovy7880Bug.groovy", [])
    }

    void "test src/test/groovy/transform/stc/Groovy7888Bug_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/Groovy7888Bug.groovy", [])
    }

    void "test src/test/groovy/transform/stc/Groovy7907Bug_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/Groovy7907Bug.groovy", [])
    }

    void "test src/test/groovy/transform/stc/Groovy7907HelperPrecompiledGroovy_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/Groovy7907HelperPrecompiledGroovy.groovy", [])
    }

    void "test src/test/groovy/transform/stc/IOGMClosureParamTypeInferenceSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/IOGMClosureParamTypeInferenceSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/LoopsSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/LoopsSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/MethodCallsSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/MethodCallsSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/MiscSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/MiscSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/PrecompiledExtension_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/PrecompiledExtension.groovy", [])
    }

    void "test src/test/groovy/transform/stc/PrecompiledExtensionNotExtendingDSL_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/PrecompiledExtensionNotExtendingDSL.groovy", [])
    }

    void "test src/test/groovy/transform/stc/RangesSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/RangesSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/ResourceGMClosureParamTypeInferenceSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/ResourceGMClosureParamTypeInferenceSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/ReturnsSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/ReturnsSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/STCAssignmentTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/STCAssignmentTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/STCExtensionMethodsTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/STCExtensionMethodsTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/STCnAryExpressionTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/STCnAryExpressionTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/STCwithTransformationsTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/STCwithTransformationsTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/SocketGMClosureParamTypeInferenceSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/SocketGMClosureParamTypeInferenceSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/StaticTypeCheckingTestCase_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/StaticTypeCheckingTestCase.groovy", [])
    }

    void "test src/test/groovy/transform/stc/StringGMClosureParamTypeInferenceSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/StringGMClosureParamTypeInferenceSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/TernaryOperatorSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/TernaryOperatorSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/TypeCheckingExtensionsTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/TypeCheckingExtensionsTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/TypeCheckingModeTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/TypeCheckingModeTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/TypeInferenceSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/TypeInferenceSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/UnaryOperatorSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/UnaryOperatorSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/WithSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/WithSTCTest.groovy", [])
    }

    void "test src/test/groovy/transform/stc/vm6/MethodCallsSTCTest_groovy"() {
        unzipAndTest("src/test/groovy/transform/stc/vm6/MethodCallsSTCTest.groovy", [])
    }

    void "test src/test/groovy/tree/ClosureClassLoaderBug_groovy"() {
        unzipAndTest("src/test/groovy/tree/ClosureClassLoaderBug.groovy", [])
    }

    void "test src/test/groovy/tree/NavigationTest_groovy"() {
        unzipAndTest("src/test/groovy/tree/NavigationTest.groovy", [])
    }

    void "test src/test/groovy/tree/NestedClosureBugTest_groovy"() {
        unzipAndTest("src/test/groovy/tree/NestedClosureBugTest.groovy", [])
    }

    void "test src/test/groovy/tree/SmallTreeTest_groovy"() {
        unzipAndTest("src/test/groovy/tree/SmallTreeTest.groovy", [])
    }

    void "test src/test/groovy/tree/TreeTest_groovy"() {
        unzipAndTest("src/test/groovy/tree/TreeTest.groovy", [])
    }

    void "test src/test/groovy/tree/VerboseTreeTest_groovy"() {
        unzipAndTest("src/test/groovy/tree/VerboseTreeTest.groovy", [])
    }

    void "test src/test/groovy/txn/TransactionTest_groovy"() {
        unzipAndTest("src/test/groovy/txn/TransactionTest.groovy", [])
    }

    void "test src/test/groovy/ui/GroovyMainTest_groovy"() {
        unzipAndTest("src/test/groovy/ui/GroovyMainTest.groovy", [])
    }

    void "test src/test/groovy/util/BufferedIteratorTest_groovy"() {
        unzipAndTest("src/test/groovy/util/BufferedIteratorTest.groovy", [])
    }

    void "test src/test/groovy/util/BuilderSupportTest_groovy"() {
        unzipAndTest("src/test/groovy/util/BuilderSupportTest.groovy", [])
    }

    void "test src/test/groovy/util/CliBuilderTest_groovy"() {
        unzipAndTest("src/test/groovy/util/CliBuilderTest.groovy", [])
    }

    void "test src/test/groovy/util/ConfigObjectTest_groovy"() {
        unzipAndTest("src/test/groovy/util/ConfigObjectTest.groovy", [])
    }

    void "test src/test/groovy/util/ConfigSlurperTest_groovy"() {
        unzipAndTest("src/test/groovy/util/ConfigSlurperTest.groovy", [])
    }

    void "test src/test/groovy/util/DelegatingScriptTest_groovy"() {
        unzipAndTest("src/test/groovy/util/DelegatingScriptTest.groovy", [])
    }

    void "test src/test/groovy/util/FactoryBuilderSupportTest_groovy"() {
        unzipAndTest("src/test/groovy/util/FactoryBuilderSupportTest.groovy", [])
    }

    void "test src/test/groovy/util/FileTreeBuilderTest_groovy"() {
        unzipAndTest("src/test/groovy/util/FileTreeBuilderTest.groovy", [])
    }

    void "test src/test/groovy/util/GroovyCollectionsStarImportTest_groovy"() {
        unzipAndTest("src/test/groovy/util/GroovyCollectionsStarImportTest.groovy", [])
    }

    void "test src/test/groovy/util/GroovyCollectionsTest_groovy"() {
        unzipAndTest("src/test/groovy/util/GroovyCollectionsTest.groovy", [])
    }

    void "test src/test/groovy/util/GroovyScriptEngineReloadingTest_groovy"() {
        unzipAndTest("src/test/groovy/util/GroovyScriptEngineReloadingTest.groovy", [])
    }

    void "test src/test/groovy/util/GroovyScriptEngineTest_groovy"() {
        unzipAndTest("src/test/groovy/util/GroovyScriptEngineTest.groovy", [])
    }

    void "test src/test/groovy/util/HeadlessTestSupport_groovy"() {
        unzipAndTest("src/test/groovy/util/HeadlessTestSupport.groovy", [])
    }

    void "test src/test/groovy/util/IndentPrinterTest_groovy"() {
        unzipAndTest("src/test/groovy/util/IndentPrinterTest.groovy", [])
    }

    void "test src/test/groovy/util/JavadocAssertionTestBuilderTest_groovy"() {
        unzipAndTest("src/test/groovy/util/JavadocAssertionTestBuilderTest.groovy", [])
    }

    void "test src/test/groovy/util/MiscScriptTest_groovy"() {
        unzipAndTest("src/test/groovy/util/MiscScriptTest.groovy", [])
    }

    void "test src/test/groovy/util/NodeTest_groovy"() {
        unzipAndTest("src/test/groovy/util/NodeTest.groovy", [])
    }

    void "test src/test/groovy/util/ObjectGraphBuilderTest_groovy"() {
        unzipAndTest("src/test/groovy/util/ObjectGraphBuilderTest.groovy", [])
    }

    void "test src/test/groovy/util/ObservableListTest_groovy"() {
        unzipAndTest("src/test/groovy/util/ObservableListTest.groovy", [])
    }

    void "test src/test/groovy/util/ObservableMapTest_groovy"() {
        unzipAndTest("src/test/groovy/util/ObservableMapTest.groovy", [])
    }

    void "test src/test/groovy/util/ObservableSetTests_groovy"() {
        unzipAndTest("src/test/groovy/util/ObservableSetTests.groovy", [])
    }

    void "test src/test/groovy/util/OrderByTest_groovy"() {
        unzipAndTest("src/test/groovy/util/OrderByTest.groovy", [])
    }

    void "test src/test/groovy/util/ProxyGeneratorAdapterTest_groovy"() {
        unzipAndTest("src/test/groovy/util/ProxyGeneratorAdapterTest.groovy", [])
    }

    void "test src/test/groovy/util/ProxyGeneratorTest_groovy"() {
        unzipAndTest("src/test/groovy/util/ProxyGeneratorTest.groovy", [])
    }

    void "test src/test/groovy/util/ProxyTest_groovy"() {
        unzipAndTest("src/test/groovy/util/ProxyTest.groovy", [])
    }

    void "test src/test/groovy/util/ResourceBundleTest_groovy"() {
        unzipAndTest("src/test/groovy/util/ResourceBundleTest.groovy", [])
    }

    void "test src/test/groovy/util/logging/CommonsTest_groovy"() {
        unzipAndTest("src/test/groovy/util/logging/CommonsTest.groovy", [])
    }

    void "test src/test/groovy/util/logging/Log4j2Test_groovy"() {
        unzipAndTest("src/test/groovy/util/logging/Log4j2Test.groovy", [])
    }

    void "test src/test/groovy/util/logging/Log4jTest_groovy"() {
        unzipAndTest("src/test/groovy/util/logging/Log4jTest.groovy", [])
    }

    void "test src/test/groovy/util/logging/LogTest_groovy"() {
        unzipAndTest("src/test/groovy/util/logging/LogTest.groovy", [])
    }

    void "test src/test/groovy/util/logging/Slf4jTest_groovy"() {
        unzipAndTest("src/test/groovy/util/logging/Slf4jTest.groovy", [])
    }

    void "test src/test/indy/IndyUsageTest_groovy"() {
        unzipAndTest("src/test/indy/IndyUsageTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ClosureAndInnerClassNodeStructureTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ClosureAndInnerClassNodeStructureTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/antlr/AntlrParserPluginTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/antlr/AntlrParserPluginTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/antlr/GStringEndTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/antlr/GStringEndTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/CodeVisitorSupportTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/CodeVisitorSupportTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/GenericsTestCase_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/GenericsTestCase.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/GenericsTypeTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/GenericsTypeTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/LazyInitOnClassNodeTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/LazyInitOnClassNodeTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/LineColumnCheckTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/LineColumnCheckTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/MethodNodeTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/MethodNodeTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/builder/AstAssert_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/builder/AstAssert.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/builder/AstBuilderFromCodeTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/builder/AstBuilderFromCodeTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/builder/AstBuilderFromSpecificationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/builder/AstBuilderFromSpecificationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/builder/AstBuilderFromStringTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/builder/AstBuilderFromStringTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/builder/WithAstBuilder_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/builder/WithAstBuilder.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/builder/testpackage/AstBuilderFromCodePackageImportTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/builder/testpackage/AstBuilderFromCodePackageImportTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/decompiled/AsmDecompilerTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/decompiled/AsmDecompilerTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/decompiled/IncrementalRecompilationWithStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/decompiled/IncrementalRecompilationWithStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/expr/ClosureExpressionTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/expr/ClosureExpressionTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/expr/MapExpressionTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/expr/MapExpressionTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/expr/MethodCallExpressionTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/expr/MethodCallExpressionTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/expr/PropertyExpressionTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/expr/PropertyExpressionTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/source/Groovy3049Test_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/source/Groovy3049Test.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/source/Groovy3050Test_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/source/Groovy3050Test.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/source/Groovy3051Test_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/source/Groovy3051Test.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/source/SourceBaseTestCase_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/source/SourceBaseTestCase.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/ast/tools/WideningCategoriesTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/ast/tools/WideningCategoriesTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/alioth/binarytrees_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/alioth/binarytrees.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/alioth/fannkuch_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/alioth/fannkuch.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/alioth/partialsums_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/alioth/partialsums.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/alioth/rayTracer_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/alioth/rayTracer.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/alioth/recursive_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/alioth/recursive.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/alioth/spectralnorm_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/alioth/spectralnorm.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script120_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script120.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script240_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script240.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script30_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script30.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script300_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script300.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script300WithCategory_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script300WithCategory.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script60_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/benchmarks/vm5/b2394/script60.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/BytecodeHelperTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/BytecodeHelperTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/CallClosureFieldAsMethodTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/CallClosureFieldAsMethodTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/CallSiteTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/CallSiteTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/CastTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/CastTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/CastToStringTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/CastToStringTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/ConstructorIssueTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/ConstructorIssueTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/FinalVariableAnalyzerTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/FinalVariableAnalyzerTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/GenericsGenTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/GenericsGenTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/InterfaceTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/InterfaceTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/Main_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/Main.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/MetaClassTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/MetaClassTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/MyBean_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/MyBean.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/ReflectorLoaderTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/ReflectorLoaderTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/AbstractBytecodeTestCase_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/AbstractBytecodeTestCase.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/BinaryOperationsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/BinaryOperationsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/CovariantReturnBytecodeTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/CovariantReturnBytecodeTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/DirectMethodCallTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/DirectMethodCallTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/HotSwapTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/HotSwapTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/InstructionSequenceHelperClassTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/InstructionSequenceHelperClassTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/MethodPatternsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/MethodPatternsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/PrintlnLoadsAConstantTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/PrintlnLoadsAConstantTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/AnonymousInnerClassStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/AnonymousInnerClassStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/ArraysAndCollectionsStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/ArraysAndCollectionsStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/AssignmentsStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/AssignmentsStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/BugsStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/BugsStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/ClosureParamTypeInferenceStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/ClosureParamTypeInferenceStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/ClosuresStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/ClosuresStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/CombinedIndyAndStaticCompilationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/CombinedIndyAndStaticCompilationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/CompatWithASTXFormStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/CompatWithASTXFormStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/CompileDynamicTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/CompileDynamicTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/DelegatesToStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/DelegatesToStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/FieldsAndPropertiesStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/FieldsAndPropertiesStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/GenericsStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/GenericsStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/GetAnnotationStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/GetAnnotationStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/Groovy7222OptimizationsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/Groovy7222OptimizationsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/IOGMClosureParamTypeInferenceStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/IOGMClosureParamTypeInferenceStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/LoopsStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/LoopsStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/MethodCallsStaticCompilationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/MethodCallsStaticCompilationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/MiscStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/MiscStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/MixedModeStaticCompilationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/MixedModeStaticCompilationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/NaryExpressionTestStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/NaryExpressionTestStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/RangesStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/RangesStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/ResourceGMClosureParamTypeInferenceStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/ResourceGMClosureParamTypeInferenceStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/ReturnsStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/ReturnsStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/SocketGMClosureParamTypeInferenceStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/SocketGMClosureParamTypeInferenceStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompilationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompilationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompilationTestSupport_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompilationTestSupport.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileArrayLengthAndGet_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileArrayLengthAndGet.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileCastOptimizationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileCastOptimizationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileClosureCallTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileClosureCallTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileComparisonTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileComparisonTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileConstructorsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileConstructorsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileDGMMethodTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileDGMMethodTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileDGMTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileDGMTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileFieldAccessTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileFieldAccessTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileFlowTypingTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileFlowTypingTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileInnerClassTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileInnerClassTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileMathTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileMathTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileNullCompareOptimizationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompileNullCompareOptimizationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompilePostfixPrefixTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StaticCompilePostfixPrefixTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/StringGMClosureParamTypeInferenceStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/StringGMClosureParamTypeInferenceStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/TupleConstructorStaticCompilationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/TupleConstructorStaticCompilationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/TypeCheckingModeStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/TypeCheckingModeStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/TypeInferenceStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/TypeInferenceStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/UnaryOperatorStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/UnaryOperatorStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/WithStaticCompileTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/WithStaticCompileTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6240Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6240Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6276Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6276Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6411Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6411Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6475Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6475Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6533Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6533Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6541Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6541Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6558Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6558Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6564Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6564Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6568Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6568Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6627Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6627Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6650Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6650Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6657Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6657Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6670Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6670Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6671Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6671Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6676Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6676Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6693Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6693Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6724Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6724Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6733Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6733Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6757Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6757Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6782Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6782Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6962Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy6962Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7039Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7039Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7041Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7041Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7042Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7042Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7072Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7072Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7075Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7075Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7093Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7093Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7098Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7098Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7133Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7133Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7138Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7138Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7145Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7145Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7149Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7149Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7169Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7169Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7210Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7210Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7211Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7211Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7242Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7242Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7276Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7276Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7298Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7298Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7300Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7300Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7307Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7307Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7316Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7316Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7322Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7322Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7324Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7324Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7325Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7325Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7327Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7327Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7333Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7333Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7343Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7343Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7355Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7355Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7356Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7356Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7357Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7357Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7358Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7358Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7361Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7361Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7363Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7363Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7364Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7364Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7365Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7365Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7420Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7420Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7538Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7538Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7870Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/bugs/Groovy7870Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/classgen/asm/sc/vm6/MethodCallsStaticCompilationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/classgen/asm/sc/vm6/MethodCallsStaticCompilationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/control/customizers/ASTTransformationCustomizerTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/control/customizers/ASTTransformationCustomizerTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/control/customizers/ImportCustomizerTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/control/customizers/ImportCustomizerTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/control/customizers/SecureASTCustomizerTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/control/customizers/SecureASTCustomizerTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/control/customizers/builder/CompilerCustomizationBuilderTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/control/customizers/builder/CompilerCustomizationBuilderTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/control/io/FileReaderTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/control/io/FileReaderTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/control/io/NullWriterTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/control/io/NullWriterTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/control/io/StringReaderSourceTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/control/io/StringReaderSourceTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/dummy/ClassWithStaticMethod_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/dummy/ClassWithStaticMethod.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/reflection/CachedMethodTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/reflection/CachedMethodTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/reflection/GroovyClassValueFactoryTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/reflection/GroovyClassValueFactoryTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/reflection/utils/ReflectionUtilsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/reflection/utils/ReflectionUtilsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/AppendableDgmMethodsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/AppendableDgmMethodsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/CategoryForIteratorTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/CategoryForIteratorTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/CustomBooleanCoercionTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/CustomBooleanCoercionTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/DateGDKTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/DateGDKTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/DefaultGroovyMethodsSupportTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/DefaultGroovyMethodsSupportTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/DefaultGroovyMethodsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/DefaultGroovyMethodsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/DirectoryDeleteTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/DirectoryDeleteTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/EachLineTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/EachLineTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/EachWithReaderAndInputStreamTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/EachWithReaderAndInputStreamTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/FileAppendTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/FileAppendTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/FileLeftShiftTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/FileLeftShiftTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/FileStaticGroovyMethodsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/FileStaticGroovyMethodsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/GroovyCategoryTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/GroovyCategoryTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/InterfaceConversionTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/InterfaceConversionTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/InvokerHelperFormattingTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/InvokerHelperFormattingTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/JdkDynamicProxyServiceBeanImpl1_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/JdkDynamicProxyServiceBeanImpl1.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/JdkDynamicProxyServiceBeanImpl2_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/JdkDynamicProxyServiceBeanImpl2.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/MinusTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/MinusTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/NestedCategoryTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/NestedCategoryTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/NullObjectTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/NullObjectTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/PerInstanceMetaClassTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/PerInstanceMetaClassTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/ResourceGroovyMethodsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/ResourceGroovyMethodsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/StaticPrintlnTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/StaticPrintlnTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/StringAsClassTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/StringAsClassTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/URLGetBytesTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/URLGetBytesTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/URLGetTextTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/URLGetTextTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/WithResourceStreamClosedTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/WithResourceStreamClosedTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/WriterAppendTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/WriterAppendTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/m12n/ExtensionModuleHelperForTests_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/m12n/ExtensionModuleHelperForTests.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/m12n/ExtensionModuleTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/m12n/ExtensionModuleTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/memoize/AbstractMemoizeTestCase_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/memoize/AbstractMemoizeTestCase.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/memoize/CacheCleanupCollectedSoftReferencesTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/memoize/CacheCleanupCollectedSoftReferencesTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/memoize/CacheCleanupTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/memoize/CacheCleanupTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/memoize/LRUProtectionStorageTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/memoize/LRUProtectionStorageTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/memoize/MemoizeAtLeastTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/memoize/MemoizeAtLeastTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/memoize/MemoizeAtMostTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/memoize/MemoizeAtMostTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/memoize/MemoizeBetweenTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/memoize/MemoizeBetweenTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/memoize/MemoizeTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/memoize/MemoizeTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/memoize/NullValueTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/memoize/NullValueTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/powerassert/AssertionRenderingTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/powerassert/AssertionRenderingTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/powerassert/AssertionTestUtil_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/powerassert/AssertionTestUtil.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/powerassert/AssertionsInDifferentLocationsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/powerassert/AssertionsInDifferentLocationsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/powerassert/EvaluationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/powerassert/EvaluationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/powerassert/ImplicitClosureCallRenderingTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/powerassert/ImplicitClosureCallRenderingTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/powerassert/NotTransformedAssertionsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/powerassert/NotTransformedAssertionsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/powerassert/PowerAssertASTTransformationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/powerassert/PowerAssertASTTransformationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/powerassert/ScriptEvaluationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/powerassert/ScriptEvaluationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/powerassert/ValueRenderingTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/powerassert/ValueRenderingTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/trampoline/TrampolineTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/trampoline/TrampolineTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/typehandling/NumberMathTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/typehandling/NumberMathTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/runtime/typehandling/ShortTypeHandlingTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/runtime/typehandling/ShortTypeHandlingTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/LoaderConfigurationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/LoaderConfigurationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/StringHelperTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/StringHelperTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/UtilitiesTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/UtilitiesTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/ast/TransformTestHelperTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/ast/TransformTestHelperTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/rootloadersync/AbstractGenericGroovySuperclass_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/rootloadersync/AbstractGenericGroovySuperclass.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/rootloadersync/AbstractGroovySuperclass_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/rootloadersync/AbstractGroovySuperclass.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/rootloadersync/SubclassingInGroovyTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/rootloadersync/SubclassingInGroovyTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationCollectorStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationCollectorStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationDefaultValuesStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationDefaultValuesStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationMemberValuesResolutionV1StubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationMemberValuesResolutionV1StubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationMemberValuesResolutionV2StubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationMemberValuesResolutionV2StubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationMemberValuesResolutionV3StubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationMemberValuesResolutionV3StubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationMemberValuesResolutionV4StubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/AnnotationMemberValuesResolutionV4StubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/ArrayAnnotationsShouldAppearInStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/ArrayAnnotationsShouldAppearInStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/BadGenericsExpansionOnInnerClassStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/BadGenericsExpansionOnInnerClassStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/CircularLanguageReferenceTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/CircularLanguageReferenceTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/DefaultValueReturnTypeShouldUseGenericsStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/DefaultValueReturnTypeShouldUseGenericsStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/DuplicateMethodAdditionInStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/DuplicateMethodAdditionInStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/EnsureClassAnnotationPresentInStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/EnsureClassAnnotationPresentInStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/EscapingOfStringAnnotationValuesTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/EscapingOfStringAnnotationValuesTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/ExceptionThrowingSuperConstructorTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/ExceptionThrowingSuperConstructorTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/GenericsTypesHavePackageNamesStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/GenericsTypesHavePackageNamesStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/GenericsWithExtendsStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/GenericsWithExtendsStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy4248Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy4248Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy5859Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy5859Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy6302Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy6302Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy6404Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy6404Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy6617Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy6617Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy6855Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy6855Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy7052Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy7052Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy7113Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy7113Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy7366Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy7366Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy7366BugVariant_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy7366BugVariant.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/Groovy7747Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/Groovy7747Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/ImmutableWithJointCompilationGroovy6836StubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/ImmutableWithJointCompilationGroovy6836StubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/ImmutableWithJointCompilationStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/ImmutableWithJointCompilationStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/ImportAliasesShouldNotAppearInStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/ImportAliasesShouldNotAppearInStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/ImportStaticAliasTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/ImportStaticAliasTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/InnerAnnotationStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/InnerAnnotationStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/InterfaceWithPrimitiveFieldsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/InterfaceWithPrimitiveFieldsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/MultilineStringStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/MultilineStringStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/NestedGenericsTypesStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/NestedGenericsTypesStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/NoStaticGetMetaClassSyntheticMethodInStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/NoStaticGetMetaClassSyntheticMethodInStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/PropertyUsageFromJavaTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/PropertyUsageFromJavaTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/PropertyWithCustomSetterHavingReturnTypeStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/PropertyWithCustomSetterHavingReturnTypeStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/QDoxCategory_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/QDoxCategory.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/RedundantCastInStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/RedundantCastInStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/StringSourcesStubTestCase_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/StringSourcesStubTestCase.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/StubGenerationForAnAnnotationStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/StubGenerationForAnAnnotationStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/StubGenerationForConstructorWithOptionalArgsStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/StubGenerationForConstructorWithOptionalArgsStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/StubTestCase_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/StubTestCase.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/UnAmbigousSuperConstructorCallStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/UnAmbigousSuperConstructorCallStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/VarargsMethodParamsStubTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/VarargsMethodParamsStubTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/tools/stubgenerator/WrongCastForGenericReturnValueOfMethodStubsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/tools/stubgenerator/WrongCastForGenericReturnValueOfMethodStubsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/AutoCloneTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/AutoCloneTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/AutoImplementTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/AutoImplementTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/BaseScriptTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/BaseScriptTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/BuilderTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/BuilderTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/CanonicalComponentsTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/CanonicalComponentsTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/CanonicalTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/CanonicalTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/DelegateTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/DelegateTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/EqualsAndHashCodeTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/EqualsAndHashCodeTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/ExternalizeMethodsTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/ExternalizeMethodsTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/ExternalizeVerifierTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/ExternalizeVerifierTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/FakeURLFactory_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/FakeURLFactory.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/FieldTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/FieldTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/GlobalTestTransformClassLoader_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/GlobalTestTransformClassLoader.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/GlobalTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/GlobalTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/ImmutableTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/ImmutableTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/IndexedPropertyTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/IndexedPropertyTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/InheritConstructorsTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/InheritConstructorsTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/LazyTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/LazyTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/LocalASTTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/LocalASTTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/MapConstructorTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/MapConstructorTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/MemoizedASTTransformationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/MemoizedASTTransformationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/NewifyTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/NewifyTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/PackageScopeTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/PackageScopeTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/ReadWriteLockTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/ReadWriteLockTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/SingletonTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/SingletonTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/SortableTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/SortableTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/SourceURITransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/SourceURITransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/SynchronizedTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/SynchronizedTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/TestTransform_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/TestTransform.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/ToStringTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/ToStringTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/TupleConstructorTransformTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/TupleConstructorTransformTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/classloading/TransformsAndCustomClassLoadersTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/classloading/TransformsAndCustomClassLoadersTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/stc/SignatureCodecTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/stc/SignatureCodecTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/InWhileLoopWrapperTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/InWhileLoopWrapperTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/ParameterMappingTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/ParameterMappingTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/RecursiveListExamples_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/RecursiveListExamples.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/RecursivenessTesterTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/RecursivenessTesterTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/ReturnAdderForClosuresTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/ReturnAdderForClosuresTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/ReturnStatementToIterationConverterTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/ReturnStatementToIterationConverterTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/StatementReplacerTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/StatementReplacerTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/TailRecursiveCompilationFailuresTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/TailRecursiveCompilationFailuresTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/TailRecursiveExamples_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/TailRecursiveExamples.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/TailRecursiveTogetherWithOtherASTsTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/TailRecursiveTogetherWithOtherASTsTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/TailRecursiveTransformationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/TailRecursiveTransformationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/TernaryToIfStatementConverterTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/TernaryToIfStatementConverterTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/tailrec/VariableExpressionReplacerTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/tailrec/VariableExpressionReplacerTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy6697Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy6697Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy6736Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy6736Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy6741Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy6741Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7011Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7011Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7190Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7190Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7196Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7196Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7196SupportTrait_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7196SupportTrait.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7196SupportTraitImpl_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7196SupportTraitImpl.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7206Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7206Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7213Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7213Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7214Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7214Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7215Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7215Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7215SupportTrait_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7215SupportTrait.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7217Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7217Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7255Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7255Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7269Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7269Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7275Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7275Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7285Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7285Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7456Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7456Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7846Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7846Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/Groovy7926Bug_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/Groovy7926Bug.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/TestTrait2_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/TestTrait2.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/transform/traitx/TraitASTTransformationTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/transform/traitx/TraitASTTransformationTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/util/AbstractConcurrentMapSegmentTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/util/AbstractConcurrentMapSegmentTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/util/ListHashMapTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/util/ListHashMapTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/util/ManagedConcurrentMapTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/util/ManagedConcurrentMapTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/util/ManagedConcurrentValueMapTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/util/ManagedConcurrentValueMapTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/util/ManagedLinkedlistTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/util/ManagedLinkedlistTest.groovy", [])
    }

    void "test src/test/org/codehaus/groovy/util/ReferenceManagerTest_groovy"() {
        unzipAndTest("src/test/org/codehaus/groovy/util/ReferenceManagerTest.groovy", [])
    }

    void "test subprojects/groovy-ant/src/main/groovy/groovy/util/FileNameFinder_groovy"() {
        unzipAndTest("subprojects/groovy-ant/src/main/groovy/groovy/util/FileNameFinder.groovy", [])
    }

    void "test subprojects/groovy-ant/src/spec/test/builder/AntBuilderSpecTest_groovy"() {
        unzipAndTest("subprojects/groovy-ant/src/spec/test/builder/AntBuilderSpecTest.groovy", [])
    }

    void "test subprojects/groovy-ant/src/test-resources/org/codehaus/groovy/ant/GroovyTest1_groovy"() {
        unzipAndTest("subprojects/groovy-ant/src/test-resources/org/codehaus/groovy/ant/GroovyTest1.groovy", [])
    }

    void "test subprojects/groovy-ant/src/test-resources/org/codehaus/groovy/ant/GroovyTest2_groovy"() {
        unzipAndTest("subprojects/groovy-ant/src/test-resources/org/codehaus/groovy/ant/GroovyTest2.groovy", [])
    }

    void "test subprojects/groovy-ant/src/test-resources/org/codehaus/groovy/ant/GroovyTest_errorMessage_groovy"() {
        unzipAndTest("subprojects/groovy-ant/src/test-resources/org/codehaus/groovy/ant/GroovyTest_errorMessage.groovy", [])
    }

    void "test subprojects/groovy-ant/src/test-resources/org/codehaus/groovy/ant/GroovycTest1_groovy"() {
        unzipAndTest("subprojects/groovy-ant/src/test-resources/org/codehaus/groovy/ant/GroovycTest1.groovy", [])
    }

    void "test subprojects/groovy-ant/src/test-resources/org/codehaus/groovy/ant/groovytest3/GroovyTest3Class_groovy"() {
        unzipAndTest("subprojects/groovy-ant/src/test-resources/org/codehaus/groovy/ant/groovytest3/GroovyTest3Class.groovy", [])
    }

    void "test subprojects/groovy-ant/src/test/groovy/groovy/util/AntTest_groovy"() {
        unzipAndTest("subprojects/groovy-ant/src/test/groovy/groovy/util/AntTest.groovy", [])
    }

    void "test subprojects/groovy-ant/src/test/groovy/groovy/util/FileNameFinderTest_groovy"() {
        unzipAndTest("subprojects/groovy-ant/src/test/groovy/groovy/util/FileNameFinderTest.groovy", [])
    }

    void "test subprojects/groovy-ant/src/test/groovy/org/codehaus/groovy/ant/GroovyTest2Class_groovy"() {
        unzipAndTest("subprojects/groovy-ant/src/test/groovy/org/codehaus/groovy/ant/GroovyTest2Class.groovy", [])
    }

    void "test subprojects/groovy-bsf/src/test/resources/groovy/script/MapFromList_groovy"() {
        unzipAndTest("subprojects/groovy-bsf/src/test/resources/groovy/script/MapFromList.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/inspect/TextNode_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/inspect/TextNode.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/inspect/TextTreeNodeMaker_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/inspect/TextTreeNodeMaker.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/AstBrowser_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/AstBrowser.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/AstNodeToScriptAdapter_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/AstNodeToScriptAdapter.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/ButtonOrDefaultRenderer_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/ButtonOrDefaultRenderer.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/ButtonOrTextEditor_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/ButtonOrTextEditor.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/ObjectBrowser_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/ObjectBrowser.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/ScriptToTreeNodeAdapter_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/inspect/swingui/ScriptToTreeNodeAdapter.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/Console_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/Console.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/ConsoleActions_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/ConsoleActions.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/ConsoleApplet_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/ConsoleApplet.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/ConsoleIvyPlugin_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/ConsoleIvyPlugin.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/ConsoleView_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/ConsoleView.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/HistoryRecord_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/HistoryRecord.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/OutputTransforms_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/OutputTransforms.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/text/AutoIndentAction_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/text/AutoIndentAction.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/view/BasicContentPane_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/view/BasicContentPane.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/view/BasicMenuBar_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/view/BasicMenuBar.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/view/BasicStatusBar_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/view/BasicStatusBar.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/view/BasicToolBar_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/view/BasicToolBar.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/view/Defaults_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/view/Defaults.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/view/GTKDefaults_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/view/GTKDefaults.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/view/MacOSXDefaults_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/view/MacOSXDefaults.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/view/MacOSXMenuBar_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/view/MacOSXMenuBar.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/groovy/groovy/ui/view/WindowsDefaults_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/groovy/groovy/ui/view/WindowsDefaults.groovy", [])
    }

    void "test subprojects/groovy-console/src/main/resources/groovy/inspect/swingui/AstBrowserProperties_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/main/resources/groovy/inspect/swingui/AstBrowserProperties.groovy", [])
    }

    void "test subprojects/groovy-console/src/test/groovy/groovy/inspect/swingui/AstNodeToScriptAdapterTest_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/test/groovy/groovy/inspect/swingui/AstNodeToScriptAdapterTest.groovy", [])
    }

    void "test subprojects/groovy-console/src/test/groovy/groovy/inspect/swingui/ScriptToTreeNodeAdapterTest_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/test/groovy/groovy/inspect/swingui/ScriptToTreeNodeAdapterTest.groovy", [])
    }

    void "test subprojects/groovy-console/src/test/groovy/groovy/swing/SwingBuilderConsoleTest_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/test/groovy/groovy/swing/SwingBuilderConsoleTest.groovy", [])
    }

    void "test subprojects/groovy-console/src/test/groovy/groovy/ui/HistoryRecordGetTextToRunTests_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/test/groovy/groovy/ui/HistoryRecordGetTextToRunTests.groovy", [])
    }

    void "test subprojects/groovy-console/src/test/groovy/groovy/ui/text/GroovyFilterTests_groovy"() {
        unzipAndTest("subprojects/groovy-console/src/test/groovy/groovy/ui/text/GroovyFilterTests.groovy", [])
    }

    void "test subprojects/groovy-docgenerator/src/main/groovy/org/codehaus/groovy/tools/DocGenerator_groovy"() {
        unzipAndTest("subprojects/groovy-docgenerator/src/main/groovy/org/codehaus/groovy/tools/DocGenerator.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/main/groovy/org/codehaus/groovy/tools/groovydoc/Main_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/main/groovy/org/codehaus/groovy/tools/groovydoc/Main.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/GroovyDocToolTestSampleGroovy_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/GroovyDocToolTestSampleGroovy.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDocTests_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDocTests.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/SimpleGroovyRootDocTests_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/SimpleGroovyRootDocTests.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/Alias_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/Alias.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/ArrayPropertyLink_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/ArrayPropertyLink.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/DeprecatedClass_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/DeprecatedClass.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/DeprecatedField_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/DeprecatedField.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/DocumentedClass_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/DocumentedClass.groovy", [])
    }

    /* FIXME groovy-3.0.0-rc-3: antlr2 parser marks fields `dynamicTyped` as `false` or `true`, but antlr4 parser marks all fields `false`
    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/EnumWithDeprecatedConstants_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/EnumWithDeprecatedConstants.groovy", [])
    }
    */

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/ExampleVisibilityG_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/ExampleVisibilityG.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/GeneratePropertyFromGetSet_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/GeneratePropertyFromGetSet.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/GroovyClassWithMultipleInterfaces_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/GroovyClassWithMultipleInterfaces.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/GroovyInterface1_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/GroovyInterface1.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/GroovyInterfaceWithMultipleInterfaces_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/GroovyInterfaceWithMultipleInterfaces.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/InnerClassProperty_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/InnerClassProperty.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/InnerEnum_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/InnerEnum.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/PropertyLink_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/PropertyLink.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/Script_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/Script.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/TestConstructors_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/TestConstructors.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/a/Base_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/a/Base.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/a/DescendantA_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/a/DescendantA.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/a/DescendantC_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/a/DescendantC.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/a/DescendantD_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/a/DescendantD.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/b/Base_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/b/Base.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/b/DescendantB_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/b/DescendantB.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/c/DescendantE_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/c/DescendantE.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/c/DescendantF_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/c/DescendantF.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/staticInit/GroovyWithFailingStaticInit_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/staticInit/GroovyWithFailingStaticInit.groovy", [])
    }

    void "test subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/staticInit/UsesClassesWithFailingStaticInit_groovy"() {
        unzipAndTest("subprojects/groovy-groovydoc/src/test/groovy/org/codehaus/groovy/tools/groovydoc/testfiles/staticInit/UsesClassesWithFailingStaticInit.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/AnsiDetector_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/AnsiDetector.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/BufferManager_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/BufferManager.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Command_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Command.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/CommandAlias_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/CommandAlias.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/CommandException_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/CommandException.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/CommandRegistry_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/CommandRegistry.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/CommandSupport_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/CommandSupport.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/ComplexCommandSupport_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/ComplexCommandSupport.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/ExitNotification_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/ExitNotification.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Groovysh_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Groovysh.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/InteractiveShellRunner_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/InteractiveShellRunner.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Interpreter_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Interpreter.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Main_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Main.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Parser_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Parser.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Shell_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/Shell.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/ShellRunner_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/ShellRunner.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/AliasCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/AliasCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/ClearCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/ClearCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/DisplayCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/DisplayCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/DocCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/DocCommand.groovy", [], ['for \'java.awt.Desktop\'.': 'for "java.awt.Desktop".'])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/EditCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/EditCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/ExitCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/ExitCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/GrabCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/GrabCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/HelpCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/HelpCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/HistoryCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/HistoryCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/ImportCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/ImportCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/InspectCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/InspectCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/LoadCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/LoadCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/PurgeCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/PurgeCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/RecordCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/RecordCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/RegisterCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/RegisterCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/SaveCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/SaveCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/SetCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/SetCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/ShadowCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/ShadowCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/ShowCommand_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/commands/ShowCommand.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/CommandNameCompleter_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/CommandNameCompleter.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/CustomClassSyntaxCompletor_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/CustomClassSyntaxCompletor.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/FileNameCompleter_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/FileNameCompleter.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/GroovySyntaxCompletor_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/GroovySyntaxCompletor.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/IdentifierCompletor_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/IdentifierCompletor.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/ImportsSyntaxCompletor_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/ImportsSyntaxCompletor.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/InfixKeywordSyntaxCompletor_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/InfixKeywordSyntaxCompletor.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/KeywordSyntaxCompletor_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/KeywordSyntaxCompletor.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/NavigablePropertiesCompleter_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/NavigablePropertiesCompleter.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/ReflectionCompletionCandidate_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/ReflectionCompletionCandidate.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/ReflectionCompletor_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/ReflectionCompletor.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/StricterArgumentCompleter_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/StricterArgumentCompleter.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/VariableSyntaxCompletor_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/completion/VariableSyntaxCompletor.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/CommandArgumentParser_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/CommandArgumentParser.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/CurlyCountingGroovyLexer_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/CurlyCountingGroovyLexer.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/DefaultCommandsRegistrar_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/DefaultCommandsRegistrar.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/HelpFormatter_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/HelpFormatter.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/NoExitSecurityManager_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/NoExitSecurityManager.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/PackageHelper_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/PackageHelper.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/PackageHelperImpl_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/PackageHelperImpl.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/ScriptVariableAnalyzer_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/ScriptVariableAnalyzer.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/SimpleCompletor_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/SimpleCompletor.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/WrappedInputStream_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/WrappedInputStream.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/XmlCommandRegistrar_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/main/groovy/org/codehaus/groovy/tools/shell/util/XmlCommandRegistrar.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/AllCompletorsTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/AllCompletorsTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/AnsiDetectorTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/AnsiDetectorTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/CommandCompletorTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/CommandCompletorTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/CompletorTestSupport_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/CompletorTestSupport.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/ErrorDisplayTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/ErrorDisplayTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/GroovyshParsersTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/GroovyshParsersTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/GroovyshTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/GroovyshTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/ImportCompletorTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/ImportCompletorTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/ShellRunnerTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/ShellRunnerTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/ShellRunnerTestSupport_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/ShellRunnerTestSupport.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/ShellTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/ShellTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/AliasCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/AliasCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/ClearCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/ClearCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/CommandTestSupport_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/CommandTestSupport.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/ComplexCommandSupportTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/ComplexCommandSupportTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/DisplayCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/DisplayCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/DocCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/DocCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/EditCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/EditCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/ExitCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/ExitCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/GrabCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/GrabCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/HelpCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/HelpCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/HistoryCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/HistoryCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/ImportCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/ImportCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/InspectCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/InspectCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/LoadCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/LoadCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/PurgeCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/PurgeCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/RecordCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/RecordCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/RegisterCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/RegisterCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/SaveCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/SaveCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/SetCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/SetCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/ShowCommandTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/commands/ShowCommandTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/CustomClassCompletorTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/CustomClassCompletorTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/FileNameCompleterTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/FileNameCompleterTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/GroovySyntaxCompletorTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/GroovySyntaxCompletorTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/ImportsSyntaxCompletorTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/ImportsSyntaxCompletorTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/KeywordCompletorTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/KeywordCompletorTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/NavigablePropertiesCompleterTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/NavigablePropertiesCompleterTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/ReflectionCompletorTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/ReflectionCompletorTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/TokenUtilTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/TokenUtilTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/VariableCompletorTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/completion/VariableCompletorTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/expr/ClassWithPrivateConstructor_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/expr/ClassWithPrivateConstructor.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/expr/ExprTestSupport_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/expr/ExprTestSupport.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/expr/TimeItTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/expr/TimeItTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/CommandArgumentParserTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/CommandArgumentParserTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/CurlyCountingGroovyLexerTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/CurlyCountingGroovyLexerTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/MessageSourceTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/MessageSourceTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/PackageHelperImplTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/PackageHelperImplTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/ScriptVariableAnalyzerTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/ScriptVariableAnalyzerTest.groovy", [])
    }

    void "test subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/WrappedInputStreamTest_groovy"() {
        unzipAndTest("subprojects/groovy-groovysh/src/test/groovy/org/codehaus/groovy/tools/shell/util/WrappedInputStreamTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxAttributeInfoManager_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxAttributeInfoManager.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBeanExportFactory_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBeanExportFactory.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBeanFactory_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBeanFactory.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBeanInfoManager_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBeanInfoManager.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBeansFactory_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBeansFactory.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBuilder_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBuilder.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBuilderTools_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxBuilderTools.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxClientConnectorFactory_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxClientConnectorFactory.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxEmitterFactory_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxEmitterFactory.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxListenerFactory_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxListenerFactory.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxMetaMapBuilder_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxMetaMapBuilder.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxOperationInfoManager_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxOperationInfoManager.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxServerConnectorFactory_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxServerConnectorFactory.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxTimerFactory_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxTimerFactory.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/package-info_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/package-info.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/spec/test/JmxTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/spec/test/JmxTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxAttributeInfoManagerTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxAttributeInfoManagerTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxBeanExportFactoryTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxBeanExportFactoryTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxBeanFactoryTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxBeanFactoryTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxBeanInfoManagerTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxBeanInfoManagerTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxBeansFactoryTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxBeansFactoryTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxBuilderToolsTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxBuilderToolsTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxClientConnectorFactoryTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxClientConnectorFactoryTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxEmbeddedMetaMapBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxEmbeddedMetaMapBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxEmitterFactoryTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxEmitterFactoryTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxListenerFactoryTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxListenerFactoryTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxMetaMapBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxMetaMapBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxOperationInfoManagerTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxOperationInfoManagerTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxServerConnectorFactoryTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxServerConnectorFactoryTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxTimerFactoryTest_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/JmxTimerFactoryTest.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/MockEmbeddedClass_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/MockEmbeddedClass.groovy", [])
    }

    void "test subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/MockManagedGroovyObject_groovy"() {
        unzipAndTest("subprojects/groovy-jmx/src/test/groovy/groovy/jmx/builder/MockManagedGroovyObject.groovy", [])
    }

    void "test subprojects/groovy-json/src/spec/test/json/JsonBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/spec/test/json/JsonBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/spec/test/json/JsonTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/spec/test/json/JsonTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/spec/test/json/StreamingJsonBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/spec/test/json/StreamingJsonBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/CharBufTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/CharBufTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/IOTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/IOTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/JsonBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/JsonBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/JsonJavadocAssertionTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/JsonJavadocAssertionTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/JsonLexerTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/JsonLexerTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/JsonOutputTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/JsonOutputTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/JsonSlurperCharSourceTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/JsonSlurperCharSourceTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/JsonSlurperIndexOverlayTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/JsonSlurperIndexOverlayTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/JsonSlurperLaxTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/JsonSlurperLaxTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/JsonSlurperTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/JsonSlurperTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/JsonTokenTypeTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/JsonTokenTypeTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/JsonTokenValueTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/JsonTokenValueTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/RealJsonPayloadsTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/RealJsonPayloadsTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/StreamingJsonBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/StreamingJsonBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/internal/ArrayUtilsTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/internal/ArrayUtilsTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/internal/CharScannerTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/internal/CharScannerTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/internal/ChrTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/internal/ChrTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/internal/DatesTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/internal/DatesTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/internal/FastStringUtilsTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/internal/FastStringUtilsTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/internal/FastStringUtilsUnsafeDisabledTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/internal/FastStringUtilsUnsafeDisabledTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/internal/LazyMapTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/internal/LazyMapTest.groovy", [])
    }

    void "test subprojects/groovy-json/src/test/groovy/groovy/json/internal/ReaderCharacterSourceTest_groovy"() {
        unzipAndTest("subprojects/groovy-json/src/test/groovy/groovy/json/internal/ReaderCharacterSourceTest.groovy", [])
    }

    void "test subprojects/groovy-jsr223/src/test/groovy/org/codehaus/groovy/jsr223/JSR223Test_groovy"() {
        unzipAndTest("subprojects/groovy-jsr223/src/test/groovy/org/codehaus/groovy/jsr223/JSR223Test.groovy", [])
    }

    void "test subprojects/groovy-jsr223/src/test/groovy/org/codehaus/groovy/jsr223/SugarTest_groovy"() {
        unzipAndTest("subprojects/groovy-jsr223/src/test/groovy/org/codehaus/groovy/jsr223/SugarTest.groovy", [])
    }

    void "test subprojects/groovy-jsr223/src/test/groovy/org/codehaus/groovy/jsr223/vm6/JavascriptTest_groovy"() {
        unzipAndTest("subprojects/groovy-jsr223/src/test/groovy/org/codehaus/groovy/jsr223/vm6/JavascriptTest.groovy", [])
    }

    void "test subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/ASTMatcher_groovy"() {
        unzipAndTest("subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/ASTMatcher.groovy", [])
    }

    void "test subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/MatchingConstraints_groovy"() {
        unzipAndTest("subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/MatchingConstraints.groovy", [])
    }

    void "test subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/internal/AnyTokenMatch_groovy"() {
        unzipAndTest("subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/internal/AnyTokenMatch.groovy", [])
    }

    void "test subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/internal/ConstraintPredicate_groovy"() {
        unzipAndTest("subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/internal/ConstraintPredicate.groovy", [])
    }

    void "test subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/internal/MatchingConstraintsBuilder_groovy"() {
        unzipAndTest("subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/internal/MatchingConstraintsBuilder.groovy", [])
    }

    void "test subprojects/groovy-macro/src/test/groovy/org/codehaus/groovy/macro/MacroTest_groovy"() {
        unzipAndTest("subprojects/groovy-macro/src/test/groovy/org/codehaus/groovy/macro/MacroTest.groovy", [])
    }

    void "test subprojects/groovy-macro/src/test/groovy/org/codehaus/groovy/macro/matcher/ASTMatcherTest_groovy"() {
        unzipAndTest("subprojects/groovy-macro/src/test/groovy/org/codehaus/groovy/macro/matcher/ASTMatcherTest.groovy", [])
    }

    void "test subprojects/groovy-nio/src/test/groovy/org/codehaus/groovy/runtime/NioGroovyMethodsTest_groovy"() {
        unzipAndTest("subprojects/groovy-nio/src/test/groovy/org/codehaus/groovy/runtime/NioGroovyMethodsTest.groovy", [])
    }

    void "test subprojects/groovy-servlet/src/spec/test/servlet/GroovyServletTest_groovy"() {
        unzipAndTest("subprojects/groovy-servlet/src/spec/test/servlet/GroovyServletTest.groovy", [])
    }

    void "test subprojects/groovy-servlet/src/test/groovy/groovy/servlet/AbstractHttpServletTest_groovy"() {
        unzipAndTest("subprojects/groovy-servlet/src/test/groovy/groovy/servlet/AbstractHttpServletTest.groovy", [])
    }

    void "test subprojects/groovy-servlet/src/test/groovy/groovy/servlet/ServletBindingTest_groovy"() {
        unzipAndTest("subprojects/groovy-servlet/src/test/groovy/groovy/servlet/ServletBindingTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/spec/test/SqlTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/spec/test/SqlTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/bugs/ForAndSqlBug_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/bugs/ForAndSqlBug.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/bugs/Groovy5041Bug_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/bugs/Groovy5041Bug.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/ExtractIndexAndSqlTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/ExtractIndexAndSqlTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/GroovyRowResultTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/GroovyRowResultTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/Person_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/Person.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/PersonTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/PersonTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlBatchTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlBatchTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlCacheTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlCacheTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlCallTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlCallTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlCompleteTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlCompleteTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlCompleteWithoutDataSourceTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlCompleteWithoutDataSourceTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlHelperTestCase_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlHelperTestCase.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlRowsTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlRowsTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlStatementTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlStatementTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlTestConstants_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlTestConstants.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlTransactionConnectionTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlTransactionConnectionTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlTransactionDataSourceTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlTransactionDataSourceTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlTransactionTestCase_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlTransactionTestCase.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlWithBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlWithBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlWithTypedResultsTest_groovy"() {
        unzipAndTest("subprojects/groovy-sql/src/test/groovy/groovy/sql/SqlWithTypedResultsTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/LookAndFeelHelper_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/LookAndFeelHelper.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/SwingBuilder_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/SwingBuilder.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/AbstractSyntheticMetaMethods_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/AbstractSyntheticMetaMethods.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/JComboBoxMetaMethods_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/JComboBoxMetaMethods.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/JListMetaMethods_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/JListMetaMethods.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/JListProperties_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/JListProperties.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/JTableMetaMethods_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/JTableMetaMethods.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ActionFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ActionFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BeanFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BeanFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BevelBorderFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BevelBorderFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BindFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BindFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BindGroupFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BindGroupFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BindProxyFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BindProxyFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BoxFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BoxFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BoxLayoutFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/BoxLayoutFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ButtonGroupFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ButtonGroupFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/CellEditorFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/CellEditorFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/CollectionFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/CollectionFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ColumnFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ColumnFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ColumnModelFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ColumnModelFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ComboBoxFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ComboBoxFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ComponentFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ComponentFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/CompoundBorderFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/CompoundBorderFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/DialogFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/DialogFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/EmptyBorderFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/EmptyBorderFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/EtchedBorderFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/EtchedBorderFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/FormattedTextFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/FormattedTextFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/FrameFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/FrameFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/GridBagFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/GridBagFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ImageIconFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ImageIconFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/InternalFrameFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/InternalFrameFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/LayoutFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/LayoutFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/LineBorderFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/LineBorderFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ListFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ListFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/MapFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/MapFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/MatteBorderFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/MatteBorderFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/RendererFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/RendererFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/RichActionWidgetFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/RichActionWidgetFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/RootPaneContainerFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/RootPaneContainerFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ScrollPaneFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ScrollPaneFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/SeparatorFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/SeparatorFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/SplitPaneFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/SplitPaneFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/SwingBorderFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/SwingBorderFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TabbedPaneFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TabbedPaneFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TableFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TableFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TableLayoutFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TableLayoutFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TableModelFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TableModelFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TextArgWidgetFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TextArgWidgetFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TitledBorderFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/TitledBorderFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/WidgetFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/WidgetFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/WindowFactory_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/WindowFactory.groovy", [])
    }

    void "test subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ClosureCellEditor_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ClosureCellEditor.groovy", [])
    }

    void "test subprojects/groovy-swing/src/spec/test/SwingBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/spec/test/SwingBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/ClosureSwingListenerTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/ClosureSwingListenerTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/beans/BindableSwingTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/beans/BindableSwingTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/beans/VetoableSwingTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/beans/VetoableSwingTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/bugs/Groovy303_Bug_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/bugs/Groovy303_Bug.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/bugs/PropertyBug_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/bugs/PropertyBug.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/model/TableModelTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/model/TableModelTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/swing/BindPathTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/swing/BindPathTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/swing/SwingBuilderBindingsTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/swing/SwingBuilderBindingsTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/swing/SwingBuilderTableTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/swing/SwingBuilderTableTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/swing/SwingBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/swing/SwingBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/swing/SwingMetaMethodsTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/swing/SwingMetaMethodsTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/swing/TitledBorderFactoryJustificationTest_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/swing/TitledBorderFactoryJustificationTest.groovy", [])
    }

    void "test subprojects/groovy-swing/src/test/groovy/groovy/util/GroovySwingTestCase_groovy"() {
        unzipAndTest("subprojects/groovy-swing/src/test/groovy/groovy/util/GroovySwingTestCase.groovy", [])
    }

    void "test subprojects/groovy-templates/src/main/groovy/groovy/text/markup/MarkupTemplateTypeCheckingExtension_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/main/groovy/groovy/text/markup/MarkupTemplateTypeCheckingExtension.groovy", [])
    }

    void "test subprojects/groovy-templates/src/main/groovy/groovy/text/markup/TagLibAdapter_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/main/groovy/groovy/text/markup/TagLibAdapter.groovy", [])
    }

    void "test subprojects/groovy-templates/src/spec/test/MarkupTemplateEngineSpecTest_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/spec/test/MarkupTemplateEngineSpecTest.groovy", [])
    }

    void "test subprojects/groovy-templates/src/spec/test/MyTemplate_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/spec/test/MyTemplate.groovy", [])
    }

    void "test subprojects/groovy-templates/src/spec/test/TemplateEnginesTest_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/spec/test/TemplateEnginesTest.groovy", [])
    }

    void "test subprojects/groovy-templates/src/test/groovy/groovy/SimpleGStringTemplateEngineTest_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/test/groovy/groovy/SimpleGStringTemplateEngineTest.groovy", [])
    }

    void "test subprojects/groovy-templates/src/test/groovy/groovy/SimpleTemplateEngineTest_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/test/groovy/groovy/SimpleTemplateEngineTest.groovy", [])
    }

    void "test subprojects/groovy-templates/src/test/groovy/groovy/text/MarkupTemplateEngineTest_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/test/groovy/groovy/text/MarkupTemplateEngineTest.groovy", [])
    }

    void "test subprojects/groovy-templates/src/test/groovy/groovy/text/SimpleTemplateTest_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/test/groovy/groovy/text/SimpleTemplateTest.groovy", [])
    }

    void "test subprojects/groovy-templates/src/test/groovy/groovy/text/StreamingTemplateEngineSpecification_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/test/groovy/groovy/text/StreamingTemplateEngineSpecification.groovy", [])
    }

    void "test subprojects/groovy-templates/src/test/groovy/groovy/text/StreamingTemplateEngineTest_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/test/groovy/groovy/text/StreamingTemplateEngineTest.groovy", [])
    }

    void "test subprojects/groovy-templates/src/test/groovy/groovy/text/markup/TemplateResourceTest_groovy"() {
        unzipAndTest("subprojects/groovy-templates/src/test/groovy/groovy/text/markup/TemplateResourceTest.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/lang/GroovyLogTestCase_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/lang/GroovyLogTestCase.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/Demand_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/Demand.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/Ignore_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/Ignore.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/LooseExpectation_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/LooseExpectation.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/MockFor_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/MockFor.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/MockInterceptor_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/MockInterceptor.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/StrictExpectation_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/StrictExpectation.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/StubFor_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/StubFor.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/util/GroovyShellTestCase_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/util/GroovyShellTestCase.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/util/JavadocAssertionTestBuilder_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/util/JavadocAssertionTestBuilder.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/util/JavadocAssertionTestSuite_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/util/JavadocAssertionTestSuite.groovy", [])
    }

    void "test subprojects/groovy-test/src/main/groovy/groovy/util/StringTestUtil_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/main/groovy/groovy/util/StringTestUtil.groovy", [])
    }

    void "test subprojects/groovy-test/src/test/groovy/GroovyTestCaseTest_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/test/groovy/GroovyTestCaseTest.groovy", [])
    }

    void "test subprojects/groovy-test/src/test/groovy/groovy/lang/GroovyLogTestCaseTest_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/test/groovy/groovy/lang/GroovyLogTestCaseTest.groovy", [])
    }

    void "test subprojects/groovy-test/src/test/groovy/groovy/test/GroovyAssertTest_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/test/groovy/groovy/test/GroovyAssertTest.groovy", [])
    }

    void "test subprojects/groovy-test/src/test/groovy/groovy/test/GroovyTestJavadocAssertionTest_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/test/groovy/groovy/test/GroovyTestJavadocAssertionTest.groovy", [])
    }

    void "test subprojects/groovy-test/src/test/groovy/groovy/util/AllTestSuiteTest_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/test/groovy/groovy/util/AllTestSuiteTest.groovy", [])
    }

    void "test subprojects/groovy-test/src/test/groovy/groovy/util/suite/ATestScriptThatsNoTestCase_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/test/groovy/groovy/util/suite/ATestScriptThatsNoTestCase.groovy", [])
    }

    void "test subprojects/groovy-test/src/test/groovy/org/codehaus/groovy/transform/NotYetImplementedTransformTest_groovy"() {
        unzipAndTest("subprojects/groovy-test/src/test/groovy/org/codehaus/groovy/transform/NotYetImplementedTransformTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/main/groovy/groovy/xml/Entity_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/main/groovy/groovy/xml/Entity.groovy", [])
    }

    void "test subprojects/groovy-xml/src/main/groovy/groovy/xml/StaxBuilder_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/main/groovy/groovy/xml/StaxBuilder.groovy", [])
    }

    void "test subprojects/groovy-xml/src/main/groovy/groovy/xml/StreamingDOMBuilder_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/main/groovy/groovy/xml/StreamingDOMBuilder.groovy", [])
    }

    void "test subprojects/groovy-xml/src/main/groovy/groovy/xml/StreamingMarkupBuilder_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/main/groovy/groovy/xml/StreamingMarkupBuilder.groovy", [])
    }

    void "test subprojects/groovy-xml/src/main/groovy/groovy/xml/StreamingSAXBuilder_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/main/groovy/groovy/xml/StreamingSAXBuilder.groovy", [])
    }

    void "test subprojects/groovy-xml/src/main/groovy/groovy/xml/jaxb/JaxbGroovyMethods_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/main/groovy/groovy/xml/jaxb/JaxbGroovyMethods.groovy", [])
    }

    void "test subprojects/groovy-xml/src/main/groovy/groovy/xml/streamingmarkupsupport/AbstractStreamingBuilder_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/main/groovy/groovy/xml/streamingmarkupsupport/AbstractStreamingBuilder.groovy", [])
    }

    void "test subprojects/groovy-xml/src/spec/test/DOMBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/spec/test/DOMBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/spec/test/SaxBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/spec/test/SaxBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/spec/test/StaxBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/spec/test/StaxBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/spec/test/UserGuideDOMCategory_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/spec/test/UserGuideDOMCategory.groovy", [])
    }

    void "test subprojects/groovy-xml/src/spec/test/UserGuideMarkupBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/spec/test/UserGuideMarkupBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/spec/test/UserGuideStreamingMarkupBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/spec/test/UserGuideStreamingMarkupBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/spec/test/UserGuideXmlParserTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/spec/test/UserGuideXmlParserTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/spec/test/UserGuideXmlSlurperTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/spec/test/UserGuideXmlSlurperTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/spec/test/UserGuideXmlUtilTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/spec/test/UserGuideXmlUtilTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/bugs/Groovy249_Bug_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/bugs/Groovy249_Bug.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/bugs/Groovy4285Bug_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/bugs/Groovy4285Bug.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/bugs/Groovy593_Bug_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/bugs/Groovy593_Bug.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/bugs/Groovy_2473Bug_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/bugs/Groovy_2473Bug.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/bugs/StaticMarkupBug_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/bugs/StaticMarkupBug.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/bugs/TedsClosureBug_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/bugs/TedsClosureBug.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/util/XmlNodePrinterTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/util/XmlNodePrinterTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/util/XmlParserTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/util/XmlParserTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/util/XmlSlurperTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/util/XmlSlurperTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/BuilderTestSupport_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/BuilderTestSupport.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/DOMTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/DOMTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/GpathSyntaxTestSupport_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/GpathSyntaxTestSupport.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/MarkupBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/MarkupBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/MarkupWithWriterTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/MarkupWithWriterTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/MixedMarkupTestSupport_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/MixedMarkupTestSupport.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/NamespaceNodeGPathTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/NamespaceNodeGPathTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/NamespaceNodeTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/NamespaceNodeTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/SAXTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/SAXTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/StreamingMarkupBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/StreamingMarkupBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/StreamingSAXBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/StreamingSAXBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/TraversalTestSupport_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/TraversalTestSupport.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/UseMarkupWithWriterScript_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/UseMarkupWithWriterScript.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/VerboseDOMTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/VerboseDOMTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/XmlJavadocAssertionTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/XmlJavadocAssertionTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/XmlUtilTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/XmlUtilTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/dom/DOMCategoryTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/dom/DOMCategoryTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/dom/DOMTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/dom/DOMTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/dom/NamespaceDOMTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/dom/NamespaceDOMTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/jaxb/JaxbGroovyMethodsTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/jaxb/JaxbGroovyMethodsTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/jaxb/Person_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/jaxb/Person.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/groovy/xml/vm6/StaxBuilderTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/groovy/xml/vm6/StaxBuilderTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/org/codehaus/groovy/benchmarks/BuilderPerfTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/org/codehaus/groovy/benchmarks/BuilderPerfTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/org/codehaus/groovy/tools/xml/DomToGroovyTest_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/org/codehaus/groovy/tools/xml/DomToGroovyTest.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/script/AtomTestScript_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/script/AtomTestScript.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/script/MarkupTestScript_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/script/MarkupTestScript.groovy", [])
    }

    void "test subprojects/groovy-xml/src/test/groovy/util/NavToWiki_groovy"() {
        unzipAndTest("subprojects/groovy-xml/src/test/groovy/util/NavToWiki.groovy", [])
    }


    /*************************************/
    static unzipAndTest(String entryName, List ignoreClazzList, Map<String, String> replacementsMap=[:]) {
        ignoreClazzList.addAll(TestUtils.COMMON_IGNORE_CLASS_LIST)

        TestUtils.unzipAndTest(ZIP_PATH, entryName, TestUtils.addIgnore(ignoreClazzList, ASTComparatorCategory.LOCATION_IGNORE_LIST), replacementsMap)
    }

    public static final String ZIP_PATH = "$TestUtils.RESOURCES_PATH/groovy-2.5.0/groovy-2.5.0-SNAPSHOT-20160921-allsources.zip";

}