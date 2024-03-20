import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = imprimir.nextDouble();

        System.out.println("Digite o peso da primeira nota: ");
        double peso1 = imprimir.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = imprimir.nextDouble();

        System.out.println("Digite o peso da segunda nota: ");
        double peso2 = imprimir.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = imprimir.nextDouble();

        System.out.println("Digite o peso da terceira nota: ");
        double peso3 = imprimir.nextDouble();

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("Média ponderada: " + mediaPonderada);


    }
}
