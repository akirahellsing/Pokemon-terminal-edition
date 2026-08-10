public class MoveDatabase {

    public static final Move TACKLE = new Move("Tackle", PokemonType.NORMAL, 35, 95, 35, 0, MoveCondition.NONE, 0, 0);
    public static final Move QUICK_ATTACK = new Move("Quick Attack", PokemonType.NORMAL, 40, 100, 30, 1, MoveCondition.NONE, 0, 0);
    public static final Move GROWL = new Move("Growl", PokemonType.NORMAL, 0, 100, 40, 0, MoveCondition.STAT_ATTACK_DOWN, 100, 1);
    public static final Move TAIL_WHIP = new Move("Tail Whip", PokemonType.NORMAL, 0, 100, 30, 0, MoveCondition.STAT_DEFENSE_DOWN, 100, 1);
    public static final Move DOUBLE_EDGE = new Move("Double-Edge", PokemonType.NORMAL, 120, 100, 15, 0, MoveCondition.RECOIL, 100, 33);
    public static final Move SCRATCH = new Move("Scratch", PokemonType.NORMAL, 40, 100, 35, 0, MoveCondition.NONE, 0, 0);
    public static final Move SLASH = new Move("Slash", PokemonType.NORMAL, 70, 100, 20, 0, MoveCondition.NONE, 0, 0);
    public static final Move BITE = new Move("Bite", PokemonType.NORMAL, 60, 100, 25, 0, MoveCondition.FLINCH, 30, 0);
    public static final Move SMOKE_SCREEN = new Move("Smoke Screen", PokemonType.NORMAL, 0, 100, 20, 0, MoveCondition.STAT_ACCURACY_DOWN, 100, 1);
    public static final Move SCARY_FACE = new Move("Scary Face", PokemonType.NORMAL, 0, 100, 10, 0, MoveCondition.STAT_SPEED_DOWN, 100, 2);
    public static final Move RAPID_SPIN = new Move("Rapid Spin", PokemonType.NORMAL, 20, 100, 40, 0, MoveCondition.NONE, 0, 0);
    public static final Move PROTECT = new Move("Protect", PokemonType.NORMAL, 0, 100, 10, 3, MoveCondition.NONE, 0, 0);
    public static final Move SKULL_BASH = new Move("Skull Bash", PokemonType.NORMAL, 100, 100, 15, 0, MoveCondition.NONE, 0, 0);
    public static final Move SWEET_SCENT = new Move("Sweet Scent", PokemonType.NORMAL, 0, 100, 20, 0, MoveCondition.STAT_EVASION_DOWN, 100, 1);
    public static final Move GROWTH = new Move("Growth", PokemonType.NORMAL, 0, 100, 40, 0, MoveCondition.STAT_ATTACK_UP, 100, 1);
    public static final Move RECOVER = new Move("Recover", PokemonType.NORMAL, 0, 100, 20, 0, MoveCondition.HEAL, 100, 50);
    public static final Move SAND_ATTACK = new Move("Sand Attack", PokemonType.GROUND, 0, 100, 15, 0, MoveCondition.STAT_ACCURACY_DOWN, 100, 1);

    public static final Move EMBER = new Move("Ember", PokemonType.FIRE, 40, 100, 25, 0, MoveCondition.BURN, 10, 0);
    public static final Move FLAMETHROWER = new Move("Flamethrower", PokemonType.FIRE, 95, 100, 15, 0, MoveCondition.BURN, 10, 0);
    public static final Move FIRE_BLAST = new Move("Fire Blast", PokemonType.FIRE, 120, 85, 5, 0, MoveCondition.BURN, 10, 0);
    public static final Move FIRE_SPIN = new Move("Fire Spin", PokemonType.FIRE, 15, 70, 15, 0, MoveCondition.NONE, 0, 0);

    public static final Move WATER_GUN = new Move("Water Gun", PokemonType.WATER, 40, 100, 25, 0, MoveCondition.NONE, 0, 0);
    public static final Move SURF = new Move("Surf", PokemonType.WATER, 95, 100, 15, 0, MoveCondition.NONE, 0, 0);
    public static final Move HYDRO_PUMP = new Move("Hydro Pump", PokemonType.WATER, 120, 80, 5, 0, MoveCondition.NONE, 0, 0);
    public static final Move WITHDRAW = new Move("Withdraw", PokemonType.WATER, 0, 100, 40, 0, MoveCondition.STAT_DEFENSE_UP, 100, 1);
    public static final Move BUBBLE = new Move("Bubble", PokemonType.WATER, 20, 100, 30, 0, MoveCondition.NONE, 0, 0);
    public static final Move RAIN_DANCE = new Move("Rain Dance", PokemonType.WATER, 0, 100, 5, 0, MoveCondition.NONE, 0, 0);

    public static final Move VINE_WHIP = new Move("Vine Whip", PokemonType.GRASS, 35, 100, 10, 0, MoveCondition.NONE, 0, 0);
    public static final Move RAZOR_LEAF = new Move("Razor Leaf", PokemonType.GRASS, 55, 95, 25, 0, MoveCondition.NONE, 0, 0);
    public static final Move SOLAR_BEAM = new Move("Solar Beam", PokemonType.GRASS, 120, 100, 10, 0, MoveCondition.NONE, 0, 0);
    public static final Move LEECH_SEED = new Move("Leech Seed", PokemonType.GRASS, 0, 90, 10, 0, MoveCondition.LEECH_SEED, 100, 0);
    public static final Move SYNTHESIS = new Move("Synthesis", PokemonType.GRASS, 0, 100, 5, 0, MoveCondition.HEAL, 100, 50);
    public static final Move POISON_POWDER = new Move("Poison Powder", PokemonType.POISON, 0, 75, 35, 0, MoveCondition.POISON, 100, 0);
    public static final Move SLEEP_POWDER = new Move("Sleep Powder", PokemonType.GRASS, 0, 75, 15, 0, MoveCondition.SLEEP, 100, 0);

    public static final Move THUNDER_SHOCK = new Move("Thunder Shock", PokemonType.ELECTRIC, 40, 100, 30, 0, MoveCondition.PARALYSIS, 10, 0);
    public static final Move THUNDERBOLT = new Move("Thunderbolt", PokemonType.ELECTRIC, 95, 100, 15, 0, MoveCondition.PARALYSIS, 10, 0);

    public static final Move CONFUSION = new Move("Confusion", PokemonType.PSYCHIC, 50, 100, 25, 0, MoveCondition.CONFUSION, 10, 0);
    public static final Move PSYCHIC = new Move("Psychic", PokemonType.PSYCHIC, 90, 100, 10, 0, MoveCondition.STAT_DEFENSE_DOWN, 10, 1);

    public static final Move KARATE_CHOP = new Move("Karate Chop", PokemonType.FIGHTING, 50, 100, 25, 0, MoveCondition.NONE, 0, 0);
    public static final Move EARTHQUAKE = new Move("Earthquake", PokemonType.GROUND, 100, 100, 10, 0, MoveCondition.NONE, 0, 0);
    public static final Move ROCK_THROW = new Move("Rock Throw", PokemonType.ROCK, 50, 90, 15, 0, MoveCondition.NONE, 0, 0);
    public static final Move ROCK_SLIDE = new Move("Rock Slide", PokemonType.ROCK, 75, 90, 10, 0, MoveCondition.FLINCH, 30, 0);
    public static final Move GUST = new Move("Gust", PokemonType.FLYING, 40, 100, 35, 0, MoveCondition.NONE, 0, 0);
    public static final Move WING_ATTACK = new Move("Wing Attack", PokemonType.FLYING, 60, 100, 35, 0, MoveCondition.NONE, 0, 0);
    public static final Move AERIAL_ACE = new Move("Aerial Ace", PokemonType.FLYING, 60, 0, 20, 0, MoveCondition.NONE, 0, 0);
    public static final Move POISON_STING = new Move("Poison Sting", PokemonType.POISON, 15, 100, 35, 0, MoveCondition.POISON, 30, 0);
    public static final Move SLUDGE_BOMB = new Move("Sludge Bomb", PokemonType.POISON, 90, 100, 10, 0, MoveCondition.POISON, 30, 0);
    public static final Move STRING_SHOT = new Move("String Shot", PokemonType.BUG, 0, 95, 40, 0, MoveCondition.STAT_SPEED_DOWN, 100, 1);
    public static final Move LICK = new Move("Lick", PokemonType.GHOST, 20, 100, 30, 0, MoveCondition.PARALYSIS, 30, 0);
    public static final Move SHADOW_BALL = new Move("Shadow Ball", PokemonType.GHOST, 80, 100, 15, 0, MoveCondition.STAT_DEFENSE_DOWN, 20, 1);
    public static final Move ICE_BEAM = new Move("Ice Beam", PokemonType.ICE, 95, 100, 10, 0, MoveCondition.FREEZE, 10, 0);
    public static final Move DRAGON_RAGE = new Move("Dragon Rage", PokemonType.DRAGON, 40, 100, 10, 0, MoveCondition.NONE, 0, 0);

    public static Move getMoveByName(String name) {
        switch (name.toLowerCase().replace("-", " ")) {
            case "tackle": return TACKLE;
            case "quick attack": return QUICK_ATTACK;
            case "growl": return GROWL;
            case "tail whip": return TAIL_WHIP;
            case "double-edge": return DOUBLE_EDGE;
            case "scratch": return SCRATCH;
            case "slash": return SLASH;
            case "bite": return BITE;
            case "smoke screen": return SMOKE_SCREEN;
            case "scary face": return SCARY_FACE;
            case "rapid spin": return RAPID_SPIN;
            case "protect": return PROTECT;
            case "skull bash": return SKULL_BASH;
            case "sweet scent": return SWEET_SCENT;
            case "growth": return GROWTH;
            case "recover": return RECOVER;
            case "sand attack": return SAND_ATTACK;
            case "ember": return EMBER;
            case "flamethrower": return FLAMETHROWER;
            case "fire blast": return FIRE_BLAST;
            case "fire spin": return FIRE_SPIN;
            case "water gun": return WATER_GUN;
            case "surf": return SURF;
            case "hydro pump": return HYDRO_PUMP;
            case "withdraw": return WITHDRAW;
            case "bubble": return BUBBLE;
            case "rain dance": return RAIN_DANCE;
            case "vine whip": return VINE_WHIP;
            case "razor leaf": return RAZOR_LEAF;
            case "solar beam": return SOLAR_BEAM;
            case "leech seed": return LEECH_SEED;
            case "synthesis": return SYNTHESIS;
            case "poison powder": return POISON_POWDER;
            case "sleep powder": return SLEEP_POWDER;
            case "thunder shock": return THUNDER_SHOCK;
            case "thunderbolt": return THUNDERBOLT;
            case "confusion": return CONFUSION;
            case "psychic": return PSYCHIC;
            case "karate chop": return KARATE_CHOP;
            case "earthquake": return EARTHQUAKE;
            case "rock throw": return ROCK_THROW;
            case "rock slide": return ROCK_SLIDE;
            case "gust": return GUST;
            case "wing attack": return WING_ATTACK;
            case "aerial ace": return AERIAL_ACE;
            case "poison sting": return POISON_STING;
            case "sludge bomb": return SLUDGE_BOMB;
            case "string shot": return STRING_SHOT;
            case "lick": return LICK;
            case "shadow ball": return SHADOW_BALL;
            case "ice beam": return ICE_BEAM;
            case "dragon rage": return DRAGON_RAGE;
            default: return null;
        }
    }
}