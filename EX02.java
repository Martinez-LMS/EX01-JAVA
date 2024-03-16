import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        
        Scanner imprimir = new Scanner(System.in);
        System.out.println("Digite um numero para somar: ");
        int numero1 = imprimir.nextInt();
        System.out.println("Digite outro numero para somar: ");
        int numero2 = imprimir.nextInt();

        int somar = numero1 + numero2;

        System.out.println("A soma dos numeros sao: " + somar);
    }
}
