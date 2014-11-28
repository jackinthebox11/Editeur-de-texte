package Receiver;

public class Buffer {

    private StringBuffer buffer;

    public Buffer() {
        buffer = new StringBuffer();

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









}
