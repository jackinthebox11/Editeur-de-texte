package Invoker;

import javax.swing.*;

/**
 * Created by Alex on 30/10/2014.
 */
public interface IHM {

    public void construireFenetre();

    public JPanel construirePanel();

    public void construireBouton();

    public String getTextUser();

}
