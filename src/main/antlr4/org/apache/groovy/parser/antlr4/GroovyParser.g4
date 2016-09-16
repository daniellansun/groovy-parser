/*
 [The "BSD licence"]
 Copyright (c) 2013 Terence Parr, Sam Harwell
 Copyright (c) 2016 Daniel Sun
 All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
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
    import java.util.Map;
    import org.codehaus.groovy.util.ListHashMap;
    import org.apache.groovy.parser.antlr4.SemanticPredicates;
    import org.codehaus.groovy.GroovyBugError;
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
    :   annotationsOpt IMPORT STATIC? qualifiedName (DOT MUL | AS identifier)?
    ;

typeDeclaration
    :   classOrInterfaceModifiersOpt classDeclaration
    |   classOrInterfaceModifiersOpt enumDeclaration
    |   classOrInterfaceModifiersOpt interfaceDeclaration
    |   classOrInterfaceModifiersOpt annotationTypeDeclaration
    |   SEMI
    ;

modifier
    :   classOrInterfaceModifier
    |   m=(   NATIVE
          |   SYNCHRONIZED
          |   TRANSIENT
          |   VOLATILE
          |   DEF
          )
    ;

modifiersOpt
    :   modifiers?
    ;

modifiers
    :   (modifier nls)+
    ;

classOrInterfaceModifiersOpt
    :   classOrInterfaceModifiers?
    ;

classOrInterfaceModifiers
    :   (classOrInterfaceModifier nls)+
    ;

classOrInterfaceModifier
    :   annotation       // class or interface
    |   m=(   PUBLIC     // class or interface
          |   PROTECTED  // class or interface
          |   PRIVATE    // class or interface
          |   STATIC     // class or interface
          |   ABSTRACT   // class or interface
          |   FINAL      // class only -- does not apply to interfaces
          |   STRICTFP   // class or interface
          )
    ;

variableModifier
    :   annotation
    |   m=( FINAL
          | DEF
          )
    ;

variableModifiersOpt
    :   variableModifiers?
    ;

variableModifiers
    :   (variableModifier nls)+
    ;


classDeclaration
    :   CLASS className nls typeParameters? nls
        (EXTENDS nls sc=type nls)?
        (IMPLEMENTS nls is=typeList nls)?
        classBody
    ;

typeParameters
    :   LT nls typeParameter (COMMA nls typeParameter)* nls GT
    ;

typeParameter
    :   className (EXTENDS nls typeBound)?
    ;

typeBound
    :   type (BITAND nls type)*
    ;

enumDeclaration
    :   ENUM className (IMPLEMENTS typeList)?
        LBRACE enumConstants? COMMA? enumBodyDeclarations? RBRACE
    ;

enumConstants
    :   enumConstant (COMMA enumConstant)*
    ;

enumConstant
    :   annotation* identifier arguments? classBody?
    ;

enumBodyDeclarations
    :   SEMI classBodyDeclaration*
    ;

interfaceDeclaration
    :   INTERFACE className typeParameters? (EXTENDS typeList)? interfaceBody
    ;

typeList
    :   type (COMMA nls type)*
    ;

classBody
    :   LBRACE nls classBodyDeclaration? (sep classBodyDeclaration)* sep? RBRACE
    ;

interfaceBody
    :   LBRACE nls interfaceBodyDeclaration? (sep interfaceBodyDeclaration)* sep? RBRACE
    ;

classBodyDeclaration
    :   SEMI
    |   (STATIC nls)? block
    |   memberDeclaration
    ;

memberDeclaration
    :   methodDeclaration[0]
    |   fieldDeclaration
    |   constructorDeclaration
    |   genericConstructorDeclaration

    |   modifiersOpt classDeclaration
    |   modifiersOpt enumDeclaration
    |   modifiersOpt interfaceDeclaration
    |   modifiersOpt annotationTypeDeclaration
    ;

/**
 *  t   0: all method declaration, 1: normal method declaration, 2: abstract method declaration
 */
