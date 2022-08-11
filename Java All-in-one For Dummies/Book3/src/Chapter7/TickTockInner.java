
//Book 3, Chapter 5 introduces an application that uses the Timer class in the Swing
//package (javax.swing.Timer) that displays the lines Tick... and Tock... on the
//console at one-second intervals. It uses a class named Ticker that implements
//the ActionListener interface to handle the Timer object’s clock events.

package Chapter7;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Hassan
 */
public class TickTockInner {

    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        TickTockInner t = new TickTockInner();
        t.go();
    }

    private void go() {
// create a timer that calls the Ticker class
// at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
// display a message box to prevent the
// program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }

    class Ticker implements ActionListener {

        private boolean tick = true;

        public void actionPerformed(ActionEvent event) {
            if (tick) {
                System.out.println(tickMessage);
            } else {
                System.out.println(tockMessage);
            }
            tick = !tick;
        }
    }
}
