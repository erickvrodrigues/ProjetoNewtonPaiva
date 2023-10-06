public class Funcionario {
    private String matricula;
    private String nome;
    private double salario;

    public Funcionario(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularProventos() {
        return salario;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", Salário: " + salario;
    }
}