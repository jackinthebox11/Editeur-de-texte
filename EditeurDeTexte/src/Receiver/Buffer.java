package Receiver;

public class Buffer {

	private String texte;
	private Selection selection;
	private PressePapier pressePapier;
	
	public Buffer() {
		texte = "";
		selection = new Selection();
		pressePapier = new PressePapier();
	}

}
