import java.util.Scanner;

public class Ex04 {
    public static void executar() {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = imprimir.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = imprimir.nextInt();

        int soma = n1 + n2;
        int subtrair = n1 - n2;
        int multiplicar = n1 * n2;
        double dividir = 0;

        if (n2 != 0) {
            dividir = (double) n1 / n2;
        } else {
            System.out.println("Não é possível dividir por zero!");
        }

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + subtrair);
        System.out.println("O resultado da multiplicação é: " + multiplicar);

        if (n2 != 0) {
            System.out.println("O resultado da divisão é: " + dividir);
        }
    }
}
