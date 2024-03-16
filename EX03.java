import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite um numero (A): ");
        int A = imprimir.nextInt();
        System.out.println("Digite outro numero (B): ");
        int B = imprimir.nextInt();

        if (A > B) {
            System.out.println("Primeiro numero maior A: " + A);
        }else if (A < B){
            System.out.println("Segundo numero maior B: " + B);
        }else{
            System.out.println("[ERRO] numeros iguais opção invalida");
        }
        

    }
}
