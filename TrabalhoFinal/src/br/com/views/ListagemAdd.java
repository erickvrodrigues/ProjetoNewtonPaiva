package br.com.views;

import br.com.model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListagemAdd extends JPanel implements ListCellRenderer<Usuario>{
    private JButton add;
    private JLabel nome;
    public ListagemAdd() {
        setLayout(new BorderLayout());
        //add = new JButton();
        nome = new JLabel();

        JPanel botoesPanel = new JPanel();
        //botoesPanel.add(add);

        add(nome, BorderLayout.CENTER);
        //add(botoesPanel, BorderLayout.EAST);
    }
    public Component getListCellRendererComponent(
            JList<? extends Usuario> list, Usuario usuario, int index, boolean isSelected, boolean cellHasFocus) {

        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setBackground(isSelected ? list.getSelectionBackground() : list.getBackground());
        System.out.println(isSelected);
        nome.setText(usuario.getNome());
        if(isSelected){
            JOptionPane.showInternalConfirmDialog (null, "deseja adiconar "+usuario.getNome()+"A lista de amigos:");

        }

       /* add.setText("Adicionar "+usuario.getNome());
        //JOptionPane.showConfirmDialog (null, "Ação para " + isSelected);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });*/

        return this;
    }
}

