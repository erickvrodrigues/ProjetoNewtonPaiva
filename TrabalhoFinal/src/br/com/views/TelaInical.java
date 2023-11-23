package br.com.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInical extends JFrame {
    public TelaInical(){
        setTitle("Bem vindo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(450,230);
        setLocationRelativeTo(null);
        JPanel painel = new JPanel(new GridLayout(1,2));
        JButton  buttonlogin = new JButton("Login");
        JButton buttonCadastro = new JButton("Cadastro");
        buttonlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    Login login = new Login();
                    login.setVisible(true);
                    dispose();
                });
            }
        });
        buttonCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SwingUtilities.invokeLater(() -> {
                    CadastroUsuario cadastro = new CadastroUsuario();
                    cadastro.setVisible(true);
                    dispose();
                });
            }
        });

        painel.add(buttonlogin);
        painel.add(buttonCadastro);
        getContentPane().add(painel,BorderLayout.CENTER);

    }
}
