package br.com.views;

import br.com.DAO.UsuarioDAO;
import br.com.login.SessaoUsuario;
import br.com.model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Login extends JFrame {
    private JTextField senha;
    private JTextField email;

    public Login(){
        setTitle("Cadastro de usuario");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(450,230);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(3,2));
        JLabel labelEmail = new JLabel("Email: ");
        JLabel labelSenha = new JLabel("Senha: ");
        email = new JTextField();
        senha = new JTextField();
        JButton  buttonLogin = new JButton("Login");


        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logar();
            }
        });


        painel.add(labelEmail);
        painel.add(email);
        painel.add(labelSenha);
        painel.add(senha);
        painel.add(new JLabel());
        painel.add(buttonLogin);
        getContentPane().add(painel,BorderLayout.CENTER);


    }

    public void logar(){


        try{
            String emailCampo = email.getText();
            String senhaCampo = senha.getText();
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            List<Usuario> listaUser = usuarioDAO.getByEmail(emailCampo);
            System.out.println(listaUser);
            if(emailCampo == null || senhaCampo == null ){
                System.out.println("aqui");
                JOptionPane.showMessageDialog(
                        null,
                        "Email ou senha invalidos",
                        "Login invalido",
                        JOptionPane.NO_OPTION);
            }

            if(listaUser.isEmpty()){
                System.out.println("primeiro");
                JOptionPane.showInputDialog("Email ou senha invalidos");
            }else if(listaUser.size() > 1){
                System.out.println("segundo");
                JOptionPane.showInputDialog("Email ou senha invalidos");
            }else if(senhaCampo != null && emailCampo != null){
                System.out.println(listaUser.get(0).getSenha());
                System.out.println(senhaCampo);
                if(senhaCampo.equals(listaUser.get(0).getSenha()) ){
                    System.out.println("senha certa");
                    SessaoUsuario sessao = SessaoUsuario.getInstance();
                    sessao.setNome(listaUser.get(0).getNome());
                    sessao.setId(listaUser.get(0).getUsuario_id());

                    SwingUtilities.invokeLater(() -> {
                        TelaPrincipal telaPrincipal = new TelaPrincipal();
                        telaPrincipal.setVisible(true);
                    });
                }else{
                    System.out.println("quarto");
                    JOptionPane.showMessageDialog(
                            null,
                            "Email ou senha invalidos",
                            "Login invalido",
                            JOptionPane.NO_OPTION);
                }
            }else{
                JOptionPane.showMessageDialog(
                        null,
                        "Email ou senha invalidos",
                        "Login invalido",
                        JOptionPane.NO_OPTION);

            }

        }catch(Exception e){
            e.printStackTrace();
        }
        dispose();

    }

}
