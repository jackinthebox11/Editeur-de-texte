package Invoker;

import Command.*;
import Observer.Subject;
import Receiver.Buffer;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.util.HashMap;

/**
 * Created by Alex on 28/10/2014.
 */
public class Affichage extends JTextArea {

    private IHMImpl ihm;

    private HashMap<String, Command> commands;

    private int _debutSelection;
    private int _finSelection;
    private char _dernierChar;

    public Affichage(HashMap<String, Command> c) {


        final Command selectionner = c.get("selectionner");
        final Command inserer = c.get("inserer");
        final Command supprimer = c.get("supprimer");


        addCaretListener(new CaretListener() {

            @Override
            public void caretUpdate(CaretEvent e) {
                int i = Math.min(e.getDot(), e.getMark());
                int j = Math.max(e.getDot(), e.getMark());
                int l= j - i;

                if (i != _debutSelection || j != _finSelection) {
                    setSelection(i, j);
                    selectionner.execute();
                }
            }
        });
    }

    public void setSelection(int debutSelection, int finSelection) {
        _debutSelection = debutSelection;
        _finSelection = finSelection;
    }

    public void maj(Subject s) {
        if (s instanceof Buffer) {
            this.setText(((Buffer) s).getBuffer());
        }
    }

}
