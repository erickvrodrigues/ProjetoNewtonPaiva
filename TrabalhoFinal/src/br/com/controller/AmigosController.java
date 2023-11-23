package br.com.controller;

import br.com.DAO.AmigosDAO;
import br.com.DAO.UsuarioDAO;
import br.com.model.Amigos;
import br.com.model.Usuario;

import java.util.List;

public class AmigosController {
    public void inserir(Usuario usuario,Usuario amigo){
        AmigosDAO amigosDAO = new AmigosDAO();
        try{
            amigosDAO.inserir(usuario,amigo);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public List<Integer> getById(int id){
        AmigosDAO amigosDAO = new AmigosDAO();
        try{
            return amigosDAO.getById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void delete(Integer id){
        AmigosDAO amigosDAO = new AmigosDAO();
        try{
           amigosDAO.delete(id);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
