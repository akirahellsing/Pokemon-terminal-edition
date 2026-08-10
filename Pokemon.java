import java.util.ArrayList;

public class Pokemon {
    int number;
    String name;
    String type;
    int hp, atk, def, spd;

    int level = 5;
    int currentHp;
    int currentExp = 0;
    int expToNextLevel;
    PokemonType type1;
    PokemonType type2;
    Move[] moves = new Move[4];

    int atkStage = 0, defStage = 0, spdStage = 0;
    int accuracyStage = 0, evasionStage = 0;
    MoveCondition status = MoveCondition.NONE;
    int sleepTurns = 0, confusionTurns = 0;
    boolean flinched = false;

    public Pokemon(int number, String name, String type, int hp, int atk, int def, int spd) {
        this(number, name, type, hp, atk, def, spd, 5);
    }

    public Pokemon(int number, String name, String type, int hp, int atk, int def, int spd, int level) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.hp = hp; this.atk = atk; this.def = def; this.spd = spd;
        this.level = level;
        this.currentHp = calcMaxHp();
        this.expToNextLevel = calcExpToNextLevel();
        parseTypes(type);
        initMoves();
    }

    private void parseTypes(String typeStr) {
        String[] parts = typeStr.split("/");
        this.type1 = parseType(parts[0].trim());
        this.type2 = (parts.length > 1) ? parseType(parts[1].trim()) : null;
    }

    private PokemonType parseType(String t) {
        try { return PokemonType.valueOf(t.toUpperCase().replace(" ", "_")); }
        catch (IllegalArgumentException e) { return PokemonType.NORMAL; }
    }

    private void initMoves() {
        ArrayList<Move> availableMoves = PokemonLearnset.getMovesUpToLevel(name, level);
        int start = Math.max(0, availableMoves.size() - 4);
        for (int i = 0; i < 4 && (start + i) < availableMoves.size(); i++) {
            moves[i] = availableMoves.get(start + i).copy();
        }
    }

    public int calcMaxHp() { return hp + (level * 2); }

    public int getEffectiveAtk() { return applyStageMultiplier(atk, atkStage); }
    public int getEffectiveDef() { return applyStageMultiplier(def, defStage); }
    public int getEffectiveSpd() { return applyStageMultiplier(spd, spdStage); }

    private int applyStageMultiplier(int stat, int stage) {
        if (stage >= 0) return (int)(stat * (2.0 + stage) / 2.0);
        else return (int)(stat * 2.0 / (2.0 + Math.abs(stage)));
    }

    public int calcExpToNextLevel() {
        return (level * level * level) / 5 + 10;
    }

    public boolean gainExp(int amount) {
        currentExp += amount;
        boolean leveledUp = false;
        while (currentExp >= expToNextLevel && level < 100) {
            currentExp -= expToNextLevel;
            levelUp();
            leveledUp = true;
        }
        return leveledUp;
    }

    private void levelUp() {
        if (level >= 100) return;
        level++;
        System.out.println("\n*** " + name.toUpperCase() + " grew to level " + level + "! ***");

        int hpGain = 1 + (hp / 40);
        int atkGain = 1 + (atk / 50);
        int defGain = 1 + (def / 50);
        int spdGain = 1 + (spd / 50);

        hp += hpGain; atk += atkGain; def += defGain; spd += spdGain;
        currentHp += hpGain;
        if (currentHp > calcMaxHp()) currentHp = calcMaxHp();

        System.out.println("   HP  +" + hpGain + " -> " + hp);
        System.out.println("   ATK +" + atkGain + " -> " + atk);
        System.out.println("   DEF +" + defGain + " -> " + def);
        System.out.println("   SPD +" + spdGain + " -> " + spd);

        expToNextLevel = calcExpToNextLevel();
        checkLearnNewMove();
    }

    private void checkLearnNewMove() {
        Move newMove = PokemonLearnset.getMoveAtLevel(name, level);
        if (newMove == null) return;

        for (int i = 0; i < 4; i++) {
            if (moves[i] != null && moves[i].getName().equals(newMove.getName())) return;
        }

        for (int i = 0; i < 4; i++) {
            if (moves[i] == null) {
                moves[i] = newMove.copy();
                System.out.println(">>> " + name + " learned " + newMove.getName() + "!");
                return;
            }
        }

        System.out.println(">>> " + name + " wants to learn " + newMove.getName() + "!");
        System.out.println("    But " + name + " already knows 4 moves!");
        System.out.println("    (Move replacement not yet implemented)");
    }

    public void setMove(int slot, Move move) {
        if (slot >= 0 && slot < 4 && move != null) {
            moves[slot] = move.copy();
            moves[slot].restoreAllPP();
        }
    }

    public Move getMove(int slot) {
        return (slot >= 0 && slot < 4) ? moves[slot] : null;
    }

    public void listMoves() {
        for (int i = 0; i < 4; i++) {
            if (moves[i] != null) System.out.println("  [" + (i+1) + "] " + moves[i]);
            else System.out.println("  [" + (i+1) + "] ---");
        }
    }

    public boolean takeDamage(int damage) {
        currentHp -= damage;
        if (currentHp < 0) currentHp = 0;
        return currentHp <= 0;
    }

    public void heal(int amount) {
        currentHp = Math.min(currentHp + amount, calcMaxHp());
    }

    public void fullHeal() {
        currentHp = calcMaxHp();
        status = MoveCondition.NONE;
        sleepTurns = 0; confusionTurns = 0;
        atkStage = 0; defStage = 0; spdStage = 0;
        accuracyStage = 0; evasionStage = 0;
        for (Move m : moves) if (m != null) m.restoreAllPP();
    }

    public boolean isFainted() { return currentHp <= 0; }

    public void modifyAtk(int s) { atkStage = clamp(atkStage + s); }
    public void modifyDef(int s) { defStage = clamp(defStage + s); }
    public void modifySpd(int s) { spdStage = clamp(spdStage + s); }
    public void modifyAccuracy(int s) { accuracyStage = clamp(accuracyStage + s); }
    public void modifyEvasion(int s) { evasionStage = clamp(evasionStage + s); }

    private int clamp(int s) { return Math.max(-6, Math.min(6, s)); }

    private String bar(int valor, int max) {
        int t = 20, c = (valor * t) / max;
        if (c > t) c = t; if (c < 0) c = 0;
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < t; i++) b.append(i < c ? '█' : '░');
        return b.toString();
    }

    private String formatarTipo() {
        String[] tipos = type.split("/");
        StringBuilder sb = new StringBuilder();
        for (String t : tipos) sb.append("[").append(t).append("] ");
        return sb.toString().trim();
    }

    public void exibir() {
        System.out.println("┌────────── POKÉDEX ──────────┐");
        System.out.println("│ #" + number + " " + name.toUpperCase() + "  Lv." + level);
        System.out.println("│ " + formatarTipo());
        System.out.println("├─────────────────────────────┤");
        System.out.println("│ HP  " + bar(hp, 250) + " " + String.format("%3d", hp) + " (max:" + calcMaxHp() + ")");
        System.out.println("│ ATK " + bar(atk, 134) + " " + String.format("%3d", atk));
        System.out.println("│ DEF " + bar(def, 180) + " " + String.format("%3d", def));
        System.out.println("│ SPD " + bar(spd, 150) + " " + String.format("%3d", spd));
        System.out.println("│ EXP " + currentExp + "/" + expToNextLevel);
        System.out.println("└─────────────────────────────┘");
    }

    public void exibirBatalha() {
        System.out.println(name.toUpperCase() + " Lv" + level + "  [" + type + "]");
        System.out.println("HP: " + currentHp + "/" + calcMaxHp() + " " + bar(currentHp, calcMaxHp()));
        if (status != MoveCondition.NONE) System.out.println("STATUS: " + status);
    }
}