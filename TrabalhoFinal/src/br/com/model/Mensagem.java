package br.com.model;

public class Mensagem {
    private Integer mensagem_id;
    private String texto;
    private Usuario  usuario;
    private Chat chat;


    public Mensagem(){}

    public Mensagem(String texto, Usuario usuario, Chat chat) {
        this.texto = texto;
        this.usuario = usuario;
        this.chat = chat;
    }


    public Integer getMensagem_id() {
        return mensagem_id;
    }

    public void setMensagem_id(Integer mensagem_id) {
        this.mensagem_id = mensagem_id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }
}
