public abstract class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {
        this("", 0);
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAno(String ano) {
        this.ano = Integer.parseInt(ano);
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public abstract void exibirDados();
}
