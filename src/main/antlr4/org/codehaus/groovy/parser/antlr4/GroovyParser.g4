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

/**
 * The Groovy grammar is based on the official grammar for Java(https://github.com/antlr/grammars-v4/blob/master/java/Java.g4)
 *
 * @author Daniel.Sun
 *
 */
parser grammar GroovyParser;

options { tokenVocab = GroovyLexer; }

// starting point for parsing a groovy file
compilationUnit
    :
        nls
        (packageDeclaration (sep | EOF))? (statement (sep | EOF))* EOF
    ;

packageDeclaration
    :   annotationsOpt PACKAGE qualifiedName
    ;

importDeclaration
    :   annotationsOpt IMPORT STATIC? qualifiedName (DOT MUL | AS Identifier)?
    ;

typeDeclaration
    :   classOrInterfaceModifier* classDeclaration
    |   classOrInterfaceModifier* enumDeclaration
    |   classOrInterfaceModifier* interfaceDeclaration
    |   classOrInterfaceModifier* annotationTypeDeclaration
    |   sep
    ;

modifier
    :   classOrInterfaceModifier
    |   (   NATIVE
        |   SYNCHRONIZED
        |   TRANSIENT
        |   VOLATILE
        |   DEF
        )
    ;

classOrInterfaceModifier
    :   annotation       // class or interface
    |   (   PUBLIC     // class or interface
        |   PROTECTED  // class or interface
        |   PRIVATE    // class or interface
        |   STATIC     // class or interface
        |   ABSTRACT   // class or interface
        |   FINAL      // class only -- does not apply to interfaces
        |   STRICTFP   // class or interface
        )
    ;

variableModifier
    :   FINAL
    |   DEF
    |   annotation
    ;

classDeclaration
    :   CLASS Identifier typeParameters?
        (EXTENDS type)?
        (IMPLEMENTS typeList)?
        classBody
    ;

typeParameters
    :   LT typeParameter (COMMA typeParameter)* GT
    ;

typeParameter
    :   Identifier (EXTENDS typeBound)?
    ;

typeBound
    :   type (BITAND type)*
    ;

enumDeclaration
    :   ENUM Identifier (IMPLEMENTS typeList)?
        LBRACE enumConstants? COMMA? enumBodyDeclarations? RBRACE
    ;

enumConstants
    :   enumConstant (COMMA enumConstant)*
    ;

enumConstant
    :   annotation* Identifier arguments? classBody?
    ;

enumBodyDeclarations
    :   SEMI classBodyDeclaration*
    ;

interfaceDeclaration
    :   INTERFACE Identifier typeParameters? (EXTENDS typeList)? interfaceBody
    ;

typeList
    :   type (COMMA type)*
    ;

classBody
    :   LBRACE classBodyDeclaration* RBRACE
    ;

interfaceBody
    :   LBRACE interfaceBodyDeclaration* RBRACE
    ;

classBodyDeclaration
    :   SEMI
    |   STATIC? block
    |   modifier* memberDeclaration
    ;

memberDeclaration
    :   methodDeclaration
    |   genericMethodDeclaration
    |   fieldDeclaration
    |   constructorDeclaration
    |   genericConstructorDeclaration
    |   interfaceDeclaration
    |   annotationTypeDeclaration
    |   classDeclaration
    |   enumDeclaration
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    :   (type|VOID) Identifier formalParameters (LBRACK RBRACK)*
        (THROWS qualifiedNameList)?
        (   methodBody
        |   SEMI
        )
    ;

genericMethodDeclaration
    :   typeParameters methodDeclaration
    ;

constructorDeclaration
    :   Identifier formalParameters (THROWS qualifiedNameList)?
        constructorBody
    ;

genericConstructorDeclaration
    :   typeParameters constructorDeclaration
    ;

fieldDeclaration
    :   type variableDeclarators SEMI
    ;

interfaceBodyDeclaration
    :   modifier* interfaceMemberDeclaration
    |   SEMI
    ;

