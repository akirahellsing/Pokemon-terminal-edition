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
        pressEnter();

        System.out.println("    'This world is inhabited by creatures called'");
        System.out.println("    'POKEMON! For some people, they are pets.'");
        System.out.println("    'Others use them for battles. But first...'");
        System.out.println();
        pressEnter();

        System.out.println("    'Tell me, what is your name?'");
        System.out.println();
        System.out.print("> ");
        String playerName = sc.nextLine().trim();
        if (playerName.isEmpty()) playerName = "Red";

        player = new Player(playerName);

        limparTela();
        System.out.println();
        System.out.println("    'Right! Your name is " + player.name + "!'");
        System.out.println();
        pressEnter();

        System.out.println("    'This is my grandson. He has been your rival'");
        System.out.println("    'since you were babies. What is his name?'");
        System.out.println();
        System.out.print("> ");
        rivalName = sc.nextLine().trim();
        if (rivalName.isEmpty()) rivalName = "Blue";

        limparTela();
        System.out.println();
        System.out.println("    'Right! Your rival's name is " + rivalName + "!'");
        System.out.println();
        pressEnter();

        escolherInicial();

        limparTela();
        System.out.println();
        System.out.println("    " + rivalName + ": 'Wait up, " + player.name + "!'");
        System.out.println("    'I'll choose the POKEMON that's strong against yours!'");
        System.out.println();
        pressEnter();

        System.out.println("    " + rivalName + " chose " + rivalPokemon.name + "!");
        System.out.println();
        pressEnter();

        System.out.println("    'Let's see who is the better trainer!'");
        System.out.println();
        pressEnter();

        Battle battle = new Battle(sc);
        boolean playerWon = battle.start(player.getFirstPokemon(), rivalPokemon);

        if (playerWon) {
            posBattleDialogue();
        } else {
            limparTela();
            System.out.println();
            System.out.println("    " + rivalName + ": 'Haha! I knew I was better!'");
            System.out.println("    'Go train more and come back!'");
            System.out.println();
            pressEnter();
            System.out.println("    === GAME OVER ===");
            System.out.println();
            System.out.println("    Press ENTER to exit...");
            sc.nextLine();
        }
    }

    private void posBattleDialogue() {
        limparTela();
        System.out.println();
        System.out.println("    Professor Oak:");
        System.out.println("    'Congratulations, " + player.name + "!'");
        System.out.println("    'You won your first battle!'");
        System.out.println();
        pressEnter();

        System.out.println("    'Here, take this. It is a POKEDEX.'");
        System.out.println("    'It automatically records data on POKEMON'");
        System.out.println("    'you have seen or caught.'");
        System.out.println();
        pressEnter();

        player.hasPokedex = true;
        System.out.println("    >>> " + player.name + " received the POKEDEX! <<<");
        System.out.println();
        pressEnter();

        System.out.println("    'And take these too. They are POKE BALLS.'");
        System.out.println("    'You can use them to catch wild POKEMON.'");
        System.out.println();
        pressEnter();

        player.bag.addPokeBalls(5);
        System.out.println("    >>> " + player.name + " received 5 POKE BALLS! <<<");
        System.out.println();
        pressEnter();

        System.out.println("    'Your POKE BALLS are stored in your BAG.'");
        System.out.println("    'During battle, choose ITEMS to access them.'");
        System.out.println();
        pressEnter();

        System.out.println("    'Remember: the weaker the wild POKEMON is,'");
        System.out.println("    'the easier it is to catch!'");
        System.out.println("    'Lower HP means higher catch rate!'");
        System.out.println();
        pressEnter();

        System.out.println("    'Now go explore ROUTE 1 and catch some POKEMON!'");
        System.out.println();
        pressEnter();

        exploreRoute1();
    }

    private void exploreRoute1() {
        boolean exploring = true;
        while (exploring) {
            limparTela();
            System.out.println();
            System.out.println("    ╔══════════════════════════════════════╗");
            System.out.println("    ║           R O U T E   1              ║");
            System.out.println("    ╠══════════════════════════════════════╣");
            System.out.println("    ║  Tall grass rustles in the breeze.   ║");
            System.out.println("    ║  The path leads to Viridian City.    ║");
            System.out.println("    ╚══════════════════════════════════════╝");
            System.out.println();
            System.out.println("    [1] Walk in tall grass");
            System.out.println("    [2] Open menu");
            System.out.println("    [3] Return to Pallet Town");
            System.out.println();
            System.out.print("> ");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    // 30% chance of wild encounter
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
                        pressEnter();
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
                    pressEnter();
                    exploring = false;
                    break;
                default:
                    System.out.println("    Invalid choice!");
                    pressEnter();
            }
        }

        limparTela();
        System.out.println();
        System.out.println("    === THANKS FOR PLAYING ===");
        System.out.println();
        System.out.println("    Press ENTER to exit...");
        sc.nextLine();
    }

    private void showRouteMenu() {
        boolean inMenu = true;
        while (inMenu) {
            limparTela();
            System.out.println();
            System.out.println("    ╔══════════════════════════════════════╗");
            System.out.println("    ║              M E N U                 ║");
            System.out.println("    ╠══════════════════════════════════════╣");
            System.out.println("    ║  [1] POKEMON                         ║");
            System.out.println("    ║  [2] BAG                             ║");
            System.out.println("    ║  [3] POKEDEX                         ║");
            System.out.println("    ║  [4] SAVE                            ║");
            System.out.println("    ║  [0] CLOSE                           ║");
            System.out.println("    ╚══════════════════════════════════════╝");
            System.out.println();
            System.out.print("> ");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    limparTela();
                    System.out.println();
                    System.out.println("    P O K É M O N   T E A M");
                    System.out.println("    ─────────────────────────");
                    player.displayParty();
                    System.out.println();
                    pressEnter();
                    break;
                case "2":
                    limparTela();
                    System.out.println();
                    System.out.println("    B A G");
                    System.out.println("    ─────────────────────────");
                    player.bag.display();
                    System.out.println();
                    pressEnter();
                    break;
                case "3":
                    if (player.hasPokedex) {
                        limparTela();
                        System.out.println();
                        System.out.println("    P O K É D E X");
                        System.out.println("    ─────────────────────────");
                        System.out.println("    (Pokedex viewing not yet implemented)");
                        System.out.println();
                        pressEnter();
                    } else {
                        limparTela();
                        System.out.println();
                        System.out.println("    You don't have a POKEDEX yet!");
                        System.out.println();
                        pressEnter();
                    }
                    break;
                case "4":
                    limparTela();
                    System.out.println();
                    System.out.println("    (Save not yet implemented)");
                    System.out.println();
                    pressEnter();
                    break;
                case "0":
                    inMenu = false;
                    break;
                default:
                    System.out.println("    Invalid choice!");
                    pressEnter();
            }
        }
    }

    private void escolherInicial() {
        limparTela();
        System.out.println();
        System.out.println("    Professor Oak:");
        System.out.println("    'It's time to choose your first POKEMON!'");
        System.out.println();
        System.out.println("    [1] Bulbasaur  - Grass/Poison  - A solid defender");
        System.out.println("    [2] Charmander - Fire           - Strong attacker");
        System.out.println("    [3] Squirtle   - Water          - Well balanced");
        System.out.println();
        System.out.print("> ");

        String escolha = sc.nextLine().trim();
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
                escolherInicial();
                return;
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
        pressEnter();
    }

    private void pressEnter() {
        System.out.println("    Press ENTER to continue...");
        sc.nextLine();
        limparTela();
    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
