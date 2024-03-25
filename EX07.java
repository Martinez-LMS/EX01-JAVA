import java.util.Scanner;

public class Ex07 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        
        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está dentro do intervalo entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo entre 100 e 200.");
        }

    }
}
