package questao3;

public class TrabalhoVoluntario extends Projeto {


    private String trabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String trabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.trabalho = trabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }


    @Override
    public boolean validaProjeto() {
        return false;
    }

    @Override
    public String imprimeProjeto() {
        return null;
    }
}
