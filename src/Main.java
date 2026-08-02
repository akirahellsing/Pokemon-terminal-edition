import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokedex dex = new Pokedex();

        System.out.println("=== POKÉDEX ===");

        while (true) {
            System.out.print("\nType 'open pokedex' to start (or 'close pokedex' to quit): ");
            String comando = sc.nextLine().trim();

            if (comando.equalsIgnoreCase("close pokedex") || comando.equalsIgnoreCase("exit")) {
                System.out.println("Closing Pokedex...");
                break;
            }

            if (comando.equalsIgnoreCase("open pokedex")) {
                System.out.print("Insert your pokemon: ");
                String entrada = sc.nextLine().trim();

                Pokemon encontrado = null;

                try {
                    int num = Integer.parseInt(entrada);
                    encontrado = dex.buscarPorNumero(num);
                } catch (NumberFormatException e) {
                    encontrado = dex.buscarPorNome(entrada);
                }

                if (encontrado != null) {
                    encontrado.exibir();
                } else {
                    System.out.println("Pokemon not found!");
                }
            } else {
                System.out.println("Invalid command. Type 'open pokedex' to search.");
            }
        }

        sc.close();
    }
}