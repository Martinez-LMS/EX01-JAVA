import java.util.Scanner;

public class Ex05 {

    public static void executar() {
    Scanner imprimir = new Scanner(System.in);

    System.out.println("Digite o valor A: ");
    int A = imprimir.nextInt();
    System.out.println("Digite o valor B: ");
    int B = imprimir.nextInt();

    System.out.println("O valor de A é: " + A);
    System.out.println("O valor de B é: " + B);
    
    int C = A;
    A = B;    
    B = C;

    System.out.println("Valores de A atual: " + A);
    System.out.println("Valor de B atual: " + B);
}
}
