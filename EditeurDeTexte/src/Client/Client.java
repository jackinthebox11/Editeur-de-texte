package Client;

import Invoker.IHM;
import Invoker.IHMImpl;
import Receiver.Moteur;
import Receiver.MoteurImpl;

/**
 * Created by Alex on 30/10/2014.
 */
public class Client {

    private IHM ihm;
    private Moteur moteur;


    public static void main(String[] args) {
        Client client = new Client();
        client.run();

    }

    private void run() {
        ihm = new IHMImpl();
        moteur = new MoteurImpl();
    }
}
