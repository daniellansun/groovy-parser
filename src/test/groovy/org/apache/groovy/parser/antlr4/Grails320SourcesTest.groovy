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
 * Add Grails 3.2.0 sources as test cases
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * Created on    2016/10/09
 */
@CompileStatic
class Grails320SourcesTest extends GroovyTestCase {


    void "test build_gradle"() {
        unzipAndTest("build.gradle", [])
    }

    void "test buildSrc/src/main/groovy/org/grails/gradle/GrailsBuildPlugin_groovy"() {
        unzipAndTest("buildSrc/src/main/groovy/org/grails/gradle/GrailsBuildPlugin.groovy", [])
    }

    void "test gradle/assemble_gradle"() {
        unzipAndTest("gradle/assemble.gradle", [])
    }

    void "test gradle/docs_gradle"() {
        unzipAndTest("gradle/docs.gradle", [])
    }

    void "test gradle/findbugs_gradle"() {
        unzipAndTest("gradle/findbugs.gradle", [])
    }

    void "test gradle/idea_gradle"() {
        unzipAndTest("gradle/idea.gradle", [])
    }

    void "test gradle/integration-test_gradle"() {
        unzipAndTest("gradle/integration-test.gradle", [])
    }

    void "test gradle/unit-test_gradle"() {
        unzipAndTest("gradle/unit-test.gradle", [])
    }

    void "test grails-async/build_gradle"() {
        unzipAndTest("grails-async/build.gradle", [])
    }

