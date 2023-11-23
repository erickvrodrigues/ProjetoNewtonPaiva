package br.com.views;

import br.com.model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListaUsuario extends JFrame {
    private JList<Usuario> listaUsuarios;
    public ListaUsuario(List<Usuario> usuarios) {


        setTitle("Usuários");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        listaUsuarios = new JList<>(usuarios.toArray(new Usuario[0]));
        listaUsuarios.setCellRenderer(new ListagemAdd());
        JScrollPane scrollPane = new JScrollPane(listaUsuarios);
        JPanel botoesPanel = new JPanel();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(botoesPanel, BorderLayout.SOUTH);


    }


}
