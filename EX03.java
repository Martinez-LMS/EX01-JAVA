import java.util.Scanner;

public class Ex03 {
    public static void executar() {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite um numero (A): ");
        if (imprimir.hasNextInt()) {
            int A = imprimir.nextInt();
            System.out.println("Digite outro numero (B): ");
            if (imprimir.hasNextInt()) {
                int B = imprimir.nextInt();

                if (A > B) {
                    System.out.println("Primeiro numero maior A: " + A);
                } else if (A < B) {
                    System.out.println("Segundo numero maior B: " + B);
                } else {
                    System.out.println("[ERRO] numeros iguais opção invalida");
                }
            } else {
                System.out.println("Entrada invalida para o segundo numero (B).");
            }
        } else {
            System.out.println("Entrada invalida para o primeiro numero (A).");
        }
    }
}
