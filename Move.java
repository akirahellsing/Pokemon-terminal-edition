public class Move {
    private final String name;
    private final PokemonType type;
    private final int power;
    private final int accuracy;
    private final int maxPP;
    private int currentPP;
    private final int priority;
    private final MoveCondition condition;
    private final int conditionChance;
    private final int conditionMagnitude;

    public Move(String name, PokemonType type, int power, int accuracy, int maxPP, int priority,
                MoveCondition condition, int conditionChance, int conditionMagnitude) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.maxPP = maxPP;
        this.currentPP = maxPP;
        this.priority = priority;
        this.condition = condition;
        this.conditionChance = conditionChance;
        this.conditionMagnitude = conditionMagnitude;
    }

    public String getName() { return name; }
    public PokemonType getType() { return type; }
    public int getPower() { return power; }
    public int getAccuracy() { return accuracy; }
    public int getMaxPP() { return maxPP; }
    public int getCurrentPP() { return currentPP; }
    public int getPriority() { return priority; }
    public MoveCondition getCondition() { return condition; }
    public int getConditionChance() { return conditionChance; }
    public int getConditionMagnitude() { return conditionMagnitude; }

    public boolean usePP() {
        if (currentPP > 0) { currentPP--; return true; }
        return false;
    }

    public void restoreAllPP() { currentPP = maxPP; }
    public boolean hasPP() { return currentPP > 0; }

    public boolean hits() {
        if (accuracy == 0) return true;
        return Math.random() * 100 < accuracy;
    }

    public boolean appliesCondition() {
        if (condition == MoveCondition.NONE) return false;
        return Math.random() * 100 < conditionChance;
    }

    public Move copy() {
        return new Move(name, type, power, accuracy, maxPP, priority,
                condition, conditionChance, conditionMagnitude);
    }

    @Override
    public String toString() {
        return name + " [" + type + "] PWR:" + power + " ACC:" + accuracy + " PP:" + currentPP + "/" + maxPP;
    }
}