interfaceMemberDeclaration
    :   constDeclaration
    |   interfaceMethodDeclaration
    |   genericInterfaceMethodDeclaration
    |   interfaceDeclaration
    |   annotationTypeDeclaration
    |   classDeclaration
    |   enumDeclaration
    ;

constDeclaration
    :   type constantDeclarator (COMMA constantDeclarator)* SEMI
    ;

constantDeclarator
    :   Identifier (LBRACK RBRACK)* ASSIGN variableInitializer
    ;

// see matching of [] comment in methodDeclaratorRest
interfaceMethodDeclaration
    :   (type|VOID) Identifier formalParameters (LBRACK RBRACK)*
        (THROWS qualifiedNameList)?
        SEMI
    ;

genericInterfaceMethodDeclaration
    :   typeParameters interfaceMethodDeclaration
    ;

variableDeclarators
    :   variableDeclarator (COMMA variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId (ASSIGN variableInitializer)?
    ;

variableDeclaratorId
    :   Identifier
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   LBRACE (variableInitializer (COMMA variableInitializer)* (COMMA)? )? RBRACE
    ;

enumConstantName
    :   Identifier
    ;

type
    :   classOrInterfaceType (LBRACK RBRACK)*
    |   primitiveType (LBRACK RBRACK)*
    ;

classOrInterfaceType
    :   qualifiedName typeArguments?
    ;

primitiveType
    :   BOOLEAN
    |   CHAR
    |   BYTE
    |   SHORT
    |   INT
    |   LONG
    |   FLOAT
    |   DOUBLE
    ;

typeArguments
    :   LT typeArgument (COMMA typeArgument)* GT
    ;

typeArgument
    :   type
    |   QUESTION ((EXTENDS | SUPER) type)?
    ;

qualifiedNameList
    :   qualifiedName (COMMA qualifiedName)*
    ;

formalParameters
    :   LPAREN formalParameterList? RPAREN
    ;

formalParameterList
    :   formalParameter (COMMA nls formalParameter)* (COMMA nls lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   (variableModifier nls)* type? variableDeclaratorId
    ;

lastFormalParameter
    :   (variableModifier nls)* (type ELLIPSIS)? variableDeclaratorId
    ;

methodBody
    :   block
    ;

constructorBody
    :   block
    ;

qualifiedName
    :   Identifier (DOT Identifier)*
    ;

literal
    :   IntegerLiteral                                                                      #integerLiteralAlt
    |   FloatingPointLiteral                                                                #floatingPointLiteralAlt
    |   StringLiteral                                                                       #stringLiteralAlt
    |   BooleanLiteral                                                                      #booleanLiteralAlt
    |   NullLiteral                                                                         #nullLiteralAlt
    ;


// GSTRING

gstring
    :   GStringBegin gstringValue (GStringPart  gstringValue)* GStringEnd
    ;

gstringValue
    :   gstringPath
    |   LBRACE expression? RBRACE
    |   closure
    ;

gstringPath
    :   Identifier GStringPathPart*
    ;

closure
    :   LBRACE nls (formalParameterList? nls ARROW nls)? blockStatementsOpt RBRACE
    ;

blockStatementsOpt
    :   blockStatement? (sep blockStatement)* sep?
    ;

// ANNOTATIONS

annotationsOpt
    :   (annotation nls)*
    ;

annotation
    :   AT annotationName ( LPAREN ( elementValuePairs | elementValue )? RPAREN )?
    ;

annotationName : qualifiedName ;

elementValuePairs
    :   elementValuePair (COMMA elementValuePair)*
    ;

elementValuePair
    :   Identifier ASSIGN elementValue
    ;

elementValue
    :   expression
    |   annotation
    |   elementValueArrayInitializer
    ;

elementValueArrayInitializer
    :   LBRACK (elementValue (COMMA elementValue)*)? (COMMA)? RBRACK
    ;

annotationTypeDeclaration
    :   AT INTERFACE Identifier annotationTypeBody
    ;

annotationTypeBody
    :   LBRACE (annotationTypeElementDeclaration)* RBRACE
    ;

annotationTypeElementDeclaration
    :   modifier* annotationTypeElementRest
    |   SEMI // this is not allowed by the grammar, but apparently allowed by the actual compiler
    ;

annotationTypeElementRest
    :   type annotationMethodOrConstantRest SEMI
    |   classDeclaration SEMI?
    |   interfaceDeclaration SEMI?
    |   enumDeclaration SEMI?
    |   annotationTypeDeclaration SEMI?
    ;

annotationMethodOrConstantRest
    :   annotationMethodRest
    |   annotationConstantRest
    ;

annotationMethodRest
    :   Identifier LPAREN RPAREN defaultValue?
    ;

annotationConstantRest
    :   variableDeclarators
    ;

defaultValue
    :   DEFAULT elementValue
    ;

// STATEMENTS / BLOCKS

block
    :   LBRACE blockStatement* RBRACE
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    |   typeDeclaration
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration SEMI
    ;

localVariableDeclaration
    :   variableModifier* type variableDeclarators
    ;

statement
    :   block                                                                               #blockStmtAlt
    |   ASSERT ce=expression ((COLON | COMMA) nls me=expression)?                           #assertStmtAlt
    |   IF parExpression nls tb=statement (nls ELSE nls fb=statement)?                            #ifElseStmtAlt
    |   FOR LPAREN forControl RPAREN statement                                              #forStmtAlt
    |   WHILE parExpression statement                                                       #whileStmtAlt
    |   DO statement WHILE parExpression sep                                                #doWhileStmtAlt
    |   TRY block (catchClause+ finallyBlock? | finallyBlock)                               #tryCatchStmtAlt
    |   TRY resourceSpecification block catchClause* finallyBlock?                          #tryResourceStmtAlt
    |   SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE          #switchStmtAlt
    |   SYNCHRONIZED parExpression block                                                    #synchronizedStmtAlt
    |   RETURN expression? sep                                                              #returnStmtAlt
    |   THROW expression sep                                                                #throwStmtAlt
    |   BREAK Identifier? sep                                                               #breakStmtAlt
    |   CONTINUE Identifier? sep                                                            #continueStmtAlt
    |   statementExpression                                                                 #expressionStmtAlt
    |   Identifier COLON statement                                                          #labelStmtAlt

    // Import statement.  Can be used in any scope.  Has "import x as y" also.
    |   importDeclaration                                                                   #importStmtAlt

    |   typeDeclaration                                                                     #typeStmtAlt
    |   sep                                                                                 #emptyStmtAlt
    ;

catchClause
    :   CATCH LPAREN variableModifier* catchType Identifier RPAREN block
    ;

catchType
    :   qualifiedName (BITOR qualifiedName)*
    ;

finallyBlock
    :   FINALLY block
    ;

resourceSpecification
    :   LPAREN resources SEMI? RPAREN
    ;

resources
    :   resource (SEMI resource)*
    ;

resource
    :   variableModifier* classOrInterfaceType variableDeclaratorId ASSIGN expression
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    :   switchLabel+ blockStatement+
    ;

switchLabel
    :   CASE constantExpression COLON
    |   CASE enumConstantName COLON
    |   DEFAULT COLON
    ;

forControl
    :   enhancedForControl
    |   forInit? SEMI expression? SEMI forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

enhancedForControl
    :   variableModifier* type variableDeclaratorId COLON expression
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSIONS

parExpression
    :   LPAREN expression RPAREN
    ;

expressionList
    :   expression (COMMA expression)*
    ;

statementExpression
    :   expression
    ;

constantExpression
    :   expression
    ;

expression
    :   primary                                                                             #primaryExprAlt
    |   expression DOT Identifier                                                           #accessExprAlt
    |   expression DOT THIS                                                                 #accessExprAlt
    |   expression DOT NEW nonWildcardTypeArguments? innerCreator                           #createExprAlt
    |   expression DOT SUPER superSuffix                                                    #superExprAlt
    |   expression DOT explicitGenericInvocation                                            #invokeExprAlt
    |   expression LBRACK expression RBRACK                                                 #indexExprAlt
    |   expression LPAREN expressionList? RPAREN                                            #invokeExprAlt
    |   LPAREN type RPAREN expression                                                       #castExprAlt
    |   expression (INC | DEC)                                                              #postfixExprAlt
    |   (INC | DEC) expression                                                              #prefixExprAlt
    |   op=(ADD | SUB) expression                                                           #unaryExprAlt
    |   op=(TILDE | BANG) expression                                                        #unaryExprAlt
    |   expression POWER expression                                                         #binaryExprAlt
    |   expression (MUL | DIV | MOD) expression                                             #binaryExprAlt
    |   expression (ADD | SUB) expression                                                   #binaryExprAlt
    |   expression (LT LT | GT GT GT | GT GT) expression                                    #binaryExprAlt
    |   expression (LE | GE | GT | LT) expression                                           #binaryExprAlt
    |   expression INSTANCEOF type                                                          #binaryExprAlt
    |   expression (EQUAL | NOTEQUAL) expression                                            #binaryExprAlt
    |   expression BITAND expression                                                        #binaryExprAlt
    |   expression XOR expression                                                           #binaryExprAlt
    |   expression BITOR expression                                                         #binaryExprAlt
    |   expression AND expression                                                           #binaryExprAlt
    |   expression OR expression                                                            #binaryExprAlt
    |   <assoc=right> expression QUESTION expression COLON expression                       #ternaryExprAlt
    |   <assoc=right> expression
        (   ASSIGN
        |   ADD_ASSIGN
        |   SUB_ASSIGN
        |   MUL_ASSIGN
        |   DIV_ASSIGN
        |   AND_ASSIGN
        |   OR_ASSIGN
        |   XOR_ASSIGN
        |   RSHIFT_ASSIGN
        |   URSHIFT_ASSIGN
        |   LSHIFT_ASSIGN
        |   MOD_ASSIGN
        |   POWER_ASSIGN
        )
        expression                                                                          #assignExprAlt
    ;

primary
    :   Identifier                                                                          #identifierPrmrAlt
    |   literal                                                                             #literalPrmrAlt
    |   NEW creator                                                                         #newPrmrAlt
    |   THIS                                                                                #thisPrmrAlt
    |   SUPER                                                                               #superPrmrAlt
    |   LPAREN expression RPAREN                                                            #parenPrmrAlt
    |   closure                                                                             #closurePrmrAlt
    // listOrMapConstructorExpression
    |   gstring                                                                             #gstringPrmrAlt
    |   type DOT CLASS                                                                      #classPrmrAlt
    |   VOID DOT CLASS                                                                      #classPrmrAlt
    |   nonWildcardTypeArguments (explicitGenericInvocationSuffix | THIS arguments)         #invocationPrmrAlt
    ;

creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   Identifier typeArgumentsOrDiamond? (DOT Identifier typeArgumentsOrDiamond?)*
    |   primitiveType
    ;

innerCreator
    :   Identifier nonWildcardTypeArgumentsOrDiamond? classCreatorRest
    ;

arrayCreatorRest
    :   LBRACK
        (   RBRACK (LBRACK RBRACK)* arrayInitializer
        |   expression RBRACK (LBRACK expression RBRACK)* (LBRACK RBRACK)*
        )
    ;

classCreatorRest
    :   arguments classBody?
    ;

explicitGenericInvocation
    :   nonWildcardTypeArguments explicitGenericInvocationSuffix
    ;

nonWildcardTypeArguments
    :   LT typeList GT
    ;

typeArgumentsOrDiamond
    :   LT GT
    |   typeArguments
    ;

nonWildcardTypeArgumentsOrDiamond
    :   LT GT
    |   nonWildcardTypeArguments
    ;

superSuffix
    :   arguments
    |   DOT Identifier arguments?
    ;

explicitGenericInvocationSuffix
    :   SUPER superSuffix
    |   Identifier arguments
    ;

arguments
    :   LPAREN expressionList? RPAREN
    ;

nls :   NL*
    ;

sep :   SEMI NL*
    |   NL+ (SEMI NL*)*
    ;

