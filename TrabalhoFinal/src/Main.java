import br.com.config.DAO.UsuarioDAO;
import br.com.config.model.Usuario;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Usuario usuario = new Usuario("kimputinha","kimputinha123@gmail.com","souputinha");
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.Inserir(usuario);

    }
}