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
 * Add Geb 1.0 sources as test cases
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * Created on    2016/10/12
 */
@CompileStatic
class Geb10SourcesTest extends GroovyTestCase {


    void "test buildSrc/build_gradle"() {
        unzipAndTest("buildSrc/build.gradle", [])
    }

    void "test compatibility/groovy-2_3_7/groovy-2_3_7_gradle"() {
        unzipAndTest("compatibility/groovy-2.3.7/groovy-2.3.7.gradle", [])
    }

    void "test compatibility/groovy-2_3_7/src/test/groovy/geb/NavigatorCompatibilitySpec_groovy"() {
        unzipAndTest("compatibility/groovy-2.3.7/src/test/groovy/geb/NavigatorCompatibilitySpec.groovy", [])
    }

    void "test compatibility/spock-1_1/spock-1_1_gradle"() {
        unzipAndTest("compatibility/spock-1.1/spock-1.1.gradle", [])
    }

    void "test compatibility/spock-1_1/src/test/groovy/geb/transform/implicitassertions/Spock1Dot1IntegrationSpec_groovy"() {
        unzipAndTest("compatibility/spock-1.1/src/test/groovy/geb/transform/implicitassertions/Spock1Dot1IntegrationSpec.groovy", [])
    }

    void "test doc/manual-snippets/manual-snippets_gradle"() {
        unzipAndTest("doc/manual-snippets/manual-snippets.gradle", [])
    }

    void "test doc/manual-snippets/src/realBrowserTest/groovy/fixture/GebSpecWithServerUsingJavascript_groovy"() {
        unzipAndTest("doc/manual-snippets/src/realBrowserTest/groovy/fixture/GebSpecWithServerUsingJavascript.groovy", [])
    }

