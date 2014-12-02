package Command;

import Invoker.IHM;
import Receiver.Moteur;

/**
 * Created by Alex on 28/10/2014.
 */
public class Saisir {
    private Moteur moteur;
    private IHM ihm;
    private String texte;

    public Saisir(Moteur moteur, IHM ihm) {
        this.moteur = moteur;
        this.ihm = ihm;
        this.texte = "";

    }

    public void execute() {
        moteur.saisir(texte);
    }

}
