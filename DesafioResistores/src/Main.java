import br.com.service.ResistorService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResistorService resistorService = new ResistorService();

        try {
            System.out.print("Digite o valor do resistor: ");
            String input = scanner.nextLine();

            String result = resistorService.evaluateResistors(input);
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de que a entrada está no formato correto. Ex: 10 ohms");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}