public class Electric extends Pokemon {
    public Electric(int number, String name, String type, int hp, int atk, int def, int spd) {
        super(number, name, type, hp, atk, def, spd);
    }
    public Electric(int number, String name, String type, int hp, int atk, int def, int spd, int level) {
        super(number, name, type, hp, atk, def, spd, level);
    }
    public Electric(int number, String name, int hp, int atk, int def, int spd) {
        super(number, name, "Electric", hp, atk, def, spd);
    }
}