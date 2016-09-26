package main.src;

import java_cup.runtime.*;
import main.src.*;
import main.src.ast.*;

/*User Code*/


%%

%public
%class Lexer
%unicode
%cup
%line
%column	
%eofval{
   {return new Symbol(Sym.EOF, yyline, yycolumn, "");}
%eofval}

LineTerminator = \r|\n|\r\n

WhiteSpace = {LineTerminator}|[ \s\t\f]
	
Comment={TraditionalComment}|{EndOfLineComment}
	
TraditionalComment = "/*"[^*]~"*/"|"/*""*"+"/"
EndOfLineComment = "//".*

Identifier = [a-zA-Z][a-zA-Z0-9_]* 

IntegerLiteral = [0-9]+	
FloatLiteral = ([0-9]+"."[0-9]+)


	
%%
<YYINITIAL> {
	/*Lexical Rules*/
	
		/*Keywords*/

	"break"			{return new Symbol(Sym.BREAK, yyline, yycolumn, yytext());}
	"class"			{return new Symbol(Sym.CLASS, yyline, yycolumn, yytext());}
	"continue"		{return new Symbol(Sym.CONTINUE, yyline, yycolumn, yytext());}
	"else"			{return new Symbol(Sym.ELSE, yyline, yycolumn, yytext());}
	"for"			{return new Symbol(Sym.FOR, yyline, yycolumn, yytext());}
	"if"			{return new Symbol(Sym.IF, yyline, yycolumn, yytext());}
	"return"		{return new Symbol(Sym.RETURN, yyline, yycolumn, yytext());}
	"while"			{return new Symbol(Sym.WHILE, yyline, yycolumn, yytext());}
	"extern"		{return new Symbol(Sym.EXTERN, yyline, yycolumn, yytext());}
	"void"			{return new Symbol(Sym.VOID, yyline, yycolumn, yytext());}
	"bool" 			{return new Symbol(Sym.BOOL, yyline, yycolumn, yytext());}
	"float"			{return new Symbol(Sym.FLOAT, yyline, yycolumn, yytext());}
	"integer"		{return new Symbol(Sym.INTEGER, yyline, yycolumn, yytext());}
	"true|false"    {return new Symbol(Sym.BOOL_LITERAL, new BoolLiteral(yytext(), yyline, yycolumn));}


		/*Delimiters*/

	"("					{return new Symbol(Sym.LPAREN, yyline, yycolumn, yytext());}
	")"					{return new Symbol(Sym.RPAREN, yyline, yycolumn, yytext());}
	"{"					{return new Symbol(Sym.LBRACE, yyline, yycolumn, yytext());}
	"}"					{return new Symbol(Sym.RBRACE, yyline, yycolumn, yytext());}
	"["					{return new Symbol(Sym.LBRACK, yyline, yycolumn, yytext());}	
	"]"					{return new Symbol(Sym.RBRACK, yyline, yycolumn, yytext());}

	";"					{return new Symbol(Sym.SEMICOLON, yyline, yycolumn, yytext());}
	","					{return new Symbol(Sym.COMMA, yyline, yycolumn, yytext());}
	"."					{return new Symbol(Sym.DOT, yyline, yycolumn, yytext());}

		/*Operators*/

  	"+"					{return new Symbol(Sym.PLUS, yyline, yycolumn, yytext());}
  	"-"				    {return new Symbol(Sym.MINUS, yyline, yycolumn, yytext());}
  	"*"					{return new Symbol(Sym.MULT, yyline, yycolumn, yytext());}
	"/"					{return new Symbol(Sym.DIV, yyline, yycolumn, yytext());}
  	"%"				    {return new Symbol(Sym.MOD, yyline, yycolumn, yytext());}

  	">"					{return new Symbol(Sym.GT, yyline, yycolumn, yytext());}
  	"<"				    {return new Symbol(Sym.LT, yyline, yycolumn, yytext());}
  	"<="			    {return new Symbol(Sym.LTEQ, yyline, yycolumn, yytext());}
  	">="			    {return new Symbol(Sym.GTEQ, yyline, yycolumn, yytext());}
  	"=="			    {return new Symbol(Sym.EQEQ, yyline, yycolumn, yytext());}
  	"!="			    {return new Symbol(Sym.NOTEQ, yyline, yycolumn, yytext());}
	
 	"&&"				{return new Symbol(Sym.ANDAND, yyline, yycolumn, yytext());}
  	"||"		        {return new Symbol(Sym.OROR, yyline, yycolumn, yytext());}
  	"!"				    {return new Symbol(Sym.NOT, yyline, yycolumn, yytext());}

	"="					{return new Symbol(Sym.ASSIGN, yyline, yycolumn, yytext());}
  	"+="			    {return new Symbol(Sym.INC, yyline, yycolumn, yytext());}
  	"-="			    {return new Symbol(Sym.DEC, yyline, yycolumn, yytext());}

		/*Literals*/

	{IntegerLiteral}			{return new Symbol(Sym.INT_LITERAL, new IntLiteral(yytext(), yyline, yycolumn));}
	{FloatLiteral}   			{return new Symbol(Sym.FLOAT_LITERAL, new FloatLiteral( yytext(), yyline, yycolumn));}

		/*Identifiers*/

	{Identifier} 				{return new Symbol(Sym.ID, yyline, yycolumn, yytext());}

		/*Comment*/

	{Comment}					{}
	{LineTerminator}			{}
	{WhiteSpace}				{} 

		/*Error*/

	. { System.out.println("Invalid symbol " + yytext()+"Line: "+yyline+"Column: "+yycolumn);}
}