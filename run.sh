#!/bin/bash

PROG=Bmi
# don't put .java
#  -Orig line says:  PROG=Main
#  Main (or whatever is here) needs to be replaced with the name of the
#  java file you are trying to run

javac $PROG.java
java $PROG "$@"
