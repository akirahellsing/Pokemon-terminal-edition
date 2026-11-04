public class Water extends Pokemon {
    public Water(int number, String name, String type, int hp, int atk, int def, int spd) {
        super(number, name, type, hp, atk, def, spd);
    }
    public Water(int number, String name, String type, int hp, int atk, int def, int spd, int level) {
        super(number, name, type, hp, atk, def, spd, level);
    }
    public Water(int number, String name, int hp, int atk, int def, int spd) {
        super(number, name, "Water", hp, atk, def, spd);
    }
}