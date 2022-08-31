//Using for Loops with Arrays

//One of the most common ways to process an array is with a for loop. In fact, for
//loops were invented specifically to deal with arrays. Here’s a for loop that creates
//an array of 100 random numbers, with values ranging from 1 to 100:

//int[] numbers = new int[100];
//for (int i = 0; i < 100; i++)
//numbers[i] = (int)(Math.random() * 100) + 1;

//And here’s a loop that fills an array of player names with strings entered by the user:

//String[] players = new String[count];
//for (int i = 0; i < count; i++)
//{
//System.out.print("Enter player name: ");
//players[i] = sc.nextLine(); // sc is a Scanner
//}

//For this example, assume that count is an int variable that holds the number of players to enter.

//You can also use a for loop to print the contents of an array. For example:

//for (int i = 0; i < count; i++)
//System.out.println(players[i]);

//Here the elements of a String array named players are printed to the console.

//The previous example assumes that the length of the array was stored in a variable
//before the loop was executed. If you don’t have the array length handy, you can get it from the array’s length property:

//for (int i = 0; i < players.length; i++)
//System.out.println(players[i]);



package Chapter2;

/**
 *
 * @author Hassan
 */
public class ForLoopsWithArrays {
    
}
