import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o investimento inicial (R$): ");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Informe a taxa de rendimento mensal (% a/m): ");
        double taxaMensal = scanner.nextDouble();

        System.out.print("Informe o número de meses: ");
        int numeroDeMeses = scanner.nextInt();

        scanner.close();

        double rendimento = calcularRendimento(investimentoInicial, taxaMensal, numeroDeMeses);

        System.out.println("Investimento: R$ " + investimentoInicial);
        System.out.println("Taxa do Rendimento: " + taxaMensal + "% a/m");
        System.out.println("Número de meses: " + numeroDeMeses);
        System.out.println("Rendimento: R$ " + rendimento);
    }

    public static double calcularRendimento(double investimentoInicial, double taxaMensal, int numeroDeMeses) {
        double rendimento = investimentoInicial;
        for (int i = 0; i < numeroDeMeses; i++) {
            rendimento += rendimento * (taxaMensal / 100);
        }
        return rendimento - investimentoInicial;
    }
}