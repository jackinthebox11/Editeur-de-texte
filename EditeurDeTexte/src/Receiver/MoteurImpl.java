package Receiver;

import Observer.Subject;

/**
 * Created by Alex on 26/10/2014.
 */
public class MoteurImpl implements Moteur {

    private Buffer buffer;

    private PressePapier pressePapier;

    private Selection selection;



    public MoteurImpl() {
        buffer = new Buffer();
        pressePapier = new PressePapier();
        selection = new Selection();


    }

    @Override
    public void inserer(String input) {
        buffer.addStringAtPosition(input, selection.getDebut());
        buffer.notifyObservers();
    }

    @Override
    public void copier() {
        pressePapier.setPressePapier(
                buffer.getBufferSelection(
                        selection.getDebut(), selection.getFin()
                )
        );
    }

    @Override
    public void coller() {
        buffer.addStringAtPosition(pressePapier.getPressePapier(), selection.getDebut());
        buffer.notifyObservers();
    }

    @Override
    public void couper() {
        pressePapier.setPressePapier(
                buffer.getBufferSelection(
                        selection.getDebut(), selection.getFin()
                )
        );
        buffer.deleteBufferSelection(selection.getDebut(), selection.getFin());
        buffer.notifyObservers();
    }
}
