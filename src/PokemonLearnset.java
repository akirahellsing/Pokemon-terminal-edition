import java.util.ArrayList;
import java.util.HashMap;

public class PokemonLearnset {
    private static final HashMap<String, ArrayList<LearnsetEntry>> LEARNSETS = new HashMap<>();

    static { initLearnsets(); }

    private static void initLearnsets() {

        add("Bulbasaur",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(4, MoveDatabase.GROWL),
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
                new LearnsetEntry(4, MoveDatabase.GROWL),
                new LearnsetEntry(7, MoveDatabase.LEECH_SEED),
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
                new LearnsetEntry(4, MoveDatabase.GROWL),
                new LearnsetEntry(7, MoveDatabase.LEECH_SEED),
                new LearnsetEntry(10, MoveDatabase.VINE_WHIP),
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
                new LearnsetEntry(25, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(31, MoveDatabase.FLAMETHROWER),
                new LearnsetEntry(37, MoveDatabase.SLASH),
                new LearnsetEntry(43, MoveDatabase.DRAGON_RAGE),
                new LearnsetEntry(49, MoveDatabase.FIRE_SPIN));

        add("Charmeleon",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.EMBER),
                new LearnsetEntry(7, MoveDatabase.EMBER),
                new LearnsetEntry(13, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(27, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(34, MoveDatabase.FLAMETHROWER),
                new LearnsetEntry(41, MoveDatabase.SLASH),
                new LearnsetEntry(48, MoveDatabase.DRAGON_RAGE),
                new LearnsetEntry(55, MoveDatabase.FIRE_SPIN));

        add("Charizard",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(7, MoveDatabase.EMBER),
                new LearnsetEntry(13, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(27, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(34, MoveDatabase.FLAMETHROWER),
                new LearnsetEntry(36, MoveDatabase.WING_ATTACK),
                new LearnsetEntry(44, MoveDatabase.SLASH),
                new LearnsetEntry(54, MoveDatabase.DRAGON_RAGE),
                new LearnsetEntry(64, MoveDatabase.FIRE_SPIN));

        add("Squirtle",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(4, MoveDatabase.TAIL_WHIP),
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
                new LearnsetEntry(4, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(7, MoveDatabase.BUBBLE),
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
                new LearnsetEntry(4, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(7, MoveDatabase.BUBBLE),
                new LearnsetEntry(10, MoveDatabase.WITHDRAW),
                new LearnsetEntry(13, MoveDatabase.WATER_GUN),
                new LearnsetEntry(19, MoveDatabase.BITE),
                new LearnsetEntry(25, MoveDatabase.RAPID_SPIN),
                new LearnsetEntry(31, MoveDatabase.PROTECT),
                new LearnsetEntry(42, MoveDatabase.RAIN_DANCE),
                new LearnsetEntry(55, MoveDatabase.SKULL_BASH));
        add("Caterpie",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.STRING_SHOT));

        add("Metapod",
                new LearnsetEntry(1, MoveDatabase.PROTECT),
                new LearnsetEntry(7, MoveDatabase.PROTECT));

        add("Butterfree",
                new LearnsetEntry(1, MoveDatabase.CONFUSION),
                new LearnsetEntry(10, MoveDatabase.CONFUSION),
                new LearnsetEntry(13, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(14, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(15, MoveDatabase.STRING_SHOT));

        add("Weedle",
                new LearnsetEntry(1, MoveDatabase.POISON_STING),
                new LearnsetEntry(1, MoveDatabase.STRING_SHOT));

        add("Kakuna",
                new LearnsetEntry(1, MoveDatabase.PROTECT),
                new LearnsetEntry(7, MoveDatabase.PROTECT));

        add("Beedrill",
                new LearnsetEntry(1, MoveDatabase.POISON_STING),
                new LearnsetEntry(1, MoveDatabase.STRING_SHOT));

        add("Spearow",
                new LearnsetEntry(1, MoveDatabase.GROWL));

        add("Fearow",
                new LearnsetEntry(1, MoveDatabase.GROWL));

        add("Ekans",
                new LearnsetEntry(1, MoveDatabase.POISON_STING),
                new LearnsetEntry(13, MoveDatabase.BITE),
                new LearnsetEntry(44, MoveDatabase.SLUDGE_BOMB));

        add("Arbok",
                new LearnsetEntry(1, MoveDatabase.POISON_STING),
                new LearnsetEntry(1, MoveDatabase.BITE),
                new LearnsetEntry(13, MoveDatabase.BITE),
                new LearnsetEntry(56, MoveDatabase.SLUDGE_BOMB));

        add("Raichu",
                new LearnsetEntry(1, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(1, MoveDatabase.THUNDERBOLT));

        add("Sandshrew",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(11, MoveDatabase.SAND_ATTACK),
                new LearnsetEntry(17, MoveDatabase.POISON_STING),
                new LearnsetEntry(23, MoveDatabase.SLASH),
                new LearnsetEntry(45, MoveDatabase.EARTHQUAKE));

        add("Sandslash",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.SAND_ATTACK),
                new LearnsetEntry(11, MoveDatabase.SAND_ATTACK),
                new LearnsetEntry(17, MoveDatabase.POISON_STING),
                new LearnsetEntry(24, MoveDatabase.SLASH),
                new LearnsetEntry(52, MoveDatabase.EARTHQUAKE));

        add("Nidoran♀",
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(8, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(17, MoveDatabase.POISON_STING),
                new LearnsetEntry(23, MoveDatabase.BITE),
                new LearnsetEntry(38, MoveDatabase.SLUDGE_BOMB));

        add("Nidorina",
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(8, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(19, MoveDatabase.POISON_STING),
                new LearnsetEntry(27, MoveDatabase.BITE),
                new LearnsetEntry(46, MoveDatabase.SLUDGE_BOMB));

        add("Nidoqueen",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.POISON_STING),
                new LearnsetEntry(22, MoveDatabase.DOUBLE_EDGE),
                new LearnsetEntry(43, MoveDatabase.EARTHQUAKE));

        add("Nidoran♂",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(17, MoveDatabase.POISON_STING),
                new LearnsetEntry(30, MoveDatabase.SLASH));

        add("Nidorino",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(19, MoveDatabase.POISON_STING),
                new LearnsetEntry(36, MoveDatabase.SLASH));

        add("Nidoking",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.POISON_STING),
                new LearnsetEntry(43, MoveDatabase.EARTHQUAKE));

        add("Clefairy",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.GROWL));

        add("Clefable",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.GROWL));

        add("Vulpix",
                new LearnsetEntry(1, MoveDatabase.EMBER),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(13, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(25, MoveDatabase.CONFUSION),
                new LearnsetEntry(37, MoveDatabase.FLAMETHROWER),
                new LearnsetEntry(55, MoveDatabase.FIRE_SPIN));

        add("Ninetales",
                new LearnsetEntry(1, MoveDatabase.EMBER),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(1, MoveDatabase.CONFUSION),
                new LearnsetEntry(45, MoveDatabase.FIRE_BLAST));

        add("Jigglypuff",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(34, MoveDatabase.DOUBLE_EDGE));

        add("Wigglytuff",
                new LearnsetEntry(1, MoveDatabase.TACKLE));

        add("Zubat",
                new LearnsetEntry(19, MoveDatabase.BITE),
                new LearnsetEntry(27, MoveDatabase.WING_ATTACK),
                new LearnsetEntry(36, MoveDatabase.CONFUSION));

        add("Golbat",
                new LearnsetEntry(19, MoveDatabase.BITE),
                new LearnsetEntry(28, MoveDatabase.WING_ATTACK),
                new LearnsetEntry(38, MoveDatabase.CONFUSION));

        add("Oddish",
                new LearnsetEntry(1, MoveDatabase.SWEET_SCENT),
                new LearnsetEntry(14, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(18, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(48, MoveDatabase.SOLAR_BEAM));

        add("Gloom",
                new LearnsetEntry(1, MoveDatabase.SWEET_SCENT),
                new LearnsetEntry(14, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(18, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(55, MoveDatabase.SOLAR_BEAM));

        add("Vileplume",
                new LearnsetEntry(55, MoveDatabase.SOLAR_BEAM));

        add("Paras",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(13, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(31, MoveDatabase.SLASH),
                new LearnsetEntry(37, MoveDatabase.GROWTH));

        add("Parasect",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(13, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(35, MoveDatabase.SLASH),
                new LearnsetEntry(43, MoveDatabase.GROWTH));

        add("Venonat",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(17, MoveDatabase.CONFUSION),
                new LearnsetEntry(20, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(33, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(49, MoveDatabase.PSYCHIC));

        add("Venomoth",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(17, MoveDatabase.CONFUSION),
                new LearnsetEntry(20, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(33, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(37, MoveDatabase.GUST),
                new LearnsetEntry(53, MoveDatabase.PSYCHIC));

        add("Diglett",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.SAND_ATTACK),
                new LearnsetEntry(9, MoveDatabase.GROWL),
                new LearnsetEntry(31, MoveDatabase.SLASH),
                new LearnsetEntry(40, MoveDatabase.EARTHQUAKE));

        add("Dugtrio",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.SAND_ATTACK),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(9, MoveDatabase.GROWL),
                new LearnsetEntry(33, MoveDatabase.SLASH),
                new LearnsetEntry(45, MoveDatabase.EARTHQUAKE));

        add("Meowth",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(10, MoveDatabase.BITE),
                new LearnsetEntry(36, MoveDatabase.SLASH));

        add("Persian",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.BITE),
                new LearnsetEntry(10, MoveDatabase.BITE),
                new LearnsetEntry(39, MoveDatabase.SLASH));

        add("Psyduck",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(5, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(16, MoveDatabase.CONFUSION),
                new LearnsetEntry(23, MoveDatabase.WATER_GUN),
                new LearnsetEntry(50, MoveDatabase.HYDRO_PUMP));

        add("Golduck",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(5, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(16, MoveDatabase.CONFUSION),
                new LearnsetEntry(23, MoveDatabase.WATER_GUN),
                new LearnsetEntry(58, MoveDatabase.HYDRO_PUMP));

        add("Mankey",
                new LearnsetEntry(1, MoveDatabase.SCRATCH));

        add("Primeape",
                new LearnsetEntry(1, MoveDatabase.SCRATCH));

        add("Growlithe",
                new LearnsetEntry(1, MoveDatabase.BITE),
                new LearnsetEntry(9, MoveDatabase.EMBER),
                new LearnsetEntry(49, MoveDatabase.FLAMETHROWER));

        add("Arcanine",
                new LearnsetEntry(1, MoveDatabase.BITE),
                new LearnsetEntry(57, MoveDatabase.FLAMETHROWER));

        add("Poliwag",
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(19, MoveDatabase.RAIN_DANCE),
                new LearnsetEntry(49, MoveDatabase.HYDRO_PUMP));

        add("Poliwhirl",
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(19, MoveDatabase.RAIN_DANCE),
                new LearnsetEntry(59, MoveDatabase.HYDRO_PUMP));

        add("Poliwrath",
                new LearnsetEntry(1, MoveDatabase.WATER_GUN));

        add("Machop",
                new LearnsetEntry(1, MoveDatabase.KARATE_CHOP));

        add("Machoke",
                new LearnsetEntry(1, MoveDatabase.KARATE_CHOP));

        add("Machamp",
                new LearnsetEntry(1, MoveDatabase.KARATE_CHOP));

        add("Bellsprout",
                new LearnsetEntry(1, MoveDatabase.VINE_WHIP),
                new LearnsetEntry(15, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(15, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(21, MoveDatabase.RAZOR_LEAF),
                new LearnsetEntry(27, MoveDatabase.SWEET_SCENT),
                new LearnsetEntry(33, MoveDatabase.GROWTH),
                new LearnsetEntry(42, MoveDatabase.SOLAR_BEAM));

        add("Weepinbell",
                new LearnsetEntry(1, MoveDatabase.VINE_WHIP),
                new LearnsetEntry(15, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(15, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(23, MoveDatabase.RAZOR_LEAF),
                new LearnsetEntry(29, MoveDatabase.SWEET_SCENT),
                new LearnsetEntry(38, MoveDatabase.GROWTH),
                new LearnsetEntry(49, MoveDatabase.SOLAR_BEAM));

        add("Victreebel",
                new LearnsetEntry(1, MoveDatabase.VINE_WHIP),
                new LearnsetEntry(1, MoveDatabase.RAZOR_LEAF),
                new LearnsetEntry(15, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(15, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(23, MoveDatabase.RAZOR_LEAF),
                new LearnsetEntry(29, MoveDatabase.SWEET_SCENT),
                new LearnsetEntry(49, MoveDatabase.SOLAR_BEAM));

        add("Tentacool",
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(43, MoveDatabase.HYDRO_PUMP));

        add("Tentacruel",
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(49, MoveDatabase.HYDRO_PUMP));

        add("Ponyta",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(5, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(9, MoveDatabase.EMBER),
                new LearnsetEntry(19, MoveDatabase.FIRE_SPIN),
                new LearnsetEntry(25, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(53, MoveDatabase.FIRE_BLAST));

        add("Rapidash",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.EMBER),
                new LearnsetEntry(5, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(9, MoveDatabase.EMBER),
                new LearnsetEntry(19, MoveDatabase.FIRE_SPIN),
                new LearnsetEntry(25, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(58, MoveDatabase.FIRE_BLAST));

        add("Slowpoke",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(13, MoveDatabase.WATER_GUN),
                new LearnsetEntry(47, MoveDatabase.PSYCHIC));

        add("Slowbro",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(13, MoveDatabase.WATER_GUN),
                new LearnsetEntry(55, MoveDatabase.PSYCHIC));

        add("Magnemite",
                new LearnsetEntry(1, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(26, MoveDatabase.THUNDERBOLT));

        add("Magneton",
                new LearnsetEntry(1, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(16, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(26, MoveDatabase.THUNDERBOLT));

        add("Farfetch'd",
                new LearnsetEntry(1, MoveDatabase.GUST),
                new LearnsetEntry(31, MoveDatabase.SLASH));

        add("Doduo",
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(21, MoveDatabase.QUICK_ATTACK));

        add("Dodrio",
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(21, MoveDatabase.QUICK_ATTACK));

        add("Seel",
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(47, MoveDatabase.ICE_BEAM));

        add("Dewgong",
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(54, MoveDatabase.ICE_BEAM));

        add("Grimer",
                new LearnsetEntry(1, MoveDatabase.SLUDGE_BOMB));

        add("Muk",
                new LearnsetEntry(1, MoveDatabase.SLUDGE_BOMB));

        add("Shellder",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.WITHDRAW),
                new LearnsetEntry(43, MoveDatabase.ICE_BEAM),
                new LearnsetEntry(50, MoveDatabase.HYDRO_PUMP));

        add("Cloyster",
                new LearnsetEntry(1, MoveDatabase.WITHDRAW),
                new LearnsetEntry(1, MoveDatabase.PROTECT));

        add("Onix",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(11, MoveDatabase.ROCK_THROW),
                new LearnsetEntry(31, MoveDatabase.ROCK_SLIDE),
                new LearnsetEntry(46, MoveDatabase.EARTHQUAKE));

        add("Drowzee",
                new LearnsetEntry(17, MoveDatabase.CONFUSION),
                new LearnsetEntry(43, MoveDatabase.PSYCHIC));

        add("Hypno",
                new LearnsetEntry(1, MoveDatabase.CONFUSION),
                new LearnsetEntry(17, MoveDatabase.CONFUSION),
                new LearnsetEntry(49, MoveDatabase.PSYCHIC));

        add("Krabby",
                new LearnsetEntry(1, MoveDatabase.BUBBLE),
                new LearnsetEntry(41, MoveDatabase.PROTECT));

        add("Kingler",
                new LearnsetEntry(1, MoveDatabase.BUBBLE),
                new LearnsetEntry(47, MoveDatabase.PROTECT));

        add("Voltorb",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(14, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(41, MoveDatabase.THUNDERBOLT));

        add("Electrode",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(14, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(48, MoveDatabase.THUNDERBOLT));

        add("Exeggcute",
                new LearnsetEntry(31, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(37, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(43, MoveDatabase.SOLAR_BEAM));

        add("Exeggutor",
                new LearnsetEntry(1, MoveDatabase.CONFUSION));

        add("Cubone",
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.BITE),
                new LearnsetEntry(51, MoveDatabase.DOUBLE_EDGE));

        add("Marowak",
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.BITE),
                new LearnsetEntry(61, MoveDatabase.DOUBLE_EDGE));

        add("Hitmonlee",
                new LearnsetEntry(1, MoveDatabase.DOUBLE_EDGE));

        add("Hitmonchan",
                new LearnsetEntry(1, MoveDatabase.TACKLE));

        add("Lickitung",
                new LearnsetEntry(1, MoveDatabase.LICK));

        add("Koffing",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(9, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(41, MoveDatabase.SLUDGE_BOMB));

        add("Weezing",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(9, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(44, MoveDatabase.SLUDGE_BOMB));

        add("Rhyhorn",
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(13, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(58, MoveDatabase.EARTHQUAKE));

        add("Rhydon",
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(13, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(66, MoveDatabase.EARTHQUAKE));

        add("Chansey",
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(5, MoveDatabase.TAIL_WHIP));

        add("Tangela",
                new LearnsetEntry(1, MoveDatabase.VINE_WHIP),
                new LearnsetEntry(25, MoveDatabase.POISON_POWDER),
                new LearnsetEntry(25, MoveDatabase.SLEEP_POWDER),
                new LearnsetEntry(40, MoveDatabase.GROWTH));

        add("Kangaskhan",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(7, MoveDatabase.BITE));

        add("Horsea",
                new LearnsetEntry(1, MoveDatabase.BUBBLE),
                new LearnsetEntry(15, MoveDatabase.WATER_GUN),
                new LearnsetEntry(22, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(50, MoveDatabase.HYDRO_PUMP));

        add("Seadra",
                new LearnsetEntry(1, MoveDatabase.BUBBLE),
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(1, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(15, MoveDatabase.WATER_GUN),
                new LearnsetEntry(22, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(62, MoveDatabase.HYDRO_PUMP));

        add("Goldeen",
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(10, MoveDatabase.WATER_GUN),
                new LearnsetEntry(57, MoveDatabase.HYDRO_PUMP));

        add("Seaking",
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(10, MoveDatabase.WATER_GUN),
                new LearnsetEntry(69, MoveDatabase.HYDRO_PUMP));

        add("Staryu",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(6, MoveDatabase.WATER_GUN),
                new LearnsetEntry(15, MoveDatabase.RECOVER),
                new LearnsetEntry(33, MoveDatabase.CONFUSION),
                new LearnsetEntry(42, MoveDatabase.HYDRO_PUMP));

        add("Starmie",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(1, MoveDatabase.RECOVER),
                new LearnsetEntry(1, MoveDatabase.CONFUSION));

        add("Mr. Mime",
                new LearnsetEntry(1, MoveDatabase.CONFUSION),
                new LearnsetEntry(43, MoveDatabase.PSYCHIC));

        add("Scyther",
                new LearnsetEntry(1, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(26, MoveDatabase.WING_ATTACK),
                new LearnsetEntry(36, MoveDatabase.SLASH));

        add("Jynx",
                new LearnsetEntry(1, MoveDatabase.LICK),
                new LearnsetEntry(48, MoveDatabase.ICE_BEAM));

        add("Electabuzz",
                new LearnsetEntry(1, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(9, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(47, MoveDatabase.THUNDERBOLT));

        add("Magmar",
                new LearnsetEntry(1, MoveDatabase.EMBER),
                new LearnsetEntry(1, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(13, MoveDatabase.SMOKE_SCREEN),
                new LearnsetEntry(41, MoveDatabase.FLAMETHROWER),
                new LearnsetEntry(49, MoveDatabase.FIRE_BLAST));

        add("Pinsir",
                new LearnsetEntry(1, MoveDatabase.SLASH),
                new LearnsetEntry(31, MoveDatabase.SLASH));

        add("Tauros",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(4, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(19, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(53, MoveDatabase.DOUBLE_EDGE));

        add("Magikarp",
                new LearnsetEntry(15, MoveDatabase.TACKLE));

        add("Gyarados",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(20, MoveDatabase.BITE),
                new LearnsetEntry(40, MoveDatabase.HYDRO_PUMP));

        add("Lapras",
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(1, MoveDatabase.GROWL),
                new LearnsetEntry(31, MoveDatabase.ICE_BEAM),
                new LearnsetEntry(43, MoveDatabase.RAIN_DANCE),
                new LearnsetEntry(50, MoveDatabase.HYDRO_PUMP));

        add("Ditto",
                new LearnsetEntry(1, MoveDatabase.TACKLE));

        add("Eevee",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(8, MoveDatabase.SAND_ATTACK),
                new LearnsetEntry(16, MoveDatabase.GROWL),
                new LearnsetEntry(23, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(36, MoveDatabase.BITE));

        add("Vaporeon",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(16, MoveDatabase.WATER_GUN),
                new LearnsetEntry(23, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(36, MoveDatabase.BITE),
                new LearnsetEntry(52, MoveDatabase.HYDRO_PUMP));

        add("Jolteon",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(16, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(23, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(36, MoveDatabase.BITE),
                new LearnsetEntry(52, MoveDatabase.THUNDERBOLT));

        add("Flareon",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(1, MoveDatabase.TAIL_WHIP),
                new LearnsetEntry(1, MoveDatabase.EMBER),
                new LearnsetEntry(16, MoveDatabase.EMBER),
                new LearnsetEntry(23, MoveDatabase.QUICK_ATTACK),
                new LearnsetEntry(36, MoveDatabase.BITE),
                new LearnsetEntry(42, MoveDatabase.FIRE_SPIN),
                new LearnsetEntry(52, MoveDatabase.FLAMETHROWER));

        add("Porygon",
                new LearnsetEntry(1, MoveDatabase.TACKLE),
                new LearnsetEntry(9, MoveDatabase.RECOVER));

        add("Omanyte",
                new LearnsetEntry(1, MoveDatabase.WITHDRAW),
                new LearnsetEntry(13, MoveDatabase.BITE),
                new LearnsetEntry(19, MoveDatabase.WATER_GUN),
                new LearnsetEntry(49, MoveDatabase.HYDRO_PUMP));

        add("Omastar",
                new LearnsetEntry(1, MoveDatabase.WITHDRAW),
                new LearnsetEntry(1, MoveDatabase.BITE),
                new LearnsetEntry(1, MoveDatabase.WATER_GUN),
                new LearnsetEntry(13, MoveDatabase.BITE),
                new LearnsetEntry(19, MoveDatabase.WATER_GUN),
                new LearnsetEntry(55, MoveDatabase.HYDRO_PUMP));

        add("Kabuto",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(35, MoveDatabase.SAND_ATTACK),
                new LearnsetEntry(43, MoveDatabase.HYDRO_PUMP));

        add("Kabutops",
                new LearnsetEntry(1, MoveDatabase.SCRATCH),
                new LearnsetEntry(35, MoveDatabase.SAND_ATTACK),
                new LearnsetEntry(40, MoveDatabase.SLASH),
                new LearnsetEntry(51, MoveDatabase.HYDRO_PUMP));

        add("Aerodactyl",
                new LearnsetEntry(1, MoveDatabase.WING_ATTACK),
                new LearnsetEntry(1, MoveDatabase.SCARY_FACE),
                new LearnsetEntry(8, MoveDatabase.BITE));

        add("Snorlax",
                new LearnsetEntry(1, MoveDatabase.TACKLE));

        add("Articuno",
                new LearnsetEntry(1, MoveDatabase.GUST),
                new LearnsetEntry(49, MoveDatabase.ICE_BEAM));

        add("Zapdos",
                new LearnsetEntry(1, MoveDatabase.THUNDER_SHOCK),
                new LearnsetEntry(49, MoveDatabase.THUNDERBOLT));

        add("Moltres",
                new LearnsetEntry(1, MoveDatabase.WING_ATTACK),
                new LearnsetEntry(1, MoveDatabase.EMBER),
                new LearnsetEntry(37, MoveDatabase.FLAMETHROWER),
                new LearnsetEntry(61, MoveDatabase.FIRE_BLAST));

        add("Dratini",
                new LearnsetEntry(1, MoveDatabase.DRAGON_RAGE),
                new LearnsetEntry(43, MoveDatabase.DRAGON_RAGE));

        add("Dragonair",
                new LearnsetEntry(1, MoveDatabase.DRAGON_RAGE),
                new LearnsetEntry(47, MoveDatabase.DRAGON_RAGE));

        add("Dragonite",
                new LearnsetEntry(1, MoveDatabase.DRAGON_RAGE),
                new LearnsetEntry(47, MoveDatabase.DRAGON_RAGE),
                new LearnsetEntry(55, MoveDatabase.WING_ATTACK));

        add("Mewtwo",
                new LearnsetEntry(1, MoveDatabase.CONFUSION),
                new LearnsetEntry(66, MoveDatabase.PSYCHIC));

        add("Mew",
                new LearnsetEntry(1, MoveDatabase.CONFUSION),
                new LearnsetEntry(50, MoveDatabase.PSYCHIC));
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
