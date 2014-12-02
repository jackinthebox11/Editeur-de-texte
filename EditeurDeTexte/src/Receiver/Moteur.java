package Receiver;

/**
 * Created by Alex on 26/10/2014.
 */
public interface Moteur {

    public void inserer(String input, Buffer buffer);

    public void copier();

    public void coller();

    public void couper();

    public Buffer getBuffer();

}
