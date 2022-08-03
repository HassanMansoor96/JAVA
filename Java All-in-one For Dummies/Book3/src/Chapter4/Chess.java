/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter4;

//Then you declare a class named Chess that extends the Game class but also provides
//an implementation for the play method:

public class Chess extends Game {

    public void play() {
        System.out.println("I give up. You win.");
    }
}

//Here, when you call the play method of a Chess object, the game announces that
//it gives up.
