import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar uma instância da classe Onibus
        System.out.println("Digite os dados do ônibus:");
        System.out.print("Placa: ");
        String onibusPlaca = scanner.next();
        System.out.print("Ano: ");
        int onibusAno = scanner.nextInt();
        System.out.print("Assentos: ");
        int onibusAssentos = scanner.nextInt();

        Onibus onibus = new Onibus(onibusPlaca, onibusAno, onibusAssentos);
        onibus.exibirDados();

        // Criar uma instância da classe Caminhao
        System.out.println("\nDigite os dados do caminhão:");
        System.out.print("Placa: ");
        String caminhaoPlaca = scanner.next();
        System.out.print("Ano: ");
        int caminhaoAno = scanner.nextInt();
        System.out.print("Eixos: ");
        int caminhaoEixos = scanner.nextInt();

        Caminhao caminhao = new Caminhao(caminhaoPlaca, caminhaoAno, caminhaoEixos);
        caminhao.exibirDados();

        scanner.close();
    }
}