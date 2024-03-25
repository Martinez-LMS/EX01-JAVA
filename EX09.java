import java.util.Scanner;

public class Ex09 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (A): ");
        int numeroA = scanner.nextInt();
        System.out.print("Digite o segundo número (B): ");
        int numeroB = scanner.nextInt();

        if (numeroA == numeroB) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");

            if (numeroA > numeroB) {
                System.out.println("O número " + numeroA + " é o maior.");
            } else {
                System.out.println("O número " + numeroB + " é o maior.");
            }
        }

    }
}
