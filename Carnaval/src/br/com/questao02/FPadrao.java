package br.com.questao02;

public class FPadrao extends Funcionario{
    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
    public double calculaProventos(){
        return getSalario();
    }
}
