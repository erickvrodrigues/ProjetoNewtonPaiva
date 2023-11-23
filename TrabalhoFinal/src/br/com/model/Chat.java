package br.com.model;

public class Chat {
    private Integer chat_id;
    private Usuario usuario1;
    private Usuario ususario2;

    public Chat(){

    }
    public Chat(Usuario usuario1, Usuario ususario2) {
        this.usuario1 = usuario1;
        this.ususario2 = ususario2;
    }

    public Integer getChat_id() {
        return chat_id;
    }

    public void setChat_id(Integer chat_id) {
        this.chat_id = chat_id;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Usuario getUsusario2() {
        return ususario2;
    }

    public void setUsusario2(Usuario ususario2) {
        this.ususario2 = ususario2;
    }
}
