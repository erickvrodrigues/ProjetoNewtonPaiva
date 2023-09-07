import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da avaliação 1: ");
        double notaAvaliacao1 = scanner.nextDouble();


        System.out.print("Digite a nota da avaliação 2: ");
        double notaAvaliacao2 = scanner.nextDouble();
        NotaAluno notaAluno = new NotaAluno(notaAvaliacao1,notaAvaliacao2);
        notaAluno.avaliarRecuperacao(notaAluno.getNotaAe());

    }
}