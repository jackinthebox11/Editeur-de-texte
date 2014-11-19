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

    public void copier() {
        if (selection.getFin() > 0)
            pressePapier.setTexte(getSelection());

    }

    public void couper() {
        if (selection.getFin() > 0)
            pressePapier.setTexte(getSelection());

    }



    /*
     Renvoie le texte selectionné
     */
    public String getSelection() {
        int i = selection.getDebut(), l = selection.getFin();
        if (selection.getFin() > 0) {
            return texte.substring(i, i + l);
        } else {
            return "";
        }
    }
}
