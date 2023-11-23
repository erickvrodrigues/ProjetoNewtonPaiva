package br.com.controller;

import br.com.DAO.UsuarioDAO;
import br.com.model.Usuario;

import java.awt.*;
import java.util.List;

public class UsuarioController {
    public java.util.List<Usuario> getAllUsuarios(){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> listaUsuario = usuarioDAO.getAll();
        return listaUsuario;
    }
    public void inserir(Usuario usuario){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        try{
            usuarioDAO.inserir(usuario);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public List<Usuario> getByEmail(String email){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        try{
            return usuarioDAO.getByEmail(email);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Usuario> getById(int id){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        try{
            return usuarioDAO.getById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
