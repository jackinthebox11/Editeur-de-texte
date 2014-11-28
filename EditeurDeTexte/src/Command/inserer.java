package Command;

import Receiver.Moteur;

/**
 * Created by Alex on 28/10/2014.
 */
public class inserer implements Command {

    private Moteur moteur;

    public inserer(Moteur moteur) {
        this.moteur = moteur;

    }

    public void execute() {
        moteur.inserer();
    }
}
