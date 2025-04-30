import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Por favor, insira um número inteiro: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.next(); // descarta a entrada inválida
            }
        }

        System.out.println("Você inseriu o número: " + number);
    }
}
