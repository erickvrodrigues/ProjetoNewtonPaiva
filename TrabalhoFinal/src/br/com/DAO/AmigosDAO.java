package br.com.DAO;

import br.com.config.Conexao;
import br.com.model.Amigos;
import br.com.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AmigosDAO {
    private static final String INSERT_USERS_SQL = "INSERT INTO amigos(usuario_id,amigo_id) VALUES (?, ?)";
    public void inserir(Usuario usuario,Usuario amigo) throws SQLException {


        try {
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement(INSERT_USERS_SQL);
            preparedStatement.setInt(1, usuario.getUsuario_id());
            preparedStatement.setInt(2, amigo.getUsuario_id());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();

        }


    }
    public List<Integer> getById(int id){
        try{
            String sql = "SELECT * FROM amigos WHERE usuario_id = ?";
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Amigos>  listaAmigos = new ArrayList<>();
            List<Integer> idsAmigos  = new ArrayList<Integer>();
            while (resultSet.next()) {
                idsAmigos.add(resultSet.getInt("amigo_id"));
            }

            return idsAmigos;

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public void delete(Integer id){
        try{
            String sql = "delete from amigos where amigos_id = ?";
            Conexao conexao = new Conexao();
            Connection connection =  conexao.getConexao();
            PreparedStatement preparedStatement =  connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
