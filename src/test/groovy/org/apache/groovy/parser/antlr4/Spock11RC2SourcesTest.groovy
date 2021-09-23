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
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import org.apache.groovy.parser.antlr4.util.ASTComparatorCategory

/**
 * Add Spock 1.1 RC-2 sources as test cases
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * Created on    2016/10/12
 */
@CompileStatic
class Spock11RC2SourcesTest extends GroovyTestCase {


    void "test build_gradle"() {
        unzipAndTest("build.gradle", [])
    }

    void "test buildSrc/build_gradle"() {
        unzipAndTest("buildSrc/build.gradle", [])
    }

    void "test gradle/common_gradle"() {
        unzipAndTest("gradle/common.gradle", [])
    }

    void "test gradle/ide_gradle"() {
        unzipAndTest("gradle/ide.gradle", [])
    }

    void "test gradle/publishMaven_gradle"() {
        unzipAndTest("gradle/publishMaven.gradle", [])
    }

    void "test settings_gradle"() {
        unzipAndTest("settings.gradle", [])
    }

    void "test spock-core/core_gradle"() {
        unzipAndTest("spock-core/core.gradle", [])
    }

    void "test spock-core/src/main/groovy/org/spockframework/util/GroovyUtil_groovy"() {
        unzipAndTest("spock-core/src/main/groovy/org/spockframework/util/GroovyUtil.groovy", [])
    }

    void "test spock-core/src/main/groovy/spock/util/EmbeddedSpecCompiler_groovy"() {
        unzipAndTest("spock-core/src/main/groovy/spock/util/EmbeddedSpecCompiler.groovy", [])
    }

    void "test spock-core/src/main/groovy/spock/util/EmbeddedSpecRunner_groovy"() {
        unzipAndTest("spock-core/src/main/groovy/spock/util/EmbeddedSpecRunner.groovy", [])
    }

    void "test spock-core/src/main/groovy/spock/util/concurrent/BlockingVariables_groovy"() {
        unzipAndTest("spock-core/src/main/groovy/spock/util/concurrent/BlockingVariables.groovy", [])
    }

    void "test spock-core/src/main/groovy/spock/util/matcher/HamcrestMatchers_groovy"() {
        unzipAndTest("spock-core/src/main/groovy/spock/util/matcher/HamcrestMatchers.groovy", [])
    }

    void "test spock-core/src/main/groovy/spock/util/matcher/IsCloseTo_groovy"() {
        unzipAndTest("spock-core/src/main/groovy/spock/util/matcher/IsCloseTo.groovy", [])
    }

    void "test spock-gradle/gradle_gradle"() {
        unzipAndTest("spock-gradle/gradle.gradle", [])
    }

    void "test spock-gradle/src/main/groovy/org/spockframework/gradle/GenerateSpockReport_groovy"() {
        unzipAndTest("spock-gradle/src/main/groovy/org/spockframework/gradle/GenerateSpockReport.groovy", [])
    }

    void "test spock-gradle/src/main/groovy/org/spockframework/gradle/SpockBasePlugin_groovy"() {
        unzipAndTest("spock-gradle/src/main/groovy/org/spockframework/gradle/SpockBasePlugin.groovy", [])
    }

    void "test spock-gradle/src/main/groovy/org/spockframework/gradle/SpockReportPlugin_groovy"() {
        unzipAndTest("spock-gradle/src/main/groovy/org/spockframework/gradle/SpockReportPlugin.groovy", [])
    }

    void "test spock-guice/guice_gradle"() {
        unzipAndTest("spock-guice/guice.gradle", [])
    }

    void "test spock-guice/src/test/groovy/org/spockframework/guice/BindingAnnotation1_groovy"() {
        unzipAndTest("spock-guice/src/test/groovy/org/spockframework/guice/BindingAnnotation1.groovy", [])
    }

    void "test spock-guice/src/test/groovy/org/spockframework/guice/BindingAnnotation2_groovy"() {
        unzipAndTest("spock-guice/src/test/groovy/org/spockframework/guice/BindingAnnotation2.groovy", [])
    }

