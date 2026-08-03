public class Normal extends Pokemon {

    public Normal(int number, String name, int hp, int atk, int def, int spd) {
        super(number, name, "Normal", hp, atk, def, spd);
    }

    public void pokedex() {
        System.out.println("NAME: " + name);
        System.out.println("POKEDEX: " + number);
        System.out.println("TYPE: " + type);
        System.out.println("BASE STATS:");
        System.out.println("HP: " + hp);
        System.out.println("ATK: " + atk);
        System.out.println("DEF: " + def);
        System.out.println("SPD: " + spd);
    }
}












































































































































