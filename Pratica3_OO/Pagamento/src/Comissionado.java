public class Comissionado extends Funcionario {
    private double percentual;
    private double venda;

    public Comissionado(String matricula, String nome, double salario, double percentual, double venda) {
        super(matricula, nome, salario);
        this.percentual = percentual;
        this.venda = venda;
    }

    @Override
    public double calcularProventos() {
        double comissao = (percentual / 100) * venda;
        return super.calcularProventos() + comissao;
    }
}