    void "test doc/manual-snippets/src/realBrowserTest/groovy/javascript/JQuerySupportSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/realBrowserTest/groovy/javascript/JQuerySupportSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/realBrowserTest/groovy/navigator/BackspaceSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/realBrowserTest/groovy/navigator/BackspaceSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/realBrowserTest/groovy/navigator/ControlClickSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/realBrowserTest/groovy/navigator/ControlClickSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/realBrowserTest/groovy/navigator/DragAndDropSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/realBrowserTest/groovy/navigator/DragAndDropSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/realBrowserTest/groovy/navigator/InteractionsSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/realBrowserTest/groovy/navigator/InteractionsSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/realBrowserTest/groovy/navigator/NonCharacterKeystrokesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/realBrowserTest/groovy/navigator/NonCharacterKeystrokesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/realBrowserTest/groovy/pages/ToWaitOptionSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/realBrowserTest/groovy/pages/ToWaitOptionSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/realBrowserTest/resources/GebConfig_groovy"() {
        unzipAndTest("doc/manual-snippets/src/realBrowserTest/resources/GebConfig.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/assertions/ImplicitAssertionsExamplePage_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/assertions/ImplicitAssertionsExamplePage.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/assertions/ImplicitAssertionsIntroductionSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/assertions/ImplicitAssertionsIntroductionSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/assertions/ImplicitAssertionsSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/assertions/ImplicitAssertionsSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/binding/BindingUpdatingSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/binding/BindingUpdatingSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/BrowserCreationSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/BrowserCreationSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/ContentDslToParameterSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/ContentDslToParameterSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/DriveSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/DriveSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/GoSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/GoSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/GoogleSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/GoogleSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/PageChangeListenerSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/PageChangeListenerSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/PageSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/PageSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/QuitSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/QuitSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/ViaSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/ViaSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/WithNewWindowSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/WithNewWindowSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/browser/WithWindowSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/browser/WithWindowSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/AtCheckWaitingConfigSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/AtCheckWaitingConfigSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/AutoClearCookiesConfigSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/AutoClearCookiesConfigSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/BaseNavigatorWaitingConfigSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/BaseNavigatorWaitingConfigSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/DriverConfigSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/DriverConfigSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/FunctionalSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/FunctionalSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/InlineConfigurationLoader_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/InlineConfigurationLoader.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/NavigatorFactoryConfigSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/NavigatorFactoryConfigSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/ReportOnTestFailuresConfigSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/ReportOnTestFailuresConfigSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/ReporterConfigSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/ReporterConfigSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/ReportsDirConfigSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/ReportsDirConfigSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/TemporaryFolderProvider_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/TemporaryFolderProvider.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/UnexpectedPagesConfigSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/UnexpectedPagesConfigSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/configuration/WaitingConfigSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/configuration/WaitingConfigSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/downloading/DownloadingConfigurationSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/downloading/DownloadingConfigurationSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/downloading/DownloadingSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/downloading/DownloadingSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/downloading/FineGrainedRequestSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/downloading/FineGrainedRequestSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/downloading/UntrustedCertificatesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/downloading/UntrustedCertificatesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/driver/HtmlUnitRefreshHandlerSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/driver/HtmlUnitRefreshHandlerSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/fixture/Browser_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/fixture/Browser.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/fixture/DriveMethodSupportingSpecWithServer_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/fixture/DriveMethodSupportingSpecWithServer.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/ide/StrongTypingSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/ide/StrongTypingSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/intro/GebHomepageSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/intro/GebHomepageSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/intro/IntroSamplesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/intro/IntroSamplesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/intro/ScriptingSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/intro/ScriptingSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/intro/module/HighlightsModule_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/intro/module/HighlightsModule.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/intro/module/SelectableLinkModule_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/intro/module/SelectableLinkModule.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/intro/page/GebHomePage_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/intro/page/GebHomePage.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/javascript/AccessingVariablesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/javascript/AccessingVariablesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/javascript/AlertSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/javascript/AlertSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/javascript/CallingMethodsSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/javascript/CallingMethodsSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/javascript/ConfirmSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/javascript/ConfirmSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/javascript/CustomMessageSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/javascript/CustomMessageSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/javascript/ExecutingArbitraryCodeSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/javascript/ExecutingArbitraryCodeSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/javascript/JavaScriptExecutorSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/javascript/JavaScriptExecutorSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/javascript/WaitingExamplesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/javascript/WaitingExamplesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/BaseAndContextSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/BaseAndContextSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/CheckboxSnippetSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/CheckboxSnippetSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/CombinedModuleBaseSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/CombinedModuleBaseSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/FileInputSnippetSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/FileInputSnippetSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/FormContentSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/FormContentSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/FormElementSnippetSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/FormElementSnippetSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/IntroductionSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/IntroductionSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/ModuleIsANavigatorSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/ModuleIsANavigatorSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/MultipleSelectSnippetSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/MultipleSelectSnippetSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/RadioButtonsSnippetSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/RadioButtonsSnippetSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/RepeatingContentSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/RepeatingContentSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/ReusingModulesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/ReusingModulesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/SelectSnippetSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/SelectSnippetSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/TextInputSnippetSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/TextInputSnippetSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/TextareaSnippetSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/TextareaSnippetSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/modules/UnwrappingModulesSnippetSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/modules/UnwrappingModulesSnippetSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/CheckboxSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/CheckboxSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/ClickingSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/ClickingSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/CompositionSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/CompositionSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/CssPropertiesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/CssPropertiesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/DollarExamplesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/DollarExamplesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/EqualsSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/EqualsSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/FileUploadSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/FileUploadSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/FindingAndFilteringSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/FindingAndFilteringSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/FormShortcutsSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/FormShortcutsSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/IterableSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/IterableSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/KeystrokesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/KeystrokesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/MultiSelectSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/MultiSelectSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/RadioSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/RadioSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/SelectSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/SelectSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/SizeAndLocationSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/SizeAndLocationSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/TagTextClassesAttributesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/TagTextClassesAttributesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/TextInputAndAreaSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/TextInputAndAreaSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/navigator/TraversingSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/navigator/TraversingSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/AdvancedNavigationSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/AdvancedNavigationSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/AliasingSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/AliasingSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/AtSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/AtSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/ContentDslSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/ContentDslSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/FramesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/FramesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/LifecycleHooksSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/LifecycleHooksSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/PageAtCheckWaitingSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/PageAtCheckWaitingSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/PageInheritanceSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/PageInheritanceSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/PageObjectPatternSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/PageObjectPatternSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/PageUrlSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/PageUrlSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/ParameterizedPageSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/ParameterizedPageSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/TemplateOptionsSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/TemplateOptionsSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/pages/UnexpectedPagesSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/pages/UnexpectedPagesSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/reporting/ReportingListenerSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/reporting/ReportingListenerSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/reporting/ReportingSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/reporting/ReportingSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/testing/FunctionalSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/testing/FunctionalSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/groovy/testing/ReportingFunctionalSpec_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/groovy/testing/ReportingFunctionalSpec.groovy", [])
    }

