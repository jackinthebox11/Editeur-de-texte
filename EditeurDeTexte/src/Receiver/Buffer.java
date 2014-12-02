package Receiver;

import Observer.Observer;
import Observer.Subject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Buffer {

    private StringBuffer buffer;

    public Buffer() {
        buffer = new StringBuffer();
    }

    public String getBuffer() {

        return buffer.toString();
    }

    public String getBufferContenu(int debut, int fin) {
        return buffer.substring(debut, fin);

    }

    public String getBufferContenu() {
       return buffer.toString();
    }

    public void setBufferContenu(String texte) {
        buffer.append(texte);

    }

    public void inserer(String texte, int position) {
        buffer.insert(position,texte);

    }

    public void effacer(int debut, int fin) {
        buffer.delete(debut, fin);

    }

    public void effacer() {
        if(buffer.length() > 0) {
            buffer.delete(0, buffer.length());
        }
    }

    public int size() {
        return buffer.length();
    }
}
