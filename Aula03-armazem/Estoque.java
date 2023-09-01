package armazem;

public class Estoque {
    private int id;
    private String produto;
    private int estoque;
    private double preco;


    //Construtor Alt + Insert
    public Estoque(int id, String produto, int estoque, double preco) {
        this.id = id;
        this.produto = produto;
        this.estoque = estoque;
        this.preco = preco;
    }

    //Métodos
    public void Acrescimo(int qtde) {
        estoque = estoque + qtde;
    }

    public void Baixa(int qtda) {
        if(qtda <= estoque)
           estoque = estoque - qtda;
    }

    public double TotalEstoque(){
        return estoque * preco;
    }

    public String ConsultaEstoque(){
     return "Produto: " + produto + "\nEstoque: " + estoque + "\nPreço: " + preco;
    }

}
