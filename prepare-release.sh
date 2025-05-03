#!/bin/bash
set -e

NEXT_VERSION=$1
echo "Updating Maven project version to ${NEXT_VERSION}"

JAR_VERSION=$(echo "${NEXT_VERSION}" | sed 's/^v//')
echo "Jar version: ${JAR_VERSION}"

mvn versions:set -DnewVersion=${JAR_VERSION} -DgenerateBackupPoms=false

echo "Building the project..."
mvn package

echo "Copying the built artifact to release folder..."
mkdir -p target/release
cp target/*.jar target/release/

printenv




