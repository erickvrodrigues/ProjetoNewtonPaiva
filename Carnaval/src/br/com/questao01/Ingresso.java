//Crie uma classe chamada Ingresso que possui um valor em reais.
//Crie o construtor dessa classe e os métodos Set e Get.
//SuperClasse.
package br.com.questao01;

public class Ingresso {
    private double valorIngresso;

    public Ingresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }
    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

}