    void "test grails-async/src/main/groovy/grails/async/DelegateAsync_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/grails/async/DelegateAsync.groovy", [])
    }

    void "test grails-async/src/main/groovy/grails/async/Promise_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/grails/async/Promise.groovy", [])
    }

    void "test grails-async/src/main/groovy/grails/async/PromiseFactory_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/grails/async/PromiseFactory.groovy", [])
    }

    void "test grails-async/src/main/groovy/grails/async/PromiseList_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/grails/async/PromiseList.groovy", [])
    }

    void "test grails-async/src/main/groovy/grails/async/PromiseMap_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/grails/async/PromiseMap.groovy", [])
    }

    void "test grails-async/src/main/groovy/grails/async/Promises_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/grails/async/Promises.groovy", [])
    }

    void "test grails-async/src/main/groovy/grails/async/decorator/PromiseDecorator_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/grails/async/decorator/PromiseDecorator.groovy", [])
    }

    void "test grails-async/src/main/groovy/grails/async/decorator/PromiseDecoratorLookupStrategy_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/grails/async/decorator/PromiseDecoratorLookupStrategy.groovy", [])
    }

    void "test grails-async/src/main/groovy/grails/async/decorator/PromiseDecoratorProvider_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/grails/async/decorator/PromiseDecoratorProvider.groovy", [])
    }

    void "test grails-async/src/main/groovy/grails/async/factory/AbstractPromiseFactory_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/grails/async/factory/AbstractPromiseFactory.groovy", [])
    }

    void "test grails-async/src/main/groovy/org/grails/async/factory/BoundPromise_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/org/grails/async/factory/BoundPromise.groovy", [])
    }

    void "test grails-async/src/main/groovy/org/grails/async/factory/SynchronousPromise_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/org/grails/async/factory/SynchronousPromise.groovy", [])
    }

    void "test grails-async/src/main/groovy/org/grails/async/factory/SynchronousPromiseFactory_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/org/grails/async/factory/SynchronousPromiseFactory.groovy", [])
    }

    void "test grails-async/src/main/groovy/org/grails/async/factory/gpars/GparsPromise_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/org/grails/async/factory/gpars/GparsPromise.groovy", [])
    }

    void "test grails-async/src/main/groovy/org/grails/async/factory/gpars/GparsPromiseFactory_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/org/grails/async/factory/gpars/GparsPromiseFactory.groovy", [])
    }

    void "test grails-async/src/main/groovy/org/grails/async/factory/gpars/LoggingPoolFactory_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/org/grails/async/factory/gpars/LoggingPoolFactory.groovy", [])
    }

    void "test grails-async/src/main/groovy/org/grails/async/factory/reactor/ReactorPromise_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/org/grails/async/factory/reactor/ReactorPromise.groovy", [])
    }

    void "test grails-async/src/main/groovy/org/grails/async/factory/reactor/ReactorPromiseFactory_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/org/grails/async/factory/reactor/ReactorPromiseFactory.groovy", [])
    }

    void "test grails-async/src/main/groovy/org/grails/async/transform/internal/DelegateAsyncUtils_groovy"() {
        unzipAndTest("grails-async/src/main/groovy/org/grails/async/transform/internal/DelegateAsyncUtils.groovy", [])
    }

    void "test grails-async/src/test/groovy/grails/async/DelegateAsyncSpec_groovy"() {
        unzipAndTest("grails-async/src/test/groovy/grails/async/DelegateAsyncSpec.groovy", [])
    }

    void "test grails-async/src/test/groovy/grails/async/PromiseListSpec_groovy"() {
        unzipAndTest("grails-async/src/test/groovy/grails/async/PromiseListSpec.groovy", [])
    }

    void "test grails-async/src/test/groovy/grails/async/PromiseMapSpec_groovy"() {
        unzipAndTest("grails-async/src/test/groovy/grails/async/PromiseMapSpec.groovy", [])
    }

    void "test grails-async/src/test/groovy/grails/async/PromiseSpec_groovy"() {
        unzipAndTest("grails-async/src/test/groovy/grails/async/PromiseSpec.groovy", [])
    }

    void "test grails-async/src/test/groovy/grails/async/ReactorPromiseFactorySpec_groovy"() {
        unzipAndTest("grails-async/src/test/groovy/grails/async/ReactorPromiseFactorySpec.groovy", [])
    }

    void "test grails-async/src/test/groovy/grails/async/SynchronousPromiseFactorySpec_groovy"() {
        unzipAndTest("grails-async/src/test/groovy/grails/async/SynchronousPromiseFactorySpec.groovy", [])
    }

    void "test grails-bom/build_gradle"() {
        unzipAndTest("grails-bom/build.gradle", [])
    }

    void "test grails-bootstrap/build_gradle"() {
        unzipAndTest("grails-bootstrap/build.gradle", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/build/proxy/SystemPropertiesAuthenticator_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/build/proxy/SystemPropertiesAuthenticator.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/codegen/model/Model_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/codegen/model/Model.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/codegen/model/ModelBuilder_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/codegen/model/ModelBuilder.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/config/ConfigMap_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/config/ConfigMap.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/io/IOUtils_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/io/IOUtils.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/io/ResourceUtils_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/io/ResourceUtils.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/io/support/SystemOutErrCapturer_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/io/support/SystemOutErrCapturer.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/io/support/SystemStreamsRedirector_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/io/support/SystemStreamsRedirector.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/plugins/GrailsVersionUtils_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/plugins/GrailsVersionUtils.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/plugins/VersionComparator_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/plugins/VersionComparator.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/util/BuildSettings_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/util/BuildSettings.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/util/CosineSimilarity_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/util/CosineSimilarity.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/util/Described_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/util/Described.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/util/Metadata_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/util/Metadata.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/grails/util/Named_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/grails/util/Named.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/build/parsing/ScriptNameResolver_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/build/parsing/ScriptNameResolver.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/config/CodeGenConfig_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/config/CodeGenConfig.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/config/NavigableMap_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/config/NavigableMap.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/exceptions/ExceptionUtils_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/exceptions/ExceptionUtils.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/exceptions/reporting/CodeSnippetPrinter_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/exceptions/reporting/CodeSnippetPrinter.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/exceptions/reporting/DefaultStackTracePrinter_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/exceptions/reporting/DefaultStackTracePrinter.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/exceptions/reporting/StackTracePrinter_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/exceptions/reporting/StackTracePrinter.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/io/support/ByteArrayResource_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/io/support/ByteArrayResource.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/io/support/DevNullPrintStream_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/io/support/DevNullPrintStream.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/io/support/FactoriesLoaderSupport_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/io/support/FactoriesLoaderSupport.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/io/support/MainClassFinder_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/io/support/MainClassFinder.groovy", [])
    }

    void "test grails-bootstrap/src/main/groovy/org/grails/io/watch/FileExtensionFileChangeListener_groovy"() {
        unzipAndTest("grails-bootstrap/src/main/groovy/org/grails/io/watch/FileExtensionFileChangeListener.groovy", [])
    }

    void "test grails-bootstrap/src/test/groovy/grails/build/logging/GrailsConsoleSpec_groovy"() {
        unzipAndTest("grails-bootstrap/src/test/groovy/grails/build/logging/GrailsConsoleSpec.groovy", [])
    }

    void "test grails-bootstrap/src/test/groovy/grails/config/ConfigMapSpec_groovy"() {
        unzipAndTest("grails-bootstrap/src/test/groovy/grails/config/ConfigMapSpec.groovy", [])
    }

    void "test grails-bootstrap/src/test/groovy/grails/config/GrailsConfigSpec_groovy"() {
        unzipAndTest("grails-bootstrap/src/test/groovy/grails/config/GrailsConfigSpec.groovy", [])
    }

    void "test grails-bootstrap/src/test/groovy/grails/io/IOUtilsSpec_groovy"() {
        unzipAndTest("grails-bootstrap/src/test/groovy/grails/io/IOUtilsSpec.groovy", [])
    }

    void "test grails-bootstrap/src/test/groovy/grails/util/EnvironmentTests_groovy"() {
        unzipAndTest("grails-bootstrap/src/test/groovy/grails/util/EnvironmentTests.groovy", [])
    }

    void "test grails-bootstrap/src/test/groovy/org/grails/build/parsing/CommandLineParserSpec_groovy"() {
        unzipAndTest("grails-bootstrap/src/test/groovy/org/grails/build/parsing/CommandLineParserSpec.groovy", [])
    }

    void "test grails-codecs/build_gradle"() {
        unzipAndTest("grails-codecs/build.gradle", [])
    }

    void "test grails-codecs/src/main/groovy/org/grails/plugins/codecs/Base64CodecExtensionMethods_groovy"() {
        unzipAndTest("grails-codecs/src/main/groovy/org/grails/plugins/codecs/Base64CodecExtensionMethods.groovy", [])
    }

    void "test grails-codecs/src/main/groovy/org/grails/plugins/codecs/DigestUtils_groovy"() {
        unzipAndTest("grails-codecs/src/main/groovy/org/grails/plugins/codecs/DigestUtils.groovy", [])
    }

    void "test grails-codecs/src/main/groovy/org/grails/plugins/codecs/HexCodecExtensionMethods_groovy"() {
        unzipAndTest("grails-codecs/src/main/groovy/org/grails/plugins/codecs/HexCodecExtensionMethods.groovy", [])
    }

    void "test grails-codecs/src/main/groovy/org/grails/plugins/codecs/MD5BytesCodecExtensionMethods_groovy"() {
        unzipAndTest("grails-codecs/src/main/groovy/org/grails/plugins/codecs/MD5BytesCodecExtensionMethods.groovy", [])
    }

    void "test grails-codecs/src/main/groovy/org/grails/plugins/codecs/MD5CodecExtensionMethods_groovy"() {
        unzipAndTest("grails-codecs/src/main/groovy/org/grails/plugins/codecs/MD5CodecExtensionMethods.groovy", [])
    }

    void "test grails-codecs/src/main/groovy/org/grails/plugins/codecs/SHA1BytesCodecExtensionMethods_groovy"() {
        unzipAndTest("grails-codecs/src/main/groovy/org/grails/plugins/codecs/SHA1BytesCodecExtensionMethods.groovy", [])
    }

    void "test grails-codecs/src/main/groovy/org/grails/plugins/codecs/SHA1CodecExtensionMethods_groovy"() {
        unzipAndTest("grails-codecs/src/main/groovy/org/grails/plugins/codecs/SHA1CodecExtensionMethods.groovy", [])
    }

    void "test grails-codecs/src/main/groovy/org/grails/plugins/codecs/SHA256BytesCodecExtensionMethods_groovy"() {
        unzipAndTest("grails-codecs/src/main/groovy/org/grails/plugins/codecs/SHA256BytesCodecExtensionMethods.groovy", [])
    }

    void "test grails-codecs/src/main/groovy/org/grails/plugins/codecs/SHA256CodecExtensionMethods_groovy"() {
        unzipAndTest("grails-codecs/src/main/groovy/org/grails/plugins/codecs/SHA256CodecExtensionMethods.groovy", [])
    }

    void "test grails-codecs/src/test/groovy/org/grails/web/codecs/Base64CodecTests_groovy"() {
        unzipAndTest("grails-codecs/src/test/groovy/org/grails/web/codecs/Base64CodecTests.groovy", [])
    }

    void "test grails-codecs/src/test/groovy/org/grails/web/codecs/HexCodecTests_groovy"() {
        unzipAndTest("grails-codecs/src/test/groovy/org/grails/web/codecs/HexCodecTests.groovy", [])
    }

    void "test grails-codecs/src/test/groovy/org/grails/web/codecs/MD5BytesCodecTests_groovy"() {
        unzipAndTest("grails-codecs/src/test/groovy/org/grails/web/codecs/MD5BytesCodecTests.groovy", [])
    }

    void "test grails-codecs/src/test/groovy/org/grails/web/codecs/MD5CodecTests_groovy"() {
        unzipAndTest("grails-codecs/src/test/groovy/org/grails/web/codecs/MD5CodecTests.groovy", [])
    }

    void "test grails-codecs/src/test/groovy/org/grails/web/codecs/SHA1BytesCodecTests_groovy"() {
        unzipAndTest("grails-codecs/src/test/groovy/org/grails/web/codecs/SHA1BytesCodecTests.groovy", [])
    }

    void "test grails-codecs/src/test/groovy/org/grails/web/codecs/SHA1CodecTests_groovy"() {
        unzipAndTest("grails-codecs/src/test/groovy/org/grails/web/codecs/SHA1CodecTests.groovy", [])
    }

    void "test grails-codecs/src/test/groovy/org/grails/web/codecs/SHA256BytesCodec_groovy"() {
        unzipAndTest("grails-codecs/src/test/groovy/org/grails/web/codecs/SHA256BytesCodec.groovy", [])
    }

    void "test grails-codecs/src/test/groovy/org/grails/web/codecs/SHA256CodecTests_groovy"() {
        unzipAndTest("grails-codecs/src/test/groovy/org/grails/web/codecs/SHA256CodecTests.groovy", [])
    }

    void "test grails-console/build_gradle"() {
        unzipAndTest("grails-console/build.gradle", [])
    }

    void "test grails-console/src/main/groovy/grails/ui/command/GrailsApplicationContextCommandRunner_groovy"() {
        unzipAndTest("grails-console/src/main/groovy/grails/ui/command/GrailsApplicationContextCommandRunner.groovy", [])
    }

    void "test grails-console/src/main/groovy/grails/ui/console/GrailsSwingConsole_groovy"() {
        unzipAndTest("grails-console/src/main/groovy/grails/ui/console/GrailsSwingConsole.groovy", [])
    }

    void "test grails-console/src/main/groovy/grails/ui/console/support/GroovyConsoleApplicationContext_groovy"() {
        unzipAndTest("grails-console/src/main/groovy/grails/ui/console/support/GroovyConsoleApplicationContext.groovy", [])
    }

    void "test grails-console/src/main/groovy/grails/ui/console/support/GroovyConsoleWebApplicationContext_groovy"() {
        unzipAndTest("grails-console/src/main/groovy/grails/ui/console/support/GroovyConsoleWebApplicationContext.groovy", [])
    }

    void "test grails-console/src/main/groovy/grails/ui/script/GrailsApplicationScriptRunner_groovy"() {
        unzipAndTest("grails-console/src/main/groovy/grails/ui/script/GrailsApplicationScriptRunner.groovy", [])
    }

    void "test grails-console/src/main/groovy/grails/ui/shell/GrailsShell_groovy"() {
        unzipAndTest("grails-console/src/main/groovy/grails/ui/shell/GrailsShell.groovy", [])
    }

    void "test grails-console/src/main/groovy/grails/ui/shell/support/GroovyshApplicationContext_groovy"() {
        unzipAndTest("grails-console/src/main/groovy/grails/ui/shell/support/GroovyshApplicationContext.groovy", [])
    }

    void "test grails-console/src/main/groovy/grails/ui/shell/support/GroovyshWebApplicationContext_groovy"() {
        unzipAndTest("grails-console/src/main/groovy/grails/ui/shell/support/GroovyshWebApplicationContext.groovy", [])
    }

    void "test grails-console/src/main/groovy/grails/ui/support/DevelopmentGrailsApplication_groovy"() {
        unzipAndTest("grails-console/src/main/groovy/grails/ui/support/DevelopmentGrailsApplication.groovy", [])
    }

    void "test grails-console/src/main/groovy/grails/ui/support/DevelopmentWebApplicationContext_groovy"() {
        unzipAndTest("grails-console/src/main/groovy/grails/ui/support/DevelopmentWebApplicationContext.groovy", [])
    }

    void "test grails-core/build_gradle"() {
        unzipAndTest("grails-core/build.gradle", [])
    }

    void "test grails-core/src/main/groovy/grails/beans/util/LazyBeanMap_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/beans/util/LazyBeanMap.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/boot/GrailsApp_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/boot/GrailsApp.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/boot/GrailsAppBuilder_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/boot/GrailsAppBuilder.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/boot/GrailsPluginApplication_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/boot/GrailsPluginApplication.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/boot/config/GrailsApplicationPostProcessor_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/boot/config/GrailsApplicationPostProcessor.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/boot/config/GrailsAutoConfiguration_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/boot/config/GrailsAutoConfiguration.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/boot/config/tools/ProfilingGrailsApplicationPostProcessor_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/boot/config/tools/ProfilingGrailsApplicationPostProcessor.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/boot/config/tools/SettingsFile_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/boot/config/tools/SettingsFile.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/compiler/DelegatingMethod_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/compiler/DelegatingMethod.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/compiler/GrailsCompileStatic_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/compiler/GrailsCompileStatic.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/compiler/GrailsTypeChecked_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/compiler/GrailsTypeChecked.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/compiler/ast/GlobalClassInjector_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/compiler/ast/GlobalClassInjector.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/compiler/ast/GlobalClassInjectorAdapter_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/compiler/ast/GlobalClassInjectorAdapter.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/config/Config_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/config/Config.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/config/ConfigProperties_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/config/ConfigProperties.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/config/Settings_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/config/Settings.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/core/GrailsApplicationClass_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/core/GrailsApplicationClass.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/core/GrailsApplicationLifeCycle_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/core/GrailsApplicationLifeCycle.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/core/GrailsApplicationLifeCycleAdapter_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/core/GrailsApplicationLifeCycleAdapter.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/core/events/ArtefactAdditionEvent_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/core/events/ArtefactAdditionEvent.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/dev/Support_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/dev/Support.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/dev/commands/ApplicationCommand_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/dev/commands/ApplicationCommand.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/dev/commands/ApplicationContextCommandRegistry_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/dev/commands/ApplicationContextCommandRegistry.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/dev/commands/ExecutionContext_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/dev/commands/ExecutionContext.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/dev/commands/GrailsApplicationCommand_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/dev/commands/GrailsApplicationCommand.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/dev/commands/io/FileSystemInteraction_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/dev/commands/io/FileSystemInteraction.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/dev/commands/io/FileSystemInteractionImpl_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/dev/commands/io/FileSystemInteractionImpl.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/dev/commands/template/TemplateException_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/dev/commands/template/TemplateException.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/dev/commands/template/TemplateRenderer_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/dev/commands/template/TemplateRenderer.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/dev/commands/template/TemplateRendererImpl_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/dev/commands/template/TemplateRendererImpl.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/persistence/support/PersistenceContextInterceptorExecutor_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/persistence/support/PersistenceContextInterceptorExecutor.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/plugins/Plugin_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/plugins/Plugin.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/plugins/PluginManagerLoader_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/plugins/PluginManagerLoader.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/transaction/GrailsTransactionTemplate_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/transaction/GrailsTransactionTemplate.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/transaction/Rollback_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/transaction/Rollback.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/util/GrailsArrayUtils_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/util/GrailsArrayUtils.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/util/GrailsStringUtils_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/util/GrailsStringUtils.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/util/MixinTargetAware_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/util/MixinTargetAware.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/util/TypeConvertingMap_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/util/TypeConvertingMap.groovy", [])
    }

    void "test grails-core/src/main/groovy/grails/validation/ValidationErrors_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/grails/validation/ValidationErrors.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/boot/internal/JavaCompiler_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/boot/internal/JavaCompiler.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/CriteriaTypeCheckingExtension_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/CriteriaTypeCheckingExtension.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/DomainMappingTypeCheckingExtension_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/DomainMappingTypeCheckingExtension.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/DynamicFinderTypeCheckingExtension_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/DynamicFinderTypeCheckingExtension.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/HttpServletRequestTypeCheckingExtension_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/HttpServletRequestTypeCheckingExtension.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/RelationshipManagementMethodTypeCheckingExtension_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/RelationshipManagementMethodTypeCheckingExtension.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/ValidateableTypeCheckingExtension_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/ValidateableTypeCheckingExtension.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/WhereQueryTypeCheckingExtension_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/WhereQueryTypeCheckingExtension.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/injection/ApplicationClassInjector_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/injection/ApplicationClassInjector.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/injection/EnhancesTraitTransformation_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/injection/EnhancesTraitTransformation.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/injection/GlobalGrailsClassInjectorTransformation_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/injection/GlobalGrailsClassInjectorTransformation.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/injection/GlobalImportTransformation_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/injection/GlobalImportTransformation.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/injection/GroovyEclipseCompilationHelper_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/injection/GroovyEclipseCompilationHelper.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/compiler/injection/TraitInjectionSupport_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/compiler/injection/TraitInjectionSupport.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/config/NavigableMapPropertySource_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/config/NavigableMapPropertySource.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/config/PrefixedMapPropertySource_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/config/PrefixedMapPropertySource.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/config/yaml/YamlPropertySourceLoader_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/config/yaml/YamlPropertySourceLoader.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/core/artefact/ApplicationArtefactHandler_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/core/artefact/ApplicationArtefactHandler.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/core/cfg/GroovyConfigPropertySourceLoader_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/core/cfg/GroovyConfigPropertySourceLoader.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/core/exceptions/DefaultErrorsPrinter_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/core/exceptions/DefaultErrorsPrinter.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/core/io/CachingPathMatchingResourcePatternResolver_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/core/io/CachingPathMatchingResourcePatternResolver.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/core/io/GrailsResource_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/core/io/GrailsResource.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/core/io/support/GrailsFactoriesLoader_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/core/io/support/GrailsFactoriesLoader.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/core/metaclass/MetaClassEnhancer_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/core/metaclass/MetaClassEnhancer.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/core/support/GrailsApplicationDiscoveryStrategy_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/core/support/GrailsApplicationDiscoveryStrategy.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/core/util/IncludeExcludeSupport_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/core/util/IncludeExcludeSupport.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/dev/support/DevelopmentShutdownHook_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/dev/support/DevelopmentShutdownHook.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/plugins/CoreGrailsPlugin_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/plugins/CoreGrailsPlugin.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/plugins/support/WatchPattern_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/plugins/support/WatchPattern.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/spring/beans/factory/HotSwappableTargetSourceFactoryBean_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/spring/beans/factory/HotSwappableTargetSourceFactoryBean.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/spring/context/ApplicationContextExtension_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/spring/context/ApplicationContextExtension.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/spring/context/support/MapBasedSmartPropertyOverrideConfigurer_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/spring/context/support/MapBasedSmartPropertyOverrideConfigurer.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/transaction/transform/RollbackTransform_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/transaction/transform/RollbackTransform.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/transaction/transform/TransactionalTransform_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/transaction/transform/TransactionalTransform.groovy", [])
    }

    void "test grails-core/src/main/groovy/org/grails/validation/ConstraintEvalUtils_groovy"() {
        unzipAndTest("grails-core/src/main/groovy/org/grails/validation/ConstraintEvalUtils.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/artefact/ApiDelegateSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/artefact/ApiDelegateSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/artefact/EnhancesSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/artefact/EnhancesSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/config/ConfigPropertiesSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/config/ConfigPropertiesSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/spring/GrailsPlaceHolderConfigurerCorePluginRuntimeSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/spring/GrailsPlaceHolderConfigurerCorePluginRuntimeSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/spring/GrailsPlaceholderConfigurerSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/spring/GrailsPlaceholderConfigurerSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/transaction/TransactionalTransformSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/transaction/TransactionalTransformSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/util/GrailsArrayUtilsSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/util/GrailsArrayUtilsSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/util/GrailsMetaClassUtilsSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/util/GrailsMetaClassUtilsSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/util/GrailsStringUtilsSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/util/GrailsStringUtilsSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/web/CamelCaseUrlConverterSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/web/CamelCaseUrlConverterSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/grails/web/HyphenatedUrlConverterSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/grails/web/HyphenatedUrlConverterSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/compiler/injection/ASTValidationErrorsHelperSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/compiler/injection/ASTValidationErrorsHelperSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/compiler/injection/ArtefactTypeAstTransformationSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/compiler/injection/ArtefactTypeAstTransformationSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/compiler/injection/DefaultDomainClassInjectorSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/compiler/injection/DefaultDomainClassInjectorSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/compiler/injection/GlobalGrailsClassInjectorTransformationSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/compiler/injection/GlobalGrailsClassInjectorTransformationSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/compiler/injection/GrailsASTUtilsSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/compiler/injection/GrailsASTUtilsSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/compiler/injection/GrailsASTUtilsTests_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/compiler/injection/GrailsASTUtilsTests.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/compiler/injection/GrailsArtefactTransformerSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/compiler/injection/GrailsArtefactTransformerSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/config/NavigableMapNestedEqualitySpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/config/NavigableMapNestedEqualitySpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/config/NavigableMapPropertySourceSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/config/NavigableMapPropertySourceSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/config/PropertySourcesConfigSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/config/PropertySourcesConfigSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/config/YamlPropertySourceLoaderSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/config/YamlPropertySourceLoaderSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/core/DefaultGrailsControllerClassSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/core/DefaultGrailsControllerClassSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/core/io/ResourceLocatorSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/core/io/ResourceLocatorSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/exception/reporting/StackTraceFiltererSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/exception/reporting/StackTraceFiltererSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/exception/reporting/StackTracePrinterSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/exception/reporting/StackTracePrinterSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/plugins/BinaryPluginSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/plugins/BinaryPluginSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/plugins/GrailsPluginTests_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/plugins/GrailsPluginTests.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/plugins/support/WatchPatternParserSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/plugins/support/WatchPatternParserSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/spring/context/ApplicationContextExtensionSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/spring/context/ApplicationContextExtensionSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/transaction/ChainedTransactionManagerPostProcessorSpec_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/transaction/ChainedTransactionManagerPostProcessorSpec.groovy", [])
    }

    void "test grails-core/src/test/groovy/org/grails/util/TypeConvertingMapTests_groovy"() {
        unzipAndTest("grails-core/src/test/groovy/org/grails/util/TypeConvertingMapTests.groovy", [])
    }

    void "test grails-databinding/build_gradle"() {
        unzipAndTest("grails-databinding/build.gradle", [])
    }

    void "test grails-databinding/src/main/groovy/grails/databinding/SimpleDataBinder_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/grails/databinding/SimpleDataBinder.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/grails/databinding/SimpleMapDataBindingSource_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/grails/databinding/SimpleMapDataBindingSource.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/ClosureValueConverter_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/ClosureValueConverter.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/IndexedPropertyReferenceDescriptor_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/IndexedPropertyReferenceDescriptor.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/converters/AbstractStructuredDateBindingEditor_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/converters/AbstractStructuredDateBindingEditor.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/converters/CurrencyValueConverter_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/converters/CurrencyValueConverter.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/converters/DateConversionHelper_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/converters/DateConversionHelper.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/converters/FormattedDateValueConverter_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/converters/FormattedDateValueConverter.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/converters/StructuredCalendarBindingEditor_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/converters/StructuredCalendarBindingEditor.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/converters/StructuredDateBindingEditor_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/converters/StructuredDateBindingEditor.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/converters/StructuredSqlDateBindingEditor_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/converters/StructuredSqlDateBindingEditor.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/converters/TimeZoneConverter_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/converters/TimeZoneConverter.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/xml/GPathResultCollectionDataBindingSource_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/xml/GPathResultCollectionDataBindingSource.groovy", [])
    }

    void "test grails-databinding/src/main/groovy/org/grails/databinding/xml/GPathResultMap_groovy"() {
        unzipAndTest("grails-databinding/src/main/groovy/org/grails/databinding/xml/GPathResultMap.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/BindUsingSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/BindUsingSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/BindingErrorSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/BindingErrorSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/BindingFormatSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/BindingFormatSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/BindingListenerSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/BindingListenerSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/CollectionBindingSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/CollectionBindingSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/CustomTypeConverterSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/CustomTypeConverterSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/IncludeExcludeBindingSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/IncludeExcludeBindingSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/SimpleDataBinderEnumBindingSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/SimpleDataBinderEnumBindingSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/SimpleDataBinderEnumValueConverterSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/SimpleDataBinderEnumValueConverterSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/SimpleDataBinderSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/SimpleDataBinderSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/grails/databinding/XMLBindingSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/grails/databinding/XMLBindingSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/org/grails/databinding/compiler/BindingFormatCompilationErrorsSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/org/grails/databinding/compiler/BindingFormatCompilationErrorsSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/org/grails/databinding/converters/CurrencyConversionSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/org/grails/databinding/converters/CurrencyConversionSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/org/grails/databinding/converters/DateConversionHelperSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/org/grails/databinding/converters/DateConversionHelperSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/org/grails/databinding/xml/GPathCollectionDataBindingSourceSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/org/grails/databinding/xml/GPathCollectionDataBindingSourceSpec.groovy", [])
    }

    void "test grails-databinding/src/test/groovy/org/grails/databinding/xml/GPathResultMapSpec_groovy"() {
        unzipAndTest("grails-databinding/src/test/groovy/org/grails/databinding/xml/GPathResultMapSpec.groovy", [])
    }

    void "test grails-dependencies/build_gradle"() {
        unzipAndTest("grails-dependencies/build.gradle", [])
    }

    void "test grails-docs/build_gradle"() {
        unzipAndTest("grails-docs/build.gradle", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/DocEngine_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/DocEngine.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/DocPublisher_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/DocPublisher.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/LegacyDocMigrator_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/LegacyDocMigrator.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/PdfBuilder_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/PdfBuilder.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/ant/DocPublisherTask_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/ant/DocPublisherTask.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/asciidoc/AsciiDocEngine_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/asciidoc/AsciiDocEngine.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/filters/HeaderFilter_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/filters/HeaderFilter.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/filters/LinkTestFilter_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/filters/LinkTestFilter.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/filters/ListFilter_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/filters/ListFilter.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/gradle/MigrateLegacyDocs_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/gradle/MigrateLegacyDocs.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/gradle/PublishGuide_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/gradle/PublishGuide.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/gradle/PublishPdf_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/gradle/PublishPdf.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/internal/FileResourceChecker_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/internal/FileResourceChecker.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/internal/LegacyTocStrategy_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/internal/LegacyTocStrategy.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/internal/UserGuideNode_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/internal/UserGuideNode.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/internal/YamlTocStrategy_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/internal/YamlTocStrategy.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/macros/GspTagSourceMacro_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/macros/GspTagSourceMacro.groovy", [])
    }

    void "test grails-docs/src/main/groovy/grails/doc/macros/HiddenMacro_groovy"() {
        unzipAndTest("grails-docs/src/main/groovy/grails/doc/macros/HiddenMacro.groovy", [])
    }

    void "test grails-docs/src/test/groovy/grails/doc/internal/LegacyTocStrategySpec_groovy"() {
        unzipAndTest("grails-docs/src/test/groovy/grails/doc/internal/LegacyTocStrategySpec.groovy", [])
    }

    void "test grails-docs/src/test/groovy/grails/doc/internal/StringEscapeCategoryTests_groovy"() {
        unzipAndTest("grails-docs/src/test/groovy/grails/doc/internal/StringEscapeCategoryTests.groovy", [])
    }

    void "test grails-docs/src/test/groovy/grails/doc/internal/YamlTocStrategySpec_groovy"() {
        unzipAndTest("grails-docs/src/test/groovy/grails/doc/internal/YamlTocStrategySpec.groovy", [])
    }

    void "test grails-docs/src/test/groovy/grails/doc/macros/GspTagSourceMacroTest_groovy"() {
        unzipAndTest("grails-docs/src/test/groovy/grails/doc/macros/GspTagSourceMacroTest.groovy", [])
    }

    void "test grails-encoder/build_gradle"() {
        unzipAndTest("grails-encoder/build.gradle", [])
    }

    void "test grails-encoder/src/main/groovy/org/grails/buffer/StreamCharBufferMetaUtils_groovy"() {
        unzipAndTest("grails-encoder/src/main/groovy/org/grails/buffer/StreamCharBufferMetaUtils.groovy", [])
    }

    void "test grails-encoder/src/main/groovy/org/grails/encoder/CodecMetaClassSupport_groovy"() {
        unzipAndTest("grails-encoder/src/main/groovy/org/grails/encoder/CodecMetaClassSupport.groovy", [])
    }

    void "test grails-encoder/src/main/groovy/org/grails/encoder/impl/HTMLCodecFactory_groovy"() {
        unzipAndTest("grails-encoder/src/main/groovy/org/grails/encoder/impl/HTMLCodecFactory.groovy", [])
    }

    void "test grails-encoder/src/main/groovy/org/grails/encoder/impl/JSONCodecFactory_groovy"() {
        unzipAndTest("grails-encoder/src/main/groovy/org/grails/encoder/impl/JSONCodecFactory.groovy", [])
    }

    void "test grails-encoder/src/main/groovy/org/grails/encoder/impl/JavaScriptCodec_groovy"() {
        unzipAndTest("grails-encoder/src/main/groovy/org/grails/encoder/impl/JavaScriptCodec.groovy", [])
    }

    void "test grails-encoder/src/main/groovy/org/grails/encoder/impl/StandaloneCodecLookup_groovy"() {
        unzipAndTest("grails-encoder/src/main/groovy/org/grails/encoder/impl/StandaloneCodecLookup.groovy", [])
    }

    void "test grails-encoder/src/main/groovy/org/grails/encoder/impl/URLCodecFactory_groovy"() {
        unzipAndTest("grails-encoder/src/main/groovy/org/grails/encoder/impl/URLCodecFactory.groovy", [])
    }

    void "test grails-encoder/src/test/groovy/org/grails/buffer/StreamCharBufferGroovyTests_groovy"() {
        unzipAndTest("grails-encoder/src/test/groovy/org/grails/buffer/StreamCharBufferGroovyTests.groovy", [])
    }

    void "test grails-encoder/src/test/groovy/org/grails/charsequences/CharSequencesSpec_groovy"() {
        unzipAndTest("grails-encoder/src/test/groovy/org/grails/charsequences/CharSequencesSpec.groovy", [])
    }

    void "test grails-encoder/src/test/groovy/org/grails/encoder/ChainedEncodersSpec_groovy"() {
        unzipAndTest("grails-encoder/src/test/groovy/org/grails/encoder/ChainedEncodersSpec.groovy", [])
    }

    void "test grails-encoder/src/test/groovy/org/grails/encoder/impl/BasicCodecLookupSpec_groovy"() {
        unzipAndTest("grails-encoder/src/test/groovy/org/grails/encoder/impl/BasicCodecLookupSpec.groovy", [])
    }

    void "test grails-encoder/src/test/groovy/org/grails/encoder/impl/HTMLEncoderSpec_groovy"() {
        unzipAndTest("grails-encoder/src/test/groovy/org/grails/encoder/impl/HTMLEncoderSpec.groovy", [])
    }

    void "test grails-encoder/src/test/groovy/org/grails/encoder/impl/JavaScriptCodecTests_groovy"() {
        unzipAndTest("grails-encoder/src/test/groovy/org/grails/encoder/impl/JavaScriptCodecTests.groovy", [])
    }

    void "test grails-gradle-model/src/main/groovy/org/grails/gradle/plugin/model/DefaultGrailsClasspath_groovy"() {
        unzipAndTest("grails-gradle-model/src/main/groovy/org/grails/gradle/plugin/model/DefaultGrailsClasspath.groovy", [])
    }

    void "test grails-gradle-model/src/main/groovy/org/grails/gradle/plugin/model/GrailsClasspath_groovy"() {
        unzipAndTest("grails-gradle-model/src/main/groovy/org/grails/gradle/plugin/model/GrailsClasspath.groovy", [])
    }

    void "test grails-gradle-plugin/build_gradle"() {
        unzipAndTest("grails-gradle-plugin/build.gradle", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/agent/AgentTasksEnhancer_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/agent/AgentTasksEnhancer.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/commands/ApplicationContextCommandTask_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/commands/ApplicationContextCommandTask.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/commands/ApplicationContextScriptTask_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/commands/ApplicationContextScriptTask.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/core/GrailsExtension_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/core/GrailsExtension.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/core/GrailsGradlePlugin_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/core/GrailsGradlePlugin.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/core/GrailsPluginGradlePlugin_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/core/GrailsPluginGradlePlugin.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/core/IntegrationTestGradlePlugin_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/core/IntegrationTestGradlePlugin.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/core/PluginDefiner_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/core/PluginDefiner.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/doc/GrailsDocGradlePlugin_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/doc/GrailsDocGradlePlugin.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/doc/PublishGuideTask_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/doc/PublishGuideTask.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/model/GrailsClasspathToolingModelBuilder_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/model/GrailsClasspathToolingModelBuilder.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/profiles/GrailsProfileGradlePlugin_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/profiles/GrailsProfileGradlePlugin.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/profiles/GrailsProfilePublishGradlePlugin_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/profiles/GrailsProfilePublishGradlePlugin.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/profiles/tasks/ProfileCompilerTask_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/profiles/tasks/ProfileCompilerTask.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/publishing/GrailsCentralPublishGradlePlugin_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/publishing/GrailsCentralPublishGradlePlugin.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/publishing/GrailsPublishExtension_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/publishing/GrailsPublishExtension.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/run/FindMainClassTask_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/run/FindMainClassTask.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/run/GrailsRunTask_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/run/GrailsRunTask.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/util/SourceSets_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/util/SourceSets.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/watch/GrailsWatchPlugin_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/watch/GrailsWatchPlugin.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/watch/WatchConfig_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/watch/WatchConfig.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/web/GrailsWebGradlePlugin_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/web/GrailsWebGradlePlugin.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/web/gsp/GroovyPageCompileTask_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/web/gsp/GroovyPageCompileTask.groovy", [])
    }

    void "test grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/web/gsp/GroovyPagePlugin_groovy"() {
        unzipAndTest("grails-gradle-plugin/src/main/groovy/org/grails/gradle/plugin/web/gsp/GroovyPagePlugin.groovy", [])
    }

    void "test grails-gsp/build_gradle"() {
        unzipAndTest("grails-gsp/build.gradle", [])
    }

    void "test grails-gsp/src/main/groovy/org/grails/gsp/GroovyPagesMetaUtils_groovy"() {
        unzipAndTest("grails-gsp/src/main/groovy/org/grails/gsp/GroovyPagesMetaUtils.groovy", [])
    }

    void "test grails-gsp/src/main/groovy/org/grails/gsp/compiler/GroovyPageCompiler_groovy"() {
        unzipAndTest("grails-gsp/src/main/groovy/org/grails/gsp/compiler/GroovyPageCompiler.groovy", [])
    }

    void "test grails-gsp/src/test/groovy/org/grails/gsp/GroovyPagesTemplateEngineTests_groovy"() {
        unzipAndTest("grails-gsp/src/test/groovy/org/grails/gsp/GroovyPagesTemplateEngineTests.groovy", [])
    }

    void "test grails-logging/build_gradle"() {
        unzipAndTest("grails-logging/build.gradle", [])
    }

    void "test grails-logging/src/test/groovy/org/grails/compiler/logging/LoggingTransformerSpec_groovy"() {
        unzipAndTest("grails-logging/src/test/groovy/org/grails/compiler/logging/LoggingTransformerSpec.groovy", [])
    }

    void "test grails-plugin-async/build_gradle"() {
        unzipAndTest("grails-plugin-async/build.gradle", [])
    }

    void "test grails-plugin-async/src/main/groovy/grails/artefact/AsyncController_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/grails/artefact/AsyncController.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/grails/async/services/PersistenceContextPromiseDecorator_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/grails/async/services/PersistenceContextPromiseDecorator.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/grails/async/services/TransactionalPromiseDecorator_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/grails/async/services/TransactionalPromiseDecorator.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/grails/async/web/AsyncGrailsWebRequest_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/grails/async/web/AsyncGrailsWebRequest.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/grails/compiler/traits/AsyncControllerTraitInjector_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/grails/compiler/traits/AsyncControllerTraitInjector.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/org/grails/async/transform/internal/DefaultDelegateAsyncTransactionalMethodTransformer_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/org/grails/async/transform/internal/DefaultDelegateAsyncTransactionalMethodTransformer.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/org/grails/compiler/web/async/TransactionalAsyncTransformUtils_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/org/grails/compiler/web/async/TransactionalAsyncTransformUtils.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/org/grails/plugins/web/async/ControllersAsyncGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/org/grails/plugins/web/async/ControllersAsyncGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/org/grails/plugins/web/async/GrailsAsyncContext_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/org/grails/plugins/web/async/GrailsAsyncContext.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/org/grails/plugins/web/async/WebRequestPromiseDecorator_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/org/grails/plugins/web/async/WebRequestPromiseDecorator.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/org/grails/plugins/web/async/WebRequestPromiseDecoratorLookupStrategy_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/org/grails/plugins/web/async/WebRequestPromiseDecoratorLookupStrategy.groovy", [])
    }

    void "test grails-plugin-async/src/main/groovy/org/grails/plugins/web/async/mvc/AsyncActionResultTransformer_groovy"() {
        unzipAndTest("grails-plugin-async/src/main/groovy/org/grails/plugins/web/async/mvc/AsyncActionResultTransformer.groovy", [])
    }

    void "test grails-plugin-async/src/test/groovy/grails/async/services/AsyncTransactionalServiceSpec_groovy"() {
        unzipAndTest("grails-plugin-async/src/test/groovy/grails/async/services/AsyncTransactionalServiceSpec.groovy", [])
    }

    void "test grails-plugin-codecs/build_gradle"() {
        unzipAndTest("grails-plugin-codecs/build.gradle", [])
    }

    void "test grails-plugin-codecs/src/main/groovy/org/grails/plugins/CodecsGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-codecs/src/main/groovy/org/grails/plugins/CodecsGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-codecs/src/main/groovy/org/grails/plugins/codecs/URLCodec_groovy"() {
        unzipAndTest("grails-plugin-codecs/src/main/groovy/org/grails/plugins/codecs/URLCodec.groovy", [])
    }

    void "test grails-plugin-codecs/src/test/groovy/org/grails/web/codecs/HTMLCodecTests_groovy"() {
        unzipAndTest("grails-plugin-codecs/src/test/groovy/org/grails/web/codecs/HTMLCodecTests.groovy", [])
    }

    void "test grails-plugin-codecs/src/test/groovy/org/grails/web/codecs/HTMLJSCodecSpec_groovy"() {
        unzipAndTest("grails-plugin-codecs/src/test/groovy/org/grails/web/codecs/HTMLJSCodecSpec.groovy", [])
    }

    void "test grails-plugin-codecs/src/test/groovy/org/grails/web/codecs/JSONEncoderSpec_groovy"() {
        unzipAndTest("grails-plugin-codecs/src/test/groovy/org/grails/web/codecs/JSONEncoderSpec.groovy", [])
    }

    void "test grails-plugin-codecs/src/test/groovy/org/grails/web/codecs/URLCodecTests_groovy"() {
        unzipAndTest("grails-plugin-codecs/src/test/groovy/org/grails/web/codecs/URLCodecTests.groovy", [])
    }

    void "test grails-plugin-controllers/build_gradle"() {
        unzipAndTest("grails-plugin-controllers/build.gradle", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/grails/artefact/Controller_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/grails/artefact/Controller.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/grails/artefact/controller/support/AllowedMethodsHelper_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/grails/artefact/controller/support/AllowedMethodsHelper.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/grails/artefact/controller/support/RequestForwarder_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/grails/artefact/controller/support/RequestForwarder.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/grails/artefact/controller/support/ResponseRedirector_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/grails/artefact/controller/support/ResponseRedirector.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/grails/artefact/controller/support/ResponseRenderer_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/grails/artefact/controller/support/ResponseRenderer.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/grails/compiler/traits/ControllerTraitInjector_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/grails/compiler/traits/ControllerTraitInjector.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/grails/web/Controller_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/grails/web/Controller.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/org/grails/plugins/web/controllers/ControllersGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/org/grails/plugins/web/controllers/ControllersGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/org/grails/plugins/web/controllers/DefaultControllerExceptionHandlerMetaData_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/org/grails/plugins/web/controllers/DefaultControllerExceptionHandlerMetaData.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/org/grails/plugins/web/servlet/context/BootStrapClassRunner_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/org/grails/plugins/web/servlet/context/BootStrapClassRunner.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/org/grails/plugins/web/servlet/mvc/InvalidResponseHandler_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/org/grails/plugins/web/servlet/mvc/InvalidResponseHandler.groovy", [])
    }

    void "test grails-plugin-controllers/src/main/groovy/org/grails/plugins/web/servlet/mvc/ValidResponseHandler_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/main/groovy/org/grails/plugins/web/servlet/mvc/ValidResponseHandler.groovy", [])
    }

    void "test grails-plugin-controllers/src/test/groovy/grails/artefact/controller/support/AllowedMethodsHelperSpec_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/test/groovy/grails/artefact/controller/support/AllowedMethodsHelperSpec.groovy", [])
    }

    void "test grails-plugin-controllers/src/test/groovy/org/grails/compiler/web/ControllerActionTransformerClosureActionOverridingSpec_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/test/groovy/org/grails/compiler/web/ControllerActionTransformerClosureActionOverridingSpec.groovy", [])
    }

    void "test grails-plugin-controllers/src/test/groovy/org/grails/compiler/web/ControllerActionTransformerCompilationErrorsSpec_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/test/groovy/org/grails/compiler/web/ControllerActionTransformerCompilationErrorsSpec.groovy", [])
    }

    void "test grails-plugin-controllers/src/test/groovy/org/grails/compiler/web/ControllerActionTransformerSpec_groovy"() {
        unzipAndTest("grails-plugin-controllers/src/test/groovy/org/grails/compiler/web/ControllerActionTransformerSpec.groovy", [])
    }

    void "test grails-plugin-converters/build_gradle"() {
        unzipAndTest("grails-plugin-converters/build.gradle", [])
    }

    void "test grails-plugin-converters/src/main/groovy/grails/web/JSONBuilder_groovy"() {
        unzipAndTest("grails-plugin-converters/src/main/groovy/grails/web/JSONBuilder.groovy", [])
    }

    void "test grails-plugin-converters/src/main/groovy/org/grails/plugins/converters/ConvertersGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-converters/src/main/groovy/org/grails/plugins/converters/ConvertersGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-converters/src/main/groovy/org/grails/web/converters/AbstractParsingParameterCreationListener_groovy"() {
        unzipAndTest("grails-plugin-converters/src/main/groovy/org/grails/web/converters/AbstractParsingParameterCreationListener.groovy", [])
    }

    void "test grails-plugin-converters/src/main/groovy/org/grails/web/converters/ConfigurableConverter_groovy"() {
        unzipAndTest("grails-plugin-converters/src/main/groovy/org/grails/web/converters/ConfigurableConverter.groovy", [])
    }

    void "test grails-plugin-converters/src/main/groovy/org/grails/web/converters/ConvertersExtension_groovy"() {
        unzipAndTest("grails-plugin-converters/src/main/groovy/org/grails/web/converters/ConvertersExtension.groovy", [])
    }

    void "test grails-plugin-converters/src/main/groovy/org/grails/web/converters/IncludeExcludeConverter_groovy"() {
        unzipAndTest("grails-plugin-converters/src/main/groovy/org/grails/web/converters/IncludeExcludeConverter.groovy", [])
    }

    void "test grails-plugin-converters/src/main/groovy/org/grails/web/converters/configuration/configtest_groovy"() {
        unzipAndTest("grails-plugin-converters/src/main/groovy/org/grails/web/converters/configuration/configtest.groovy", [])
    }

    void "test grails-plugin-converters/src/test/groovy/grails/converters/ParsingNullJsonValuesSpec_groovy"() {
        unzipAndTest("grails-plugin-converters/src/test/groovy/grails/converters/ParsingNullJsonValuesSpec.groovy", [])
    }

    void "test grails-plugin-converters/src/test/groovy/org/grails/compiler/web/converters/ConvertersDomainTransformerSpec_groovy"() {
        unzipAndTest("grails-plugin-converters/src/test/groovy/org/grails/compiler/web/converters/ConvertersDomainTransformerSpec.groovy", [])
    }

    void "test grails-plugin-converters/src/test/groovy/org/grails/plugins/converters/api/ConvertersApiSpec_groovy"() {
        unzipAndTest("grails-plugin-converters/src/test/groovy/org/grails/plugins/converters/api/ConvertersApiSpec.groovy", [])
    }

    void "test grails-plugin-converters/src/test/groovy/org/grails/web/converters/ConverterUtilSpec_groovy"() {
        unzipAndTest("grails-plugin-converters/src/test/groovy/org/grails/web/converters/ConverterUtilSpec.groovy", [])
    }

    void "test grails-plugin-converters/src/test/groovy/org/grails/web/converters/marshaller/json/DomainClassMarshallerSpec_groovy"() {
        unzipAndTest("grails-plugin-converters/src/test/groovy/org/grails/web/converters/marshaller/json/DomainClassMarshallerSpec.groovy", [])
    }

    void "test grails-plugin-converters/src/test/groovy/org/grails/web/converters/marshaller/json/ValidationErrorsMarshallerSpec_groovy"() {
        unzipAndTest("grails-plugin-converters/src/test/groovy/org/grails/web/converters/marshaller/json/ValidationErrorsMarshallerSpec.groovy", [])
    }

    void "test grails-plugin-databinding/build_gradle"() {
        unzipAndTest("grails-plugin-databinding/build.gradle", [])
    }

    void "test grails-plugin-databinding/src/main/groovy/org/grails/databinding/converters/web/LocaleAwareBigDecimalConverter_groovy"() {
        unzipAndTest("grails-plugin-databinding/src/main/groovy/org/grails/databinding/converters/web/LocaleAwareBigDecimalConverter.groovy", [])
    }

    void "test grails-plugin-databinding/src/main/groovy/org/grails/databinding/converters/web/LocaleAwareNumberConverter_groovy"() {
        unzipAndTest("grails-plugin-databinding/src/main/groovy/org/grails/databinding/converters/web/LocaleAwareNumberConverter.groovy", [])
    }

    void "test grails-plugin-databinding/src/main/groovy/org/grails/plugins/databinding/DataBindingGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-databinding/src/main/groovy/org/grails/plugins/databinding/DataBindingGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-datasource/build_gradle"() {
        unzipAndTest("grails-plugin-datasource/build.gradle", [])
    }

    void "test grails-plugin-datasource/src/main/groovy/org/grails/plugins/datasource/DataSourceGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-datasource/src/main/groovy/org/grails/plugins/datasource/DataSourceGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-datasource/src/main/groovy/org/grails/plugins/datasource/DataSourceUtils_groovy"() {
        unzipAndTest("grails-plugin-datasource/src/main/groovy/org/grails/plugins/datasource/DataSourceUtils.groovy", [])
    }

    void "test grails-plugin-datasource/src/main/groovy/org/grails/plugins/datasource/EmbeddedDatabaseShutdownHook_groovy"() {
        unzipAndTest("grails-plugin-datasource/src/main/groovy/org/grails/plugins/datasource/EmbeddedDatabaseShutdownHook.groovy", [])
    }

    void "test grails-plugin-datasource/src/main/groovy/org/grails/plugins/datasource/TomcatJDBCPoolMBeanExporter_groovy"() {
        unzipAndTest("grails-plugin-datasource/src/main/groovy/org/grails/plugins/datasource/TomcatJDBCPoolMBeanExporter.groovy", [])
    }

    void "test grails-plugin-domain-class/build_gradle"() {
        unzipAndTest("grails-plugin-domain-class/build.gradle", [])
    }

    void "test grails-plugin-domain-class/src/main/groovy/grails/artefact/DomainClass_groovy"() {
        unzipAndTest("grails-plugin-domain-class/src/main/groovy/grails/artefact/DomainClass.groovy", [])
    }

    void "test grails-plugin-domain-class/src/main/groovy/grails/compiler/traits/DomainClassTraitInjector_groovy"() {
        unzipAndTest("grails-plugin-domain-class/src/main/groovy/grails/compiler/traits/DomainClassTraitInjector.groovy", [])
    }

    void "test grails-plugin-domain-class/src/main/groovy/org/grails/plugins/domain/DomainClassGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-domain-class/src/main/groovy/org/grails/plugins/domain/DomainClassGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-domain-class/src/main/groovy/org/grails/plugins/domain/DomainClassPluginSupport_groovy"() {
        unzipAndTest("grails-plugin-domain-class/src/main/groovy/org/grails/plugins/domain/DomainClassPluginSupport.groovy", [])
    }

    void "test grails-plugin-domain-class/src/main/groovy/org/grails/plugins/domain/support/GormApiSupport_groovy"() {
        unzipAndTest("grails-plugin-domain-class/src/main/groovy/org/grails/plugins/domain/support/GormApiSupport.groovy", [])
    }

    void "test grails-plugin-domain-class/src/main/groovy/org/grails/plugins/domain/support/GrailsDomainClassCleaner_groovy"() {
        unzipAndTest("grails-plugin-domain-class/src/main/groovy/org/grails/plugins/domain/support/GrailsDomainClassCleaner.groovy", [])
    }

    void "test grails-plugin-domain-class/src/test/groovy/grails/persistence/CircularBidirectionalMapBySpec_groovy"() {
        unzipAndTest("grails-plugin-domain-class/src/test/groovy/grails/persistence/CircularBidirectionalMapBySpec.groovy", [])
    }

    void "test grails-plugin-domain-class/src/test/groovy/grails/persistence/DomainClassTraitSpec_groovy"() {
        unzipAndTest("grails-plugin-domain-class/src/test/groovy/grails/persistence/DomainClassTraitSpec.groovy", [])
    }

    void "test grails-plugin-domain-class/src/test/groovy/grails/persistence/EntityTransformIncludesGormApiSpec_groovy"() {
        unzipAndTest("grails-plugin-domain-class/src/test/groovy/grails/persistence/EntityTransformIncludesGormApiSpec.groovy", [])
    }

    void "test grails-plugin-events/build_gradle"() {
        unzipAndTest("grails-plugin-events/build.gradle", [])
    }

    void "test grails-plugin-events/src/main/groovy/grails/events/Events_groovy"() {
        unzipAndTest("grails-plugin-events/src/main/groovy/grails/events/Events.groovy", [])
    }

    void "test grails-plugin-events/src/main/groovy/org/grails/events/ClosureEventConsumer_groovy"() {
        unzipAndTest("grails-plugin-events/src/main/groovy/org/grails/events/ClosureEventConsumer.groovy", [])
    }

    void "test grails-plugin-events/src/main/groovy/org/grails/events/reactor/GrailsReactorConfigurationReader_groovy"() {
        unzipAndTest("grails-plugin-events/src/main/groovy/org/grails/events/reactor/GrailsReactorConfigurationReader.groovy", [])
    }

    void "test grails-plugin-events/src/main/groovy/org/grails/events/spring/SpringEventTranslator_groovy"() {
        unzipAndTest("grails-plugin-events/src/main/groovy/org/grails/events/spring/SpringEventTranslator.groovy", [])
    }

    void "test grails-plugin-events/src/main/groovy/org/grails/plugins/events/EventBusGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-events/src/main/groovy/org/grails/plugins/events/EventBusGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-events/src/test/groovy/grails/events/EventsTraitSpec_groovy"() {
        unzipAndTest("grails-plugin-events/src/test/groovy/grails/events/EventsTraitSpec.groovy", [])
    }

    void "test grails-plugin-events/src/test/groovy/grails/events/SpringEventTranslatorSpec_groovy"() {
        unzipAndTest("grails-plugin-events/src/test/groovy/grails/events/SpringEventTranslatorSpec.groovy", [])
    }

    void "test grails-plugin-events/src/test/groovy/org/grails/events/reactor/GrailsReactorConfigurationReaderSpec_groovy"() {
        unzipAndTest("grails-plugin-events/src/test/groovy/org/grails/events/reactor/GrailsReactorConfigurationReaderSpec.groovy", [])
    }

    void "test grails-plugin-gsp/build_gradle"() {
        unzipAndTest("grails-plugin-gsp/build.gradle", [])
    }

    void "test grails-plugin-gsp/src/ast/groovy/grails/compiler/traits/ControllerTagLibraryTraitInjector_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/ast/groovy/grails/compiler/traits/ControllerTagLibraryTraitInjector.groovy", [])
    }

    void "test grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/GrailsLayoutViewResolverPostProcessor_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/GrailsLayoutViewResolverPostProcessor.groovy", [])
    }

    void "test grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/GroovyPagesGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/GroovyPagesGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/ApplicationTagLib_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/ApplicationTagLib.groovy", [])
    }

    void "test grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/CountryTagLib_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/CountryTagLib.groovy", [])
    }

    void "test grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/FormTagLib_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/FormTagLib.groovy", [])
    }

    void "test grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/FormatTagLib_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/FormatTagLib.groovy", [])
    }

    void "test grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/JavascriptTagLib_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/JavascriptTagLib.groovy", [])
    }

    void "test grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/PluginTagLib_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/PluginTagLib.groovy", [])
    }

    void "test grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/UrlMappingTagLib_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/UrlMappingTagLib.groovy", [])
    }

    void "test grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/ValidationTagLib_groovy"() {
        unzipAndTest("grails-plugin-gsp/src/main/groovy/org/grails/plugins/web/taglib/ValidationTagLib.groovy", [])
    }

    void "test grails-plugin-i18n/build_gradle"() {
        unzipAndTest("grails-plugin-i18n/build.gradle", [])
    }

    void "test grails-plugin-i18n/src/main/groovy/org/grails/plugins/i18n/I18nGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-i18n/src/main/groovy/org/grails/plugins/i18n/I18nGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-interceptors/build_gradle"() {
        unzipAndTest("grails-plugin-interceptors/build.gradle", [])
    }

    void "test grails-plugin-interceptors/src/main/groovy/grails/artefact/Interceptor_groovy"() {
        unzipAndTest("grails-plugin-interceptors/src/main/groovy/grails/artefact/Interceptor.groovy", [])
    }

    void "test grails-plugin-interceptors/src/main/groovy/grails/compiler/traits/InterceptorTraitInjector_groovy"() {
        unzipAndTest("grails-plugin-interceptors/src/main/groovy/grails/compiler/traits/InterceptorTraitInjector.groovy", [])
    }

    void "test grails-plugin-interceptors/src/main/groovy/grails/interceptors/Matcher_groovy"() {
        unzipAndTest("grails-plugin-interceptors/src/main/groovy/grails/interceptors/Matcher.groovy", [])
    }

    void "test grails-plugin-interceptors/src/main/groovy/org/grails/plugins/web/interceptors/GrailsInterceptorHandlerInterceptorAdapter_groovy"() {
        unzipAndTest("grails-plugin-interceptors/src/main/groovy/org/grails/plugins/web/interceptors/GrailsInterceptorHandlerInterceptorAdapter.groovy", [])
    }

    void "test grails-plugin-interceptors/src/main/groovy/org/grails/plugins/web/interceptors/InterceptorsGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-interceptors/src/main/groovy/org/grails/plugins/web/interceptors/InterceptorsGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-interceptors/src/main/groovy/org/grails/plugins/web/interceptors/UrlMappingMatcher_groovy"() {
        unzipAndTest("grails-plugin-interceptors/src/main/groovy/org/grails/plugins/web/interceptors/UrlMappingMatcher.groovy", [])
    }

    void "test grails-plugin-interceptors/src/test/groovy/grails/artefact/GrailsInterceptorHandlerInterceptorAdapterSpec_groovy"() {
        unzipAndTest("grails-plugin-interceptors/src/test/groovy/grails/artefact/GrailsInterceptorHandlerInterceptorAdapterSpec.groovy", [])
    }

    void "test grails-plugin-interceptors/src/test/groovy/grails/artefact/InterceptorSpec_groovy"() {
        unzipAndTest("grails-plugin-interceptors/src/test/groovy/grails/artefact/InterceptorSpec.groovy", [])
    }

    void "test grails-plugin-interceptors/src/test/groovy/org/grails/plugins/web/interceptors/UrlMappingMatcherSpec_groovy"() {
        unzipAndTest("grails-plugin-interceptors/src/test/groovy/org/grails/plugins/web/interceptors/UrlMappingMatcherSpec.groovy", [])
    }

    void "test grails-plugin-mimetypes/build_gradle"() {
        unzipAndTest("grails-plugin-mimetypes/build.gradle", [])
    }

    void "test grails-plugin-mimetypes/src/main/groovy/grails/web/mime/AcceptHeaderParser_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/main/groovy/grails/web/mime/AcceptHeaderParser.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/main/groovy/org/grails/plugins/web/api/MimeTypesApiSupport_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/main/groovy/org/grails/plugins/web/api/MimeTypesApiSupport.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/main/groovy/org/grails/plugins/web/mime/FormatInterceptor_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/main/groovy/org/grails/plugins/web/mime/FormatInterceptor.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/main/groovy/org/grails/plugins/web/mime/MimeTypesFactoryBean_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/main/groovy/org/grails/plugins/web/mime/MimeTypesFactoryBean.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/main/groovy/org/grails/plugins/web/mime/MimeTypesGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/main/groovy/org/grails/plugins/web/mime/MimeTypesGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/main/groovy/org/grails/web/mime/DefaultAcceptHeaderParser_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/main/groovy/org/grails/web/mime/DefaultAcceptHeaderParser.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/main/groovy/org/grails/web/mime/DefaultMimeTypeResolver_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/main/groovy/org/grails/web/mime/DefaultMimeTypeResolver.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/main/groovy/org/grails/web/mime/HttpServletRequestExtension_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/main/groovy/org/grails/web/mime/HttpServletRequestExtension.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/main/groovy/org/grails/web/mime/HttpServletResponseExtension_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/main/groovy/org/grails/web/mime/HttpServletResponseExtension.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/test/groovy/grails/web/mime/MimeUtilitySpec_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/test/groovy/grails/web/mime/MimeUtilitySpec.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/test/groovy/org/grails/web/mime/AcceptHeaderParserTests_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/test/groovy/org/grails/web/mime/AcceptHeaderParserTests.groovy", [])
    }

    void "test grails-plugin-mimetypes/src/test/groovy/org/grails/web/servlet/mvc/RequestAndResponseMimeTypesApiSpec_groovy"() {
        unzipAndTest("grails-plugin-mimetypes/src/test/groovy/org/grails/web/servlet/mvc/RequestAndResponseMimeTypesApiSpec.groovy", [])
    }

    void "test grails-plugin-rest/build_gradle"() {
        unzipAndTest("grails-plugin-rest/build.gradle", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/artefact/controller/RestResponder_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/artefact/controller/RestResponder.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/compiler/traits/RestResponderTraitInjector_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/compiler/traits/RestResponderTraitInjector.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/Link_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/Link.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/Linkable_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/Linkable.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/Resource_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/Resource.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/RestfulController_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/RestfulController.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/AbstractIncludeExcludeRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/AbstractIncludeExcludeRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/AbstractRenderContext_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/AbstractRenderContext.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/AbstractRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/AbstractRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/ContainerRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/ContainerRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/RenderContext_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/RenderContext.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/Renderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/Renderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/RendererRegistry_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/RendererRegistry.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/atom/AtomCollectionRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/atom/AtomCollectionRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/atom/AtomRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/atom/AtomRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/errors/AbstractVndErrorRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/errors/AbstractVndErrorRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/errors/VndErrorJsonRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/errors/VndErrorJsonRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/errors/VndErrorXmlRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/errors/VndErrorXmlRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/hal/HalJsonCollectionRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/hal/HalJsonCollectionRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/hal/HalJsonRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/hal/HalJsonRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/hal/HalXmlCollectionRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/hal/HalXmlCollectionRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/hal/HalXmlRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/hal/HalXmlRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/json/JsonCollectionRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/json/JsonCollectionRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/json/JsonRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/json/JsonRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/util/AbstractLinkingRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/util/AbstractLinkingRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/xml/XmlCollectionRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/xml/XmlCollectionRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/grails/rest/render/xml/XmlRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/grails/rest/render/xml/XmlRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/plugin/RestResponderGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/plugin/RestResponderGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/render/DefaultRendererRegistry_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/render/DefaultRendererRegistry.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/render/ServletRenderContext_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/render/ServletRenderContext.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/render/html/DefaultHtmlRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/render/html/DefaultHtmlRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/render/json/DefaultJsonRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/render/json/DefaultJsonRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/render/xml/DefaultXmlRenderer_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/render/xml/DefaultXmlRenderer.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/transform/LinkableTransform_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/transform/LinkableTransform.groovy", [])
    }

    void "test grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/transform/ResourceTransform_groovy"() {
        unzipAndTest("grails-plugin-rest/src/main/groovy/org/grails/plugins/web/rest/transform/ResourceTransform.groovy", [])
    }

    void "test grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/render/DefaultRendererRegistrySpec_groovy"() {
        unzipAndTest("grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/render/DefaultRendererRegistrySpec.groovy", [])
    }

    void "test grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/render/VndErrorRenderingSpec_groovy"() {
        unzipAndTest("grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/render/VndErrorRenderingSpec.groovy", [])
    }

    void "test grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/render/hal/HalJsonRendererSpec_groovy"() {
        unzipAndTest("grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/render/hal/HalJsonRendererSpec.groovy", [])
    }

    void "test grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/render/html/HtmlRendererSpec_groovy"() {
        unzipAndTest("grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/render/html/HtmlRendererSpec.groovy", [])
    }

    void "test grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/render/json/JsonRendererSpec_groovy"() {
        unzipAndTest("grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/render/json/JsonRendererSpec.groovy", [])
    }

    void "test grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/transform/LinkableTransformSpec_groovy"() {
        unzipAndTest("grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/transform/LinkableTransformSpec.groovy", [])
    }

    void "test grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/transform/ResourceTransformSpec_groovy"() {
        unzipAndTest("grails-plugin-rest/src/test/groovy/org/grails/plugins/web/rest/transform/ResourceTransformSpec.groovy", [])
    }

    void "test grails-plugin-services/build_gradle"() {
        unzipAndTest("grails-plugin-services/build.gradle", [])
    }

    void "test grails-plugin-services/src/main/groovy/grails/artefact/Service_groovy"() {
        unzipAndTest("grails-plugin-services/src/main/groovy/grails/artefact/Service.groovy", [])
    }

    void "test grails-plugin-services/src/main/groovy/grails/compiler/traits/ServiceTraitInjector_groovy"() {
        unzipAndTest("grails-plugin-services/src/main/groovy/grails/compiler/traits/ServiceTraitInjector.groovy", [])
    }

    void "test grails-plugin-services/src/main/groovy/org/grails/plugins/services/ServiceBeanAliasPostProcessor_groovy"() {
        unzipAndTest("grails-plugin-services/src/main/groovy/org/grails/plugins/services/ServiceBeanAliasPostProcessor.groovy", [])
    }

    void "test grails-plugin-services/src/main/groovy/org/grails/plugins/services/ServicesGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-services/src/main/groovy/org/grails/plugins/services/ServicesGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-testing/build_gradle"() {
        unzipAndTest("grails-plugin-testing/build.gradle", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/TestMixinTargetAware_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/TestMixinTargetAware.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/domain/DomainClassUnitTestMixin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/domain/DomainClassUnitTestMixin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/domain/MockCascadingDomainClassValidator_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/domain/MockCascadingDomainClassValidator.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/integration/Integration_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/integration/Integration.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/integration/IntegrationTestMixin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/integration/IntegrationTestMixin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/services/ServiceUnitTestMixin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/services/ServiceUnitTestMixin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/support/GrailsUnitTestMixin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/support/GrailsUnitTestMixin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/support/TestMixinRegistrar_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/support/TestMixinRegistrar.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/support/TestMixinRegistry_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/support/TestMixinRegistry.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/web/ControllerUnitTestMixin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/web/ControllerUnitTestMixin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/web/GroovyPageUnitTestMixin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/web/GroovyPageUnitTestMixin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/web/InterceptorUnitTestMixin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/web/InterceptorUnitTestMixin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/web/UrlMappingsUnitTestMixin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/web/UrlMappingsUnitTestMixin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/webflow/WebFlowUnitTestMixin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/webflow/WebFlowUnitTestMixin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/mixin/webflow/WebFlowUnitTestSupport_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/mixin/webflow/WebFlowUnitTestSupport.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/ControllerTestPlugin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/ControllerTestPlugin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/CoreBeansTestPlugin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/CoreBeansTestPlugin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/DefaultSharedRuntimeConfigurer_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/DefaultSharedRuntimeConfigurer.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/DirtiesRuntime_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/DirtiesRuntime.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/DomainClassTestPlugin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/DomainClassTestPlugin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/FreshRuntime_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/FreshRuntime.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/GrailsApplicationTestPlugin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/GrailsApplicationTestPlugin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/GroovyPageTestPlugin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/GroovyPageTestPlugin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/InterceptorTestPlugin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/InterceptorTestPlugin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/MetaClassCleanerTestPlugin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/MetaClassCleanerTestPlugin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/SharedRuntime_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/SharedRuntime.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/SharedRuntimeConfigurer_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/SharedRuntimeConfigurer.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/TestEvent_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/TestEvent.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/TestEventInterceptor_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/TestEventInterceptor.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/TestPlugin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/TestPlugin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/TestPluginUsage_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/TestPluginUsage.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/TestRuntime_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/TestRuntime.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/TestRuntimeFactory_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/TestRuntimeFactory.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/TestRuntimeJunitAdapter_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/TestRuntimeJunitAdapter.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/TestRuntimeSettings_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/TestRuntimeSettings.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/TestRuntimeUtil_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/TestRuntimeUtil.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/grails/test/runtime/WebFlowTestPlugin_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/grails/test/runtime/WebFlowTestPlugin.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/org/grails/compiler/injection/test/IntegrationTestMixinTransformation_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/org/grails/compiler/injection/test/IntegrationTestMixinTransformation.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/org/grails/test/context/junit4/GrailsJunit4ClassRunner_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/org/grails/test/context/junit4/GrailsJunit4ClassRunner.groovy", [])
    }

    void "test grails-plugin-testing/src/main/groovy/org/grails/test/mixin/support/DefaultTestMixinRegistrar_groovy"() {
        unzipAndTest("grails-plugin-testing/src/main/groovy/org/grails/test/mixin/support/DefaultTestMixinRegistrar.groovy", [])
    }

    void "test grails-plugin-testing/src/test/groovy/grails/test/mixin/MetaClassCleanupSpec_groovy"() {
        unzipAndTest("grails-plugin-testing/src/test/groovy/grails/test/mixin/MetaClassCleanupSpec.groovy", [])
    }

    void "test grails-plugin-testing/src/test/groovy/grails/test/mixin/TestForSpec_groovy"() {
        unzipAndTest("grails-plugin-testing/src/test/groovy/grails/test/mixin/TestForSpec.groovy", [])
    }

    void "test grails-plugin-testing/src/test/groovy/grails/test/mixin/TestMixinSpec_groovy"() {
        unzipAndTest("grails-plugin-testing/src/test/groovy/grails/test/mixin/TestMixinSpec.groovy", [])
    }

    void "test grails-plugin-testing/src/test/groovy/grails/test/mixin/integration/compiler/IntegrationTestMixinCompilationErrorsSpec_groovy"() {
        unzipAndTest("grails-plugin-testing/src/test/groovy/grails/test/mixin/integration/compiler/IntegrationTestMixinCompilationErrorsSpec.groovy", [])
    }

    void "test grails-plugin-testing/src/test/groovy/grails/test/runtime/TestRuntimeFactorySpec_groovy"() {
        unzipAndTest("grails-plugin-testing/src/test/groovy/grails/test/runtime/TestRuntimeFactorySpec.groovy", [])
    }

    void "test grails-plugin-url-mappings/build_gradle"() {
        unzipAndTest("grails-plugin-url-mappings/build.gradle", [])
    }

    void "test grails-plugin-url-mappings/src/main/groovy/org/grails/plugins/web/mapping/UrlMappingsGrailsPlugin_groovy"() {
        unzipAndTest("grails-plugin-url-mappings/src/main/groovy/org/grails/plugins/web/mapping/UrlMappingsGrailsPlugin.groovy", [])
    }

    void "test grails-plugin-validation/build_gradle"() {
        unzipAndTest("grails-plugin-validation/build.gradle", [])
    }

    void "test grails-plugin-validation/src/main/groovy/grails/validation/Validateable_groovy"() {
        unzipAndTest("grails-plugin-validation/src/main/groovy/grails/validation/Validateable.groovy", [])
    }

    void "test grails-plugin-validation/src/main/groovy/org/grails/web/plugins/support/ValidationSupport_groovy"() {
        unzipAndTest("grails-plugin-validation/src/main/groovy/org/grails/web/plugins/support/ValidationSupport.groovy", [])
    }

    void "test grails-plugin-validation/src/test/groovy/grails/validation/DefaultASTValidateableHelperSpec_groovy"() {
        unzipAndTest("grails-plugin-validation/src/test/groovy/grails/validation/DefaultASTValidateableHelperSpec.groovy", [])
    }

    void "test grails-shell/build_gradle"() {
        unzipAndTest("grails-shell/build.gradle", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/GrailsCli_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/GrailsCli.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/boot/GrailsDependencyVersions_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/boot/GrailsDependencyVersions.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/boot/GrailsTestCompilerAutoConfiguration_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/boot/GrailsTestCompilerAutoConfiguration.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/boot/SpringInvoker_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/boot/SpringInvoker.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/gradle/ClasspathBuildAction_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/gradle/ClasspathBuildAction.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/gradle/GradleAsyncInvoker_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/gradle/GradleAsyncInvoker.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/gradle/GradleInvoker_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/gradle/GradleInvoker.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/gradle/GradleUtil_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/gradle/GradleUtil.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/gradle/cache/CachedGradleOperation_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/gradle/cache/CachedGradleOperation.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/gradle/cache/ListReadingCachedGradleOperation_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/gradle/cache/ListReadingCachedGradleOperation.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/gradle/cache/MapReadingCachedGradleOperation_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/gradle/cache/MapReadingCachedGradleOperation.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/gradle/commands/GradleCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/gradle/commands/GradleCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/gradle/commands/GradleTaskCommandAdapter_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/gradle/commands/GradleTaskCommandAdapter.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/gradle/commands/ReadGradleTasks_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/gradle/commands/ReadGradleTasks.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/interactive/completers/AllClassCompleter_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/interactive/completers/AllClassCompleter.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/interactive/completers/ClassNameCompleter_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/interactive/completers/ClassNameCompleter.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/interactive/completers/ClosureCompleter_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/interactive/completers/ClosureCompleter.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/interactive/completers/DomainClassCompleter_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/interactive/completers/DomainClassCompleter.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/interactive/completers/EscapingFileNameCompletor_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/interactive/completers/EscapingFileNameCompletor.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/interactive/completers/RegexCompletor_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/interactive/completers/RegexCompletor.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/interactive/completers/SimpleOrFileNameCompletor_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/interactive/completers/SimpleOrFileNameCompletor.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/interactive/completers/TestsCompleter_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/interactive/completers/TestsCompleter.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/AbstractProfile_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/AbstractProfile.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/AbstractStep_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/AbstractStep.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/Command_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/Command.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/CommandArgument_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/CommandArgument.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/CommandDescription_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/CommandDescription.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/CommandException_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/CommandException.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/DefaultFeature_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/DefaultFeature.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/Feature_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/Feature.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/FileSystemProfile_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/FileSystemProfile.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/MultiStepCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/MultiStepCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/ProfileCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/ProfileCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/ProfileRepository_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/ProfileRepository.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/ProfileRepositoryAware_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/ProfileRepositoryAware.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/ProjectCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/ProjectCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/ProjectContextAware_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/ProjectContextAware.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/ResourceProfile_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/ResourceProfile.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/Step_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/Step.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/ArgumentCompletingCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/ArgumentCompletingCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/ClosureExecutingCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/ClosureExecutingCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/CommandCompleter_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/CommandCompleter.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/CommandRegistry_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/CommandRegistry.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/CreateAppCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/CreateAppCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/CreatePluginCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/CreatePluginCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/CreateProfileCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/CreateProfileCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/DefaultMultiStepCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/DefaultMultiStepCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/HelpCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/HelpCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/ListProfilesCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/ListProfilesCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/OpenCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/OpenCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/ProfileInfoCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/ProfileInfoCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/events/CommandEvents_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/events/CommandEvents.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/events/EventStorage_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/events/EventStorage.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/ApplicationContextCommandFactory_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/ApplicationContextCommandFactory.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/ClasspathCommandResourceResolver_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/ClasspathCommandResourceResolver.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/CommandFactory_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/CommandFactory.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/CommandResourceResolver_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/CommandResourceResolver.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/FileSystemCommandResourceResolver_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/FileSystemCommandResourceResolver.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/GroovyScriptCommandFactory_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/GroovyScriptCommandFactory.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/ResourceResolvingCommandFactory_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/ResourceResolvingCommandFactory.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/ServiceCommandFactory_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/ServiceCommandFactory.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/YamlCommandFactory_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/factory/YamlCommandFactory.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/io/FileSystemInteraction_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/io/FileSystemInteraction.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/io/FileSystemInteractionImpl_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/io/FileSystemInteractionImpl.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/io/ServerInteraction_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/io/ServerInteraction.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/script/GroovyScriptCommand_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/script/GroovyScriptCommand.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/script/GroovyScriptCommandTransform_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/script/GroovyScriptCommandTransform.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/templates/SimpleTemplate_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/templates/SimpleTemplate.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/templates/TemplateException_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/templates/TemplateException.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/templates/TemplateRenderer_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/templates/TemplateRenderer.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/commands/templates/TemplateRendererImpl_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/commands/templates/TemplateRendererImpl.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/repository/AbstractJarProfileRepository_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/repository/AbstractJarProfileRepository.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/repository/GrailsAetherGrapeEngineFactory_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/repository/GrailsAetherGrapeEngineFactory.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/repository/GrailsRepositoryConfiguration_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/repository/GrailsRepositoryConfiguration.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/repository/MavenProfileRepository_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/repository/MavenProfileRepository.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/repository/StaticJarProfileRepository_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/repository/StaticJarProfileRepository.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/steps/DefaultStepFactory_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/steps/DefaultStepFactory.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/steps/ExecuteStep_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/steps/ExecuteStep.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/steps/GradleStep_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/steps/GradleStep.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/steps/MkdirStep_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/steps/MkdirStep.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/steps/RenderStep_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/steps/RenderStep.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/steps/StepFactory_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/steps/StepFactory.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/steps/StepRegistry_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/steps/StepRegistry.groovy", [])
    }

    void "test grails-shell/src/main/groovy/org/grails/cli/profile/support/ArtefactVariableResolver_groovy"() {
        unzipAndTest("grails-shell/src/main/groovy/org/grails/cli/profile/support/ArtefactVariableResolver.groovy", [])
    }

    void "test grails-shell/src/test/groovy/org/grails/cli/interactive/completers/RegexCompletorSpec_groovy"() {
        unzipAndTest("grails-shell/src/test/groovy/org/grails/cli/interactive/completers/RegexCompletorSpec.groovy", [])
    }

    void "test grails-shell/src/test/groovy/org/grails/cli/profile/ResourceProfileSpec_groovy"() {
        unzipAndTest("grails-shell/src/test/groovy/org/grails/cli/profile/ResourceProfileSpec.groovy", [])
    }

    void "test grails-shell/src/test/groovy/org/grails/cli/profile/commands/CommandScriptTransformSpec_groovy"() {
        unzipAndTest("grails-shell/src/test/groovy/org/grails/cli/profile/commands/CommandScriptTransformSpec.groovy", [])
    }

    void "test grails-shell/src/test/groovy/org/grails/cli/profile/commands/CreateAppCommandSpec_groovy"() {
        unzipAndTest("grails-shell/src/test/groovy/org/grails/cli/profile/commands/CreateAppCommandSpec.groovy", [])
    }

    void "test grails-shell/src/test/groovy/org/grails/cli/profile/repository/MavenRepositorySpec_groovy"() {
        unzipAndTest("grails-shell/src/test/groovy/org/grails/cli/profile/repository/MavenRepositorySpec.groovy", [])
    }

    void "test grails-shell/src/test/groovy/org/grails/cli/profile/steps/StepRegistrySpec_groovy"() {
        unzipAndTest("grails-shell/src/test/groovy/org/grails/cli/profile/steps/StepRegistrySpec.groovy", [])
    }

    void "test grails-shell/src/test/resources/gradle-sample/build_gradle"() {
        unzipAndTest("grails-shell/src/test/resources/gradle-sample/build.gradle", [])
    }

    void "test grails-shell/src/test/resources/gradle-sample/settings_gradle"() {
        unzipAndTest("grails-shell/src/test/resources/gradle-sample/settings.gradle", [])
    }

    void "test grails-shell/src/test/resources/gradle-sample/subproj2/build_gradle"() {
        unzipAndTest("grails-shell/src/test/resources/gradle-sample/subproj2/build.gradle", [])
    }

    void "test grails-shell/src/test/resources/gradle-sample/subproj/build_gradle"() {
        unzipAndTest("grails-shell/src/test/resources/gradle-sample/subproj/build.gradle", [])
    }

    void "test grails-shell/src/test/resources/profiles-repository/profiles/web/commands/TestGroovy_groovy"() {
        unzipAndTest("grails-shell/src/test/resources/profiles-repository/profiles/web/commands/TestGroovy.groovy", [])
    }

    void "test grails-spring/build_gradle"() {
        unzipAndTest("grails-spring/build.gradle", [])
    }

    void "test grails-spring/src/main/groovy/grails/spring/DynamicElementReader_groovy"() {
        unzipAndTest("grails-spring/src/main/groovy/grails/spring/DynamicElementReader.groovy", [])
    }

    void "test grails-taglib/build_gradle"() {
        unzipAndTest("grails-taglib/build.gradle", [])
    }

    void "test grails-taglib/src/main/groovy/org/grails/taglib/NamespacedTagDispatcher_groovy"() {
        unzipAndTest("grails-taglib/src/main/groovy/org/grails/taglib/NamespacedTagDispatcher.groovy", [])
    }

    void "test grails-taglib/src/main/groovy/org/grails/taglib/TagLibraryMetaUtils_groovy"() {
        unzipAndTest("grails-taglib/src/main/groovy/org/grails/taglib/TagLibraryMetaUtils.groovy", [])
    }

    void "test grails-taglib/src/main/groovy/org/grails/taglib/TemplateNamespacedTagDispatcher_groovy"() {
        unzipAndTest("grails-taglib/src/main/groovy/org/grails/taglib/TemplateNamespacedTagDispatcher.groovy", [])
    }

    void "test grails-taglib/src/main/groovy/org/grails/taglib/encoder/OutputEncodingSettings_groovy"() {
        unzipAndTest("grails-taglib/src/main/groovy/org/grails/taglib/encoder/OutputEncodingSettings.groovy", [])
    }

    void "test grails-taglib/src/main/groovy/org/grails/taglib/encoder/WithCodecHelper_groovy"() {
        unzipAndTest("grails-taglib/src/main/groovy/org/grails/taglib/encoder/WithCodecHelper.groovy", [])
    }

    void "test grails-taglib/src/test/groovy/org/grails/taglib/GroovyPageAttributesTests_groovy"() {
        unzipAndTest("grails-taglib/src/test/groovy/org/grails/taglib/GroovyPageAttributesTests.groovy", [])
    }

    void "test grails-taglib/src/test/groovy/org/grails/taglib/GroovyPageTagWriterSpec_groovy"() {
        unzipAndTest("grails-taglib/src/test/groovy/org/grails/taglib/GroovyPageTagWriterSpec.groovy", [])
    }

    void "test grails-taglib/src/test/groovy/org/grails/taglib/encoder/WithCodecHelperSpec_groovy"() {
        unzipAndTest("grails-taglib/src/test/groovy/org/grails/taglib/encoder/WithCodecHelperSpec.groovy", [])
    }

    void "test grails-test-suite-base/build_gradle"() {
        unzipAndTest("grails-test-suite-base/build.gradle", [])
    }

    void "test grails-test-suite-base/src/main/groovy/org/grails/web/servlet/mvc/AbstractGrailsControllerTests_groovy"() {
        unzipAndTest("grails-test-suite-base/src/main/groovy/org/grails/web/servlet/mvc/AbstractGrailsControllerTests.groovy", [])
    }

    void "test grails-test-suite-base/src/main/groovy/org/grails/web/taglib/AbstractGrailsTagTests_groovy"() {
        unzipAndTest("grails-test-suite-base/src/main/groovy/org/grails/web/taglib/AbstractGrailsTagTests.groovy", [])
    }

    void "test grails-test-suite-persistence/build_gradle"() {
        unzipAndTest("grails-test-suite-persistence/build.gradle", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/grails/artefact/DomainClassTraitSpec_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/grails/artefact/DomainClassTraitSpec.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/grails/gorm/criteri/WithCriteriaReadOnlySpec_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/grails/gorm/criteri/WithCriteriaReadOnlySpec.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/grails/test/mixin/domain/DomainClassUnitTestMixinTests_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/grails/test/mixin/domain/DomainClassUnitTestMixinTests.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/grails/test/mixin/domain/SaveDomainSpec_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/grails/test/mixin/domain/SaveDomainSpec.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/grails/web/databinding/GrailsWebDataBinderBindingXmlSpec_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/grails/web/databinding/GrailsWebDataBinderBindingXmlSpec.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/grails/web/databinding/GrailsWebDataBinderConfigurationSpec_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/grails/web/databinding/GrailsWebDataBinderConfigurationSpec.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/grails/web/databinding/GrailsWebDataBinderListenerSpec_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/grails/web/databinding/GrailsWebDataBinderListenerSpec.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/grails/web/databinding/GrailsWebDataBinderSpec_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/grails/web/databinding/GrailsWebDataBinderSpec.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/grails/web/databinding/GrailsWebDataBindingStructuredEditorSpec_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/grails/web/databinding/GrailsWebDataBindingStructuredEditorSpec.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/org/grails/domain/compiler/DomainPropertiesAccessorSpec_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/org/grails/domain/compiler/DomainPropertiesAccessorSpec.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/org/grails/orm/support/TransactionManagerPostProcessorTests_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/org/grails/orm/support/TransactionManagerPostProcessorTests.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/org/grails/plugins/MockHibernateGrailsPlugin_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/org/grails/plugins/MockHibernateGrailsPlugin.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/org/grails/plugins/services/ScopedProxyAndServiceClassTests_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/org/grails/plugins/services/ScopedProxyAndServiceClassTests.groovy", [])
    }

    void "test grails-test-suite-persistence/src/test/groovy/org/grails/plugins/services/ServicesGrailsPluginTests_groovy"() {
        unzipAndTest("grails-test-suite-persistence/src/test/groovy/org/grails/plugins/services/ServicesGrailsPluginTests.groovy", [])
    }

    void "test grails-test-suite-uber/build_gradle"() {
        unzipAndTest("grails-test-suite-uber/build.gradle", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/compiler/GrailsCompileStaticCompilationErrorsSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/compiler/GrailsCompileStaticCompilationErrorsSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/compiler/GrailsTypeCheckedCompilationErrorsSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/compiler/GrailsTypeCheckedCompilationErrorsSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/persistence/EntityTransformTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/persistence/EntityTransformTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/spring/BeanBuilderTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/spring/BeanBuilderTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/spring/DynamicElementReaderTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/spring/DynamicElementReaderTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/MetaTestHelper_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/MetaTestHelper.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/AddToAndServiceInjectionTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/AddToAndServiceInjectionTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/AnotherController_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/AnotherController.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/AstEnhancedControllerUnitTestMixinTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/AstEnhancedControllerUnitTestMixinTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/AutowireServiceViaDefineBeansTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/AutowireServiceViaDefineBeansTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/BidirectionalOneToManyUnitTestTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/BidirectionalOneToManyUnitTestTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/CascadeValidationForEmbeddedSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/CascadeValidationForEmbeddedSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/ControllerAndGroovyPageMixinTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/ControllerAndGroovyPageMixinTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/ControllerMockWithMultipleControllersSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/ControllerMockWithMultipleControllersSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/ControllerTestForTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/ControllerTestForTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/ControllerUnitTestMixinTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/ControllerUnitTestMixinTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/ControllerWithMockCollabTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/ControllerWithMockCollabTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassAnnotatedSetupMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassAnnotatedSetupMethodTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassControllerUnitTestMixinTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassControllerUnitTestMixinTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassDeepValidationSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassDeepValidationSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassMetaClassCleanupSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassMetaClassCleanupSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassSetupMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassSetupMethodTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassWithAutoTimestampSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassWithAutoTimestampSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassWithCustomValidatorTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassWithCustomValidatorTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassWithDefaultConstraintsUnitTestMixinTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassWithDefaultConstraintsUnitTestMixinTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassWithUniqueConstraintSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/DomainClassWithUniqueConstraintSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/FirstController_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/FirstController.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/GroovyPageUnitTestMixinTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/GroovyPageUnitTestMixinTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/GroovyPageUnitTestMixinWithCustomViewDirSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/GroovyPageUnitTestMixinWithCustomViewDirSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/InheritanceWithValidationTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/InheritanceWithValidationTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/InterceptorUnitTestMixinSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/InterceptorUnitTestMixinSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/MainContextTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/MainContextTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/MockedBeanSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/MockedBeanSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/MyService_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/MyService.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/PartialMockWithManyToManySpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/PartialMockWithManyToManySpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/ResourceAnnotationRestfulControllerSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/ResourceAnnotationRestfulControllerSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/RestfulControllerSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/RestfulControllerSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/RestfulControllerSubclassSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/RestfulControllerSubclassSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/RestfulControllerSuperClassSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/RestfulControllerSuperClassSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/SetupTeardownInvokeTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/SetupTeardownInvokeTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/SpyBeanSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/SpyBeanSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/StaticCallbacksSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/StaticCallbacksSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/TagLibraryInvokeBodySpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/TagLibraryInvokeBodySpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/TestForControllerWithoutMockDomainTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/TestForControllerWithoutMockDomainTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/TestInstanceCallbacksAnnotationsSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/TestInstanceCallbacksAnnotationsSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/TestInstanceCallbacksSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/TestInstanceCallbacksSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/TestMixinSetupTeardownInvokeTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/TestMixinSetupTeardownInvokeTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/UnitTestDataBindingAssociatonTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/UnitTestDataBindingAssociatonTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/UnitTestEmbeddedPropertyQuery_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/UnitTestEmbeddedPropertyQuery.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/UrlMappingsTestMixinTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/UrlMappingsTestMixinTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/User_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/User.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/support/GrailsUnitTestMixinGrailsApplicationAwareSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/support/GrailsUnitTestMixinGrailsApplicationAwareSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/mixin/unique/UniqueConstraintOnHasOneSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/mixin/unique/UniqueConstraintOnHasOneSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/test/runtime/DirtiesRuntimeSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/test/runtime/DirtiesRuntimeSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/util/BuildScopeTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/util/BuildScopeTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/util/ClosureToMapPopulatorTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/util/ClosureToMapPopulatorTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/util/CollectionUtilsTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/util/CollectionUtilsTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/validation/CommandObjectConstraintGettersSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/validation/CommandObjectConstraintGettersSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/validation/DomainClassValidationSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/validation/DomainClassValidationSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/validation/DomainConstraintGettersSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/validation/DomainConstraintGettersSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/validation/ValidateableMockSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/validation/ValidateableMockSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/validation/ValidateableTraitAdHocSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/validation/ValidateableTraitAdHocSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/validation/ValidateableTraitSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/validation/ValidateableTraitSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/grails/web/JSONBuilderTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/grails/web/JSONBuilderTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/cli/ScriptNameResolverTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/cli/ScriptNameResolverTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/DefaultArtefactInfoTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/DefaultArtefactInfoTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/DefaultGrailsCodecClassTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/DefaultGrailsCodecClassTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/DefaultGrailsDomainClassPropertyTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/DefaultGrailsDomainClassPropertyTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/DefaultGrailsDomainClassTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/DefaultGrailsDomainClassTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/GrailsMetaClassUtilsTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/GrailsMetaClassUtilsTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/GrailsPluginManagerTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/GrailsPluginManagerTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/MultipleClassesPerFileTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/MultipleClassesPerFileTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/TestReload_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/TestReload.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/UrlMappingsArtefactHandlerTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/UrlMappingsArtefactHandlerTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/cfg/ExampleConfigClassObject_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/cfg/ExampleConfigClassObject.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/cfg/ExampleConfigCompiledClass_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/cfg/ExampleConfigCompiledClass.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/metaclass/LazyMetaPropertyMapSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/metaclass/LazyMetaPropertyMapSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/metaclass/LazyMetaPropertyMapTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/metaclass/LazyMetaPropertyMapTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/metaclass/MetaClassEnhancerSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/metaclass/MetaClassEnhancerSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/metaclass/MetaClassEnhancerTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/metaclass/MetaClassEnhancerTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/commons/spring/OptimizedAutowireCapableBeanFactorySpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/commons/spring/OptimizedAutowireCapableBeanFactorySpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/domain/CircularRelationship_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/domain/CircularRelationship.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/domain/ManyToManyTest_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/domain/ManyToManyTest.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/domain/OneToManyTest2_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/domain/OneToManyTest2.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/domain/OneToOneTest_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/domain/OneToOneTest.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/domain/RelationshipsTest_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/domain/RelationshipsTest.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/domain/Test1_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/domain/Test1.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/domain/Test2_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/domain/Test2.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/domain/UniOneToManyTest_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/domain/UniOneToManyTest.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/CoreGrailsPluginTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/CoreGrailsPluginTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/PluginLoadOrderTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/PluginLoadOrderTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/grails-app/conf/NonPooledApplicationDataSource_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/grails-app/conf/NonPooledApplicationDataSource.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/grails-app/conf/PooledApplicationDataSource_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/grails-app/conf/PooledApplicationDataSource.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/grails-app/services/TestService_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/grails-app/services/TestService.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/metadata/GrailsPluginMetadataTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/metadata/GrailsPluginMetadataTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/testing/GrailsMockHttpServletRequestSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/testing/GrailsMockHttpServletRequestSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/testing/GrailsMockHttpServletRequestTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/testing/GrailsMockHttpServletRequestTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/testing/GrailsMockHttpServletResponseTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/testing/GrailsMockHttpServletResponseTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/testing/GrailsMockHttpSessionTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/testing/GrailsMockHttpSessionTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/web/rest/render/atom/AtomDomainClassRendererSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/web/rest/render/atom/AtomDomainClassRendererSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/web/rest/render/hal/HalDomainClassJsonRendererSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/web/rest/render/hal/HalDomainClassJsonRendererSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/plugins/web/rest/render/hal/HalDomainClassXmlRendererSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/plugins/web/rest/render/hal/HalDomainClassXmlRendererSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/reload/SpringProxiedBeanReloadTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/reload/SpringProxiedBeanReloadTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/test/support/ControllerNameExtractorTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/test/support/ControllerNameExtractorTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/test/support/MockHibernatePluginHelper_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/test/support/MockHibernatePluginHelper.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/validation/CascadingErrorCountSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/validation/CascadingErrorCountSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/validation/ConstrainedPropertyBuilderForCommandsTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/validation/ConstrainedPropertyBuilderForCommandsTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/validation/ConstraintMessageTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/validation/ConstraintMessageTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/validation/ConstraintsBuilderTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/validation/ConstraintsBuilderTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/validation/GrailsDomainClassValidatorTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/validation/GrailsDomainClassValidatorTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/validation/NullableConstraintTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/validation/NullableConstraintTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/validation/TestConstraints_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/validation/TestConstraints.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/validation/TestingValidationSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/validation/TestingValidationSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/codecs/HTMLJSCodecIntegrationSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/codecs/HTMLJSCodecIntegrationSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/errors/GrailsExceptionResolverTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/errors/GrailsExceptionResolverTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/filters/HiddenHttpMethodFilterTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/filters/HiddenHttpMethodFilterTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/i18n/ParamsAwareLocaleChangeInterceptorTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/i18n/ParamsAwareLocaleChangeInterceptorTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/json/JSONObjectTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/json/JSONObjectTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/metaclass/ChainMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/metaclass/ChainMethodTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/metaclass/ChainMethodWithRequestDataValueProcessorSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/metaclass/ChainMethodWithRequestDataValueProcessorSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/metaclass/ForwardMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/metaclass/ForwardMethodTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/metaclass/ForwardMethodspec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/metaclass/ForwardMethodspec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/metaclass/WithFormMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/metaclass/WithFormMethodTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/DefaultGrailsApplicationAttributesTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/DefaultGrailsApplicationAttributesTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/FlashScopeWithErrorsTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/FlashScopeWithErrorsTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/MultipleRenderCallsContentTypeTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/MultipleRenderCallsContentTypeTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/RenderMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/RenderMethodTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/ControllerInheritanceTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/ControllerInheritanceTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/ParamsObjectTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/ParamsObjectTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/RedirectController_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/RedirectController.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/RedirectMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/RedirectMethodTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/RedirectMethodWithRequestDataValueProcessorSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/RedirectMethodWithRequestDataValueProcessorSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/RedirectToDefaultActionTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/RedirectToDefaultActionTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/RenderDynamicMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/RenderDynamicMethodTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/ReturnModelAndViewController_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/ReturnModelAndViewController.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/TagLibDynamicMethodsTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/TagLibDynamicMethodsTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/alpha/AnotherNamespacedController_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/alpha/AnotherNamespacedController.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/alpha/NamespacedController_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/alpha/NamespacedController.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/beta/AnotherNamespacedController_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/beta/AnotherNamespacedController.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/beta/NamespacedController_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/beta/NamespacedController.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/controller1_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/controller1.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/controller2_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/controller2.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/controller4_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/servlet/mvc/controller4.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/sitemesh/FactoryHolderTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/sitemesh/FactoryHolderTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/sitemesh/FullSitemeshLifeCycleTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/sitemesh/FullSitemeshLifeCycleTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/sitemesh/FullSitemeshLifeCycleWithNoPreprocessingTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/sitemesh/FullSitemeshLifeCycleWithNoPreprocessingTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/sitemesh/GSPSitemeshPageTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/sitemesh/GSPSitemeshPageTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/util/CodecWithClosureProperties_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/util/CodecWithClosureProperties.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/util/StreamCharBufferSpec_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/util/StreamCharBufferSpec.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/org/grails/web/util/WebUtilsTests_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/org/grails/web/util/WebUtilsTests.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/sharedruntimetest/MySharedRuntimeConfigurer_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/sharedruntimetest/MySharedRuntimeConfigurer.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/sharedruntimetest/SharedRuntimeCheck_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/sharedruntimetest/SharedRuntimeCheck.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/sharedruntimetest/SharedRuntimeSample2Test_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/sharedruntimetest/SharedRuntimeSample2Test.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/sharedruntimetest/SharedRuntimeSampleTest_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/sharedruntimetest/SharedRuntimeSampleTest.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/sharedruntimetest/subpackage/SharedRuntimeByPkgSample2Test_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/sharedruntimetest/subpackage/SharedRuntimeByPkgSample2Test.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/groovy/sharedruntimetest/subpackage/SharedRuntimeByPkgSampleTest_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/groovy/sharedruntimetest/subpackage/SharedRuntimeByPkgSampleTest.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/resources/grails/spring/resources1_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/resources/grails/spring/resources1.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/resources/org/grails/commons/cfg/ExampleConfigDefaults_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/resources/org/grails/commons/cfg/ExampleConfigDefaults.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/resources/org/grails/commons/cfg/ExampleConfigScript_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/resources/org/grails/commons/cfg/ExampleConfigScript.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/resources/org/grails/commons/classes_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/resources/org/grails/commons/classes.groovy", [])
    }

    void "test grails-test-suite-uber/src/test/resources/org/grails/plugins/ClassEditorGrailsPlugin_groovy"() {
        unzipAndTest("grails-test-suite-uber/src/test/resources/org/grails/plugins/ClassEditorGrailsPlugin.groovy", [])
    }

    void "test grails-test-suite-uber/test/resources/grails-app/conf/BuildConfig_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/resources/grails-app/conf/BuildConfig.groovy", [])
    }

    void "test grails-test-suite-uber/test/resources/grails-plugin-utils/global-plugins/logging-0_1/LoggingGrailsPlugin_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/resources/grails-plugin-utils/global-plugins/logging-0.1/LoggingGrailsPlugin.groovy", [])
    }

    void "test grails-test-suite-uber/test/resources/grails-plugin-utils/global-plugins/logging-0_1/scripts/DoSomething_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/resources/grails-plugin-utils/global-plugins/logging-0.1/scripts/DoSomething.groovy", [])
    }

    void "test grails-test-suite-uber/test/resources/grails-plugin-utils/global-plugins/logging-0_1/scripts/_Install_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/resources/grails-plugin-utils/global-plugins/logging-0.1/scripts/_Install.groovy", [])
    }

    void "test grails-test-suite-uber/test/resources/grails-plugin-utils/grails-debug/scripts/RunDebug_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/resources/grails-plugin-utils/grails-debug/scripts/RunDebug.groovy", [])
    }

    void "test grails-test-suite-uber/test/resources/grails-plugin-utils/plugins/jsecurity-0_3/JSecurityGrailsPlugin_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/resources/grails-plugin-utils/plugins/jsecurity-0.3/JSecurityGrailsPlugin.groovy", [])
    }

    void "test grails-test-suite-uber/test/resources/grails-plugin-utils/plugins/jsecurity-0_3/scripts/CreateAuthController_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/resources/grails-plugin-utils/plugins/jsecurity-0.3/scripts/CreateAuthController.groovy", [])
    }

    void "test grails-test-suite-uber/test/resources/grails-plugin-utils/plugins/jsecurity-0_3/scripts/CreateDbRealm_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/resources/grails-plugin-utils/plugins/jsecurity-0.3/scripts/CreateDbRealm.groovy", [])
    }

    void "test grails-test-suite-uber/test/resources/spring/test_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/resources/spring/test.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/inline-plugins/app/grails-app/conf/BuildConfig_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/inline-plugins/app/grails-app/conf/BuildConfig.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/inline-plugins/plugins/foo/FooGrailsPlugin_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/inline-plugins/plugins/foo/FooGrailsPlugin.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/inline-plugins/plugins/foo/grails-app/controllers/foo/FooController_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/inline-plugins/plugins/foo/grails-app/controllers/foo/FooController.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/inline-plugins/plugins/foobar/FoobarGrailsPlugin_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/inline-plugins/plugins/foobar/FoobarGrailsPlugin.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/inline-plugins/plugins/foobar/grails-app/controllers/foobar/FoobarController_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/inline-plugins/plugins/foobar/grails-app/controllers/foobar/FoobarController.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/nested-inline-plugins/app/grails-app/conf/BuildConfig_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/nested-inline-plugins/app/grails-app/conf/BuildConfig.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/nested-inline-plugins/plugins/plugin-one/PluginOneGrailsPlugin_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/nested-inline-plugins/plugins/plugin-one/PluginOneGrailsPlugin.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/nested-inline-plugins/plugins/plugin-one/grails-app/conf/BuildConfig_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/nested-inline-plugins/plugins/plugin-one/grails-app/conf/BuildConfig.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/nested-inline-plugins/plugins/plugin-two/PluginTwoGrailsPlugin_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/nested-inline-plugins/plugins/plugin-two/PluginTwoGrailsPlugin.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/BootStrap_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/BootStrap.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/BuildConfig_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/BuildConfig.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/Config_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/Config.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/DataSource_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/DataSource.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/UrlMappings_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/UrlMappings.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/spring/resources_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/grails-app/conf/spring/resources.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/hibernate-1_2-SNAPSHOT/HibernateGrailsPlugin_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/hibernate-1.2-SNAPSHOT/HibernateGrailsPlugin.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/hibernate-1_2-SNAPSHOT/dependencies_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/hibernate-1.2-SNAPSHOT/dependencies.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/hibernate-1_2-SNAPSHOT/scripts/_Install_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/hibernate-1.2-SNAPSHOT/scripts/_Install.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/hibernate-1_2-SNAPSHOT/scripts/_Uninstall_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/hibernate-1.2-SNAPSHOT/scripts/_Uninstall.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/hibernate-1_2-SNAPSHOT/scripts/_Upgrade_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/hibernate-1.2-SNAPSHOT/scripts/_Upgrade.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/webflow-1_2-SNAPSHOT/WebflowGrailsPlugin_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/webflow-1.2-SNAPSHOT/WebflowGrailsPlugin.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/webflow-1_2-SNAPSHOT/dependencies_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/webflow-1.2-SNAPSHOT/dependencies.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/webflow-1_2-SNAPSHOT/scripts/_Install_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/webflow-1.2-SNAPSHOT/scripts/_Install.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/webflow-1_2-SNAPSHOT/scripts/_Uninstall_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/webflow-1.2-SNAPSHOT/scripts/_Uninstall.groovy", [])
    }

    void "test grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/webflow-1_2-SNAPSHOT/scripts/_Upgrade_groovy"() {
        unzipAndTest("grails-test-suite-uber/test/test-projects/plugin-build-settings/plugins/webflow-1.2-SNAPSHOT/scripts/_Upgrade.groovy", [])
    }

    void "test grails-test-suite-web/build_gradle"() {
        unzipAndTest("grails-test-suite-web/build.gradle", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/artefact/ControllerTraitSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/artefact/ControllerTraitSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/artefact/TagLibraryTraitSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/artefact/TagLibraryTraitSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/gsp/PageRendererSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/gsp/PageRendererSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/rest/web/RespondMethodSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/rest/web/RespondMethodSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/test/AbstractGrailsEnvChangingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/test/AbstractGrailsEnvChangingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/test/mixin/TagLibWithServiceMockTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/test/mixin/TagLibWithServiceMockTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/test/mixin/UrlMappingsTestForTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/test/mixin/UrlMappingsTestForTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/test/web/AsyncControllerTestSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/test/web/AsyncControllerTestSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/test/web/ControllerWithGroovyMixinSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/test/web/ControllerWithGroovyMixinSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/test/web/FordedUrlSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/test/web/FordedUrlSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/test/web/GetHeadersFromResponseSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/test/web/GetHeadersFromResponseSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/grails/test/web/RedirectToDomainSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/grails/test/web/RedirectToDomainSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/compiler/web/ControllerActionTransformerAllowedMethodsSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/compiler/web/ControllerActionTransformerAllowedMethodsSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/compiler/web/WithFormatSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/compiler/web/WithFormatSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/compiler/web/converters/ConvertersControllersApiSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/compiler/web/converters/ConvertersControllersApiSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/compiler/web/taglib/TagLibraryTransformerSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/compiler/web/taglib/TagLibraryTransformerSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/compiler/tags/GroovyEachParseTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/compiler/tags/GroovyEachParseTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/compiler/tags/GroovyEachTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/compiler/tags/GroovyEachTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/compiler/tags/GroovyFindAllTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/compiler/tags/GroovyFindAllTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/compiler/tags/GroovyGrepTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/compiler/tags/GroovyGrepTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/compiler/tags/GroovySyntaxTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/compiler/tags/GroovySyntaxTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/GroovyPageWithJSPTagsTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/GroovyPageWithJSPTagsTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/GroovyPagesPageContextTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/GroovyPagesPageContextTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/IterativeJspTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/IterativeJspTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/SimpleJspTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/SimpleJspTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/SimpleTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/SimpleTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/TagLibraryResolverTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/TagLibraryResolverTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/TldReaderTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/TldReaderTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/WebXmlTagLibraryReaderTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/gsp/jsp/WebXmlTagLibraryReaderTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/plugins/web/rest/render/xml/DefaultXmlRendererSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/plugins/web/rest/render/xml/DefaultXmlRendererSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindStringArrayToGenericListTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindStringArrayToGenericListTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindToEnumTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindToEnumTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindToObjectWithEmbeddableTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindToObjectWithEmbeddableTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindToPropertyThatIsNotReadableTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindToPropertyThatIsNotReadableTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindXmlWithAssociationTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindXmlWithAssociationTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindingExcludeTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindingExcludeTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindingRequestMethodSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindingRequestMethodSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindingToNullableTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/BindingToNullableTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/CheckboxBindingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/CheckboxBindingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/ControllerActionParameterBindingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/ControllerActionParameterBindingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/DataBindingLazyMetaPropertyMapTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/DataBindingLazyMetaPropertyMapTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/DataBindingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/DataBindingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/DefaultASTDatabindingHelperDomainClassSpecialPropertiesSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/DefaultASTDatabindingHelperDomainClassSpecialPropertiesSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/EnumBindingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/EnumBindingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/GrailsParameterMapBindingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/GrailsParameterMapBindingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/JSONBindingToNullTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/JSONBindingToNullTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/JSONRequestToResponseRenderingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/JSONRequestToResponseRenderingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/NestedXmlBindingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/NestedXmlBindingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/hal/json/HalJsonBindingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/hal/json/HalJsonBindingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/hal/xml/HalXmlBindingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/hal/xml/HalXmlBindingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/json/JsonBindingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/json/JsonBindingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/json/JsonBindingWithExceptionHandlerSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/json/JsonBindingWithExceptionHandlerSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/binding/xml/XmlBindingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/binding/xml/XmlBindingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/codecs/CodecSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/codecs/CodecSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/ClassWithNoValidateMethod_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/ClassWithNoValidateMethod.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/CommandObjectInstantiationSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/CommandObjectInstantiationSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/CommandObjectNullabilitySpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/CommandObjectNullabilitySpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/CommandObjectsSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/CommandObjectsSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/NonValidateableCommand_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/NonValidateableCommand.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/SomeValidateableClass_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/commandobjects/SomeValidateableClass.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/controllers/ContentNegotiationSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/controllers/ContentNegotiationSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/controllers/ControllerExceptionHandlerCompilationErrorsSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/controllers/ControllerExceptionHandlerCompilationErrorsSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/controllers/ControllerExceptionHandlerInheritanceSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/controllers/ControllerExceptionHandlerInheritanceSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/controllers/ControllerExceptionHandlerSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/controllers/ControllerExceptionHandlerSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/controllers/ControllerMetaProgrammingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/controllers/ControllerMetaProgrammingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/converters/ControllerWithXmlConvertersTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/converters/ControllerWithXmlConvertersTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/converters/ConverterConfigurationTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/converters/ConverterConfigurationTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/converters/JSONArrayTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/converters/JSONArrayTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/converters/JSONConverterTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/converters/JSONConverterTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/converters/MarshallerRegistrarSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/converters/MarshallerRegistrarSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/converters/XMLConverterTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/converters/XMLConverterTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/includes/IncludeHandlingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/includes/IncludeHandlingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/json/DomainClassCollectionRenderingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/json/DomainClassCollectionRenderingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/json/JSONWriterSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/json/JSONWriterSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/AbstractGrailsMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/AbstractGrailsMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/AdditionalParamsMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/AdditionalParamsMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/DoubleWildcardUrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/DoubleWildcardUrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/DynamicActionNameEvaluatingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/DynamicActionNameEvaluatingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/DynamicParameterValuesTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/DynamicParameterValuesTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/IdUrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/IdUrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/OverlappingUrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/OverlappingUrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/RegexUrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/RegexUrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/ResponseCodeUrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/ResponseCodeUrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/RestfulMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/RestfulMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/RestfulReverseUrlRenderingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/RestfulReverseUrlRenderingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/ReverseUrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/ReverseUrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/ReverseUrlMappingToDefaultActionTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/ReverseUrlMappingToDefaultActionTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/RootUrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/RootUrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UriUrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UriUrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UrlMappingEvaluatorTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UrlMappingEvaluatorTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UrlMappingParameterTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UrlMappingParameterTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UrlMappingWithCustomValidatorTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UrlMappingWithCustomValidatorTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UrlMappingsHolderTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/UrlMappingsHolderTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mapping/ViewUrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mapping/ViewUrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/metaclass/CollectionBindDataMethodSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/metaclass/CollectionBindDataMethodSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mime/ContentFormatControllerTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mime/ContentFormatControllerTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/mime/WithFormatContentTypeSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/mime/WithFormatContentTypeSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/AliasedTagPropertySpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/AliasedTagPropertySpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/ElvisAndClosureGroovyPageTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/ElvisAndClosureGroovyPageTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/GSPResponseWriterSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/GSPResponseWriterSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageBindingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageBindingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageLineNumberTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageLineNumberTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageMethodDispatchTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageMethodDispatchTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageMethodDispatchWithNamespaceTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageMethodDispatchWithNamespaceTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageRenderingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageRenderingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageServletSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageServletSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPageTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPagesIfTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPagesIfTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPagesWhitespaceParsingTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/GroovyPagesWhitespaceParsingTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/InvokeTagWithCustomBodyClosureSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/InvokeTagWithCustomBodyClosureSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/ModifyOurScopeWithBodyTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/ModifyOurScopeWithBodyTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/NewLineRenderingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/NewLineRenderingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/OptionalTagBodySpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/OptionalTagBodySpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/ReservedWordOverrideTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/ReservedWordOverrideTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/SitemeshPreprocessorTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/SitemeshPreprocessorTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/StaticContentRenderingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/StaticContentRenderingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/TagLibMethodMissingSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/TagLibMethodMissingSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/TagLibNamespaceTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/TagLibNamespaceTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/TagLibWithGStringTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/TagLibWithGStringTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/pages/TagLibWithNullValuesTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/pages/TagLibWithNullValuesTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/servlet/BindDataMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/servlet/BindDataMethodTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/servlet/GrailsFlashScopeSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/servlet/GrailsFlashScopeSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/servlet/mvc/SynchronizerTokensHolderTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/servlet/mvc/SynchronizerTokensHolderTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/servlet/view/GroovyPageViewTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/servlet/view/GroovyPageViewTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ApplicationTagLibResourcesTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ApplicationTagLibResourcesTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ApplicationTagLibTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ApplicationTagLibTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ApplyCodecTagSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ApplyCodecTagSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ControllerTagLibMethodDispatchSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ControllerTagLibMethodDispatchSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ControllerTagLibMethodInheritanceSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ControllerTagLibMethodInheritanceSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/CoreTagsTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/CoreTagsTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/CountryTagLibTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/CountryTagLibTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormRenderingTagLibTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormRenderingTagLibTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormTagLib2Tests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormTagLib2Tests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormTagLib3Tests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormTagLib3Tests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormTagLibResourceTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormTagLibResourceTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormTagLibTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormTagLibTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormatTagLibTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/FormatTagLibTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/InvokeTagLibAsMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/InvokeTagLibAsMethodTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/InvokeTagLibWithBodyAsMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/InvokeTagLibWithBodyAsMethodTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/JavascriptTagLibTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/JavascriptTagLibTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/LayoutWriterStackTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/LayoutWriterStackTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/LinkRenderingTagLib2Tests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/LinkRenderingTagLib2Tests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/LinkRenderingTagLibTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/LinkRenderingTagLibTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/MessageTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/MessageTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/NamedTagBodyParamsTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/NamedTagBodyParamsTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/NamespacedNamedUrlMappingTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/NamespacedNamedUrlMappingTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/NamespacedTagAndActionConflictTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/NamespacedTagAndActionConflictTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/NamespacedTagLibMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/NamespacedTagLibMethodTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/NamespacedTagLibRenderMethodTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/NamespacedTagLibRenderMethodTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/OverlappingReverseMappedLinkTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/OverlappingReverseMappedLinkTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/PageScopeSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/PageScopeSpec.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/PageScopeTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/PageScopeTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/PluginTagLibTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/PluginTagLibTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/RenderTagLibTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/RenderTagLibTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ReturnValueTagLibTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ReturnValueTagLibTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/SelectTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/SelectTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/TagLibraryDynamicPropertyTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/TagLibraryDynamicPropertyTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/UploadFormTagTests_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/UploadFormTagTests.groovy", [])
    }

    void "test grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ValidationTagLibSpec_groovy"() {
        unzipAndTest("grails-test-suite-web/src/test/groovy/org/grails/web/taglib/ValidationTagLibSpec.groovy", [])
    }

    void "test grails-test/build_gradle"() {
        unzipAndTest("grails-test/build.gradle", [])
    }

    void "test grails-test/src/main/groovy/grails/boot/test/GrailsApplicationContextLoader_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/grails/boot/test/GrailsApplicationContextLoader.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/plugins/testing/AbstractGrailsMockHttpServletResponse_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/plugins/testing/AbstractGrailsMockHttpServletResponse.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/plugins/testing/GrailsMockHttpServletRequest_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/plugins/testing/GrailsMockHttpServletRequest.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/plugins/testing/GrailsMockHttpSession_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/plugins/testing/GrailsMockHttpSession.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/test/io/MultiplexingOutputStream_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/test/io/MultiplexingOutputStream.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/test/io/SystemOutAndErrSwapper_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/test/io/SystemOutAndErrSwapper.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/test/spock/IntegrationSpecConfigurerExtension_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/test/spock/IntegrationSpecConfigurerExtension.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/test/support/ControllerNameExtractor_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/test/support/ControllerNameExtractor.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/test/support/GrailsTestAutowirer_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/test/support/GrailsTestAutowirer.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/test/support/GrailsTestInterceptor_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/test/support/GrailsTestInterceptor.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/test/support/GrailsTestMode_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/test/support/GrailsTestMode.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/test/support/GrailsTestRequestEnvironmentInterceptor_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/test/support/GrailsTestRequestEnvironmentInterceptor.groovy", [])
    }

    void "test grails-test/src/main/groovy/org/grails/test/support/GrailsTestTransactionInterceptor_groovy"() {
        unzipAndTest("grails-test/src/main/groovy/org/grails/test/support/GrailsTestTransactionInterceptor.groovy", [])
    }

    void "test grails-validation/build_gradle"() {
        unzipAndTest("grails-validation/build.gradle", [])
    }

    void "test grails-validation/src/test/groovy/grails/validation/ConstraintTypeMismatchSpec_groovy"() {
        unzipAndTest("grails-validation/src/test/groovy/grails/validation/ConstraintTypeMismatchSpec.groovy", [])
    }

    void "test grails-validation/src/test/groovy/org/grails/validation/ConstrainedPropertyBuilderSpec_groovy"() {
        unzipAndTest("grails-validation/src/test/groovy/org/grails/validation/ConstrainedPropertyBuilderSpec.groovy", [])
    }

    void "test grails-validation/src/test/groovy/org/grails/validation/errors/ValidationErrorsSpec_groovy"() {
        unzipAndTest("grails-validation/src/test/groovy/org/grails/validation/errors/ValidationErrorsSpec.groovy", [])
    }

    void "test grails-web-boot/build_gradle"() {
        unzipAndTest("grails-web-boot/build.gradle", [])
    }

    void "test grails-web-boot/src/main/groovy/org/grails/boot/context/web/GrailsAppServletInitializer_groovy"() {
        unzipAndTest("grails-web-boot/src/main/groovy/org/grails/boot/context/web/GrailsAppServletInitializer.groovy", [])
    }

    void "test grails-web-boot/src/main/groovy/org/grails/compiler/boot/BootInitializerClassInjector_groovy"() {
        unzipAndTest("grails-web-boot/src/main/groovy/org/grails/compiler/boot/BootInitializerClassInjector.groovy", [])
    }

    void "test grails-web-boot/src/test/groovy/grails/boot/EmbeddedContainerWithGrailsSpec_groovy"() {
        unzipAndTest("grails-web-boot/src/test/groovy/grails/boot/EmbeddedContainerWithGrailsSpec.groovy", [])
    }

    void "test grails-web-boot/src/test/groovy/grails/boot/GrailsSpringApplicationSpec_groovy"() {
        unzipAndTest("grails-web-boot/src/test/groovy/grails/boot/GrailsSpringApplicationSpec.groovy", [])
    }

    void "test grails-web-boot/src/test/groovy/org/grails/compiler/boot/BootInitializerClassInjectorSpec_groovy"() {
        unzipAndTest("grails-web-boot/src/test/groovy/org/grails/compiler/boot/BootInitializerClassInjectorSpec.groovy", [])
    }

    void "test grails-web-common/build_gradle"() {
        unzipAndTest("grails-web-common/build.gradle", [])
    }

    void "test grails-web-common/src/main/groovy/grails/util/GrailsWebMockUtil_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/grails/util/GrailsWebMockUtil.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/grails/web/api/ServletAttributes_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/grails/web/api/ServletAttributes.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/grails/web/api/WebAttributes_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/grails/web/api/WebAttributes.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/grails/web/mime/MimeType_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/grails/web/mime/MimeType.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/grails/web/mime/MimeTypeProvider_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/grails/web/mime/MimeTypeProvider.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/grails/web/mime/MimeTypeResolver_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/grails/web/mime/MimeTypeResolver.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/grails/web/mime/MimeTypeUtils_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/grails/web/mime/MimeTypeUtils.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/org/grails/databinding/bindingsource/DataBindingSourceCreator_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/org/grails/databinding/bindingsource/DataBindingSourceCreator.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/org/grails/web/beans/PropertyEditorRegistryUtils_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/org/grails/web/beans/PropertyEditorRegistryUtils.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/org/grails/web/context/ServletEnvironmentGrailsApplicationDiscoveryStrategy_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/org/grails/web/context/ServletEnvironmentGrailsApplicationDiscoveryStrategy.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/org/grails/web/databinding/bindingsource/DataBindingSourceRegistry_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/org/grails/web/databinding/bindingsource/DataBindingSourceRegistry.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/org/grails/web/errors/ErrorsViewStackTracePrinter_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/org/grails/web/errors/ErrorsViewStackTracePrinter.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/org/grails/web/i18n/ParamsAwareLocaleChangeInterceptor_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/org/grails/web/i18n/ParamsAwareLocaleChangeInterceptor.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/org/grails/web/servlet/mvc/ActionResultTransformer_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/org/grails/web/servlet/mvc/ActionResultTransformer.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/org/grails/web/servlet/mvc/OutputAwareHttpServletResponse_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/org/grails/web/servlet/mvc/OutputAwareHttpServletResponse.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/org/grails/web/servlet/view/CompositeViewResolver_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/org/grails/web/servlet/view/CompositeViewResolver.groovy", [])
    }

    void "test grails-web-common/src/main/groovy/org/grails/web/util/ClassAndMimeTypeRegistry_groovy"() {
        unzipAndTest("grails-web-common/src/main/groovy/org/grails/web/util/ClassAndMimeTypeRegistry.groovy", [])
    }

    void "test grails-web-common/src/test/groovy/grails/web/servlet/mvc/GrailsParameterMapTests_groovy"() {
        unzipAndTest("grails-web-common/src/test/groovy/grails/web/servlet/mvc/GrailsParameterMapTests.groovy", [])
    }

    void "test grails-web-databinding/build_gradle"() {
        unzipAndTest("grails-web-databinding/build.gradle", [])
    }

    void "test grails-web-databinding/src/main/groovy/grails/compiler/traits/WebDataBindingTraitInjector_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/grails/compiler/traits/WebDataBindingTraitInjector.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/grails/web/databinding/DataBinder_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/grails/web/databinding/DataBinder.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/grails/web/databinding/GrailsWebDataBinder_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/grails/web/databinding/GrailsWebDataBinder.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/grails/web/databinding/WebDataBinding_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/grails/web/databinding/WebDataBinding.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/DataBindingEventMulticastListener_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/DataBindingEventMulticastListener.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/GrailsWebDataBindingListener_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/GrailsWebDataBindingListener.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/SpringConversionServiceAdapter_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/SpringConversionServiceAdapter.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/AbstractRequestBodyDataBindingSourceCreator_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/AbstractRequestBodyDataBindingSourceCreator.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/DefaultDataBindingSourceCreator_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/DefaultDataBindingSourceCreator.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/DefaultDataBindingSourceRegistry_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/DefaultDataBindingSourceRegistry.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/HalGPathResultMap_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/HalGPathResultMap.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/HalJsonDataBindingSourceCreator_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/HalJsonDataBindingSourceCreator.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/HalXmlDataBindingSourceCreator_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/HalXmlDataBindingSourceCreator.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/JsonDataBindingSourceCreator_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/JsonDataBindingSourceCreator.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/XmlDataBindingSourceCreator_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/bindingsource/XmlDataBindingSourceCreator.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/converters/AbstractStructuredBindingEditor_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/converters/AbstractStructuredBindingEditor.groovy", [])
    }

    void "test grails-web-databinding/src/main/groovy/org/grails/web/databinding/converters/ByteArrayMultipartFileValueConverter_groovy"() {
        unzipAndTest("grails-web-databinding/src/main/groovy/org/grails/web/databinding/converters/ByteArrayMultipartFileValueConverter.groovy", [])
    }

    void "test grails-web-databinding/src/test/groovy/org/grails/web/databinding/bindingsource/AbstractRequestBodyDataBindingSourceCreatorSpec_groovy"() {
        unzipAndTest("grails-web-databinding/src/test/groovy/org/grails/web/databinding/bindingsource/AbstractRequestBodyDataBindingSourceCreatorSpec.groovy", [])
    }

    void "test grails-web-databinding/src/test/groovy/org/grails/web/databinding/bindingsource/HalGPathResultMapSpec_groovy"() {
        unzipAndTest("grails-web-databinding/src/test/groovy/org/grails/web/databinding/bindingsource/HalGPathResultMapSpec.groovy", [])
    }

    void "test grails-web-databinding/src/test/groovy/org/grails/web/databinding/bindingsource/hal/json/HalJsonDataBindingSourceCreatorSpec_groovy"() {
        unzipAndTest("grails-web-databinding/src/test/groovy/org/grails/web/databinding/bindingsource/hal/json/HalJsonDataBindingSourceCreatorSpec.groovy", [])
    }

    void "test grails-web-databinding/src/test/groovy/org/grails/web/databinding/bindingsource/json/JsonDataBindingSourceCreatorSpec_groovy"() {
        unzipAndTest("grails-web-databinding/src/test/groovy/org/grails/web/databinding/bindingsource/json/JsonDataBindingSourceCreatorSpec.groovy", [])
    }

    void "test grails-web-fileupload/build_gradle"() {
        unzipAndTest("grails-web-fileupload/build.gradle", [])
    }

    void "test grails-web-gsp-taglib/build_gradle"() {
        unzipAndTest("grails-web-gsp-taglib/build.gradle", [])
    }

    void "test grails-web-gsp-taglib/src/main/groovy/org/grails/plugins/web/taglib/RenderTagLib_groovy"() {
        unzipAndTest("grails-web-gsp-taglib/src/main/groovy/org/grails/plugins/web/taglib/RenderTagLib.groovy", [])
    }

    void "test grails-web-gsp-taglib/src/main/groovy/org/grails/plugins/web/taglib/SitemeshTagLib_groovy"() {
        unzipAndTest("grails-web-gsp-taglib/src/main/groovy/org/grails/plugins/web/taglib/SitemeshTagLib.groovy", [])
    }

    void "test grails-web-gsp/build_gradle"() {
        unzipAndTest("grails-web-gsp/build.gradle", [])
    }

    void "test grails-web-gsp/src/main/groovy/grails/gsp/PageRenderer_groovy"() {
        unzipAndTest("grails-web-gsp/src/main/groovy/grails/gsp/PageRenderer.groovy", [])
    }

    void "test grails-web-gsp/src/main/groovy/org/grails/web/pages/GroovyPageCompilerTask_groovy"() {
        unzipAndTest("grails-web-gsp/src/main/groovy/org/grails/web/pages/GroovyPageCompilerTask.groovy", [])
    }

    void "test grails-web-gsp/src/test/groovy/org/grails/web/gsp/io/GrailsConventionGroovyPageLocatorSpec_groovy"() {
        unzipAndTest("grails-web-gsp/src/test/groovy/org/grails/web/gsp/io/GrailsConventionGroovyPageLocatorSpec.groovy", [])
    }

    void "test grails-web-gsp/src/test/groovy/org/grails/web/servlet/view/GroovyPageViewResolverSpec_groovy"() {
        unzipAndTest("grails-web-gsp/src/test/groovy/org/grails/web/servlet/view/GroovyPageViewResolverSpec.groovy", [])
    }

    void "test grails-web-jsp/build_gradle"() {
        unzipAndTest("grails-web-jsp/build.gradle", [])
    }

    void "test grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/GroovyPagesJspFactory_groovy"() {
        unzipAndTest("grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/GroovyPagesJspFactory.groovy", [])
    }

    void "test grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/JspTagImpl_groovy"() {
        unzipAndTest("grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/JspTagImpl.groovy", [])
    }

    void "test grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/JspTagLibImpl_groovy"() {
        unzipAndTest("grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/JspTagLibImpl.groovy", [])
    }

    void "test grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/PageContextFactory_groovy"() {
        unzipAndTest("grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/PageContextFactory.groovy", [])
    }

    void "test grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/TagLibraryResolverImpl_groovy"() {
        unzipAndTest("grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/TagLibraryResolverImpl.groovy", [])
    }

    void "test grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/TldReader_groovy"() {
        unzipAndTest("grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/TldReader.groovy", [])
    }

    void "test grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/WebXmlTagLibraryReader_groovy"() {
        unzipAndTest("grails-web-jsp/src/main/groovy/org/grails/gsp/jsp/WebXmlTagLibraryReader.groovy", [])
    }

    void "test grails-web-mvc/build_gradle"() {
        unzipAndTest("grails-web-mvc/build.gradle", [])
    }

    void "test grails-web-mvc/src/main/groovy/org/grails/web/servlet/mvc/GrailsDispatcherServlet_groovy"() {
        unzipAndTest("grails-web-mvc/src/main/groovy/org/grails/web/servlet/mvc/GrailsDispatcherServlet.groovy", [])
    }

    void "test grails-web-mvc/src/main/groovy/org/grails/web/servlet/mvc/SynchronizerTokensHolder_groovy"() {
        unzipAndTest("grails-web-mvc/src/main/groovy/org/grails/web/servlet/mvc/SynchronizerTokensHolder.groovy", [])
    }

    void "test grails-web-mvc/src/main/groovy/org/grails/web/servlet/mvc/TokenResponseActionResultTransformer_groovy"() {
        unzipAndTest("grails-web-mvc/src/main/groovy/org/grails/web/servlet/mvc/TokenResponseActionResultTransformer.groovy", [])
    }

    void "test grails-web-sitemesh/build_gradle"() {
        unzipAndTest("grails-web-sitemesh/build.gradle", [])
    }

    void "test grails-web-taglib/build_gradle"() {
        unzipAndTest("grails-web-taglib/build.gradle", [])
    }

    void "test grails-web-taglib/src/main/groovy/grails/artefact/TagLibrary_groovy"() {
        unzipAndTest("grails-web-taglib/src/main/groovy/grails/artefact/TagLibrary.groovy", [])
    }

    void "test grails-web-taglib/src/main/groovy/grails/artefact/gsp/TagLibraryInvoker_groovy"() {
        unzipAndTest("grails-web-taglib/src/main/groovy/grails/artefact/gsp/TagLibraryInvoker.groovy", [])
    }

    void "test grails-web-taglib/src/main/groovy/grails/compiler/traits/TagLibraryTraitInjector_groovy"() {
        unzipAndTest("grails-web-taglib/src/main/groovy/grails/compiler/traits/TagLibraryTraitInjector.groovy", [])
    }

    void "test grails-web-taglib/src/test/groovy/org/grails/web/taglib/TagLibraryLookupSpec_groovy"() {
        unzipAndTest("grails-web-taglib/src/test/groovy/org/grails/web/taglib/TagLibraryLookupSpec.groovy", [])
    }

    void "test grails-web-url-mappings/build_gradle"() {
        unzipAndTest("grails-web-url-mappings/build.gradle", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/grails/web/mapping/LinkGeneratorFactory_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/grails/web/mapping/LinkGeneratorFactory.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/grails/web/mapping/ResponseRedirector_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/grails/web/mapping/ResponseRedirector.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/grails/web/mapping/UrlMappingsFactory_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/grails/web/mapping/UrlMappingsFactory.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/grails/web/mapping/reporting/UrlMappingsRenderer_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/grails/web/mapping/reporting/UrlMappingsRenderer.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/ControllerActionConventions_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/ControllerActionConventions.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/DefaultLinkGenerator_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/DefaultLinkGenerator.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/DefaultUrlMappings_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/DefaultUrlMappings.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/ForwardUrlMappingInfo_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/ForwardUrlMappingInfo.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/MetaMappingInfo_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/MetaMappingInfo.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/ResponseCodeUrlMappingVisitor_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/ResponseCodeUrlMappingVisitor.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/mvc/AbstractGrailsControllerUrlMappings_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/mvc/AbstractGrailsControllerUrlMappings.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/mvc/GrailsControllerUrlMappingInfo_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/mvc/GrailsControllerUrlMappingInfo.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/mvc/UrlMappingsHandlerMapping_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/mvc/UrlMappingsHandlerMapping.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/mvc/UrlMappingsInfoHandlerAdapter_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/mvc/UrlMappingsInfoHandlerAdapter.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/reporting/AnsiConsoleUrlMappingsRenderer_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/reporting/AnsiConsoleUrlMappingsRenderer.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/reporting/UrlMappingsReportCommand_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/reporting/UrlMappingsReportCommand.groovy", [])
    }

    void "test grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/servlet/UrlMappingsErrorPageCustomizer_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/main/groovy/org/grails/web/mapping/servlet/UrlMappingsErrorPageCustomizer.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/AbstractUrlMappingsSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/AbstractUrlMappingsSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/DefaultActionUrlMappingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/DefaultActionUrlMappingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/DoubleWildcardUrlMappingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/DoubleWildcardUrlMappingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/GroupedUrlMappingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/GroupedUrlMappingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/MandatoryParamMappingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/MandatoryParamMappingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/OverlappingUrlMappingsMatchingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/OverlappingUrlMappingsMatchingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/RegisterUrlMappingsAtRuntimeSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/RegisterUrlMappingsAtRuntimeSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/RestfulResourceMappingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/RestfulResourceMappingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/UrlMappingSizeConstraintSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/UrlMappingSizeConstraintSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/UrlMappingsWithOptionalExtensionSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/UrlMappingsWithOptionalExtensionSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/grails/web/mapping/VersionedResourceMappingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/grails/web/mapping/VersionedResourceMappingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/CachingLinkGeneratorSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/CachingLinkGeneratorSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/DefaultUrlCreatorTests_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/DefaultUrlCreatorTests.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/LinkGeneratorSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/LinkGeneratorSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/LinkGeneratorWithFormatSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/LinkGeneratorWithFormatSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/LinkGeneratorWithUrlMappingsSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/LinkGeneratorWithUrlMappingsSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/OverlappingParametersReverseMappingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/OverlappingParametersReverseMappingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/RegexUrlMappingTests_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/RegexUrlMappingTests.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/StaticAndWildcardMappingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/StaticAndWildcardMappingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/UrlMappingsBindingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/UrlMappingsBindingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/UrlMappingsHolderComparatorSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/UrlMappingsHolderComparatorSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/UrlMappingsWithHttpMethodSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/UrlMappingsWithHttpMethodSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/mvc/UrlMappingsHandlerMappingSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/mvc/UrlMappingsHandlerMappingSpec.groovy", [])
    }

    void "test grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/reporting/AnsiConsoleUrlMappingsRendererSpec_groovy"() {
        unzipAndTest("grails-web-url-mappings/src/test/groovy/org/grails/web/mapping/reporting/AnsiConsoleUrlMappingsRendererSpec.groovy", [])
    }

    void "test grails-web/build_gradle"() {
        unzipAndTest("grails-web/build.gradle", [])
    }

    void "test grails-web/src/main/groovy/grails/web/servlet/plugins/GrailsWebPluginManager_groovy"() {
        unzipAndTest("grails-web/src/main/groovy/grails/web/servlet/plugins/GrailsWebPluginManager.groovy", [])
    }

    void "test grails-web/src/main/groovy/org/grails/web/servlet/HttpServletRequestExtension_groovy"() {
        unzipAndTest("grails-web/src/main/groovy/org/grails/web/servlet/HttpServletRequestExtension.groovy", [])
    }

    void "test grails-web/src/main/groovy/org/grails/web/servlet/HttpServletResponseExtension_groovy"() {
        unzipAndTest("grails-web/src/main/groovy/org/grails/web/servlet/HttpServletResponseExtension.groovy", [])
    }

    void "test grails-web/src/main/groovy/org/grails/web/servlet/HttpSessionExtension_groovy"() {
        unzipAndTest("grails-web/src/main/groovy/org/grails/web/servlet/HttpSessionExtension.groovy", [])
    }

    void "test grails-web/src/main/groovy/org/grails/web/servlet/ServletContextExtension_groovy"() {
        unzipAndTest("grails-web/src/main/groovy/org/grails/web/servlet/ServletContextExtension.groovy", [])
    }

    void "test grails-web/src/test/groovy/grails/web/context/ServletContextHolderSpec_groovy"() {
        unzipAndTest("grails-web/src/test/groovy/grails/web/context/ServletContextHolderSpec.groovy", [])
    }

    void "test grails-web/src/test/groovy/org/grails/web/servlet/ServletRequestXhrApiSpec_groovy"() {
        unzipAndTest("grails-web/src/test/groovy/org/grails/web/servlet/ServletRequestXhrApiSpec.groovy", [])
    }

    void "test settings_gradle"() {
        unzipAndTest("settings.gradle", [])
    }


    /*************************************/
    static unzipAndTest(String entryName, List ignoreClazzList, Map<String, String> replacementsMap=[:]) {
        ignoreClazzList.addAll(TestUtils.COMMON_IGNORE_CLASS_LIST)

        TestUtils.unzipAndTest(ZIP_PATH, entryName, TestUtils.addIgnore(ignoreClazzList, ASTComparatorCategory.LOCATION_IGNORE_LIST), replacementsMap)
    }

    public static final String ZIP_PATH = "$TestUtils.RESOURCES_PATH/grails-3.2.0/grails-3.2.0-allsources.zip";

}