    void "test spock-guice/src/test/groovy/org/spockframework/guice/GuiceSpecInheritance_groovy"() {
        unzipAndTest("spock-guice/src/test/groovy/org/spockframework/guice/GuiceSpecInheritance.groovy", [])
    }

    void "test spock-guice/src/test/groovy/org/spockframework/guice/IService1_groovy"() {
        unzipAndTest("spock-guice/src/test/groovy/org/spockframework/guice/IService1.groovy", [])
    }

    void "test spock-guice/src/test/groovy/org/spockframework/guice/IService2_groovy"() {
        unzipAndTest("spock-guice/src/test/groovy/org/spockframework/guice/IService2.groovy", [])
    }

    void "test spock-guice/src/test/groovy/org/spockframework/guice/InjectionExamples_groovy"() {
        unzipAndTest("spock-guice/src/test/groovy/org/spockframework/guice/InjectionExamples.groovy", [])
    }

    void "test spock-guice/src/test/groovy/org/spockframework/guice/Module1_groovy"() {
        unzipAndTest("spock-guice/src/test/groovy/org/spockframework/guice/Module1.groovy", [])
    }

    void "test spock-guice/src/test/groovy/org/spockframework/guice/Module2_groovy"() {
        unzipAndTest("spock-guice/src/test/groovy/org/spockframework/guice/Module2.groovy", [])
    }

    void "test spock-guice/src/test/groovy/org/spockframework/guice/Service1_groovy"() {
        unzipAndTest("spock-guice/src/test/groovy/org/spockframework/guice/Service1.groovy", [])
    }

    void "test spock-guice/src/test/groovy/org/spockframework/guice/Service2_groovy"() {
        unzipAndTest("spock-guice/src/test/groovy/org/spockframework/guice/Service2.groovy", [])
    }

    void "test spock-report/SpockSampleTestConfig_groovy"() {
        unzipAndTest("spock-report/SpockSampleTestConfig.groovy", [])
    }

    void "test spock-report/report_gradle"() {
        unzipAndTest("spock-report/report.gradle", [])
    }

    void "test spock-report/src/main/groovy/org/spockframework/report/Assets_groovy"() {
        unzipAndTest("spock-report/src/main/groovy/org/spockframework/report/Assets.groovy", [])
    }

    void "test spock-report/src/main/groovy/org/spockframework/report/HtmlReportGenerator_groovy"() {
        unzipAndTest("spock-report/src/main/groovy/org/spockframework/report/HtmlReportGenerator.groovy", [])
    }

    void "test spock-report/src/test/groovy/org/spockframework/report/HtmlReportGeneratorSpec_groovy"() {
        unzipAndTest("spock-report/src/test/groovy/org/spockframework/report/HtmlReportGeneratorSpec.groovy", [])
    }

    void "test spock-report/src/test/groovy/org/spockframework/report/sample/FightOrFlightSpec_groovy"() {
        unzipAndTest("spock-report/src/test/groovy/org/spockframework/report/sample/FightOrFlightSpec.groovy", [])
    }

    void "test spock-report/src/test/groovy/org/spockframework/report/sample/FightOrFlightStory_groovy"() {
        unzipAndTest("spock-report/src/test/groovy/org/spockframework/report/sample/FightOrFlightStory.groovy", [])
    }

    void "test spock-specs/SpockTestConfig_groovy"() {
        unzipAndTest("spock-specs/SpockTestConfig.groovy", [])
    }

    void "test spock-specs/specs_gradle"() {
        unzipAndTest("spock-specs/specs.gradle", [])
    }

    void "test spock-specs/src/test_java1_8/groovy/org/spockframework/smoke/mock/PartialMockingInterfacesWithDefaultMethods_groovy"() {
        unzipAndTest("spock-specs/src/test.java1.8/groovy/org/spockframework/smoke/mock/PartialMockingInterfacesWithDefaultMethods.groovy", [])
    }

