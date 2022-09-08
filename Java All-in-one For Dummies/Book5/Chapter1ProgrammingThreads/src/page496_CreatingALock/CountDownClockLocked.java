/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page496_CreatingALock;

/**
 *
 * @author Brent
 */
import java.util.concurrent.locks.ReentrantLock;

public class CountDownClockLocked extends Thread {

    ReentrantLock lock = new ReentrantLock();

    public void run() {
        lock.lock();
        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        lock.unlock();
    }
}
