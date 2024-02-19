#!/bin/bash

CWD=$(git rev-parse --show-toplevel)
source "$CWD/sh/common.sh"

OUT="$1.java"
echo "Creating '$OUT'."

set -x
cp Boilerplate.java "$OUT"
sed -i -e "s/Boilerplate/$1/g" "$OUT"
set +x

echo "Setting new program as the default to run (via 'sh/setme.sh')."

{
echo "export PROG=$1";
echo "# don't put .java";
echo "#  -Orig line says:  PROG=Main";
echo "#  Main (or whatever is here) needs to be replaced with the name of the";
echo "#  java file you are trying to run";
} > sh/setme.sh

echo "Success."
