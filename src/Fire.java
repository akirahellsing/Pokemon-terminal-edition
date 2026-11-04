public class Fire extends Pokemon {
    public Fire(int number, String name, String type, int hp, int atk, int def, int spd) {
        super(number, name, type, hp, atk, def, spd);
    }
    public Fire(int number, String name, String type, int hp, int atk, int def, int spd, int level) {
        super(number, name, type, hp, atk, def, spd, level);
    }
    public Fire(int number, String name, int hp, int atk, int def, int spd) {
        super(number, name, "Fire", hp, atk, def, spd);
    }
}