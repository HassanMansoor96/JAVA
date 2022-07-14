/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chapter5;

import java.util.Scanner;

public class GuessingGame {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepPlaying = true; //→10
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) //→13
        {
            boolean validInput; //→15
            int number, guess;
            String answer;
// Pick a random number
            number = (int) (Math.random() * 10) + 1; //→20
// Get the guess
            System.out.println("\nI'm thinking of a number "
                    + "between 1 and 10.");
            System.out.print("What do you think it is? ");
            do //→26
            {
                guess = sc.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {
                    System.out.print("I said, between 1 and 10. "
                            + "Try again: ");
                    validInput = false;
                }
            } while (!validInput); //→36
// Check the guess
            if (guess == number) //→39
            {
                System.out.println("You're right!");
            } else {
                System.out.println("You're wrong! "
                        + "The number was " + number);
            }
// Play again?
            do //→46
            {
                System.out.print("\nPlay again? (Y or N)");
                answer = sc.next();
                validInput = true;
                if (answer.equalsIgnoreCase("Y")); else if (answer.equalsIgnoreCase("N")) {
                    keepPlaying = false;
                } else {
                    validInput = false;
                }
            } while (!validInput); //→57
        } //→58
        System.out.println("\nThank you for playing!"); //→59
    }
}
