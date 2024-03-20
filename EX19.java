import java.util.Scanner;

public class EX19 {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro: ");
        double raio = imprimir.nextDouble();

        System.out.println("Digite a altura do cilindro: ");
        double altura = imprimir.nextDouble();


        double volume = 3.14 * Math.pow(raio, 2) * altura;

        System.out.println("Volume do cilindro: " + volume);

    }
}
