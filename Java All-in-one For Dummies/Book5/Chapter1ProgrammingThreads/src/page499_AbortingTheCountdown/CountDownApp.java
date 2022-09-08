/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page499_AbortingTheCountdown;


import java.util.ArrayList;

public class CountDownApp //→3
{

    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock(20);
        ArrayList<Runnable> events
                = new ArrayList<Runnable>();
        events.add(new LaunchEvent(16,
                "Flood the pad!", clock));
        events.add(new LaunchEvent(6,
                "Start engines!", clock));
        events.add(new LaunchEvent(0,
                "Liftoff!", clock));
        clock.start();
        for (Runnable e : events) {
            new Thread(e).start();
        }
    }
}

interface TimeMonitor {

    int getTime();

    void abortCountDown(); //→26
}

class CountDownClock extends Thread
        implements TimeMonitor {

    private int t;

    public CountDownClock(int start) {
        this.t = start;
    }

    public void run() {
        boolean aborted = false; //→40
        for (; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                aborted = true; //→50
            }
            if (Thread.interrupted()) {
                aborted = true; //→53
            }
            if (aborted) //→54
            {
                System.out.println(
                        "Stopping the clock!");
                break;
            }
        }
    }

    public int getTime() {
        return t;
    }

    public synchronized void abortCountDown() //→67
    {
        Thread[] threads
                = new Thread[Thread.activeCount()]; //→69
        Thread.enumerate(threads); //→70
        for (Thread t : threads) //→71
        {
            t.interrupt();
        }
    }
}

class LaunchEvent implements Runnable {

    private int start;
    private String message;
    TimeMonitor tm;

    public LaunchEvent(int start, String message,
            TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;
        boolean aborted = false; //→92
        while (!eventDone) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                aborted = true; //→101
            }
            if (tm.getTime() <= start) {
                System.out.println(this.message);
                eventDone = true;
                System.out.println("ABORT!!!!"); //→107
                tm.abortCountDown(); //→108
            }
            if (Thread.interrupted()) {
                aborted = true; //→111
            }
            if (aborted) //→112
            {
                System.out.println(
                        "Aborting " + message);
                break;
            }
        }
    }
}

/*→3 The CountDownApp class itself hasn’t changed. That’s the beauty of
object-oriented programming. Although I changed the implementations
of the CountDownClock and LaunchEvent classes, I didn’t change the
public interfaces for these classes. As a result, no changes are needed in
the CountDownApp class.
→26 The LaunchEvent class needs a way to notify the CountDown Timer
class that the countdown should be aborted. To do that, I added an
abortCountDown method to the TimeMonitor interface.
→40 The run method of the CountDownClass uses a boolean variable
named aborted to indicate whether the thread has been interrupted.
This variable is set to true in line 50 if InterruptedException is
caught. It’s also set to true in line 53 if Thread.interrupted() returns
true.
→54 If the aborted field has been set to true, it means that the thread has
been interrupted, so the message Stopping the clock! is displayed,
and a break statement exits the loop. Thus the thread is terminated.
→67 The abortCountDown method is synchronized. That happens because
any of the LaunchEvent objects can call it, and there’s no guarantee that
they won’t all try to call it at the same time.
→69 The abortCountDown method starts by creating an array of Thread
objects that’s large enough to hold all the active threads. The number of
active threads is provided by the activeCount method of the Thread
class.
→70 The abortCountDown method calls the enumerate method of the
Thread class to copy all the active threads into this array. Note that this
method is static, so you don’t need a reference to any particular thread
to use it. (The activeCount method used in line 69 is static too.)
→71 An enhanced for loop is used to call the interrupt method on all the
active threads. That method shuts down everything.
→92 Like the CountDownClock class, the LaunchEvent class uses a boolean
variable to indicate whether the thread has been interrupted. This
variable is set if InterruptedException is caught in line 101 or if
Thread.interrupted() returns true in line 111; then it’s tested in line
112. If the aborted variable has been set to true, the thread prints a
message indicating that the launch event has been aborted, and a break
statement is used to exit the loop and (therefore) terminate the thread.
→101 When the launch event’s start time arrives, the LaunchEvent class
displays the message ABORT! and calls the abortCountDown method.
Thus the countdown is aborted the first time any launch event occurs.*/