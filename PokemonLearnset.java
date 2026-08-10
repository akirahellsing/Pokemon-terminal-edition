import java.util.ArrayList;
import java.util.HashMap;

public class PokemonLearnset {
    private static final HashMap<String, ArrayList<LearnsetEntry>> LEARNSETS = new HashMap<>();

    static { initLearnsets(); }

    private static void initLearnsets() {

        add("Bulbasaur",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(7, MoveDatabase.LEECH_SEED),
                new LearnsetEntry(10, MoveDatabase.VINE_WHIP),
                new LearnsetEntry(15, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(15, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(20, MoveDatabase.RAZOR_LEAF),
                new LearnsetEntry(25, MoveDatabase.SWEET_SCENT),
                new LearnsetEntry(32, MoveDatabase.GROWTH),
                new LearnsetEntry(39, MoveDatabase.SYNTHESIS),
                new LearnsetEntry(46, MoveDatabase.SOLAR_BEAM));

        add("Ivysaur",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.LEECH_SEED),
                new LearnsetEntry(10, MoveDatabase.VINE_WHIP),
                new LearnsetEntry(15, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(15, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(22, MoveDatabase.RAZOR_LEAF),
                new LearnsetEntry(29, MoveDatabase.SWEET_SCENT),
                new LearnsetEntry(38, MoveDatabase.GROWTH),
                new LearnsetEntry(47, MoveDatabase.SYNTHESIS),
                new LearnsetEntry(56, MoveDatabase.SOLAR_BEAM));

        add("Venusaur",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.LEECH_SEED),
                new LearnsetEntry(1, MoveDatabase.VINE_WHIP),
                new LearnsetEntry(15, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(15, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(22, MoveDatabase.RAZOR_LEAF),
                new LearnsetEntry(29, MoveDatabase.SWEET_SCENT),
                new LearnsetEntry(41, MoveDatabase.GROWTH),
                new LearnsetEntry(53, MoveDatabase.SYNTHESIS),
                new LearnsetEntry(65, MoveDatabase.SOLAR_BEAM));

        add("Charmander",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(7, MoveDatabase.EMBER),
                new LearnsetEntry(13, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(20, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(27, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(34, MoveDatabase.FLAMETHROWER),
                new LearnsetEntry(43, MoveDatabase.SLASH),
                new LearnsetEntry(52, MoveDatabase.DRAGON_RAGE));

        add("Charmeleon",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.EMBER),
                new LearnsetEntry(7, MoveDatabase.EMBER),
                new LearnsetEntry(13, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(20, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(27, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(34, MoveDatabase.FLAMETHROWER),
                new LearnsetEntry(41, MoveDatabase.SLASH),
                new LearnsetEntry(54, MoveDatabase.DRAGON_RAGE));

        add("Charizard",
                new LearnsetEntry(1, MoveDatabase.EMBER),
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(7, MoveDatabase.EMBER),
                new LearnsetEntry(13, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(20, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(27, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(34, MoveDatabase.FLAMETHROWER),
                new LearnsetEntry(36, MoveDatabase.WING_ATTACK),
                new LearnsetEntry(44, MoveDatabase.SLASH),
                new LearnsetEntry(54, MoveDatabase.DRAGON_RAGE),
                new LearnsetEntry(64, MoveDatabase.FIRE_SPIN));

        add("Squirtle",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(7, MoveDatabase.BUBBLE),
                new LearnsetEntry(10, MoveDatabase.WITHDRAW),
                new LearnsetEntry(13, MoveDatabase.WATER_GUN),
                new LearnsetEntry(18, MoveDatabase.BITE),
                new LearnsetEntry(23, MoveDatabase.RAPID_SPIN),
                new LearnsetEntry(28, MoveDatabase.PROTECT),
                new LearnsetEntry(33, MoveDatabase.RAIN_DANCE),
                new LearnsetEntry(40, MoveDatabase.SKULL_BASH),
                new LearnsetEntry(47, MoveDatabase.HYDRO_PUMP));

        add("Wartortle",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.BUBBLE),
                new LearnsetEntry(10, MoveDatabase.WITHDRAW),
                new LearnsetEntry(13, MoveDatabase.WATER_GUN),
                new LearnsetEntry(19, MoveDatabase.BITE),
                new LearnsetEntry(25, MoveDatabase.RAPID_SPIN),
                new LearnsetEntry(31, MoveDatabase.PROTECT),
                new LearnsetEntry(37, MoveDatabase.RAIN_DANCE),
                new LearnsetEntry(45, MoveDatabase.SKULL_BASH),
                new LearnsetEntry(53, MoveDatabase.HYDRO_PUMP));

        add("Blastoise",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.BUBBLE),
                new LearnsetEntry(1, MoveDatabase.WITHDRAW),
                new LearnsetEntry(13, MoveDatabase.WATER_GUN),
                new LearnsetEntry(19, MoveDatabase.BITE),
                new LearnsetEntry(25, MoveDatabase.RAPID_SPIN),
                new LearnsetEntry(31, MoveDatabase.PROTECT),
                new LearnsetEntry(42, MoveDatabase.RAIN_DANCE),
                new LearnsetEntry(55, MoveDatabase.SKULL_BASH),
                new LearnsetEntry(68, MoveDatabase.HYDRO_PUMP));

        add("Pikachu",
                new LearnsetEntry(1, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(6, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(11, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(20, MoveDatabase.THUNDERBOLT));

        add("Pidgey",
                new LearnsetEntry(1, MoveDatabase.GUST),
                new LearnsetEntry(5, MoveDatabase.SAND_ATTACK),
                new LearnsetEntry(13, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(19, MoveDatabase.WING_ATTACK));

        add("Geodude",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(11, MoveDatabase.ROCK_THROW),
                new LearnsetEntry(21, MoveDatabase.ROCK_SLIDE),
                new LearnsetEntry(31, MoveDatabase.EARTHQUAKE));

        add("Gastly",
                new LearnsetEntry(1, MoveDatabase.LICK),
                new LearnsetEntry(8, MoveDatabase.CONFUSION),
                new LearnsetEntry(21, MoveDatabase.SHADOW_BALL));

        add("Abra",
                new LearnsetEntry(1, MoveDatabase.CONFUSION));
    }

    private static void add(String name, LearnsetEntry... entries) {
        ArrayList<LearnsetEntry> list = new ArrayList<>();
        for (LearnsetEntry e : entries) list.add(e);
        LEARNSETS.put(name, list);
    }

    public static Move getMoveAtLevel(String pokemonName, int level) {
        ArrayList<LearnsetEntry> ls = LEARNSETS.get(pokemonName);
        if (ls == null) return null;
        for (LearnsetEntry e : ls) {
            if (e.level == level) return e.move;
        }
        return null;
    }

    public static ArrayList<Move> getMovesUpToLevel(String pokemonName, int level) {
        ArrayList<Move> result = new ArrayList<>();
        ArrayList<LearnsetEntry> ls = LEARNSETS.get(pokemonName);
        if (ls == null) return result;
        for (LearnsetEntry e : ls) {
            if (e.level <= level) result.add(e.move);
        }
        return result;
    }

    public static void printLearnset(String pokemonName) {
        ArrayList<LearnsetEntry> ls = LEARNSETS.get(pokemonName);
        if (ls == null) { System.out.println("No learnset for " + pokemonName); return; }
        System.out.println("Learnset for " + pokemonName + ":");
        for (LearnsetEntry e : ls) {
            System.out.println("  Lv " + e.level + ": " + e.move.getName());
        }
    }
}