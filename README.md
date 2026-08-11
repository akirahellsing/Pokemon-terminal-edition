# Pokemon Terminal Edition

Jogo de Pokemon feito em Java para rodar no terminal. Sem cores, sem ASCII de Pokemon individuais, so texto puro e batalha por turnos.

---

## Requisitos

- **Java JDK 17** ou superior instalado
- Terminal / Prompt de Comando

### Como instalar o Java

**Windows:**
Baixe em https://adoptium.net/ e instale o JDK 17+ (ou 21+).

**Linux (Ubuntu/Debian):**
```bash
sudo apt update
sudo apt install default-jdk
```

**Linux (Fedora):**
```bash
sudo dnf install java-latest-openjdk-devel
```

**Mac:**
```bash
brew install openjdk@17
```

---

## Como baixar

1. Va em https://github.com/akirahellsing/pokemon-terminal-edition
2. Clique no botao verde **"<> Code"**
3. Clique em **"Download ZIP"**
4. Extraia a pasta para qualquer lugar (Desktop, Documentos, etc.)

---

## Como jogar

### Windows

1. Entre na pasta extraida
2. De **dois cliques** no arquivo `run.bat`
3. O jogo abre no terminal automaticamente

> Se o antivirus bloquear, clique em "Mais informacoes" -> "Executar assim mesmo".

---

### Linux

**O jeito mais facil e garantido:**

1. Abra o terminal
2. Va ate a pasta do jogo:
```bash
cd /caminho/para/pokemon-terminal-edition
```
3. Execute:
```bash
./run.sh
```

**Alternativa pelo icone (nem sempre funciona):**
- Clique com o botao direito em `Pokemon-Terminal.desktop`
- Va em **Propriedades** -> **Permissoes**
- Marque **"Permitir execucao como programa"**
- Feche e de dois cliques no icone

> Nota: Algumas distribuicoes Linux nao permitem executar .desktop por seguranca. Use o terminal se o icone nao funcionar.

---

### Mac

1. Abra o Terminal
2. Va ate a pasta do jogo:
```bash
cd /caminho/para/pokemon-terminal-edition
```
3. Execute:
```bash
./run.sh
```

---

## Controles durante o jogo

- **ENTER** para confirmar / avancar dialogos
- **1, 2, 3, 4** para escolher opcoes
- **W / S** ou setas para navegar nos menus (quando disponivel)

---

## O que tem na demo

- Tela de titulo com arte ASCII
- Introducao do Professor Oak
- Escolha do nome do jogador e do rival
- Escolha do Pokemon inicial (Bulbasaur, Charmander, Squirtle)
- Batalha automatica contra o rival com o Pokemon counter
- Sistema de batalha por turnos com:
  - 15 tipos de Pokemon com vantagens/desvantagens
  - Moves com PP, power, accuracy, priority
  - Status conditions (burn, paralysis, poison, sleep, confusion, flinch)
  - Stat stages (attack, defense, speed, accuracy, evasion up/down)
  - STAB, type effectiveness, critical hits
  - Level up com ganho de EXP e novos moves

---

## Erros comuns

### "javac: command not found" ou "java: command not found"
O Java nao esta instalado ou nao esta no PATH. Instale o JDK pelo link acima e reinicie o terminal.

### "Permission denied" no Linux/Mac
De permissao de execucao ao script:
```bash
chmod +x run.sh
```

### "Error: Could not find or load main class Main"
O JAR esta corrompido ou faltando. Baixe o projeto novamente.

### "Unable to access jarfile pokemon.jar"
Voce esta na pasta errada. Certifique-se de estar na mesma pasta do arquivo `pokemon.jar`.

---

## Compilar do codigo fonte (para desenvolvedores)

Se quiser compilar voce mesmo:

```bash
cd src/
javac *.java
jar cfm pokemon.jar MANIFEST.MF *.class
java -jar pokemon.jar
```

---
