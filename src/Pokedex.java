import java.util.HashMap;

public class Pokedex {
    private HashMap<String, Pokemon> porNome;
    private HashMap<Integer, Pokemon> porNumero;

    public Pokedex() {
        porNome = new HashMap<>();
        porNumero = new HashMap<>();
       // tipo normal
        cadastrar(new Normal(19, "Rattata", 30, 56, 35, 72));
        cadastrar(new Normal(20, "Raticate", 55, 81, 60, 97));
        cadastrar(new Normal(52, "Meowth", 40, 45, 35, 90));
        cadastrar(new Normal(53, "Persian", 65, 70, 60, 115));
        cadastrar(new Normal(108, "Lickitung", 90, 55, 75, 30));
        cadastrar(new Normal(113, "Chansey", 250, 5, 5, 50));
        cadastrar(new Normal(115, "Kangaskhan", 105, 95, 80, 90));
        cadastrar(new Normal(128, "Tauros", 75, 100, 95, 110));
        cadastrar(new Normal(132, "Ditto", 48, 48, 48, 48));
        cadastrar(new Normal(133, "Eevee", 55, 55, 50, 55));
        cadastrar(new Normal(137, "Porygon", 65, 60, 70, 40));
        cadastrar(new Normal(143, "Snorlax", 160, 110, 65, 30));
       // tipo normal/flying
        cadastrar(new Pokemon(16, "Pidgey", "Normal/Flying", 40, 45, 40, 56));
        cadastrar(new Pokemon(17, "Pidgeotto", "Normal/Flying", 63, 60, 55, 71));
        cadastrar(new Pokemon(18, "Pidgeot", "Normal/Flying", 83, 80, 75, 101));
        cadastrar(new Pokemon(21, "Spearow", "Normal/Flying", 40, 60, 30, 70));
        cadastrar(new Pokemon(22, "Fearow", "Normal/Flying", 65, 90, 65, 100));
        cadastrar(new Pokemon(83, "Farfetch'd", "Normal/Flying", 52, 90, 55, 60));
        cadastrar(new Pokemon(84, "Doduo", "Normal/Flying", 35, 85, 45, 75));
        cadastrar(new Pokemon(85, "Dodrio", "Normal/Flying", 60, 110, 70, 110));

       // grass
        cadastrar(new Grass(114, "Tangela", "Grass", 65, 55, 115, 60));
       // grass/poisom
        cadastrar(new Grass(1, "Bulbasaur", "Grass/Poison", 45, 49, 49, 45));
        cadastrar(new Grass(2, "Ivysaur", "Grass/Poison", 60, 62, 63, 60));
        cadastrar(new Grass(3, "Venusaur", "Grass/Poison", 80, 82, 83, 80));
        cadastrar(new Grass(43, "Oddish", "Grass/Poison", 45, 50, 55, 30));
        cadastrar(new Grass(44, "Gloom", "Grass/Poison", 60, 65, 70, 40));
        cadastrar(new Grass(45, "Vileplume", "Grass/Poison", 75, 80, 85, 50));
        cadastrar(new Grass(69, "Bellsprout", "Grass/Poison", 50, 75, 35, 40));
        cadastrar(new Grass(70, "Weepinbell", "Grass/Poison", 65, 90, 50, 55));
        cadastrar(new Grass(71, "Victreebel", "Grass/Poison", 80, 105, 65, 70));
       // grass/psychic


    }
    private void cadastrar(Pokemon p) {
        porNome.put(p.name.toLowerCase(), p);
        porNumero.put(p.number, p);
    }

    public Pokemon buscarPorNome(String nome) {
        return porNome.get(nome.toLowerCase().trim());
    }

    public Pokemon buscarPorNumero(int numero) {
        return porNumero.get(numero);
    }
}