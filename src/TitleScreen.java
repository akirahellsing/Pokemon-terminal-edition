import java.util.Scanner;

public class TitleScreen {

    private static final String[] ARTE_POKEMON = {
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡾⠟⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⢀⣀⣀⣤⣀⣀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣄⣴⣶⣦⣄⡀⠀⢠⣿⣟⣠⣴⢺⠙⣀⣀⣀⣀⣤⣤⣤⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",
            "⠀⠀⣀⣤⣦⠾⠿⠛⠛⠛⢻⢶⣤⡀⠀⠀⣤⣶⡾⠟⠟⣹⣿⠟⠻⣷⣔⣾⣿⡿⠿⢯⣦⣴⣿⣿⠛⠛⣿⡏⠉⢿⡅⠀⠀⣴⣶⣦⣦⣄⣤⣀⣀⠀⠀⠀",
            "⢤⣾⣿⠉⠀⠀⠀⠀⠀⠀⠈⢊⣷⡂⠀⢿⣿⣷⡇⠀⣼⠋⠀⠀⣨⣿⠋⢁⣤⣤⡈⢈⣿⣿⡇⠀⠀⢸⠁⠀⢺⡷⢀⢀⣿⣿⣿⠁⠈⠻⣿⣿⠛⢾⢶⡴",
            "⠈⢿⣿⣧⣠⡄⠀⠀⢸⣿⣿⡆⠀⣿⣧⡶⠿⢿⢿⣇⠀⠁⠀⢀⡾⣿⡇⠀⣿⡿⠋⣰⠿⣿⣿⠃⠀⠀⠈⠀⠀⢠⡿⢟⡫⠍⠙⢿⡄⠀⠰⣿⡇⠀⢠⡿⠃",
            "⠀⠀⢻⡿⣿⣷⡀⠀⠀⢹⠟⢁⣼⡟⢁⣾⣍⣠⡆⣽⡆⠀⠀⠛⠹⢛⢷⣄⠈⠀⠈⠁⠀⣱⣿⠃⠀⣦⠀⣠⢠⣿⠁⡺⣷⣤⡟⢠⣿⢀⠀⢾⠀⠀⣾⡋⠀",
            "⠀⠀⠀⠀⠸⣿⣷⡀⠀⠀⢴⣿⣿⠀⠈⠹⠛⠛⠁⣼⡇⠘⣿⣶⣤⣀⠈⠝⢳⢶⣶⣾⢿⣿⣇⡀⢸⣿⣧⣿⣘⣿⡀⠈⠈⠉⠀⣼⠏⣼⠀⠀⠀⣸⡯⠀⠀",
            "⠀⠀⠀⠀⠀⢻⣿⣷⠀⠀⣾⣿⣿⣧⣀⠀⢀⣀⣴⣿⠀⢠⣿⠙⢻⣿⣿⣶⣤⣺⡇⠀⠛⢻⣿⣿⣿⣿⣿⣿⣇⣪⢻⣶⣶⣶⣿⠃⠀⣿⠀⠀⢠⣿⠂⠀⠀",
            "⠀⠀⠀⠀⠀⠈⢿⣿⣆⠀⢠⣿⡿⢿⣿⣶⣾⠿⣿⣿⣶⣾⠿⠀⠀⠈⠙⠻⢿⣿⡇⠀⠀⠀⠀⠀⠀⠘⠹⢿⣿⣿⣾⣿⡏⣿⣿⣶⣶⣿⠀⠀⣼⠗⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⠘⣿⣿⣦⣴⣾⠿⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠉⢽⣿⣶⣶⣟⠁⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⠀⠘⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠀⠀"
    };

    private static final String[] TEXTO_EDICAO = {
            "",
            "     ================================================     ",
            "     ||                                            ||     ",
            "     ||     T E R M I N A L   E D I T I O N        ||     ",
            "     ||                                            ||     ",
            "     ================================================     ",
            ""
    };

    public static void showSplash(Scanner sc) {
        limparTela();

        for (String linha : ARTE_POKEMON) {
            System.out.println(linha);
        }
        for (String linha : TEXTO_EDICAO) {
            System.out.println(linha);
        }

        System.out.println();
        System.out.println("              Press ENTER to continue...");
        System.out.println();

        sc.nextLine();
    }

    public static int showMenu(Scanner sc) {
        int opcao = 1;
        String[] opcoes = {"NEW GAME", "EXIT"};

        while (true) {
            limparTela();

            System.out.println();
            System.out.println("     =============  M E N U  =============");
            System.out.println();

            for (int i = 0; i < opcoes.length; i++) {
                if (i + 1 == opcao) {
                    System.out.println("           > " + opcoes[i] + " <");
                } else {
                    System.out.println("             " + opcoes[i]);
                }
            }

            System.out.println();
            System.out.println("         [W] up  [S] down  [ENTER] ok");
            System.out.println("              (or type 1 / 2)");
            System.out.println();

            String input = sc.nextLine().trim().toLowerCase();

            if (input.equals("w") || input.equals("up")) {
                opcao = (opcao == 1) ? 2 : 1;
            } else if (input.equals("s") || input.equals("down")) {
                opcao = (opcao == 1) ? 2 : 1;
            } else if (input.isEmpty() || input.equals("enter")) {
                return opcao;
            } else if (input.equals("1")) {
                return 1;
            } else if (input.equals("2")) {
                return 2;
            }
        }
    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}