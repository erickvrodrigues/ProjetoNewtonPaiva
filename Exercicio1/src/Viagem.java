//Biblioteca para que o usuario possa digitar/informar algo.
import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        double velocidade, tempo, distancia, kmlitro;
        double consumo;

        Scanner ler= new Scanner(System.in);
        System.out.println("Digite a velocidade do seu veículo: ");
        velocidade = ler.nextDouble();

        System.out.println("Digite o tempo gasto: ");
        tempo = ler.nextDouble();

        System.out.println("Digite distância gasto: ");
        distancia = ler.nextDouble();
        kmlitro = ler.nextDouble();

        distancia = velocidade * tempo;
        consumo =distancia / kmlitro;

        System.out.println("Consumo médio: " +consumo);
    }

}
