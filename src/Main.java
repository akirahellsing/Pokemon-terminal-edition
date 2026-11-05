import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            limparTela();
            System.out.println("=== POKEMON TERMINAL EDITION ===");
            System.out.println("1 - Story Mode");
            System.out.println("2 - Stadium Mode (NEW!!)");
            System.out.println("3 - Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Game game = new Game(scanner);
                    game.start();
                    break;
                case 2:
                    StadiumMode.iniciar(scanner);
                    break;
                case 3:
                    running = false;
                    limparTela();
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        scanner.close();
    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}