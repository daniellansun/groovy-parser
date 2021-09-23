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
import org.codehaus.groovy.ast.*
import org.codehaus.groovy.ast.stmt.AssertStatement
import org.codehaus.groovy.ast.stmt.ExpressionStatement
import org.codehaus.groovy.ast.stmt.ForStatement
import org.codehaus.groovy.ast.stmt.ReturnStatement
import org.codehaus.groovy.syntax.Token

/**
 * Add Groovy 2.5.0 scripts as test cases
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * Created on    2016/09/21
 */
@CompileStatic
class Groovy250ScriptsTest extends GroovyTestCase {

    void setUp() {}

    void tearDown() {}

    void "test AnnotationClosureWithNonLocalVariable_001_groovy"() {
        unzipAndTest("scripts/AnnotationClosureWithNonLocalVariable_001.groovy", [ExpressionStatement, AssertStatement])
    }

    void "test AnnotationCollectorTest_001_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_001.groovy", [])
    }

    void "test AnnotationCollectorTest_002_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_002.groovy", [])
    }

    void "test AnnotationCollectorTest_003_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_003.groovy", [AssertStatement])
    }

    void "test AnnotationCollectorTest_004_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_004.groovy", [])
    }

    void "test AnnotationCollectorTest_005_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_005.groovy", [])
    }

    void "test AnnotationCollectorTest_006_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_006.groovy", [])
    }

    void "test AnnotationCollectorTest_007_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_007.groovy", [AssertStatement])
    }

    void "test AnnotationCollectorTest_008_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_008.groovy", [AssertStatement])
    }

    void "test AnnotationCollectorTest_009_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_009.groovy", [])
    }

    void "test AnnotationCollectorTest_010_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_010.groovy", [])
    }

    void "test AnnotationCollectorTest_011_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_011.groovy", [ExpressionStatement])
    }

    void "test AnnotationCollectorTest_012_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_012.groovy", [])
    }

    void "test AnnotationCollectorTest_013_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_013.groovy", [])
    }

    void "test AnnotationCollectorTest_014_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_014.groovy", [])
    }

    void "test AnnotationCollectorTest_015_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_015.groovy", [])
    }

    void "test AnnotationCollectorTest_016_groovy"() {
        unzipAndTest("scripts/AnnotationCollectorTest_016.groovy", [])
    }

    void "test AnnotationTest_001_groovy"() {
        unzipAndTest("scripts/AnnotationTest_001.groovy", [])
    }

    void "test AnnotationTest_002_groovy"() {
        unzipAndTest("scripts/AnnotationTest_002.groovy", [])
    }

    void "test AnnotationTest_003_groovy"() {
        unzipAndTest("scripts/AnnotationTest_003.groovy", [])
    }

    void "test AnnotationTest_004_groovy"() {
        unzipAndTest("scripts/AnnotationTest_004.groovy", [])
    }

    void "test AnnotationTest_005_groovy"() {
        unzipAndTest("scripts/AnnotationTest_005.groovy", [])
    }

    void "test AnnotationTest_006_groovy"() {
        unzipAndTest("scripts/AnnotationTest_006.groovy", [])
    }

    void "test AnnotationTest_007_groovy"() {
        unzipAndTest("scripts/AnnotationTest_007.groovy", [])
    }

    void "test AnnotationTest_008_groovy"() {
        unzipAndTest("scripts/AnnotationTest_008.groovy", [])
    }

    void "test AnnotationTest_009_groovy"() {
        unzipAndTest("scripts/AnnotationTest_009.groovy", [])
    }

    void "test AnnotationTest_010_groovy"() {
        unzipAndTest("scripts/AnnotationTest_010.groovy", [])
    }

    void "test AnnotationTest_011_groovy"() {
        unzipAndTest("scripts/AnnotationTest_011.groovy", [])
    }

    void "test AnnotationTest_012_groovy"() {
        unzipAndTest("scripts/AnnotationTest_012.groovy", [])
    }

    void "test AnnotationTest_013_groovy"() {
        unzipAndTest("scripts/AnnotationTest_013.groovy", [])
    }

    void "test AnonymousInnerClassSTCTest_001_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_001.groovy", [PropertyNode, FieldNode])
    }

    void "test AnonymousInnerClassSTCTest_002_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_002.groovy", [PropertyNode, FieldNode])
    }

    void "test AnonymousInnerClassSTCTest_003_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_003.groovy", [])
    }

    void "test AnonymousInnerClassSTCTest_004_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_004.groovy", [])
    }

    void "test AnonymousInnerClassSTCTest_005_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_005.groovy", [])
    }

    void "test AnonymousInnerClassSTCTest_006_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_006.groovy", [ExpressionStatement])
    }

    void "test AnonymousInnerClassSTCTest_007_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_007.groovy", [])
    }

    void "test AnonymousInnerClassSTCTest_008_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_008.groovy", [ExpressionStatement])
    }

    void "test AnonymousInnerClassSTCTest_009_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_009.groovy", [])
    }

    void "test AnonymousInnerClassSTCTest_010_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_010.groovy", [])
    }

    void "test AnonymousInnerClassSTCTest_011_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_011.groovy", [])
    }

    void "test AnonymousInnerClassSTCTest_012_groovy"() {
        unzipAndTest("scripts/AnonymousInnerClassSTCTest_012.groovy", [])
    }

    void "test ArraysAndCollectionsStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsStaticCompileTest_001.groovy", [MethodNode])
    }

    void "test ArraysAndCollectionsStaticCompileTest_002_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsStaticCompileTest_002.groovy", [])
    }

    void "test ArraysAndCollectionsStaticCompileTest_003_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsStaticCompileTest_003.groovy", [])
    }

    void "test ArraysAndCollectionsStaticCompileTest_004_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsStaticCompileTest_004.groovy", [])
    }

    void "test ArraysAndCollectionsStaticCompileTest_005_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsStaticCompileTest_005.groovy", [])
    }

    void "test ArraysAndCollectionsStaticCompileTest_006_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsStaticCompileTest_006.groovy", [])
    }

    void "test ArraysAndCollectionsStaticCompileTest_007_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsStaticCompileTest_007.groovy", [])
    }

    void "test ArraysAndCollectionsStaticCompileTest_008_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsStaticCompileTest_008.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_001_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_001.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_002_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_002.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_003_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_003.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_004_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_004.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_005_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_005.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_006_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_006.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_007_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_007.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_008_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_008.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_009_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_009.groovy", [Token])
    }

    void "test ArraysAndCollectionsSTCTest_010_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_010.groovy", [Token])
    }

    void "test ArraysAndCollectionsSTCTest_011_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_011.groovy", [Token])
    }

    void "test ArraysAndCollectionsSTCTest_012_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_012.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_013_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_013.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_014_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_014.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_015_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_015.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_016_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_016.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_017_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_017.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_018_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_018.groovy", [ExpressionStatement])
    }

    void "test ArraysAndCollectionsSTCTest_019_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_019.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_020_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_020.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_021_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_021.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_022_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_022.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_023_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_023.groovy", [Token])
    }

    void "test ArraysAndCollectionsSTCTest_024_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_024.groovy", [Token])
    }

    void "test ArraysAndCollectionsSTCTest_025_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_025.groovy", [Token])
    }

    void "test ArraysAndCollectionsSTCTest_026_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_026.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_027_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_027.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_028_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_028.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_029_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_029.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_030_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_030.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_031_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_031.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_032_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_032.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_033_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_033.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_034_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_034.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_035_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_035.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_036_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_036.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_037_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_037.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_038_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_038.groovy", [Parameter, ExpressionStatement, Token])
    }

    void "test ArraysAndCollectionsSTCTest_039_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_039.groovy", [Token])
    }

    void "test ArraysAndCollectionsSTCTest_040_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_040.groovy", [Token])
    }

    void "test ArraysAndCollectionsSTCTest_041_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_041.groovy", [Parameter])
    }

    void "test ArraysAndCollectionsSTCTest_042_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_042.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_043_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_043.groovy", [GenericsType])
    }

    void "test ArraysAndCollectionsSTCTest_044_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_044.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_045_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_045.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_046_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_046.groovy", [])
    }

    void "test ArraysAndCollectionsSTCTest_047_groovy"() {
        unzipAndTest("scripts/ArraysAndCollectionsSTCTest_047.groovy", [])
    }

    void "test ASTTransformationCustomizerTest_001_groovy"() {
        unzipAndTest("scripts/ASTTransformationCustomizerTest_001.groovy", [])
    }

    void "test ASTTransformationCustomizerTest_002_groovy"() {
        unzipAndTest("scripts/ASTTransformationCustomizerTest_002.groovy", [])
    }

    void "test ASTTransformationCustomizerTest_003_groovy"() {
        unzipAndTest("scripts/ASTTransformationCustomizerTest_003.groovy", [])
    }

    void "test ASTTransformationCustomizerTest_004_groovy"() {
        unzipAndTest("scripts/ASTTransformationCustomizerTest_004.groovy", [])
    }

    void "test ASTTransformationCustomizerTest_005_groovy"() {
        unzipAndTest("scripts/ASTTransformationCustomizerTest_005.groovy", [])
    }

    void "test ASTTransformationCustomizerTest_006_groovy"() {
        unzipAndTest("scripts/ASTTransformationCustomizerTest_006.groovy", [])
    }

    void "test ASTTransformationCustomizerTest_007_groovy"() {
        unzipAndTest("scripts/ASTTransformationCustomizerTest_007.groovy", [])
    }

    void "test ASTTransformationCustomizerTest_008_groovy"() {
        unzipAndTest("scripts/ASTTransformationCustomizerTest_008.groovy", [])
    }

    void "test ASTXFormSpecTest_001_groovy"() {
        unzipAndTest("scripts/ASTXFormSpecTest_001.groovy", [])
    }

    void "test ASTXFormSpecTest_002_groovy"() {
        unzipAndTest("scripts/ASTXFormSpecTest_002.groovy", [])
    }

    void "test ASTXFormSpecTest_003_groovy"() {
        unzipAndTest("scripts/ASTXFormSpecTest_003.groovy", [])
    }

    void "test ASTXFormSpecTest_004_groovy"() {
        unzipAndTest("scripts/ASTXFormSpecTest_004.groovy", [])
    }

    void "test AutoCloneTransformTest_001_groovy"() {
        unzipAndTest("scripts/AutoCloneTransformTest_001.groovy", [])
    }

    void "test AutoCloneTransformTest_002_groovy"() {
        unzipAndTest("scripts/AutoCloneTransformTest_002.groovy", [])
    }

    void "test AutoImplementTransformTest_001_groovy"() {
        unzipAndTest("scripts/AutoImplementTransformTest_001.groovy", [ExpressionStatement])
    }

    void "test AutoImplementTransformTest_002_groovy"() {
        unzipAndTest("scripts/AutoImplementTransformTest_002.groovy", [ExpressionStatement])
    }

    void "test AutoImplementTransformTest_003_groovy"() {
        unzipAndTest("scripts/AutoImplementTransformTest_003.groovy", [])
    }

    void "test BadLineNumberOnExceptionBugTest_001_groovy"() {
        unzipAndTest("scripts/BadLineNumberOnExceptionBugTest_001.groovy", [])
    }

    void "test BadLineNumberOnExceptionBugTest_002_groovy"() {
        unzipAndTest("scripts/BadLineNumberOnExceptionBugTest_002.groovy", [])
    }

    void "test BaseScriptSpecTest_001_groovy"() {
        unzipAndTest("scripts/BaseScriptSpecTest_001.groovy", [])
    }

    void "test BaseScriptSpecTest_002_groovy"() {
        unzipAndTest("scripts/BaseScriptSpecTest_002.groovy", [ExpressionStatement])
    }

    void "test BaseScriptSpecTest_003_groovy"() {
        unzipAndTest("scripts/BaseScriptSpecTest_003.groovy", [])
    }

    void "test BaseScriptSpecTest_004_groovy"() {
        unzipAndTest("scripts/BaseScriptSpecTest_004.groovy", [MethodNode, ExpressionStatement])
    }

    void "test BaseScriptTransformTest_001_groovy"() {
        unzipAndTest("scripts/BaseScriptTransformTest_001.groovy", [])
    }

    void "test BaseScriptTransformTest_002_groovy"() {
        unzipAndTest("scripts/BaseScriptTransformTest_002.groovy", [])
    }

    void "test BaseScriptTransformTest_003_groovy"() {
        unzipAndTest("scripts/BaseScriptTransformTest_003.groovy", [])
    }

    void "test BaseScriptTransformTest_004_groovy"() {
        unzipAndTest("scripts/BaseScriptTransformTest_004.groovy", [])
    }

    void "test BaseScriptTransformTest_005_groovy"() {
        unzipAndTest("scripts/BaseScriptTransformTest_005.groovy", [])
    }

    void "test BaseScriptTransformTest_006_groovy"() {
        unzipAndTest("scripts/BaseScriptTransformTest_006.groovy", [])
    }

    void "test BaseScriptTransformTest_007_groovy"() {
        unzipAndTest("scripts/BaseScriptTransformTest_007.groovy", [])
    }

    void "test BaseScriptTransformTest_008_groovy"() {
        unzipAndTest("scripts/BaseScriptTransformTest_008.groovy", [ExpressionStatement])
    }

    void "test BaseScriptTransformTest_009_groovy"() {
        unzipAndTest("scripts/BaseScriptTransformTest_009.groovy", [])
    }

    void "test BaseScriptTransformTest_010_groovy"() {
        unzipAndTest("scripts/BaseScriptTransformTest_010.groovy", [])
    }

    void "test BigDecimalOperatorsTest_001_groovy"() {
        unzipAndTest("scripts/BigDecimalOperatorsTest_001.groovy", [MethodNode])
    }

    void "test BinaryLiteralTest_001_groovy"() {
        unzipAndTest("scripts/BinaryLiteralTest_001.groovy", [])
    }

    void "test BinaryOperationsTest_001_groovy"() {
        ['byte','int','short','long'].each {
            unzipAndTest("scripts/BinaryOperationsTest_001.groovy", [], ['$type': it]);
        }
    }

    void "test BinaryOperationsTest_002_groovy"() {
        ['byte','int','short','long'].each {
            unzipAndTest("scripts/BinaryOperationsTest_002.groovy", [], ['$type': it])
        }
    }

    void "test BindableSwingTest_001_groovy"() {
        unzipAndTest("scripts/BindableSwingTest_001.groovy", [])
    }

    void "test BindableTest_001_groovy"() {
        unzipAndTest("scripts/BindableTest_001.groovy", [])
    }

    void "test BindableTest_002_groovy"() {
        unzipAndTest("scripts/BindableTest_002.groovy", [])
    }

    void "test BindableTest_003_groovy"() {
        unzipAndTest("scripts/BindableTest_003.groovy", [Parameter])
    }

    void "test BindableTest_004_groovy"() {
        unzipAndTest("scripts/BindableTest_004.groovy", [])
    }

    void "test BindableTest_005_groovy"() {
        unzipAndTest("scripts/BindableTest_005.groovy", [])
    }

    void "test BindableTest_006_groovy"() {
        unzipAndTest("scripts/BindableTest_006.groovy", [])
    }

    void "test BindableTest_007_groovy"() {
        unzipAndTest("scripts/BindableTest_007.groovy", [])
    }

    void "test BindableTest_008_groovy"() {
        unzipAndTest("scripts/BindableTest_008.groovy", [])
    }

    void "test BindableTest_009_groovy"() {
        unzipAndTest("scripts/BindableTest_009.groovy", [ExpressionStatement])
    }

    void "test BindableTest_010_groovy"() {
        unzipAndTest("scripts/BindableTest_010.groovy", [])
    }

    void "test BindableTest_011_groovy"() {
        unzipAndTest("scripts/BindableTest_011.groovy", [])
    }

    void "test BindableTest_012_groovy"() {
        unzipAndTest("scripts/BindableTest_012.groovy", [])
    }

    void "test BindableTest_013_groovy"() {
        unzipAndTest("scripts/BindableTest_013.groovy", [])
    }

    void "test BindableTest_014_groovy"() {
        unzipAndTest("scripts/BindableTest_014.groovy", [])
    }

    void "test BlockScopeVisibilityTest_001_groovy"() {
        unzipAndTest("scripts/BlockScopeVisibilityTest_001.groovy", [])
    }

    void "test BooleanBug_001_groovy"() {
        unzipAndTest("scripts/BooleanBug_001.groovy", [])
    }

    void "test BooleanExpressionConversionTest_001_groovy"() {
        unzipAndTest("scripts/BooleanExpressionConversionTest_001.groovy", [])
    }

    void "test BooleanExpressionConversionTest_002_groovy"() {
        unzipAndTest("scripts/BooleanExpressionConversionTest_002.groovy", [])
    }

    void "test BooleanExpressionConversionTest_003_groovy"() {
        unzipAndTest("scripts/BooleanExpressionConversionTest_003.groovy", [])
    }

    void "test BooleanExpressionConversionTest_004_groovy"() {
        unzipAndTest("scripts/BooleanExpressionConversionTest_004.groovy", [])
    }

    void "test BooleanExpressionConversionTest_005_groovy"() {
        unzipAndTest("scripts/BooleanExpressionConversionTest_005.groovy", [])
    }

    void "test BooleanExpressionConversionTest_006_groovy"() {
        unzipAndTest("scripts/BooleanExpressionConversionTest_006.groovy", [])
    }

    void "test BooleanExpressionConversionTest_007_groovy"() {
        unzipAndTest("scripts/BooleanExpressionConversionTest_007.groovy", [])
    }

    void "test BreakContinueLabelTest_001_groovy"() {
        unzipAndTest("scripts/BreakContinueLabelTest_001.groovy", [])
    }

    void "test BugsStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_001.groovy", [])
    }

    void "test BugsStaticCompileTest_002_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_002.groovy", [])
    }

    void "test BugsStaticCompileTest_003_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_003.groovy", [])
    }

    void "test BugsStaticCompileTest_004_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_004.groovy", [Parameter])
    }

    void "test BugsStaticCompileTest_005_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_005.groovy", [])
    }

    void "test BugsStaticCompileTest_006_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_006.groovy", [])
    }

    void "test BugsStaticCompileTest_007_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_007.groovy", [])
    }

    void "test BugsStaticCompileTest_008_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_008.groovy", [ExpressionStatement])
    }

    void "test BugsStaticCompileTest_009_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_009.groovy", [])
    }

    void "test BugsStaticCompileTest_010_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_010.groovy", [])
    }

    void "test BugsStaticCompileTest_011_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_011.groovy", [])
    }

    void "test BugsStaticCompileTest_012_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_012.groovy", [])
    }

    void "test BugsStaticCompileTest_013_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_013.groovy", [])
    }

    void "test BugsStaticCompileTest_014_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_014.groovy", [])
    }

    void "test BugsStaticCompileTest_015_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_015.groovy", [Token])
    }

    void "test BugsStaticCompileTest_016_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_016.groovy", [Token])
    }

    void "test BugsStaticCompileTest_017_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_017.groovy", [Token])
    }

    void "test BugsStaticCompileTest_018_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_018.groovy", [])
    }

    void "test BugsStaticCompileTest_019_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_019.groovy", [Parameter, ExpressionStatement])
    }

    void "test BugsStaticCompileTest_020_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_020.groovy", [Token])
    }

    void "test BugsStaticCompileTest_021_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_021.groovy", [])
    }

    void "test BugsStaticCompileTest_022_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_022.groovy", [])
    }

    void "test BugsStaticCompileTest_023_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_023.groovy", [])
    }

    void "test BugsStaticCompileTest_024_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_024.groovy", [])
    }

    void "test BugsStaticCompileTest_025_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_025.groovy", [])
    }

    void "test BugsStaticCompileTest_026_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_026.groovy", [])
    }

    void "test BugsStaticCompileTest_027_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_027.groovy", [])
    }

    void "test BugsStaticCompileTest_028_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_028.groovy", [])
    }

    void "test BugsStaticCompileTest_029_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_029.groovy", [])
    }

    void "test BugsStaticCompileTest_030_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_030.groovy", [])
    }

    void "test BugsStaticCompileTest_031_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_031.groovy", [FieldNode, PropertyNode, ReturnStatement, ExpressionStatement])
    }

    void "test BugsStaticCompileTest_032_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_032.groovy", [])
    }

    void "test BugsStaticCompileTest_033_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_033.groovy", [])
    }

    void "test BugsStaticCompileTest_034_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_034.groovy", [])
    }

    void "test BugsStaticCompileTest_035_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_035.groovy", [])
    }

    void "test BugsStaticCompileTest_036_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_036.groovy", [])
    }

    void "test BugsStaticCompileTest_037_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_037.groovy", [])
    }

    void "test BugsStaticCompileTest_038_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_038.groovy", [])
    }

    void "test BugsStaticCompileTest_039_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_039.groovy", [])
    }

    void "test BugsStaticCompileTest_040_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_040.groovy", [ExpressionStatement])
    }

    void "test BugsStaticCompileTest_041_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_041.groovy", [Parameter])
    }

    void "test BugsStaticCompileTest_042_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_042.groovy", [])
    }

    void "test BugsStaticCompileTest_043_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_043.groovy", [])
    }

    void "test BugsStaticCompileTest_044_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_044.groovy", [])
    }

    void "test BugsStaticCompileTest_045_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_045.groovy", [])
    }

    void "test BugsStaticCompileTest_046_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_046.groovy", [])
    }

    void "test BugsStaticCompileTest_047_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_047.groovy", [])
    }

    void "test BugsStaticCompileTest_048_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_048.groovy", [])
    }

    void "test BugsStaticCompileTest_049_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_049.groovy", [ExpressionStatement, MethodNode])
    }

    void "test BugsStaticCompileTest_050_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_050.groovy", [])
    }

    void "test BugsStaticCompileTest_051_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_051.groovy", [GenericsType])
    }

    void "test BugsStaticCompileTest_052_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_052.groovy", [])
    }

    void "test BugsStaticCompileTest_053_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_053.groovy", [ExpressionStatement])
    }

    void "test BugsStaticCompileTest_054_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_054.groovy", [])
    }

    void "test BugsStaticCompileTest_055_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_055.groovy", [])
    }

    void "test BugsStaticCompileTest_056_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_056.groovy", [ExpressionStatement])
    }

    void "test BugsStaticCompileTest_057_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_057.groovy", [])
    }

    void "test BugsStaticCompileTest_058_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_058.groovy", [])
    }

    void "test BugsStaticCompileTest_059_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_059.groovy", [])
    }

    void "test BugsStaticCompileTest_060_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_060.groovy", [])
    }

    void "test BugsStaticCompileTest_061_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_061.groovy", [])
    }

    void "test BugsStaticCompileTest_062_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_062.groovy", [])
    }

    void "test BugsStaticCompileTest_063_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_063.groovy", [])
    }

    void "test BugsStaticCompileTest_064_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_064.groovy", [])
    }

    void "test BugsStaticCompileTest_065_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_065.groovy", [])
    }

    void "test BugsStaticCompileTest_066_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_066.groovy", [])
    }

    void "test BugsStaticCompileTest_067_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_067.groovy", [])
    }

    void "test BugsStaticCompileTest_068_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_068.groovy", [])
    }

    void "test BugsStaticCompileTest_069_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_069.groovy", [ExpressionStatement])
    }

    void "test BugsStaticCompileTest_070_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_070.groovy", [])
    }

    void "test BugsStaticCompileTest_071_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_071.groovy", [])
    }

    void "test BugsStaticCompileTest_072_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_072.groovy", [])
    }

    void "test BugsStaticCompileTest_073_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_073.groovy", [])
    }

    void "test BugsStaticCompileTest_074_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_074.groovy", [Token])
    }

    void "test BugsStaticCompileTest_075_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_075.groovy", [Token])
    }

    void "test BugsStaticCompileTest_076_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_076.groovy", [])
    }

    void "test BugsStaticCompileTest_077_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_077.groovy", [])
    }

    void "test BugsStaticCompileTest_078_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_078.groovy", [])
    }

    void "test BugsStaticCompileTest_079_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_079.groovy", [])
    }

    void "test BugsStaticCompileTest_080_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_080.groovy", [])
    }

    void "test BugsStaticCompileTest_081_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_081.groovy", [])
    }

    void "test BugsStaticCompileTest_082_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_082.groovy", [ExpressionStatement])
    }

    void "test BugsStaticCompileTest_083_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_083.groovy", [])
    }

    void "test BugsStaticCompileTest_084_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_084.groovy", [ExpressionStatement])
    }

    void "test BugsStaticCompileTest_085_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_085.groovy", [])
    }

    void "test BugsStaticCompileTest_086_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_086.groovy", [])
    }

    void "test BugsStaticCompileTest_087_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_087.groovy", [])
    }

    void "test BugsStaticCompileTest_088_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_088.groovy", [Parameter, ExpressionStatement])
    }

    void "test BugsStaticCompileTest_089_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_089.groovy", [])
    }

    void "test BugsStaticCompileTest_090_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_090.groovy", [])
    }

    void "test BugsStaticCompileTest_091_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_091.groovy", [])
    }

    void "test BugsStaticCompileTest_092_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_092.groovy", [])
    }

    void "test BugsStaticCompileTest_093_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_093.groovy", [])
    }

    void "test BugsStaticCompileTest_094_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_094.groovy", [])
    }

    void "test BugsStaticCompileTest_095_groovy"() {
        unzipAndTest("scripts/BugsStaticCompileTest_095.groovy", [ExpressionStatement])
    }

    void "test BugsSTCTest_001_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_001.groovy", [ExpressionStatement, Token])
    }

    void "test BugsSTCTest_002_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_002.groovy", [])
    }

    void "test BugsSTCTest_003_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_003.groovy", [AssertStatement])
    }

    void "test BugsSTCTest_004_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_004.groovy", [])
    }

    void "test BugsSTCTest_005_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_005.groovy", [Parameter])
    }

    void "test BugsSTCTest_006_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_006.groovy", [])
    }

    void "test BugsSTCTest_007_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_007.groovy", [Token])
    }

    void "test BugsSTCTest_008_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_008.groovy", [Token])
    }

    void "test BugsSTCTest_009_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_009.groovy", [])
    }

    void "test BugsSTCTest_010_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_010.groovy", [])
    }

    void "test BugsSTCTest_011_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_011.groovy", [])
    }

    void "test BugsSTCTest_012_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_012.groovy", [])
    }

    void "test BugsSTCTest_013_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_013.groovy", [])
    }

    void "test BugsSTCTest_014_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_014.groovy", [])
    }

    void "test BugsSTCTest_015_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_015.groovy", [])
    }

    void "test BugsSTCTest_016_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_016.groovy", [ExpressionStatement])
    }

    void "test BugsSTCTest_017_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_017.groovy", [FieldNode])
    }

    void "test BugsSTCTest_018_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_018.groovy", [])
    }

    void "test BugsSTCTest_019_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_019.groovy", [ExpressionStatement])
    }

    void "test BugsSTCTest_020_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_020.groovy", [])
    }

    void "test BugsSTCTest_021_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_021.groovy", [Token])
    }

    void "test BugsSTCTest_022_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_022.groovy", [Token])
    }

    void "test BugsSTCTest_023_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_023.groovy", [])
    }

    void "test BugsSTCTest_024_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_024.groovy", [])
    }

    void "test BugsSTCTest_025_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_025.groovy", [])
    }

    void "test BugsSTCTest_026_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_026.groovy", [])
    }

    void "test BugsSTCTest_027_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_027.groovy", [Token])
    }

    void "test BugsSTCTest_028_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_028.groovy", [Parameter, ExpressionStatement])
    }

    void "test BugsSTCTest_029_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_029.groovy", [])
    }

    void "test BugsSTCTest_030_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_030.groovy", [])
    }

    void "test BugsSTCTest_031_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_031.groovy", [ExpressionStatement, ReturnStatement])
    }

    void "test BugsSTCTest_032_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_032.groovy", [MethodNode])
    }

    void "test BugsSTCTest_033_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_033.groovy", [MethodNode])
    }

    void "test BugsSTCTest_034_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_034.groovy", [MethodNode])
    }

    void "test BugsSTCTest_035_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_035.groovy", [])
    }

    void "test BugsSTCTest_036_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_036.groovy", [])
    }

    void "test BugsSTCTest_037_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_037.groovy", [])
    }

    void "test BugsSTCTest_038_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_038.groovy", [])
    }

    void "test BugsSTCTest_039_groovy"() {
        unzipAndTest("scripts/BugsSTCTest_039.groovy", [])
    }

    void "test BuilderTransformTest_001_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_001.groovy", [])
    }

    void "test BuilderTransformTest_002_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_002.groovy", [])
    }

    void "test BuilderTransformTest_003_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_003.groovy", [])
    }

    void "test BuilderTransformTest_004_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_004.groovy", [ExpressionStatement])
    }

    void "test BuilderTransformTest_005_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_005.groovy", [])
    }

    void "test BuilderTransformTest_006_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_006.groovy", [])
    }

    void "test BuilderTransformTest_007_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_007.groovy", [])
    }

    void "test BuilderTransformTest_008_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_008.groovy", [])
    }

    void "test BuilderTransformTest_009_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_009.groovy", [])
    }

    void "test BuilderTransformTest_010_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_010.groovy", [])
    }

    void "test BuilderTransformTest_011_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_011.groovy", [])
    }

    void "test BuilderTransformTest_012_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_012.groovy", [])
    }

    void "test BuilderTransformTest_013_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_013.groovy", [])
    }

    void "test BuilderTransformTest_014_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_014.groovy", [])
    }

    void "test BuilderTransformTest_015_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_015.groovy", [ExpressionStatement])
    }

    void "test BuilderTransformTest_016_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_016.groovy", [])
    }

    void "test BuilderTransformTest_017_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_017.groovy", [])
    }

    void "test BuilderTransformTest_018_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_018.groovy", [])
    }

    void "test BuilderTransformTest_019_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_019.groovy", [])
    }

    void "test BuilderTransformTest_020_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_020.groovy", [])
    }

    void "test BuilderTransformTest_021_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_021.groovy", [])
    }

    void "test BuilderTransformTest_022_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_022.groovy", [])
    }

    void "test BuilderTransformTest_023_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_023.groovy", [FieldNode, PropertyNode])
    }

    void "test BuilderTransformTest_024_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_024.groovy", [])
    }

    void "test BuilderTransformTest_025_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_025.groovy", [])
    }

    void "test BuilderTransformTest_026_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_026.groovy", [])
    }

    void "test BuilderTransformTest_027_groovy"() {
        unzipAndTest("scripts/BuilderTransformTest_027.groovy", [])
    }

    void "test CallClosureFieldAsMethodTest_001_groovy"() {
        unzipAndTest("scripts/CallClosureFieldAsMethodTest_001.groovy", [])
    }

    void "test CallSiteTest_001_groovy"() {
        unzipAndTest("scripts/CallSiteTest_001.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_001_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_001.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_002_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_002.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_003_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_003.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_004_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_004.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_005_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_005.groovy", [ExpressionStatement, MethodNode])
    }

    void "test CanonicalComponentsTransformTest_006_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_006.groovy", [ExpressionStatement, MethodNode])
    }

    void "test CanonicalComponentsTransformTest_007_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_007.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_008_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_008.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_009_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_009.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_010_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_010.groovy", [Parameter, ExpressionStatement, AssertStatement])
    }

    void "test CanonicalComponentsTransformTest_011_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_011.groovy", [Parameter, ExpressionStatement, AssertStatement])
    }

    void "test CanonicalComponentsTransformTest_012_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_012.groovy", [Parameter, ExpressionStatement, AssertStatement])
    }

    void "test CanonicalComponentsTransformTest_013_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_013.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_014_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_014.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_015_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_015.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_016_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_016.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_017_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_017.groovy", [])
    }

    void "test CanonicalComponentsTransformTest_018_groovy"() {
        unzipAndTest("scripts/CanonicalComponentsTransformTest_018.groovy", [])
    }

    void "test CanonicalTransformTest_001_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_001.groovy", [])
    }

    void "test CanonicalTransformTest_002_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_002.groovy", [])
    }

    void "test CanonicalTransformTest_003_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_003.groovy", [])
    }

    void "test CanonicalTransformTest_004_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_004.groovy", [])
    }

    void "test CanonicalTransformTest_005_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_005.groovy", [])
    }

    void "test CanonicalTransformTest_006_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_006.groovy", [])
    }

    void "test CanonicalTransformTest_007_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_007.groovy", [])
    }

    void "test CanonicalTransformTest_008_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_008.groovy", [])
    }

    void "test CanonicalTransformTest_009_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_009.groovy", [])
    }

    void "test CanonicalTransformTest_010_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_010.groovy", [])
    }

    void "test CanonicalTransformTest_011_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_011.groovy", [])
    }

    void "test CanonicalTransformTest_012_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_012.groovy", [])
    }

    void "test CanonicalTransformTest_013_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_013.groovy", [])
    }

    void "test CanonicalTransformTest_014_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_014.groovy", [])
    }

    void "test CanonicalTransformTest_015_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_015.groovy", [])
    }

    void "test CanonicalTransformTest_016_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_016.groovy", [])
    }

    void "test CanonicalTransformTest_017_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_017.groovy", [])
    }

    void "test CanonicalTransformTest_018_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_018.groovy", [])
    }

    void "test CanonicalTransformTest_019_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_019.groovy", [])
    }

    void "test CanonicalTransformTest_020_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_020.groovy", [])
    }

    void "test CanonicalTransformTest_021_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_021.groovy", [])
    }

    void "test CanonicalTransformTest_022_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_022.groovy", [])
    }

    void "test CanonicalTransformTest_023_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_023.groovy", [])
    }

    void "test CanonicalTransformTest_024_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_024.groovy", [])
    }

    void "test CanonicalTransformTest_025_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_025.groovy", [ExpressionStatement])
    }

    void "test CanonicalTransformTest_026_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_026.groovy", [])
    }

    void "test CanonicalTransformTest_027_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_027.groovy", [])
    }

    void "test CanonicalTransformTest_028_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_028.groovy", [])
    }

    void "test CanonicalTransformTest_029_groovy"() {
        unzipAndTest("scripts/CanonicalTransformTest_029.groovy", [])
    }

    void "test CastToStringTest_001_groovy"() {
        unzipAndTest("scripts/CastToStringTest_001.groovy", [])
    }

    void "test CategoryAnnotationTest_001_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_001.groovy", [])
    }

    void "test CategoryAnnotationTest_002_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_002.groovy", [])
    }

    void "test CategoryAnnotationTest_003_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_003.groovy", [MethodNode, ExpressionStatement, ReturnStatement, ForStatement])
    }

    void "test CategoryAnnotationTest_004_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_004.groovy", [])
    }

    void "test CategoryAnnotationTest_005_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_005.groovy", [])
    }

    void "test CategoryAnnotationTest_006_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_006.groovy", [])
    }

    void "test CategoryAnnotationTest_007_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_007.groovy", [])
    }

    void "test CategoryAnnotationTest_008_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_008.groovy", [])
    }

    void "test CategoryAnnotationTest_009_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_009.groovy", [])
    }

    void "test CategoryAnnotationTest_010_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_010.groovy", [])
    }

    void "test CategoryAnnotationTest_011_groovy"() {
        unzipAndTest("scripts/CategoryAnnotationTest_011.groovy", [])
    }

    void "test CategoryTest_001_groovy"() {
        unzipAndTest("scripts/CategoryTest_001.groovy", [])
    }

    void "test CategoryTest_002_groovy"() {
        unzipAndTest("scripts/CategoryTest_002.groovy", [])
    }

    void "test CategoryTest_003_groovy"() {
        unzipAndTest("scripts/CategoryTest_003.groovy", [])
    }

    void "test CategoryTest_004_groovy"() {
        unzipAndTest("scripts/CategoryTest_004.groovy", [])
    }

    void "test CategoryTest_005_groovy"() {
        unzipAndTest("scripts/CategoryTest_005.groovy", [])
    }

    void "test CategoryTest_006_groovy"() {
        unzipAndTest("scripts/CategoryTest_006.groovy", [])
    }

    void "test CategoryTest_007_groovy"() {
        unzipAndTest("scripts/CategoryTest_007.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_001_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_001.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_002_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_002.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_003_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_003.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_004_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_004.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_005_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_005.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_006_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_006.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_007_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_007.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_008_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_008.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_009_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_009.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_010_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_010.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_011_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_011.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_012_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_012.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_013_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_013.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_014_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_014.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_015_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_015.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_016_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_016.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_017_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_017.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_018_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_018.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_019_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_019.groovy", [])
    }

    void "test ClassDesignASTTransformsTest_020_groovy"() {
        unzipAndTest("scripts/ClassDesignASTTransformsTest_020.groovy", [])
    }

    void "test ClassDuplicationTest_001_groovy"() {
        unzipAndTest("scripts/ClassDuplicationTest_001.groovy", [])
    }

    void "test ClassDuplicationTest_002_groovy"() {
        unzipAndTest("scripts/ClassDuplicationTest_002.groovy", [])
    }

    void "test ClassTest_001_groovy"() {
        unzipAndTest("scripts/ClassTest_001.groovy", [])
    }

    void "test ClassTest_002_groovy"() {
        unzipAndTest("scripts/ClassTest_002.groovy", [])
    }

    void "test ClassTest_003_groovy"() {
        unzipAndTest("scripts/ClassTest_003.groovy", [])
    }

    void "test ClassTest_004_groovy"() {
        unzipAndTest("scripts/ClassTest_004.groovy", [])
    }

    void "test ClassTest_005_groovy"() {
        unzipAndTest("scripts/ClassTest_005.groovy", [])
    }

    void "test ClassTest_006_groovy"() {
        unzipAndTest("scripts/ClassTest_006.groovy", [])
    }

    void "test ClassTest_007_groovy"() {
        unzipAndTest("scripts/ClassTest_007.groovy", [])
    }

    void "test ClassTest_008_groovy"() {
        unzipAndTest("scripts/ClassTest_008.groovy", [])
    }

    void "test ClassTest_009_groovy"() {
        unzipAndTest("scripts/ClassTest_009.groovy", [])
    }

    void "test ClassTest_010_groovy"() {
        unzipAndTest("scripts/ClassTest_010.groovy", [])
    }

    void "test ClassTest_011_groovy"() {
        unzipAndTest("scripts/ClassTest_011.groovy", [])
    }

    void "test ClassTest_012_groovy"() {
        unzipAndTest("scripts/ClassTest_012.groovy", [])
    }

    void "test ClassTest_013_groovy"() {
        unzipAndTest("scripts/ClassTest_013.groovy", [])
    }

    void "test ClassTest_014_groovy"() {
        unzipAndTest("scripts/ClassTest_014.groovy", [])
    }

    void "test ClassTest_015_groovy"() {
        unzipAndTest("scripts/ClassTest_015.groovy", [])
    }

    void "test ClassTest_016_groovy"() {
        unzipAndTest("scripts/ClassTest_016.groovy", [])
    }

    void "test ClassTest_017_groovy"() {
        unzipAndTest("scripts/ClassTest_017.groovy", [])
    }

    void "test ClassTest_018_groovy"() {
        unzipAndTest("scripts/ClassTest_018.groovy", [])
    }

    void "test ClassTest_019_groovy"() {
        unzipAndTest("scripts/ClassTest_019.groovy", [])
    }

    void "test ClassTest_020_groovy"() {
        unzipAndTest("scripts/ClassTest_020.groovy", [])
    }

    void "test ClassTest_021_groovy"() {
        unzipAndTest("scripts/ClassTest_021.groovy", [])
    }

    void "test ClassTest_022_groovy"() {
        unzipAndTest("scripts/ClassTest_022.groovy", [])
    }

    void "test ClassTest_023_groovy"() {
        unzipAndTest("scripts/ClassTest_023.groovy", [])
    }

    void "test ClassTest_024_groovy"() {
        unzipAndTest("scripts/ClassTest_024.groovy", [])
    }

    void "test ClassTest_025_groovy"() {
        unzipAndTest("scripts/ClassTest_025.groovy", [])
    }

    void "test ClassTest_026_groovy"() {
        unzipAndTest("scripts/ClassTest_026.groovy", [])
    }

    void "test ClassTest_027_groovy"() {
        unzipAndTest("scripts/ClassTest_027.groovy", [])
    }

    void "test ClassTest_028_groovy"() {
        unzipAndTest("scripts/ClassTest_028.groovy", [])
    }

    void "test ClassTest_029_groovy"() {
        unzipAndTest("scripts/ClassTest_029.groovy", [])
    }

    void "test ClassTest_030_groovy"() {
        unzipAndTest("scripts/ClassTest_030.groovy", [])
    }

    void "test ClassTest_031_groovy"() {
        unzipAndTest("scripts/ClassTest_031.groovy", [])
    }

    void "test ClassTest_032_groovy"() {
        unzipAndTest("scripts/ClassTest_032.groovy", [])
    }

    void "test ClassTest_033_groovy"() {
        unzipAndTest("scripts/ClassTest_033.groovy", [])
    }

    void "test ClassTest_034_groovy"() {
        unzipAndTest("scripts/ClassTest_034.groovy", [])
    }

    void "test ClassTest_035_groovy"() {
        unzipAndTest("scripts/ClassTest_035.groovy", [])
    }

    void "test ClassTest_036_groovy"() {
        unzipAndTest("scripts/ClassTest_036.groovy", [])
    }

    void "test ClassTest_037_groovy"() {
        unzipAndTest("scripts/ClassTest_037.groovy", [])
    }

    void "test CloningASTTransformsTest_001_groovy"() {
        unzipAndTest("scripts/CloningASTTransformsTest_001.groovy", [])
    }

    void "test CloningASTTransformsTest_002_groovy"() {
        unzipAndTest("scripts/CloningASTTransformsTest_002.groovy", [])
    }

    void "test CloningASTTransformsTest_003_groovy"() {
        unzipAndTest("scripts/CloningASTTransformsTest_003.groovy", [])
    }

    void "test CloningASTTransformsTest_004_groovy"() {
        unzipAndTest("scripts/CloningASTTransformsTest_004.groovy", [])
    }

    void "test CloningASTTransformsTest_005_groovy"() {
        unzipAndTest("scripts/CloningASTTransformsTest_005.groovy", [])
    }

    void "test CloningASTTransformsTest_006_groovy"() {
        unzipAndTest("scripts/CloningASTTransformsTest_006.groovy", [])
    }

    void "test ClosureAndInnerClassNodeStructureTest_001_groovy"() {
        unzipAndTest("scripts/ClosureAndInnerClassNodeStructureTest_001.groovy", [])
    }

    void "test ClosureAndInnerClassNodeStructureTest_002_groovy"() {
        unzipAndTest("scripts/ClosureAndInnerClassNodeStructureTest_002.groovy", [])
    }

    void "test ClosureComposeTest_001_groovy"() {
        unzipAndTest("scripts/ClosureComposeTest_001.groovy", [])
    }

    void "test ClosureDelegationTest_001_groovy"() {
        unzipAndTest("scripts/ClosureDelegationTest_001.groovy", [])
    }

    void "test ClosureDelegationTest_002_groovy"() {
        unzipAndTest("scripts/ClosureDelegationTest_002.groovy", [])
    }

    void "test ClosureDelegationTest_003_groovy"() {
        unzipAndTest("scripts/ClosureDelegationTest_003.groovy", [])
    }

    void "test ClosureDelegationTest_004_groovy"() {
        unzipAndTest("scripts/ClosureDelegationTest_004.groovy", [])
    }

    void "test ClosureDelegationTest_005_groovy"() {
        unzipAndTest("scripts/ClosureDelegationTest_005.groovy", [])
    }

    void "test ClosureDelegationTest_006_groovy"() {
        unzipAndTest("scripts/ClosureDelegationTest_006.groovy", [])
    }

    void "test ClosureMethodCallTest_001_groovy"() {
        unzipAndTest("scripts/ClosureMethodCallTest_001.groovy", [])
    }

    void "test ClosureMissingMethodTest_001_groovy"() {
        unzipAndTest("scripts/ClosureMissingMethodTest_001.groovy", [])
    }

    void "test ClosureMissingMethodTest_002_groovy"() {
        unzipAndTest("scripts/ClosureMissingMethodTest_002.groovy", [])
    }

    void "test ClosureParameterPassingBug_001_groovy"() {
        unzipAndTest("scripts/ClosureParameterPassingBug_001.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_001_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_001.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_002_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_002.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_003_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_003.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_004_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_004.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_005_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_005.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_006_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_006.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_007_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_007.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_008_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_008.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_009_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_009.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_010_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_010.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_011_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_011.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_012_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_012.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_013_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_013.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_014_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_014.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_015_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_015.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_016_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_016.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_017_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_017.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_018_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_018.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_019_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_019.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_020_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_020.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_021_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_021.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_022_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_022.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_023_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_023.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_024_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_024.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_025_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_025.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_026_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_026.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_027_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_027.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_028_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_028.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_029_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_029.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_030_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_030.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_031_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_031.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_032_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_032.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_033_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_033.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_034_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_034.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_035_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_035.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_036_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_036.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_037_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_037.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_038_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_038.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_039_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_039.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_040_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_040.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_041_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_041.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_042_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_042.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_043_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_043.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_044_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_044.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_045_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_045.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_046_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_046.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_047_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_047.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_048_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_048.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_049_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_049.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_050_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_050.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_051_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_051.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_052_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_052.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_053_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_053.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_054_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_054.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_055_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_055.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_056_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_056.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_057_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_057.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_058_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_058.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_059_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_059.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_060_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_060.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_061_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_061.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_062_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_062.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_063_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_063.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_064_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_064.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_065_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_065.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_066_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_066.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_067_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_067.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_068_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_068.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_069_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_069.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_070_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_070.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_071_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_071.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_072_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_072.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_073_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_073.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_074_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_074.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_075_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_075.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_076_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_076.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_077_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_077.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_078_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_078.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_079_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_079.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_080_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_080.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_081_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_081.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_082_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_082.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_083_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_083.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_084_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_084.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_085_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_085.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_086_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_086.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_087_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_087.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_088_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_088.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_089_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_089.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_090_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_090.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_091_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_091.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_092_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_092.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_093_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_093.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_094_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_094.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_095_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_095.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_096_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_096.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_097_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_097.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_098_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_098.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_099_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_099.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_100_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_100.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_101_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_101.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_102_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_102.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_103_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_103.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_104_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_104.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_105_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_105.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_106_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_106.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_107_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_107.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_108_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_108.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_109_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_109.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_110_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_110.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_111_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_111.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_112_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_112.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_113_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_113.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_114_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_114.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_115_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_115.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_116_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_116.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_117_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_117.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_118_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_118.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_119_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_119.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_120_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_120.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_121_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_121.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_122_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_122.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_123_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_123.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_124_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_124.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_125_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_125.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_126_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_126.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_127_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_127.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_128_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_128.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_129_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_129.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_130_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_130.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_131_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_131.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_132_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_132.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_133_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_133.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_134_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_134.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_135_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_135.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_136_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_136.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_137_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_137.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_138_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_138.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_139_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_139.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_140_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_140.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_141_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_141.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_142_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_142.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_143_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_143.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_144_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_144.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_145_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_145.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_146_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_146.groovy", [])
    }

    void "test ClosureParamTypeInferenceSTCTest_147_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeInferenceSTCTest_147.groovy", [])
    }

    void "test ClosureParamTypeResolverSTCTest_001_groovy"() {
        unzipAndTest("scripts/ClosureParamTypeResolverSTCTest_001.groovy", [])
    }

    void "test ClosuresSpecTest_001_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_001.groovy", [])
    }

    void "test ClosuresSpecTest_002_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_002.groovy", [])
    }

    void "test ClosuresSpecTest_003_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_003.groovy", [])
    }

    void "test ClosuresSpecTest_004_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_004.groovy", [])
    }

    void "test ClosuresSpecTest_005_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_005.groovy", [])
    }

    void "test ClosuresSpecTest_006_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_006.groovy", [])
    }

    void "test ClosuresSpecTest_007_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_007.groovy", [])
    }

    void "test ClosuresSpecTest_008_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_008.groovy", [])
    }

    void "test ClosuresSpecTest_009_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_009.groovy", [])
    }

    void "test ClosuresSpecTest_010_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_010.groovy", [])
    }

    void "test ClosuresSpecTest_011_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_011.groovy", [])
    }

    void "test ClosuresSpecTest_012_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_012.groovy", [])
    }

    void "test ClosuresSpecTest_013_groovy"() {
        unzipAndTest("scripts/ClosuresSpecTest_013.groovy", [])
    }

    void "test ClosuresStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/ClosuresStaticCompileTest_001.groovy", [])
    }

    void "test ClosuresStaticCompileTest_002_groovy"() {
        unzipAndTest("scripts/ClosuresStaticCompileTest_002.groovy", [])
    }

    void "test ClosuresStaticCompileTest_003_groovy"() {
        unzipAndTest("scripts/ClosuresStaticCompileTest_003.groovy", [])
    }

    void "test ClosuresSTCTest_001_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_001.groovy", [])
    }

    void "test ClosuresSTCTest_002_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_002.groovy", [])
    }

    void "test ClosuresSTCTest_003_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_003.groovy", [])
    }

    void "test ClosuresSTCTest_004_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_004.groovy", [])
    }

    void "test ClosuresSTCTest_005_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_005.groovy", [])
    }

    void "test ClosuresSTCTest_006_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_006.groovy", [])
    }

    void "test ClosuresSTCTest_007_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_007.groovy", [])
    }

    void "test ClosuresSTCTest_008_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_008.groovy", [])
    }

    void "test ClosuresSTCTest_009_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_009.groovy", [])
    }

    void "test ClosuresSTCTest_010_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_010.groovy", [])
    }

    void "test ClosuresSTCTest_011_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_011.groovy", [])
    }

    void "test ClosuresSTCTest_012_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_012.groovy", [])
    }

    void "test ClosuresSTCTest_013_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_013.groovy", [])
    }

    void "test ClosuresSTCTest_014_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_014.groovy", [])
    }

    void "test ClosuresSTCTest_015_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_015.groovy", [])
    }

    void "test ClosuresSTCTest_016_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_016.groovy", [])
    }

    void "test ClosuresSTCTest_017_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_017.groovy", [])
    }

    void "test ClosuresSTCTest_018_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_018.groovy", [])
    }

    void "test ClosuresSTCTest_019_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_019.groovy", [])
    }

    void "test ClosuresSTCTest_020_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_020.groovy", [])
    }

    void "test ClosuresSTCTest_021_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_021.groovy", [])
    }

    void "test ClosuresSTCTest_022_groovy"() {
        ["java.util.concurrent.Callable", "Object", "Closure", "GroovyObjectSupport", "Cloneable", "Runnable", "GroovyCallable", "Serializable", "GroovyObject"].each {
            unzipAndTest("scripts/ClosuresSTCTest_022.groovy", [], ['$className': it])
        }
    }

    void "test ClosuresSTCTest_023_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_023.groovy", [])
    }

    void "test ClosuresSTCTest_024_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_024.groovy", [])
    }

    void "test ClosuresSTCTest_025_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_025.groovy", [])
    }

    void "test ClosuresSTCTest_026_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_026.groovy", [])
    }

    void "test ClosuresSTCTest_027_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_027.groovy", [])
    }

    void "test ClosuresSTCTest_028_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_028.groovy", [])
    }

    void "test ClosuresSTCTest_029_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_029.groovy", [])
    }

    void "test ClosuresSTCTest_030_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_030.groovy", [])
    }

    void "test ClosuresSTCTest_031_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_031.groovy", [])
    }

    void "test ClosuresSTCTest_032_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_032.groovy", [])
    }

    void "test ClosuresSTCTest_033_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_033.groovy", [])
    }

    void "test ClosuresSTCTest_034_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_034.groovy", [])
    }

    void "test ClosuresSTCTest_035_groovy"() {
        unzipAndTest("scripts/ClosuresSTCTest_035.groovy", [])
    }

    void "test ClosureTest_001_groovy"() {
        unzipAndTest("scripts/ClosureTest_001.groovy", [])
    }

    void "test ClosureTest_002_groovy"() {
        unzipAndTest("scripts/ClosureTest_002.groovy", [])
    }

    void "test ClosureTest_003_groovy"() {
        unzipAndTest("scripts/ClosureTest_003.groovy", [])
    }

    void "test ClosureTest_004_groovy"() {
        unzipAndTest("scripts/ClosureTest_004.groovy", [])
    }

    void "test ClosureTest_005_groovy"() {
        unzipAndTest("scripts/ClosureTest_005.groovy", [])
    }

    void "test ClosureTest_006_groovy"() {
        unzipAndTest("scripts/ClosureTest_006.groovy", [])
    }

    void "test ClosureTest_007_groovy"() {
        unzipAndTest("scripts/ClosureTest_007.groovy", [])
    }

    void "test ClosureTest_008_groovy"() {
        unzipAndTest("scripts/ClosureTest_008.groovy", [])
    }

    void "test ClosureTest_009_groovy"() {
        unzipAndTest("scripts/ClosureTest_009.groovy", [])
    }

    void "test ClosureTest_010_groovy"() {
        unzipAndTest("scripts/ClosureTest_010.groovy", [])
    }

    void "test ClosureVariableBug_001_groovy"() {
        unzipAndTest("scripts/ClosureVariableBug_001.groovy", [])
    }

    void "test ClosureVariableBug_002_groovy"() {
        unzipAndTest("scripts/ClosureVariableBug_002.groovy", [])
    }

    void "test ClosureVariableBug_003_groovy"() {
        unzipAndTest("scripts/ClosureVariableBug_003.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_001_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_001.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_002_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_002.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_003_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_003.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_004_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_004.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_005_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_005.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_006_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_006.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_007_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_007.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_008_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_008.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_009_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_009.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_010_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_010.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_011_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_011.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_012_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_012.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_013_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_013.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_014_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_014.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_015_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_015.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_016_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_016.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_017_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_017.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_018_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_018.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_019_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_019.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_020_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_020.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_021_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_021.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_022_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_022.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_023_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_023.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_024_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_024.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_025_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_025.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_026_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_026.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_027_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_027.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_028_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_028.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_029_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_029.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_030_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_030.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_031_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_031.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_032_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_032.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_033_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_033.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_034_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_034.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_035_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_035.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_036_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_036.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_037_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_037.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_038_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_038.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_039_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_039.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_040_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_040.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_041_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_041.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_042_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_042.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_043_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_043.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_044_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_044.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_045_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_045.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_046_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_046.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_047_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_047.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_048_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_048.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_049_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_049.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_050_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_050.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_051_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_051.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_052_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_052.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_053_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_053.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_054_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_054.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_055_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_055.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_056_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_056.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_057_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_057.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_058_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_058.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_059_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_059.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_060_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_060.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_061_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_061.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_062_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_062.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_063_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_063.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_064_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_064.groovy", [])
    }

    void "test CodeGenerationASTTransformsTest_065_groovy"() {
        unzipAndTest("scripts/CodeGenerationASTTransformsTest_065.groovy", [])
    }

    void "test CoercionSTCTest_001_groovy"() {
        unzipAndTest("scripts/CoercionSTCTest_001.groovy", [])
    }

    void "test CoercionTest_001_groovy"() {
        unzipAndTest("scripts/CoercionTest_001.groovy", [])
    }

    void "test CoercionTest_002_groovy"() {
        unzipAndTest("scripts/CoercionTest_002.groovy", [])
    }

    void "test CoercionTest_003_groovy"() {
        unzipAndTest("scripts/CoercionTest_003.groovy", [])
    }

    void "test CoercionTest_004_groovy"() {
        unzipAndTest("scripts/CoercionTest_004.groovy", [])
    }

    void "test CoercionTest_005_groovy"() {
        unzipAndTest("scripts/CoercionTest_005.groovy", [])
    }

    void "test CoercionTest_006_groovy"() {
        unzipAndTest("scripts/CoercionTest_006.groovy", [])
    }

    void "test CoercionTest_007_groovy"() {
        unzipAndTest("scripts/CoercionTest_007.groovy", [])
    }

    void "test CoercionTest_008_groovy"() {
        unzipAndTest("scripts/CoercionTest_008.groovy", [])
    }

    void "test CoercionTest_009_groovy"() {
        unzipAndTest("scripts/CoercionTest_009.groovy", [])
    }

    void "test CoercionTest_010_groovy"() {
        unzipAndTest("scripts/CoercionTest_010.groovy", [])
    }

    void "test CoercionTest_011_groovy"() {
        unzipAndTest("scripts/CoercionTest_011.groovy", [])
    }

    void "test CoercionTest_012_groovy"() {
        unzipAndTest("scripts/CoercionTest_012.groovy", [])
    }

    void "test CombinedIndyAndStaticCompilationTest_001_groovy"() {
        ["byte", "short", "int", "long", "float", "double", "char"].each {
            unzipAndTest("scripts/CombinedIndyAndStaticCompilationTest_001.groovy", [], ['${type}': it])
        }
    }

    void "test CombinedIndyAndStaticCompilationTest_002_groovy"() {
        unzipAndTest("scripts/CombinedIndyAndStaticCompilationTest_002.groovy", [])
    }

    void "test CommandChainsTest_001_groovy"() {
        unzipAndTest("scripts/CommandChainsTest_001.groovy", [])
    }

    void "test CommandChainsTest_002_groovy"() {
        unzipAndTest("scripts/CommandChainsTest_002.groovy", [])
    }

    void "test CommandChainsTest_003_groovy"() {
        unzipAndTest("scripts/CommandChainsTest_003.groovy", [])
    }

    void "test CommandChainsTest_004_groovy"() {
        unzipAndTest("scripts/CommandChainsTest_004.groovy", [])
    }

    void "test CommandChainsTest_005_groovy"() {
        unzipAndTest("scripts/CommandChainsTest_005.groovy", [])
    }

    void "test CommandChainsTest_006_groovy"() {
        unzipAndTest("scripts/CommandChainsTest_006.groovy", [])
    }

    void "test CommandChainsTest_007_groovy"() {
        unzipAndTest("scripts/CommandChainsTest_007.groovy", [])
    }

    void "test CommandChainsTest_008_groovy"() {
        unzipAndTest("scripts/CommandChainsTest_008.groovy", [])
    }

    void "test CommandChainsTest_009_groovy"() {
        unzipAndTest("scripts/CommandChainsTest_009.groovy", [])
    }

    void "test CommandChainsTest_010_groovy"() {
        unzipAndTest("scripts/CommandChainsTest_010.groovy", [], ['\\\'': '\''])
    }

    void "test CompatWithASTXFormStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/CompatWithASTXFormStaticCompileTest_001.groovy", [])
    }

    void "test CompileDynamicTest_001_groovy"() {
        unzipAndTest("scripts/CompileDynamicTest_001.groovy", [])
    }

    void "test CompilerCustomizationBuilderTest_001_groovy"() {
        unzipAndTest("scripts/CompilerCustomizationBuilderTest_001.groovy", [])
    }

    void "test CompilerCustomizationBuilderTest_002_groovy"() {
        unzipAndTest("scripts/CompilerCustomizationBuilderTest_002.groovy", [])
    }

    void "test CompilerDirectivesASTTransformsTest_001_groovy"() {
        unzipAndTest("scripts/CompilerDirectivesASTTransformsTest_001.groovy", [])
    }

    void "test CompilerDirectivesASTTransformsTest_002_groovy"() {
        unzipAndTest("scripts/CompilerDirectivesASTTransformsTest_002.groovy", [])
    }

    void "test CompilerDirectivesASTTransformsTest_003_groovy"() {
        unzipAndTest("scripts/CompilerDirectivesASTTransformsTest_003.groovy", [])
    }

    void "test CompilerDirectivesASTTransformsTest_004_groovy"() {
        unzipAndTest("scripts/CompilerDirectivesASTTransformsTest_004.groovy", [])
    }

    void "test CompilerDirectivesASTTransformsTest_005_groovy"() {
        unzipAndTest("scripts/CompilerDirectivesASTTransformsTest_005.groovy", [])
    }

    void "test CompilerDirectivesASTTransformsTest_006_groovy"() {
        unzipAndTest("scripts/CompilerDirectivesASTTransformsTest_006.groovy", [])
    }

    void "test CompilerDirectivesASTTransformsTest_007_groovy"() {
        unzipAndTest("scripts/CompilerDirectivesASTTransformsTest_007.groovy", [])
    }

    /* moved to SyntaxErrorTest
    void "test CompilerErrorTest_001_groovy"() {
        unzipAndTest("scripts/CompilerErrorTest_001.groovy", [])
    }
    */

    /* moved to SyntaxErrorTest
    void "test CompilerErrorTest_002_groovy"() {
        unzipAndTest("scripts/CompilerErrorTest_002.groovy", [])
    }
    */

    void "test Console_001_groovy"() {
        unzipAndTest("scripts/Console_001.groovy", [])
    }

    void "test ConstructorDelegationTest_001_groovy"() {
        unzipAndTest("scripts/ConstructorDelegationTest_001.groovy", [])
    }

    void "test ConstructorDelegationTest_002_groovy"() {
        unzipAndTest("scripts/ConstructorDelegationTest_002.groovy", [])
    }

    void "test ConstructorDelegationTest_003_groovy"() {
        unzipAndTest("scripts/ConstructorDelegationTest_003.groovy", [])
    }

    void "test ConstructorDelegationTest_004_groovy"() {
        unzipAndTest("scripts/ConstructorDelegationTest_004.groovy", [])
    }

    void "test ConstructorDelegationTest_005_groovy"() {
        unzipAndTest("scripts/ConstructorDelegationTest_005.groovy", [])
    }

    void "test ConstructorDelegationTest_006_groovy"() {
        unzipAndTest("scripts/ConstructorDelegationTest_006.groovy", [])
    }

    void "test ConstructorParameterBug_001_groovy"() {
        unzipAndTest("scripts/ConstructorParameterBug_001.groovy", [])
    }

    void "test ConstructorsSTCTest_001_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_001.groovy", [])
    }

    void "test ConstructorsSTCTest_002_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_002.groovy", [])
    }

    void "test ConstructorsSTCTest_003_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_003.groovy", [])
    }

    void "test ConstructorsSTCTest_004_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_004.groovy", [])
    }

    void "test ConstructorsSTCTest_005_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_005.groovy", [])
    }

    void "test ConstructorsSTCTest_006_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_006.groovy", [])
    }

    void "test ConstructorsSTCTest_007_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_007.groovy", [])
    }

    void "test ConstructorsSTCTest_008_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_008.groovy", [])
    }

    void "test ConstructorsSTCTest_009_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_009.groovy", [])
    }

    void "test ConstructorsSTCTest_010_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_010.groovy", [])
    }

    void "test ConstructorsSTCTest_011_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_011.groovy", [])
    }

    void "test ConstructorsSTCTest_012_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_012.groovy", [])
    }

    void "test ConstructorsSTCTest_013_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_013.groovy", [])
    }

    void "test ConstructorsSTCTest_014_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_014.groovy", [])
    }

    void "test ConstructorsSTCTest_015_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_015.groovy", [])
    }

    void "test ConstructorsSTCTest_016_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_016.groovy", [])
    }

    void "test ConstructorsSTCTest_017_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_017.groovy", [])
    }

    void "test ConstructorsSTCTest_018_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_018.groovy", [])
    }

    void "test ConstructorsSTCTest_019_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_019.groovy", [])
    }

    void "test ConstructorsSTCTest_020_groovy"() {
        unzipAndTest("scripts/ConstructorsSTCTest_020.groovy", [])
    }

    void "test ConstructorThisCallBug_001_groovy"() {
        unzipAndTest("scripts/ConstructorThisCallBug_001.groovy", [])
    }

    void "test ConstructorThisCallBug_002_groovy"() {
        unzipAndTest("scripts/ConstructorThisCallBug_002.groovy", [])
    }

    void "test ConstructorThisCallBug_003_groovy"() {
        unzipAndTest("scripts/ConstructorThisCallBug_003.groovy", [])
    }

    void "test CovariantReturnTest_001_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_001.groovy", [])
    }

    void "test CovariantReturnTest_002_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_002.groovy", [])
    }

    void "test CovariantReturnTest_003_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_003.groovy", [])
    }

    void "test CovariantReturnTest_004_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_004.groovy", [])
    }

    void "test CovariantReturnTest_005_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_005.groovy", [])
    }

    void "test CovariantReturnTest_006_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_006.groovy", [])
    }

    void "test CovariantReturnTest_007_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_007.groovy", [])
    }

    void "test CovariantReturnTest_008_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_008.groovy", [])
    }

    void "test CovariantReturnTest_009_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_009.groovy", [])
    }

    void "test CovariantReturnTest_010_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_010.groovy", [])
    }

    void "test CovariantReturnTest_011_groovy"() {
        unzipAndTest("scripts/CovariantReturnTest_011.groovy", [])
    }

    void "test CustomizersTest_001_groovy"() {
        unzipAndTest("scripts/CustomizersTest_001.groovy", [])
    }

    void "test CustomizersTest_002_groovy"() {
        unzipAndTest("scripts/CustomizersTest_002.groovy", [])
    }

    void "test CustomizersTest_003_groovy"() {
        unzipAndTest("scripts/CustomizersTest_003.groovy", [])
    }

    void "test CustomizersTest_004_groovy"() {
        unzipAndTest("scripts/CustomizersTest_004.groovy", [])
    }

    void "test CustomizersTest_005_groovy"() {
        unzipAndTest("scripts/CustomizersTest_005.groovy", [])
    }

    void "test CustomizersTest_006_groovy"() {
        unzipAndTest("scripts/CustomizersTest_006.groovy", [])
    }

    void "test CustomizersTest_007_groovy"() {
        unzipAndTest("scripts/CustomizersTest_007.groovy", [])
    }

    void "test DeclarationTest_001_groovy"() {
        unzipAndTest("scripts/DeclarationTest_001.groovy", [])
    }

    void "test DeclarativeConcurrencyASTTransformsTest_001_groovy"() {
        unzipAndTest("scripts/DeclarativeConcurrencyASTTransformsTest_001.groovy", [])
    }

    void "test DeclarativeConcurrencyASTTransformsTest_002_groovy"() {
        unzipAndTest("scripts/DeclarativeConcurrencyASTTransformsTest_002.groovy", [])
    }

    void "test DeclarativeConcurrencyASTTransformsTest_003_groovy"() {
        unzipAndTest("scripts/DeclarativeConcurrencyASTTransformsTest_003.groovy", [])
    }

    void "test DeclarativeConcurrencyASTTransformsTest_004_groovy"() {
        unzipAndTest("scripts/DeclarativeConcurrencyASTTransformsTest_004.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_001_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_001.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_002_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_002.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_003_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_003.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_004_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_004.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_005_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_005.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_006_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_006.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_007_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_007.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_008_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_008.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_009_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_009.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_010_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_010.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_011_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_011.groovy", [])
    }

    void "test DefaultGroovyMethodsSTCTest_012_groovy"() {
        unzipAndTest("scripts/DefaultGroovyMethodsSTCTest_012.groovy", [])
    }

    void "test DefaultParamTest_001_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_001.groovy", [])
    }

    void "test DefaultParamTest_002_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_002.groovy", [])
    }

    void "test DefaultParamTest_003_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_003.groovy", [])
    }

    void "test DefaultParamTest_004_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_004.groovy", [])
    }

    void "test DefaultParamTest_005_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_005.groovy", [])
    }

    void "test DefaultParamTest_006_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_006.groovy", [])
    }

    void "test DefaultParamTest_007_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_007.groovy", [])
    }

    void "test DefaultParamTest_008_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_008.groovy", [])
    }

    void "test DefaultParamTest_009_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_009.groovy", [])
    }

    void "test DefaultParamTest_010_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_010.groovy", [])
    }

    void "test DefaultParamTest_011_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_011.groovy", [])
    }

    void "test DefaultParamTest_012_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_012.groovy", [])
    }

    void "test DefaultParamTest_013_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_013.groovy", [])
    }

    void "test DefaultParamTest_014_groovy"() {
        unzipAndTest("scripts/DefaultParamTest_014.groovy", [])
    }

    void "test DelegatesToSpecTest_001_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_001.groovy", [])
    }

    void "test DelegatesToSpecTest_002_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_002.groovy", [])
    }

    void "test DelegatesToSpecTest_003_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_003.groovy", [])
    }

    void "test DelegatesToSpecTest_004_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_004.groovy", [])
    }

    void "test DelegatesToSpecTest_005_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_005.groovy", [])
    }

    void "test DelegatesToSpecTest_006_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_006.groovy", [])
    }

    void "test DelegatesToSpecTest_007_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_007.groovy", [])
    }

    void "test DelegatesToSpecTest_008_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_008.groovy", [])
    }

    void "test DelegatesToSpecTest_009_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_009.groovy", [])
    }

    void "test DelegatesToSpecTest_010_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_010.groovy", [])
    }

    void "test DelegatesToSpecTest_011_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_011.groovy", [])
    }

    void "test DelegatesToSpecTest_012_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_012.groovy", [])
    }

    void "test DelegatesToSpecTest_013_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_013.groovy", [])
    }

    void "test DelegatesToSpecTest_014_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_014.groovy", [])
    }

    void "test DelegatesToSpecTest_015_groovy"() {
        unzipAndTest("scripts/DelegatesToSpecTest_015.groovy", [])
    }

    void "test DelegatesToStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/DelegatesToStaticCompileTest_001.groovy", [])
    }

    void "test DelegatesToStaticCompileTest_002_groovy"() {
        unzipAndTest("scripts/DelegatesToStaticCompileTest_002.groovy", [])
    }

    void "test DelegatesToStaticCompileTest_003_groovy"() {
        unzipAndTest("scripts/DelegatesToStaticCompileTest_003.groovy", [])
    }

    void "test DelegatesToSTCTest_001_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_001.groovy", [])
    }

    void "test DelegatesToSTCTest_002_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_002.groovy", [])
    }

    void "test DelegatesToSTCTest_003_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_003.groovy", [])
    }

    void "test DelegatesToSTCTest_004_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_004.groovy", [])
    }

    void "test DelegatesToSTCTest_005_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_005.groovy", [])
    }

    void "test DelegatesToSTCTest_006_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_006.groovy", [])
    }

    void "test DelegatesToSTCTest_007_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_007.groovy", [])
    }

    void "test DelegatesToSTCTest_008_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_008.groovy", [])
    }

    void "test DelegatesToSTCTest_009_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_009.groovy", [])
    }

    void "test DelegatesToSTCTest_010_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_010.groovy", [])
    }

    void "test DelegatesToSTCTest_011_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_011.groovy", [])
    }

    void "test DelegatesToSTCTest_012_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_012.groovy", [])
    }

    void "test DelegatesToSTCTest_013_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_013.groovy", [])
    }

    void "test DelegatesToSTCTest_014_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_014.groovy", [])
    }

    void "test DelegatesToSTCTest_015_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_015.groovy", [])
    }

    void "test DelegatesToSTCTest_016_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_016.groovy", [])
    }

    void "test DelegatesToSTCTest_017_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_017.groovy", [])
    }

    void "test DelegatesToSTCTest_018_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_018.groovy", [])
    }

    void "test DelegatesToSTCTest_019_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_019.groovy", [])
    }

    void "test DelegatesToSTCTest_020_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_020.groovy", [])
    }

    void "test DelegatesToSTCTest_021_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_021.groovy", [])
    }

    void "test DelegatesToSTCTest_022_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_022.groovy", [])
    }

    void "test DelegatesToSTCTest_023_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_023.groovy", [])
    }

    void "test DelegatesToSTCTest_024_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_024.groovy", [])
    }

    void "test DelegatesToSTCTest_025_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_025.groovy", [])
    }

    void "test DelegatesToSTCTest_026_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_026.groovy", [])
    }

    void "test DelegatesToSTCTest_027_groovy"() {
        unzipAndTest("scripts/DelegatesToSTCTest_027.groovy", [])
    }

    void "test DelegateTransformTest_001_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_001.groovy", [])
    }

    void "test DelegateTransformTest_002_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_002.groovy", [])
    }

    void "test DelegateTransformTest_003_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_003.groovy", [])
    }

    void "test DelegateTransformTest_004_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_004.groovy", [])
    }

    void "test DelegateTransformTest_005_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_005.groovy", [])
    }

    void "test DelegateTransformTest_006_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_006.groovy", [])
    }

    void "test DelegateTransformTest_007_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_007.groovy", [])
    }

    void "test DelegateTransformTest_008_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_008.groovy", [])
    }

    void "test DelegateTransformTest_009_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_009.groovy", [])
    }

    void "test DelegateTransformTest_010_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_010.groovy", [])
    }

    void "test DelegateTransformTest_011_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_011.groovy", [])
    }

    void "test DelegateTransformTest_012_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_012.groovy", [])
    }

    void "test DelegateTransformTest_013_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_013.groovy", [])
    }

    void "test DelegateTransformTest_014_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_014.groovy", [])
    }

    void "test DelegateTransformTest_015_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_015.groovy", [])
    }

    void "test DelegateTransformTest_016_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_016.groovy", [])
    }

    void "test DelegateTransformTest_017_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_017.groovy", [])
    }

    void "test DelegateTransformTest_018_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_018.groovy", [])
    }

    void "test DelegateTransformTest_019_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_019.groovy", [])
    }

    void "test DelegateTransformTest_020_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_020.groovy", [])
    }

    void "test DelegateTransformTest_021_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_021.groovy", [])
    }

    void "test DelegateTransformTest_022_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_022.groovy", [])
    }

    void "test DelegateTransformTest_023_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_023.groovy", [])
    }

    void "test DelegateTransformTest_024_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_024.groovy", [])
    }

    void "test DelegateTransformTest_025_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_025.groovy", [])
    }

    void "test DelegateTransformTest_026_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_026.groovy", [])
    }

    void "test DelegateTransformTest_027_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_027.groovy", [])
    }

    void "test DelegateTransformTest_028_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_028.groovy", [])
    }

    void "test DelegateTransformTest_029_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_029.groovy", [])
    }

    void "test DelegateTransformTest_030_groovy"() {
        unzipAndTest("scripts/DelegateTransformTest_030.groovy", [])
    }

    void "test DifferencesFromJavaTest_001_groovy"() {
        unzipAndTest("scripts/DifferencesFromJavaTest_001.groovy", [])
    }

    /* moved to SyntaxErrorTest
    void "test DifferencesFromJavaTest_002_groovy"() {
        unzipAndTest("scripts/DifferencesFromJavaTest_002.groovy", [])
    }
    */

    void "test DifferencesFromJavaTest_003_groovy"() {
        unzipAndTest("scripts/DifferencesFromJavaTest_003.groovy", [])
    }

    void "test DifferencesFromJavaTest_004_groovy"() {
        unzipAndTest("scripts/DifferencesFromJavaTest_004.groovy", [])
    }

    void "test DifferencesFromJavaTest_005_groovy"() {
        unzipAndTest("scripts/DifferencesFromJavaTest_005.groovy", [])
    }

    void "test DifferencesFromJavaTest_006_groovy"() {
        unzipAndTest("scripts/DifferencesFromJavaTest_006.groovy", [])
    }

    void "test DifferencesFromJavaTest_007_groovy"() {
        unzipAndTest("scripts/DifferencesFromJavaTest_007.groovy", [])
    }

    void "test DifferencesFromJavaTest_008_groovy"() {
        unzipAndTest("scripts/DifferencesFromJavaTest_008.groovy", [])
    }

    void "test DifferencesFromJavaTest_009_groovy"() {
        unzipAndTest("scripts/DifferencesFromJavaTest_009.groovy", [])
    }

    void "test DirectMethodCallWithVargsTest_001_groovy"() {
        unzipAndTest("scripts/DirectMethodCallWithVargsTest_001.groovy", [])
    }

    void "test DirectMethodCallWithVargsTest_002_groovy"() {
        unzipAndTest("scripts/DirectMethodCallWithVargsTest_002.groovy", [])
    }

    void "test DirectMethodCallWithVargsTest_003_groovy"() {
        unzipAndTest("scripts/DirectMethodCallWithVargsTest_003.groovy", [])
    }

    void "test DirectMethodCallWithVargsTest_004_groovy"() {
        unzipAndTest("scripts/DirectMethodCallWithVargsTest_004.groovy", [])
    }

    void "test DOMCategoryTest_001_groovy"() {
        unzipAndTest("scripts/DOMCategoryTest_001.groovy", [])
    }

    void "test DOMCategoryTest_002_groovy"() {
        unzipAndTest("scripts/DOMCategoryTest_002.groovy", [])
    }

    void "test DoubleSizeParametersBug_001_groovy"() {
        unzipAndTest("scripts/DoubleSizeParametersBug_001.groovy", [])
    }

    void "test EnumTest_001_groovy"() {
        unzipAndTest("scripts/EnumTest_001.groovy", [])
    }

    void "test EnumTest_002_groovy"() {
        unzipAndTest("scripts/EnumTest_002.groovy", [])
    }

    void "test EnumTest_003_groovy"() {
        unzipAndTest("scripts/EnumTest_003.groovy", [])
    }

    void "test EnumTest_004_groovy"() {
        unzipAndTest("scripts/EnumTest_004.groovy", [])
    }

    void "test EnumTest_005_groovy"() {
        unzipAndTest("scripts/EnumTest_005.groovy", [])
    }

    void "test EnumTest_006_groovy"() {
        unzipAndTest("scripts/EnumTest_006.groovy", [])
    }

    void "test EnumTest_007_groovy"() {
        unzipAndTest("scripts/EnumTest_007.groovy", [])
    }

    void "test EnumTest_008_groovy"() {
        unzipAndTest("scripts/EnumTest_008.groovy", [])
    }

    void "test EnumTest_009_groovy"() {
        unzipAndTest("scripts/EnumTest_009.groovy", [])
    }

    void "test EnumTest_010_groovy"() {
        unzipAndTest("scripts/EnumTest_010.groovy", [])
    }

    void "test EnumTest_011_groovy"() {
        unzipAndTest("scripts/EnumTest_011.groovy", [])
    }

    void "test EnumTest_012_groovy"() {
        unzipAndTest("scripts/EnumTest_012.groovy", [])
    }

    void "test EnumTest_013_groovy"() {
        unzipAndTest("scripts/EnumTest_013.groovy", [])
    }

    void "test EnumTest_014_groovy"() {
        unzipAndTest("scripts/EnumTest_014.groovy", [])
    }

    void "test EnumTest_015_groovy"() {
        unzipAndTest("scripts/EnumTest_015.groovy", [])
    }

    void "test EnumTest_016_groovy"() {
        unzipAndTest("scripts/EnumTest_016.groovy", [])
    }

    void "test EnumTest_017_groovy"() {
        unzipAndTest("scripts/EnumTest_017.groovy", [])
    }

    /* FIXME groovy-3.0.0-rc-3: antlr2 parser marks fields `dynamicTyped` as `false` or `true`, but antlr4 parser marks all fields `false`
    void "test EnumTest_018_groovy"() {
        unzipAndTest("scripts/EnumTest_018.groovy", [])
    }
    */

    /* FIXME groovy-3.0.0-rc-3: antlr2 parser go wrong:  unexpected token: <newline> @ line 5, column 31.
    void "test EnumTest_019_groovy"() {
        unzipAndTest("scripts/EnumTest_019.groovy", [])
    }
    */

    void "test EqualsAndHashCodeTransformTest_001_groovy"() {
        unzipAndTest("scripts/EqualsAndHashCodeTransformTest_001.groovy", [])
    }

    void "test EqualsAndHashCodeTransformTest_002_groovy"() {
        unzipAndTest("scripts/EqualsAndHashCodeTransformTest_002.groovy", [])
    }

    void "test EqualsAndHashCodeTransformTest_003_groovy"() {
        unzipAndTest("scripts/EqualsAndHashCodeTransformTest_003.groovy", [])
    }

    void "test EqualsAndHashCodeTransformTest_004_groovy"() {
        unzipAndTest("scripts/EqualsAndHashCodeTransformTest_004.groovy", [])
    }

    void "test EqualsAndHashCodeTransformTest_005_groovy"() {
        unzipAndTest("scripts/EqualsAndHashCodeTransformTest_005.groovy", [])
    }

    void "test EqualsAndHashCodeTransformTest_006_groovy"() {
        unzipAndTest("scripts/EqualsAndHashCodeTransformTest_006.groovy", [])
    }

    /* moved to core/IdenticalOp_01x.groovy
    void "test EqualsTest_001_groovy"() {
        unzipAndTest("scripts/EqualsTest_001.groovy", [])
    }
    */

    void "test ExpandoMetaClassTest_001_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_001.groovy", [])
    }

    void "test ExpandoMetaClassTest_002_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_002.groovy", [])
    }

    void "test ExpandoMetaClassTest_003_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_003.groovy", [])
    }

    void "test ExpandoMetaClassTest_004_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_004.groovy", [])
    }

    void "test ExpandoMetaClassTest_005_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_005.groovy", [])
    }

    void "test ExpandoMetaClassTest_006_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_006.groovy", [])
    }

    void "test ExpandoMetaClassTest_007_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_007.groovy", [])
    }

    void "test ExpandoMetaClassTest_008_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_008.groovy", [])
    }

    void "test ExpandoMetaClassTest_009_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_009.groovy", [])
    }

    void "test ExpandoMetaClassTest_010_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_010.groovy", [])
    }

    void "test ExpandoMetaClassTest_011_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_011.groovy", [])
    }

    void "test ExpandoMetaClassTest_012_groovy"() {
        unzipAndTest("scripts/ExpandoMetaClassTest_012.groovy", [])
    }

    void "test ExtensionModuleSpecTest_001_groovy"() {
        unzipAndTest("scripts/ExtensionModuleSpecTest_001.groovy", [])
    }

    void "test ExtensionModuleSpecTest_002_groovy"() {
        unzipAndTest("scripts/ExtensionModuleSpecTest_002.groovy", [])
    }

    void "test ExtensionModuleTest_001_groovy"() {
        unzipAndTest("scripts/ExtensionModuleTest_001.groovy", [])
    }

    void "test ExternalizeMethodsTransformTest_001_groovy"() {
        unzipAndTest("scripts/ExternalizeMethodsTransformTest_001.groovy", [])
    }

    void "test ExternalizeMethodsTransformTest_002_groovy"() {
        unzipAndTest("scripts/ExternalizeMethodsTransformTest_002.groovy", [])
    }

    void "test ExternalizeVerifierTransformTest_001_groovy"() {
        unzipAndTest("scripts/ExternalizeVerifierTransformTest_001.groovy", [])
    }

    void "test ExternalizeVerifierTransformTest_002_groovy"() {
        unzipAndTest("scripts/ExternalizeVerifierTransformTest_002.groovy", [])
    }

    void "test ExternalizeVerifierTransformTest_003_groovy"() {
        unzipAndTest("scripts/ExternalizeVerifierTransformTest_003.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_001.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_002_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_002.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_003_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_003.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_004_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_004.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_005_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_005.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_006_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_006.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_007_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_007.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_008_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_008.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_009_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_009.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_010_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_010.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_011_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_011.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_012_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_012.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_013_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_013.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_014_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_014.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_015_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_015.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_016_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_016.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_017_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_017.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_018_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_018.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_019_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_019.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_020_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_020.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_021_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_021.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_022_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_022.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_023_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_023.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_024_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_024.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_025_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_025.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_026_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_026.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_027_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_027.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_028_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_028.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_029_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_029.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_030_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_030.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_031_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_031.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_032_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_032.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_033_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_033.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_034_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_034.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_035_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_035.groovy", [])
    }

    void "test FieldsAndPropertiesStaticCompileTest_036_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesStaticCompileTest_036.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_001_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_001.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_002_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_002.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_003_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_003.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_004_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_004.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_005_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_005.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_006_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_006.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_007_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_007.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_008_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_008.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_009_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_009.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_010_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_010.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_011_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_011.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_012_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_012.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_013_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_013.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_014_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_014.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_015_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_015.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_016_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_016.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_017_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_017.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_018_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_018.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_019_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_019.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_020_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_020.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_021_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_021.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_022_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_022.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_023_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_023.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_024_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_024.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_025_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_025.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_026_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_026.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_027_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_027.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_028_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_028.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_029_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_029.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_030_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_030.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_031_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_031.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_032_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_032.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_033_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_033.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_034_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_034.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_035_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_035.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_036_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_036.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_037_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_037.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_038_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_038.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_039_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_039.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_040_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_040.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_041_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_041.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_042_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_042.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_043_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_043.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_044_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_044.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_045_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_045.groovy", [])
    }

    void "test FieldsAndPropertiesSTCTest_046_groovy"() {
        unzipAndTest("scripts/FieldsAndPropertiesSTCTest_046.groovy", [])
    }

    void "test FieldTransformTest_001_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_001.groovy", [])
    }

    void "test FieldTransformTest_002_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_002.groovy", [])
    }

    void "test FieldTransformTest_003_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_003.groovy", [])
    }

    void "test FieldTransformTest_004_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_004.groovy", [])
    }

    void "test FieldTransformTest_005_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_005.groovy", [])
    }

    void "test FieldTransformTest_006_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_006.groovy", [])
    }

    void "test FieldTransformTest_007_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_007.groovy", [])
    }

    void "test FieldTransformTest_008_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_008.groovy", [])
    }

    void "test FieldTransformTest_009_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_009.groovy", [])
    }

    void "test FieldTransformTest_010_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_010.groovy", [])
    }

    void "test FieldTransformTest_011_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_011.groovy", [])
    }

    void "test FieldTransformTest_012_groovy"() {
        unzipAndTest("scripts/FieldTransformTest_012.groovy", [])
    }

    void "test FinalVariableAnalyzerTest_001_groovy"() {
        unzipAndTest("scripts/FinalVariableAnalyzerTest_001.groovy", [])
    }

    void "test FinalVariableAnalyzerTest_002_groovy"() {
        unzipAndTest("scripts/FinalVariableAnalyzerTest_002.groovy", [])
    }

    void "test ForAndSqlBug_001_groovy"() {
        unzipAndTest("scripts/ForAndSqlBug_001.groovy", [])
    }

    void "test ForLoopBug_001_groovy"() {
        unzipAndTest("scripts/ForLoopBug_001.groovy", [])
    }

    void "test ForLoopBug_002_groovy"() {
        unzipAndTest("scripts/ForLoopBug_002.groovy", [])
    }

    void "test ForLoopBug_003_groovy"() {
        unzipAndTest("scripts/ForLoopBug_003.groovy", [])
    }

    void "test GenericsSTCTest_001_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_001.groovy", [])
    }

    void "test GenericsSTCTest_002_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_002.groovy", [])
    }

    void "test GenericsSTCTest_003_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_003.groovy", [])
    }

    void "test GenericsSTCTest_004_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_004.groovy", [])
    }

    void "test GenericsSTCTest_005_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_005.groovy", [])
    }

    void "test GenericsSTCTest_006_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_006.groovy", [])
    }

    void "test GenericsSTCTest_007_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_007.groovy", [])
    }

    void "test GenericsSTCTest_008_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_008.groovy", [])
    }

    void "test GenericsSTCTest_009_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_009.groovy", [])
    }

    void "test GenericsSTCTest_010_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_010.groovy", [])
    }

    void "test GenericsSTCTest_011_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_011.groovy", [])
    }

    void "test GenericsSTCTest_012_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_012.groovy", [])
    }

    void "test GenericsSTCTest_013_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_013.groovy", [])
    }

    void "test GenericsSTCTest_014_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_014.groovy", [])
    }

    void "test GenericsSTCTest_015_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_015.groovy", [])
    }

    void "test GenericsSTCTest_016_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_016.groovy", [])
    }

    void "test GenericsSTCTest_017_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_017.groovy", [])
    }

    void "test GenericsSTCTest_018_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_018.groovy", [])
    }

    void "test GenericsSTCTest_019_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_019.groovy", [])
    }

    void "test GenericsSTCTest_020_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_020.groovy", [])
    }

    void "test GenericsSTCTest_021_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_021.groovy", [])
    }

    void "test GenericsSTCTest_022_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_022.groovy", [])
    }

    void "test GenericsSTCTest_023_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_023.groovy", [])
    }

    void "test GenericsSTCTest_024_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_024.groovy", [])
    }

    void "test GenericsSTCTest_025_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_025.groovy", [])
    }

    void "test GenericsSTCTest_026_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_026.groovy", [])
    }

    void "test GenericsSTCTest_027_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_027.groovy", [])
    }

    void "test GenericsSTCTest_028_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_028.groovy", [])
    }

    void "test GenericsSTCTest_029_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_029.groovy", [])
    }

    void "test GenericsSTCTest_030_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_030.groovy", [])
    }

    void "test GenericsSTCTest_031_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_031.groovy", [])
    }

    void "test GenericsSTCTest_032_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_032.groovy", [])
    }

    void "test GenericsSTCTest_033_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_033.groovy", [])
    }

    void "test GenericsSTCTest_034_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_034.groovy", [])
    }

    void "test GenericsSTCTest_035_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_035.groovy", [])
    }

    void "test GenericsSTCTest_036_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_036.groovy", [])
    }

    void "test GenericsSTCTest_037_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_037.groovy", [])
    }

    void "test GenericsSTCTest_038_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_038.groovy", [])
    }

    void "test GenericsSTCTest_039_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_039.groovy", [])
    }

    void "test GenericsSTCTest_040_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_040.groovy", [])
    }

    void "test GenericsSTCTest_041_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_041.groovy", [])
    }

    void "test GenericsSTCTest_042_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_042.groovy", [])
    }

    void "test GenericsSTCTest_043_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_043.groovy", [])
    }

    void "test GenericsSTCTest_044_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_044.groovy", [])
    }

    void "test GenericsSTCTest_045_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_045.groovy", [])
    }

    void "test GenericsSTCTest_046_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_046.groovy", [])
    }

    void "test GenericsSTCTest_047_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_047.groovy", [])
    }

    void "test GenericsSTCTest_048_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_048.groovy", [])
    }

    void "test GenericsSTCTest_049_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_049.groovy", [])
    }

    void "test GenericsSTCTest_050_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_050.groovy", [])
    }

    void "test GenericsSTCTest_051_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_051.groovy", [])
    }

    void "test GenericsSTCTest_052_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_052.groovy", [])
    }

    void "test GenericsSTCTest_053_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_053.groovy", [])
    }

    void "test GenericsSTCTest_054_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_054.groovy", [])
    }

    void "test GenericsSTCTest_055_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_055.groovy", [])
    }

    void "test GenericsSTCTest_056_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_056.groovy", [])
    }

    void "test GenericsSTCTest_057_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_057.groovy", [])
    }

    void "test GenericsSTCTest_058_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_058.groovy", [])
    }

    void "test GenericsSTCTest_059_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_059.groovy", [])
    }

    void "test GenericsSTCTest_060_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_060.groovy", [])
    }

    void "test GenericsSTCTest_061_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_061.groovy", [])
    }

    void "test GenericsSTCTest_062_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_062.groovy", [])
    }

    void "test GenericsSTCTest_063_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_063.groovy", [])
    }

    void "test GenericsSTCTest_064_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_064.groovy", [])
    }

    void "test GenericsSTCTest_065_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_065.groovy", [])
    }

    void "test GenericsSTCTest_066_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_066.groovy", [])
    }

    void "test GenericsSTCTest_067_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_067.groovy", [])
    }

    void "test GenericsSTCTest_068_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_068.groovy", [])
    }

    void "test GenericsSTCTest_069_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_069.groovy", [])
    }

    void "test GenericsSTCTest_070_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_070.groovy", [])
    }

    void "test GenericsSTCTest_071_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_071.groovy", [])
    }

    void "test GenericsSTCTest_072_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_072.groovy", [])
    }

    void "test GenericsSTCTest_073_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_073.groovy", [])
    }

    void "test GenericsSTCTest_074_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_074.groovy", [])
    }

    void "test GenericsSTCTest_075_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_075.groovy", [])
    }

    void "test GenericsSTCTest_076_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_076.groovy", [])
    }

    void "test GenericsSTCTest_077_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_077.groovy", [])
    }

    void "test GenericsSTCTest_078_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_078.groovy", [])
    }

    void "test GenericsSTCTest_079_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_079.groovy", [])
    }

    void "test GenericsSTCTest_080_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_080.groovy", [])
    }

    void "test GenericsSTCTest_081_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_081.groovy", [])
    }

    void "test GenericsSTCTest_082_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_082.groovy", [])
    }

    void "test GenericsSTCTest_083_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_083.groovy", [])
    }

    void "test GenericsSTCTest_084_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_084.groovy", [])
    }

    void "test GenericsSTCTest_085_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_085.groovy", [])
    }

    void "test GenericsSTCTest_086_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_086.groovy", [])
    }

    void "test GenericsSTCTest_087_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_087.groovy", [])
    }

    void "test GenericsSTCTest_088_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_088.groovy", [])
    }

    void "test GenericsSTCTest_089_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_089.groovy", [])
    }

    void "test GenericsSTCTest_090_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_090.groovy", [])
    }

    void "test GenericsSTCTest_091_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_091.groovy", [])
    }

    void "test GenericsSTCTest_092_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_092.groovy", [])
    }

    void "test GenericsSTCTest_093_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_093.groovy", [])
    }

    void "test GenericsSTCTest_094_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_094.groovy", [])
    }

    void "test GenericsSTCTest_095_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_095.groovy", [])
    }

    void "test GenericsSTCTest_096_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_096.groovy", [])
    }

    void "test GenericsSTCTest_097_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_097.groovy", [])
    }

    void "test GenericsSTCTest_098_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_098.groovy", [])
    }

    void "test GenericsSTCTest_099_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_099.groovy", [])
    }

    void "test GenericsSTCTest_100_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_100.groovy", [], ['assert result == \'ok\\': ''])
    }

    void "test GenericsSTCTest_101_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_101.groovy", [])
    }

    void "test GenericsSTCTest_102_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_102.groovy", [])
    }

    void "test GenericsSTCTest_103_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_103.groovy", [])
    }

    void "test GenericsSTCTest_104_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_104.groovy", [])
    }

    void "test GenericsSTCTest_105_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_105.groovy", [])
    }

    void "test GenericsSTCTest_106_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_106.groovy", [])
    }

    void "test GenericsSTCTest_107_groovy"() {
        unzipAndTest("scripts/GenericsSTCTest_107.groovy", [])
    }

    void "test GenericsTest_001_groovy"() {
        unzipAndTest("scripts/GenericsTest_001.groovy", [])
    }

    void "test GenericsTest_002_groovy"() {
        unzipAndTest("scripts/GenericsTest_002.groovy", [])
    }

    void "test GenericsTest_003_groovy"() {
        unzipAndTest("scripts/GenericsTest_003.groovy", [])
    }

    void "test GenericsTest_004_groovy"() {
        unzipAndTest("scripts/GenericsTest_004.groovy", [])
    }

    void "test GenericsTest_005_groovy"() {
        unzipAndTest("scripts/GenericsTest_005.groovy", [])
    }

    void "test GenericsTest_006_groovy"() {
        unzipAndTest("scripts/GenericsTest_006.groovy", [])
    }

    void "test GenericsTest_007_groovy"() {
        unzipAndTest("scripts/GenericsTest_007.groovy", [])
    }

    void "test GenericsTest_008_groovy"() {
        unzipAndTest("scripts/GenericsTest_008.groovy", [])
    }

    void "test GenericsTest_009_groovy"() {
        unzipAndTest("scripts/GenericsTest_009.groovy", [])
    }

    void "test Gep3Test_001_groovy"() {
        unzipAndTest("scripts/Gep3Test_001.groovy", [])
    }

    void "test Gep3Test_002_groovy"() {
        unzipAndTest("scripts/Gep3Test_002.groovy", [])
    }

    void "test Gep3Test_003_groovy"() {
        unzipAndTest("scripts/Gep3Test_003.groovy", [])
    }

    void "test Gep3Test_004_groovy"() {
        unzipAndTest("scripts/Gep3Test_004.groovy", [])
    }

    void "test GlobalTransformTest_001_groovy"() {
        unzipAndTest("scripts/GlobalTransformTest_001.groovy", [])
    }

    void "test GrabResolverTest_001_groovy"() {
        unzipAndTest("scripts/GrabResolverTest_001.groovy", [])
    }

    void "test GrabResolverTest_002_groovy"() {
        unzipAndTest("scripts/GrabResolverTest_002.groovy", [])
    }

    void "test GrabResolverTest_003_groovy"() {
        unzipAndTest("scripts/GrabResolverTest_003.groovy", [])
    }

    void "test GrabResolverTest_004_groovy"() {
        unzipAndTest("scripts/GrabResolverTest_004.groovy", [])
    }

    void "test GrabResolverTest_005_groovy"() {
        unzipAndTest("scripts/GrabResolverTest_005.groovy", [])
    }

    void "test GrapeIvyTest_001_groovy"() {
        unzipAndTest("scripts/GrapeIvyTest_001.groovy", [])
    }

    void "test GrapeIvyTest_002_groovy"() {
        unzipAndTest("scripts/GrapeIvyTest_002.groovy", [])
    }

    void "test GrapeIvyTest_003_groovy"() {
        unzipAndTest("scripts/GrapeIvyTest_003.groovy", [])
    }

    void "test GrapeIvyTest_004_groovy"() {
        unzipAndTest("scripts/GrapeIvyTest_004.groovy", [])
    }

    void "test GrapeIvyTest_005_groovy"() {
        unzipAndTest("scripts/GrapeIvyTest_005.groovy", [])
    }

    void "test GrapeIvyTest_006_groovy"() {
        unzipAndTest("scripts/GrapeIvyTest_006.groovy", [])
    }

    void "test GrapeIvyTest_007_groovy"() {
        unzipAndTest("scripts/GrapeIvyTest_007.groovy", [])
    }

    void "test GrapeIvyTest_008_groovy"() {
        unzipAndTest("scripts/GrapeIvyTest_008.groovy", [])
    }

    void "test GrapeIvyTest_009_groovy"() {
        unzipAndTest("scripts/GrapeIvyTest_009.groovy", [])
    }

    void "test Groovy278_Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy278_Bug_001.groovy", [])
    }

    void "test Groovy2816Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy2816Bug_001.groovy", [])
    }

    void "test Groovy2949Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy2949Bug_001.groovy", [])
    }

    void "test Groovy3175_Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3175_Bug_001.groovy", [])
    }

    void "test Groovy3383Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3383Bug_001.groovy", [])
    }

    void "test Groovy3389Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3389Bug_001.groovy", [])
    }

    void "test Groovy3410Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3410Bug_001.groovy", [])
    }

    void "test Groovy3410Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy3410Bug_002.groovy", [])
    }

    void "test Groovy3410Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy3410Bug_003.groovy", [])
    }

    void "test Groovy3410Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy3410Bug_004.groovy", [])
    }

    void "test Groovy3410Bug_005_groovy"() {
        unzipAndTest("scripts/Groovy3410Bug_005.groovy", [])
    }

    void "test Groovy3462Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3462Bug_001.groovy", [])
    }

    void "test Groovy3464Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3464Bug_001.groovy", [])
    }

    void "test Groovy3464Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy3464Bug_002.groovy", [])
    }

    void "test Groovy3498Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3498Bug_001.groovy", [])
    }

    void "test Groovy3519Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3519Bug_001.groovy", [])
    }

    void "test Groovy3519Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy3519Bug_002.groovy", [])
    }

    void "test Groovy3645Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3645Bug_001.groovy", [])
    }

    void "test Groovy3723Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3723Bug_001.groovy", [])
    }

    void "test Groovy3749Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3749Bug_001.groovy", [])
    }

    void "test Groovy3770Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3770Bug_001.groovy", [])
    }

    void "test Groovy3839Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3839Bug_001.groovy", [])
    }

    void "test Groovy3839Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy3839Bug_002.groovy", [])
    }

    void "test Groovy3839Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy3839Bug_003.groovy", [])
    }

    void "test Groovy3839Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy3839Bug_004.groovy", [])
    }

    void "test Groovy3863Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy3863Bug_001.groovy", [])
    }

    void "test Groovy4006Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4006Bug_001.groovy", [])
    }

    void "test Groovy4006Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy4006Bug_002.groovy", [])
    }

    void "test Groovy4006Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy4006Bug_003.groovy", [])
    }

    void "test Groovy4006Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy4006Bug_004.groovy", [])
    }

    void "test Groovy4009Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4009Bug_001.groovy", [])
    }

    void "test Groovy4069Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4069Bug_001.groovy", [])
    }

    void "test Groovy4069Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy4069Bug_002.groovy", [])
    }

    void "test Groovy4069Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy4069Bug_003.groovy", [])
    }

    void "test Groovy4069Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy4069Bug_004.groovy", [])
    }

    void "test Groovy4080Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4080Bug_001.groovy", [])
    }

    void "test Groovy4119Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4119Bug_001.groovy", [])
    }

    void "test Groovy4133Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4133Bug_001.groovy", [])
    }

    void "test Groovy4235Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4235Bug_001.groovy", [])
    }

    void "test Groovy4246Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4246Bug_001.groovy", [])
    }

    void "test Groovy4264Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4264Bug_001.groovy", [])
    }

    void "test Groovy4264Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy4264Bug_002.groovy", [])
    }

    void "test Groovy4264Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy4264Bug_003.groovy", [])
    }

    void "test Groovy4272Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4272Bug_001.groovy", [])
    }

    void "test Groovy4293Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4293Bug_001.groovy", [])
    }

    void "test Groovy4386_Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4386_Bug_001.groovy", [])
    }

    void "test Groovy4386_Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy4386_Bug_002.groovy", [])
    }

    void "test Groovy4386_Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy4386_Bug_003.groovy", [])
    }

    void "test Groovy4415Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4415Bug_001.groovy", [])
    }

    void "test Groovy4415Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy4415Bug_002.groovy", [])
    }

    void "test Groovy4415Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy4415Bug_003.groovy", [])
    }

    void "test Groovy4416Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4416Bug_001.groovy", [])
    }

    void "test Groovy4418Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4418Bug_001.groovy", [])
    }

    void "test Groovy4418Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy4418Bug_002.groovy", [])
    }

    void "test Groovy4457GenericTypeDeclarationLeakTest_001_groovy"() {
        unzipAndTest("scripts/Groovy4457GenericTypeDeclarationLeakTest_001.groovy", [])
    }

    void "test Groovy4457GenericTypeDeclarationLeakTest_002_groovy"() {
        unzipAndTest("scripts/Groovy4457GenericTypeDeclarationLeakTest_002.groovy", [])
    }

    void "test Groovy4457GenericTypeDeclarationLeakTest_003_groovy"() {
        unzipAndTest("scripts/Groovy4457GenericTypeDeclarationLeakTest_003.groovy", [])
    }

    void "test Groovy4471Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4471Bug_001.groovy", [])
    }

    void "test Groovy4471Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy4471Bug_002.groovy", [])
    }

    void "test Groovy4497Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4497Bug_001.groovy", [])
    }

    void "test Groovy4516Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4516Bug_001.groovy", [])
    }

    void "test Groovy4584Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4584Bug_001.groovy", [])
    }

    void "test Groovy4857Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4857Bug_001.groovy", [])
    }

    void "test Groovy4857Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy4857Bug_002.groovy", [])
    }

    void "test Groovy4922Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4922Bug_001.groovy", [])
    }

    void "test Groovy4980Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4980Bug_001.groovy", [])
    }

    void "test Groovy4989Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4989Bug_001.groovy", [])
    }

    void "test Groovy4999Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy4999Bug_001.groovy", [])
    }

    void "test Groovy5030Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5030Bug_001.groovy", [])
    }

    void "test Groovy5033Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5033Bug_001.groovy", [])
    }

    void "test Groovy5041Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5041Bug_001.groovy", [])
    }

    void "test Groovy5041Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy5041Bug_002.groovy", [])
    }

    void "test Groovy5109Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5109Bug_001.groovy", [])
    }

    void "test Groovy5122Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5122Bug_001.groovy", [])
    }

    void "test Groovy5137Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5137Bug_001.groovy", [])
    }

    void "test Groovy5137Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy5137Bug_002.groovy", [])
    }

    void "test Groovy5152Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5152Bug_001.groovy", [])
    }

    void "test Groovy5185Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5185Bug_001.groovy", [])
    }

    void "test Groovy5193Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5193Bug_001.groovy", [])
    }

    void "test Groovy5193Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy5193Bug_002.groovy", [])
    }

    void "test Groovy5210Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5210Bug_001.groovy", [])
    }

    void "test Groovy5210Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy5210Bug_002.groovy", [])
    }

    /* moved to SyntaxErrorTest
    void "test Groovy5212Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5212Bug_001.groovy", [])
    }
    */

    void "test Groovy5212Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy5212Bug_002.groovy", [])
    }

    void "test Groovy5259Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5259Bug_001.groovy", [])
    }

    void "test Groovy5259Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy5259Bug_002.groovy", [])
    }

    void "test Groovy5259Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy5259Bug_003.groovy", [])
    }

    void "test Groovy5259Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy5259Bug_004.groovy", [])
    }

    void "test Groovy5267Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5267Bug_001.groovy", [])
    }

    void "test Groovy5272Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5272Bug_001.groovy", [])
    }

    void "test Groovy5272Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy5272Bug_002.groovy", [])
    }

    void "test Groovy5272Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy5272Bug_003.groovy", [])
    }

    void "test Groovy5272Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy5272Bug_004.groovy", [])
    }

    void "test Groovy5272Bug_005_groovy"() {
        unzipAndTest("scripts/Groovy5272Bug_005.groovy", [])
    }

    void "test Groovy5272Bug_006_groovy"() {
        unzipAndTest("scripts/Groovy5272Bug_006.groovy", [])
    }

    void "test Groovy5272Bug_007_groovy"() {
        unzipAndTest("scripts/Groovy5272Bug_007.groovy", [])
    }

    void "test Groovy5285Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5285Bug_001.groovy", [])
    }

    void "test Groovy5396Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5396Bug_001.groovy", [])
    }

    void "test Groovy5418Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5418Bug_001.groovy", [])
    }

    void "test Groovy5572Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy5572Bug_001.groovy", [])
    }

    void "test Groovy5572Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy5572Bug_002.groovy", [])
    }

    void "test Groovy6045Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6045Bug_001.groovy", [])
    }

    void "test Groovy6045Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6045Bug_002.groovy", [])
    }

    void "test Groovy6072Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6072Bug_001.groovy", [])
    }

    void "test Groovy6240Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6240Bug_001.groovy", [])
    }

    void "test Groovy6240Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6240Bug_002.groovy", [])
    }

    void "test Groovy6240Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy6240Bug_003.groovy", [])
    }

    void "test Groovy6276Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6276Bug_001.groovy", [])
    }

    void "test Groovy6276Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6276Bug_002.groovy", [])
    }

    void "test Groovy6374Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6374Bug_001.groovy", [])
    }

    void "test Groovy6396Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6396Bug_001.groovy", [])
    }

    void "test Groovy6411Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6411Bug_001.groovy", [])
    }

    void "test Groovy6475Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6475Bug_001.groovy", [])
    }

    void "test Groovy6522Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6522Bug_001.groovy", [])
    }

    void "test Groovy6533Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6533Bug_001.groovy", [])
    }

    void "test Groovy6533Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6533Bug_002.groovy", [])
    }

    void "test Groovy6541Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6541Bug_001.groovy", [])
    }

    void "test Groovy6541Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6541Bug_002.groovy", [])
    }

    void "test Groovy6541Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy6541Bug_003.groovy", [])
    }

    void "test Groovy6541Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy6541Bug_004.groovy", [])
    }

    void "test Groovy6558Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6558Bug_001.groovy", [])
    }

    void "test Groovy6558Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6558Bug_002.groovy", [])
    }

    void "test Groovy6558Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy6558Bug_003.groovy", [])
    }

    void "test Groovy6558Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy6558Bug_004.groovy", [])
    }

    void "test Groovy6564Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6564Bug_001.groovy", [])
    }

    void "test Groovy6564Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6564Bug_002.groovy", [])
    }

    void "test Groovy6568Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6568Bug_001.groovy", [])
    }

    void "test Groovy6627Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6627Bug_001.groovy", [])
    }

    void "test Groovy6650Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6650Bug_001.groovy", [])
    }

    void "test Groovy6650Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6650Bug_002.groovy", [])
    }

    void "test Groovy6657Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6657Bug_001.groovy", [])
    }

    void "test Groovy6670Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6670Bug_001.groovy", [])
    }

    void "test Groovy6671Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6671Bug_001.groovy", [])
    }

    void "test Groovy6671Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6671Bug_002.groovy", [])
    }

    void "test Groovy6676Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6676Bug_001.groovy", [])
    }

    void "test Groovy6693Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6693Bug_001.groovy", [])
    }

    void "test Groovy6697Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6697Bug_001.groovy", [])
    }

    void "test Groovy6697Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6697Bug_002.groovy", [])
    }

    void "test Groovy6697Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy6697Bug_003.groovy", [])
    }

    void "test Groovy6697Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy6697Bug_004.groovy", [])
    }

    void "test Groovy6697Bug_005_groovy"() {
        unzipAndTest("scripts/Groovy6697Bug_005.groovy", [])
    }

    void "test Groovy6697Bug_006_groovy"() {
        unzipAndTest("scripts/Groovy6697Bug_006.groovy", [])
    }

    void "test Groovy6722Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6722Bug_001.groovy", [])
    }

    void "test Groovy6724Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6724Bug_001.groovy", [])
    }

    void "test Groovy6733Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6733Bug_001.groovy", [])
    }

    void "test Groovy6736Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6736Bug_001.groovy", [])
    }

    void "test Groovy6741Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6741Bug_001.groovy", [])
    }

    void "test Groovy6755Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6755Bug_001.groovy", [])
    }

    void "test Groovy6757Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6757Bug_001.groovy", [])
    }

    void "test Groovy6757Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6757Bug_002.groovy", [])
    }

    void "test Groovy6764Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6764Bug_001.groovy", [])
    }

    void "test Groovy6782Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6782Bug_001.groovy", [])
    }

    void "test Groovy6786Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6786Bug_001.groovy", [])
    }

    void "test Groovy6786Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6786Bug_002.groovy", [])
    }

    void "test Groovy6786Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy6786Bug_003.groovy", [])
    }

    void "test Groovy6786Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy6786Bug_004.groovy", [])
    }

    void "test Groovy6804Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6804Bug_001.groovy", [])
    }

    void "test Groovy6808Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6808Bug_001.groovy", [])
    }

    void "test Groovy6811Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6811Bug_001.groovy", [])
    }

    void "test Groovy6811Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6811Bug_002.groovy", [])
    }

    void "test Groovy6821Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6821Bug_001.groovy", [])
    }

    void "test Groovy6821Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy6821Bug_002.groovy", [], ['\'ok\\\'': '\'ok\\\'\''])
    }

    void "test Groovy6830Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6830Bug_001.groovy", [])
    }

    void "test Groovy6841Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6841Bug_001.groovy", [])
    }

    void "test Groovy6932Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6932Bug_001.groovy", [])
    }

    void "test Groovy6962Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy6962Bug_001.groovy", [])
    }

    void "test Groovy7011Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7011Bug_001.groovy", [])
    }

    void "test Groovy7011Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7011Bug_002.groovy", [])
    }

    void "test Groovy7011Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy7011Bug_003.groovy", [])
    }

    void "test Groovy7011Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy7011Bug_004.groovy", [])
    }

    void "test Groovy7039Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7039Bug_001.groovy", [])
    }

    void "test Groovy7039Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7039Bug_002.groovy", [])
    }

    void "test Groovy7039Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy7039Bug_003.groovy", [])
    }

    void "test Groovy7041Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7041Bug_001.groovy", [])
    }

    void "test Groovy7042Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7042Bug_001.groovy", [])
    }

    void "test Groovy7072Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7072Bug_001.groovy", [])
    }

    void "test Groovy7075Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7075Bug_001.groovy", [])
    }

    void "test Groovy7075Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7075Bug_002.groovy", [])
    }

    void "test Groovy7093Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7093Bug_001.groovy", [])
    }

    void "test Groovy7098Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7098Bug_001.groovy", [])
    }

    void "test Groovy7133Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7133Bug_001.groovy", [])
    }

    void "test Groovy7138Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7138Bug_001.groovy", [])
    }

    void "test Groovy7138Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7138Bug_002.groovy", [])
    }

    void "test Groovy7145Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7145Bug_001.groovy", [])
    }

    void "test Groovy7145Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7145Bug_002.groovy", [])
    }

    void "test Groovy7145Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy7145Bug_003.groovy", [])
    }

    void "test Groovy7149Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7149Bug_001.groovy", [])
    }

    void "test Groovy7169Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7169Bug_001.groovy", [])
    }

    void "test Groovy7169Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7169Bug_002.groovy", [])
    }

    void "test Groovy7190Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7190Bug_001.groovy", [])
    }

    void "test Groovy7196Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7196Bug_001.groovy", [])
    }

    void "test Groovy7206Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7206Bug_001.groovy", [])
    }

    void "test Groovy7206Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7206Bug_002.groovy", [])
    }

    void "test Groovy7206Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy7206Bug_003.groovy", [])
    }

    void "test Groovy7206Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy7206Bug_004.groovy", [])
    }

    void "test Groovy7210Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7210Bug_001.groovy", [])
    }

    void "test Groovy7211Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7211Bug_001.groovy", [])
    }

    void "test Groovy7213Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7213Bug_001.groovy", [])
    }

    void "test Groovy7214Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7214Bug_001.groovy", [])
    }

    void "test Groovy7217Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7217Bug_001.groovy", [])
    }

    void "test Groovy7217Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7217Bug_002.groovy", [])
    }

    void "test Groovy7222OptimizationsTest_001_groovy"() {
        unzipAndTest("scripts/Groovy7222OptimizationsTest_001.groovy", [])
    }

    void "test Groovy7222OptimizationsTest_002_groovy"() {
        unzipAndTest("scripts/Groovy7222OptimizationsTest_002.groovy", [])
    }

    void "test Groovy7242Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7242Bug_001.groovy", [])
    }

    void "test Groovy7242Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7242Bug_002.groovy", [])
    }

    void "test Groovy7242Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy7242Bug_003.groovy", [])
    }

    void "test Groovy7242Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy7242Bug_004.groovy", [])
    }

    void "test Groovy7255Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7255Bug_001.groovy", [])
    }

    void "test Groovy7269Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7269Bug_001.groovy", [])
    }

    void "test Groovy7269Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7269Bug_002.groovy", [])
    }

    void "test Groovy7275Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7275Bug_001.groovy", [])
    }

    void "test Groovy7276Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7276Bug_001.groovy", [])
    }

    void "test Groovy7276Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7276Bug_002.groovy", [])
    }

    void "test Groovy7276Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy7276Bug_003.groovy", [])
    }

    void "test Groovy7276Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy7276Bug_004.groovy", [])
    }

    void "test Groovy7285Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7285Bug_001.groovy", [])
    }

    void "test Groovy7298Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7298Bug_001.groovy", [])
    }

    void "test Groovy7300Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7300Bug_001.groovy", [])
    }

    void "test Groovy7300Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7300Bug_002.groovy", [])
    }

    void "test Groovy7307Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7307Bug_001.groovy", [])
    }

    void "test Groovy7316Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7316Bug_001.groovy", [])
    }

    void "test Groovy7316Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7316Bug_002.groovy", [])
    }

    void "test Groovy7322Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7322Bug_001.groovy", [])
    }

    void "test Groovy7322Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7322Bug_002.groovy", [])
    }

    void "test Groovy7324Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7324Bug_001.groovy", [])
    }

    void "test Groovy7324Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7324Bug_002.groovy", [])
    }

    void "test Groovy7325Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7325Bug_001.groovy", [])
    }

    void "test Groovy7327Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7327Bug_001.groovy", [])
    }

    void "test Groovy7333Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7333Bug_001.groovy", [])
    }

    void "test Groovy7343Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7343Bug_001.groovy", [])
    }

    void "test Groovy7355Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7355Bug_001.groovy", [])
    }

    void "test Groovy7356Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7356Bug_001.groovy", [])
    }

    void "test Groovy7356Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7356Bug_002.groovy", [])
    }

    void "test Groovy7357Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7357Bug_001.groovy", [])
    }

    void "test Groovy7358Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7358Bug_001.groovy", [])
    }

    void "test Groovy7361Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7361Bug_001.groovy", [])
    }

    void "test Groovy7361Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7361Bug_002.groovy", [])
    }

    void "test Groovy7363Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7363Bug_001.groovy", [])
    }

    void "test Groovy7364Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7364Bug_001.groovy", [])
    }

    void "test Groovy7365Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7365Bug_001.groovy", [])
    }

    void "test Groovy7420Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7420Bug_001.groovy", [])
    }

    void "test Groovy7456Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7456Bug_001.groovy", [])
    }

    void "test Groovy7538Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7538Bug_001.groovy", [])
    }

    void "test Groovy7538Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7538Bug_002.groovy", [])
    }

    void "test Groovy7538Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy7538Bug_003.groovy", [])
    }

    void "test Groovy7774Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7774Bug_001.groovy", [])
    }

    void "test Groovy7774Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7774Bug_002.groovy", [])
    }

    void "test Groovy7870Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7870Bug_001.groovy", [])
    }

    void "test Groovy7870Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7870Bug_002.groovy", [])
    }

    void "test Groovy7870Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy7870Bug_003.groovy", [])
    }

    void "test Groovy7870Bug_004_groovy"() {
        unzipAndTest("scripts/Groovy7870Bug_004.groovy", [])
    }

    void "test Groovy7870Bug_005_groovy"() {
        unzipAndTest("scripts/Groovy7870Bug_005.groovy", [])
    }

    void "test Groovy7870Bug_006_groovy"() {
        unzipAndTest("scripts/Groovy7870Bug_006.groovy", [])
    }

    void "test Groovy7876Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7876Bug_001.groovy", [])
    }

    void "test Groovy7888Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7888Bug_001.groovy", [])
    }

    void "test Groovy7907Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7907Bug_001.groovy", [])
    }

    void "test Groovy7916Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7916Bug_001.groovy", [])
    }

    void "test Groovy7917Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7917Bug_001.groovy", [])
    }

    void "test Groovy7920Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7920Bug_001.groovy", [])
    }

    void "test Groovy7920Bug_002_groovy"() {
        unzipAndTest("scripts/Groovy7920Bug_002.groovy", [])
    }

    void "test Groovy7920Bug_003_groovy"() {
        unzipAndTest("scripts/Groovy7920Bug_003.groovy", [])
    }

    void "test Groovy7921Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7921Bug_001.groovy", [])
    }

    void "test Groovy7924Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7924Bug_001.groovy", [])
    }

    void "test Groovy7926Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7926Bug_001.groovy", [])
    }

    void "test Groovy7937Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7937Bug_001.groovy", [])
    }

    void "test Groovy7938Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy7938Bug_001.groovy", [])
    }

    void "test Groovy872Bug_001_groovy"() {
        unzipAndTest("scripts/Groovy872Bug_001.groovy", [])
    }

    void "test GroovyCastTest_001_groovy"() {
        unzipAndTest("scripts/GroovyCastTest_001.groovy", [])
    }

    void "test GroovyCastTest_002_groovy"() {
        unzipAndTest("scripts/GroovyCastTest_002.groovy", [])
    }

    void "test GroovyCastTest_003_groovy"() {
        unzipAndTest("scripts/GroovyCastTest_003.groovy", [])
    }

    void "test GroovyCastTest_004_groovy"() {
        unzipAndTest("scripts/GroovyCastTest_004.groovy", [])
    }

    void "test GroovyCastTest_005_groovy"() {
        unzipAndTest("scripts/GroovyCastTest_005.groovy", [])
    }

    void "test GroovyCastTest_006_groovy"() {
        unzipAndTest("scripts/GroovyCastTest_006.groovy", [])
    }

    void "test GroovyCastTest_007_groovy"() {
        unzipAndTest("scripts/GroovyCastTest_007.groovy", [])
    }

    void "test GroovyInnerEnumBug_001_groovy"() {
        unzipAndTest("scripts/GroovyInnerEnumBug_001.groovy", [])
    }

    void "test GroovyObjectInheritanceTest_001_groovy"() {
        unzipAndTest("scripts/GroovyObjectInheritanceTest_001.groovy", [])
    }

    void "test GroovyObjectInheritanceTest_002_groovy"() {
        unzipAndTest("scripts/GroovyObjectInheritanceTest_002.groovy", [])
    }

    void "test GroovyObjectInheritanceTest_003_groovy"() {
        unzipAndTest("scripts/GroovyObjectInheritanceTest_003.groovy", [])
    }

    void "test GroovyObjectInheritanceTest_004_groovy"() {
        unzipAndTest("scripts/GroovyObjectInheritanceTest_004.groovy", [])
    }

    void "test GroovyObjectInheritanceTest_005_groovy"() {
        unzipAndTest("scripts/GroovyObjectInheritanceTest_005.groovy", [])
    }

    void "test GroovyObjectInheritanceTest_006_groovy"() {
        unzipAndTest("scripts/GroovyObjectInheritanceTest_006.groovy", [])
    }

    void "test GroovyObjectInheritanceTest_007_groovy"() {
        unzipAndTest("scripts/GroovyObjectInheritanceTest_007.groovy", [])
    }

    void "test GroovyObjectInheritanceTest_008_groovy"() {
        unzipAndTest("scripts/GroovyObjectInheritanceTest_008.groovy", [])
    }

    void "test GroovyObjectTest_001_groovy"() {
        unzipAndTest("scripts/GroovyObjectTest_001.groovy", [])
    }

    void "test GroovyObjectTest_002_groovy"() {
        unzipAndTest("scripts/GroovyObjectTest_002.groovy", [])
    }

    void "test GroovyObjectTest_003_groovy"() {
        unzipAndTest("scripts/GroovyObjectTest_003.groovy", [])
    }

    void "test GroovyObjectTest_004_groovy"() {
        unzipAndTest("scripts/GroovyObjectTest_004.groovy", [])
    }

    void "test GroovyObjectTest_005_groovy"() {
        unzipAndTest("scripts/GroovyObjectTest_005.groovy", [])
    }

    void "test GroovyTestCaseExampleTests_001_groovy"() {
        unzipAndTest("scripts/GroovyTestCaseExampleTests_001.groovy", [])
    }

    /* moved to SyntaxErrorTest
    void "test GStringEndTest_001_groovy"() {
        unzipAndTest("scripts/GStringEndTest_001.groovy", [])
    }
    */

    void "test ImmutableTransformTest_001_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_001.groovy", [])
    }

    void "test ImmutableTransformTest_002_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_002.groovy", [])
    }

    void "test ImmutableTransformTest_003_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_003.groovy", [])
    }

    void "test ImmutableTransformTest_004_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_004.groovy", [])
    }

    void "test ImmutableTransformTest_005_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_005.groovy", [])
    }

    void "test ImmutableTransformTest_006_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_006.groovy", [])
    }

    void "test ImmutableTransformTest_007_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_007.groovy", [])
    }

    void "test ImmutableTransformTest_008_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_008.groovy", [])
    }

    void "test ImmutableTransformTest_009_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_009.groovy", [])
    }

    void "test ImmutableTransformTest_010_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_010.groovy", [])
    }

    void "test ImmutableTransformTest_011_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_011.groovy", [])
    }

    void "test ImmutableTransformTest_012_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_012.groovy", [])
    }

    void "test ImmutableTransformTest_013_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_013.groovy", [])
    }

    void "test ImmutableTransformTest_014_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_014.groovy", [])
    }

    void "test ImmutableTransformTest_015_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_015.groovy", [])
    }

    void "test ImmutableTransformTest_016_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_016.groovy", [])
    }

    void "test ImmutableTransformTest_017_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_017.groovy", [])
    }

    void "test ImmutableTransformTest_018_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_018.groovy", [])
    }

    void "test ImmutableTransformTest_019_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_019.groovy", [])
    }

    void "test ImmutableTransformTest_020_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_020.groovy", [])
    }

    void "test ImmutableTransformTest_021_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_021.groovy", [])
    }

    void "test ImmutableTransformTest_022_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_022.groovy", [])
    }

    void "test ImmutableTransformTest_023_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_023.groovy", [])
    }

    void "test ImmutableTransformTest_024_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_024.groovy", [])
    }

    void "test ImmutableTransformTest_025_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_025.groovy", [])
    }

    void "test ImmutableTransformTest_026_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_026.groovy", [])
    }

    void "test ImmutableTransformTest_027_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_027.groovy", [])
    }

    void "test ImmutableTransformTest_028_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_028.groovy", [])
    }

    void "test ImmutableTransformTest_029_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_029.groovy", [])
    }

    void "test ImmutableTransformTest_030_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_030.groovy", [])
    }

    void "test ImmutableTransformTest_031_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_031.groovy", [])
    }

    void "test ImmutableTransformTest_032_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_032.groovy", [])
    }

    void "test ImmutableTransformTest_033_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_033.groovy", [])
    }

    void "test ImmutableTransformTest_034_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_034.groovy", [])
    }

    void "test ImmutableTransformTest_035_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_035.groovy", [])
    }

    void "test ImmutableTransformTest_036_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_036.groovy", [])
    }

    void "test ImmutableTransformTest_037_groovy"() {
        unzipAndTest("scripts/ImmutableTransformTest_037.groovy", [])
    }

    void "test ImportCustomizerTest_001_groovy"() {
        unzipAndTest("scripts/ImportCustomizerTest_001.groovy", [])
    }

    void "test ImportNodeLineNumberTest_001_groovy"() {
        unzipAndTest("scripts/ImportNodeLineNumberTest_001.groovy", [])
    }

    void "test IndexedPropertyTransformTest_001_groovy"() {
        unzipAndTest("scripts/IndexedPropertyTransformTest_001.groovy", [])
    }

    void "test IndexedPropertyTransformTest_002_groovy"() {
        unzipAndTest("scripts/IndexedPropertyTransformTest_002.groovy", [])
    }

    void "test IndyUsageTest_001_groovy"() {
        unzipAndTest("scripts/IndyUsageTest_001.groovy", [])
    }

    void "test InheritConstructorsTransformTest_001_groovy"() {
        unzipAndTest("scripts/InheritConstructorsTransformTest_001.groovy", [])
    }

    void "test InheritConstructorsTransformTest_002_groovy"() {
        unzipAndTest("scripts/InheritConstructorsTransformTest_002.groovy", [])
    }

    void "test InheritConstructorsTransformTest_003_groovy"() {
        unzipAndTest("scripts/InheritConstructorsTransformTest_003.groovy", [])
    }

    void "test InheritConstructorsTransformTest_004_groovy"() {
        unzipAndTest("scripts/InheritConstructorsTransformTest_004.groovy", [])
    }

    void "test InheritConstructorsTransformTest_005_groovy"() {
        unzipAndTest("scripts/InheritConstructorsTransformTest_005.groovy", [])
    }

    void "test InheritConstructorsTransformTest_006_groovy"() {
        unzipAndTest("scripts/InheritConstructorsTransformTest_006.groovy", [])
    }

    void "test InnerClassTest_001_groovy"() {
        unzipAndTest("scripts/InnerClassTest_001.groovy", [])
    }

    void "test InnerClassTest_002_groovy"() {
        unzipAndTest("scripts/InnerClassTest_002.groovy", [])
    }

    void "test InnerClassTest_003_groovy"() {
        unzipAndTest("scripts/InnerClassTest_003.groovy", [])
    }

    void "test InnerClassTest_004_groovy"() {
        unzipAndTest("scripts/InnerClassTest_004.groovy", [])
    }

    void "test InnerClassTest_005_groovy"() {
        unzipAndTest("scripts/InnerClassTest_005.groovy", [])
    }

    void "test InnerClassTest_006_groovy"() {
        unzipAndTest("scripts/InnerClassTest_006.groovy", [])
    }

    void "test InnerClassTest_007_groovy"() {
        unzipAndTest("scripts/InnerClassTest_007.groovy", [])
    }

    void "test InnerClassTest_008_groovy"() {
        unzipAndTest("scripts/InnerClassTest_008.groovy", [])
    }

    void "test InnerClassTest_009_groovy"() {
        unzipAndTest("scripts/InnerClassTest_009.groovy", [])
    }

    void "test InnerClassTest_010_groovy"() {
        unzipAndTest("scripts/InnerClassTest_010.groovy", [])
    }

    void "test InnerClassTest_011_groovy"() {
        unzipAndTest("scripts/InnerClassTest_011.groovy", [])
    }

    void "test InnerClassTest_012_groovy"() {
        unzipAndTest("scripts/InnerClassTest_012.groovy", [])
    }

    void "test InnerClassTest_013_groovy"() {
        unzipAndTest("scripts/InnerClassTest_013.groovy", [])
    }

    void "test InnerClassTest_014_groovy"() {
        unzipAndTest("scripts/InnerClassTest_014.groovy", [])
    }

    void "test InnerClassTest_015_groovy"() {
        unzipAndTest("scripts/InnerClassTest_015.groovy", [])
    }

    void "test InnerClassTest_016_groovy"() {
        unzipAndTest("scripts/InnerClassTest_016.groovy", [])
    }

    void "test InnerClassTest_017_groovy"() {
        unzipAndTest("scripts/InnerClassTest_017.groovy", [])
    }

    void "test InnerClassTest_018_groovy"() {
        unzipAndTest("scripts/InnerClassTest_018.groovy", [])
    }

    void "test InnerClassTest_019_groovy"() {
        unzipAndTest("scripts/InnerClassTest_019.groovy", [])
    }

    void "test InnerClassTest_020_groovy"() {
        unzipAndTest("scripts/InnerClassTest_020.groovy", [])
    }

    void "test InnerClassTest_021_groovy"() {
        unzipAndTest("scripts/InnerClassTest_021.groovy", [])
    }

    void "test InnerClassTest_022_groovy"() {
        unzipAndTest("scripts/InnerClassTest_022.groovy", [])
    }

    void "test InnerClassTest_023_groovy"() {
        unzipAndTest("scripts/InnerClassTest_023.groovy", [])
    }

    void "test InnerClassTest_024_groovy"() {
        unzipAndTest("scripts/InnerClassTest_024.groovy", [])
    }

    void "test InnerClassTest_025_groovy"() {
        unzipAndTest("scripts/InnerClassTest_025.groovy", [])
    }

    void "test InnerClassTest_026_groovy"() {
        unzipAndTest("scripts/InnerClassTest_026.groovy", [])
    }

    void "test InnerClassTest_027_groovy"() {
        unzipAndTest("scripts/InnerClassTest_027.groovy", [])
    }

    void "test InnerClassTest_028_groovy"() {
        unzipAndTest("scripts/InnerClassTest_028.groovy", [])
    }

    void "test InnerClassTest_029_groovy"() {
        unzipAndTest("scripts/InnerClassTest_029.groovy", [])
    }

    void "test InnerClassTest_030_groovy"() {
        unzipAndTest("scripts/InnerClassTest_030.groovy", [])
    }

    void "test InnerClassTest_031_groovy"() {
        unzipAndTest("scripts/InnerClassTest_031.groovy", [])
    }

    void "test InnerClassTest_032_groovy"() {
        unzipAndTest("scripts/InnerClassTest_032.groovy", [])
    }

    void "test InnerClassTest_033_groovy"() {
        unzipAndTest("scripts/InnerClassTest_033.groovy", [])
    }

    void "test InnerInterfaceTest_001_groovy"() {
        unzipAndTest("scripts/InnerInterfaceTest_001.groovy", [])
    }

    void "test InnerInterfaceTest_002_groovy"() {
        unzipAndTest("scripts/InnerInterfaceTest_002.groovy", [])
    }

    void "test InnerInterfaceTest_003_groovy"() {
        unzipAndTest("scripts/InnerInterfaceTest_003.groovy", [])
    }

    void "test InnerInterfaceTest_004_groovy"() {
        unzipAndTest("scripts/InnerInterfaceTest_004.groovy", [])
    }

    void "test InnerInterfaceTest_005_groovy"() {
        unzipAndTest("scripts/InnerInterfaceTest_005.groovy", [])
    }

    void "test IntegerOperatorsTest_001_groovy"() {
        unzipAndTest("scripts/IntegerOperatorsTest_001.groovy", [])
    }

    void "test IntegerOperatorsTest_002_groovy"() {
        unzipAndTest("scripts/IntegerOperatorsTest_002.groovy", [])
    }

    void "test IntegrationTest_001_groovy"() {
        unzipAndTest("scripts/IntegrationTest_001.groovy", [])
    }

    void "test IntegrationTest_002_groovy"() {
        unzipAndTest("scripts/IntegrationTest_002.groovy", [])
    }

    void "test IntegrationTest_003_groovy"() {
        unzipAndTest("scripts/IntegrationTest_003.groovy", [])
    }

    void "test IntegrationTest_004_groovy"() {
        unzipAndTest("scripts/IntegrationTest_004.groovy", [])
    }

    void "test IntegrationTest_005_groovy"() {
        unzipAndTest("scripts/IntegrationTest_005.groovy", [])
    }

    void "test IntegrationTest_006_groovy"() {
        unzipAndTest("scripts/IntegrationTest_006.groovy", [])
    }

    void "test IntegrationTest_007_groovy"() {
        unzipAndTest("scripts/IntegrationTest_007.groovy", [])
    }

    void "test IntegrationTest_008_groovy"() {
        unzipAndTest("scripts/IntegrationTest_008.groovy", [])
    }

    void "test IntegrationTest_009_groovy"() {
        unzipAndTest("scripts/IntegrationTest_009.groovy", [])
    }

    void "test IntegrationTest_010_groovy"() {
        unzipAndTest("scripts/IntegrationTest_010.groovy", [])
    }

    void "test IntegrationTest_011_groovy"() {
        unzipAndTest("scripts/IntegrationTest_011.groovy", [])
    }

    void "test IntegrationTest_012_groovy"() {
        unzipAndTest("scripts/IntegrationTest_012.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_001_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_001.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_002_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_002.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_003_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_003.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_004_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_004.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_005_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_005.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_006_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_006.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_007_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_007.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_008_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_008.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_009_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_009.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_010_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_010.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_011_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_011.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_012_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_012.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_013_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_013.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_014_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_014.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_015_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_015.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_016_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_016.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_017_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_017.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_018_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_018.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_019_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_019.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_020_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_020.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_021_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_021.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_022_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_022.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_023_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_023.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_024_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_024.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_025_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_025.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_026_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_026.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_027_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_027.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_028_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_028.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_029_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_029.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_030_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_030.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_031_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_031.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_032_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_032.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_033_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_033.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_034_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_034.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_035_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_035.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_036_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_036.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_037_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_037.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_038_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_038.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_039_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_039.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_040_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_040.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_041_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_041.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_042_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_042.groovy", [])
    }

    void "test IOGMClosureParamTypeInferenceSTCTest_043_groovy"() {
        unzipAndTest("scripts/IOGMClosureParamTypeInferenceSTCTest_043.groovy", [])
    }

    void "test JsonBuilderTest_001_groovy"() {
        unzipAndTest("scripts/JsonBuilderTest_001.groovy", [])
    }

    void "test JsonTest_001_groovy"() {
        unzipAndTest("scripts/JsonTest_001.groovy", [])
    }

    void "test LazyTransformTest_001_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_001.groovy", [])
    }

    void "test LazyTransformTest_002_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_002.groovy", [])
    }

    void "test LazyTransformTest_003_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_003.groovy", [])
    }

    void "test LazyTransformTest_004_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_004.groovy", [])
    }

    void "test LazyTransformTest_005_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_005.groovy", [])
    }

    void "test LazyTransformTest_006_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_006.groovy", [])
    }

    void "test LazyTransformTest_007_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_007.groovy", [])
    }

    void "test LazyTransformTest_008_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_008.groovy", [])
    }

    void "test LazyTransformTest_009_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_009.groovy", [])
    }

    void "test LazyTransformTest_010_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_010.groovy", [])
    }

    void "test LazyTransformTest_011_groovy"() {
        unzipAndTest("scripts/LazyTransformTest_011.groovy", [])
    }

    void "test ListenerListASTTest_001_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_001.groovy", [])
    }

    void "test ListenerListASTTest_002_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_002.groovy", [])
    }

    void "test ListenerListASTTest_003_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_003.groovy", [])
    }

    void "test ListenerListASTTest_004_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_004.groovy", [])
    }

    void "test ListenerListASTTest_005_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_005.groovy", [])
    }

    void "test ListenerListASTTest_006_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_006.groovy", [])
    }

    void "test ListenerListASTTest_007_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_007.groovy", [])
    }

    void "test ListenerListASTTest_008_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_008.groovy", [])
    }

    void "test ListenerListASTTest_009_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_009.groovy", [])
    }

    void "test ListenerListASTTest_010_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_010.groovy", [])
    }

    void "test ListenerListASTTest_011_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_011.groovy", [])
    }

    void "test ListenerListASTTest_012_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_012.groovy", [])
    }

    void "test ListenerListASTTest_013_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_013.groovy", [])
    }

    void "test ListenerListASTTest_014_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_014.groovy", [])
    }

    void "test ListenerListASTTest_015_groovy"() {
        unzipAndTest("scripts/ListenerListASTTest_015.groovy", [])
    }

    void "test LocalVariableTest_001_groovy"() {
        unzipAndTest("scripts/LocalVariableTest_001.groovy", [])
    }

    void "test LogImprovementsASTTransformsTest_001_groovy"() {
        unzipAndTest("scripts/LogImprovementsASTTransformsTest_001.groovy", [])
    }

    void "test LogImprovementsASTTransformsTest_002_groovy"() {
        unzipAndTest("scripts/LogImprovementsASTTransformsTest_002.groovy", [])
    }

    void "test LogImprovementsASTTransformsTest_003_groovy"() {
        unzipAndTest("scripts/LogImprovementsASTTransformsTest_003.groovy", [])
    }

    void "test LogImprovementsASTTransformsTest_004_groovy"() {
        unzipAndTest("scripts/LogImprovementsASTTransformsTest_004.groovy", [])
    }

    void "test LogImprovementsASTTransformsTest_005_groovy"() {
        unzipAndTest("scripts/LogImprovementsASTTransformsTest_005.groovy", [])
    }

    void "test LogImprovementsASTTransformsTest_006_groovy"() {
        unzipAndTest("scripts/LogImprovementsASTTransformsTest_006.groovy", [])
    }

    void "test LogImprovementsASTTransformsTest_007_groovy"() {
        unzipAndTest("scripts/LogImprovementsASTTransformsTest_007.groovy", [])
    }

    void "test LogImprovementsASTTransformsTest_008_groovy"() {
        unzipAndTest("scripts/LogImprovementsASTTransformsTest_008.groovy", [])
    }

    void "test LogImprovementsASTTransformsTest_009_groovy"() {
        unzipAndTest("scripts/LogImprovementsASTTransformsTest_009.groovy", [])
    }

    void "test LogImprovementsASTTransformsTest_010_groovy"() {
        unzipAndTest("scripts/LogImprovementsASTTransformsTest_010.groovy", [])
    }

    void "test LogTest_001_groovy"() {
        unzipAndTest("scripts/LogTest_001.groovy", [])
    }

    void "test LoopsSTCTest_001_groovy"() {
        unzipAndTest("scripts/LoopsSTCTest_001.groovy", [])
    }

    void "test LoopsSTCTest_002_groovy"() {
        unzipAndTest("scripts/LoopsSTCTest_002.groovy", [])
    }

    void "test LoopsSTCTest_003_groovy"() {
        unzipAndTest("scripts/LoopsSTCTest_003.groovy", [])
    }

    void "test LoopsSTCTest_004_groovy"() {
        unzipAndTest("scripts/LoopsSTCTest_004.groovy", [])
    }

    void "test LoopsSTCTest_005_groovy"() {
        unzipAndTest("scripts/LoopsSTCTest_005.groovy", [])
    }

    void "test LoopsSTCTest_006_groovy"() {
        unzipAndTest("scripts/LoopsSTCTest_006.groovy", [])
    }

    void "test MacroTest_001_groovy"() {
        unzipAndTest("scripts/MacroTest_001.groovy", [])
    }

    void "test MacroTest_002_groovy"() {
        unzipAndTest("scripts/MacroTest_002.groovy", [])
    }

    void "test MacroTest_003_groovy"() {
        unzipAndTest("scripts/MacroTest_003.groovy", [])
    }

    void "test MacroTest_004_groovy"() {
        unzipAndTest("scripts/MacroTest_004.groovy", [])
    }

    void "test MacroTest_005_groovy"() {
        unzipAndTest("scripts/MacroTest_005.groovy", [])
    }

    void "test MacroTest_006_groovy"() {
        unzipAndTest("scripts/MacroTest_006.groovy", [])
    }

    void "test MacroTest_007_groovy"() {
        unzipAndTest("scripts/MacroTest_007.groovy", [])
    }

    void "test MacroTest_008_groovy"() {
        unzipAndTest("scripts/MacroTest_008.groovy", [])
    }

    void "test MapConstructorTransformTest_001_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_001.groovy", [])
    }

    void "test MapConstructorTransformTest_002_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_002.groovy", [])
    }

    void "test MapConstructorTransformTest_003_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_003.groovy", [])
    }

    void "test MapConstructorTransformTest_004_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_004.groovy", [])
    }

    void "test MapConstructorTransformTest_005_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_005.groovy", [])
    }

    void "test MapConstructorTransformTest_006_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_006.groovy", [])
    }

    void "test MapConstructorTransformTest_007_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_007.groovy", [])
    }

    void "test MapConstructorTransformTest_008_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_008.groovy", [])
    }

    void "test MapConstructorTransformTest_009_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_009.groovy", [])
    }

    void "test MapConstructorTransformTest_010_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_010.groovy", [])
    }

    void "test MapConstructorTransformTest_011_groovy"() {
        unzipAndTest("scripts/MapConstructorTransformTest_011.groovy", [])
    }

    void "test MetaClassTest_001_groovy"() {
        unzipAndTest("scripts/MetaClassTest_001.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_001_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_001.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_002_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_002.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_003_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_003.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_004_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_004.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_005_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_005.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_006_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_006.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_007_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_007.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_008_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_008.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_009_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_009.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_010_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_010.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_011_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_011.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_012_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_012.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_013_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_013.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_014_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_014.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_015_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_015.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_016_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_016.groovy", [])
    }

    void "test MethodCallsStaticCompilationTest_017_groovy"() {
        unzipAndTest("scripts/MethodCallsStaticCompilationTest_017.groovy", [])
    }

    void "test MethodCallsSTCTest_001_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_001.groovy", [])
    }

    void "test MethodCallsSTCTest_002_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_002.groovy", [])
    }

    void "test MethodCallsSTCTest_003_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_003.groovy", [])
    }

    void "test MethodCallsSTCTest_004_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_004.groovy", [])
    }

    void "test MethodCallsSTCTest_005_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_005.groovy", [])
    }

    void "test MethodCallsSTCTest_006_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_006.groovy", [])
    }

    void "test MethodCallsSTCTest_007_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_007.groovy", [])
    }

    void "test MethodCallsSTCTest_008_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_008.groovy", [])
    }

    void "test MethodCallsSTCTest_009_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_009.groovy", [])
    }

    void "test MethodCallsSTCTest_010_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_010.groovy", [])
    }

    void "test MethodCallsSTCTest_011_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_011.groovy", [])
    }

    void "test MethodCallsSTCTest_012_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_012.groovy", [])
    }

    void "test MethodCallsSTCTest_013_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_013.groovy", [])
    }

    void "test MethodCallsSTCTest_014_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_014.groovy", [])
    }

    void "test MethodCallsSTCTest_015_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_015.groovy", [])
    }

    void "test MethodCallsSTCTest_016_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_016.groovy", [])
    }

    void "test MethodCallsSTCTest_017_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_017.groovy", [])
    }

    void "test MethodCallsSTCTest_018_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_018.groovy", [])
    }

    void "test MethodCallsSTCTest_019_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_019.groovy", [])
    }

    void "test MethodCallsSTCTest_020_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_020.groovy", [])
    }

    void "test MethodCallsSTCTest_021_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_021.groovy", [])
    }

    void "test MethodCallsSTCTest_022_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_022.groovy", [])
    }

    void "test MethodCallsSTCTest_023_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_023.groovy", [])
    }

    void "test MethodCallsSTCTest_024_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_024.groovy", [])
    }

    void "test MethodCallsSTCTest_025_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_025.groovy", [])
    }

    void "test MethodCallsSTCTest_026_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_026.groovy", [])
    }

    void "test MethodCallsSTCTest_027_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_027.groovy", [])
    }

    void "test MethodCallsSTCTest_028_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_028.groovy", [])
    }

    void "test MethodCallsSTCTest_029_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_029.groovy", [])
    }

    void "test MethodCallsSTCTest_030_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_030.groovy", [])
    }

    void "test MethodCallsSTCTest_031_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_031.groovy", [])
    }

    void "test MethodCallsSTCTest_032_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_032.groovy", [])
    }

    void "test MethodCallsSTCTest_033_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_033.groovy", [])
    }

    void "test MethodCallsSTCTest_034_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_034.groovy", [])
    }

    void "test MethodCallsSTCTest_035_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_035.groovy", [])
    }

    void "test MethodCallsSTCTest_036_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_036.groovy", [])
    }

    void "test MethodCallsSTCTest_037_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_037.groovy", [])
    }

    void "test MethodCallsSTCTest_038_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_038.groovy", [])
    }

    void "test MethodCallsSTCTest_039_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_039.groovy", [])
    }

    void "test MethodCallsSTCTest_040_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_040.groovy", [])
    }

    void "test MethodCallsSTCTest_041_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_041.groovy", [])
    }

    void "test MethodCallsSTCTest_042_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_042.groovy", [])
    }

    void "test MethodCallsSTCTest_043_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_043.groovy", [])
    }

    void "test MethodCallsSTCTest_044_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_044.groovy", [])
    }

    void "test MethodCallsSTCTest_045_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_045.groovy", [])
    }

    void "test MethodCallsSTCTest_046_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_046.groovy", [])
    }

    void "test MethodCallsSTCTest_047_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_047.groovy", [])
    }

    void "test MethodCallsSTCTest_048_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_048.groovy", [])
    }

    void "test MethodCallsSTCTest_049_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_049.groovy", [])
    }

    void "test MethodCallsSTCTest_050_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_050.groovy", [])
    }

    void "test MethodCallsSTCTest_051_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_051.groovy", [])
    }

    void "test MethodCallsSTCTest_052_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_052.groovy", [])
    }

    void "test MethodCallsSTCTest_053_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_053.groovy", [])
    }

    void "test MethodCallsSTCTest_054_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_054.groovy", [])
    }

    void "test MethodCallsSTCTest_055_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_055.groovy", [])
    }

    void "test MethodCallsSTCTest_056_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_056.groovy", [])
    }

    void "test MethodCallsSTCTest_057_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_057.groovy", [])
    }

    void "test MethodCallsSTCTest_058_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_058.groovy", [])
    }

    void "test MethodCallsSTCTest_059_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_059.groovy", [])
    }

    void "test MethodCallsSTCTest_060_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_060.groovy", [])
    }

    void "test MethodCallsSTCTest_061_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_061.groovy", [])
    }

    void "test MethodCallsSTCTest_062_groovy"() {
        unzipAndTest("scripts/MethodCallsSTCTest_062.groovy", [])
    }

    void "test MethodParameterAccessWithinClosureTest_001_groovy"() {
        unzipAndTest("scripts/MethodParameterAccessWithinClosureTest_001.groovy", [])
    }

    void "test MethodPatternsTest_001_groovy"() {
        unzipAndTest("scripts/MethodPatternsTest_001.groovy", [])
    }

    void "test MethodPropertyMissingTest_001_groovy"() {
        unzipAndTest("scripts/MethodPropertyMissingTest_001.groovy", [])
    }

    void "test MethodPropertyMissingTest_002_groovy"() {
        unzipAndTest("scripts/MethodPropertyMissingTest_002.groovy", [])
    }

    void "test MethodPropertyMissingTest_003_groovy"() {
        unzipAndTest("scripts/MethodPropertyMissingTest_003.groovy", [])
    }

    void "test MethodSelectionTest_001_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_001.groovy", [])
    }

    void "test MethodSelectionTest_002_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_002.groovy", [])
    }

    void "test MethodSelectionTest_003_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_003.groovy", [])
    }

    void "test MethodSelectionTest_004_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_004.groovy", [])
    }

    void "test MethodSelectionTest_005_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_005.groovy", [])
    }

    void "test MethodSelectionTest_006_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_006.groovy", [])
    }

    void "test MethodSelectionTest_007_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_007.groovy", [])
    }

    void "test MethodSelectionTest_008_groovy"() {
        [byte,int,short,float,double,boolean,char].each {
            unzipAndTest("scripts/MethodSelectionTest_008.groovy", [], ['$type': it as String])
        }
    }

    void "test MethodSelectionTest_009_groovy"() {
        [byte,int,short,float,double,boolean,char].each {
            unzipAndTest("scripts/MethodSelectionTest_009.groovy", [], ['$type': it as String])
        }
    }

    void "test MethodSelectionTest_010_groovy"() {
        [byte,int,short,float,double,boolean,char].each {
            unzipAndTest("scripts/MethodSelectionTest_010.groovy", [], ['$type': it as String])
        }
    }

    void "test MethodSelectionTest_011_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_011.groovy", [])
    }

    void "test MethodSelectionTest_012_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_012.groovy", [])
    }

    void "test MethodSelectionTest_013_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_013.groovy", [])
    }

    void "test MethodSelectionTest_014_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_014.groovy", [])
    }

    void "test MethodSelectionTest_015_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_015.groovy", [])
    }

    void "test MethodSelectionTest_016_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_016.groovy", [])
    }

    void "test MethodSelectionTest_017_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_017.groovy", [])
    }

    void "test MethodSelectionTest_018_groovy"() {
        ["java.util.concurrent.Callable", "Object", "Closure", "GroovyObjectSupport", "Cloneable", "Runnable", "GroovyCallable", "Serializable", "GroovyObject"].each {
            unzipAndTest("scripts/MethodSelectionTest_018.groovy", [], ['$className': it])
        }
    }

    void "test MethodSelectionTest_019_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_019.groovy", [])
    }

    void "test MethodSelectionTest_020_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_020.groovy", [])
    }

    void "test MethodSelectionTest_021_groovy"() {
        unzipAndTest("scripts/MethodSelectionTest_021.groovy", [])
    }

    void "test MethodsTest_001_groovy"() {
        unzipAndTest("scripts/MethodsTest_001.groovy", [])
    }

    void "test MethodsTest_002_groovy"() {
        unzipAndTest("scripts/MethodsTest_002.groovy", [])
    }

    void "test MethodsTest_003_groovy"() {
        unzipAndTest("scripts/MethodsTest_003.groovy", [])
    }

    void "test MethodsTest_004_groovy"() {
        unzipAndTest("scripts/MethodsTest_004.groovy", [])
    }

    void "test MethodsTest_005_groovy"() {
        unzipAndTest("scripts/MethodsTest_005.groovy", [])
    }

    void "test MethodsTest_006_groovy"() {
        unzipAndTest("scripts/MethodsTest_006.groovy", [])
    }

    void "test MethodsTest_007_groovy"() {
        unzipAndTest("scripts/MethodsTest_007.groovy", [])
    }

    void "test MethodsTest_008_groovy"() {
        unzipAndTest("scripts/MethodsTest_008.groovy", [])
    }

    void "test MethodsTest_009_groovy"() {
        unzipAndTest("scripts/MethodsTest_009.groovy", [])
    }

    void "test MethodsTest_010_groovy"() {
        unzipAndTest("scripts/MethodsTest_010.groovy", [])
    }

    void "test MiscStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/MiscStaticCompileTest_001.groovy", [])
    }

    void "test MiscSTCTest_001_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_001.groovy", [])
    }

    void "test MiscSTCTest_002_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_002.groovy", [])
    }

    void "test MiscSTCTest_003_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_003.groovy", [])
    }

    void "test MiscSTCTest_004_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_004.groovy", [])
    }

    void "test MiscSTCTest_005_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_005.groovy", [])
    }

    void "test MiscSTCTest_006_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_006.groovy", [])
    }

    void "test MiscSTCTest_007_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_007.groovy", [])
    }

    void "test MiscSTCTest_008_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_008.groovy", [])
    }

    void "test MiscSTCTest_009_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_009.groovy", [])
    }

    void "test MiscSTCTest_010_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_010.groovy", [])
    }

    void "test MiscSTCTest_011_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_011.groovy", [])
    }

    void "test MiscSTCTest_012_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_012.groovy", [])
    }

    void "test MiscSTCTest_013_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_013.groovy", [])
    }

    void "test MiscSTCTest_014_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_014.groovy", [])
    }

    void "test MiscSTCTest_015_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_015.groovy", [])
    }

    void "test MiscSTCTest_016_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_016.groovy", [])
    }

    void "test MiscSTCTest_017_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_017.groovy", [])
    }

    void "test MiscSTCTest_018_groovy"() {
        unzipAndTest("scripts/MiscSTCTest_018.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_001_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_001.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_002_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_002.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_003_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_003.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_004_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_004.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_005_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_005.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_006_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_006.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_007_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_007.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_008_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_008.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_009_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_009.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_010_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_010.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_011_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_011.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_012_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_012.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_013_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_013.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_014_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_014.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_015_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_015.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_016_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_016.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_017_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_017.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_018_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_018.groovy", [])
    }

    void "test MixedModeStaticCompilationTest_019_groovy"() {
        unzipAndTest("scripts/MixedModeStaticCompilationTest_019.groovy", [])
    }

    void "test MixinAnnotationTest_001_groovy"() {
        unzipAndTest("scripts/MixinAnnotationTest_001.groovy", [])
    }

    void "test MixinAnnotationTest_002_groovy"() {
        unzipAndTest("scripts/MixinAnnotationTest_002.groovy", [])
    }

    void "test MixinTest_001_groovy"() {
        unzipAndTest("scripts/MixinTest_001.groovy", [])
    }

    void "test MixinTest_002_groovy"() {
        unzipAndTest("scripts/MixinTest_002.groovy", [])
    }

    void "test MultipleAssignmentDeclarationTest_001_groovy"() {
        unzipAndTest("scripts/MultipleAssignmentDeclarationTest_001.groovy", [])
    }

    void "test MultipleAssignmentDeclarationTest_002_groovy"() {
        unzipAndTest("scripts/MultipleAssignmentDeclarationTest_002.groovy", [])
    }

    void "test MultipleAssignmentDeclarationTest_003_groovy"() {
        unzipAndTest("scripts/MultipleAssignmentDeclarationTest_003.groovy", [])
    }

    void "test MultipleAssignmentDeclarationTest_004_groovy"() {
        unzipAndTest("scripts/MultipleAssignmentDeclarationTest_004.groovy", [])
    }

    void "test MultipleAssignmentDeclarationTest_005_groovy"() {
        unzipAndTest("scripts/MultipleAssignmentDeclarationTest_005.groovy", [])
    }

    void "test MultipleDefinitionOfSameVariableTest_001_groovy"() {
        unzipAndTest("scripts/MultipleDefinitionOfSameVariableTest_001.groovy", [])
    }

    void "test MultipleDefinitionOfSameVariableTest_002_groovy"() {
        unzipAndTest("scripts/MultipleDefinitionOfSameVariableTest_002.groovy", [])
    }

    void "test MultipleDefinitionOfSameVariableTest_003_groovy"() {
        unzipAndTest("scripts/MultipleDefinitionOfSameVariableTest_003.groovy", [])
    }

    void "test NameResolvingTest_001_groovy"() {
        unzipAndTest("scripts/NameResolvingTest_001.groovy", [])
    }

    void "test NameResolvingTest_002_groovy"() {
        unzipAndTest("scripts/NameResolvingTest_002.groovy", [])
    }

    void "test NestedClosure2Bug_001_groovy"() {
        unzipAndTest("scripts/NestedClosure2Bug_001.groovy", [])
    }

    void "test NewifyTransformTest_001_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_001.groovy", [])
    }

    void "test NewifyTransformTest_002_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_002.groovy", [])
    }

    void "test NewifyTransformTest_003_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_003.groovy", [])
    }

    void "test NewifyTransformTest_004_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_004.groovy", [])
    }

    void "test NewifyTransformTest_005_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_005.groovy", [])
    }

    void "test NewifyTransformTest_006_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_006.groovy", [])
    }

    void "test NewifyTransformTest_007_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_007.groovy", [])
    }

    void "test NewifyTransformTest_008_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_008.groovy", [])
    }

    void "test NewifyTransformTest_009_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_009.groovy", [])
    }

    void "test NewifyTransformTest_010_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_010.groovy", [])
    }

    void "test NewifyTransformTest_011_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_011.groovy", [])
    }

    void "test NewifyTransformTest_012_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_012.groovy", [])
    }

    void "test NewifyTransformTest_013_groovy"() {
        unzipAndTest("scripts/NewifyTransformTest_013.groovy", [])
    }

    void "test NotYetImplementedTransformTest_001_groovy"() {
        unzipAndTest("scripts/NotYetImplementedTransformTest_001.groovy", [])
    }

    void "test NotYetImplementedTransformTest_002_groovy"() {
        unzipAndTest("scripts/NotYetImplementedTransformTest_002.groovy", [])
    }

    void "test NotYetImplementedTransformTest_003_groovy"() {
        unzipAndTest("scripts/NotYetImplementedTransformTest_003.groovy", [])
    }

    void "test NotYetImplementedTransformTest_004_groovy"() {
        unzipAndTest("scripts/NotYetImplementedTransformTest_004.groovy", [])
    }

    void "test NotYetImplementedTransformTest_005_groovy"() {
        unzipAndTest("scripts/NotYetImplementedTransformTest_005.groovy", [])
    }

    void "test NotYetImplementedTransformTest_006_groovy"() {
        unzipAndTest("scripts/NotYetImplementedTransformTest_006.groovy", [])
    }

    void "test ObjectGraphBuilderTest_001_groovy"() {
        unzipAndTest("scripts/ObjectGraphBuilderTest_001.groovy", [])
    }

    void "test ObjectGraphBuilderTest_002_groovy"() {
        unzipAndTest("scripts/ObjectGraphBuilderTest_002.groovy", [])
    }

    void "test ObjectGraphBuilderTest_003_groovy"() {
        unzipAndTest("scripts/ObjectGraphBuilderTest_003.groovy", [])
    }

    void "test OperationsResultTypeTest_001_groovy"() {
        unzipAndTest("scripts/OperationsResultTypeTest_001.groovy", [])
    }

    void "test OperationsResultTypeTest_002_groovy"() {
        unzipAndTest("scripts/OperationsResultTypeTest_002.groovy", [])
    }

    void "test OperatorsTest_001_groovy"() {
        unzipAndTest("scripts/OperatorsTest_001.groovy", [])
    }

    void "test OperatorsTest_002_groovy"() {
        unzipAndTest("scripts/OperatorsTest_002.groovy", [])
    }

    void "test OperatorsTest_003_groovy"() {
        unzipAndTest("scripts/OperatorsTest_003.groovy", [])
    }

    void "test OperatorsTest_004_groovy"() {
        unzipAndTest("scripts/OperatorsTest_004.groovy", [])
    }

    void "test OperatorsTest_005_groovy"() {
        unzipAndTest("scripts/OperatorsTest_005.groovy", [])
    }

    void "test OperatorsTest_006_groovy"() {
        unzipAndTest("scripts/OperatorsTest_006.groovy", [])
    }

    void "test OperatorsTest_007_groovy"() {
        unzipAndTest("scripts/OperatorsTest_007.groovy", [])
    }

    void "test OperatorsTest_008_groovy"() {
        unzipAndTest("scripts/OperatorsTest_008.groovy", [])
    }

    void "test OperatorsTest_009_groovy"() {
        unzipAndTest("scripts/OperatorsTest_009.groovy", [])
    }

    void "test OperatorsTest_010_groovy"() {
        unzipAndTest("scripts/OperatorsTest_010.groovy", [])
    }

    void "test OperatorsTest_011_groovy"() {
        unzipAndTest("scripts/OperatorsTest_011.groovy", [])
    }

    void "test OperatorsTest_012_groovy"() {
        unzipAndTest("scripts/OperatorsTest_012.groovy", [])
    }

    void "test OperatorsTest_013_groovy"() {
        unzipAndTest("scripts/OperatorsTest_013.groovy", [])
    }

    void "test OperatorsTest_014_groovy"() {
        unzipAndTest("scripts/OperatorsTest_014.groovy", [])
    }

    void "test OperatorsTest_015_groovy"() {
        unzipAndTest("scripts/OperatorsTest_015.groovy", [])
    }

    void "test OperatorsTest_016_groovy"() {
        unzipAndTest("scripts/OperatorsTest_016.groovy", [])
    }

    void "test OperatorsTest_017_groovy"() {
        unzipAndTest("scripts/OperatorsTest_017.groovy", [])
    }

    void "test OperatorsTest_018_groovy"() {
        unzipAndTest("scripts/OperatorsTest_018.groovy", [])
    }

    void "test OperatorsTest_019_groovy"() {
        unzipAndTest("scripts/OperatorsTest_019.groovy", [])
    }

    void "test OptionalityTest_001_groovy"() {
        unzipAndTest("scripts/OptionalityTest_001.groovy", [])
    }

    void "test OptionalityTest_002_groovy"() {
        unzipAndTest("scripts/OptionalityTest_002.groovy", [])
    }

    void "test OptionalTypingTest_001_groovy"() {
        unzipAndTest("scripts/OptionalTypingTest_001.groovy", [])
    }

    void "test OptionalTypingTest_002_groovy"() {
        unzipAndTest("scripts/OptionalTypingTest_002.groovy", [])
    }

    void "test OptionalTypingTest_003_groovy"() {
        unzipAndTest("scripts/OptionalTypingTest_003.groovy", [])
    }

    void "test OptionalTypingTest_004_groovy"() {
        unzipAndTest("scripts/OptionalTypingTest_004.groovy", [])
    }

    void "test OptionalTypingTest_005_groovy"() {
        unzipAndTest("scripts/OptionalTypingTest_005.groovy", [])
    }

    void "test OverrideTest_001_groovy"() {
        unzipAndTest("scripts/OverrideTest_001.groovy", [])
    }

    void "test OverrideTest_002_groovy"() {
        unzipAndTest("scripts/OverrideTest_002.groovy", [])
    }

    void "test OverrideTest_003_groovy"() {
        unzipAndTest("scripts/OverrideTest_003.groovy", [])
    }

    void "test OverrideTest_004_groovy"() {
        unzipAndTest("scripts/OverrideTest_004.groovy", [])
    }

    void "test OverrideTest_005_groovy"() {
        unzipAndTest("scripts/OverrideTest_005.groovy", [])
    }

    void "test OverrideTest_006_groovy"() {
        unzipAndTest("scripts/OverrideTest_006.groovy", [])
    }

    void "test PackageAndImportAnnotationTest_001_groovy"() {
        unzipAndTest("scripts/PackageAndImportAnnotationTest_001.groovy", [])
    }

    void "test PackageHelperImpl_001_groovy"() {
        unzipAndTest("scripts/PackageHelperImpl_001.groovy", [])
    }

    void "test PackageScopeTransformTest_001_groovy"() {
        unzipAndTest("scripts/PackageScopeTransformTest_001.groovy", [])
    }

    void "test PackageTest_001_groovy"() {
        unzipAndTest("scripts/PackageTest_001.groovy", [])
    }

    void "test PackageTest_002_groovy"() {
        unzipAndTest("scripts/PackageTest_002.groovy", [])
    }

    void "test PackageTest_003_groovy"() {
        unzipAndTest("scripts/PackageTest_003.groovy", [])
    }

    void "test PackageTest_004_groovy"() {
        unzipAndTest("scripts/PackageTest_004.groovy", [])
    }

    void "test PackageTest_005_groovy"() {
        unzipAndTest("scripts/PackageTest_005.groovy", [])
    }

    void "test PackageTest_006_groovy"() {
        unzipAndTest("scripts/PackageTest_006.groovy", [])
    }

    void "test PackageTest_007_groovy"() {
        unzipAndTest("scripts/PackageTest_007.groovy", [])
    }

    void "test PackageTest_008_groovy"() {
        unzipAndTest("scripts/PackageTest_008.groovy", [])
    }

    void "test PackageTest_009_groovy"() {
        unzipAndTest("scripts/PackageTest_009.groovy", [])
    }

    void "test PackageTest_010_groovy"() {
        unzipAndTest("scripts/PackageTest_010.groovy", [])
    }

    void "test PrimitiveTest_001_groovy"() {
        unzipAndTest("scripts/PrimitiveTest_001.groovy", [])
    }

    void "test PrimitiveTest_002_groovy"() {
        unzipAndTest("scripts/PrimitiveTest_002.groovy", [])
    }

    void "test PropertyTest_001_groovy"() {
        unzipAndTest("scripts/PropertyTest_001.groovy", [])
    }

    void "test PropertyTest_002_groovy"() {
        unzipAndTest("scripts/PropertyTest_002.groovy", [])
    }

    void "test PropertyTest_003_groovy"() {
        unzipAndTest("scripts/PropertyTest_003.groovy", [])
    }

    void "test PropertyTest_004_groovy"() {
        unzipAndTest("scripts/PropertyTest_004.groovy", [])
    }

    void "test ProxyGeneratorAdapterTest_001_groovy"() {
        unzipAndTest("scripts/ProxyGeneratorAdapterTest_001.groovy", [])
    }

    void "test ProxyGeneratorAdapterTest_002_groovy"() {
        unzipAndTest("scripts/ProxyGeneratorAdapterTest_002.groovy", [])
    }

    void "test ProxyGeneratorAdapterTest_003_groovy"() {
        unzipAndTest("scripts/ProxyGeneratorAdapterTest_003.groovy", [])
    }

    void "test ProxyTest_001_groovy"() {
        unzipAndTest("scripts/ProxyTest_001.groovy", [])
    }

    void "test RangesStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/RangesStaticCompileTest_001.groovy", [])
    }

    void "test RangesStaticCompileTest_002_groovy"() {
        unzipAndTest("scripts/RangesStaticCompileTest_002.groovy", [])
    }

    void "test RangesSTCTest_001_groovy"() {
        unzipAndTest("scripts/RangesSTCTest_001.groovy", [])
    }

    void "test RangesSTCTest_002_groovy"() {
        unzipAndTest("scripts/RangesSTCTest_002.groovy", [])
    }

    void "test RangesSTCTest_003_groovy"() {
        unzipAndTest("scripts/RangesSTCTest_003.groovy", [])
    }

    void "test ReadWriteLockTransformTest_001_groovy"() {
        unzipAndTest("scripts/ReadWriteLockTransformTest_001.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_001_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_001.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_002_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_002.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_003_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_003.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_004_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_004.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_005_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_005.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_006_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_006.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_007_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_007.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_008_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_008.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_009_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_009.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_010_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_010.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_011_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_011.groovy", [], ['\'utf-8\\\'': '\'utf-8\\\'\''])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_012_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_012.groovy", [], ['\'utf-8\\\'': '\'utf-8\\\'\''])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_013_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_013.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_014_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_014.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_015_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_015.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_016_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_016.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_017_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_017.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_018_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_018.groovy", [])
    }

    void "test ResourceGMClosureParamTypeInferenceSTCTest_019_groovy"() {
        unzipAndTest("scripts/ResourceGMClosureParamTypeInferenceSTCTest_019.groovy", [])
    }

    void "test ReturnsStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/ReturnsStaticCompileTest_001.groovy", [])
    }

    void "test ReturnsSTCTest_001_groovy"() {
        unzipAndTest("scripts/ReturnsSTCTest_001.groovy", [])
    }

    void "test ReturnsSTCTest_002_groovy"() {
        unzipAndTest("scripts/ReturnsSTCTest_002.groovy", [])
    }

    void "test ReturnsSTCTest_003_groovy"() {
        unzipAndTest("scripts/ReturnsSTCTest_003.groovy", [])
    }

    void "test ReturnsSTCTest_004_groovy"() {
        unzipAndTest("scripts/ReturnsSTCTest_004.groovy", [])
    }

    void "test ReturnsSTCTest_005_groovy"() {
        unzipAndTest("scripts/ReturnsSTCTest_005.groovy", [])
    }

    void "test ReturnsSTCTest_006_groovy"() {
        unzipAndTest("scripts/ReturnsSTCTest_006.groovy", [])
    }

    void "test ReturnTest_001_groovy"() {
        unzipAndTest("scripts/ReturnTest_001.groovy", [])
    }

    void "test ReturnTest_002_groovy"() {
        unzipAndTest("scripts/ReturnTest_002.groovy", [])
    }

    void "test SaferScriptingASTTransformsTest_001_groovy"() {
        unzipAndTest("scripts/SaferScriptingASTTransformsTest_001.groovy", [])
    }

    void "test SaferScriptingASTTransformsTest_002_groovy"() {
        unzipAndTest("scripts/SaferScriptingASTTransformsTest_002.groovy", [])
    }

    void "test SaferScriptingASTTransformsTest_003_groovy"() {
        unzipAndTest("scripts/SaferScriptingASTTransformsTest_003.groovy", [])
    }

    void "test SaferScriptingASTTransformsTest_004_groovy"() {
        unzipAndTest("scripts/SaferScriptingASTTransformsTest_004.groovy", [])
    }

    void "test SaferScriptingASTTransformsTest_005_groovy"() {
        unzipAndTest("scripts/SaferScriptingASTTransformsTest_005.groovy", [])
    }

    void "test SaferScriptingASTTransformsTest_006_groovy"() {
        unzipAndTest("scripts/SaferScriptingASTTransformsTest_006.groovy", [])
    }

    void "test SaferScriptingASTTransformsTest_007_groovy"() {
        unzipAndTest("scripts/SaferScriptingASTTransformsTest_007.groovy", [])
    }

    void "test SaferScriptingASTTransformsTest_008_groovy"() {
        unzipAndTest("scripts/SaferScriptingASTTransformsTest_008.groovy", [])
    }

    void "test ScriptsAndClassesSpecTest_001_groovy"() {
        unzipAndTest("scripts/ScriptsAndClassesSpecTest_001.groovy", [])
    }

    void "test ScriptsAndClassesSpecTest_002_groovy"() {
        unzipAndTest("scripts/ScriptsAndClassesSpecTest_002.groovy", [])
    }

    void "test ScriptsAndClassesSpecTest_003_groovy"() {
        unzipAndTest("scripts/ScriptsAndClassesSpecTest_003.groovy", [])
    }

    void "test ScriptsAndClassesSpecTest_004_groovy"() {
        unzipAndTest("scripts/ScriptsAndClassesSpecTest_004.groovy", [])
    }

    void "test ScriptsAndClassesSpecTest_005_groovy"() {
        unzipAndTest("scripts/ScriptsAndClassesSpecTest_005.groovy", [])
    }

    void "test ScriptsAndClassesSpecTest_006_groovy"() {
        unzipAndTest("scripts/ScriptsAndClassesSpecTest_006.groovy", [])
    }

    void "test ScriptsAndClassesSpecTest_007_groovy"() {
        unzipAndTest("scripts/ScriptsAndClassesSpecTest_007.groovy", [])
    }

    void "test ScriptsAndClassesSpecTest_008_groovy"() {
        unzipAndTest("scripts/ScriptsAndClassesSpecTest_008.groovy", [])
    }

    void "test SecureASTCustomizerTest_001_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_001.groovy", [])
    }

    void "test SecureASTCustomizerTest_002_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_002.groovy", [])
    }

    void "test SecureASTCustomizerTest_003_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_003.groovy", [])
    }

    void "test SecureASTCustomizerTest_004_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_004.groovy", [])
    }

    void "test SecureASTCustomizerTest_005_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_005.groovy", [])
    }

    void "test SecureASTCustomizerTest_006_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_006.groovy", [])
    }

    void "test SecureASTCustomizerTest_007_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_007.groovy", [])
    }

    void "test SecureASTCustomizerTest_008_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_008.groovy", [])
    }

    void "test SecureASTCustomizerTest_009_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_009.groovy", [])
    }

    void "test SecureASTCustomizerTest_010_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_010.groovy", [])
    }

    void "test SecureASTCustomizerTest_011_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_011.groovy", [])
    }

    void "test SecureASTCustomizerTest_012_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_012.groovy", [])
    }

    void "test SecureASTCustomizerTest_013_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_013.groovy", [])
    }

    void "test SecureASTCustomizerTest_014_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_014.groovy", [])
    }

    void "test SecureASTCustomizerTest_015_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_015.groovy", [])
    }

    void "test SecureASTCustomizerTest_016_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_016.groovy", [])
    }

    void "test SecureASTCustomizerTest_017_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_017.groovy", [])
    }

    void "test SecureASTCustomizerTest_018_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_018.groovy", [])
    }

    void "test SecureASTCustomizerTest_019_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_019.groovy", [])
    }

    void "test SecureASTCustomizerTest_020_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_020.groovy", [])
    }

    void "test SecureASTCustomizerTest_021_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_021.groovy", [])
    }

    void "test SecureASTCustomizerTest_022_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_022.groovy", [])
    }

    void "test SecureASTCustomizerTest_023_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_023.groovy", [])
    }

    void "test SecureASTCustomizerTest_024_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_024.groovy", [])
    }

    void "test SecureASTCustomizerTest_025_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_025.groovy", [])
    }

    void "test SecureASTCustomizerTest_026_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_026.groovy", [])
    }

    void "test SecureASTCustomizerTest_027_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_027.groovy", [])
    }

    void "test SecureASTCustomizerTest_028_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_028.groovy", [])
    }

    void "test SecureASTCustomizerTest_029_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_029.groovy", [])
    }

    void "test SecureASTCustomizerTest_030_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_030.groovy", [])
    }

    void "test SecureASTCustomizerTest_031_groovy"() {
        unzipAndTest("scripts/SecureASTCustomizerTest_031.groovy", [])
    }

    void "test SemanticsTest_001_groovy"() {
        unzipAndTest("scripts/SemanticsTest_001.groovy", [])
    }

    void "test ShellTest_001_groovy"() {
        unzipAndTest("scripts/ShellTest_001.groovy", [])
    }

    void "test ShellTest_002_groovy"() {
        unzipAndTest("scripts/ShellTest_002.groovy", [])
    }

    void "test SingletonTransformTest_001_groovy"() {
        unzipAndTest("scripts/SingletonTransformTest_001.groovy", [])
    }

    void "test SingletonTransformTest_002_groovy"() {
        unzipAndTest("scripts/SingletonTransformTest_002.groovy", [])
    }

    void "test SingletonTransformTest_003_groovy"() {
        unzipAndTest("scripts/SingletonTransformTest_003.groovy", [])
    }

    void "test SingletonTransformTest_004_groovy"() {
        unzipAndTest("scripts/SingletonTransformTest_004.groovy", [])
    }

    void "test SingletonTransformTest_005_groovy"() {
        unzipAndTest("scripts/SingletonTransformTest_005.groovy", [])
    }

    void "test SingletonTransformTest_006_groovy"() {
        unzipAndTest("scripts/SingletonTransformTest_006.groovy", [])
    }

    void "test SingletonTransformTest_007_groovy"() {
        unzipAndTest("scripts/SingletonTransformTest_007.groovy", [])
    }

    void "test Slf4jTest_001_groovy"() {
        unzipAndTest("scripts/Slf4jTest_001.groovy", [])
    }

    void "test SocketGMClosureParamTypeInferenceSTCTest_001_groovy"() {
        unzipAndTest("scripts/SocketGMClosureParamTypeInferenceSTCTest_001.groovy", [])
    }

    void "test SocketGMClosureParamTypeInferenceSTCTest_002_groovy"() {
        unzipAndTest("scripts/SocketGMClosureParamTypeInferenceSTCTest_002.groovy", [])
    }

    void "test SocketGMClosureParamTypeInferenceSTCTest_003_groovy"() {
        unzipAndTest("scripts/SocketGMClosureParamTypeInferenceSTCTest_003.groovy", [])
    }

    void "test SortableTransformTest_001_groovy"() {
        unzipAndTest("scripts/SortableTransformTest_001.groovy", [])
    }

    void "test SortableTransformTest_002_groovy"() {
        unzipAndTest("scripts/SortableTransformTest_002.groovy", [])
    }

    void "test SortableTransformTest_003_groovy"() {
        unzipAndTest("scripts/SortableTransformTest_003.groovy", [])
    }

    void "test SortableTransformTest_004_groovy"() {
        unzipAndTest("scripts/SortableTransformTest_004.groovy", [])
    }

    void "test SourceURITransformTest_001_groovy"() {
        unzipAndTest("scripts/SourceURITransformTest_001.groovy", [])
    }

    void "test SpreadMapOperatorTest_001_groovy"() {
        unzipAndTest("scripts/SpreadMapOperatorTest_001.groovy", [])
    }

    void "test SqlTest_001_groovy"() {
        unzipAndTest("scripts/SqlTest_001.groovy", [])
    }

    void "test SqlTest_002_groovy"() {
        unzipAndTest("scripts/SqlTest_002.groovy", [])
    }

    void "test SqlTest_003_groovy"() {
        unzipAndTest("scripts/SqlTest_003.groovy", [])
    }

    void "test SqlTest_004_groovy"() {
        unzipAndTest("scripts/SqlTest_004.groovy", [])
    }

    void "test SqlTest_005_groovy"() {
        unzipAndTest("scripts/SqlTest_005.groovy", [])
    }

    void "test SqlTest_006_groovy"() {
        unzipAndTest("scripts/SqlTest_006.groovy", [])
    }

    void "test SqlTest_007_groovy"() {
        unzipAndTest("scripts/SqlTest_007.groovy", [])
    }

    void "test SqlTest_008_groovy"() {
        unzipAndTest("scripts/SqlTest_008.groovy", [])
    }

    void "test SqlTest_009_groovy"() {
        unzipAndTest("scripts/SqlTest_009.groovy", [])
    }

    void "test SqlTest_010_groovy"() {
        unzipAndTest("scripts/SqlTest_010.groovy", [])
    }

    void "test SqlTest_011_groovy"() {
        unzipAndTest("scripts/SqlTest_011.groovy", [])
    }

    void "test SqlTest_012_groovy"() {
        unzipAndTest("scripts/SqlTest_012.groovy", [])
    }

    void "test SqlTest_013_groovy"() {
        unzipAndTest("scripts/SqlTest_013.groovy", [])
    }

    void "test SqlTest_014_groovy"() {
        unzipAndTest("scripts/SqlTest_014.groovy", [])
    }

    void "test SqlTest_015_groovy"() {
        unzipAndTest("scripts/SqlTest_015.groovy", [])
    }

    void "test SqlTest_016_groovy"() {
        unzipAndTest("scripts/SqlTest_016.groovy", [])
    }

    void "test SqlTest_017_groovy"() {
        unzipAndTest("scripts/SqlTest_017.groovy", [])
    }

    void "test StaticCompilationTest_001_groovy"() {
        unzipAndTest("scripts/StaticCompilationTest_001.groovy", [])
    }

    void "test StaticCompilationTest_002_groovy"() {
        unzipAndTest("scripts/StaticCompilationTest_002.groovy", [])
    }

    void "test StaticCompilationTest_003_groovy"() {
        unzipAndTest("scripts/StaticCompilationTest_003.groovy", [])
    }

    void "test StaticCompilationTest_004_groovy"() {
        unzipAndTest("scripts/StaticCompilationTest_004.groovy", [])
    }

    void "test StaticCompileCastOptimizationTest_001_groovy"() {
        unzipAndTest("scripts/StaticCompileCastOptimizationTest_001.groovy", [])
    }

    void "test StaticCompileCastOptimizationTest_002_groovy"() {
        unzipAndTest("scripts/StaticCompileCastOptimizationTest_002.groovy", [])
    }

    void "test StaticCompileCastOptimizationTest_003_groovy"() {
        unzipAndTest("scripts/StaticCompileCastOptimizationTest_003.groovy", [])
    }

    void "test StaticCompileCastOptimizationTest_004_groovy"() {
        unzipAndTest("scripts/StaticCompileCastOptimizationTest_004.groovy", [])
    }

    void "test StaticCompileCastOptimizationTest_005_groovy"() {
        unzipAndTest("scripts/StaticCompileCastOptimizationTest_005.groovy", [])
    }

    void "test StaticCompileCastOptimizationTest_006_groovy"() {
        unzipAndTest("scripts/StaticCompileCastOptimizationTest_006.groovy", [])
    }

    void "test StaticCompileClosureCallTest_001_groovy"() {
        unzipAndTest("scripts/StaticCompileClosureCallTest_001.groovy", [])
    }

    void "test StaticCompileClosureCallTest_002_groovy"() {
        unzipAndTest("scripts/StaticCompileClosureCallTest_002.groovy", [])
    }

    void "test StaticCompileClosureCallTest_003_groovy"() {
        unzipAndTest("scripts/StaticCompileClosureCallTest_003.groovy", [])
    }

    void "test StaticCompileClosureCallTest_004_groovy"() {
        unzipAndTest("scripts/StaticCompileClosureCallTest_004.groovy", [])
    }

    void "test StaticCompileClosureCallTest_005_groovy"() {
        unzipAndTest("scripts/StaticCompileClosureCallTest_005.groovy", [])
    }

    void "test StaticCompileClosureCallTest_006_groovy"() {
        unzipAndTest("scripts/StaticCompileClosureCallTest_006.groovy", [])
    }

    void "test StaticCompileClosureCallTest_007_groovy"() {
        unzipAndTest("scripts/StaticCompileClosureCallTest_007.groovy", [])
    }

    void "test StaticCompileConstructorsTest_001_groovy"() {
        unzipAndTest("scripts/StaticCompileConstructorsTest_001.groovy", [])
    }

    void "test StaticCompileDGMTest_001_groovy"() {
        unzipAndTest("scripts/StaticCompileDGMTest_001.groovy", [])
    }

    void "test StaticCompileFlowTypingTest_001_groovy"() {
        unzipAndTest("scripts/StaticCompileFlowTypingTest_001.groovy", [])
    }

    void "test StaticCompileFlowTypingTest_002_groovy"() {
        unzipAndTest("scripts/StaticCompileFlowTypingTest_002.groovy", [])
    }

    void "test StaticCompileFlowTypingTest_003_groovy"() {
        unzipAndTest("scripts/StaticCompileFlowTypingTest_003.groovy", [])
    }

    void "test StaticCompileFlowTypingTest_004_groovy"() {
        unzipAndTest("scripts/StaticCompileFlowTypingTest_004.groovy", [])
    }

    void "test StaticCompileInnerClassTest_001_groovy"() {
        unzipAndTest("scripts/StaticCompileInnerClassTest_001.groovy", [])
    }

    void "test StaticCompileMathTest_001_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_001.groovy", [])
    }

    void "test StaticCompileMathTest_002_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_002.groovy", [])
    }

    void "test StaticCompileMathTest_003_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_003.groovy", [])
    }

    void "test StaticCompileMathTest_004_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_004.groovy", [])
    }

    void "test StaticCompileMathTest_005_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_005.groovy", [])
    }

    void "test StaticCompileMathTest_006_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_006.groovy", [])
    }

    void "test StaticCompileMathTest_007_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_007.groovy", [])
    }

    void "test StaticCompileMathTest_008_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_008.groovy", [])
    }

    void "test StaticCompileMathTest_009_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_009.groovy", [])
    }

    void "test StaticCompileMathTest_010_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_010.groovy", [])
    }

    void "test StaticCompileMathTest_011_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_011.groovy", [])
    }

    void "test StaticCompileMathTest_012_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_012.groovy", [])
    }

    void "test StaticCompileMathTest_013_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_013.groovy", [])
    }

    void "test StaticCompileMathTest_014_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_014.groovy", [])
    }

    void "test StaticCompileMathTest_015_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_015.groovy", [])
    }

    void "test StaticCompileMathTest_016_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_016.groovy", [])
    }

    void "test StaticCompileMathTest_017_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_017.groovy", [])
    }

    void "test StaticCompileMathTest_018_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_018.groovy", [])
    }

    void "test StaticCompileMathTest_019_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_019.groovy", [])
    }

    void "test StaticCompileMathTest_020_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_020.groovy", [])
    }

    void "test StaticCompileMathTest_021_groovy"() {
        unzipAndTest("scripts/StaticCompileMathTest_021.groovy", [])
    }

    void "test StaticImportTest_001_groovy"() {
        unzipAndTest("scripts/StaticImportTest_001.groovy", [])
    }

    void "test StaticImportTest_002_groovy"() {
        unzipAndTest("scripts/StaticImportTest_002.groovy", [])
    }

    void "test StaticMethodInvocationTest_001_groovy"() {
        unzipAndTest("scripts/StaticMethodInvocationTest_001.groovy", [])
    }

    void "test StaticMethodInvocationTest_002_groovy"() {
        unzipAndTest("scripts/StaticMethodInvocationTest_002.groovy", [])
    }

    void "test StaticMethodInvocationTest_003_groovy"() {
        unzipAndTest("scripts/StaticMethodInvocationTest_003.groovy", [])
    }

    void "test StaticScopeTest_001_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_001.groovy", [])
    }

    void "test StaticScopeTest_002_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_002.groovy", [])
    }

    void "test StaticScopeTest_003_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_003.groovy", [])
    }

    void "test StaticScopeTest_004_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_004.groovy", [])
    }

    void "test StaticScopeTest_005_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_005.groovy", [])
    }

    void "test StaticScopeTest_006_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_006.groovy", [])
    }

    void "test StaticScopeTest_007_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_007.groovy", [])
    }

    void "test StaticScopeTest_008_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_008.groovy", [])
    }

    void "test StaticScopeTest_009_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_009.groovy", [])
    }

    void "test StaticScopeTest_010_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_010.groovy", [])
    }

    void "test StaticScopeTest_011_groovy"() {
        unzipAndTest("scripts/StaticScopeTest_011.groovy", [])
    }

    void "test StaticThisTest_001_groovy"() {
        unzipAndTest("scripts/StaticThisTest_001.groovy", [])
    }

    void "test StaxBuilderTest_001_groovy"() {
        unzipAndTest("scripts/StaxBuilderTest_001.groovy", [])
    }

    void "test STCAssignmentTest_001_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_001.groovy", [])
    }

    void "test STCAssignmentTest_002_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_002.groovy", [])
    }

    void "test STCAssignmentTest_003_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_003.groovy", [])
    }

    void "test STCAssignmentTest_004_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_004.groovy", [])
    }

    void "test STCAssignmentTest_005_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_005.groovy", [])
    }

    void "test STCAssignmentTest_006_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_006.groovy", [])
    }

    void "test STCAssignmentTest_007_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_007.groovy", [])
    }

    void "test STCAssignmentTest_008_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_008.groovy", [])
    }

    void "test STCAssignmentTest_009_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_009.groovy", [])
    }

    void "test STCAssignmentTest_010_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_010.groovy", [])
    }

    void "test STCAssignmentTest_011_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_011.groovy", [])
    }

    void "test STCAssignmentTest_012_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_012.groovy", [])
    }

    void "test STCAssignmentTest_013_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_013.groovy", [])
    }

    void "test STCAssignmentTest_014_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_014.groovy", [])
    }

    void "test STCAssignmentTest_015_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_015.groovy", [])
    }

    void "test STCAssignmentTest_016_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_016.groovy", [])
    }

    void "test STCAssignmentTest_017_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_017.groovy", [])
    }

    void "test STCAssignmentTest_018_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_018.groovy", [])
    }

    void "test STCAssignmentTest_019_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_019.groovy", [])
    }

    void "test STCAssignmentTest_020_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_020.groovy", [])
    }

    void "test STCAssignmentTest_021_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_021.groovy", [])
    }

    void "test STCAssignmentTest_022_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_022.groovy", [])
    }

    void "test STCAssignmentTest_023_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_023.groovy", [])
    }

    void "test STCAssignmentTest_024_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_024.groovy", [])
    }

    void "test STCAssignmentTest_025_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_025.groovy", [])
    }

    void "test STCAssignmentTest_026_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_026.groovy", [])
    }

    void "test STCAssignmentTest_027_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_027.groovy", [])
    }

    void "test STCAssignmentTest_028_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_028.groovy", [])
    }

    void "test STCAssignmentTest_029_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_029.groovy", [])
    }

    void "test STCAssignmentTest_030_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_030.groovy", [])
    }

    void "test STCAssignmentTest_031_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_031.groovy", [])
    }

    void "test STCAssignmentTest_032_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_032.groovy", [])
    }

    void "test STCAssignmentTest_033_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_033.groovy", [])
    }

    void "test STCAssignmentTest_034_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_034.groovy", [])
    }

    void "test STCAssignmentTest_035_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_035.groovy", [])
    }

    void "test STCAssignmentTest_036_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_036.groovy", [])
    }

    void "test STCAssignmentTest_037_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_037.groovy", [])
    }

    void "test STCAssignmentTest_038_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_038.groovy", [])
    }

    void "test STCAssignmentTest_039_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_039.groovy", [])
    }

    void "test STCAssignmentTest_040_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_040.groovy", [])
    }

    void "test STCAssignmentTest_041_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_041.groovy", [])
    }

    void "test STCAssignmentTest_042_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_042.groovy", [])
    }

    void "test STCAssignmentTest_043_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_043.groovy", [])
    }

    void "test STCAssignmentTest_044_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_044.groovy", [])
    }

    void "test STCAssignmentTest_045_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_045.groovy", [])
    }

    void "test STCAssignmentTest_046_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_046.groovy", [])
    }

    void "test STCAssignmentTest_047_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_047.groovy", [])
    }

    void "test STCAssignmentTest_048_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_048.groovy", [])
    }

    void "test STCAssignmentTest_049_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_049.groovy", [])
    }

    void "test STCAssignmentTest_050_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_050.groovy", [])
    }

    void "test STCAssignmentTest_051_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_051.groovy", [])
    }

    void "test STCAssignmentTest_052_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_052.groovy", [])
    }

    void "test STCAssignmentTest_053_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_053.groovy", [])
    }

    void "test STCAssignmentTest_054_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_054.groovy", [])
    }

    void "test STCAssignmentTest_055_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_055.groovy", [])
    }

    void "test STCAssignmentTest_056_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_056.groovy", [])
    }

    void "test STCAssignmentTest_057_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_057.groovy", [])
    }

    void "test STCAssignmentTest_058_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_058.groovy", [])
    }

    void "test STCAssignmentTest_059_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_059.groovy", [])
    }

    void "test STCAssignmentTest_060_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_060.groovy", [])
    }

    void "test STCAssignmentTest_061_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_061.groovy", [])
    }

    void "test STCAssignmentTest_062_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_062.groovy", [])
    }

    void "test STCAssignmentTest_063_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_063.groovy", [])
    }

    void "test STCAssignmentTest_064_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_064.groovy", [])
    }

    void "test STCAssignmentTest_065_groovy"() {
        unzipAndTest("scripts/STCAssignmentTest_065.groovy", [])
    }

    void "test STCExtensionMethodsTest_001_groovy"() {
        unzipAndTest("scripts/STCExtensionMethodsTest_001.groovy", [])
    }

    void "test STCExtensionMethodsTest_002_groovy"() {
        unzipAndTest("scripts/STCExtensionMethodsTest_002.groovy", [])
    }

    void "test STCnAryExpressionTest_001_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_001.groovy", [])
    }

    void "test STCnAryExpressionTest_002_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_002.groovy", [])
    }

    void "test STCnAryExpressionTest_003_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_003.groovy", [])
    }

    void "test STCnAryExpressionTest_004_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_004.groovy", [])
    }

    void "test STCnAryExpressionTest_005_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_005.groovy", [])
    }

    void "test STCnAryExpressionTest_006_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_006.groovy", [])
    }

    void "test STCnAryExpressionTest_007_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_007.groovy", [])
    }

    void "test STCnAryExpressionTest_008_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_008.groovy", [])
    }

    void "test STCnAryExpressionTest_009_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_009.groovy", [])
    }

    void "test STCnAryExpressionTest_010_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_010.groovy", [])
    }

    void "test STCnAryExpressionTest_011_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_011.groovy", [])
    }

    void "test STCnAryExpressionTest_012_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_012.groovy", [])
    }

    void "test STCnAryExpressionTest_013_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_013.groovy", [])
    }

    void "test STCnAryExpressionTest_014_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_014.groovy", [])
    }

    void "test STCnAryExpressionTest_015_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_015.groovy", [])
    }

    void "test STCnAryExpressionTest_016_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_016.groovy", [])
    }

    void "test STCnAryExpressionTest_017_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_017.groovy", [])
    }

    void "test STCnAryExpressionTest_018_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_018.groovy", [])
    }

    void "test STCnAryExpressionTest_019_groovy"() {
        unzipAndTest("scripts/STCnAryExpressionTest_019.groovy", [])
    }

    void "test STCwithTransformationsTest_001_groovy"() {
        unzipAndTest("scripts/STCwithTransformationsTest_001.groovy", [])
    }

    void "test StreamingJsonBuilderTest_001_groovy"() {
        unzipAndTest("scripts/StreamingJsonBuilderTest_001.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_001_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_001.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_002_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_002.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_003_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_003.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_004_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_004.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_005_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_005.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_006_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_006.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_007_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_007.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_008_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_008.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_009_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_009.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_010_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_010.groovy", [], ['\\\'': '\\\'\''])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_011_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_011.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_012_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_012.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_013_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_013.groovy", [])
    }

    void "test StringGMClosureParamTypeInferenceSTCTest_014_groovy"() {
        unzipAndTest("scripts/StringGMClosureParamTypeInferenceSTCTest_014.groovy", [])
    }

    void "test StringSizeTest_001_groovy"() {
        unzipAndTest("scripts/StringSizeTest_001.groovy", [])
    }

    void "test StringSizeTest_002_groovy"() {
        unzipAndTest("scripts/StringSizeTest_002.groovy", [])
    }

    void "test SwingASTTransformsTest_001_groovy"() {
        unzipAndTest("scripts/SwingASTTransformsTest_001.groovy", [])
    }

    void "test SwingASTTransformsTest_002_groovy"() {
        unzipAndTest("scripts/SwingASTTransformsTest_002.groovy", [])
    }

    void "test SwingASTTransformsTest_003_groovy"() {
        unzipAndTest("scripts/SwingASTTransformsTest_003.groovy", [])
    }

    void "test SwingASTTransformsTest_004_groovy"() {
        unzipAndTest("scripts/SwingASTTransformsTest_004.groovy", [])
    }

    void "test SwingASTTransformsTest_005_groovy"() {
        unzipAndTest("scripts/SwingASTTransformsTest_005.groovy", [])
    }

    void "test SwingASTTransformsTest_006_groovy"() {
        unzipAndTest("scripts/SwingASTTransformsTest_006.groovy", [])
    }

    void "test SwingASTTransformsTest_007_groovy"() {
        unzipAndTest("scripts/SwingASTTransformsTest_007.groovy", [])
    }

    void "test SyntaxTest_001_groovy"() {
        unzipAndTest("scripts/SyntaxTest_001.groovy", [])
    }

    void "test SyntheticReturnTest_001_groovy"() {
        unzipAndTest("scripts/SyntheticReturnTest_001.groovy", [])
    }

    void "test SyntheticReturnTest_002_groovy"() {
        unzipAndTest("scripts/SyntheticReturnTest_002.groovy", [])
    }

    void "test SyntheticReturnTest_003_groovy"() {
        unzipAndTest("scripts/SyntheticReturnTest_003.groovy", [])
    }

    void "test SyntheticReturnTest_004_groovy"() {
        unzipAndTest("scripts/SyntheticReturnTest_004.groovy", [])
    }

    void "test SyntheticReturnTest_005_groovy"() {
        unzipAndTest("scripts/SyntheticReturnTest_005.groovy", [])
    }

    void "test SyntheticReturnTest_006_groovy"() {
        unzipAndTest("scripts/SyntheticReturnTest_006.groovy", [])
    }

    void "test SyntheticReturnTest_007_groovy"() {
        unzipAndTest("scripts/SyntheticReturnTest_007.groovy", [])
    }

    void "test SyntheticReturnTest_008_groovy"() {
        unzipAndTest("scripts/SyntheticReturnTest_008.groovy", [])
    }

    void "test SyntheticReturnTest_009_groovy"() {
        unzipAndTest("scripts/SyntheticReturnTest_009.groovy", [])
    }

    void "test SyntheticReturnTest_010_groovy"() {
        unzipAndTest("scripts/SyntheticReturnTest_010.groovy", [])
    }

    void "test TailRecursiveCompilationFailuresTest_001_groovy"() {
        unzipAndTest("scripts/TailRecursiveCompilationFailuresTest_001.groovy", [])
    }

    void "test TailRecursiveCompilationFailuresTest_002_groovy"() {
        unzipAndTest("scripts/TailRecursiveCompilationFailuresTest_002.groovy", [])
    }

    void "test TailRecursiveCompilationFailuresTest_003_groovy"() {
        unzipAndTest("scripts/TailRecursiveCompilationFailuresTest_003.groovy", [])
    }

    void "test TailRecursiveCompilationFailuresTest_004_groovy"() {
        unzipAndTest("scripts/TailRecursiveCompilationFailuresTest_004.groovy", [])
    }

    void "test TailRecursiveCompilationFailuresTest_005_groovy"() {
        unzipAndTest("scripts/TailRecursiveCompilationFailuresTest_005.groovy", [])
    }

    void "test TailRecursiveTogetherWithOtherASTsTest_001_groovy"() {
        unzipAndTest("scripts/TailRecursiveTogetherWithOtherASTsTest_001.groovy", [])
    }

    void "test TailRecursiveTogetherWithOtherASTsTest_002_groovy"() {
        unzipAndTest("scripts/TailRecursiveTogetherWithOtherASTsTest_002.groovy", [])
    }

    void "test TailRecursiveTogetherWithOtherASTsTest_003_groovy"() {
        unzipAndTest("scripts/TailRecursiveTogetherWithOtherASTsTest_003.groovy", [])
    }

    void "test TailRecursiveTogetherWithOtherASTsTest_004_groovy"() {
        unzipAndTest("scripts/TailRecursiveTogetherWithOtherASTsTest_004.groovy", [])
    }

    void "test TailRecursiveTogetherWithOtherASTsTest_005_groovy"() {
        unzipAndTest("scripts/TailRecursiveTogetherWithOtherASTsTest_005.groovy", [])
    }

    void "test TailRecursiveTransformationTest_001_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_001.groovy", [])
    }

    void "test TailRecursiveTransformationTest_002_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_002.groovy", [])
    }

    void "test TailRecursiveTransformationTest_003_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_003.groovy", [])
    }

    void "test TailRecursiveTransformationTest_004_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_004.groovy", [])
    }

    void "test TailRecursiveTransformationTest_005_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_005.groovy", [])
    }

    void "test TailRecursiveTransformationTest_006_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_006.groovy", [])
    }

    void "test TailRecursiveTransformationTest_007_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_007.groovy", [])
    }

    void "test TailRecursiveTransformationTest_008_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_008.groovy", [])
    }

    void "test TailRecursiveTransformationTest_009_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_009.groovy", [])
    }

    void "test TailRecursiveTransformationTest_010_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_010.groovy", [])
    }

    void "test TailRecursiveTransformationTest_011_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_011.groovy", [])
    }

    void "test TailRecursiveTransformationTest_012_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_012.groovy", [])
    }

    void "test TailRecursiveTransformationTest_013_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_013.groovy", [])
    }

    void "test TailRecursiveTransformationTest_014_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_014.groovy", [])
    }

    void "test TailRecursiveTransformationTest_015_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_015.groovy", [])
    }

    void "test TailRecursiveTransformationTest_016_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_016.groovy", [])
    }

    void "test TailRecursiveTransformationTest_017_groovy"() {
        unzipAndTest("scripts/TailRecursiveTransformationTest_017.groovy", [])
    }

    void "test TernaryOperatorSTCTest_001_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_001.groovy", [])
    }

    void "test TernaryOperatorSTCTest_002_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_002.groovy", [])
    }

    void "test TernaryOperatorSTCTest_003_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_003.groovy", [])
    }

    void "test TernaryOperatorSTCTest_004_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_004.groovy", [])
    }

    void "test TernaryOperatorSTCTest_005_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_005.groovy", [])
    }

    void "test TernaryOperatorSTCTest_006_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_006.groovy", [])
    }

    void "test TernaryOperatorSTCTest_007_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_007.groovy", [])
    }

    void "test TernaryOperatorSTCTest_008_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_008.groovy", [])
    }

    void "test TernaryOperatorSTCTest_009_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_009.groovy", [])
    }

    void "test TernaryOperatorSTCTest_010_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_010.groovy", [])
    }

    void "test TernaryOperatorSTCTest_011_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_011.groovy", [])
    }

    void "test TernaryOperatorSTCTest_012_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_012.groovy", [])
    }

    void "test TernaryOperatorSTCTest_013_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_013.groovy", [])
    }

    void "test TernaryOperatorSTCTest_014_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_014.groovy", [])
    }

    void "test TernaryOperatorSTCTest_015_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_015.groovy", [])
    }

    void "test TernaryOperatorSTCTest_016_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_016.groovy", [])
    }

    void "test TernaryOperatorSTCTest_017_groovy"() {
        unzipAndTest("scripts/TernaryOperatorSTCTest_017.groovy", [])
    }

    void "test TernaryOperatorTest_001_groovy"() {
        unzipAndTest("scripts/TernaryOperatorTest_001.groovy", [])
    }

    void "test TestingASTTransformsTest_001_groovy"() {
        unzipAndTest("scripts/TestingASTTransformsTest_001.groovy", [])
    }

    void "test TestingASTTransformsTest_002_groovy"() {
        unzipAndTest("scripts/TestingASTTransformsTest_002.groovy", [])
    }

    void "test TestingASTTransformsTest_003_groovy"() {
        unzipAndTest("scripts/TestingASTTransformsTest_003.groovy", [])
    }

    void "test TestingASTTransformsTest_004_groovy"() {
        unzipAndTest("scripts/TestingASTTransformsTest_004.groovy", [])
    }

    void "test TestingASTTransformsTest_005_groovy"() {
        unzipAndTest("scripts/TestingASTTransformsTest_005.groovy", [])
    }

    void "test TestingASTTransformsTest_006_groovy"() {
        unzipAndTest("scripts/TestingASTTransformsTest_006.groovy", [])
    }

    void "test TheGroovyTruthTest_001_groovy"() {
        unzipAndTest("scripts/TheGroovyTruthTest_001.groovy", [])
    }

    void "test ToStringTransformTest_001_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_001.groovy", [])
    }

    void "test ToStringTransformTest_002_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_002.groovy", [])
    }

    void "test ToStringTransformTest_003_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_003.groovy", [])
    }

    void "test ToStringTransformTest_004_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_004.groovy", [])
    }

    void "test ToStringTransformTest_005_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_005.groovy", [])
    }

    void "test ToStringTransformTest_006_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_006.groovy", [])
    }

    void "test ToStringTransformTest_007_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_007.groovy", [])
    }

    void "test ToStringTransformTest_008_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_008.groovy", [])
    }

    void "test ToStringTransformTest_009_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_009.groovy", [])
    }

    void "test ToStringTransformTest_010_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_010.groovy", [])
    }

    void "test ToStringTransformTest_011_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_011.groovy", [])
    }

    void "test ToStringTransformTest_012_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_012.groovy", [])
    }

    void "test ToStringTransformTest_013_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_013.groovy", [], ['\\$' : '$'])
    }

    void "test ToStringTransformTest_014_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_014.groovy", [])
    }

    void "test ToStringTransformTest_015_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_015.groovy", [])
    }

    void "test ToStringTransformTest_016_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_016.groovy", [])
    }

    void "test ToStringTransformTest_017_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_017.groovy", [])
    }

    void "test ToStringTransformTest_018_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_018.groovy", [])
    }

    void "test ToStringTransformTest_019_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_019.groovy", [])
    }

    void "test ToStringTransformTest_020_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_020.groovy", [])
    }

    void "test ToStringTransformTest_021_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_021.groovy", [])
    }

    void "test ToStringTransformTest_022_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_022.groovy", [])
    }

    void "test ToStringTransformTest_023_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_023.groovy", [])
    }

    void "test ToStringTransformTest_024_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_024.groovy", [])
    }

    void "test ToStringTransformTest_025_groovy"() {
        unzipAndTest("scripts/ToStringTransformTest_025.groovy", [])
    }

    void "test TraitASTTransformationTest_001_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_001.groovy", [])
    }

    void "test TraitASTTransformationTest_002_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_002.groovy", [])
    }

    void "test TraitASTTransformationTest_003_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_003.groovy", [])
    }

    void "test TraitASTTransformationTest_004_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_004.groovy", [])
    }

    void "test TraitASTTransformationTest_005_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_005.groovy", [])
    }

    void "test TraitASTTransformationTest_006_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_006.groovy", [])
    }

    void "test TraitASTTransformationTest_007_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_007.groovy", [])
    }

    void "test TraitASTTransformationTest_008_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_008.groovy", [])
    }

    void "test TraitASTTransformationTest_009_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_009.groovy", [])
    }

    void "test TraitASTTransformationTest_010_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_010.groovy", [])
    }

    void "test TraitASTTransformationTest_011_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_011.groovy", [])
    }

    void "test TraitASTTransformationTest_012_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_012.groovy", [])
    }

    void "test TraitASTTransformationTest_013_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_013.groovy", [])
    }

    void "test TraitASTTransformationTest_014_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_014.groovy", [])
    }

    void "test TraitASTTransformationTest_015_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_015.groovy", [])
    }

    void "test TraitASTTransformationTest_016_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_016.groovy", [])
    }

    void "test TraitASTTransformationTest_017_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_017.groovy", [])
    }

    void "test TraitASTTransformationTest_018_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_018.groovy", [])
    }

    void "test TraitASTTransformationTest_019_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_019.groovy", [])
    }

    void "test TraitASTTransformationTest_020_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_020.groovy", [])
    }

    void "test TraitASTTransformationTest_021_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_021.groovy", [])
    }

    void "test TraitASTTransformationTest_022_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_022.groovy", [])
    }

    void "test TraitASTTransformationTest_023_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_023.groovy", [])
    }

    void "test TraitASTTransformationTest_024_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_024.groovy", [])
    }

    void "test TraitASTTransformationTest_025_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_025.groovy", [])
    }

    void "test TraitASTTransformationTest_026_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_026.groovy", [])
    }

    void "test TraitASTTransformationTest_027_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_027.groovy", [])
    }

    void "test TraitASTTransformationTest_028_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_028.groovy", [])
    }

    void "test TraitASTTransformationTest_029_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_029.groovy", [])
    }

    void "test TraitASTTransformationTest_030_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_030.groovy", [])
    }

    void "test TraitASTTransformationTest_031_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_031.groovy", [])
    }

    void "test TraitASTTransformationTest_032_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_032.groovy", [], ['\\\'': '\\\'\''])
    }

    void "test TraitASTTransformationTest_033_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_033.groovy", [])
    }

    void "test TraitASTTransformationTest_034_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_034.groovy", [])
    }

    void "test TraitASTTransformationTest_035_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_035.groovy", [])
    }

    void "test TraitASTTransformationTest_036_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_036.groovy", [])
    }

    void "test TraitASTTransformationTest_037_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_037.groovy", [])
    }

    void "test TraitASTTransformationTest_038_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_038.groovy", [])
    }

    void "test TraitASTTransformationTest_039_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_039.groovy", [])
    }

    void "test TraitASTTransformationTest_040_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_040.groovy", [])
    }

    void "test TraitASTTransformationTest_041_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_041.groovy", [])
    }

    void "test TraitASTTransformationTest_042_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_042.groovy", [])
    }

    void "test TraitASTTransformationTest_043_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_043.groovy", [])
    }

    void "test TraitASTTransformationTest_044_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_044.groovy", [])
    }

    void "test TraitASTTransformationTest_045_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_045.groovy", [])
    }

    void "test TraitASTTransformationTest_046_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_046.groovy", [])
    }

    void "test TraitASTTransformationTest_047_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_047.groovy", [])
    }

    void "test TraitASTTransformationTest_048_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_048.groovy", [])
    }

    void "test TraitASTTransformationTest_049_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_049.groovy", [], ['S3\\': 'S3\''])
    }

    void "test TraitASTTransformationTest_050_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_050.groovy", [])
    }

    void "test TraitASTTransformationTest_051_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_051.groovy", [])
    }

    void "test TraitASTTransformationTest_052_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_052.groovy", [])
    }

    void "test TraitASTTransformationTest_053_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_053.groovy", [])
    }

    void "test TraitASTTransformationTest_054_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_054.groovy", [])
    }

    void "test TraitASTTransformationTest_055_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_055.groovy", [])
    }

    void "test TraitASTTransformationTest_056_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_056.groovy", [])
    }

    void "test TraitASTTransformationTest_057_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_057.groovy", [])
    }

    void "test TraitASTTransformationTest_058_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_058.groovy", [])
    }

    void "test TraitASTTransformationTest_059_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_059.groovy", [])
    }

    void "test TraitASTTransformationTest_060_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_060.groovy", [])
    }

    void "test TraitASTTransformationTest_061_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_061.groovy", [])
    }

    void "test TraitASTTransformationTest_062_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_062.groovy", [])
    }

    void "test TraitASTTransformationTest_063_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_063.groovy", [])
    }

    void "test TraitASTTransformationTest_064_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_064.groovy", [])
    }

    void "test TraitASTTransformationTest_065_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_065.groovy", [])
    }

    void "test TraitASTTransformationTest_066_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_066.groovy", [])
    }

    void "test TraitASTTransformationTest_067_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_067.groovy", [])
    }

    void "test TraitASTTransformationTest_068_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_068.groovy", [])
    }

    void "test TraitASTTransformationTest_069_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_069.groovy", [])
    }

    void "test TraitASTTransformationTest_070_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_070.groovy", [])
    }

    void "test TraitASTTransformationTest_071_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_071.groovy", [])
    }

    void "test TraitASTTransformationTest_072_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_072.groovy", [])
    }

    void "test TraitASTTransformationTest_073_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_073.groovy", [])
    }

    void "test TraitASTTransformationTest_074_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_074.groovy", [])
    }

    void "test TraitASTTransformationTest_075_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_075.groovy", [])
    }

    void "test TraitASTTransformationTest_076_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_076.groovy", [])
    }

    void "test TraitASTTransformationTest_077_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_077.groovy", [])
    }

    void "test TraitASTTransformationTest_078_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_078.groovy", [])
    }

    void "test TraitASTTransformationTest_079_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_079.groovy", [])
    }

    void "test TraitASTTransformationTest_080_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_080.groovy", [])
    }

    void "test TraitASTTransformationTest_081_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_081.groovy", [])
    }

    void "test TraitASTTransformationTest_082_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_082.groovy", [], ['\\': '\''])
    }

    void "test TraitASTTransformationTest_083_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_083.groovy", [])
    }

    void "test TraitASTTransformationTest_084_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_084.groovy", [])
    }

    void "test TraitASTTransformationTest_085_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_085.groovy", [])
    }

    void "test TraitASTTransformationTest_086_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_086.groovy", [])
    }

    void "test TraitASTTransformationTest_087_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_087.groovy", [])
    }

    void "test TraitASTTransformationTest_088_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_088.groovy", [])
    }

    void "test TraitASTTransformationTest_089_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_089.groovy", [])
    }

    void "test TraitASTTransformationTest_090_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_090.groovy", [])
    }

    void "test TraitASTTransformationTest_091_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_091.groovy", [])
    }

    void "test TraitASTTransformationTest_092_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_092.groovy", [])
    }

    void "test TraitASTTransformationTest_093_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_093.groovy", [])
    }

    void "test TraitASTTransformationTest_094_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_094.groovy", [])
    }

    void "test TraitASTTransformationTest_095_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_095.groovy", [])
    }

    void "test TraitASTTransformationTest_096_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_096.groovy", [])
    }

    void "test TraitASTTransformationTest_097_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_097.groovy", [])
    }

    void "test TraitASTTransformationTest_098_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_098.groovy", [])
    }

    void "test TraitASTTransformationTest_099_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_099.groovy", [])
    }

    void "test TraitASTTransformationTest_100_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_100.groovy", [])
    }

    void "test TraitASTTransformationTest_101_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_101.groovy", [])
    }

    void "test TraitASTTransformationTest_102_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_102.groovy", [])
    }

    void "test TraitASTTransformationTest_103_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_103.groovy", [])
    }

    void "test TraitASTTransformationTest_104_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_104.groovy", [])
    }

    void "test TraitASTTransformationTest_105_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_105.groovy", [])
    }

    void "test TraitASTTransformationTest_106_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_106.groovy", [])
    }

    void "test TraitASTTransformationTest_107_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_107.groovy", [])
    }

    void "test TraitASTTransformationTest_108_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_108.groovy", [])
    }

    void "test TraitASTTransformationTest_109_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_109.groovy", [])
    }

    void "test TraitASTTransformationTest_110_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_110.groovy", [])
    }

    void "test TraitASTTransformationTest_111_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_111.groovy", [])
    }

    void "test TraitASTTransformationTest_112_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_112.groovy", [])
    }

    void "test TraitASTTransformationTest_113_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_113.groovy", [])
    }

    void "test TraitASTTransformationTest_114_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_114.groovy", [])
    }

    void "test TraitASTTransformationTest_115_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_115.groovy", [])
    }

    void "test TraitASTTransformationTest_116_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_116.groovy", [])
    }

    void "test TraitASTTransformationTest_117_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_117.groovy", [])
    }

    void "test TraitASTTransformationTest_118_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_118.groovy", [])
    }

    void "test TraitASTTransformationTest_119_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_119.groovy", [])
    }

    void "test TraitASTTransformationTest_120_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_120.groovy", [])
    }

    void "test TraitASTTransformationTest_121_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_121.groovy", [])
    }

    void "test TraitASTTransformationTest_122_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_122.groovy", [])
    }

    void "test TraitASTTransformationTest_123_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_123.groovy", [])
    }

    void "test TraitASTTransformationTest_124_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_124.groovy", [])
    }

    void "test TraitASTTransformationTest_125_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_125.groovy", [])
    }

    void "test TraitASTTransformationTest_126_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_126.groovy", [])
    }

    void "test TraitASTTransformationTest_127_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_127.groovy", [], ['\\\'': '\''])
    }

    void "test TraitASTTransformationTest_128_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_128.groovy", [])
    }

    void "test TraitASTTransformationTest_129_groovy"() {
        unzipAndTest("scripts/TraitASTTransformationTest_129.groovy", [])
    }

    void "test TraitsSpecificationTest_001_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_001.groovy", [])
    }

    void "test TraitsSpecificationTest_002_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_002.groovy", [])
    }

    void "test TraitsSpecificationTest_003_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_003.groovy", [])
    }

    void "test TraitsSpecificationTest_004_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_004.groovy", [])
    }

    void "test TraitsSpecificationTest_005_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_005.groovy", [])
    }

    void "test TraitsSpecificationTest_006_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_006.groovy", [])
    }

    void "test TraitsSpecificationTest_007_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_007.groovy", [])
    }

    void "test TraitsSpecificationTest_008_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_008.groovy", [])
    }

    void "test TraitsSpecificationTest_009_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_009.groovy", [])
    }

    void "test TraitsSpecificationTest_010_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_010.groovy", [])
    }

    void "test TraitsSpecificationTest_011_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_011.groovy", [])
    }

    void "test TraitsSpecificationTest_012_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_012.groovy", [])
    }

    void "test TraitsSpecificationTest_013_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_013.groovy", [])
    }

    void "test TraitsSpecificationTest_014_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_014.groovy", [])
    }

    void "test TraitsSpecificationTest_015_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_015.groovy", [])
    }

    void "test TraitsSpecificationTest_016_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_016.groovy", [])
    }

    void "test TraitsSpecificationTest_017_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_017.groovy", [])
    }

    void "test TraitsSpecificationTest_018_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_018.groovy", [])
    }

    void "test TraitsSpecificationTest_019_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_019.groovy", [])
    }

    void "test TraitsSpecificationTest_020_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_020.groovy", [])
    }

    void "test TraitsSpecificationTest_021_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_021.groovy", [])
    }

    void "test TraitsSpecificationTest_022_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_022.groovy", [])
    }

    void "test TraitsSpecificationTest_023_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_023.groovy", [])
    }

    void "test TraitsSpecificationTest_024_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_024.groovy", [])
    }

    void "test TraitsSpecificationTest_025_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_025.groovy", [])
    }

    void "test TraitsSpecificationTest_026_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_026.groovy", [])
    }

    void "test TraitsSpecificationTest_027_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_027.groovy", [])
    }

    void "test TraitsSpecificationTest_028_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_028.groovy", [])
    }

    void "test TraitsSpecificationTest_029_groovy"() {
        unzipAndTest("scripts/TraitsSpecificationTest_029.groovy", [])
    }

    void "test TryCatchTest_001_groovy"() {
        unzipAndTest("scripts/TryCatchTest_001.groovy", [])
    }

    void "test TupleConstructorStaticCompilationTest_001_groovy"() {
        unzipAndTest("scripts/TupleConstructorStaticCompilationTest_001.groovy", [])
    }

    void "test TupleConstructorStaticCompilationTest_002_groovy"() {
        unzipAndTest("scripts/TupleConstructorStaticCompilationTest_002.groovy", [])
    }

    void "test TupleConstructorStaticCompilationTest_003_groovy"() {
        unzipAndTest("scripts/TupleConstructorStaticCompilationTest_003.groovy", [])
    }

    void "test TupleConstructorStaticCompilationTest_004_groovy"() {
        unzipAndTest("scripts/TupleConstructorStaticCompilationTest_004.groovy", [])
    }

    void "test TupleConstructorTransformTest_001_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_001.groovy", [])
    }

    void "test TupleConstructorTransformTest_002_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_002.groovy", [])
    }

    void "test TupleConstructorTransformTest_003_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_003.groovy", [])
    }

    void "test TupleConstructorTransformTest_004_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_004.groovy", [])
    }

    void "test TupleConstructorTransformTest_005_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_005.groovy", [])
    }

    void "test TupleConstructorTransformTest_006_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_006.groovy", [])
    }

    void "test TupleConstructorTransformTest_007_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_007.groovy", [])
    }

    void "test TupleConstructorTransformTest_008_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_008.groovy", [])
    }

    void "test TupleConstructorTransformTest_009_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_009.groovy", [])
    }

    void "test TupleConstructorTransformTest_010_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_010.groovy", [])
    }

    void "test TupleConstructorTransformTest_011_groovy"() {
        unzipAndTest("scripts/TupleConstructorTransformTest_011.groovy", [])
    }

    void "test TypeCheckingExtensionSpecTest_001_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionSpecTest_001.groovy", [])
    }

    void "test TypeCheckingExtensionSpecTest_002_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionSpecTest_002.groovy", [])
    }

    void "test TypeCheckingExtensionSpecTest_003_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionSpecTest_003.groovy", [])
    }

    void "test TypeCheckingExtensionSpecTest_004_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionSpecTest_004.groovy", [])
    }

    void "test TypeCheckingExtensionSpecTest_005_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionSpecTest_005.groovy", [])
    }

    void "test TypeCheckingExtensionSpecTest_006_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionSpecTest_006.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_001_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_001.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_002_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_002.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_003_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_003.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_004_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_004.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_005_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_005.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_006_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_006.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_007_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_007.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_008_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_008.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_009_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_009.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_010_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_010.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_011_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_011.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_012_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_012.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_013_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_013.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_014_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_014.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_015_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_015.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_016_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_016.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_017_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_017.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_018_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_018.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_019_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_019.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_020_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_020.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_021_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_021.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_022_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_022.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_023_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_023.groovy", [])
    }

    void "test TypeCheckingExtensionsTest_024_groovy"() {
        unzipAndTest("scripts/TypeCheckingExtensionsTest_024.groovy", [])
    }

    void "test TypeCheckingHintsTest_001_groovy"() {
        unzipAndTest("scripts/TypeCheckingHintsTest_001.groovy", [])
    }

    void "test TypeCheckingHintsTest_002_groovy"() {
        unzipAndTest("scripts/TypeCheckingHintsTest_002.groovy", [])
    }

    void "test TypeCheckingHintsTest_003_groovy"() {
        unzipAndTest("scripts/TypeCheckingHintsTest_003.groovy", [])
    }

    void "test TypeCheckingHintsTest_004_groovy"() {
        unzipAndTest("scripts/TypeCheckingHintsTest_004.groovy", [])
    }

    void "test TypeCheckingHintsTest_005_groovy"() {
        unzipAndTest("scripts/TypeCheckingHintsTest_005.groovy", [])
    }

    void "test TypeCheckingHintsTest_006_groovy"() {
        unzipAndTest("scripts/TypeCheckingHintsTest_006.groovy", [])
    }

    void "test TypeCheckingHintsTest_007_groovy"() {
        unzipAndTest("scripts/TypeCheckingHintsTest_007.groovy", [])
    }

    void "test TypeCheckingHintsTest_008_groovy"() {
        unzipAndTest("scripts/TypeCheckingHintsTest_008.groovy", [])
    }

    void "test TypeCheckingHintsTest_009_groovy"() {
        unzipAndTest("scripts/TypeCheckingHintsTest_009.groovy", [])
    }

    void "test TypeCheckingHintsTest_010_groovy"() {
        unzipAndTest("scripts/TypeCheckingHintsTest_010.groovy", [])
    }

    void "test TypeCheckingModeStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/TypeCheckingModeStaticCompileTest_001.groovy", [])
    }

    void "test TypeCheckingModeStaticCompileTest_002_groovy"() {
        unzipAndTest("scripts/TypeCheckingModeStaticCompileTest_002.groovy", [])
    }

    void "test TypeCheckingModeTest_001_groovy"() {
        unzipAndTest("scripts/TypeCheckingModeTest_001.groovy", [])
    }

    void "test TypeCheckingModeTest_002_groovy"() {
        unzipAndTest("scripts/TypeCheckingModeTest_002.groovy", [])
    }

    void "test TypeCheckingModeTest_003_groovy"() {
        unzipAndTest("scripts/TypeCheckingModeTest_003.groovy", [])
    }

    void "test TypeCheckingModeTest_004_groovy"() {
        unzipAndTest("scripts/TypeCheckingModeTest_004.groovy", [])
    }

    void "test TypeCheckingModeTest_005_groovy"() {
        unzipAndTest("scripts/TypeCheckingModeTest_005.groovy", [])
    }

    void "test TypeCheckingModeTest_006_groovy"() {
        unzipAndTest("scripts/TypeCheckingModeTest_006.groovy", [])
    }

    void "test TypeCheckingModeTest_007_groovy"() {
        unzipAndTest("scripts/TypeCheckingModeTest_007.groovy", [])
    }

    void "test TypeCheckingTest_001_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_001.groovy", [])
    }

    void "test TypeCheckingTest_002_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_002.groovy", [])
    }

    void "test TypeCheckingTest_003_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_003.groovy", [])
    }

    void "test TypeCheckingTest_004_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_004.groovy", [])
    }

    void "test TypeCheckingTest_005_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_005.groovy", [])
    }

    void "test TypeCheckingTest_006_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_006.groovy", [])
    }

    void "test TypeCheckingTest_007_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_007.groovy", [])
    }

    void "test TypeCheckingTest_008_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_008.groovy", [])
    }

    void "test TypeCheckingTest_009_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_009.groovy", [])
    }

    void "test TypeCheckingTest_010_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_010.groovy", [])
    }

    void "test TypeCheckingTest_011_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_011.groovy", [])
    }

    void "test TypeCheckingTest_012_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_012.groovy", [])
    }

    void "test TypeCheckingTest_013_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_013.groovy", [])
    }

    void "test TypeCheckingTest_014_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_014.groovy", [])
    }

    void "test TypeCheckingTest_015_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_015.groovy", [])
    }

    void "test TypeCheckingTest_016_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_016.groovy", [])
    }

    void "test TypeCheckingTest_017_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_017.groovy", [])
    }

    void "test TypeCheckingTest_018_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_018.groovy", [])
    }

    void "test TypeCheckingTest_019_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_019.groovy", [])
    }

    void "test TypeCheckingTest_020_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_020.groovy", [])
    }

    void "test TypeCheckingTest_021_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_021.groovy", [])
    }

    void "test TypeCheckingTest_022_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_022.groovy", [])
    }

    void "test TypeCheckingTest_023_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_023.groovy", [])
    }

    void "test TypeCheckingTest_024_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_024.groovy", [])
    }

    void "test TypeCheckingTest_025_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_025.groovy", [])
    }

    void "test TypeCheckingTest_026_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_026.groovy", [])
    }

    void "test TypeCheckingTest_027_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_027.groovy", [])
    }

    void "test TypeCheckingTest_028_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_028.groovy", [])
    }

    void "test TypeCheckingTest_029_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_029.groovy", [])
    }

    void "test TypeCheckingTest_030_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_030.groovy", [])
    }

    void "test TypeCheckingTest_031_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_031.groovy", [])
    }

    void "test TypeCheckingTest_032_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_032.groovy", [])
    }

    void "test TypeCheckingTest_033_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_033.groovy", [])
    }

    void "test TypeCheckingTest_034_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_034.groovy", [])
    }

    void "test TypeCheckingTest_035_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_035.groovy", [])
    }

    void "test TypeCheckingTest_036_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_036.groovy", [])
    }

    void "test TypeCheckingTest_037_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_037.groovy", [])
    }

    void "test TypeCheckingTest_038_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_038.groovy", [])
    }

    void "test TypeCheckingTest_039_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_039.groovy", [])
    }

    void "test TypeCheckingTest_040_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_040.groovy", [])
    }

    void "test TypeCheckingTest_041_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_041.groovy", [])
    }

    void "test TypeCheckingTest_042_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_042.groovy", [])
    }

    void "test TypeCheckingTest_043_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_043.groovy", [])
    }

    void "test TypeCheckingTest_044_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_044.groovy", [])
    }

    void "test TypeCheckingTest_045_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_045.groovy", [])
    }

    void "test TypeCheckingTest_046_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_046.groovy", [])
    }

    void "test TypeCheckingTest_047_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_047.groovy", [])
    }

    void "test TypeCheckingTest_048_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_048.groovy", [])
    }

    void "test TypeCheckingTest_049_groovy"() {
        unzipAndTest("scripts/TypeCheckingTest_049.groovy", [])
    }

    void "test TypeInferenceStaticCompileTest_001_groovy"() {
        unzipAndTest("scripts/TypeInferenceStaticCompileTest_001.groovy", [])
    }

    void "test TypeInferenceStaticCompileTest_002_groovy"() {
        unzipAndTest("scripts/TypeInferenceStaticCompileTest_002.groovy", [])
    }

    void "test TypeInferenceSTCTest_001_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_001.groovy", [])
    }

    void "test TypeInferenceSTCTest_002_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_002.groovy", [])
    }

    void "test TypeInferenceSTCTest_003_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_003.groovy", [])
    }

    void "test TypeInferenceSTCTest_004_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_004.groovy", [])
    }

    void "test TypeInferenceSTCTest_005_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_005.groovy", [])
    }

    void "test TypeInferenceSTCTest_006_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_006.groovy", [])
    }

    void "test TypeInferenceSTCTest_007_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_007.groovy", [])
    }

    void "test TypeInferenceSTCTest_008_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_008.groovy", [])
    }

    void "test TypeInferenceSTCTest_009_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_009.groovy", [])
    }

    void "test TypeInferenceSTCTest_010_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_010.groovy", [])
    }

    void "test TypeInferenceSTCTest_011_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_011.groovy", [])
    }

    void "test TypeInferenceSTCTest_012_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_012.groovy", [])
    }

    void "test TypeInferenceSTCTest_013_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_013.groovy", [])
    }

    void "test TypeInferenceSTCTest_014_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_014.groovy", [])
    }

    void "test TypeInferenceSTCTest_015_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_015.groovy", [])
    }

    void "test TypeInferenceSTCTest_016_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_016.groovy", [])
    }

    void "test TypeInferenceSTCTest_017_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_017.groovy", [])
    }

    void "test TypeInferenceSTCTest_018_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_018.groovy", [])
    }

    void "test TypeInferenceSTCTest_019_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_019.groovy", [])
    }

    void "test TypeInferenceSTCTest_020_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_020.groovy", [])
    }

    void "test TypeInferenceSTCTest_021_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_021.groovy", [])
    }

    void "test TypeInferenceSTCTest_022_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_022.groovy", [])
    }

    void "test TypeInferenceSTCTest_023_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_023.groovy", [])
    }

    void "test TypeInferenceSTCTest_024_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_024.groovy", [])
    }

    void "test TypeInferenceSTCTest_025_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_025.groovy", [])
    }

    void "test TypeInferenceSTCTest_026_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_026.groovy", [])
    }

    void "test TypeInferenceSTCTest_027_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_027.groovy", [])
    }

    void "test TypeInferenceSTCTest_028_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_028.groovy", [])
    }

    void "test TypeInferenceSTCTest_029_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_029.groovy", [])
    }

    void "test TypeInferenceSTCTest_030_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_030.groovy", [])
    }

    void "test TypeInferenceSTCTest_031_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_031.groovy", [])
    }

    void "test TypeInferenceSTCTest_032_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_032.groovy", [])
    }

    void "test TypeInferenceSTCTest_033_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_033.groovy", [])
    }

    void "test TypeInferenceSTCTest_034_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_034.groovy", [])
    }

    void "test TypeInferenceSTCTest_035_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_035.groovy", [])
    }

    void "test TypeInferenceSTCTest_036_groovy"() {
        [Byte:'Integer',
         Character: 'Character',
         Short: 'Integer',
         Integer: 'Integer',
         Long: 'Long',
         Float: 'Double',
         Double: 'Double',
         BigDecimal: 'BigDecimal',
         BigInteger: 'BigInteger'
        ].each { key, value ->
            unzipAndTest("scripts/TypeInferenceSTCTest_036.groovy", [], ['$orig': key, '$dest': value])
        }
    }

    void "test TypeInferenceSTCTest_037_groovy"() {
        [Byte:'Integer',
         Character: 'Character',
         Short: 'Integer',
         Integer: 'Integer',
         Long: 'Long',
         Float: 'Double',
         Double: 'Double',
         BigDecimal: 'BigDecimal',
         BigInteger: 'BigInteger'
        ].each { key, value ->
            unzipAndTest("scripts/TypeInferenceSTCTest_037.groovy", [], ['$orig': key, '$dest': value])
        }
    }

    void "test TypeInferenceSTCTest_038_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_038.groovy", [])
    }

    void "test TypeInferenceSTCTest_039_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_039.groovy", [])
    }

    void "test TypeInferenceSTCTest_040_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_040.groovy", [])
    }

    void "test TypeInferenceSTCTest_041_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_041.groovy", [])
    }

    void "test TypeInferenceSTCTest_042_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_042.groovy", [])
    }

    void "test TypeInferenceSTCTest_043_groovy"() {
        unzipAndTest("scripts/TypeInferenceSTCTest_043.groovy", [])
    }

    void "test UnaryMinusOperatorTest_001_groovy"() {
        unzipAndTest("scripts/UnaryMinusOperatorTest_001.groovy", [])
    }

    void "test UnaryOperatorSTCTest_001_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_001.groovy", [])
    }

    void "test UnaryOperatorSTCTest_002_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_002.groovy", [])
    }

    void "test UnaryOperatorSTCTest_003_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_003.groovy", [])
    }

    void "test UnaryOperatorSTCTest_004_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_004.groovy", [])
    }

    void "test UnaryOperatorSTCTest_005_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_005.groovy", [])
    }

    void "test UnaryOperatorSTCTest_006_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_006.groovy", [])
    }

    void "test UnaryOperatorSTCTest_007_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_007.groovy", [])
    }

    void "test UnaryOperatorSTCTest_008_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_008.groovy", [])
    }

    void "test UnaryOperatorSTCTest_009_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_009.groovy", [])
    }

    void "test UnaryOperatorSTCTest_010_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_010.groovy", [])
    }

    void "test UnaryOperatorSTCTest_011_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_011.groovy", [])
    }

    void "test UnaryOperatorSTCTest_012_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_012.groovy", [])
    }

    void "test UnaryOperatorSTCTest_013_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_013.groovy", [])
    }

    void "test UnaryOperatorSTCTest_014_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_014.groovy", [])
    }

    void "test UnaryOperatorSTCTest_015_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_015.groovy", [])
    }

    void "test UnaryOperatorSTCTest_016_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_016.groovy", [])
    }

    void "test UnaryOperatorSTCTest_017_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_017.groovy", [])
    }

    void "test UnaryOperatorSTCTest_018_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_018.groovy", [])
    }

    void "test UnaryOperatorSTCTest_019_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_019.groovy", [])
    }

    void "test UnaryOperatorSTCTest_020_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_020.groovy", [])
    }

    void "test UnaryOperatorSTCTest_021_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_021.groovy", [])
    }

    void "test UnaryOperatorSTCTest_022_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_022.groovy", [])
    }

    void "test UnaryOperatorSTCTest_023_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_023.groovy", [])
    }

    void "test UnaryOperatorSTCTest_024_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_024.groovy", [])
    }

    void "test UnaryOperatorSTCTest_025_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_025.groovy", [])
    }

    void "test UnaryOperatorSTCTest_026_groovy"() {
        unzipAndTest("scripts/UnaryOperatorSTCTest_026.groovy", [])
    }

    void "test UnderscoreInNumbersTest_001_groovy"() {
        unzipAndTest("scripts/UnderscoreInNumbersTest_001.groovy", [])
    }

    void "test UnknownVariableBug_001_groovy"() {
        unzipAndTest("scripts/UnknownVariableBug_001.groovy", [])
    }

    void "test UnknownVariableBug_002_groovy"() {
        unzipAndTest("scripts/UnknownVariableBug_002.groovy", [])
    }

    void "test UserGuideMarkupBuilderTest_001_groovy"() {
        unzipAndTest("scripts/UserGuideMarkupBuilderTest_001.groovy", [])
    }

    void "test VariablePrecedence_001_groovy"() {
        unzipAndTest("scripts/VariablePrecedence_001.groovy", [])
    }

    void "test VariablePrecedence_002_groovy"() {
        unzipAndTest("scripts/VariablePrecedence_002.groovy", [])
    }

    void "test VariableScopingBug_001_groovy"() {
        unzipAndTest("scripts/VariableScopingBug_001.groovy", [])
    }

    void "test VariableScopingBug_002_groovy"() {
        unzipAndTest("scripts/VariableScopingBug_002.groovy", [])
    }

    void "test VerifyErrorBug_001_groovy"() {
        unzipAndTest("scripts/VerifyErrorBug_001.groovy", [])
    }

    void "test VerifyErrorBug_002_groovy"() {
        unzipAndTest("scripts/VerifyErrorBug_002.groovy", [])
    }

    void "test VerifyErrorBug_003_groovy"() {
        unzipAndTest("scripts/VerifyErrorBug_003.groovy", [])
    }

    void "test VerifyErrorBug_004_groovy"() {
        unzipAndTest("scripts/VerifyErrorBug_004.groovy", [])
    }

    void "test VetoableSwingTest_001_groovy"() {
        unzipAndTest("scripts/VetoableSwingTest_001.groovy", [])
    }

    void "test VetoableTest_001_groovy"() {
        unzipAndTest("scripts/VetoableTest_001.groovy", [])
    }

    void "test VetoableTest_002_groovy"() {
        unzipAndTest("scripts/VetoableTest_002.groovy", [])
    }

    void "test VetoableTest_003_groovy"() {
        unzipAndTest("scripts/VetoableTest_003.groovy", [])
    }

    void "test VetoableTest_004_groovy"() {
        unzipAndTest("scripts/VetoableTest_004.groovy", [])
    }

    void "test VetoableTest_005_groovy"() {
        unzipAndTest("scripts/VetoableTest_005.groovy", [])
    }

    void "test VetoableTest_006_groovy"() {
        unzipAndTest("scripts/VetoableTest_006.groovy", [])
    }

    void "test VetoableTest_007_groovy"() {
        unzipAndTest("scripts/VetoableTest_007.groovy", [])
    }

    void "test VetoableTest_008_groovy"() {
        unzipAndTest("scripts/VetoableTest_008.groovy", [])
    }

    void "test VetoableTest_009_groovy"() {
        unzipAndTest("scripts/VetoableTest_009.groovy", [])
    }

    void "test VetoableTest_010_groovy"() {
        unzipAndTest("scripts/VetoableTest_010.groovy", [])
    }

    void "test VetoableTest_011_groovy"() {
        unzipAndTest("scripts/VetoableTest_011.groovy", [])
    }

    void "test VetoableTest_012_groovy"() {
        unzipAndTest("scripts/VetoableTest_012.groovy", [])
    }

    void "test VetoableTest_013_groovy"() {
        unzipAndTest("scripts/VetoableTest_013.groovy", [])
    }

    void "test VetoableTest_014_groovy"() {
        unzipAndTest("scripts/VetoableTest_014.groovy", [])
    }

    void "test VetoableTest_015_groovy"() {
        unzipAndTest("scripts/VetoableTest_015.groovy", [])
    }

    void "test WithSTCTest_001_groovy"() {
        unzipAndTest("scripts/WithSTCTest_001.groovy", [])
    }

    void "test WithSTCTest_002_groovy"() {
        unzipAndTest("scripts/WithSTCTest_002.groovy", [])
    }

    void "test WorkingWithCollectionsTest_001_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_001.groovy", [])
    }

    void "test WorkingWithCollectionsTest_002_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_002.groovy", [])
    }

    void "test WorkingWithCollectionsTest_003_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_003.groovy", [])
    }

    void "test WorkingWithCollectionsTest_004_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_004.groovy", [])
    }

    void "test WorkingWithCollectionsTest_005_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_005.groovy", [])
    }

    void "test WorkingWithCollectionsTest_006_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_006.groovy", [])
    }

    void "test WorkingWithCollectionsTest_007_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_007.groovy", [])
    }

    void "test WorkingWithCollectionsTest_008_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_008.groovy", [])
    }

    void "test WorkingWithCollectionsTest_009_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_009.groovy", [])
    }

    void "test WorkingWithCollectionsTest_010_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_010.groovy", [])
    }

    void "test WorkingWithCollectionsTest_011_groovy"() {
        unzipAndTest("scripts/WorkingWithCollectionsTest_011.groovy", [])
    }

    /*************************************/
    static unzipAndTest(String entryName, List ignoreClazzList, Map<String, String> replacementsMap=[:]) {
        ignoreClazzList.addAll(TestUtils.COMMON_IGNORE_CLASS_LIST)

        TestUtils.unzipAndTest(ZIP_PATH, entryName, TestUtils.addIgnore(ignoreClazzList, ASTComparatorCategory.LOCATION_IGNORE_LIST), replacementsMap)
    }

    public static final String ZIP_PATH = "$TestUtils.RESOURCES_PATH/groovy-2.5.0/groovy-2.5.0-SNAPSHOT-20160921-allscripts.zip";
}