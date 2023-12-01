package br.com.minimercado;

public class Categoria {
    private String descCategoria;
    private String categoria;

    public Categoria(String descCategoria, String categoria) {
        this.descCategoria = descCategoria;
        this.categoria = categoria;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}

