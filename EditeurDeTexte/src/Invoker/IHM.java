package Invoker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alex on 28/10/2014.
 */
public class IHM {
    private JPanel panel1;
    private JButton Copier;
    private JButton Couper;
    private JButton Coller;
    private JTextField UserText;

    public IHM() {


        Copier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        Couper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
