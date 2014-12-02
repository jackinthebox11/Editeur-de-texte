package Receiver;

/**
 * Created by Alex on 26/10/2014.
 */
public interface Moteur {

    public void saisir(String input);

    public void copier();

    public void coller();

    public void couper();

    public void selectionner(int debut, int fin);

    public Buffer getBuffer();

    public void setBuffer(Buffer buffer);

    public PressePapier getPressePapier();

    public void setPressePapier(PressePapier pressePapier);

    public Selection getSelection();

    public void setSelection(Selection selection);

}
