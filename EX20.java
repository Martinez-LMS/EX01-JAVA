import java.util.Scanner;

public class EX20 {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Digite o tempo da viagem em horas: ");
        double tempoViagem = imprimir.nextDouble();

        System.out.println("Digite a velocidade média da viagem em km/h: ");
        double velocidadeMedia = imprimir.nextDouble();

        // Calcula a distância percorrida
        double distancia = tempoViagem * velocidadeMedia;

        // Calcula a quantidade de litros de combustível 
        double litrosGastos = distancia / 12;

        System.out.println("Quantidade de litros de combustível gasta: " + litrosGastos);

    }
}
