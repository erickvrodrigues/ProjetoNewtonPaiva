package br.com.views;

import br.com.DAO.UsuarioDAO;
import br.com.controller.AmigosController;
import br.com.controller.ChatController;
import br.com.controller.MensagemController;
import br.com.controller.UsuarioController;
import br.com.login.SessaoUsuario;
import br.com.model.Amigos;
import br.com.model.Chat;
import br.com.model.Mensagem;
import br.com.model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TelaPrincipal extends JFrame {
    private JPanel cardPanel;
    private JList<Usuario> listaUsuarios;
    private CardLayout cardLayout;

    public TelaPrincipal() {
        setTitle("Tela Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Criação do CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Adiciona os painéis de conteúdo
        cardPanel.add(createPanel("Painel 1"), "Painel1");
        cardPanel.add(createPanel("Painel 2"), "Painel2");
        cardPanel.add(createPanelCadastroUsuario(), "CadastroUsuario");
        cardPanel.add(createPanelListaUsuarios(), "ListaUsuarios");
        cardPanel.add(createPanelListaAmigos(), "ListaAmigos");
        cardPanel.add(pesquisaPanelCadastroUsuario(), "consultar");

        JMenuItem usuariosItem = new JMenuItem("Lista de Usuários");
        JMenuItem AmigosItem = new JMenuItem("Lista de Amigos");
        JMenuItem consultaUsuariosItem = new JMenuItem("consulta Usuarios");
        JMenuItem cadastroUsuarioItem = new JMenuItem("Cadastro de Usuário");

        AmigosItem.addActionListener(new TrocarPainelListener("ListaAmigos",cardPanel));
        usuariosItem.addActionListener(new TrocarPainelListener("ListaUsuarios",cardPanel));
        consultaUsuariosItem.addActionListener(new TrocarPainelListener("consultar",cardPanel));
        cadastroUsuarioItem.addActionListener(new TrocarPainelListener("CadastroUsuario",cardPanel));

        add(cardPanel, BorderLayout.CENTER);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");



        menu.add(cadastroUsuarioItem);
        menu.add(usuariosItem);
        menu.add(AmigosItem);
        menu.add(consultaUsuariosItem);



        menuBar.add(menu);


        setJMenuBar(menuBar);
    }

    private JPanel createPanel(String panelName) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel(panelName);
        panel.add(label);
        return panel;
    }

    private JPanel createPanelCadastroUsuario() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JLabel labelNome = new JLabel("Nome:");
        JTextField nome = new JTextField();
        JLabel labelEmail = new JLabel("Email:");
        JTextField email = new JTextField();
        JLabel LabelSenha = new JLabel("Senha:");
        JPasswordField senha = new JPasswordField();
        JButton cadastrar = new JButton("Cadastrar");

        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeCampo = nome.getText();
                String emailCampo = email.getText();
                char[] senhaCaractere = senha.getPassword();
                String senhaCampo = new String(senhaCaractere);
                Usuario usuario = new Usuario(nomeCampo,emailCampo,senhaCampo);
                UsuarioController usuarioController = new UsuarioController();
                usuarioController.inserir(usuario);
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            }
        });

        panel.add(labelNome);
        panel.add(nome);
        panel.add(labelEmail);
        panel.add(email);
        panel.add(LabelSenha);
        panel.add(senha);
        panel.add(new JLabel());
        panel.add(cadastrar);

        return panel;
    }

    private JPanel createPanelListaAmigos() {
        AmigosController amigosController = new AmigosController();
        UsuarioController usuarioController = new UsuarioController();
        SessaoUsuario sessao = SessaoUsuario.getInstance();
        Integer idUsuario = sessao.getId();
        System.out.println(idUsuario);
        List<Integer> listaIdsAmigos = amigosController.getById(idUsuario);
        List<Usuario> listaUsuarioAmigo = new ArrayList<Usuario>();
        if(listaIdsAmigos != null && !listaIdsAmigos.isEmpty()){
            for(Integer id : listaIdsAmigos){
                List<Usuario> listaUsuarioAmigoCarregada = usuarioController.getById(id);
                if(!listaUsuarioAmigoCarregada.isEmpty()){
                    listaUsuarioAmigo.add(listaUsuarioAmigoCarregada.get(0));
                }
            }
            int rows = listaUsuarioAmigo.size();
            JPanel panel = new JPanel(new GridLayout(rows, 3));

            for(Usuario usuario : listaUsuarioAmigo){
                JLabel nome = new JLabel(usuario.getNome());
                panel.add(nome);
                JButton remover = new JButton("Remover Amigo");
                JButton chat = new JButton("chat");
                panel.add(remover);
                panel.add(chat);

                chat.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        abrirChat(idUsuario,usuario);
                    }
                });
                remover.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        AmigosController amigosController = new AmigosController();
                        try{
                            amigosController.delete(usuario.getUsuario_id());
                        }catch(Exception e1){
                            e1.printStackTrace();

                        }
                    }
                });
            }
            return panel;
        }
        JPanel panel2 = new JPanel(new GridLayout(1, 1));
       return panel2;


    }

    private JPanel createPanelListaUsuarios() {

        UsuarioController usuarioController = new UsuarioController();
        List<Usuario> listausers = usuarioController.getAllUsuarios();
        int rows = listausers.size();
        JPanel panel = new JPanel(new GridLayout(rows, 3));
        for(Usuario usuario : listausers){
            JLabel nome = new JLabel(usuario.getNome());
            panel.add(nome);
            JButton adicionar = new JButton("adicionar");
            JButton consultar = new JButton("consultar");
            panel.add(adicionar);
            panel.add(consultar);

            consultar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    consultaPanelCadastroUsuario(usuario);

                }
            });
            adicionar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    AmigosController amigosController = new AmigosController();
                    try{
                        UsuarioController usuarioController = new UsuarioController();
                        SessaoUsuario sessao = SessaoUsuario.getInstance();
                        Integer idUsuario = sessao.getId();
                        List<Usuario> listaUsuario = usuarioController.getById(idUsuario);
                        Usuario usuarioLogado = listaUsuario.get(0);

                        amigosController.inserir(usuarioLogado,usuario);

                    }catch(Exception e1){
                        e1.printStackTrace();

                    }
                }
            });
        }




        return panel;


    }

    private void consultaPanelCadastroUsuario(Usuario usuario) {
        JFrame novaJanela = new JFrame("Nova Janela");
        novaJanela.setSize(400,300);
        JPanel panel = new JPanel(new GridLayout(2, 2));
        JLabel labelNome = new JLabel("Nome:");
        JTextField nome = new JTextField(usuario.getNome());
        JLabel labelEmail = new JLabel("Email:");
        JTextField email = new JTextField(usuario.getEmail());
        JButton voltar = new JButton("voltar");

        voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                });
            }
        });


        panel.add(labelNome);
        panel.add(nome);
        panel.add(labelEmail);
        panel.add(email);
        novaJanela.add(panel);

        novaJanela.setVisible(true);

        //cardLayout.show(panel, "listaAmigos");

    }

    private void abrirChat(Integer IdusuarioLogado,Usuario amigo){
        JFrame novaJanela = new JFrame("Chat");
        novaJanela.setSize(400,300);
        JPanel panel = new JPanel(new GridBagLayout());;

        ChatController chatController = new ChatController();

        List<Chat> listChat = chatController.getChatByidAmigoAndUsuario(IdusuarioLogado, amigo.getUsuario_id());
        Chat chat = new Chat();
        if(listChat != null && !listChat.isEmpty()){
            chat = listChat.get(0);
        }else{
            chatController.inserir(IdusuarioLogado,amigo.getUsuario_id());
            List<Chat> listChatCadastrado = chatController.getChatByidAmigoAndUsuario(IdusuarioLogado, amigo.getUsuario_id());
            if(listChatCadastrado != null && !listChatCadastrado.isEmpty()){
                chat = listChatCadastrado.get(0);
                System.out.println(chat);
            }
        }


        novaJanela.setLayout(new BorderLayout());
        MensagemController mensagemController = new MensagemController();
        List<Mensagem> listaMensagem = mensagemController.getAll(chat.getChat_id());
        System.out.println(listaMensagem);

        panel = new JPanel(new GridBagLayout());
        panel.setAutoscrolls(true);
        panel.setSize(400,300);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        for (Mensagem mensagem : listaMensagem) {
            constraints.gridy++;
            constraints.ipady= 20;
            constraints.ipadx=200;
            JTextField textField = new JTextField(mensagem.getTexto());
            textField.setHorizontalAlignment(mensagem.getUsuario().getUsuario_id() == amigo.getUsuario_id() ? JTextField.LEFT : JTextField.RIGHT);
            textField.setEditable(false);
            textField.setSize(300,200);
            panel.add(textField, constraints);
            constraints.gridy++;
        }

        JTextField mensagem = new JTextField();
        JButton buttonEnviaMensagem = new JButton("enviar");

        Integer chatiD = chat.getChat_id();
        buttonEnviaMensagem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    mensagemController.inserir(IdusuarioLogado,mensagem.getText(), chatiD);
                }catch(Exception e2){
                    e2.printStackTrace();
                }

            }
        });
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        novaJanela.add(scrollPane);

        panel.add(mensagem, constraints);
        constraints.gridy++;
        panel.add(buttonEnviaMensagem, constraints);
        //novaJanela.add(panel);

        novaJanela.setVisible(true);
    }


    private JPanel pesquisaPanelCadastroUsuario() {


        JPanel panel = new JPanel(new GridLayout(3, 2));
        JLabel labelId = new JLabel("Id:");
        JTextField id = new JTextField();
        JLabel labelNome = new JLabel("Nome:");
        JTextField nome = new JTextField();
        JButton consultar = new JButton("consultar");

        consultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nome.setText("");
                UsuarioController usuarioController = new UsuarioController();
                List<Usuario> listaUsuario = usuarioController.getById(Integer.parseInt(id.getText()));
                nome.setText(listaUsuario.get(0).getNome());
            }
        });


        panel.add(labelId);
        panel.add(id);
        panel.add(new JLabel());
        panel.add(consultar);
        panel.add(labelNome);
        panel.add(nome);





        return panel;

    }



    private class TrocarPainelListener implements ActionListener {
        private String panelName;

        public TrocarPainelListener(String panelName,JPanel panel) {
            this.panelName = panelName;


        }

        @Override
        public void actionPerformed(ActionEvent e) {
            cardLayout.show(cardPanel, panelName);
            if(panelName.equals("ListaUsuarios")){
                System.out.println("teste");
                createPanelListaUsuarios();
            }
            if(panelName.equals("ListaAmigos")){
                createPanelListaAmigos();
            }
        }
    }
}
