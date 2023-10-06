import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do funcionário:");
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Escolha o tipo de funcionário (1 - Padrão, 2 - Produtividade, 3 - Comissionado): ");
        int tipo = scanner.nextInt();

        Funcionario funcionario;

        switch (tipo) {
            case 1:
                funcionario = new Padrao(matricula, nome, salario);
                break;
            case 2:
                System.out.print("Valor por unidade produzida: ");
                double valor = scanner.nextDouble();
                System.out.print("Quantidade de unidades produzidas: ");
                double producao = scanner.nextDouble();
                funcionario = new Produtividade(matricula, nome, salario, valor, producao);
                break;
            case 3:
                System.out.print("Percentual de comissão (%): ");
                double percentual = scanner.nextDouble();
                System.out.print("Total de vendas: ");
                double venda = scanner.nextDouble();
                funcionario = new Comissionado(matricula, nome, salario, percentual, venda);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        double proventos = funcionario.calcularProventos();
        System.out.println("Proventos do funcionário:");
        System.out.println(funcionario);
        System.out.println("Total de Proventos: " + proventos);
    }
}