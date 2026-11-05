import java.util.Scanner;
import java.util.Random;

public class StadiumMode {
    public static void iniciar(Scanner scanner) {
        limparTela();
        System.out.println("\n========================================");
        System.out.println("       WELCOME TO THE POKEMON STADIUM   ");
        System.out.println("                                        ");
        System.out.println("========================================");

        Pokemon[] roster = {
                new Pokemon(6, "Charizard", "Fire/Flying", 78, 84, 78, 100, 50),
                new Pokemon(9, "Blastoise", "Water", 79, 83, 100, 78, 50),
                new Pokemon(3, "Venusaur", "Grass/Poison", 80, 82, 83, 80, 50),
                new Pokemon(25, "Pikachu", "Electric", 35, 55, 40, 90, 50),
                new Pokemon(143, "Snorlax", "Normal", 160, 110, 65, 30, 50),
                new Pokemon(94, "Gengar", "Ghost/Poison", 60, 65, 60, 110, 50)
        };

        roster[0].setMove(0, new Move("Flamethrower", PokemonType.FIRE, 90, 100, 99, 0, null, 0, 0));
        roster[0].setMove(1, new Move("Air Slash", PokemonType.FLYING, 75, 95, 99, 0, null, 0, 0));
        roster[0].setMove(2, new Move("Dragon Claw", PokemonType.DRAGON, 80, 100, 99, 0, null, 0, 0));
        roster[0].setMove(3, new Move("Swords Dance", PokemonType.NORMAL, 0, 100, 99, 0, MoveCondition.STAT_ATTACK_UP, 2, 0));

        roster[1].setMove(0, new Move("Surf", PokemonType.WATER, 90, 100, 99, 0, null, 0, 0));
        roster[1].setMove(1, new Move("Ice Beam", PokemonType.ICE, 90, 100, 99, 0, null, 0, 0));
        roster[1].setMove(2, new Move("Hydro Pump", PokemonType.WATER, 110, 80, 99, 0, null, 0, 0));
        roster[1].setMove(3, new Move("Defense Curl", PokemonType.NORMAL, 0, 100, 99, 0, MoveCondition.STAT_DEFENSE_UP, 1, 0));

        roster[2].setMove(0, new Move("Solar Beam", PokemonType.GRASS, 120, 100, 99, 0, null, 0, 0));
        roster[2].setMove(1, new Move("Sludge Bomb", PokemonType.POISON, 90, 100, 99, 0, null, 0, 0));
        roster[2].setMove(2, new Move("Giga Drain", PokemonType.GRASS, 75, 100, 99, 0, null, 0, 0));
        roster[2].setMove(3, new Move("Synthesis", PokemonType.GRASS, 0, 100, 99, 0, MoveCondition.HEAL, 50, 0));

        roster[3].setMove(0, new Move("Thunderbolt", PokemonType.ELECTRIC, 90, 100, 99, 0, null, 0, 0));
        roster[3].setMove(1, new Move("Quick Attack", PokemonType.NORMAL, 40, 100, 99, 1, null, 0, 0));
        roster[3].setMove(2, new Move("Skull Bash", PokemonType.NORMAL, 130, 100, 99, 0, null, 0, 0));
        roster[3].setMove(3, new Move("Agility", PokemonType.PSYCHIC, 0, 100, 99, 0, MoveCondition.STAT_SPEED_UP, 2, 0));

        roster[4].setMove(0, new Move("Body Slam", PokemonType.NORMAL, 85, 100, 99, 0, null, 0, 0));
        roster[4].setMove(1, new Move("Earthquake", PokemonType.GROUND, 100, 100, 99, 0, null, 0, 0));
        roster[4].setMove(2, new Move("Hyper Beam", PokemonType.NORMAL, 150, 90, 99, 0, null, 0, 0));
        roster[4].setMove(3, new Move("Rest", PokemonType.PSYCHIC, 0, 100, 99, 0, MoveCondition.HEAL, 100, 0));

        roster[5].setMove(0, new Move("Shadow Ball", PokemonType.GHOST, 80, 100, 99, 0, null, 0, 0));
        roster[5].setMove(1, new Move("Sludge Bomb", PokemonType.POISON, 90, 100, 99, 0, null, 0, 0));
        roster[5].setMove(2, new Move("Psychic", PokemonType.PSYCHIC, 90, 100, 99, 0, null, 0, 0));
        roster[5].setMove(3, new Move("Hypnosis", PokemonType.PSYCHIC, 0, 60, 99, 0, MoveCondition.SLEEP, 0, 0));

        System.out.println("\nSelect your Pokémon for the test battle:");
        for (int i = 0; i < roster.length; i++) {
            Pokemon p = roster[i];
            System.out.println((i + 1) + " - " + p.name.toUpperCase() + " [" + p.type + "] (HP: " + p.calcMaxHp() + ")");
        }
        System.out.println("0 - Return to Main Menu");

        System.out.print("\nEnter your choice (0-" + roster.length + "): ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha == 0) {
            limparTela();
            return;
        }

        int index = escolha - 1;
        if (index < 0 || index >= roster.length) {
            limparTela();
            System.out.println("Invalid choice! Returning to main menu.");
            return;
        }

        Pokemon playerPokemon = roster[index];

        Random random = new Random();
        int oponenteIndex;
        do {
            oponenteIndex = random.nextInt(roster.length);
        } while (oponenteIndex == index);

        Pokemon aiPokemon = roster[oponenteIndex];

        Battle battle = new Battle(scanner);
        battle.start(playerPokemon, aiPokemon);
        limparTela();
    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}