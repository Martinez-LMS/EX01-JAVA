import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        float Celsius = imprimir.nextFloat();

        float Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheut é: " + Fahrenheit);
    }
}
