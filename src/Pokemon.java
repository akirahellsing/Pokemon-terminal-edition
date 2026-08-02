public class Pokemon {
    int number;
    String name;
    String type;
    int hp, atk, def, spd;

    public Pokemon(int number, String name, String type, int hp, int atk, int def, int spd) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    private String bar(int valor, int max) {
        int tamanho = 20;
        int cheio = (valor * tamanho) / max;
        if (cheio > tamanho) cheio = tamanho;
        if (cheio < 0) cheio = 0;
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            b.append(i < cheio ? '█' : '░');
        }
        return b.toString();
    }

    private String formatarTipo() {
        String[] tipos = type.split("/");
        StringBuilder sb = new StringBuilder();
        for (String t : tipos) {
            sb.append("[").append(t).append("] ");
        }
        return sb.toString().trim();
    }

    public void exibir() {
        System.out.println("┌────────── POKÉDEX ──────────┐");
        System.out.println("│ #" + number + " " + name.toUpperCase());
        System.out.println("│ " + formatarTipo());
        System.out.println("├─────────────────────────────┤");
        System.out.println("│ HP  " + bar(hp, 250) + " " + String.format("%3d", hp));
        System.out.println("│ ATK " + bar(atk, 134) + " " + String.format("%3d", atk));
        System.out.println("│ DEF " + bar(def, 180) + " " + String.format("%3d", def));
        System.out.println("│ SPD " + bar(spd, 150) + " " + String.format("%3d", spd));
        System.out.println("└─────────────────────────────┘");
    }
}