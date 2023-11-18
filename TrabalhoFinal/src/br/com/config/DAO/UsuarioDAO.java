package br.com.config.DAO;

import br.com.config.Conexao;
import br.com.config.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    private static final String INSERT_USERS_SQL = "INSERT INTO usuario(nome,email,senha) VALUES (?, ?, ?)";



    public void Inserir(Usuario usuario) throws SQLException {

        // Step 1: Establishing a Connection
        try {
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement(INSERT_USERS_SQL);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setString(3, usuario.getSenha());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

           e.printStackTrace();

        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
