import java.util.Scanner;

public class Rendimento {
    private double investimentoInicial;
    private double taxaMensal;
    private int numeroDeMeses;

    public Rendimento(double investimentoInicial, double taxaMensal, int numeroDeMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaMensal = taxaMensal / 100; // Convertendo a taxa para decimal (ex: 2% para 0.02)
        this.numeroDeMeses = numeroDeMeses;
    }

    public double calcularRendimento() {
        double rendimento = investimentoInicial;
        for (int i = 0; i < numeroDeMeses; i++) {
            rendimento += rendimento * taxaMensal;
        }
        return rendimento - investimentoInicial;
    }
}