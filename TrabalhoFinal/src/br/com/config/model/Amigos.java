package br.com.config.model;

import java.sql.ClientInfoStatus;
import java.util.List;

public class Amigos {
    private Integer amigos_id;
    private Usuario usuario;
    private Usuario amigo;

    public Amigos(){}
    public Amigos(Usuario usuario, Usuario amigo) {
        this.usuario = usuario;
        this.amigo = amigo;
    }

    public Integer getAmigos_id() {
        return amigos_id;
    }

    public void setAmigos_id(Integer amigos_id) {
        this.amigos_id = amigos_id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getAmigo() {
        return amigo;
    }

    public void setAmigo(Usuario amigo) {
        this.amigo = amigo;
    }
}
