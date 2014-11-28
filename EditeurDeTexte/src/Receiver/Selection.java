package Receiver;

/**
 * Created by Alex on 26/10/2014.
 */
public class Selection {

	private int debut;
	private int fin;

	public Selection() {
		this.debut = 0;
		this.fin = 0;
	}

	public int getDebut() {
		return debut;

	}

	public int getFin() {
		return fin;

	}

	public void setDebut( int debut) {
		if (debut < 0)
			this.debut = 0;
		else
			this.debut = debut;
	}

	public void setFin(int fin) {
		if(fin > 0)
			this.fin = fin;
		else
			this.fin = 0;
	}
}