methodDeclaration[int t]
    :   (   modifiersOpt  typeParameters? returnType
        |   modifiers  typeParameters? returnType?
        )
        methodName formalParameters nls (THROWS nls qualifiedClassNameList nls)?
        (
            { 0 == $t || 1 == $t }?
            methodBody
        |
            { 0 == $t || 2 == $t }?
            sep
        )
    ;



methodName
    :   identifier
    |   StringLiteral
    ;

returnType
    :   type
    |   VOID
    ;

constructorDeclaration
    :   modifiersOpt className formalParameters (THROWS qualifiedClassNameList)?
        constructorBody
    ;

genericConstructorDeclaration
    :   modifiersOpt typeParameters constructorDeclaration
    ;

fieldDeclaration
    :   modifiersOpt type variableDeclarators SEMI
    ;

interfaceBodyDeclaration
    :   interfaceMemberDeclaration
    |   SEMI
    ;

interfaceMemberDeclaration
    :   constDeclaration
    |   methodDeclaration[2]
    |   modifiersOpt classDeclaration
    |   modifiersOpt enumDeclaration
    |   modifiersOpt interfaceDeclaration
    |   modifiersOpt annotationTypeDeclaration
    ;

constDeclaration
    :   type constantDeclarator (COMMA constantDeclarator)* SEMI
    ;

constantDeclarator
    :   identifier (LBRACK RBRACK)* ASSIGN variableInitializer
    ;

