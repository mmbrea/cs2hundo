#!/bin/bash

CWD=$(git rev-parse --show-toplevel)
source "$CWD/sh/common.sh"

# Compile and then run the program.
javac -Xlint:all -encoding utf-8 "$PROG.java"

echo "Running '$PROG' (command-line: '$*')."
java "$PROG" "$@" || true
echo "'$PROG' exited $?."
