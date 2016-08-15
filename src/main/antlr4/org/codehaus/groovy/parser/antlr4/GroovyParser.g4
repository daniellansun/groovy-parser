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
    :   packageDeclaration? importDeclaration* typeDeclaration* EOF
    ;

packageDeclaration
    :   annotation* PACKAGE qualifiedName SEMI
    ;

importDeclaration
    :   IMPORT STATIC? qualifiedName (DOT MUL)? SEMI
    ;

typeDeclaration
    :   classOrInterfaceModifier* classDeclaration
    |   classOrInterfaceModifier* enumDeclaration
    |   classOrInterfaceModifier* interfaceDeclaration
    |   classOrInterfaceModifier* annotationTypeDeclaration
    |   SEMI
    ;

modifier
    :   classOrInterfaceModifier
    |   (   NATIVE
        |   SYNCHRONIZED
        |   TRANSIENT
        |   VOLATILE
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
    :   Identifier (LBRACK RBRACK)*
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
    :   Identifier typeArguments? (DOT Identifier typeArguments? )*
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
    :   formalParameter (COMMA formalParameter)* (COMMA lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   variableModifier* type variableDeclaratorId
    ;

lastFormalParameter
    :   variableModifier* type ELLIPSIS variableDeclaratorId
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
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   NullLiteral
    ;

// ANNOTATIONS

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
    :   LBRACE (elementValue (COMMA elementValue)*)? (COMMA)? RBRACE
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
    :   block
    |   ASSERT expression (COLON expression)? SEMI
    |   IF parExpression statement (ELSE statement)?
    |   FOR LPAREN forControl RPAREN statement
    |   WHILE parExpression statement
    |   DO statement WHILE parExpression SEMI
    |   TRY block (catchClause+ finallyBlock? | finallyBlock)
    |   TRY resourceSpecification block catchClause* finallyBlock?
    |   SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE
    |   SYNCHRONIZED parExpression block
    |   RETURN expression? SEMI
    |   THROW expression SEMI
    |   BREAK Identifier? SEMI
    |   CONTINUE Identifier? SEMI
    |   SEMI
    |   statementExpression SEMI
    |   Identifier COLON statement
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
    :   primary
    |   expression DOT Identifier
    |   expression DOT THIS
    |   expression DOT NEW nonWildcardTypeArguments? innerCreator
    |   expression DOT SUPER superSuffix
    |   expression DOT explicitGenericInvocation
    |   expression LBRACK expression RBRACK
    |   expression LPAREN expressionList? RPAREN
    |   NEW creator
    |   LPAREN type RPAREN expression
    |   expression (INC | DEC)
    |   (ADD|SUB|INC|DEC) expression
    |   (TILDE|BANG) expression
    |   expression (MUL|DIV|MOD) expression
    |   expression (ADD|SUB) expression
    |   expression (LT LT | GT GT GT | GT GT) expression
    |   expression (LE | GE | GT | LT) expression
    |   expression INSTANCEOF type
    |   expression (EQUAL | NOTEQUAL) expression
    |   expression BITAND expression
    |   expression XOR expression
    |   expression BITOR expression
    |   expression AND expression
    |   expression OR expression
    |   expression QUESTION expression COLON expression
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
        )
        expression
    ;

primary
    :   LPAREN expression RPAREN
    |   THIS
    |   SUPER
    |   literal
    |   Identifier
    |   type DOT CLASS
    |   VOID DOT CLASS
    |   nonWildcardTypeArguments (explicitGenericInvocationSuffix | THIS arguments)
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

