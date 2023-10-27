package RedeSocial;

public class Publicacao {
    private String contadorPublicacao;
    private String textoPublicacao;
    private String linkMidia;


    public static double contadorPublic(){

    }
    public Publicacao(String contadorPublicaaco, String textoPublicacao, String linkMidia) {
        this.contadorPublicacao = contadorPublicaaco;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
    }

    public String getContadorPublicaaco() {
        return contadorPublicacao;
    }

    public void setContadorPublicaaco(String contadorPublicaaco) {
        this.contadorPublicacao = contadorPublicaaco;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }
}