variableDeclarators
    :   variableDeclarator (COMMA nls variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId (ASSIGN nls variableInitializer)?
    ;

variableDeclaratorId
    :   identifier
    ;

variableInitializer
    :   arrayInitializer
    |   statementExpression
    ;

arrayInitializer
    :   LBRACK (variableInitializer (COMMA variableInitializer)* (COMMA)? )? RBRACK
    ;

enumConstantName
    :   identifier
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
    :   LT nls typeArgument (COMMA nls typeArgument)* nls GT
    ;

typeArgument
    :   type
    |   QUESTION ((EXTENDS | SUPER) nls type)?
    ;

qualifiedClassNameList
    :   qualifiedClassName (COMMA nls qualifiedClassName)*
    ;

formalParameters
    :   LPAREN formalParameterList? RPAREN
    ;

formalParameterList
    :   formalParameter (COMMA nls formalParameter)* (COMMA nls lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   variableModifiersOpt type? variableDeclaratorId (ASSIGN nls expression)?
    ;

lastFormalParameter
    :   variableModifiersOpt (type ELLIPSIS)? variableDeclaratorId (ASSIGN nls expression)?
    ;

methodBody
    :   block
    ;

constructorBody
    :   block
    ;

qualifiedName
    :   identifier (DOT identifier)*
    ;

qualifiedClassName
    :   (Identifier DOT)* className
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
    :   identifier GStringPathPart*
    ;

closure
    :   LBRACE nls (formalParameterList? nls ARROW nls)? blockStatementsOpt RBRACE
    ;

blockStatementsOpt
    :   blockStatements?
    ;

blockStatements
    :   blockStatement (sep blockStatement)* sep?
    ;

// ANNOTATIONS

annotationsOpt
    :   (annotation nls)*
    ;

annotation
    :   AT annotationName ( LPAREN ( elementValuePairs | elementValue )? RPAREN )?
    ;

annotationName : qualifiedClassName ;

elementValuePairs
    :   elementValuePair (COMMA elementValuePair)*
    ;

elementValuePair
    :   identifier ASSIGN elementValue
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
    :   AT INTERFACE className annotationTypeBody
    ;

annotationTypeBody
    :   LBRACE (annotationTypeElementDeclaration)* RBRACE
    ;

annotationTypeElementDeclaration
    :   modifiersOpt annotationTypeElementRest
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
    :   identifier LPAREN RPAREN defaultValue?
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
    :   variableModifiersOpt type variableDeclarators
    |   variableModifiers type? variableDeclarators
    |   variableModifiers typeNamePairs ASSIGN nls variableInitializer
    ;

typeNamePairs
    :   LPAREN typeNamePair (COMMA typeNamePair)* RPAREN
    ;

typeNamePair
    :   type? variableDeclaratorId
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
    |   SWITCH parExpression nls LBRACE nls switchBlockStatementGroup* nls RBRACE           #switchStmtAlt
    |   SYNCHRONIZED parExpression nls block                                                #synchronizedStmtAlt
    |   RETURN expression?                                                                  #returnStmtAlt
    |   THROW expression                                                                    #throwStmtAlt
    |   BREAK identifier?                                                                   #breakStmtAlt
    |   CONTINUE identifier?                                                                #continueStmtAlt
    |   identifier COLON nls statement                                                      #labeledStmtAlt

    // Import statement.  Can be used in any scope.  Has "import x as y" also.
    |   importDeclaration                                                                   #importStmtAlt

    |   typeDeclaration                                                                     #typeDeclarationStmtAlt
    |   localVariableDeclaration                                                            #localVariableDeclarationStmtAlt

    |   methodDeclaration[1]                                                                #methodDeclarationStmtAlt

    |   statementExpression                                                                 #expressionStmtAlt

    |   SEMI                                                                                #emptyStmtAlt
    ;

catchClause
    :   CATCH LPAREN variableModifiersOpt catchType? identifier RPAREN nls block
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
    :   (switchLabel nls)+ blockStatements
    ;

switchLabel
    :   CASE expression COLON
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
    :   variableModifiersOpt type? variableDeclaratorId (COLON | IN) expression
    ;


// EXPRESSIONS

castParExpression
    :   LPAREN type RPAREN
    ;

parExpression
    :   LPAREN expression RPAREN
    ;

expressionList
    :   expressionListElement (COMMA expressionListElement)*
    ;

expressionListElement
    :   MUL? expression
    ;

/**
 *  In order to resolve the syntactic ambiguities, e.g. (String)'abc' can be parsed as a cast expression or a parentheses-less method call(method name: (String), arguments: 'abc')
 *      try to match expression first.
 *  If it is not a normal expression, then try to match the command expression
 */
statementExpression
    :   expression                          #normalExprAlt
    |   commandExpression                   #commandExprAlt
    ;

expression
    // qualified names, array expressions, method invocation, post inc/dec, type casting (level 1)
    // The cast expression must put first to resovle the ambiguities between type casting and call on parentheses expression, e.g. (int)(1 / 2)
    :   castParExpression expression                                                        #castExprAlt
    |   pathExpression op=(INC | DEC)?                                                      #postfixExprAlt

    // ~(BNOT)/!(LNOT) (level 1)
    |   (BITNOT | NOT) nls expression                                                       #unaryNotExprAlt

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
                     right=statementExpression                                              #assignmentExprAlt

    ;

commandExpression
    :   pathExpression
        (
            { SemanticPredicates.isFollowingMethodName($pathExpression.t) }?
            argumentList
        |
            /* if pathExpression is a method call, no need to have any more arguments */
        )

        commandArgument*
    ;

commandArgument
    :   primary
        // what follows is either a normal argument, parens,
        // an appended block, an index operation, or nothing
        // parens (a b already processed):
        //      a b c() d e -> a(b).c().d(e)
        //      a b c()() d e -> a(b).c().call().d(e)
        // index (a b already processed):
        //      a b c[x] d e -> a(b).c[x].d(e)
        //      a b c[x][y] d e -> a(b).c[x][y].d(e)
        // block (a b already processed):
        //      a b c {x} d e -> a(b).c({x}).d(e)
        //
        // parens/block completes method call
        // index makes method call to property get with index
        //
        (   pathElement+
        |   argumentList
        )?
    ;

/**
 *  A "path expression" is a name or other primary, possibly qualified by various
 *  forms of dot, and/or followed by various kinds of brackets.
 *  It can be used for value or assigned to, or else further qualified, indexed, or called.
 *  It is called a "path" because it looks like a linear path through a data structure.
 *  Examples:  x.y, x?.y, x*.y, x.@y; x[], x[y], x[y,z]; x(), x(y), x(y,z); x{s}; a.b[n].c(x).d{s}
 *  (Compare to a C lvalue, or LeftHandSide in the JLS section 15.26.)
 *  General expressions are built up from path expressions, using operators like '+' and '='.
 *
 *  t   0: primary, 1: namePart, 2: arguments, 3: closure, 4: indexPropertyArgs
 */
pathExpression returns [int t]
    :   primary (pathElement { $t = $pathElement.t; })*
    ;

pathElement returns [int t]
    :   nls

        // AT: foo.@bar selects the field (or attribute), not property
        ( SPREAD_DOT nls (AT | nonWildcardTypeArguments)?       // Spread operator:  x*.y  ===  x?.collect{it.y}
        | OPTIONAL_DOT nls (AT | nonWildcardTypeArguments)?     // Optional-null operator:  x?.y  === (x==null)?null:x.y
        | MEMBER_POINTER nls                                    // Member pointer operator: foo.&y == foo.metaClass.getMethodPointer(foo, "y")
        | DOT nls (AT | nonWildcardTypeArguments)?              // The all-powerful dot.
        )
        namePart
        { $t = 1; }

    |   arguments
        { $t = 2; }

    // Can always append a block, as foo{bar}
    |   nls closure
        { $t = 3; }

    // Element selection is always an option, too.
    // In Groovy, the stuff between brackets is a general argument list,
    // since the bracket operator is transformed into a method call.
    |   indexPropertyArgs
        { $t = 4; }
    ;

/**
 *  This is the grammar for what can follow a dot:  x.a, x.@a, x.&a, x.'a', etc.
 */
namePart
    :
        (   identifier

        // foo.'bar' is in all ways same as foo.bar, except that bar can have an arbitrary spelling
        |   StringLiteral

        |   dynamicMemberName

        /* just a PROPOSAL, which has not been implemented yet!
        // PROPOSAL, DECIDE:  Is this inline form of the 'with' statement useful?
        // Definition:  a.{foo} === {with(a) {foo}}
        // May cover some path expression use-cases previously handled by dynamic scoping (closure delegates).
        |   block
        */

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
    :   identifier                                                                          #identifierPrmrAlt
    |   literal                                                                             #literalPrmrAlt
    |   gstring                                                                             #gstringPrmrAlt
    |   NEW creator                                                                         #newPrmrAlt
    |   THIS                                                                                #thisPrmrAlt
    |   SUPER                                                                               #superPrmrAlt
    |   parExpression                                                                       #parenPrmrAlt
    |   closure                                                                             #closurePrmrAlt
    |   list                                                                                #listPrmrAlt
    |   map                                                                                 #mapPrmrAlt
    |   builtInType                                                                         #typePrmrAlt
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
    |   MUL COLON expression
    ;

mapEntryLabel
    :   keywords
    |   primary
    ;

creator
    :   createdName arguments classBody?
    |   createdName (LBRACK expression RBRACK)+ (b+=LBRACK RBRACK)*
    ;

createdName
    :   primitiveType
    |   qualifiedClassName typeArgumentsOrDiamond?
    ;

nonWildcardTypeArguments
    :   LT nls typeList nls GT
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
    |   DOT identifier arguments?
    ;

arguments
    :   LPAREN argumentList? RPAREN
    ;

argumentList
    :   expressionList
    |   mapEntryList
    ;

className
    :   CapitalizedIdentifier
    ;

identifier
    :   Identifier
    |   CapitalizedIdentifier
    ;

builtInType
    :   BuiltInPrimitiveType
    |   VOID
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
