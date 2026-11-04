public class Inventory {
    private int pokeBalls;
    private int potions;

    public Inventory() {
        this.pokeBalls = 0;
        this.potions = 0;
    }

    public void addPokeBalls(int amount) {
        pokeBalls += amount;
    }

    public boolean usePokeBall() {
        if (pokeBalls > 0) {
            pokeBalls--;
            return true;
        }
        return false;
    }

    public int getPokeBalls() {
        return pokeBalls;
    }

    public int getPotions() {
        return potions;
    }

    public void display() {
        System.out.println("    [1] Poke Ball   x" + pokeBalls);
        System.out.println("    [2] Potion      x" + potions);
    }
}