#!/bin/bash

PROG=Main
# don't put .java

javac $PROG.java
java $PROG "$@"
