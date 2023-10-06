package questao3;

public class DistribuicaoAlimento extends Projeto{

    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    @Override
    public boolean validaProjeto() {

            if(getDataFim().equals("")){
                return true;
            }else {
                return  false;
            }
    }

    @Override
    public String imprimeProjeto() {

        return "Nome: " + getNomeProjeto() + "\nDescrição: " + getDescricao() + "\nData Inicio: " + getDataInicio() +
                "\nData Fim: " + getDataFim() + "\nDescrição Alimentos: " + getDescAlimento() + "\nQuantidade: " + getQtde();

    }
}
