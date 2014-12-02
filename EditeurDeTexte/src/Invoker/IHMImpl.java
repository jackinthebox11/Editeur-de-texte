package Invoker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import Command.Command;

/**
 * Created by Alex on 28/10/2014.
 */
public class IHMImpl implements IHM {

    private JFrame fenetre;

    private HashMap<String, Command> commands;

    private  JPanel mainPanel;
    private JPanel toolBoxPanel;
    private JPanel txtAreaPanel;
    private JPanel userTxtPanel;

    private JToolBar boutonToolBar;

    private JButton btnCopier;
    private JButton btnCouper;
    private JButton btnColler;
    private JButton btnInserer;

    private JTextField userText;
    private JTextArea affichage;


    public IHMImpl() {
        commands = new HashMap<String, Command>();
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
        btnInserer = new JButton("Inserer");
        userTxtPanel.add(btnInserer, BorderLayout.EAST);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(toolBoxPanel, BorderLayout.NORTH);
        mainPanel.add(txtAreaPanel, BorderLayout.CENTER);
        mainPanel.add(userTxtPanel, BorderLayout.SOUTH);

        setCommands();

        userTxtPanel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == Event.ENTER) {
                    commands.get("Inserer").execute();
                    userText.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        return mainPanel;


    }

    public void construireBouton() {
        btnCopier = new JButton("Copier");
        btnCouper = new JButton("Couper");
        btnColler = new JButton("Coller");

        boutonToolBar.add(btnCopier);
        boutonToolBar.add(btnCouper);
        boutonToolBar.add(btnColler);


    }

    public void setCommands() {
        this.btnCopier.addActionListener(new BtnActionListener("Copier", this.commands));
        this.btnCouper.addActionListener(new BtnActionListener("Couper", this.commands));
        this.btnColler.addActionListener(new BtnActionListener("Coller", this.commands));
        this.btnInserer.addActionListener(new BtnActionListener("Inserer", this.commands));



    }

    @Override
    public String getTextUser() {
        return userText.getText();
    }

    @Override
    public void setTextUser(String txt) {
        userText.setText(txt);
    }


}
