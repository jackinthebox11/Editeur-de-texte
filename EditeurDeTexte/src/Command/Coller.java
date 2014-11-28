package Command;

import Receiver.Moteur;

/**
 * Created by Alex on 28/10/2014.
 */
public class Coller implements Command {

    private Moteur moteur;

    public Coller(Moteur moteur) {
        this.moteur = moteur;

    }

    @Override
    public void execute() {
        moteur.coller();
    }
}
