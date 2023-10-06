public final class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Caminhão:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAno());
        System.out.println("Eixos: " + eixos);
    }
}
