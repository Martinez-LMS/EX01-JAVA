import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = input.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();

        System.out.print("Digite o tipo de operador (+, -, *, /): ");
        char operador = input.next().charAt(0);

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Operador não definido! Use apenas '+', '-', '*' ou '/'.");
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);

    }
}
