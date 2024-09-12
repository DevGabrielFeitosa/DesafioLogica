import java.util.Scanner;
import br.com.service.MatrixService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os valores da matriz NxN: ");
        String input = scanner.nextLine();

        try {
            MatrixService matrixService = new MatrixService(input);
            System.out.println(matrixService.transformMatrix());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}