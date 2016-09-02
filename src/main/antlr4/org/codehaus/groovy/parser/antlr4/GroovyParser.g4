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

options {
    tokenVocab = GroovyLexer;
    contextSuperClass = GroovyParserRuleContext;
}

@header {
    import org.codehaus.groovy.parser.antlr4.GrammarPredicates;
    import org.codehaus.groovy.GroovyBugError;
    import java.util.Map;
    import org.codehaus.groovy.util.ListHashMap;
}

@members {
    public static class GroovyParserRuleContext extends ParserRuleContext {
        private Map metaDataMap = null;

        public GroovyParserRuleContext() {}

        public GroovyParserRuleContext(ParserRuleContext parent, int invokingStateNumber) {
            super(parent, invokingStateNumber);
        }

        /**
         * Gets the node meta data.
         *
         * @param key - the meta data key
         * @return the node meta data value for this key
         */
        public <T> T getNodeMetaData(Object key) {
            if (metaDataMap == null) {
                return (T) null;
            }
            return (T) metaDataMap.get(key);
        }

        /**
         * Sets the node meta data.
         *
         * @param key - the meta data key
         * @param value - the meta data value
         * @throws GroovyBugError if key is null or there is already meta
         *                        data under that key
         */
        public void setNodeMetaData(Object key, Object value) {
            if (key==null) throw new GroovyBugError("Tried to set meta data with null key on "+this+".");
            if (metaDataMap == null) {
                metaDataMap = new ListHashMap();
            }
            Object old = metaDataMap.put(key,value);
            if (old!=null) throw new GroovyBugError("Tried to overwrite existing meta data "+this+".");
        }

        /**
         * Sets the node meta data but allows overwriting values.
         *
         * @param key   - the meta data key
         * @param value - the meta data value
         * @return the old node meta data value for this key
         * @throws GroovyBugError if key is null
         */
        public Object putNodeMetaData(Object key, Object value) {
            if (key == null) throw new GroovyBugError("Tried to set meta data with null key on " + this + ".");
            if (metaDataMap == null) {
                metaDataMap = new ListHashMap();
            }
            return metaDataMap.put(key, value);
        }
    }
}

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
    |   SEMI
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
    :   variableDeclarator (COMMA nls variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId (ASSIGN nls variableInitializer)?
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
    :   primitiveType (LBRACK RBRACK)*
    |   classOrInterfaceType (LBRACK RBRACK)*
    ;

classOrInterfaceType
    :   qualifiedClassName typeArguments?
    ;

primitiveType
    :   BuiltInPrimitiveType
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

qualifiedClassName
    :   (Identifier DOT)* upperCaseIdentifier["The first character of class name should be upper case."]
    ;

upperCaseIdentifier[String msg]
    :   id=Identifier { GrammarPredicates.isUpperCase($id) }?<fail={$msg}>
    ;

literal
    :   IntegerLiteral                                                                      #integerLiteralAlt
    |   FloatingPointLiteral                                                                #floatingPointLiteralAlt
    |   StringLiteral                                                                       #stringLiteralAlt
    |   BooleanLiteral                                                                      #booleanLiteralAlt
    |   NullLiteral                                                                         #nullLiteralAlt
//    |   classLiteral                                                                        #classLiteralAlt
    ;

/*
classLiteral
    :   VOID (DOT CLASS)?
    |   type (DOT CLASS)?
    ;
*/


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

// TODO verify the potential performance issue because rule expression contains sub-rule assignments(https://github.com/antlr/grammars-v4/issues/215)
elementValue
    :   elementValueArrayInitializer
    |   annotation
    |   expression
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
    :   LBRACE nls (blockStatement sep)* blockStatement? sep? RBRACE
    ;

blockStatement
    :   localVariableDeclaration
    |   statement
    |   typeDeclaration
    ;

localVariableDeclaration
    :   (variableModifier nls)* type variableDeclarators
    |   (variableModifier nls)+ type? variableDeclarators
    ;

statement
    :   block                                                                               #blockStmtAlt
    |   ASSERT ce=expression ((COLON | COMMA) nls me=expression)?                           #assertStmtAlt
    |   IF parExpression nls tb=statement (nls ELSE nls fb=statement)?                      #ifElseStmtAlt
    |   FOR LPAREN forControl RPAREN nls statement                                          #forStmtAlt
    |   WHILE parExpression nls statement                                                   #whileStmtAlt
//TODO    |   DO statement WHILE parExpression sep                                                #doWhileStmtAlt
    |   TRY nls block ((nls catchClause)+ (nls finallyBlock)? | nls finallyBlock)           #tryCatchStmtAlt
//TODO    |   TRY resourceSpecification block catchClause* finallyBlock?                          #tryResourceStmtAlt
    |   SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE          #switchStmtAlt
    |   SYNCHRONIZED parExpression nls block                                                #synchronizedStmtAlt
    |   RETURN expression?                                                                  #returnStmtAlt
    |   THROW expression                                                                    #throwStmtAlt
    |   BREAK Identifier?                                                                   #breakStmtAlt
    |   CONTINUE Identifier?                                                                #continueStmtAlt
    |   Identifier COLON nls statement                                                      #labelStmtAlt

    // Import statement.  Can be used in any scope.  Has "import x as y" also.
    |   importDeclaration                                                                   #importStmtAlt

    |   typeDeclaration                                                                     #typeStmtAlt
    |   localVariableDeclaration                                                            #localVariableDeclarationStmtAlt
    |   statementExpression                                                                 #expressionStmtAlt

    |   SEMI                                                                                #emptyStmtAlt
    ;

catchClause
    :   CATCH LPAREN (variableModifier nls)* catchType? Identifier RPAREN nls block
    ;

catchType
    :   qualifiedClassName (BITOR qualifiedClassName)*
    ;

finallyBlock
    :   FINALLY nls block
    ;

/* TODO
resourceSpecification
    :   LPAREN resources SEMI? RPAREN
    ;

resources
    :   resource (SEMI resource)*
    ;

resource
    :   variableModifier* classOrInterfaceType variableDeclaratorId ASSIGN expression
    ;
*/

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
    |   expression
    ;

forUpdate
    :   expression
    ;

enhancedForControl
    :   (variableModifier nls)* type? variableDeclaratorId (COLON | IN) expression
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
    :   pathExpression                                                                      #pathExprAlt

    // qualified names, array expressions, method invocation, post inc/dec (level 1)
    |   expression op=(INC | DEC)                                                           #postfixExprAlt

    // ~(BNOT)/!(LNOT)/(type casting) (level 1)
    |   (BITNOT nls | NOT nls | (LPAREN type RPAREN)) expression                            #unaryNotExprAlt

    // math power operator (**) (level 2)
    |   left=expression op=POWER nls right=expression                                       #powerExprAlt

    // ++(prefix)/--(prefix)/+(unary)/-(unary) (level 3)
    |   op=(INC | DEC | ADD | SUB) expression                                               #unaryAddExprAlt

    // multiplication/division/modulo (level 4)
    |   left=expression op=(MUL | DIV | MOD) nls right=expression                           #multiplicativeExprAlt

    // binary addition/subtraction (level 5)
    |   left=expression op=(ADD | SUB) nls right=expression                                 #additiveExprAlt

    // bit shift expressions (level 6)
    |   left=expression
            (           (   dlOp=LT LT
                        |   tgOp=GT GT GT
                        |   dgOp=GT GT
                        )
            |   rangeOp=(    RANGE_INCLUSIVE
                        |    RANGE_EXCLUSIVE
                        )
            ) nls
        right=expression                                                                    #shiftExprAlt

    // boolean relational expressions (level 7)
    |   left=expression op=(AS | INSTANCEOF) nls type                                       #relationalExprAlt
    |   left=expression op=(LE | GE | GT | LT | IN) nls right=expression                    #relationalExprAlt

    // equality/inequality (==/!=) (level 8)
    |   left=expression
            op=(    IDENTICAL
               |    NOT_IDENTICAL
               |    EQUAL
               |    NOTEQUAL
               |    SPACESHIP
               ) nls
        right=expression                                                                    #equalityExprAlt

    // regex find and match (=~ and ==~) (level 8.5)
    // jez: moved =~ closer to precedence of == etc, as...
    // 'if (foo =~ "a.c")' is very close in intent to 'if (foo == "abc")'
    |   left=expression op=(REGEX_FIND | REGEX_MATCH) nls right=expression                  #regexExprAlt

    // bitwise or non-short-circuiting and (&)  (level 9)
    |   left=expression op=BITAND nls right=expression                                      #andExprAlt

    // exclusive or (^)  (level 10)
    |   left=expression op=XOR nls right=expression                                         #exclusiveOrExprAlt

    // bitwise or non-short-circuiting or (|)  (level 11)
    |   left=expression op=BITOR nls right=expression                                       #inclusiveOrExprAlt

    // logical and (&&)  (level 12)
    |   left=expression op=AND nls right=expression                                         #logicalAndExprAlt

    // logical or (||)  (level 13)
    |   left=expression op=OR nls right=expression                                          #logicalOrExprAlt

    // conditional test (level 14)
    |   <assoc=right> con=expression
        (   nls QUESTION nls tb=expression nls COLON nls
        |   nls ELVIS nls
        )
        fb=expression                                                                       #conditionalExprAlt

    // assignment expression (level 15)
    |   <assoc=right> left=expression
                        op=(   ASSIGN
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
                           ) nls
                     right=expression                                                        #assignmentExprAlt
    ;


/**
 *  A "path expression" is a name or other primary, possibly qualified by various
 *  forms of dot, and/or followed by various kinds of brackets.
 *  It can be used for value or assigned to, or else further qualified, indexed, or called.
 *  It is called a "path" because it looks like a linear path through a data structure.
 *  Examples:  x.y, x?.y, x*.y, x.@y; x[], x[y], x[y,z]; x(), x(y), x(y,z); x{s}; a.b[n].c(x).d{s}
 *  (Compare to a C lvalue, or LeftHandSide in the JLS section 15.26.)
 *  General expressions are built up from path expressions, using operators like '+' and '='.
 */
pathExpression
    :   primary pathElement* // TODO support command expression
    ;

pathElement
    :   nls
        ( SPREAD_DOT AT?       // Spread operator:  x*.y  ===  x?.collect{it.y}
        | OPTIONAL_DOT AT?     // Optional-null operator:  x?.y  === (x==null)?null:x.y
        | MEMBER_POINTER    // Member pointer operator: foo.&y == foo.metaClass.getMethodPointer(foo, "y")
        | DOT AT?              // The all-powerful dot.
        )
        nls
        nonWildcardTypeArguments? namePart

    |   arguments

    // Can always append a block, as foo{bar}
    |   closure

    // Element selection is always an option, too.
    // In Groovy, the stuff between brackets is a general argument list,
    // since the bracket operator is transformed into a method call.
    |   indexPropertyArgs
    ;

/**
 *  This is the grammar for what can follow a dot:  x.a, x.@a, x.&a, x.'a', etc.
 */
namePart
    :
        (   Identifier

        // foo.'bar' is in all ways same as foo.bar, except that bar can have an arbitrary spelling
        |   StringLiteral

        |   dynamicMemberName

        // PROPOSAL, DECIDE:  Is this inline form of the 'with' statement useful?
        // Definition:  a.{foo} === {with(a) {foo}}
        // May cover some path expression use-cases previously handled by dynamic scoping (closure delegates).
        |   block

        // let's allow common keywords as property names
        |   keywords
        )
    ;

/**
 *  If a dot is followed by a parenthesized or quoted expression, the member is computed dynamically,
 *  and the member selection is done only at runtime.  This forces a statically unchecked member access.
 */
dynamicMemberName
    :   parExpression
    |   gstring
    ;

/** An expression may be followed by [...].
 *  Unlike Java, these brackets may contain a general argument list,
 *  which is passed to the array element operator, which can make of it what it wants.
 *  The brackets may also be empty, as in T[].  This is how Groovy names array types.
 */
indexPropertyArgs
    :   LBRACK expressionList RBRACK
    ;

primary
    :   Identifier                                                                          #identifierPrmrAlt
    |   literal                                                                             #literalPrmrAlt
    |   gstring                                                                             #gstringPrmrAlt
    |   NEW creator                                                                         #newPrmrAlt
    |   THIS                                                                                #thisPrmrAlt
    |   SUPER                                                                               #superPrmrAlt
    |   parExpression                                                                       #parenPrmrAlt
    |   closure                                                                             #closurePrmrAlt
    |   list                                                                                #listPrmrAlt
    |   map                                                                                 #mapPrmrAlt
    ;

list
locals[boolean empty = true]
    :   LBRACK
        (
            expressionList
            { $empty = false; }
        )?
        (
            COMMA
            { !$empty }?<fail={"Empty list constructor should not contain any comma(,)"}>
        )?
        RBRACK
    ;

map
    :   LBRACK mapEntryList? COMMA? RBRACK
    ;

mapEntryList
    :   mapEntry (COMMA mapEntry)*
    ;

mapEntry
    :   mapEntryLabel COLON expression
    ;

mapEntryLabel
    :   keywords
    |   primary
    ;

creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   Identifier typeArgumentsOrDiamond? (DOT Identifier typeArgumentsOrDiamond?)*
    |   primitiveType
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

// TODO support labeled argument
arguments
    :   LPAREN expressionList? RPAREN
    ;

keywords
    :   ABSTRACT
    |   AS
    |   ASSERT
    |   BREAK
    |   CASE
    |   CATCH
    |   CLASS
    |   CONST
    |   CONTINUE
    |   DEF
    |   DEFAULT
    |   DO
    |   ELSE
    |   ENUM
    |   EXTENDS
    |   FINAL
    |   FINALLY
    |   FOR
    |   GOTO
    |   IF
    |   IMPLEMENTS
    |   IMPORT
    |   IN
    |   INSTANCEOF
    |   INTERFACE
    |   NATIVE
    |   NEW
    |   PACKAGE
    |   RETURN
    |   STATIC
    |   STRICTFP
    |   SUPER
    |   SWITCH
    |   SYNCHRONIZED
    |   THIS
    |   THREADSAFE
    |   THROW
    |   THROWS
    |   TRANSIENT
    |   TRAIT
    |   TRY
    |   VOLATILE
    |   WHILE

    |   NullLiteral
    |   BooleanLiteral

    |   BuiltInPrimitiveType
    |   VOID

    |   PUBLIC
    |   PROTECTED
    |   PRIVATE
    ;

nls :   NL*
    ;

sep :   SEMI NL*
    |   NL+ (SEMI NL*)*
    ;
