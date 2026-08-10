public class Pokedex {

    public Pokemon buscarPorNumero(int num) {
        switch (num) {
            case 1: return new Grass(1, "Bulbasaur", "Grass/Poison", 45, 49, 49, 45);
            case 2: return new Grass(2, "Ivysaur", "Grass/Poison", 60, 62, 63, 60);
            case 3: return new Grass(3, "Venusaur", "Grass/Poison", 80, 82, 83, 80);
            case 4: return new Fire(4, "Charmander", "Fire", 39, 52, 43, 65);
            case 5: return new Fire(5, "Charmeleon", "Fire", 58, 64, 58, 80);
            case 6: return new Fire(6, "Charizard", "Fire/Flying", 78, 84, 78, 100);
            case 7: return new Water(7, "Squirtle", "Water", 44, 48, 65, 43);
            case 8: return new Water(8, "Wartortle", "Water", 59, 63, 80, 58);
            case 9: return new Water(9, "Blastoise", "Water", 79, 83, 100, 78);
            case 25: return new Electric(25, "Pikachu", "Electric", 35, 55, 40, 90);
            case 16: return new Normal(16, "Pidgey", "Normal/Flying", 40, 45, 40, 56);
            case 74: return new Rock(74, "Geodude", "Rock/Ground", 40, 80, 100, 20);
            case 92: return new Ghost(92, "Gastly", "Ghost/Poison", 30, 35, 30, 80);
            case 63: return new Psychic(63, "Abra", "Psychic", 25, 20, 15, 90);
            default: return null;
        }
    }

    public Pokemon buscarPorNome(String nome) {
        switch (nome.toLowerCase()) {
            case "bulbasaur": return buscarPorNumero(1);
            case "ivysaur": return buscarPorNumero(2);
            case "venusaur": return buscarPorNumero(3);
            case "charmander": return buscarPorNumero(4);
            case "charmeleon": return buscarPorNumero(5);
            case "charizard": return buscarPorNumero(6);
            case "squirtle": return buscarPorNumero(7);
            case "wartortle": return buscarPorNumero(8);
            case "blastoise": return buscarPorNumero(9);
            case "pikachu": return buscarPorNumero(25);
            case "pidgey": return buscarPorNumero(16);
            case "geodude": return buscarPorNumero(74);
            case "gastly": return buscarPorNumero(92);
            case "abra": return buscarPorNumero(63);
            default: return null;
        }
    }

    public Pokemon criarPokemon(String nome, int level) {
        switch (nome) {
            case "Bulbasaur":  return new Grass(1, "Bulbasaur", "Grass/Poison", 45, 49, 49, 45, level);
            case "Ivysaur":    return new Grass(2, "Ivysaur", "Grass/Poison", 60, 62, 63, 60, level);
            case "Venusaur":   return new Grass(3, "Venusaur", "Grass/Poison", 80, 82, 83, 80, level);
            case "Charmander": return new Fire(4, "Charmander", "Fire", 39, 52, 43, 65, level);
            case "Charmeleon": return new Fire(5, "Charmeleon", "Fire", 58, 64, 58, 80, level);
            case "Charizard":  return new Fire(6, "Charizard", "Fire/Flying", 78, 84, 78, 100, level);
            case "Squirtle":   return new Water(7, "Squirtle", "Water", 44, 48, 65, 43, level);
            case "Wartortle":  return new Water(8, "Wartortle", "Water", 59, 63, 80, 58, level);
            case "Blastoise":  return new Water(9, "Blastoise", "Water", 79, 83, 100, 78, level);
            case "Pikachu":    return new Electric(25, "Pikachu", "Electric", 35, 55, 40, 90, level);
            case "Pidgey":     return new Normal(16, "Pidgey", "Normal/Flying", 40, 45, 40, 56, level);
            case "Geodude":    return new Rock(74, "Geodude", "Rock/Ground", 40, 80, 100, 20, level);
            case "Gastly":     return new Ghost(92, "Gastly", "Ghost/Poison", 30, 35, 30, 80, level);
            case "Abra":       return new Psychic(63, "Abra", "Psychic", 25, 20, 15, 90, level);
            default:           return null;
        }
    }
}