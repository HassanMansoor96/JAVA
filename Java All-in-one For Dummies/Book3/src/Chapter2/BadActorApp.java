/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Hassan
 */

public class BadActorApp {

    public static void main(String[] args) {
        //Actor a = new Actor(); // error: won't compile
    }
}

class Actor {

    private String lastName;
    private String firstName;
    private boolean goodActor;

    public Actor(String last, String first) {
        lastName = last;
        firstName = first;
    }

    public Actor(String last, String first, boolean good) {
        lastName = last;
        firstName = first;
        goodActor = good;
    }
}
