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
        cadastrar(new Grass(102, "Exeggcute", "Grass/Psychic", 60, 40, 80, 40));
        cadastrar(new Grass(103, "Exeggutor", "Grass/Psychic", 95, 95, 85, 55));
       // fire
        cadastrar(new Fire(4, "Charmander", "Fire", 39, 52, 43, 65));
        cadastrar(new Fire(5, "Charmeleon", "Fire", 58, 64, 58, 80));
        cadastrar(new Fire(37, "Vulpix", "Fire", 38, 41, 40, 65));
        cadastrar(new Fire(38, "Ninetales", "Fire", 73, 76, 75, 100));
        cadastrar(new Fire(58, "Growlithe", "Fire", 55, 70, 45, 60));
        cadastrar(new Fire(59, "Arcanine", "Fire", 90, 110, 80, 95));
        cadastrar(new Fire(77, "Ponyta", "Fire", 50, 85, 55, 90));
        cadastrar(new Fire(78, "Rapidash", "Fire", 65, 100, 70, 105));
        cadastrar(new Fire(126, "Magmar", "Fire", 65, 95, 57, 93));
        cadastrar(new Fire(136, "Flareon", "Fire", 65, 130, 60, 65));
       // fire flying
        cadastrar(new Fire(6, "Charizard", "Fire/Flying", 78, 84, 78, 100));
        cadastrar(new Fire(146, "Moltres", "Fire/Flying", 90, 100, 90, 90));
       // water
        cadastrar(new Water(7, "Squirtle", "Water", 44, 48, 65, 43));
        cadastrar(new Water(8, "Wartortle", "Water", 59, 63, 80, 58));
        cadastrar(new Water(54, "Psyduck", "Water", 50, 52, 48, 55));
        cadastrar(new Water(55, "Golduck", "Water", 80, 82, 78, 85));
        cadastrar(new Water(60, "Poliwag", "Water", 40, 50, 40, 90));
        cadastrar(new Water(61, "Poliwhirl", "Water", 65, 65, 65, 90));
        cadastrar(new Water(86, "Seel", "Water", 65, 45, 55, 45));
        cadastrar(new Water(116, "Horsea", "Water", 30, 40, 70, 60));
        cadastrar(new Water(117, "Seadra", "Water", 55, 65, 95, 85));
        cadastrar(new Water(118, "Goldeen", "Water", 45, 67, 60, 63));
        cadastrar(new Water(119, "Seaking", "Water", 80, 92, 65, 68));
        cadastrar(new Water(120, "Staryu", "Water", 30, 45, 55, 85));
        cadastrar(new Water(129, "Magikarp", "Water", 20, 10, 55, 80));
        cadastrar(new Water(134, "Vaporeon", "Water", 130, 65, 60, 65));
       // water fighting
        cadastrar(new Water(62, "Poliwrath", "Water/Fighting", 90, 95, 95, 70));
       // water poison
        cadastrar(new Water(72, "Tentacool", "Water/Poison", 40, 40, 35, 70));
        cadastrar(new Water(73, "Tentacruel", "Water/Poison", 80, 70, 65, 100));
       // water psychic
        cadastrar(new Water(79, "Slowpoke", "Water/Psychic", 90, 65, 65, 15));
        cadastrar(new Water(80, "Slowbro", "Water/Psychic", 95, 75, 110, 30));
        cadastrar(new Water(121, "Starmie", "Water/Psychic", 60, 75, 85, 115));
       // water ice
        cadastrar(new Water(87, "Dewgong", "Water/Ice", 90, 70, 80, 70));
        cadastrar(new Water(131, "Lapras", "Water/Ice", 130, 85, 80, 60));
       // water flying
        cadastrar(new Water(130, "Gyarados", "Water/Flying", 95, 125, 79, 81));
       // electric
        cadastrar(new Electric(25, "Pikachu", "Electric", 35, 55, 40, 90));
        cadastrar(new Electric(26, "Raichu", "Electric", 60, 90, 55, 110));
        cadastrar(new Electric(81, "Magnemite", "Electric/Steel", 25, 35, 70, 45));
        cadastrar(new Electric(82, "Magneton", "Electric/Steel", 50, 60, 95, 70));
        cadastrar(new Electric(100, "Voltorb", "Electric", 40, 30, 50, 100));
        cadastrar(new Electric(101, "Electrode", "Electric", 60, 50, 70, 140));
        cadastrar(new Electric(125, "Electabuzz", "Electric", 65, 83, 57, 105));
        cadastrar(new Electric(135, "Jolteon", "Electric", 65, 65, 60, 130));
       // electric flying
        cadastrar(new Electric(145, "Zapdos", "Electric/Flying", 90, 90, 85, 100));
       // ice psychic
        cadastrar(new Ice(124, "Jynx", "Ice/Psychic", 65, 50, 35, 95));
       // ice flying
        cadastrar(new Ice(144, "Articuno", "Ice/Flying", 90, 85, 100, 85));
       // fighting
        cadastrar(new Fighting(56, "Mankey", "Fighting", 40, 80, 35, 70));
        cadastrar(new Fighting(57, "Primeape", "Fighting", 65, 105, 60, 95));
        cadastrar(new Fighting(66, "Machop", "Fighting", 70, 80, 50, 35));
        cadastrar(new Fighting(67, "Machoke", "Fighting", 80, 100, 70, 45));
        cadastrar(new Fighting(68, "Machamp", "Fighting", 90, 130, 80, 55));
       // poison
        cadastrar(new Poison(23, "Ekans", "Poison", 35, 60, 44, 55));
        cadastrar(new Poison(24, "Arbok", "Poison", 60, 95, 69, 80));
        cadastrar(new Poison(29, "Nidoran♀", "Poison", 55, 47, 52, 41));
        cadastrar(new Poison(30, "Nidorina", "Poison", 70, 62, 67, 56));
        cadastrar(new Poison(32, "Nidoran♂", "Poison", 46, 57, 40, 50));
        cadastrar(new Poison(33, "Nidorino", "Poison", 61, 72, 57, 65));
        cadastrar(new Poison(88, "Grimer", "Poison", 80, 80, 50, 25));
        cadastrar(new Poison(89, "Muk", "Poison", 105, 105, 75, 50));
       // poison ground
        cadastrar(new Poison(31, "Nidoqueen", "Poison/Ground", 90, 92, 87, 76));
        cadastrar(new Poison(34, "Nidoking", "Poison/Ground", 81, 102, 77, 85));
       // poison flying
        cadastrar(new Poison(41, "Zubat", "Poison/Flying", 40, 45, 35, 55));
        cadastrar(new Poison(42, "Golbat", "Poison/Flying", 75, 80, 70, 90));
       // ground
        cadastrar(new Ground(27, "Sandshrew", "Ground", 50, 75, 85, 40));
        cadastrar(new Ground(28, "Sandslash", "Ground", 75, 100, 110, 65));
        cadastrar(new Ground(104, "Cubone", "Ground", 50, 50, 95, 35));
        cadastrar(new Ground(105, "Marowak", "Ground", 60, 80, 110, 45));
        cadastrar(new Ground(50, "Diglett", "Ground", 10, 55, 25, 95));
        cadastrar(new Ground(51, "Dugtrio", "Ground", 35, 100, 50, 120));
       // ground rock
        cadastrar(new Ground(74, "Geodude", "Rock/Ground", 40, 80, 100, 20));
        cadastrar(new Ground(75, "Graveler", "Rock/Ground", 55, 95, 115, 35));
        cadastrar(new Ground(76, "Golem", "Rock/Ground", 80, 120, 130, 45));
       // psychic
        cadastrar(new Psychic(63, "Abra", "Psychic", 25, 20, 15, 90));
        cadastrar(new Psychic(64, "Kadabra", "Psychic", 40, 35, 30, 105));
        cadastrar(new Psychic(65, "Alakazam", "Psychic", 55, 50, 45, 120));
        cadastrar(new Psychic(96, "Drowzee", "Psychic", 60, 48, 45, 42));
        cadastrar(new Psychic(97, "Hypno", "Psychic", 85, 73, 70, 67));
        cadastrar(new Psychic(150, "Mewtwo", "Psychic", 106, 110, 90, 130));
        cadastrar(new Psychic(151, "Mew", "Psychic", 100, 100, 100, 100));
        cadastrar(new Psychic(122, "Mr. Mime", "Psychic", 40, 45, 65, 90));
       // bug
        cadastrar(new Bug(10, "Caterpie", "Bug", 45, 30, 35, 45));
        cadastrar(new Bug(11, "Metapod", "Bug", 50, 20, 55, 30));
        cadastrar(new Bug(127, "Pinsir", "Bug", 65, 125, 100, 85));
       // bug flying
        cadastrar(new Bug(12, "Butterfree", "Bug/Flying", 60, 45, 50, 70));
        cadastrar(new Bug(123, "Scyther", "Bug/Flying", 70, 110, 80, 105));
       // bug poison
        cadastrar(new Bug(13, "Weedle", "Bug/Poison", 40, 35, 30, 50));
        cadastrar(new Bug(14, "Kakuna", "Bug/Poison", 45, 25, 50, 35));
        cadastrar(new Bug(15, "Beedrill", "Bug/Poison", 65, 90, 40, 75));
        cadastrar(new Bug(48, "Venonat", "Bug/Poison", 60, 55, 50, 45));
        cadastrar(new Bug(49, "Venomoth", "Bug/Poison", 70, 65, 60, 90));
       // bug grass
        cadastrar(new Bug(46, "Paras", "Bug/Grass", 35, 70, 55, 25));
        cadastrar(new Bug(47, "Parasect", "Bug/Grass", 60, 95, 80, 30));
       // rock
        cadastrar(new Rock(95, "Onix", "Rock/Ground", 35, 45, 160, 70));
       // rock water
        cadastrar(new Rock(138, "Omanyte", "Rock/Water", 35, 40, 100, 35));
        cadastrar(new Rock(139, "Omastar", "Rock/Water", 70, 60, 125, 55));
        cadastrar(new Rock(140, "Kabuto", "Rock/Water", 30, 80, 90, 55));
        cadastrar(new Rock(141, "Kabutops", "Rock/Water", 60, 115, 105, 80));
       // rock flying
        cadastrar(new Rock(142, "Aerodactyl", "Rock/Flying", 80, 105, 65, 130));
       // ghost poison
        cadastrar(new Ghost(92, "Gastly", "Ghost/Poison", 30, 35, 30, 80));
        cadastrar(new Ghost(93, "Haunter", "Ghost/Poison", 45, 50, 45, 95));
        cadastrar(new Ghost(94, "Gengar", "Ghost/Poison", 60, 65, 60, 110));
       // dragon
        cadastrar(new Dragon(147, "Dratini", "Dragon", 41, 64, 45, 50));
        cadastrar(new Dragon(148, "Dragonair", "Dragon", 61, 84, 65, 70));
       // dragon flying
        cadastrar(new Dragon(149, "Dragonite", "Dragon/Flying", 91, 134, 95, 80));
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