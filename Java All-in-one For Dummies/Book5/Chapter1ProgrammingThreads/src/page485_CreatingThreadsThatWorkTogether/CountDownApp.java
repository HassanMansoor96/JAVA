/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page485_CreatingThreadsThatWorkTogether;

/**
 *
 * @author Brent
 */
import java.util.ArrayList;
// version 2.0 of the Countdown application

public class CountDownApp {

    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock(20); //→8
        ArrayList<Runnable> events
                = new ArrayList<Runnable>(); //→10
        events.add(new LaunchEvent(16, //→12
                "Flood the pad!", clock));
        events.add(new LaunchEvent(6,
                "Start engines!", clock));
        events.add(new LaunchEvent(0,
                "Liftoff!", clock));
        clock.start(); //→19
        for (Runnable e : events) //→21
        {
            new Thread(e).start();
        }
    }
}

/*interface TimeMonitor //→26
{

    int getTime();
}

class CountDownClock extends Thread
        implements TimeMonitor //→31
{

    private int t; //→33

    public CountDownClock(int start) //→35
    {
        this.t = start;
    }

    public void run() {
        for (; t >= 0; t--) //→42
        {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public int getTime() //→54
    {
        return t;
    }
}

class LaunchEvent implements Runnable //→60
{

    private int start;
    private String message;
    TimeMonitor tm; //→64

    public LaunchEvent(int start, String message,
            TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;
        while (!eventDone) {
            try {
                Thread.sleep(10); //→81
            } catch (InterruptedException e) {
            }
            if (tm.getTime() <= start) //→85
            {
                System.out.println(this.message);
                eventDone = true;
            }
        }
    }
}*/

/*→8 As you see in line 35, the constructor for the CountDownClock class now
accepts a parameter to specify the starting time for the countdown. As a
result, this line specifies 20 as the starting time for the CountDownClock
object.
→10 An ArrayList of LaunchEvent objects is used to store each launch
event.
→12 The lines that create the LaunchEvent objects pass the Count Down
Clock object as a parameter to the LaunchEvent constructor. That way
the LaunchEvent objects can call the clock’s abort method if necessary.
→19 The clock is started!
→21 An enhanced for loop starts threads to run the LaunchEvent objects.
→26 The TimeMonitor interface defines just one method, named getTime.
This method returns an integer that represents the number of seconds
left on the countdown timer.
→31 The CountDownClock class implements the TimeMonitor interface.
→33 A private field named t is used to store the current value of the countdown
clock. That way, the current clock value can be accessed by the
constructor, the run method, and the getTime method.
→35 The constructor for the CountDownClock class accepts the starting time
for the countdown as a parameter. Thus, this countdown clock doesn’t
have to start at 20 seconds. The value passed via this parameter is saved
in the t field.
→42 The for loop in the run method tests and decrements the t variable. But
because this variable is already initialized, it doesn’t have an initialization
expression.
→54 The getTime() method simply returns the value of the t variable.
→60 This line is the start of the LaunchEvent class.
→64 A private field of type TimeMonitor is used to access the countdown
clock. A reference to this object is passed to the LaunchEvent class via
its constructor. The constructor simply stores that reference in this field.
→81 The while loop includes a call to Thread.sleep that sleeps for just
10 milliseconds. Thus, this loop checks the countdown clock every
10 milliseconds to see whether its time has arrived.
→85 This statement calls the getTime method of the countdown clock to see
whether it’s time to start the event. If so, a message is displayed, and
eventDone is set to true to terminate the thread.*/