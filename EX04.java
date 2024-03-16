import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = imprimir.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = imprimir.nextInt();

        int soma = n1 + n2;
        int subtrair = n1 - n2;
        int multiplicar = n1 * n2;
        int dividir = n1 / n2;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + subtrair);
        System.out.println("O resultado da multiplicação é: " + multiplicar);
        System.out.println("O resultado da divisão é: " + dividir);


    }
}
