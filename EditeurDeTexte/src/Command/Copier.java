package Command;


import Receiver.Moteur;

/**
 * Created by Alex on 28/10/2014.
 */
public class Copier implements Command {

	private Moteur moteur;

	public Copier(Moteur moteur) {
		this.moteur = moteur;

	}
	@Override
	public void execute() {
		moteur.copier();
	}
}
