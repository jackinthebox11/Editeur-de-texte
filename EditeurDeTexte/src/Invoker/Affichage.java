package Invoker;

import Command.Command;

import javax.swing.*;
import java.util.HashMap;

/**
 * Created by Alex on 28/10/2014.
 */
public class Affichage extends JTextArea {

    private IHMImpl ihm;

    private HashMap<String, Command> commands;

    public Affichage(IHMImpl ihm, HashMap commands) {
        this.ihm = ihm;
        this.commands = commands;

    }
}