    void "test spock-specs/src/test2_4/groovy/org/spockframework/smoke/traits/BasicTraitUsage_groovy"() {
        unzipAndTest("spock-specs/src/test2.4/groovy/org/spockframework/smoke/traits/BasicTraitUsage.groovy", [])
    }

    void "test spock-specs/src/test2_4/groovy/org/spockframework/smoke/traits/MyTrait_groovy"() {
        unzipAndTest("spock-specs/src/test2.4/groovy/org/spockframework/smoke/traits/MyTrait.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/EmbeddedSpecification_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/EmbeddedSpecification.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/ExecutionLog_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/ExecutionLog.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/VerifyExecution_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/VerifyExecution.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/VerifyExecutionExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/VerifyExecutionExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/builder/PojoBuilderSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/builder/PojoBuilderSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/buildsupport/SpecClassFileFinderSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/buildsupport/SpecClassFileFinderSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/example/FeatureUnrolling_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/example/FeatureUnrolling.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/gentyref/GenericTypeReflectorSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/gentyref/GenericTypeReflectorSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/AssertStatementSourcePositionTest_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/AssertStatementSourcePositionTest.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/AstInspectorTest_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/AstInspectorTest.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/DGMMatcherIterator_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/DGMMatcherIterator.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/FieldInitializers_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/FieldInitializers.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/GroovyMopExploration_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/GroovyMopExploration.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/GroovyVarArgs_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/GroovyVarArgs.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/PackageNames_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/PackageNames.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/ReturnStatementSourcePositionTest_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/ReturnStatementSourcePositionTest.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/SourcePositionPhaseConversion_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/SourcePositionPhaseConversion.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/SourcePositionPhaseSemanticAnalysis_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/SourcePositionPhaseSemanticAnalysis.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/groovy/VarArgsSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/groovy/VarArgsSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/idea/IntelliJIdeaSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/idea/IntelliJIdeaSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/junit/DescriptionOfDerivedTestClass_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/junit/DescriptionOfDerivedTestClass.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/junit/JUnitErrorBehavior_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/junit/JUnitErrorBehavior.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/junit/JUnitRuleBehavior_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/junit/JUnitRuleBehavior.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/junit/ObservableRunner_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/junit/ObservableRunner.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/mock/DetachedMockFactorySpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/mock/DetachedMockFactorySpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/mock/DetachedMockSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/mock/DetachedMockSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/mock/MockDetectorSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/mock/MockDetectorSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/mock/response/IterableResponseGeneratorSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/mock/response/IterableResponseGeneratorSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/mock/runtime/JavaMockFactorySpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/mock/runtime/JavaMockFactorySpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/mock/runtime/MockConfigurationSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/mock/runtime/MockConfigurationSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/report/log/ReportLogConfigurationSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/report/log/ReportLogConfigurationSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/report/log/ReportLogEmitterSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/report/log/ReportLogEmitterSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/report/log/ReportLogMergerSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/report/log/ReportLogMergerSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/AsyncRunListenerSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/AsyncRunListenerSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/ClosingOfDataProviders_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/ClosingOfDataProviders.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/ConfigurationScriptLoaderSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/ConfigurationScriptLoaderSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/EstimatedNumberOfIterations_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/EstimatedNumberOfIterations.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/GlobalExtensionRegistrySpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/GlobalExtensionRegistrySpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/GroovyMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/GroovyMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/GroovyRuntimeUtilIsVoidMethodSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/GroovyRuntimeUtilIsVoidMethodSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/GroovyRuntimeUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/GroovyRuntimeUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/JUnitDescriptionGeneratorSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/JUnitDescriptionGeneratorSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/RunContextSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/RunContextSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/SafeIterationNameProviderSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/SafeIterationNameProviderSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/SpecUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/SpecUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/SputnikSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/SputnikSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/StandardStreamsCapturerSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/StandardStreamsCapturerSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/condition/EditDistanceSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/condition/EditDistanceSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/condition/EditPathRendererSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/condition/EditPathRendererSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/runtime/extension/builtin/UnrollNameProviderSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/runtime/extension/builtin/UnrollNameProviderSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/AccessingOldValues_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/AccessingOldValues.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/AssertionErrorMessages_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/AssertionErrorMessages.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/Blocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/Blocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/BuiltInMembersOfClassSpecification_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/BuiltInMembersOfClassSpecification.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/CleanupBlocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/CleanupBlocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/CompileTimeErrorReporting_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/CompileTimeErrorReporting.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/ExpectBlocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/ExpectBlocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/FeatureFiltering_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/FeatureFiltering.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/FeatureMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/FeatureMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/FeatureSorting_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/FeatureSorting.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/FixtureMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/FixtureMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/GroovyCallChain_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/GroovyCallChain.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/InteractionsAndExceptionConditions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/InteractionsAndExceptionConditions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/MethodAccessibility_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/MethodAccessibility.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/MethodExecutionOrder_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/MethodExecutionOrder.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/MisspelledFixtureMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/MisspelledFixtureMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/MixingExpectAndWhenThenBlocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/MixingExpectAndWhenThenBlocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/SetupBlocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/SetupBlocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/SharedFields_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/SharedFields.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/SharedFieldsInSuperclass_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/SharedFieldsInSuperclass.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/SharedVsStaticFields_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/SharedVsStaticFields.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/SpecFields_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/SpecFields.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/SpecInheritance_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/SpecInheritance.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/SpecRecognition_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/SpecRecognition.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/SpecWithoutFeatures_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/SpecWithoutFeatures.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/StackTraceFiltering_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/StackTraceFiltering.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/StaticMethodsInSpecifications_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/StaticMethodsInSpecifications.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/StaticTypeChecking_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/StaticTypeChecking.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/VoidGroovyStaticMethod_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/VoidGroovyStaticMethod.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/VoidMethodCallsInExpectBlocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/VoidMethodCallsInExpectBlocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/VoidMethodCallsInThenBlocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/VoidMethodCallsInThenBlocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/WhenThenBlocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/WhenThenBlocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/WithBlockFailingConditions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/WithBlockFailingConditions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/WithBlockPassingConditions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/WithBlockPassingConditions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/WithBlocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/WithBlocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ConditionEvaluation_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ConditionEvaluation.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ConditionNotSatisfiedErrors_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ConditionNotSatisfiedErrors.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ConditionRendering_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ConditionRendering.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ConditionRenderingSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ConditionRenderingSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ConditionsAndGroovyTruth_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ConditionsAndGroovyTruth.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/DiffedObjectRendering_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/DiffedObjectRendering.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/EqualityComparisonRendering_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/EqualityComparisonRendering.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExceptionConditions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExceptionConditions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExceptionsInConditions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExceptionsInConditions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsInFeatureMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsInFeatureMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsInFields_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsInFields.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsInFixtureMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsInFixtureMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsInHelperMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsInHelperMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsInNestedPositions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsInNestedPositions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsWithMessage_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ExplicitConditionsWithMessage.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ImplicitClosureCallRendering_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ImplicitClosureCallRendering.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/InvalidConditions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/InvalidConditions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/IsRenderedExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/IsRenderedExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/MatcherConditionRendering_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/MatcherConditionRendering.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/MatcherConditions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/MatcherConditions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/MethodConditionEvaluation_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/MethodConditionEvaluation.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/NegativeExceptionConditions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/NegativeExceptionConditions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/PartialConditionEvaluation_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/PartialConditionEvaluation.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/StringComparisonRendering_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/StringComparisonRendering.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/condition/ValueRendering_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/condition/ValueRendering.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/AutoCleanupExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/AutoCleanupExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/ConditionallyIgnoreFeature_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/ConditionallyIgnoreFeature.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/FailsWithExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/FailsWithExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/Fast_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/Fast.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/IgnoreExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/IgnoreExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/IgnoreIfExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/IgnoreIfExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/IgnoreRestExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/IgnoreRestExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/IncludeExcludeFeatures_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/IncludeExcludeFeatures.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/IncludeExcludeFeaturesWithInheritance_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/IncludeExcludeFeaturesWithInheritance.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/IncludeExcludeSpecs_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/IncludeExcludeSpecs.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/IncludeExcludeSpecsAndFeatures_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/IncludeExcludeSpecsAndFeatures.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/IncludeExcludeSpecsWithInheritance_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/IncludeExcludeSpecsWithInheritance.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/IssueExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/IssueExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/NarrativeExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/NarrativeExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/PendingFeatureExtensionSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/PendingFeatureExtensionSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/ReportLogExtensionSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/ReportLogExtensionSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/RequiresExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/RequiresExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/RestoreSystemPropertiesExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/RestoreSystemPropertiesExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/SeeExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/SeeExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/Slow_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/Slow.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/StepwiseExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/StepwiseExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/TimeoutExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/TimeoutExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/extension/TitleExtension_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/extension/TitleExtension.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/groovy/UsageOfNotYetImplemented_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/groovy/UsageOfNotYetImplemented.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/HandlingOfAssumptionViolatedException_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/HandlingOfAssumptionViolatedException.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitClassRules_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitClassRules.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitCompliance_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitCompliance.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitComplianceIgnoredTestClass_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitComplianceIgnoredTestClass.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitFixtureMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitFixtureMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitMethodRuleOrder_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitMethodRuleOrder.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitRules_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitRules.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitTestRuleOrder_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/JUnitTestRuleOrder.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/RulesAndInheritance_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/RulesAndInheritance.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/UseJUnitClassRule_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/UseJUnitClassRule.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/UseJUnitTestNameRule_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/UseJUnitTestNameRule.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/junit/UseJUnitTimeoutRule_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/junit/UseJUnitTimeoutRule.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/ArgumentCapturing_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/ArgumentCapturing.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/ArgumentMatching_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/ArgumentMatching.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/ChainedResponseGenerators_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/ChainedResponseGenerators.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/ErrorReporting_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/ErrorReporting.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/ExplicitInteractions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/ExplicitInteractions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/GenericMockInvocations_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/GenericMockInvocations.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/GlobalInteractions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/GlobalInteractions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/GroovyMocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/GroovyMocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/GroovyMocksForGroovyClasses_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/GroovyMocksForGroovyClasses.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/GroovyMocksForInterfaces_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/GroovyMocksForInterfaces.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/GroovySpiesThatAreGlobal_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/GroovySpiesThatAreGlobal.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/InteractionScopes_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/InteractionScopes.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/InteractionsReferencingFieldsAndProperties_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/InteractionsReferencingFieldsAndProperties.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/InteractionsWithPropertySyntax_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/InteractionsWithPropertySyntax.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/InvalidMockCreation_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/InvalidMockCreation.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/InvokingMocksFromMultipleThreads_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/InvokingMocksFromMultipleThreads.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/JavaMocksDefaultBehavior_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/JavaMocksDefaultBehavior.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/JavaMocksForGroovyClasses_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/JavaMocksForGroovyClasses.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/JavaSpies_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/JavaSpies.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/JavaStubs_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/JavaStubs.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MethodMatching_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MethodMatching.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockBasics_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockBasics.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockCreationWithClosure_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockCreationWithClosure.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockDefaultResponses_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockDefaultResponses.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockNames_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockNames.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockProxyCaching_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockProxyCaching.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockingAndBridgeMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockingAndBridgeMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockingClosures_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockingClosures.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockingMethodsWithNamedParameters_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockingMethodsWithNamedParameters.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockingMethodsWithVarArgParameters_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockingMethodsWithVarArgParameters.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockingOfVarArgParametersUserContributedSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/MockingOfVarArgParametersUserContributedSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/OrderedInteractions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/OrderedInteractions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/OverlappingInteractions_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/OverlappingInteractions.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/PartialMocking_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/PartialMocking.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/ResponseGenerators_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/ResponseGenerators.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/SpreadWildcardUsage_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/SpreadWildcardUsage.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/SpyBasics_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/SpyBasics.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/StubBasics_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/StubBasics.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/StubDefaultResponses_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/StubDefaultResponses.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/StubDefaultResponsesWithGenericMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/StubDefaultResponsesWithGenericMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/TargetMatching_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/TargetMatching.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/TooFewInvocations_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/TooFewInvocations.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/TooManyInvocations_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/TooManyInvocations.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/ValidMockCreation_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/ValidMockCreation.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/ValidMockCreationInDerivedClass_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/ValidMockCreationInDerivedClass.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/mock/WildcardUsages_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/mock/WildcardUsages.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/DataProviders_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/DataProviders.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/DataTables_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/DataTables.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/InvalidWhereBlocks_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/InvalidWhereBlocks.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/MethodParameters_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/MethodParameters.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/ParameterizationScopes_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/ParameterizationScopes.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/Parameterizations_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/Parameterizations.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/SqlDataSource_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/SqlDataSource.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/UnrolledFeatureMethods_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/smoke/parameterization/UnrolledFeatureMethods.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/AbstractMultisetSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/AbstractMultisetSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/CollectionUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/CollectionUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/ConsoleUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/ConsoleUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/ExceptionUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/ExceptionUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/GroovyUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/GroovyUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/HashMultisetSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/HashMultisetSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/IoUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/IoUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/JsonWriterSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/JsonWriterSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/LinkedHashMultisetSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/LinkedHashMultisetSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/ObjectUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/ObjectUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/ReflectionUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/ReflectionUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/SpockReleaseInfoSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/SpockReleaseInfoSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/StringMessagePrintStreamSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/StringMessagePrintStreamSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/TeePrintStreamSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/TeePrintStreamSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/TextUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/TextUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/TimeUtilSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/TimeUtilSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/util/VersionNumberSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/util/VersionNumberSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/org/spockframework/verifyall/VerifyAllSpecification_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/org/spockframework/verifyall/VerifyAllSpecification.groovy", [])
    }

