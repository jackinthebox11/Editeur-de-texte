package Receiver;

import Observer.Observer;
import Observer.Subject;

import java.util.Observable;

/**
 * Created by Alex on 26/10/2014.
 */
public class MoteurImpl implements Moteur, Subject {

    private Buffer buffer;

    private PressePapier pressePapier;

    private Selection selection;



    public MoteurImpl() {
        buffer = new Buffer();
        pressePapier = new PressePapier();
        selection = new Selection();

    }

    @Override
    public void saisir(String input) {
        if(selection.getLongueur() > 0) {
            buffer.effacer(selection.getDebut(), selection.getFin());
            selection.setFin(selection.getDebut());
        }
        buffer.inserer(input, selection.getDebut());
        selection.setDebut(selection.getDebut() + 1);
        selection.setFin(selection.getDebut());
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public void copier() {
        if(this.selection.getLongueur() > 0) {
            String contenu = this.buffer.getBufferContenu(selection.getDebut(), selection.getFin());
            pressePapier.setPressePapier(contenu);
        }
        this.selection.setFin(this.selection.getDebut());
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public void coller() {
        String contenu = pressePapier.getPressePapier();
        int taille = contenu.length();
        buffer.effacer(selection.getDebut(), selection.getFin());
        selection.setFin(this.selection.getDebut());
        buffer.inserer(contenu, selection.getDebut());
        selection.setDebut(selection.getDebut()+taille);
        selection.setFin(selection.getDebut());
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public void couper() {
        if(selection.getLongueur() > 0) {
            String contenu = this.buffer.getBufferContenu(selection.getDebut(), selection.getFin());
            pressePapier.setPressePapier(contenu);
            buffer.effacer(selection.getDebut(), selection.getFin());
            selection.setFin(selection.getDebut());
        }
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public void selectionner(int debut, int fin) {
        if(debut > buffer.size()) {
            selection.setDebut(buffer.size());
        } else {
            selection.setDebut(debut);
        }
        if(fin > buffer.size()) {
            selection.setFin(buffer.size());
        } else {
            selection.setFin(fin);
        }
    }


    /**
     * Les getters et les setters
     */
    public Buffer getBuffer() {
        return buffer;
    }
    public PressePapier getPressePapier() {
        return pressePapier;
    }
    public Selection getSelection() {
        return selection;
    }
    public void setBuffer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void setPressePapier(PressePapier pressePapier) {
        this.pressePapier = pressePapier;
    }
    public void setSelection(Selection selection) {
        this.selection = selection;
    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public void setChanged() {

    }

    @Override
    public void unregisterObserver(Observer o) {

    }

    @Override
    public void registerObserver(Observer o) {

    }
}
