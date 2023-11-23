package br.com.DAO;

import br.com.config.Conexao;
import br.com.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private static final String INSERT_USERS_SQL = "INSERT INTO usuario(nome,email,senha) VALUES (?, ?, ?)";



    public void inserir(Usuario usuario) throws SQLException {


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


    }

    public List<Usuario> getAll(){
        try{
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement("select * from usuario");

            ResultSet resultSet = preparedStatement.executeQuery();
            List<Usuario>  listaUsuario = new ArrayList<>();
                while (resultSet.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setNome(resultSet.getString("nome"));
                    usuario.setEmail(resultSet.getString("email"));
                    usuario.setUsuario_id(resultSet.getInt("usuario_id"));
                    listaUsuario.add(usuario);
                }

            return listaUsuario;

        }catch(Exception e){
            e.printStackTrace();
        }
       return null;

    }

    public List<Usuario> getByEmail(String email){
        try{
            String sql = "SELECT * FROM usuario WHERE email = ?";
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Usuario>  listaUsuario = new ArrayList<>();
            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setUsuario_id(resultSet.getInt("usuario_id"));
                usuario.setSenha(resultSet.getString("senha"));
                listaUsuario.add(usuario);
            }

            return listaUsuario;

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public List<Usuario> getById(Integer id){
        try{
            String sql = "SELECT * FROM usuario WHERE usuario_id = ?";
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Usuario>  listaUsuario = new ArrayList<>();
            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setUsuario_id(resultSet.getInt("usuario_id"));
                usuario.setSenha(resultSet.getString("senha"));
                listaUsuario.add(usuario);
            }

            return listaUsuario;

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