    void "test doc/manual-snippets/src/test/resources/gebScript_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/resources/gebScript.groovy", [])
    }

    void "test doc/manual-snippets/src/test/resources/gebScriptUsingPages_groovy"() {
        unzipAndTest("doc/manual-snippets/src/test/resources/gebScriptUsingPages.groovy", [])
    }

    void "test doc/manual/manual_gradle"() {
        unzipAndTest("doc/manual/manual.gradle", [])
    }

    void "test doc/site/site_gradle"() {
        unzipAndTest("doc/site/site.gradle", [])
    }

    void "test doc/site/src/main/groovy/geb/site/Manuals_groovy"() {
        unzipAndTest("doc/site/src/main/groovy/geb/site/Manuals.groovy", [])
    }

    void "test doc/site/src/ratpack/Ratpack_groovy"() {
        unzipAndTest("doc/site/src/ratpack/Ratpack.groovy", [])
    }

    void "test doc/site/src/test/groovy/geb/LinkCrawlSpec_groovy"() {
        unzipAndTest("doc/site/src/test/groovy/geb/LinkCrawlSpec.groovy", [])
    }

    void "test doc/site/src/test/groovy/geb/SiteSmokeSpec_groovy"() {
        unzipAndTest("doc/site/src/test/groovy/geb/SiteSmokeSpec.groovy", [])
    }

    void "test doc/site/src/test/groovy/geb/crawl/Crawler_groovy"() {
        unzipAndTest("doc/site/src/test/groovy/geb/crawl/Crawler.groovy", [])
    }

    void "test doc/site/src/test/groovy/geb/crawl/PrettyPrintCollection_groovy"() {
        unzipAndTest("doc/site/src/test/groovy/geb/crawl/PrettyPrintCollection.groovy", [])
    }

    void "test doc/site/src/test/groovy/geb/modules/MenuItemModule_groovy"() {
        unzipAndTest("doc/site/src/test/groovy/geb/modules/MenuItemModule.groovy", [])
    }

    void "test doc/site/src/test/groovy/geb/pages/ApiPage_groovy"() {
        unzipAndTest("doc/site/src/test/groovy/geb/pages/ApiPage.groovy", [])
    }

    void "test doc/site/src/test/groovy/geb/pages/ContentPage_groovy"() {
        unzipAndTest("doc/site/src/test/groovy/geb/pages/ContentPage.groovy", [])
    }

    void "test doc/site/src/test/groovy/geb/pages/ManualPage_groovy"() {
        unzipAndTest("doc/site/src/test/groovy/geb/pages/ManualPage.groovy", [])
    }

    void "test doc/site/src/test/groovy/geb/pages/NotFoundPage_groovy"() {
        unzipAndTest("doc/site/src/test/groovy/geb/pages/NotFoundPage.groovy", [])
    }

    void "test geb_gradle"() {
        unzipAndTest("geb.gradle", [])
    }

    void "test gradle/codenarc/rulesets_groovy"() {
        unzipAndTest("gradle/codenarc/rulesets.groovy", [])
    }

    void "test gradle/idea_gradle"() {
        unzipAndTest("gradle/idea.gradle", [])
    }

    void "test gradle/pom_gradle"() {
        unzipAndTest("gradle/pom.gradle", [])
    }

    void "test integration/geb-gradle/geb-gradle_gradle"() {
        unzipAndTest("integration/geb-gradle/geb-gradle.gradle", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/browserstack/BrowserStackAccount_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/browserstack/BrowserStackAccount.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/browserstack/BrowserStackExtension_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/browserstack/BrowserStackExtension.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/browserstack/BrowserStackPlugin_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/browserstack/BrowserStackPlugin.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/browserstack/BrowserStackTunnel_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/browserstack/BrowserStackTunnel.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/browserstack/task/DownloadBrowserStackTunnel_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/browserstack/task/DownloadBrowserStackTunnel.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/cloud/BrowserSpec_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/cloud/BrowserSpec.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/cloud/ExternalTunnel_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/cloud/ExternalTunnel.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/cloud/task/StartExternalTunnel_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/cloud/task/StartExternalTunnel.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/cloud/task/StopExternalTunnel_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/cloud/task/StopExternalTunnel.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/SauceAccount_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/SauceAccount.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/SauceConnect_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/SauceConnect.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/SauceConnectOperations_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/SauceConnectOperations.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/SauceLabsExtension_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/SauceLabsExtension.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/SaucePlugin_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/SaucePlugin.groovy", [])
    }

    void "test integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/UnpackSauceConnect_groovy"() {
        unzipAndTest("integration/geb-gradle/src/main/groovy/geb/gradle/saucelabs/UnpackSauceConnect.groovy", [])
    }

    void "test integration/geb-grails/geb-grails_gradle"() {
        unzipAndTest("integration/geb-grails/geb-grails.gradle", [])
    }

    void "test integration/geb-grails/grails-app/conf/BuildConfig_groovy"() {
        unzipAndTest("integration/geb-grails/grails-app/conf/BuildConfig.groovy", [])
    }

    void "test integration/geb-grails/grails-app/conf/DataSource_groovy"() {
        unzipAndTest("integration/geb-grails/grails-app/conf/DataSource.groovy", [])
    }

    void "test integration/geb-grails/grails-app/conf/UrlMappings_groovy"() {
        unzipAndTest("integration/geb-grails/grails-app/conf/UrlMappings.groovy", [])
    }

    void "test integration/geb-grails/grails-app/controllers/TheController_groovy"() {
        unzipAndTest("integration/geb-grails/grails-app/controllers/TheController.groovy", [])
    }

    void "test integration/geb-grails/scripts/_Events_groovy"() {
        unzipAndTest("integration/geb-grails/scripts/_Events.groovy", [])
    }

    void "test integration/geb-grails/test/functional/grails/plugin/geb/DivModule_groovy"() {
        unzipAndTest("integration/geb-grails/test/functional/grails/plugin/geb/DivModule.groovy", [])
    }

    void "test integration/geb-grails/test/functional/grails/plugin/geb/GEB32Spec_groovy"() {
        unzipAndTest("integration/geb-grails/test/functional/grails/plugin/geb/GEB32Spec.groovy", [])
    }

    void "test integration/geb-grails/test/functional/grails/plugin/geb/IndexPage_groovy"() {
        unzipAndTest("integration/geb-grails/test/functional/grails/plugin/geb/IndexPage.groovy", [])
    }

    void "test integration/geb-grails/test/functional/grails/plugin/geb/JUnit4SmokeTest_groovy"() {
        unzipAndTest("integration/geb-grails/test/functional/grails/plugin/geb/JUnit4SmokeTest.groovy", [])
    }

    void "test integration/geb-grails/test/functional/grails/plugin/geb/OtherPage_groovy"() {
        unzipAndTest("integration/geb-grails/test/functional/grails/plugin/geb/OtherPage.groovy", [])
    }

    void "test integration/geb-grails/test/functional/grails/plugin/geb/SmokeSpec_groovy"() {
        unzipAndTest("integration/geb-grails/test/functional/grails/plugin/geb/SmokeSpec.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/GebConfig_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/GebConfig.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/Android_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/Android.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/CallbackAndWebDriverServer_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/CallbackAndWebDriverServer.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/CallbackHttpServer_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/CallbackHttpServer.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/CallbackHttpsServer_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/CallbackHttpsServer.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/CallbackServlet_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/CallbackServlet.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/GebSpec_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/GebSpec.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/GebSpecWithCallbackServer_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/GebSpecWithCallbackServer.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/GebSpecWithServer_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/GebSpecWithServer.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/RemoteWebDriverWithExpectations_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/RemoteWebDriverWithExpectations.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/RequiresRealBrowser_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/RequiresRealBrowser.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/TestHttpServer_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/TestHttpServer.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/test/WebDriverServer_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/test/WebDriverServer.groovy", [])
    }

    void "test internal/test-support/src/main/groovy/geb/transform/implicitassertions/TransformTestHelper_groovy"() {
        unzipAndTest("internal/test-support/src/main/groovy/geb/transform/implicitassertions/TransformTestHelper.groovy", [])
    }

    void "test internal/test-support/src/main/resources/SpockConfig_groovy"() {
        unzipAndTest("internal/test-support/src/main/resources/SpockConfig.groovy", [])
    }

    void "test internal/test-support/test-support_gradle"() {
        unzipAndTest("internal/test-support/test-support.gradle", [])
    }

    void "test module/geb-ast/geb-ast_gradle"() {
        unzipAndTest("module/geb-ast/geb-ast.gradle", [])
    }

    void "test module/geb-ast/src/main/groovy/geb/navigator/AttributeAccessingMetaClass_groovy"() {
        unzipAndTest("module/geb-ast/src/main/groovy/geb/navigator/AttributeAccessingMetaClass.groovy", [])
    }

    void "test module/geb-ast/src/main/groovy/geb/transform/AttributeAccessingMetaClassRegisteringTransformation_groovy"() {
        unzipAndTest("module/geb-ast/src/main/groovy/geb/transform/AttributeAccessingMetaClassRegisteringTransformation.groovy", [])
    }

    void "test module/geb-ast/src/main/groovy/geb/transform/AttributeAccessingMetaClassRegistrar_groovy"() {
        unzipAndTest("module/geb-ast/src/main/groovy/geb/transform/AttributeAccessingMetaClassRegistrar.groovy", [])
    }

    void "test module/geb-core/geb-core_gradle"() {
        unzipAndTest("module/geb-core/geb-core.gradle", [])
    }

    void "test module/geb-core/src/main/groovy/geb/AtVerificationResult_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/AtVerificationResult.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/Browser_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/Browser.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/BuildAdapter_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/BuildAdapter.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/Configuration_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/Configuration.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/ConfigurationLoader_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/ConfigurationLoader.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/Initializable_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/Initializable.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/Module_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/Module.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/Page_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/Page.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/PageChangeListener_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/PageChangeListener.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/binding/BindingUpdater_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/binding/BindingUpdater.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/buildadapter/BuildAdapterFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/buildadapter/BuildAdapterFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/buildadapter/SystemPropertiesBuildAdapter_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/buildadapter/SystemPropertiesBuildAdapter.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/DefaultPageContentSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/DefaultPageContentSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/ModuleBaseCalculator_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/ModuleBaseCalculator.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/ModuleBaseDefinitionDelegate_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/ModuleBaseDefinitionDelegate.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/Navigable_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/Navigable.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/NavigableSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/NavigableSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/PageContentContainer_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/PageContentContainer.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/PageContentNames_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/PageContentNames.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/PageContentSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/PageContentSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/PageContentTemplate_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/PageContentTemplate.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/PageContentTemplateBuilder_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/PageContentTemplateBuilder.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/PageContentTemplateFactoryDelegate_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/PageContentTemplateFactoryDelegate.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/PageContentTemplateParams_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/PageContentTemplateParams.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/StringRepresentationProvider_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/StringRepresentationProvider.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/TemplateDerivedContentStringRepresentationProvider_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/TemplateDerivedContentStringRepresentationProvider.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/TemplateDerivedPageContent_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/TemplateDerivedPageContent.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/UninitializedNavigableSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/UninitializedNavigableSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/content/UninitializedPageContentSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/content/UninitializedPageContentSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/download/DefaultDownloadSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/download/DefaultDownloadSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/download/DownloadSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/download/DownloadSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/download/UninitializedDownloadSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/download/UninitializedDownloadSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/download/helper/SelfSignedCertificateHelper_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/download/helper/SelfSignedCertificateHelper.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/driver/BrowserStackDriverFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/driver/BrowserStackDriverFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/driver/CachingDriverFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/driver/CachingDriverFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/driver/CallbackDriverFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/driver/CallbackDriverFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/driver/CloudDriverFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/driver/CloudDriverFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/driver/DefaultDriverFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/driver/DefaultDriverFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/driver/DriverFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/driver/DriverFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/driver/DriverRegistry_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/driver/DriverRegistry.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/driver/NameBasedDriverFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/driver/NameBasedDriverFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/driver/RemoteDriverOperations_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/driver/RemoteDriverOperations.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/driver/SauceLabsDriverFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/driver/SauceLabsDriverFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/error/SingleElementNavigatorOnlyMethodException_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/error/SingleElementNavigatorOnlyMethodException.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/frame/DefaultFrameSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/frame/DefaultFrameSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/frame/FrameSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/frame/FrameSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/frame/UninitializedFrameSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/frame/UninitializedFrameSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/interaction/DefaultInteractionsSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/interaction/DefaultInteractionsSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/interaction/InteractDelegate_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/interaction/InteractDelegate.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/interaction/InteractionsSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/interaction/InteractionsSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/interaction/UninitializedInteractionSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/interaction/UninitializedInteractionSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/js/AlertAndConfirmSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/js/AlertAndConfirmSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/js/DefaultAlertAndConfirmSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/js/DefaultAlertAndConfirmSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/js/JQueryAdapter_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/js/JQueryAdapter.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/js/JavascriptInterface_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/js/JavascriptInterface.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/js/UninitializedAlertAndConfirmSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/js/UninitializedAlertAndConfirmSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/module/AbstractInput_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/module/AbstractInput.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/module/Checkbox_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/module/Checkbox.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/module/FileInput_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/module/FileInput.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/module/FormElement_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/module/FormElement.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/module/MultipleSelect_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/module/MultipleSelect.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/module/RadioButtons_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/module/RadioButtons.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/module/Select_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/module/Select.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/module/TextInput_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/module/TextInput.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/module/Textarea_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/module/Textarea.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/AbstractNavigator_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/AbstractNavigator.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/BasicLocator_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/BasicLocator.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/CssSelector_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/CssSelector.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/DefaultLocator_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/DefaultLocator.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/EmptyNavigator_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/EmptyNavigator.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/Locator_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/Locator.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/Navigator_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/Navigator.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/NonEmptyNavigator_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/NonEmptyNavigator.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/SearchContextBasedBasicLocator_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/SearchContextBasedBasicLocator.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/SelectFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/SelectFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/factory/AbstractNavigatorFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/factory/AbstractNavigatorFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/factory/BrowserBackedNavigatorFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/factory/BrowserBackedNavigatorFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/factory/ClosureInnerNavigatorFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/factory/ClosureInnerNavigatorFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/factory/DefaultInnerNavigatorFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/factory/DefaultInnerNavigatorFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/factory/InnerNavigatorFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/factory/InnerNavigatorFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/factory/NavigatorBackedNavigatorFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/factory/NavigatorBackedNavigatorFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/navigator/factory/NavigatorFactory_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/navigator/factory/NavigatorFactory.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/report/CompositeReporter_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/report/CompositeReporter.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/report/ExceptionToPngConverter_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/report/ExceptionToPngConverter.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/report/PageSourceReporter_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/report/PageSourceReporter.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/report/ReportState_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/report/ReportState.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/report/Reporter_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/report/Reporter.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/report/ReporterSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/report/ReporterSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/report/ReportingListener_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/report/ReportingListener.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/report/ScreenshotReporter_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/report/ScreenshotReporter.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/textmatching/NegatedTextMatcher_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/textmatching/NegatedTextMatcher.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/textmatching/PatternTextMatcher_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/textmatching/PatternTextMatcher.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/textmatching/TextMatcher_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/textmatching/TextMatcher.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/textmatching/TextMatchingSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/textmatching/TextMatchingSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/waiting/DefaultWaitingSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/waiting/DefaultWaitingSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/waiting/UninitializedWaitingSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/waiting/UninitializedWaitingSupport.groovy", [])
    }

    void "test module/geb-core/src/main/groovy/geb/waiting/WaitingSupport_groovy"() {
        unzipAndTest("module/geb-core/src/main/groovy/geb/waiting/WaitingSupport.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/GebConfigBothScriptAndClass_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/GebConfigBothScriptAndClass.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/GebConfigClassOnly_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/GebConfigClassOnly.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/AlertAndConfirmHandlingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/AlertAndConfirmHandlingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/BadContentDefinitionsSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/BadContentDefinitionsSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/BrowserSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/BrowserSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/CallingWithMethodOnPageSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/CallingWithMethodOnPageSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/ConfigurationSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/ConfigurationSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/ContentAccessShortcutsSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/ContentAccessShortcutsSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/ContentToStringSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/ContentToStringSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/ContentUnwrappingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/ContentUnwrappingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/DriveSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/DriveSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/JavascriptInterfaceSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/JavascriptInterfaceSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/ModulesSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/ModulesSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/NavigableSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/NavigableSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/PageChangeListeningSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/PageChangeListeningSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/PageContentNameSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/PageContentNameSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/PageLoadUnloadListeningSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/PageLoadUnloadListeningSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/PageOrientedSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/PageOrientedSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/PropertiesInModuleContentSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/PropertiesInModuleContentSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/RemoteDriverSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/RemoteDriverSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/RemovedModuleMethodsSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/RemovedModuleMethodsSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/UnexpectedPagesSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/UnexpectedPagesSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/UrlCalculationSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/UrlCalculationSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/ViaSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/ViaSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/binding/BindingUpdaterSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/binding/BindingUpdaterSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/conf/BaseUrlConfigurationSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/conf/BaseUrlConfigurationSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/conf/ConfigurationDriverCreationSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/conf/ConfigurationDriverCreationSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/conf/ConfigurationLoaderSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/conf/ConfigurationLoaderSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/conf/ConfigurationNavigatorFactorySpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/conf/ConfigurationNavigatorFactorySpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/conf/DriverCachingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/conf/DriverCachingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/conf/WaitingConfigurationSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/conf/WaitingConfigurationSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/download/DownloadingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/download/DownloadingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/download/HttpsDownloadingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/download/HttpsDownloadingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/driver/DriverWithInvalidGetCurrentUrlImplementationSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/driver/DriverWithInvalidGetCurrentUrlImplementationSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/driver/RemoteDriverOperationsSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/driver/RemoteDriverOperationsSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/driver/WebDriverCommandsSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/driver/WebDriverCommandsSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/frame/BaseFrameSupportSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/frame/BaseFrameSupportSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/frame/BasicFrameSupportSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/frame/BasicFrameSupportSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/frame/FrameSupportSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/frame/FrameSupportSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/interaction/InteractionsSupportSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/interaction/InteractionsSupportSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/js/JQueryAdapterSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/js/JQueryAdapterSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/CheckboxBaseSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/CheckboxBaseSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/CheckboxSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/CheckboxSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/FileInputBaseSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/FileInputBaseSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/FileInputSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/FileInputSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/FormElementBaseSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/FormElementBaseSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/FormElementSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/FormElementSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/InputBasedModuleSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/InputBasedModuleSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/MultipleSelectBaseSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/MultipleSelectBaseSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/MultipleSelectSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/MultipleSelectSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/RadioButtonsBaseSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/RadioButtonsBaseSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/RadioButtonsSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/RadioButtonsSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/SelectBaseSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/SelectBaseSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/SelectSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/SelectSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/TextInputBaseSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/TextInputBaseSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/TextInputSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/TextInputSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/TextareaBaseSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/TextareaBaseSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/module/TextareaSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/module/TextareaSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/CssSelectorSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/CssSelectorSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/CustomNavigatorSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/CustomNavigatorSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/EmptyNavigatorSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/EmptyNavigatorSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/ExoticAttributeValuesSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/ExoticAttributeValuesSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/FindAndFilterNavigatorSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/FindAndFilterNavigatorSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/FindViaTextSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/FindViaTextSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/FormControlSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/FormControlSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/ModuleFromNavigatorSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/ModuleFromNavigatorSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/NavigatorClickSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/NavigatorClickSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/NavigatorCssSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/NavigatorCssSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/NavigatorElementsSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/NavigatorElementsSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/NavigatorEqualsSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/NavigatorEqualsSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/NavigatorGroovySpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/NavigatorGroovySpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/NavigatorSizeAndLocationSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/NavigatorSizeAndLocationSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/NavigatorSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/NavigatorSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/RelativeContentNavigatorSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/RelativeContentNavigatorSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/ReloadOnValueChangeSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/ReloadOnValueChangeSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/SelectControlSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/SelectControlSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/SelectFactorySpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/SelectFactorySpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/navigator/SingleElementNavigatorOnlyMethodsSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/navigator/SingleElementNavigatorOnlyMethodsSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/report/ReporterSupportSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/report/ReporterSupportSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/textmatching/TextMatchingSupportSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/textmatching/TextMatchingSupportSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/waiting/AtCheckWaitingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/waiting/AtCheckWaitingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/waiting/BaseNavigatorWaitingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/waiting/BaseNavigatorWaitingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/waiting/WaitingContentSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/waiting/WaitingContentSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/waiting/WaitingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/waiting/WaitingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/waiting/WaitingSupportSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/waiting/WaitingSupportSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/window/BaseWindowHandlingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/window/BaseWindowHandlingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/window/BasicWindowHandlingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/window/BasicWindowHandlingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/groovy/geb/window/WindowHandlingSpec_groovy"() {
        unzipAndTest("module/geb-core/src/test/groovy/geb/window/WindowHandlingSpec.groovy", [])
    }

    void "test module/geb-core/src/test/resources/geb/conf/good-conf_groovy"() {
        unzipAndTest("module/geb-core/src/test/resources/geb/conf/good-conf.groovy", [])
    }

    void "test module/geb-exceptions/geb-exceptions_gradle"() {
        unzipAndTest("module/geb-exceptions/geb-exceptions.gradle", [])
    }

    void "test module/geb-implicit-assertions/geb-implicit-assertions_gradle"() {
        unzipAndTest("module/geb-implicit-assertions/geb-implicit-assertions.gradle", [])
    }

    void "test module/geb-implicit-assertions/src/main/groovy/geb/transform/implicitassertions/ImplicitAssertionsTransformationVisitor_groovy"() {
        unzipAndTest("module/geb-implicit-assertions/src/main/groovy/geb/transform/implicitassertions/ImplicitAssertionsTransformationVisitor.groovy", [])
    }

    void "test module/geb-implicit-assertions/src/test/groovy/geb/transform/implicitassertions/ImplicitAssertionsTransformationSpec_groovy"() {
        unzipAndTest("module/geb-implicit-assertions/src/test/groovy/geb/transform/implicitassertions/ImplicitAssertionsTransformationSpec.groovy", [])
    }

    void "test module/geb-implicit-assertions/src/test/groovy/geb/transform/implicitassertions/SpockIntegrationSpec_groovy"() {
        unzipAndTest("module/geb-implicit-assertions/src/test/groovy/geb/transform/implicitassertions/SpockIntegrationSpec.groovy", [])
    }

    void "test module/geb-junit3/geb-junit3_gradle"() {
        unzipAndTest("module/geb-junit3/geb-junit3.gradle", [])
    }

    void "test module/geb-junit3/src/main/groovy/geb/junit3/GebReportingTest_groovy"() {
        unzipAndTest("module/geb-junit3/src/main/groovy/geb/junit3/GebReportingTest.groovy", [])
    }

    void "test module/geb-junit3/src/main/groovy/geb/junit3/GebTest_groovy"() {
        unzipAndTest("module/geb-junit3/src/main/groovy/geb/junit3/GebTest.groovy", [])
    }

    void "test module/geb-junit3/src/test/groovy/geb/junit3/GebReportingTestTest_groovy"() {
        unzipAndTest("module/geb-junit3/src/test/groovy/geb/junit3/GebReportingTestTest.groovy", [])
    }

    void "test module/geb-junit3/src/test/groovy/geb/junit3/GebTestTest_groovy"() {
        unzipAndTest("module/geb-junit3/src/test/groovy/geb/junit3/GebTestTest.groovy", [])
    }

    void "test module/geb-junit4/geb-junit4_gradle"() {
        unzipAndTest("module/geb-junit4/geb-junit4.gradle", [])
    }

    void "test module/geb-junit4/src/main/groovy/geb/junit4/GebReportingTest_groovy"() {
        unzipAndTest("module/geb-junit4/src/main/groovy/geb/junit4/GebReportingTest.groovy", [])
    }

    void "test module/geb-junit4/src/main/groovy/geb/junit4/GebTest_groovy"() {
        unzipAndTest("module/geb-junit4/src/main/groovy/geb/junit4/GebTest.groovy", [])
    }

    void "test module/geb-junit4/src/test/groovy/geb/junit4/GebReportingTestTest_groovy"() {
        unzipAndTest("module/geb-junit4/src/test/groovy/geb/junit4/GebReportingTestTest.groovy", [])
    }

    void "test module/geb-junit4/src/test/groovy/geb/junit4/GebTestTest_groovy"() {
        unzipAndTest("module/geb-junit4/src/test/groovy/geb/junit4/GebTestTest.groovy", [])
    }

    void "test module/geb-spock/geb-spock_gradle"() {
        unzipAndTest("module/geb-spock/geb-spock.gradle", [])
    }

    void "test module/geb-spock/src/main/groovy/geb/spock/GebReportingSpec_groovy"() {
        unzipAndTest("module/geb-spock/src/main/groovy/geb/spock/GebReportingSpec.groovy", [])
    }

    void "test module/geb-spock/src/main/groovy/geb/spock/GebSpec_groovy"() {
        unzipAndTest("module/geb-spock/src/main/groovy/geb/spock/GebSpec.groovy", [])
    }

    void "test module/geb-spock/src/main/groovy/geb/spock/OnFailureReporter_groovy"() {
        unzipAndTest("module/geb-spock/src/main/groovy/geb/spock/OnFailureReporter.groovy", [])
    }

    void "test module/geb-spock/src/main/groovy/geb/spock/ReportingOnFailureExtension_groovy"() {
        unzipAndTest("module/geb-spock/src/main/groovy/geb/spock/ReportingOnFailureExtension.groovy", [])
    }

    void "test module/geb-spock/src/test/groovy/geb/spock/ExceptionOnReportScreenshotSpec_groovy"() {
        unzipAndTest("module/geb-spock/src/test/groovy/geb/spock/ExceptionOnReportScreenshotSpec.groovy", [])
    }

    void "test module/geb-spock/src/test/groovy/geb/spock/GebReportingSpecSpec_groovy"() {
        unzipAndTest("module/geb-spock/src/test/groovy/geb/spock/GebReportingSpecSpec.groovy", [])
    }

    void "test module/geb-spock/src/test/groovy/geb/spock/GebSpecSpec_groovy"() {
        unzipAndTest("module/geb-spock/src/test/groovy/geb/spock/GebSpecSpec.groovy", [])
    }

    void "test module/geb-spock/src/test/groovy/geb/spock/GebSpecStepwiseSpec_groovy"() {
        unzipAndTest("module/geb-spock/src/test/groovy/geb/spock/GebSpecStepwiseSpec.groovy", [])
    }

    void "test module/geb-test-common/geb-test-common_gradle"() {
        unzipAndTest("module/geb-test-common/geb-test-common.gradle", [])
    }

    void "test module/geb-test-common/src/main/groovy/geb/junit4/rule/FailureTracker_groovy"() {
        unzipAndTest("module/geb-test-common/src/main/groovy/geb/junit4/rule/FailureTracker.groovy", [])
    }

    void "test module/geb-testng/geb-testng_gradle"() {
        unzipAndTest("module/geb-testng/geb-testng.gradle", [])
    }

    void "test module/geb-testng/src/main/groovy/geb/testng/GebReportingTestTrait_groovy"() {
        unzipAndTest("module/geb-testng/src/main/groovy/geb/testng/GebReportingTestTrait.groovy", [])
    }

    void "test module/geb-testng/src/main/groovy/geb/testng/GebTestTrait_groovy"() {
        unzipAndTest("module/geb-testng/src/main/groovy/geb/testng/GebTestTrait.groovy", [])
    }

    void "test module/geb-testng/src/test/groovy/geb/testng/GebReportingTestCleanupTest_groovy"() {
        unzipAndTest("module/geb-testng/src/test/groovy/geb/testng/GebReportingTestCleanupTest.groovy", [])
    }

    void "test module/geb-testng/src/test/groovy/geb/testng/GebReportingTestTest_groovy"() {
        unzipAndTest("module/geb-testng/src/test/groovy/geb/testng/GebReportingTestTest.groovy", [])
    }

    void "test module/geb-testng/src/test/groovy/geb/testng/GebTestTest_groovy"() {
        unzipAndTest("module/geb-testng/src/test/groovy/geb/testng/GebTestTest.groovy", [])
    }

    void "test module/geb-waiting/geb-waiting_gradle"() {
        unzipAndTest("module/geb-waiting/geb-waiting.gradle", [])
    }

    void "test module/geb-waiting/src/main/groovy/geb/waiting/UnknownWaitForEvaluationResult_groovy"() {
        unzipAndTest("module/geb-waiting/src/main/groovy/geb/waiting/UnknownWaitForEvaluationResult.groovy", [])
    }

    void "test module/geb-waiting/src/main/groovy/geb/waiting/Wait_groovy"() {
        unzipAndTest("module/geb-waiting/src/main/groovy/geb/waiting/Wait.groovy", [])
    }

    void "test module/geb-waiting/src/test/groovy/geb/waiting/UnknownWaitForEvaluationResultSpec_groovy"() {
        unzipAndTest("module/geb-waiting/src/test/groovy/geb/waiting/UnknownWaitForEvaluationResultSpec.groovy", [])
    }

    void "test module/geb-waiting/src/test/groovy/geb/waiting/WaitSpec_groovy"() {
        unzipAndTest("module/geb-waiting/src/test/groovy/geb/waiting/WaitSpec.groovy", [])
    }

    void "test module/module_gradle"() {
        unzipAndTest("module/module.gradle", [])
    }

    void "test settings_gradle"() {
        unzipAndTest("settings.gradle", [])
    }


    /*************************************/
    static unzipAndTest(String entryName, List ignoreClazzList, Map<String, String> replacementsMap=[:]) {
        ignoreClazzList.addAll(TestUtils.COMMON_IGNORE_CLASS_LIST)

        TestUtils.unzipAndTest(ZIP_PATH, entryName, TestUtils.addIgnore(ignoreClazzList, ASTComparatorCategory.LOCATION_IGNORE_LIST), replacementsMap)
    }

    public static final String ZIP_PATH = "$TestUtils.RESOURCES_PATH/geb-1.0/geb-1.0-allsources.zip";

}