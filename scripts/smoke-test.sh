#!/bin/bash

echo "Running Smoke Test..."
curl -f http://localhost:8080/health || exit 1
echo "Smoke Test Passed!"