package br.com.DAO;

import br.com.config.Conexao;
import br.com.model.Mensagem;
import br.com.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MensagemDAO {
    public List<Mensagem> getAll(Integer idChat){
        try{
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement("select * from mensagem where chat_id = ?");
            preparedStatement.setInt(1, idChat);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Mensagem>  listaMensagem = new ArrayList<>();
            while (resultSet.next()) {
                Mensagem mensagem = new Mensagem();
                mensagem.setTexto(resultSet.getString("texto"));
                mensagem.setUsuario(new Usuario(resultSet.getInt("usuario_id")));
                listaMensagem.add(mensagem);
            }

            return listaMensagem;

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }

    public void inserir(Integer usuarioID,String texto,Integer chatId) throws SQLException {


        try {
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement("INSERT INTO mensagem(usuario_id,texto,chat_id) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, usuarioID );
            preparedStatement.setString(2, texto);
            preparedStatement.setInt(3, chatId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();

        }


    }
}
