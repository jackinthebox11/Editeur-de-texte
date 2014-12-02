package Invoker;

import Command.Command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 * Created by Alex on 30/10/2014.
 */
class BtnActionListener implements ActionListener {

   private HashMap<String, Command> commands;

    private String nomCommande;

    public BtnActionListener(String nomCommande, HashMap<String, Command> commands) {
        this.nomCommande = nomCommande;
        this.commands = commands;
    }

    public void actionPerformed(ActionEvent e) {
        commands.get(this.nomCommande).execute();
    }
}