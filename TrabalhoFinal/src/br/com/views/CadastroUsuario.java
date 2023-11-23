package br.com.views;

import br.com.DAO.UsuarioDAO;
import br.com.controller.UsuarioController;
import br.com.model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuario extends JFrame {
    private JTextField nome;
    private JTextField senha;
    private JTextField email;

    public CadastroUsuario(){
        setTitle("Cadastro de usuario");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(450,230);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(4,2));
        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelEmail = new JLabel("Email: ");
        JLabel labelSenha = new JLabel("Senha: ");
        nome = new JTextField();
        email = new JTextField();
        senha = new JTextField();
        JButton  buttonCadastrar = new JButton("Cadastrar");
        JButton  buttonVoltar = new JButton("Voltar");

        buttonVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    TelaInical inicial = new TelaInical();
                    inicial.setVisible(true);
                    dispose();
                });
            }

        });

        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
                SwingUtilities.invokeLater(() -> {
                    TelaInical inicial = new TelaInical();
                    inicial.setVisible(true);
                    dispose();
                });
            }
        });

        painel.add(labelNome);
        painel.add(nome);
        painel.add(labelEmail);
        painel.add(email);
        painel.add(labelSenha);
        painel.add(senha);
        painel.add(buttonVoltar);
        painel.add(buttonCadastrar);

        getContentPane().add(painel,BorderLayout.CENTER);


    }

    public void cadastrarUsuario(){
        String nomeCampo = nome.getText();
        String emailCampo = email.getText();
        String senhaCampo = senha.getText();
        Usuario usuario = new Usuario(nomeCampo,emailCampo,senhaCampo);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        try{
            usuarioDAO.inserir(usuario);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private void abrirTelaListagem() {
        UsuarioController usuarioController = new UsuarioController();
        ListaUsuario telaCadastro = new ListaUsuario(usuarioController.getAllUsuarios());
        telaCadastro.setVisible(true);
    }
}
