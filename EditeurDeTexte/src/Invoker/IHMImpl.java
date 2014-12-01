package Invoker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alex on 28/10/2014.
 */
public class IHMImpl implements IHM {

    private JFrame fenetre;

    private JPanel toolBoxPanel;
    private JPanel txtAreaPanel;
    private JPanel userTxtPanel;

    private JToolBar boutonToolBar;

    private JButton Copier;
    private JButton Couper;
    private JButton Coller;

    private JTextField userText;
    private JTextArea affichage;


    public IHMImpl() {

        construireFenetre();
        construirePanel();

    }

    /**
     *
     */
    @Override
    public void construireFenetre() {

        fenetre = new JFrame();

        fenetre.setTitle("Mini Editeur");
        fenetre.setSize(400, 100);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLayout(new BorderLayout());
        fenetre.setVisible(true);
        fenetre.add(toolBoxPanel, BorderLayout.NORTH);
        fenetre.add(txtAreaPanel, BorderLayout.CENTER);
        fenetre.add(userTxtPanel, BorderLayout.SOUTH);



    }

    @Override
    public void construirePanel() {

        toolBoxPanel = new JPanel();
        toolBoxPanel.add(boutonToolBar);

        txtAreaPanel = new JPanel();
        txtAreaPanel.add(affichage);

        userTxtPanel = new JPanel();
        userTxtPanel.add(userText);


    }

    @Override
    public String getTextUser() {
        return userText.getText();

    }
}
