import java.util.Scanner;

public class Game {
    private Scanner sc;
    private Player player;
    private String rivalName;
    private Pokemon rivalPokemon;

    public Game(Scanner sc) {
        this.sc = sc;
    }

    public void start() {
        limparTela();
        System.out.println();
        System.out.println("                    Professor Oak:");
        System.out.println("    'Hello! Welcome to the world of POKEMON!'");
        System.out.println("    'My name is OAK.'");
        System.out.println("    'People call me the POKEMON PROFESSOR.'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        System.out.println("    'This world is inhabited by creatures called'");
        System.out.println("    'POKEMON! For some people, they are pets.'");
        System.out.println("    'Others use them for battles. But first...'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        System.out.println("    'Tell me, what is your name?'");
        System.out.println();
        System.out.print("> ");
        String inputName = sc.nextLine().trim();
        if (checkExit(inputName)) return;
        if (inputName.isEmpty()) inputName = "Red";

        player = new Player(inputName);

        limparTela();
        System.out.println();
        System.out.println("    'Right! Your name is " + player.name + "!'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        System.out.println("    'This is my grandson. He has been your rival'");
        System.out.println("    'since you were babies. What is his name?'");
        System.out.println();
        System.out.print("> ");
        String inputRival = sc.nextLine().trim();
        if (checkExit(inputRival)) return;
        rivalName = inputRival.isEmpty() ? "Blue" : inputRival;

        limparTela();
        System.out.println();
        System.out.println("    'Right! Your rival's name is " + rivalName + "!'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        if (!escolherInicial()) return;

        limparTela();
        System.out.println();
        System.out.println("    " + rivalName + ": 'Wait up, " + player.name + "!'");
        System.out.println("    'I'll choose the POKEMON that's strong against yours!'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        System.out.println("    " + rivalName + " chose " + rivalPokemon.name + "!");
        System.out.println();
        if (!pressEnterOrExit()) return;

        System.out.println("    'Let's see who is the better trainer!'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        Pokemon rivalBuffed = new Pokemon(rivalPokemon.number, rivalPokemon.name, rivalPokemon.type, rivalPokemon.hp + 15, rivalPokemon.atk + 8, rivalPokemon.def + 8, rivalPokemon.spd + 8, 5);
        for (int i = 0; i < 4; i++) {
            Move m = rivalPokemon.getMove(i);
            if (m != null) rivalBuffed.setMove(i, m);
        }

        Battle battle = new Battle(sc);
        boolean playerWon = battle.start(player.getFirstPokemon(), rivalBuffed);

        if (playerWon) {
            posBattleDialogue();
        } else {
            limparTela();
            System.out.println();
            System.out.println("    " + rivalName + ": 'Haha! I knew I was better!'");
            System.out.println("    'Go train more and come back!'");
            System.out.println();
            pressEnterOrExit();
        }
    }

    private void posBattleDialogue() {
        limparTela();
        System.out.println();
        System.out.println("    Professor Oak:");
        System.out.println("    'Congratulations, " + player.name + "!'");
        System.out.println("    'You won your first battle!'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        System.out.println("    'Here, take this. It is a POKEDEX.'");
        System.out.println("    'It automatically records data on POKEMON'");
        System.out.println("    'you have seen or caught.'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        player.hasPokedex = true;
        System.out.println("    >>> " + player.name + " received the POKEDEX! <<<");
        System.out.println();
        if (!pressEnterOrExit()) return;

        System.out.println("    'And take these too. They are POKE BALLS.'");
        System.out.println("    'You can use them to catch wild POKEMON.'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        player.bag.addPokeBalls(5);
        System.out.println("    >>> " + player.name + " received 5 POKE BALLS! <<<");
        System.out.println();
        if (!pressEnterOrExit()) return;

        System.out.println("    'Your POKE BALLS are stored in your BAG.'");
        System.out.println("    'During battle, choose ITEMS to access them.'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        System.out.println("    'Remember: the weaker the wild POKEMON is,'");
        System.out.println("    'the easier it is to catch!'");
        System.out.println("    'Lower HP means higher catch rate!'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        System.out.println("    'Now go explore ROUTE 1 and catch some POKEMON!'");
        System.out.println();
        if (!pressEnterOrExit()) return;

        exploreRoute1();
    }

    private void exploreRoute1() {
        boolean exploring = true;
        while (exploring) {
            limparTela();
            System.out.println();
            System.out.println("    ╔══════════════════════════════════════╗");
            System.out.println("    ║            R O U T E   1             ║");
            System.out.println("    ╠══════════════════════════════════════╣");
            System.out.println("    ║   Tall grass rustles in the breeze.  ║");
            System.out.println("    ║   The path leads to Viridian City.   ║");
            System.out.println("    ╚══════════════════════════════════════╝");
            System.out.println();
            System.out.println("    [1] Walk in tall grass");
            System.out.println("    [2] Open menu");
            System.out.println("    [3] Return to Pallet Town");
            System.out.println();
            System.out.print("> ");

            String choice = sc.nextLine().trim();
            if (checkExit(choice)) return;

            switch (choice) {
                case "1":
                    if (Math.random() < 0.3) {
                        Pokemon wild = WildEncounter.generateRoute1();
                        WildBattle wb = new WildBattle(sc, player);
                        wb.start(wild);
                    } else {
                        limparTela();
                        System.out.println();
                        System.out.println("    You walked through the tall grass...");
                        System.out.println("    Nothing appeared.");
                        System.out.println();
                        if (!pressEnterOrExit()) return;
                    }
                    break;
                case "2":
                    showRouteMenu();
                    break;
                case "3":
                    limparTela();
                    System.out.println();
                    System.out.println("    You returned to Pallet Town.");
                    System.out.println();
                    pressEnterOrExit();
                    exploring = false;
                    break;
                default:
                    System.out.println("    Invalid choice!");
                    if (!pressEnterOrExit()) return;
            }
        }
    }

    private void showRouteMenu() {
        boolean inMenu = true;
        while (inMenu) {
            limparTela();
            System.out.println();
            System.out.println("    ╔══════════════════════════════════════╗");
            System.out.println("    ║               M E N U                ║");
            System.out.println("    ╠══════════════════════════════════════╣");
            System.out.println("    ║   [1] POKEMON                        ║");
            System.out.println("    ║   [2] BAG                            ║");
            System.out.println("    ║   [3] POKEDEX                        ║");
            System.out.println("    ║   [4] SAVE                           ║");
            System.out.println("    ║   [0] CLOSE                          ║");
            System.out.println("    ╚══════════════════════════════════════╝");
            System.out.println();
            System.out.print("> ");

            String choice = sc.nextLine().trim();
            if (checkExit(choice)) return;

            switch (choice) {
                case "1":
                    limparTela();
                    System.out.println();
                    System.out.println("    P O K É M O N   T E A M");
                    System.out.println("    ─────────────────────────");
                    player.displayParty();
                    System.out.println();
                    pressEnterOrExit();
                    break;
                case "2":
                    limparTela();
                    System.out.println();
                    System.out.println("    B A G");
                    System.out.println("    ─────────────────────────");
                    player.bag.display();
                    System.out.println();
                    pressEnterOrExit();
                    break;
                case "3":
                    if (player.hasPokedex) {
                        limparTela();
                        System.out.println();
                        System.out.println("    P O K É D E X");
                        System.out.println("    ─────────────────────────");
                        System.out.println("    (Pokedex viewing not yet implemented)");
                        System.out.println();
                        pressEnterOrExit();
                    } else {
                        limparTela();
                        System.out.println();
                        System.out.println("    You don't have a POKEDEX yet!");
                        System.out.println();
                        pressEnterOrExit();
                    }
                    break;
                case "4":
                    limparTela();
                    System.out.println();
                    System.out.println("    (Save not yet implemented)");
                    System.out.println();
                    pressEnterOrExit();
                    break;
                case "0":
                    inMenu = false;
                    break;
                default:
                    System.out.println("    Invalid choice!");
                    pressEnterOrExit();
            }
        }
    }

    private boolean escolherInicial() {
        limparTela();
        System.out.println();
        System.out.println("    Professor Oak:");
        System.out.println("    'It's time to choose your first POKEMON!'");
        System.out.println();
        System.out.println("    [1] Bulbasaur  - Grass/Poison  - A solid defender");
        System.out.println("    [2] Charmander - Fire            - Strong attacker");
        System.out.println("    [3] Squirtle   - Water           - Well balanced");
        System.out.println();
        System.out.print("> ");

        String escolha = sc.nextLine().trim();
        if (checkExit(escolha)) return false;

        Pokedex dex = new Pokedex();

        switch (escolha) {
            case "1":
                player.addPokemon(dex.criarPokemon("Bulbasaur", 5));
                rivalPokemon = dex.criarPokemon("Charmander", 5);
                break;
            case "2":
                player.addPokemon(dex.criarPokemon("Charmander", 5));
                rivalPokemon = dex.criarPokemon("Squirtle", 5);
                break;
            case "3":
                player.addPokemon(dex.criarPokemon("Squirtle", 5));
                rivalPokemon = dex.criarPokemon("Bulbasaur", 5);
                break;
            default:
                System.out.println("    'Pick one right, doc! Type 1, 2 or 3.'");
                return escolherInicial();
        }

        limparTela();
        System.out.println();
        System.out.println("    " + player.name + " chose " + player.getFirstPokemon().name + "!");
        System.out.println();
        player.getFirstPokemon().exibir();
        System.out.println();
        System.out.println("    Available moves:");
        player.getFirstPokemon().listMoves();
        System.out.println();
        return pressEnterOrExit();
    }

    private boolean checkExit(String input) {
        if (input != null && input.equalsIgnoreCase("exit")) {
            limparTela();
            return true;
        }
        return false;
    }

    private boolean pressEnterOrExit() {
        System.out.println("    Press ENTER to continue (or type 'exit' to quit)...");
        String line = sc.nextLine().trim();
        if (checkExit(line)) return false;
        limparTela();
        return true;
    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}