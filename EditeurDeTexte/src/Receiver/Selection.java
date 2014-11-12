package Receiver;

public class Selection {

	private int debut;
	private int fin;
	
	public int getDebut() {
		return debut;

	}
	
	public int getFin() {
		return fin;
		
	}
	
	public void setDebut( int debut) {
		this.debut = debut;
		
	}
	
	public void setFin(int fin) {
		if(fin > 0)
			this.fin = fin;
		else
			this.fin = 0;
	}
}
