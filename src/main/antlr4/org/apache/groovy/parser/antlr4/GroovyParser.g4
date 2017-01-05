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
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * Created on   2016/08/14
 *
 */
parser grammar GroovyParser;

options {
    tokenVocab = GroovyLexer;
    contextSuperClass = GroovyParserRuleContext;
    superClass = AbstractParser;
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

    @Override
    public int getSyntaxErrorSource() {
        return GroovySyntaxError.PARSER;
    }

    @Override
    public String genPositionInfo() {
        Token token = _input.LT(-1);

        if (null == token) {
            return "";
        }

        return " @ line " + token.getLine() + ", column " + (token.getCharPositionInLine() + 1 + token.getText().length());
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
    :   annotationsOpt IMPORT STATIC? qualifiedName (DOT MUL | AS alias=identifier)?
    ;


typeDeclaration
    :   classOrInterfaceModifiersOpt classDeclaration
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
          |   DEFAULT    // interface only -- does not apply to classes
          )
    ;

variableModifier
    :   annotation
    |   m=( FINAL
          | DEF
          // Groovy supports declaring local variables as instance/class fields,
          // e.g. import groovy.transform.*; @Field static List awe = [1, 2, 3]
          // e.g. import groovy.transform.*; def a = { @Field public List awe = [1, 2, 3] }
          // Notice: Groovy 2.4.7 just allows to declare local variables with the following modifiers when using annotations(e.g. @Field)
          // TODO check whether the following modifiers accompany annotations or not. Because the legacy codes(e.g. benchmark/bench/heapsort.groovy) allow to declare the special instance/class fields without annotations, we leave it as it is for the time being
          | PUBLIC
          | PROTECTED
          | PRIVATE
          | STATIC
          | ABSTRACT
          | STRICTFP
          )
    ;

variableModifiersOpt
    :   variableModifiers?
    ;

variableModifiers
    :   (variableModifier nls)+
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

typeList
    :   type (COMMA nls type)*
    ;


/**
 *  t   0: class; 1: interface; 2: enum; 3: annotation; 4: trait
 */
classDeclaration
locals[ int t ]
    :   (   CLASS { $t = 0; }
        |   INTERFACE { $t = 1; }
        |   ENUM { $t = 2; }
        |   AT INTERFACE { $t = 3; }
        |   TRAIT { $t = 4; }
        )
        identifier nls

        (
            { 3 != $t }?
            typeParameters? nls
            (
                { 2 != $t }?
                (EXTENDS nls
                    (
                        // Only interface can extend more than one super class
                        {1 == $t}? scs=typeList
                    |
                        sc=type
                    )
                nls)?
            |
                /* enum should not have type parameters and extends */
            )

            (
                {1 != $t}?
                (IMPLEMENTS nls is=typeList nls)?
            |
                /* interface should not implement other interfaces */
            )
        |
            /* annotation should not have implements and extends*/
        )

        classBody[$t]
    ;

// t    see the comment of classDeclaration
classBody[int t]
    :   LBRACE nls
        (
            /* Only enum can have enum constants */
            { 2 == $t }?
            enumConstants? nls
        |

        )
        classBodyDeclaration[$t]? (sep classBodyDeclaration[$t])* sep? RBRACE
    ;

enumConstants
    :   enumConstant (nls COMMA nls enumConstant)* (nls COMMA)?
    ;

enumConstant
    :   annotationsOpt identifier arguments? anonymousInnerClassDeclaration[1]?
    ;

classBodyDeclaration[int t]
    :   SEMI
    |   (STATIC nls)? block
    |   memberDeclaration[$t]
    ;

memberDeclaration[int t]
    :   methodDeclaration[0, $t]
    |   fieldDeclaration
    |   modifiersOpt classDeclaration
    ;

/**
 *  t   0: *class member* all kinds of method declaration AND constructor declaration,
 *      1: normal method declaration, 2: abstract method declaration
 *      3: normal method declaration OR abstract method declaration
 *  ct  9: script, other see the comment of classDeclaration
 */
methodDeclaration[int t, int ct]
    :   { 3 == $ct }?
        returnType[$ct] methodName LPAREN rparen (DEFAULT nls elementValue)?
    |
        (   modifiersOpt  typeParameters? returnType[$ct]
        |   modifiers  typeParameters? returnType[$ct]?
        |
            { 0 == $t }?
            modifiersOpt typeParameters?
        )
        methodName formalParameters (nls THROWS nls qualifiedClassNameList)?
        (
            { 0 == $t || 3 == $t || 1 == $t}?
            nls methodBody
        |
            { 0 == $t || 3 == $t || 2 == $t }?
            /* no method body */
        )
    ;

methodName
    :   identifier
    |   stringLiteral
    ;

returnType[int ct]
    :
        type
    |
        // annotation method can not have void return type
        { 3 != $ct }? VOID
    ;

fieldDeclaration
    :   variableDeclaration[1]
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
    |   standardLambda
    ;

arrayInitializer
    :   LBRACK (variableInitializer (COMMA variableInitializer)* (COMMA)? )? RBRACK
    ;

type
    :   primitiveType (LBRACK RBRACK)*
    |   classOrInterfaceType (LBRACK RBRACK)*
    ;

classOrInterfaceType
    :   qualifiedStandardClassName typeArguments?
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
    :   LPAREN formalParameterList? rparen
    ;

formalParameterList
    :   formalParameter (COMMA nls formalParameter)* (COMMA nls lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   variableModifiersOpt type?          variableDeclaratorId (ASSIGN nls expression)?
    ;

lastFormalParameter
    :   variableModifiersOpt type? ELLIPSIS variableDeclaratorId (ASSIGN nls expression)?
    ;

methodBody
    :   block
    ;

qualifiedName
    :   qualifiedNameElement (DOT qualifiedNameElement)*
    ;

/**
 *  Java doesn't have the keywords 'as', 'in', 'def', 'trait' so we make some allowances
 *  for them in package names for better integration with existing Java packages
 */
qualifiedNameElement
    :   identifier
    |   DEF
    |   IN
    |   AS
    |   TRAIT
    ;

qualifiedClassName
    :   (qualifiedNameElement DOT)* identifier
    ;

qualifiedStandardClassName
    :   (qualifiedNameElement DOT)* (className DOT)* className
    ;

literal
    :   IntegerLiteral                                                                      #integerLiteralAlt
    |   FloatingPointLiteral                                                                #floatingPointLiteralAlt
    |   stringLiteral                                                                       #stringLiteralAlt
    |   BooleanLiteral                                                                      #booleanLiteralAlt
    |   NullLiteral                                                                         #nullLiteralAlt
    ;

// GSTRING

gstring
    :   GStringBegin gstringValue (GStringPart  gstringValue)* GStringEnd
    ;

gstringValue
    :   gstringPath
    |   LBRACE statementExpression? RBRACE
    |   closure
    ;

gstringPath
    :   identifier GStringPathPart*
    ;


// LAMBDA EXPRESSION
lambda
options { baseContext = standardLambda; }
	:	lambdaParameters nls ARROW nls lambdaBody
	;

standardLambda
	:	standardLambdaParameters nls ARROW nls lambdaBody
	;

lambdaParameters
options { baseContext = standardLambdaParameters; }
    :   formalParameters

    // { a -> a * 2 } can be parsed as a lambda expression in a block, but we expect a closure.
    // So it is better to put parameters in the parentheses and the following single parameter without parentheses is limited
//    |   variableDeclaratorId
    ;

standardLambdaParameters
    :   formalParameters
    |   variableDeclaratorId
    ;

lambdaBody
	:	block
	|	expression
	;


// CLOSURE
closure
locals[ String footprint = "" ]
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
    :   AT annotationName ( LPAREN elementValues? rparen )?
    ;

elementValues
    :   elementValuePairs
    |   elementValue
    ;

annotationName : qualifiedClassName ;

elementValuePairs
    :   elementValuePair (COMMA elementValuePair)*
    ;

elementValuePair
    :   elementValuePairName ASSIGN elementValue
    ;

elementValuePairName
    :   identifier
    |   keywords
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

// STATEMENTS / BLOCKS

block
    :   LBRACE nls blockStatementsOpt RBRACE
    ;

blockStatement
    :   localVariableDeclaration
    |   statement
    |   typeDeclaration
    ;

localVariableDeclaration
    :   variableDeclaration[0]
    ;

/**
 *  t   0: local variable declaration; 1: field declaration
 */
variableDeclaration[int t]
    :   (   { 0 == $t }? variableModifiersOpt
        |   { 1 == $t }? modifiersOpt
        )
        type variableDeclarators
    |
        (   { 0 == $t }? variableModifiers
        |   { 1 == $t }? modifiers
        )
        type? variableDeclarators
    |
        (   { 0 == $t }? variableModifiers
        |   { 1 == $t }? modifiers
        )
        typeNamePairs ASSIGN nls variableInitializer
    ;

typeNamePairs
    :   LPAREN typeNamePair (COMMA typeNamePair)* rparen
    ;

typeNamePair
    :   type? variableDeclaratorId
    ;

variableNames
    :   LPAREN variableDeclaratorId (COMMA variableDeclaratorId)+ rparen
    ;

switchStatement
locals[ String footprint = "" ]
    :   SWITCH parExpression nls LBRACE nls switchBlockStatementGroup* nls RBRACE
    ;

loopStatement
locals[ String footprint = "" ]
    :   FOR LPAREN forControl rparen nls statement                                                          #forStmtAlt
    |   WHILE parExpression nls statement                                                                   #whileStmtAlt
    |   DO nls statement nls WHILE parExpression                                                            #doWhileStmtAlt
    ;

continueStatement
locals[ boolean isInsideLoop ]
@init {
    try {
        $isInsideLoop = null != $loopStatement::footprint;
    } catch(NullPointerException e) {
        $isInsideLoop = false;
    }
}
    :   CONTINUE
        { $isInsideLoop }?<fail={"the continue statement is only allowed inside loops"}>
        identifier?
    ;

breakStatement
locals[ boolean isInsideLoop, boolean isInsideSwitch ]
@init {
    try {
        $isInsideLoop = null != $loopStatement::footprint;
    } catch(NullPointerException e) {
        $isInsideLoop = false;
    }

    try {
        $isInsideSwitch = null != $switchStatement::footprint;
    } catch(NullPointerException e) {
        $isInsideSwitch = false;
    }
}
    :   BREAK
        { $isInsideLoop || $isInsideSwitch }?<fail={"the break statement is only allowed inside loops or switches"}>
        identifier?
    ;

tryCatchStatement
locals[boolean resourcesExists = false]
    :   TRY (resources { $resourcesExists = true; })? nls
        block
        (
            (nls catchClause)+
            (nls finallyBlock)?
        |
            nls finallyBlock
        |
            // try-with-resources can have no catche and finally clauses
            { $resourcesExists }?<fail={"catch or finally clauses are required for try-catch statement"}>
        )
    ;

statement
    :   block                                                                                               #blockStmtAlt
    |   ASSERT ce=expression ((COLON | COMMA) nls me=expression)?                                           #assertStmtAlt
    |   IF parExpression nls tb=statement ((nls | sep) ELSE nls fb=statement)?                              #ifElseStmtAlt
    |   loopStatement                                                                                       #loopStmtAlt

    |   tryCatchStatement                                                                                   #tryCatchStmtAlt

    |   switchStatement                                                                                     #switchStmtAlt
    |   SYNCHRONIZED parExpression nls block                                                                #synchronizedStmtAlt
    |   RETURN expression?                                                                                  #returnStmtAlt
    |   THROW expression                                                                                    #throwStmtAlt

    |   breakStatement                                                                                      #breakStmtAlt
    |   continueStatement                                                                                   #continueStmtAlt

    |   identifier COLON nls statement                                                                      #labeledStmtAlt

    // Import statement.  Can be used in any scope.  Has "import x as y" also.
    |   importDeclaration                                                                                   #importStmtAlt

    |   typeDeclaration                                                                                     #typeDeclarationStmtAlt
    |   localVariableDeclaration                                                                            #localVariableDeclarationStmtAlt

    // validate the method in the AstBuilder#visitMethodDeclaration, e.g. method without method body is not allowed
    |   { !SemanticPredicates.isInvalidMethodDeclaration(_input) }?
        methodDeclaration[3, 9]                                                                             #methodDeclarationStmtAlt

    |   statementExpression                                                                                 #expressionStmtAlt

    |   SEMI                                                                                                #emptyStmtAlt
    ;

catchClause
    :   CATCH LPAREN variableModifiersOpt catchType? identifier rparen nls block
    ;

catchType
    :   qualifiedClassName (BITOR qualifiedClassName)*
    ;

finallyBlock
    :   FINALLY nls block
    ;


resources
    :   LPAREN nls resourceList sep? rparen
    ;

resourceList
    :   resource (sep resource)*
    ;

resource
    :   localVariableDeclaration
    |   expression
    ;


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
    :   LPAREN type rparen
    ;

parExpression
    :   LPAREN (statementExpression | standardLambda) rparen
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
    // The cast expression must be put before pathExpression to resovle the ambiguities between type casting and call on parentheses expression, e.g. (int)(1 / 2)
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
    |   left=expression op=(AS | INSTANCEOF | NOT_INSTANCEOF) nls type                      #relationalExprAlt
    |   left=expression op=(LE | GE | GT | LT | IN | NOT_IN)  nls right=expression          #relationalExprAlt

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
    // "(a) = [1]" is a special case of multipleAssignmentExprAlt, it will be handle by assignmentExprAlt
    |   <assoc=right> left=variableNames op=ASSIGN nls right=statementExpression            #multipleAssignmentExprAlt
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
                           |   ELVIS_ASSIGN
                           ) nls
                     (statementExpression | standardLambda)                                 #assignmentExprAlt
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
 *  t   0: primary, 1: namePart, 2: arguments, 3: closure, 4: indexPropertyArgs, 5: namedPropertyArgs
 */
pathExpression returns [int t]
    :   primary (pathElement { $t = $pathElement.t; })*
    ;

pathElement returns [int t]
locals[ boolean isInsideClosure ]
@init {
    try {
        $isInsideClosure = null != $closure::footprint;
    } catch(NullPointerException e) {
        $isInsideClosure = false;
    }
}
    :   nls

        // AT: foo.@bar selects the field (or attribute), not property
        ( SPREAD_DOT nls (AT | nonWildcardTypeArguments)?       // Spread operator:  x*.y  ===  x?.collect{it.y}
        | SAFE_DOT nls (AT | nonWildcardTypeArguments)?         // Optional-null operator:  x?.y  === (x==null)?null:x.y
        | METHOD_POINTER nls                                    // Method pointer operator: foo.&y == foo.metaClass.getMethodPointer(foo, "y")
        | METHOD_REFERENCE nls                                  // Method reference: System.out::println
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

    |   namedPropertyArgs
        { $t = 5; }
    ;

/**
 *  This is the grammar for what can follow a dot:  x.a, x.@a, x.&a, x.'a', etc.
 */
namePart
    :
        (   identifier

        // foo.'bar' is in all ways same as foo.bar, except that bar can have an arbitrary spelling
        |   stringLiteral

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
    :   QUESTION? LBRACK expressionList? RBRACK
    ;

namedPropertyArgs
    :   LBRACK mapEntryList RBRACK
    ;

primary
    :   identifier                                                                          #identifierPrmrAlt
    |   literal                                                                             #literalPrmrAlt
    |   gstring                                                                             #gstringPrmrAlt
    |   NEW nls creator                                                                     #newPrmrAlt
    |   THIS                                                                                #thisPrmrAlt
    |   SUPER                                                                               #superPrmrAlt
    |   parExpression                                                                       #parenPrmrAlt
    |   closure                                                                             #closurePrmrAlt
    |   lambda                                                                              #lambdaPrmrAlt
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
    :   LBRACK
        (   mapEntryList COMMA?
        |   COLON
        )
        RBRACK
    ;

mapEntryList
    :   mapEntry (COMMA mapEntry)*
    ;

mapEntry
    :   mapEntryLabel COLON nls expression
    |   MUL COLON nls expression
    ;

mapEntryLabel
    :   keywords
    |   primary
    ;

creator
    :   createdName nls arguments anonymousInnerClassDeclaration[0]?
    |   createdName (LBRACK expression RBRACK)+ (b+=LBRACK RBRACK)*
    ;

/**
 *  t   0: anonymous inner class; 1: anonymous enum
 */
anonymousInnerClassDeclaration[int t]
    :   classBody[0]
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

arguments
    :   LPAREN
        (   enhancedArgumentList?
        |   enhancedArgumentList COMMA
        )
        rparen
    ;

argumentList
options { baseContext = enhancedArgumentList; }
    :   argumentListElement
        (   COMMA nls
            argumentListElement
        )*
    ;

enhancedArgumentList
    :   enhancedArgumentListElement
        (   COMMA nls
            enhancedArgumentListElement
        )*
    ;

argumentListElement
options { baseContext = enhancedArgumentListElement; }
    :   expressionListElement
    |   mapEntry
    ;

enhancedArgumentListElement
    :   expressionListElement
    |   standardLambda
    |   mapEntry
    ;

stringLiteral
    :   StringLiteral
    ;

className
    :   CapitalizedIdentifier
    ;

identifier
    :   Identifier
    |   CapitalizedIdentifier

    |
        // if 'static' followed by DOT, we can treat them as identifiers, e.g. static.unused = { -> }
        { DOT == _input.LT(2).getType() }?
        STATIC
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

rparen
    :   RPAREN
    |
        // !!!Error Alternatives, impact the performance of parsing!!!
        { require(false, "Missing ')'"); }
    ;

nls
    :   NL*
    ;

sep :   SEMI NL*
    |   NL+ (SEMI NL*)*
    ;


