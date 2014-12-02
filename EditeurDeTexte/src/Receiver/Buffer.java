package Receiver;

import Observer.Observer;
import Observer.Subject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Buffer implements Subject {

    private StringBuffer buffer;
    private Collection<Observer> observers;

    public Buffer() {
        buffer = new StringBuffer();
        observers = new ArrayList<Observer>();
    }

    public String getBuffer() {

        return buffer.toString();
    }

    public String getBufferSelection(int debut, int fin) {
        return buffer.substring(debut, fin);

    }

    public void addString(String texte) {
        buffer.append(texte);

    }

    public void addStringAtPosition(String texte, int position) {
        buffer.insert(position,texte);

    }

    public void deleteBufferSelection(int debut, int fin) {
        if (debut < 0)
            debut = 0;
        if (fin < 0)
            fin = 0;
        buffer.delete(debut, fin);

    }

    @Override
    public void notifyObservers() {
        for (Iterator<Observer> it = observers.iterator(); it.hasNext();) {
            Observer o = it.next();
            o.maj(this);
        }
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.remove(o);
    }
}
