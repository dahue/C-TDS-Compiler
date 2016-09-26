#!/bin/bash
echo "*******************  CREATING JAVA CLASSES FOR LEXER AND PARSER  ******************************************"
JAVA_FOLDER=src/main/src
if [ ! -d $JAVA_FOLDER ]; then
	mkdir src/main/src
fi

java -jar lib/jflex-1.6.1.jar -d src/main/src/ src/jflex/lexer.flex
java -jar lib/jflex-1.6.1.jar -d src/main/src/ src/jflex/lexerStandalone.flex
java -jar lib/java-cup-11b.jar -destdir src/main/src/ -parser Parser -symbols Sym src/cup/parser.cup
