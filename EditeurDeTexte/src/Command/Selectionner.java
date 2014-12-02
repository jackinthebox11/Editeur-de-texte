package Command;

import Invoker.IHM;
import Receiver.Moteur;

/**
 * Created by Alex on 28/10/2014.
 */
public class Selectionner implements Command {

    private Moteur moteur;
    private IHM ihm;
    private int debut, fin;

    public Selectionner(Moteur moteur, IHM ihm) {
        this.moteur = moteur;
        this.ihm = ihm;
    }

    public void execute() {
        moteur.selectionner(debut, fin);
    }
}
