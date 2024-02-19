#!/bin/bash

CWD=$(git rev-parse --show-toplevel)
source "$CWD/sh/common.sh"

# Compile and then run the program.
javac "$PROG.java"

TEXT_DIR=txt

OUTPUT=$TEXT_DIR/stdout.txt
INPUT=$TEXT_DIR/stdin.txt

echo "Running '$PROG' (command-line: '$*')."
java "$PROG" "$@" < $INPUT > $OUTPUT || true
echo "'$PROG' exited $?."

EXPECTED=$TEXT_DIR/expected.txt

echo "Comparing '$OUTPUT' and '$EXPECTED'."
delim
if diff -y -W 80 $OUTPUT $EXPECTED; then
	delim
	echo "Output (left) matches expected (right)."
else
	delim
	echo "Output (left) and expected (right) differ!"
fi
