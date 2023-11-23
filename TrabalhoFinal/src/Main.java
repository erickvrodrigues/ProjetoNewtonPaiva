import br.com.DAO.UsuarioDAO;
import br.com.model.Usuario;
import br.com.views.CadastroUsuario;
import br.com.views.Login;
import br.com.views.TelaInical;
import br.com.views.TelaPrincipal;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(() -> {
            TelaInical inicial = new TelaInical();
            inicial.setVisible(true);
        });
    }
}