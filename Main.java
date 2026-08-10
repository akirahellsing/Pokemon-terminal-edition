import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TitleScreen.showSplash(sc);

        int escolha = TitleScreen.showMenu(sc);

        if (escolha == 2) {
            limparTela();
            System.out.println();
            System.out.println("    Closing game...");
            System.out.println();
            sc.close();
            return;
        }

        Game game = new Game(sc);
        game.start();

        sc.close();
    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}