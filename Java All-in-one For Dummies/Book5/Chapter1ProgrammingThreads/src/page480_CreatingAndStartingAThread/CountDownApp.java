/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page480_CreatingAndStartingAThread;

import page478_ExtendingTheThreadClass.CountDownClock;

/**
 *
 * @author Brent
 */
public class CountDownApp {

    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        clock.start();
    }
}
