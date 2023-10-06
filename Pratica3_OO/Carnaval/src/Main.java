import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("(1) Ingresso Normal");
        System.out.println("(2) VIP");
        System.out.println("(3) Camarote");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe o valor do ingresso normal:");
                double valorNormal = scanner.nextDouble();
                Normal ingressoNormal = new Normal(valorNormal);
                ingressoNormal.imprimirValor();
                break;

            case 2:
                System.out.println("Informe o valor do ingresso VIP:");
                double valorVIP = scanner.nextDouble();
                System.out.println("Informe o valor adicional do ingresso VIP:");
                double adicionalVIP = scanner.nextDouble();
                VIP ingressoVIP = new VIP(valorVIP, adicionalVIP);
                ingressoVIP.imprimirValor();
                break;

            case 3:
                System.out.println("Informe o valor do ingresso do camarote:");
                double valorCamarote = scanner.nextDouble();
                System.out.println("Informe o valor adicional do camarote:");
                double adicionalCamarote = scanner.nextDouble();
                System.out.println("Informe a localização do camarote:");
                scanner.nextLine(); // Limpa o buffer
                String localizacaoCamarote = scanner.nextLine();
                Camarote ingressoCamarote = new Camarote(valorCamarote, adicionalCamarote, localizacaoCamarote);
                ingressoCamarote.imprimirValor();
                break;

            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}