@echo off
chcp 65001 >nul
title Pokemon Terminal Edition
cd /d "%~dp0"

echo ==========================================
echo    POKEMON TERMINAL EDITION
echo ==========================================
echo.

java -jar pokemon.jar

if %errorlevel% neq 0 (
    echo.
    echo [ERRO] Nao foi possivel rodar o jogo.
    echo Verifique se o Java esta instalado.
    pause
)
