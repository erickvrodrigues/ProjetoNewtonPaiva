package br.com.minimercado;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String descProduto;
    private int estoqueAtual;
    private String categoria;
    public String inserirProduto;
    private boolean buscarProduto;

    public Produto(String nomeProduto, double precoProduto, String descProduto,
                   int estoqueAtual, String categoria) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.descProduto = descProduto;
        this.estoqueAtual = estoqueAtual;
        this.categoria = categoria;
        this.inserirProduto = inserirProduto;
        this.buscarProduto = buscarProduto;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getInserirProduto() {
        return inserirProduto;
    }

    public void setInserirProduto(String inserirProduto) {
        this.inserirProduto = inserirProduto;
    }

    public boolean isBuscarProduto() {
        return buscarProduto;
    }

    public void setBuscarProduto(boolean buscarProduto) {
        this.buscarProduto = buscarProduto;
    }

    public boolean buscarProduto(Produto produtoParaBuscar) {
        return this.nomeProduto.equals(produtoParaBuscar.getNomeProduto());

    }


}
