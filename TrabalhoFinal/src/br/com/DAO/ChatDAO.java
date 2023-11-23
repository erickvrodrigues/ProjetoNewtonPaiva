package br.com.DAO;

import br.com.config.Conexao;
import br.com.model.Chat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChatDAO {
    public List<Chat> getChatByidAmigoAndUsuario(Integer idUsario, Integer idAmigo){
        try{
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement("select * from chat where (usuario1_id = ? or usuario2_id = ? ) and (usuario1_id = ? or usuario2_id = ? )");
            preparedStatement.setInt(1, idUsario);
            preparedStatement.setInt(2, idUsario);
            preparedStatement.setInt(3, idAmigo);
            preparedStatement.setInt(4, idAmigo);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Chat>  listaChat = new ArrayList<>();
            while (resultSet.next()) {
                Chat chat = new Chat();
                chat.setChat_id(resultSet.getInt("chat_id"));
                listaChat.add(chat);
            }

            return listaChat;

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public void inserir(Integer idUsuario, Integer idAmigo){
        try {
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement("INSERT INTO chat(usuario1_id,usuario2_id) VALUES (?, ?)");
            preparedStatement.setInt(1, idUsuario);
            preparedStatement.setInt(2, idAmigo);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
