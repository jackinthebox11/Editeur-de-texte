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

    private  JPanel mainPanel;
    private JPanel toolBoxPanel;
    private JPanel txtAreaPanel;
    private JPanel userTxtPanel;

    private JToolBar boutonToolBar;

    private JButton Copier;
    private JButton Couper;
    private JButton Coller;
    private JButton Inserer;

    private JTextField userText;
    private JTextArea affichage;


    public IHMImpl() {

        construireFenetre();
    }

    /**
     *
     */
    @Override
    public void construireFenetre() {

        fenetre = new JFrame();

        fenetre.setTitle("Editeur de texte");
        fenetre.setSize(600, 400);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setContentPane(construirePanel());
        fenetre.setVisible(true);

    }

    @Override
    public JPanel construirePanel() {

        mainPanel = new JPanel();

        toolBoxPanel = new JPanel();
        boutonToolBar = new JToolBar();
        construireBouton();
        toolBoxPanel.setLayout(new BorderLayout());
        toolBoxPanel.add(boutonToolBar, BorderLayout.CENTER);

        txtAreaPanel = new JPanel();
        affichage = new JTextArea();
        txtAreaPanel.add(affichage);
        txtAreaPanel.setBackground(Color.WHITE);

        userTxtPanel = new JPanel();
        userText = new JTextField();
        userTxtPanel.setLayout(new BorderLayout());
        userTxtPanel.add(userText, BorderLayout.CENTER);
        userText.setBackground(Color.GRAY);
        Inserer = new JButton("Inserer");
        userTxtPanel.add(Inserer, BorderLayout.EAST);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(toolBoxPanel, BorderLayout.NORTH);
        mainPanel.add(txtAreaPanel, BorderLayout.CENTER);
        mainPanel.add(userTxtPanel, BorderLayout.SOUTH);

        return mainPanel;


    }

    public void construireBouton() {
        Copier = new JButton("Copier");
        Couper = new JButton("Couper");
        Coller = new JButton("Coller");

        boutonToolBar.add(Copier);
        boutonToolBar.add(Couper);
        boutonToolBar.add(Coller);


    }

    @Override
    public String getTextUser() {
        return userText.getText();

    }
}
