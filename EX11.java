import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        int numero2 = input.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int numero3 = input.nextInt();

        if (numero1 <= numero2 && numero2 <= numero3) {
            System.out.println("Os números em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
        } else if (numero1 <= numero3 && numero3 <= numero2) {
            System.out.println("Os números em ordem crescente: " + numero1 + ", " + numero3 + ", " + numero2);
        } else if (numero2 <= numero1 && numero1 <= numero3) {
            System.out.println("Os números em ordem crescente: " + numero2 + ", " + numero1 + ", " + numero3);
        } else if (numero2 <= numero3 && numero3 <= numero1) {
            System.out.println("Os números em ordem crescente: " + numero2 + ", " + numero3 + ", " + numero1);
        } else if (numero3 <= numero1 && numero1 <= numero2) {
            System.out.println("Os números em ordem crescente: " + numero3 + ", " + numero1 + ", " + numero2);
        } else {
            System.out.println("Os números em ordem crescente: " + numero3 + ", " + numero2 + ", " + numero1);
        }

        input.close();
    }
}
