#!/bin/bash
cd "$(dirname "$0")"

echo "Compilando o projeto..."
javac -d build src/*.java

if [ $? -eq 0 ]; then
    echo "Iniciando o Pokémon Terminal Edition..."
    java -cp build Main
else
    echo "Erros encontrados na compilação!"
fi
