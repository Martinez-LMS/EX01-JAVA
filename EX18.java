import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = imprimir.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = imprimir.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = imprimir.nextDouble();


        double mediaHarmonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

        System.out.println("Média harmônica: " + mediaHarmonica);


    }
}
