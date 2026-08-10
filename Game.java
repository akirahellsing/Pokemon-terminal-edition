import java.util.Scanner;

public class Game {
    private Scanner sc;
    private String playerName;
    private String rivalName;
    private Pokemon playerPokemon;
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
        playerName = sc.nextLine().trim();
        if (playerName.isEmpty()) playerName = "Red";

        limparTela();
        System.out.println();
        System.out.println("    'Right! Your name is " + playerName + "!'");
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
        System.out.println("    " + rivalName + ": 'Wait up, " + playerName + "!'");
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
        battle.start(playerPokemon, rivalPokemon);

        limparTela();
        System.out.println();
        System.out.println("    === END OF DEMO ===");
        System.out.println("    (Battle test mode finished)");
        System.out.println();
        System.out.println("    Press ENTER to exit...");
        sc.nextLine();
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
                playerPokemon = dex.criarPokemon("Bulbasaur", 5);
                rivalPokemon = dex.criarPokemon("Charmander", 5);
                break;
            case "2":
                playerPokemon = dex.criarPokemon("Charmander", 5);
                rivalPokemon = dex.criarPokemon("Squirtle", 5);
                break;
            case "3":
                playerPokemon = dex.criarPokemon("Squirtle", 5);
                rivalPokemon = dex.criarPokemon("Bulbasaur", 5);
                break;
            default:
                System.out.println("    'Pick one right, doc! Type 1, 2 or 3.'");
                escolherInicial();
                return;
        }

        limparTela();
        System.out.println();
        System.out.println("    " + playerName + " chose " + playerPokemon.name + "!");
        System.out.println();
        playerPokemon.exibir();
        System.out.println();
        System.out.println("    Available moves:");
        playerPokemon.listMoves();
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