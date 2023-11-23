package br.com.controller;

import br.com.DAO.ChatDAO;
import br.com.model.Chat;

import java.util.List;

public class ChatController {
    public List<Chat> getChatByidAmigoAndUsuario(Integer idUsario, Integer idAmigo){
        ChatDAO chatDAO = new ChatDAO();
        return chatDAO.getChatByidAmigoAndUsuario(idUsario,idAmigo);
    }
    public void inserir(Integer idUsuario, Integer idAmigo){
        ChatDAO chatDAO = new ChatDAO();
        chatDAO.inserir(idUsuario,idAmigo);
    }


}
