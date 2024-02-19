#!/bin/bash

set -e

# Change the program that should run here.
# shellcheck disable=SC1091
source "$CWD/sh/setme.sh"

pushd "$CWD" >/dev/null || exit

teardown() {
	# Remove compiled artifacts.
	rm -f ./*.class

	popd >/dev/null || exit
}

trap teardown EXIT

delim() {
	echo "================================================================"
}
