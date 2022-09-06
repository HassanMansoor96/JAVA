/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page485_CreatingThreadsThatWorkTogether;


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
