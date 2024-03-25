import java.util.Scanner;

public class Ex10 {
    public static void executar() {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite o numero de 1 a 5: ");
        int numero = imprimir.nextInt();

        switch (numero) {
            case  1:
                System.out.println("UM");             
                break;
            case 2:
                System.out.println("DOIS");             
                break;
            case 3:
                System.out.println("TRES");             
                break;
            case 4:
                System.out.println("QUATRO");             
                break;
            case 5:
                System.out.println("CINCO");             
                break;
        
            default:
                System.out.println("Numero invalido !");
                break;
        }
    }
}
