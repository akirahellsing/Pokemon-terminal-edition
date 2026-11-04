public class Pokedex {

    public Pokemon buscarPorNumero(int num) {
        Pokemon p = null;
        switch (num) {
            case 1: p = new Grass(1, "Bulbasaur", "Grass/Poison", 45, 49, 49, 45); break;
            case 2: p = new Grass(2, "Ivysaur", "Grass/Poison", 60, 62, 63, 60); break;
            case 3: p = new Grass(3, "Venusaur", "Grass/Poison", 80, 82, 83, 80); break;
            case 4: p = new Fire(4, "Charmander", "Fire", 39, 52, 43, 65); break;
            case 5: p = new Fire(5, "Charmeleon", "Fire", 58, 64, 58, 80); break;
            case 6: p = new Fire(6, "Charizard", "Fire/Flying", 78, 84, 78, 100); break;
            case 7: p = new Water(7, "Squirtle", "Water", 44, 48, 65, 43); break;
            case 8: p = new Water(8, "Wartortle", "Water", 59, 63, 80, 58); break;
            case 9: p = new Water(9, "Blastoise", "Water", 79, 83, 100, 78); break;
            case 16: p = new Normal(16, "Pidgey", "Normal/Flying", 40, 45, 40, 56); break;
            case 19: p = new Normal(19, "Rattata", "Normal", 30, 56, 35, 72); break;
            case 25: p = new Electric(25, "Pikachu", "Electric", 35, 55, 40, 90); break;
            case 63: p = new Psychic(63, "Abra", "Psychic", 25, 20, 15, 90); break;
            case 74: p = new Rock(74, "Geodude", "Rock/Ground", 40, 80, 100, 20); break;
            case 92: p = new Ghost(92, "Gastly", "Ghost/Poison", 30, 35, 30, 80); break;
            default: return null;
        }
        if (p != null) setCatchRate(p);
        return p;
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
            case "pidgey": return buscarPorNumero(16);
            case "rattata": return buscarPorNumero(19);
            case "pikachu": return buscarPorNumero(25);
            case "abra": return buscarPorNumero(63);
            case "geodude": return buscarPorNumero(74);
            case "gastly": return buscarPorNumero(92);
            default: return null;
        }
    }

    public Pokemon criarPokemon(String nome, int level) {
        Pokemon p = null;
        switch (nome) {
            case "Bulbasaur":  p = new Grass(1, "Bulbasaur", "Grass/Poison", 45, 49, 49, 45, level); break;
            case "Ivysaur":    p = new Grass(2, "Ivysaur", "Grass/Poison", 60, 62, 63, 60, level); break;
            case "Venusaur":   p = new Grass(3, "Venusaur", "Grass/Poison", 80, 82, 83, 80, level); break;
            case "Charmander": p = new Fire(4, "Charmander", "Fire", 39, 52, 43, 65, level); break;
            case "Charmeleon": p = new Fire(5, "Charmeleon", "Fire", 58, 64, 58, 80, level); break;
            case "Charizard":  p = new Fire(6, "Charizard", "Fire/Flying", 78, 84, 78, 100, level); break;
            case "Squirtle":   p = new Water(7, "Squirtle", "Water", 44, 48, 65, 43, level); break;
            case "Wartortle":  p = new Water(8, "Wartortle", "Water", 59, 63, 80, 58, level); break;
            case "Blastoise":  p = new Water(9, "Blastoise", "Water", 79, 83, 100, 78, level); break;
            case "Pidgey":     p = new Normal(16, "Pidgey", "Normal/Flying", 40, 45, 40, 56, level); break;
            case "Rattata":    p = new Normal(19, "Rattata", "Normal", 30, 56, 35, 72, level); break;
            case "Pikachu":    p = new Electric(25, "Pikachu", "Electric", 35, 55, 40, 90, level); break;
            case "Geodude":    p = new Rock(74, "Geodude", "Rock/Ground", 40, 80, 100, 20, level); break;
            case "Gastly":     p = new Ghost(92, "Gastly", "Ghost/Poison", 30, 35, 30, 80, level); break;
            case "Abra":       p = new Psychic(63, "Abra", "Psychic", 25, 20, 15, 90, level); break;
            default:           return null;
        }
        if (p != null) setCatchRate(p);
        return p;
    }

    private void setCatchRate(Pokemon p) {
        switch (p.name) {
            case "Bulbasaur": case "Ivysaur": case "Venusaur":
            case "Charmander": case "Charmeleon": case "Charizard":
            case "Squirtle": case "Wartortle": case "Blastoise":
                p.setCatchRate(45); break;
            case "Pikachu": p.setCatchRate(190); break;
            case "Pidgey": p.setCatchRate(255); break;
            case "Rattata": p.setCatchRate(255); break;
            case "Geodude": p.setCatchRate(255); break;
            case "Gastly": p.setCatchRate(190); break;
            case "Abra": p.setCatchRate(200); break;
            default: p.setCatchRate(255); break;
        }
    }
}
