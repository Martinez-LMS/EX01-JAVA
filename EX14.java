import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro termo (a1): ");
        int a1 = input.nextInt();

        System.out.print("Digite o valor da razão (r): ");
        int r = input.nextInt();

        System.out.print("Digite a ordem do termo desejado (n): ");
        int n = input.nextInt();


        int an = a1 + (n - 1) * r;

        System.out.println("O " + n + "º termo da Progressão Aritmética é: " + an);


    }
}
