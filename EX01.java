import java.util.Scanner;

public class Ex01 {
    public static void executar() {
        
        Scanner imprimir = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int entrada = imprimir.nextInt();

        if (entrada > 10) {
            System.out.println("Numero maior que 10");
        }else {
            System.out.println("numero menor ou igual a 10");
        }
    }
}
