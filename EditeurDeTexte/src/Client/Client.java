package Client;

import Invoker.IHM;
import Invoker.IHMImpl;
import Receiver.Buffer;
import Receiver.Moteur;
import Receiver.MoteurImpl;
import Command.*;

import java.util.HashMap;

/**
 * Created by Alex on 30/10/2014.
 */
public class Client {

    private IHM ihm;
    private Moteur moteur;
    private HashMap<String, Command> commands;


    public static void main(String[] args) {
        Client client = new Client();
        client.run();

    }

    private void run() {

        ihm = new IHMImpl();
        moteur = new MoteurImpl();
        //observer = new ObserverImpl(moteur);

        commands = new HashMap<String, Command>();
        commands.put("Copier", new Copier(moteur));
        commands.put("Couper", new Couper(moteur));
        commands.put("Coller", new Coller(moteur));
        commands.put("Inserer", new Inserer(moteur, ihm));

    }
}
