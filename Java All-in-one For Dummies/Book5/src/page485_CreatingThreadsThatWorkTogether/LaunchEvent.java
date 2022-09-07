/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page485_CreatingThreadsThatWorkTogether;


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
}
