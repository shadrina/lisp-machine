/*
 * Copyright (C) 2011 by Bart Kiers, based on the work done by Håkan L. Younes'
 * JavaCC R5RS grammar, available at: http://mindprod.com/javacc/R5RS.jj
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
grammar Scheme;

parse
  :  commandOrDefinition* EOF
  ;

commandOrDefinition
  :  definition
  |  command
  ;

definition
  :  '(' DEFINE ( variable expression ')' | '(' variable defFormals ')' body ')' )
  |  '(' BEGIN definition* ')'
  ;

defFormals
  :  variable* ('.' variable)?
  ;

command
  :  expression
  ;

identifier
  :  syntacticKeyword
  |  variable
  ;

syntacticKeyword
  :  expressionKeyword
  |  ELSE
  |  ARROW
  |  DEFINE
  |  UNQUOTE
  |  UNQUOTE_SPLICING
  ;

expressionKeyword
  :  QUOTE
  |  LAMBDA
  |  IF
  |  SET
  |  BEGIN
  |  COND
  |  AND
  |  OR
  |  CASE
  |  LET
  |  LETSTAR
  |  LETREC
  |  DO
  |  DELAY
  |  QUASIQUOTE
  ;

expression
  :  variable
  |  literal
  |  lambdaExpression
  |  conditional
  |  assignment
  |  derivedExpression
  |  procedureCall
  ;

variable
  :  VARIABLE
  |  ELLIPSIS
  ;

literal
  :  quotation
  |  selfEvaluating
  ;

quotation
  :  '\'' datum
  |  '(' QUOTE datum ')'
  ;

selfEvaluating
  :  bool
  |  number
  |  CHARACTER
  |  STRING
  ;

lambdaExpression
  :  '(' LAMBDA formals body ')'
  ;

formals
  :  '(' (variable+ ('.' variable)?)? ')'
  |  variable
  ;

conditional
  :  '(' IF test consequent alternate? ')'
  ;

test
  :  expression
  ;

consequent
  :  expression
  ;

alternate
  :  expression
  ;

assignment
  :  '(' SET variable expression ')'
  ;

derivedExpression
  :  '(' ( COND ( '(' ELSE sequence ')'
                | condClause+ ('(' ELSE sequence ')')?
                )
         | CASE expression ( '(' ELSE sequence ')'
                           | caseClause+ ('(' ELSE sequence ')')?
                           )
         | AND test*
         | OR test*
         | LET variable? '(' bindingSpec* ')' body
         | LETSTAR '(' bindingSpec* ')' body
         | LETREC '(' bindingSpec* ')' body
         | BEGIN sequence
         | DO '(' iterationSpec* ')' '(' test doResult? ')' command*
         | DELAY expression
         )
     ')'
  ;

condClause
  :  '(' test (sequence | ARROW recipient)? ')'
  ;

recipient
  :  expression
  ;

caseClause
  :  '(' '(' datum* ')' sequence ')'
  ;

bindingSpec
  :  '(' variable expression ')'
  ;

iterationSpec
  :  '(' variable init step? ')'
  ;

init
  :  expression
  ;

step
  :  expression
  ;

doResult
  :  sequence
  ;

procedureCall
  :  '(' operator operand* ')'
  ;

operator
  :  expression
  ;

operand
  :  expression
  ;

body
  :  (definition)* sequence
  ;

sequence
  :  expression+
  ;

datum
  :  simpleDatum
  |  compoundDatum
  ;

simpleDatum
  :  bool
  |  number
  |  CHARACTER
  |  STRING
  |  identifier
  ;

compoundDatum
  :  list
  |  vector
  ;

list
  :  '(' (datum+ ('.' datum)?)? ')'
  |  abbreviation
  ;

abbreviation
  :  abbrevPrefix datum
  ;

abbrevPrefix
  :  '\'' | '`' | ',@' | ','
  ;

vector
  :  '#(' datum* ')'
  ;

number
  :  NUM_2
  |  NUM_8
  |  NUM_10
  |  NUM_16
  ;

bool
  :  TRUE
  |  FALSE
  ;

// syntactic keywords
ELSE             : 'else';
ARROW            : '=>';
DEFINE           : 'define';
UNQUOTE_SPLICING : 'unquote-splicing';
UNQUOTE          : 'unquote';

// expression keywords
QUOTE            : 'quote';
LAMBDA           : 'lambda';
IF               : 'if';
SET              : 'set!';
BEGIN            : 'begin';
COND             : 'cond';
AND              : 'and';
OR               : 'or';
CASE             : 'case';
LET              : 'let';
LETSTAR          : 'let*';
LETREC           : 'letrec';
DO               : 'do';
DELAY            : 'delay';
QUASIQUOTE       : 'quasiquote';

NUM_2  : PREFIX_2 COMPLEX_2;
NUM_8  : PREFIX_8 COMPLEX_8;
NUM_10 : PREFIX_10? COMPLEX_10;
NUM_16 : PREFIX_16 COMPLEX_16;

ELLIPSIS : '...';

VARIABLE
  :  INITIAL SUBSEQUENT*
  |  PECULIAR_IDENTIFIER
  ;

STRING : '"' STRING_ELEMENT* '"';

CHARACTER : '#\\' (~(' ' | '\n') | CHARACTER_NAME);

TRUE  : '#' ('t' | 'T');
FALSE : '#' ('f' | 'F');

// to ignore
SPACE   : (' ' | '\t' | '\r' | '\n') -> channel(HIDDEN);
COMMENT : ';' ~('\r' | '\n')* -> channel(HIDDEN);

// fragments
fragment INITIAL : LETTER | SPECIAL_INITIAL;
fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment SPECIAL_INITIAL : '!' | '$' | '%' | '&' | '*' | '/' | ':' | '<' | '=' | '>' | '?' | '^' | '_' | '~';
fragment SUBSEQUENT : INITIAL | DIGIT | SPECIAL_SUBSEQUENT;
fragment DIGIT : '0'..'9';
fragment SPECIAL_SUBSEQUENT : '.' | '+' | '-' | '@';
fragment PECULIAR_IDENTIFIER : '+' | '-';
fragment STRING_ELEMENT : ~('"' | '\\') | '\\' ('"' | '\\');
fragment CHARACTER_NAME : 'space' | 'newline';

fragment COMPLEX_2
  :  REAL_2 ('@' REAL_2)?
  |  REAL_2? SIGN UREAL_2? ('i' | 'I')
  ;

fragment COMPLEX_8
  :  REAL_8 ('@' REAL_8)?
  |  REAL_8? SIGN UREAL_8? ('i' | 'I')
  ;

fragment COMPLEX_10
  :  REAL_10 ('@' REAL_10)?
  |  REAL_10? SIGN UREAL_10? ('i' | 'I')
  ;

fragment COMPLEX_16
  :  REAL_16 ('@' REAL_16)?
  |  REAL_16? SIGN UREAL_16? ('i' | 'I')
  ;

fragment REAL_2 : SIGN? UREAL_2;
fragment REAL_8 : SIGN? UREAL_8;
fragment REAL_10 : SIGN? UREAL_10;
fragment REAL_16 : SIGN? UREAL_16;
fragment UREAL_2 : UINTEGER_2 ('/' UINTEGER_2)?;
fragment UREAL_8 : UINTEGER_8 ('/' UINTEGER_8)?;
fragment UREAL_10 : UINTEGER_10 ('/' UINTEGER_10)? | DECIMAL_10;
fragment UREAL_16 : UINTEGER_16 ('/' UINTEGER_16)?;

fragment DECIMAL_10
  :  UINTEGER_10 SUFFIX
  |  '.' DIGIT+ '#'* SUFFIX?
  |  DIGIT+ '.' DIGIT* '#'* SUFFIX?
  |  DIGIT+ '#'+ '.' '#'* SUFFIX?
  ;

fragment UINTEGER_2 : DIGIT_2+ '#'*;
fragment UINTEGER_8 : DIGIT_8+ '#'*;
fragment UINTEGER_10 : DIGIT+ '#'*;
fragment UINTEGER_16 : DIGIT_16+ '#'*;
fragment PREFIX_2 : RADIX_2 EXACTNESS? | EXACTNESS RADIX_2;
fragment PREFIX_8 : RADIX_8 EXACTNESS? | EXACTNESS RADIX_8;
fragment PREFIX_10 : RADIX_10 EXACTNESS? | EXACTNESS RADIX_10;
fragment PREFIX_16 : RADIX_16 EXACTNESS? | EXACTNESS RADIX_16;
fragment SUFFIX : EXPONENT_MARKER SIGN? DIGIT+;
fragment EXPONENT_MARKER : 'e' | 's' | 'f' | 'd' | 'l' | 'E' | 'S' | 'F' | 'D' | 'L';
fragment SIGN : '+' | '-';
fragment EXACTNESS : '#' ('i' | 'e' | 'I' | 'E');
fragment RADIX_2 : '#' ('b' | 'B');
fragment RADIX_8 : '#' ('o' | 'O');
fragment RADIX_10 : '#' ('d' | 'D');
fragment RADIX_16 : '#' ('x' | 'X');
fragment DIGIT_2 : '0' | '1';
fragment DIGIT_8 : '0'..'7';
fragment DIGIT_16 : DIGIT | 'a'..'f' | 'A'..'F';