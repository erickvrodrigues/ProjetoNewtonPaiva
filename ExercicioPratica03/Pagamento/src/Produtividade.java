public class Produtividade extends Funcionario {
    private double valor;
    private double producao;

    public Produtividade(String matricula, String nome, double salario, double valor, double producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    @Override
    public double calcularProventos() {
        double produtividade = valor * producao;
        return super.calcularProventos() + produtividade;
    }
}