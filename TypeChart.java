public class TypeChart {
    private static final double[][] EFFECTIVENESS = {
            { 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0 },
            { 2.0, 1.0, 0.5, 0.5, 1.0, 2.0, 0.5, 0.0, 1.0, 1.0, 1.0, 1.0, 0.5, 2.0, 1.0 },
            { 1.0, 2.0, 1.0, 1.0, 1.0, 0.5, 2.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0 },
            { 1.0, 1.0, 1.0, 0.5, 0.5, 0.5, 1.0, 0.5, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0 },
            { 1.0, 1.0, 0.0, 2.0, 1.0, 2.0, 0.5, 1.0, 2.0, 1.0, 0.5, 2.0, 1.0, 1.0, 1.0 },
            { 1.0, 0.5, 2.0, 1.0, 0.5, 1.0, 2.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0 },
            { 1.0, 0.5, 0.5, 0.5, 1.0, 1.0, 1.0, 0.5, 0.5, 1.0, 2.0, 1.0, 2.0, 1.0, 1.0 },
            { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0 },
            { 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 2.0, 1.0, 0.5, 0.5, 2.0, 1.0, 1.0, 2.0, 0.5 },
            { 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 2.0, 0.5, 0.5, 1.0, 1.0, 1.0, 0.5 },
            { 1.0, 1.0, 0.5, 0.5, 2.0, 2.0, 0.5, 1.0, 0.5, 2.0, 0.5, 1.0, 1.0, 1.0, 0.5 },
            { 1.0, 1.0, 2.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 0.5, 1.0, 1.0, 0.5 },
            { 1.0, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0 },
            { 1.0, 1.0, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 0.5, 0.5, 2.0, 1.0, 1.0, 0.5, 2.0 },
            { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0 }
    };

    public static double getEffectiveness(PokemonType attacker, PokemonType defender) {
        return EFFECTIVENESS[attacker.ordinal()][defender.ordinal()];
    }

    public static double getFinalMultiplier(PokemonType attacker, PokemonType def1, PokemonType def2) {
        double m1 = getEffectiveness(attacker, def1);
        double m2 = (def2 != null) ? getEffectiveness(attacker, def2) : 1.0;
        return m1 * m2;
    }

    public static String getBattleMessage(double multiplier) {
        if (multiplier == 0.0) return "It had no effect!";
        if (multiplier < 1.0)  return "It's not very effective...";
        if (multiplier == 1.0) return "";
        if (multiplier < 4.0)  return "It's super effective!";
        return "It's super effective! (MASSIVE DAMAGE)";
    }
}