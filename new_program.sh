#!/bin/bash

set -e

OUT="$1.java"
echo "Creating '$OUT'."

set -x
cp Boilerplate.java "$OUT"
set +x

echo "Success."
