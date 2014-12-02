package Command;

import Invoker.*;
import Receiver.*;

/**
 * Created by Alex on 28/10/2014.
 */
public class inserer implements Command {

    private Moteur moteur;

    private IHM ihm;

    public inserer(Moteur moteur, IHM ihm) {
        this.moteur = moteur;
        this.ihm = ihm;

    }

    public void execute() {

        moteur.inserer(ihm.getTextUser(), moteur.getBuffer());

    }
}
