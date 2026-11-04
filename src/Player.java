import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Pokemon> party;
    Inventory bag;
    boolean hasPokedex;

    public Player(String name) {
        this.name = name;
        this.party = new ArrayList<>();
        this.bag = new Inventory();
        this.hasPokedex = false;
    }

    public void addPokemon(Pokemon p) {
        if (party.size() < 6) {
            party.add(p);
        }
    }

    public Pokemon getFirstPokemon() {
        if (party.isEmpty()) return null;
        return party.get(0);
    }

    public void displayParty() {
        for (int i = 0; i < party.size(); i++) {
            Pokemon p = party.get(i);
            System.out.println("    [" + (i+1) + "] " + p.name + " Lv." + p.level + " HP:" + p.currentHp + "/" + p.calcMaxHp());
        }
        for (int i = party.size(); i < 6; i++) {
            System.out.println("    [" + (i+1) + "] ---");
        }
    }
}