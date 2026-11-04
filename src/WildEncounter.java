import java.util.Random;

public class WildEncounter {
    private static Random rand = new Random();

    public static Pokemon generateRoute1() {
        Pokedex dex = new Pokedex();
        int level = 2 + rand.nextInt(4);
        if (rand.nextBoolean()) {
            return dex.criarPokemon("Pidgey", level);
        } else {
            return dex.criarPokemon("Rattata", level);
        }
    }
}