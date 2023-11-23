package br.com.login;

public class SessaoUsuario {
    private static SessaoUsuario instancia;
    private String nome;
    private Integer id;

    private SessaoUsuario() {

    }

    public static synchronized SessaoUsuario getInstance() {
        if (instancia == null) {
            instancia = new SessaoUsuario();
        }
        return instancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
