package br.com.controller;

import br.com.DAO.MensagemDAO;
import br.com.model.Mensagem;

import java.sql.SQLException;
import java.util.List;

public class MensagemController {
    public List<Mensagem> getAll(Integer idChat){
        MensagemDAO mensagemDAO = new MensagemDAO();
        return mensagemDAO.getAll(idChat);
    }

    public void inserir(Integer usuarioID,String texto,Integer chatId) throws SQLException {
        MensagemDAO mensagemDAO = new MensagemDAO();
        mensagemDAO.inserir(usuarioID,texto,chatId);

    }
}
