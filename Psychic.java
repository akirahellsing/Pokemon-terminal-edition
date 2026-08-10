public class Psychic extends Pokemon {
    public Psychic(int number, String name, String type, int hp, int atk, int def, int spd) {
        super(number, name, type, hp, atk, def, spd);
    }
    public Psychic(int number, String name, String type, int hp, int atk, int def, int spd, int level) {
        super(number, name, type, hp, atk, def, spd, level);
    }
    public Psychic(int number, String name, int hp, int atk, int def, int spd) {
        super(number, name, "Psychic", hp, atk, def, spd);
    }
}