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

import org.codehaus.groovy.ast.FieldNode
import org.codehaus.groovy.ast.Parameter
import org.codehaus.groovy.ast.PropertyNode
import org.codehaus.groovy.ast.stmt.AssertStatement
import org.codehaus.groovy.ast.stmt.ExpressionStatement
import org.codehaus.groovy.syntax.Token
import static org.apache.groovy.parser.antlr4.TestUtils.*;

/**
 * Some basic test cases for the new parser
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * @date    2016/08/14
 */
class GroovyParserTest extends GroovyTestCase {

    void setUp() {}

    void tearDown() {}

    void "test groovy core - Comments"() {
        doTest('core/Comments.groovy');
    }

    void "test groovy core - PackageDeclaration"() {
        doTest('core/PackageDeclaration_01.groovy');
        doTest('core/PackageDeclaration_02.groovy');
        doTest('core/PackageDeclaration_03.groovy');
        doTest('core/PackageDeclaration_04.groovy');
        doTest('core/PackageDeclaration_05.groovy');
    }

    void "test groovy core - ImportDeclaration"() {
        doTest('core/ImportDeclaration_01.groovy');
        doTest('core/ImportDeclaration_02.groovy');
        doTest('core/ImportDeclaration_03.groovy');
        doTest('core/ImportDeclaration_04.groovy');
        doTest('core/ImportDeclaration_05.groovy');
        doTest('core/ImportDeclaration_06.groovy');
        doTest('core/ImportDeclaration_07.groovy');
        doTest('core/ImportDeclaration_08.groovy');
    }

    void "test groovy core - Annotation"() {
        doTest('core/Annotation_01.groovy');
        doTest('core/Annotation_02.groovy');
        doTest('core/Annotation_03.groovy');
        doTest('core/Annotation_04.groovy');
        doTest('core/Annotation_05.groovy');
        doTest('core/Annotation_06.groovy');
        doTest('core/Annotation_07.groovy');
        doTest('core/Annotation_08.groovy');
        doTest('core/Annotation_09.groovy');
    }

    void "test groovy core - Literal"() {
        doTest('core/Literal_01.groovy');
        doTest('core/Literal_02.groovy', [ExpressionStatement]);
        doTest('core/Literal_03.groovy');
    }

    void "test groovy core - GString"() {
        doTest('core/GString_01.groovy');
        doTest('core/GString_02.groovy');
        doTest('core/GString_03.groovy');
    }

    void "test groovy core - Closure"() {
        doTest('core/Closure_01.groovy');
        doTest('core/Closure_02.groovy');
        doTest('core/Closure_03.groovy');
        doTest('core/Closure_04.groovy');
        doTest('core/Closure_05.groovy', [Parameter]);
        doTest('core/Closure_06.groovy', [Parameter]);
        doTest('core/Closure_07.groovy', [Parameter]);
        doTest('core/Closure_08.groovy', [Parameter]);
        doTest('core/Closure_09.groovy', [Parameter]);
        doTest('core/Closure_10.groovy', [Parameter]);
    }

    void "test groovy core - List"() {
        doTest('core/List_01.groovy');
    }

    void "test groovy core - Map"() {
        doTest('core/Map_01.groovy');
    }

    void "test groovy core - Expression"() {
        doTest('core/Expression_01.groovy');
        doTest('core/Expression_02.groovy');
        doTest('core/Expression_03.groovy');
        doTest('core/Expression_04.groovy');
        doTest('core/Expression_05.groovy');
        doTest('core/Expression_06.groovy');
        doTest('core/Expression_07.groovy');
        doTest('core/Expression_08.groovy');
        doTest('core/Expression_09.groovy');
        doTest('core/Expression_10.groovy');
        doTest('core/Expression_11.groovy');
        doTest('core/Expression_12.groovy');
        doTest('core/Expression_13.groovy');
        doTest('core/Expression_14.groovy');
        doTest('core/Expression_15.groovy');
        doTest('core/Expression_16.groovy', [Parameter, ExpressionStatement]);
        doTest('core/Expression_17.groovy');
        doTest('core/Expression_18.groovy');
        doTest('core/Expression_19.groovy');
    }

    void "test groovy core - Assert"() {
        doTest('core/Assert_01.groovy');
    }

    void "test groovy core - IfElse"() {
        doTest('core/IfElse_01.groovy', [AssertStatement]);
    }

    void "test groovy core - For"() {
        doTest('core/For_01.groovy', [AssertStatement]);
        doTest('core/For_02.groovy');
        doTest('core/For_03.groovy');
    }

    void "test groovy core - While"() {
        doTest('core/While_01.groovy');
    }

    void "test groovy core - TryCatch"() {
        doTest('core/TryCatch_01.groovy');
    }

    void "test groovy core - Switch"() {
        doTest('core/Switch_01.groovy');
    }

    void "test groovy core - Synchronized"() {
        doTest('core/Synchronized_01.groovy');
    }

    void "test groovy core - Return"() {
        doTest('core/Return_01.groovy');
    }

    void "test groovy core - Throw"() {
        doTest('core/Throw_01.groovy');
    }

    void "test groovy core - Label"() {
        doTest('core/Label_01.groovy');
    }

    void "test groovy core - LocalVariableDeclaration"() {
        doTest('core/LocalVariableDeclaration_01.groovy', [Token]); // [class org.codehaus.groovy.syntax.Token][startLine]:: 9 != 8
    }

    void "test groovy core - MethodDeclaration"() {
        doTest('core/MethodDeclaration_01.groovy');
        doTest('core/MethodDeclaration_02.groovy');
    }

    void "test groovy core - ClassDeclaration"() {
        doTest('core/ClassDeclaration_01.groovy');
        doTest('core/ClassDeclaration_02.groovy');
        doTest('core/ClassDeclaration_03.groovy');
        doTest('core/ClassDeclaration_04.groovy', [PropertyNode, FieldNode]);
        doTest('core/ClassDeclaration_05.groovy', [ExpressionStatement]);
        doTest('core/ClassDeclaration_06.groovy');
        doTest('core/ClassDeclaration_07.groovy');
    }

    void "test groovy core - InterfaceDeclaration"() {
        doTest('core/InterfaceDeclaration_01.groovy');
        doTest('core/InterfaceDeclaration_02.groovy');
    }

    void "test groovy core - EnumDeclaration"() {
        doTest('core/EnumDeclaration_01.groovy');
        doTest('core/EnumDeclaration_02.groovy', [ExpressionStatement]);
    }

    void "test groovy core - TraitDeclaration"() {
        doTest('core/TraitDeclaration_01.groovy');
        doTest('core/TraitDeclaration_02.groovy');
        doTest('core/TraitDeclaration_03.groovy');
        doTest('core/TraitDeclaration_04.groovy', [PropertyNode, FieldNode]);
        doTest('core/TraitDeclaration_05.groovy');
    }

    void "test groovy core - AnnotationDeclaration"() {
        doTest('core/AnnotationDeclaration_01.groovy');
    }

    void "test groovy core - Command"() {
        doTest('core/Command_01.groovy');
        doTest('core/Command_02.groovy');
        doTest('core/Command_03.groovy', [ExpressionStatement, Parameter]);
        doTest('core/Command_04.groovy', [ExpressionStatement]);
        doTest('core/Command_05.groovy');
    }
}
