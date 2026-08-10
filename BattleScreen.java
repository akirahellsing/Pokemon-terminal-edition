import java.util.Scanner;

public class BattleScreen {
    private Scanner sc;
    private boolean isTrainerBattle;

    public BattleScreen(Scanner sc, boolean isTrainerBattle) {
        this.sc = sc;
        this.isTrainerBattle = isTrainerBattle;
    }

    public int showMainMenu(Pokemon player, Pokemon enemy) {
        while (true) {
            limparTela();
            drawFullBox(player, enemy, new String[]{
                    "  [1] BATTLE",
                    "  [2] POKÉMON",
                    "  [3] ITEMS",
                    "  [4] RUN"
            });

            System.out.print("> ");
            String input = sc.nextLine().trim();

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= 4) {
                    if (choice == 4 && isTrainerBattle) {
                        showMessageInBox(player, enemy, "You can't run from a trainer battle!");
                    } else {
                        return choice;
                    }
                } else {
                    showMessageInBox(player, enemy, "Invalid choice!");
                }
            } catch (NumberFormatException e) {
                showMessageInBox(player, enemy, "Invalid choice!");
            }
        }
    }

    public int showMoveMenu(Pokemon player, Pokemon enemy) {
        while (true) {
            limparTela();

            String[] lines = new String[6];
            for (int i = 0; i < 4; i++) {
                Move m = player.getMove(i);
                if (m != null) {
                    String ppStr = String.format("PP:%2d/%2d", m.getCurrentPP(), m.getMaxPP());
                    lines[i] = String.format("  [%d] %-14s (%s)  %s", (i+1), m.getName(), m.getType(), ppStr);
                } else {
                    lines[i] = "  [" + (i+1) + "] ---";
                }
            }
            lines[4] = "";
            lines[5] = "  [5] BACK";

            drawFullBox(player, enemy, lines);

            System.out.print("> ");
            String input = sc.nextLine().trim();

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= 4) {
                    Move m = player.getMove(choice - 1);
                    if (m == null) {
                        showMessageInBox(player, enemy, "No move in that slot!");
                    } else if (!m.hasPP()) {
                        showMessageInBox(player, enemy, "No PP left for " + m.getName() + "!");
                    } else {
                        return choice;
                    }
                } else if (choice == 5) {
                    return -1;
                } else {
                    showMessageInBox(player, enemy, "Invalid choice!");
                }
            } catch (NumberFormatException e) {
                showMessageInBox(player, enemy, "Invalid choice!");
            }
        }
    }

    public void showBagMenu(Pokemon player, Pokemon enemy) {
        limparTela();
        drawFullBox(player, enemy, new String[]{
                "  B A G",
                "  ────────────────────────────────────",
                "  Your bag is empty!",
                "",
                "  [0] Back"
        });
        System.out.print("> ");
        sc.nextLine();
    }

    public void showSwitchMenu(Pokemon player, Pokemon enemy) {
        limparTela();
        drawFullBox(player, enemy, new String[]{
                "  P O K É M O N   T E A M",
                "  ────────────────────────────────────",
                "  [1] " + player.name + "  Lv." + player.level + "  HP:" + player.currentHp + "/" + player.calcMaxHp(),
                "  [2] ---",
                "  [3] ---",
                "  [4] ---",
                "  [5] ---",
                "  [6] ---",
                "",
                "  [0] Back"
        });
        System.out.print("> ");
        sc.nextLine();
    }

    public void showBattleMessage(Pokemon player, Pokemon enemy, String message) {
        limparTela();
        String[] lines = message.split("\n");
        String[] fullLines = new String[lines.length + 2];
        for (int i = 0; i < lines.length; i++) fullLines[i] = "  " + lines[i];
        fullLines[lines.length] = "";
        fullLines[lines.length + 1] = "  Press ENTER to continue...";
        drawFullBox(player, enemy, fullLines);
        sc.nextLine();
    }

    private void showMessageInBox(Pokemon player, Pokemon enemy, String msg) {
        limparTela();
        drawFullBox(player, enemy, new String[]{
                "  " + msg,
                "",
                "  Press ENTER to continue..."
        });
        sc.nextLine();
    }

    private void drawFullBox(Pokemon player, Pokemon enemy, String[] bottomLines) {
        int width = 41;

        System.out.println("┌" + repeat("─", width) + "┐");
        drawPokemonLine(enemy, width);
        System.out.println("│" + padRight("  HP: " + enemy.currentHp + "/" + enemy.calcMaxHp(), width) + "│");
        if (enemy.status != MoveCondition.NONE) {
            System.out.println("│" + padRight("  Status: " + enemy.status, width) + "│");
        }
        System.out.println("├" + repeat("─", width) + "┤");
        drawPokemonLine(player, width);
        System.out.println("│" + padRight("  HP: " + player.currentHp + "/" + player.calcMaxHp(), width) + "│");
        System.out.println("├" + repeat("─", width) + "┤");

        if (bottomLines != null) {
            for (String line : bottomLines) {
                System.out.println("│" + padRight(line, width) + "│");
            }
        }

        System.out.println("└" + repeat("─", width) + "┘");
    }

    private void drawPokemonLine(Pokemon p, int width) {
        String hpBar = bar(p.currentHp, p.calcMaxHp(), 8);
        String rightSide = "Lv." + p.level + "  [" + hpBar + "]";
        String leftSide = "  " + p.name.toUpperCase();
        int spaces = width - leftSide.length() - rightSide.length();
        if (spaces < 1) spaces = 1;
        System.out.println("│" + padRight(leftSide + repeat(" ", spaces) + rightSide, width) + "│");
    }

    private String bar(int valor, int max, int tamanho) {
        if (max <= 0) max = 1;
        int cheio = (valor * tamanho) / max;
        if (cheio > tamanho) cheio = tamanho;
        if (cheio < 0) cheio = 0;
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            b.append(i < cheio ? '█' : '░');
        }
        return b.toString();
    }

    private String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(s);
        return sb.toString();
    }

    private String padRight(String s, int n) {
        if (s.length() > n) return s.substring(0, n);
        return s + repeat(" ", n - s.length());
    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}