    void "test spock-specs/src/test/groovy/spock/util/ExceptionsSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/spock/util/ExceptionsSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/spock/util/JvmSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/spock/util/JvmSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/spock/util/OperatingSystemSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/spock/util/OperatingSystemSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/spock/util/concurrent/AsyncConditionsSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/spock/util/concurrent/AsyncConditionsSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/spock/util/concurrent/BlockingVariableSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/spock/util/concurrent/BlockingVariableSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/spock/util/concurrent/BlockingVariablesSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/spock/util/concurrent/BlockingVariablesSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/spock/util/concurrent/PollingConditionsSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/spock/util/concurrent/PollingConditionsSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/spock/util/matcher/IsCloseToSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/spock/util/matcher/IsCloseToSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/spock/util/mop/ConfineMetaClassChangesSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/spock/util/mop/ConfineMetaClassChangesSpec.groovy", [])
    }

    void "test spock-specs/src/test/groovy/spock/util/mop/UseSpec_groovy"() {
        unzipAndTest("spock-specs/src/test/groovy/spock/util/mop/UseSpec.groovy", [])
    }

    void "test spock-spring/boot-test/boot-test_gradle"() {
        unzipAndTest("spock-spring/boot-test/boot-test.gradle", [])
    }

    void "test spock-spring/boot-test/src/test/groovy/org/spockframework/boot/DataJpaTestIntegrationSpec_groovy"() {
        unzipAndTest("spock-spring/boot-test/src/test/groovy/org/spockframework/boot/DataJpaTestIntegrationSpec.groovy", [])
    }

    void "test spock-spring/boot-test/src/test/groovy/org/spockframework/boot/SimpleBootAppIntegrationSpec_groovy"() {
        unzipAndTest("spock-spring/boot-test/src/test/groovy/org/spockframework/boot/SimpleBootAppIntegrationSpec.groovy", [])
    }

    void "test spock-spring/boot-test/src/test/groovy/org/spockframework/boot/SpringBootTestAnnotationIntegrationSpec_groovy"() {
        unzipAndTest("spock-spring/boot-test/src/test/groovy/org/spockframework/boot/SpringBootTestAnnotationIntegrationSpec.groovy", [])
    }

    void "test spock-spring/boot-test/src/test/groovy/org/spockframework/boot/WebMvcTestIntegrationSpec_groovy"() {
        unzipAndTest("spock-spring/boot-test/src/test/groovy/org/spockframework/boot/WebMvcTestIntegrationSpec.groovy", [])
    }

    void "test spock-spring/spring_gradle"() {
        unzipAndTest("spock-spring/spring.gradle", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/ContextHierarchyExample_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/ContextHierarchyExample.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/DirtiesContextExample_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/DirtiesContextExample.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/IService1_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/IService1.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/IService2_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/IService2.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/InjectionExamples_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/InjectionExamples.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/MockInjectionExample_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/MockInjectionExample.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/MockInjectionWithEmbeddedConfig_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/MockInjectionWithEmbeddedConfig.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/Service1_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/Service1.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/Service2_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/Service2.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/SpringSpecInheritance_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/SpringSpecInheritance.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/TransactionalExample_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/TransactionalExample.groovy", [])
    }

    void "test spock-spring/src/test/groovy/org/spockframework/spring/TransactionalGroovySqlExample_groovy"() {
        unzipAndTest("spock-spring/src/test/groovy/org/spockframework/spring/TransactionalGroovySqlExample.groovy", [])
    }

    void "test spock-tapestry/src/test/groovy/org/spockframework/tapestry/BeforeRegistryCreatedMethod_groovy"() {
        unzipAndTest("spock-tapestry/src/test/groovy/org/spockframework/tapestry/BeforeRegistryCreatedMethod.groovy", [])
    }

    void "test spock-tapestry/src/test/groovy/org/spockframework/tapestry/InjectionExamples_groovy"() {
        unzipAndTest("spock-tapestry/src/test/groovy/org/spockframework/tapestry/InjectionExamples.groovy", [])
    }

    void "test spock-tapestry/src/test/groovy/org/spockframework/tapestry/TapestrySpecInheritance_groovy"() {
        unzipAndTest("spock-tapestry/src/test/groovy/org/spockframework/tapestry/TapestrySpecInheritance.groovy", [])
    }

    void "test spock-tapestry/tapestry_gradle"() {
        unzipAndTest("spock-tapestry/tapestry.gradle", [])
    }

    void "test spock-unitils/src/test/groovy/org/spockframework/unitils/dbunit/User_groovy"() {
        unzipAndTest("spock-unitils/src/test/groovy/org/spockframework/unitils/dbunit/User.groovy", [])
    }

    void "test spock-unitils/src/test/groovy/org/spockframework/unitils/dbunit/UserDao_groovy"() {
        unzipAndTest("spock-unitils/src/test/groovy/org/spockframework/unitils/dbunit/UserDao.groovy", [])
    }

    void "test spock-unitils/src/test/groovy/org/spockframework/unitils/dbunit/UserDaoSpec_groovy"() {
        unzipAndTest("spock-unitils/src/test/groovy/org/spockframework/unitils/dbunit/UserDaoSpec.groovy", [])
    }

    void "test spock-unitils/unitils_gradle"() {
        unzipAndTest("spock-unitils/unitils.gradle", [])
    }


    /*************************************/
    static unzipAndTest(String entryName, List ignoreClazzList, Map<String, String> replacementsMap=[:]) {
        ignoreClazzList.addAll(TestUtils.COMMON_IGNORE_CLASS_LIST)

        TestUtils.unzipAndTest(ZIP_PATH, entryName, TestUtils.addIgnore(ignoreClazzList, ASTComparatorCategory.LOCATION_IGNORE_LIST), replacementsMap)
    }


    public static final String ZIP_PATH = "$TestUtils.RESOURCES_PATH/spock-spock-1.1-rc-2/spock-spock-1.1-rc-2-allsources.zip";

}