/*
This program creates a GenStack object that can hold String objects. It then
pushes four strings onto the stack and prints the number of items in the stack.
Next, it uses the peek method to print the top item and again prints the number of
items in the stack, just to make sure the peek method doesn’t accidentally remove
the item. Next, it uses a while loop to pop each item off the stack and print it.
Then, once again, it prints the number of items, and it peeks at the top item.
*/


package Chapter5;

/**
 *
 * @author Hassan
 */
public class GenStackTest {

    public static void main(String[] args) {
        GenStack<String> gs = new GenStack<String>();
        System.out.println(
                "Pushing four items onto the stack.");
        gs.push("One");
        gs.push("Two");
        gs.push("Three");
        gs.push("Four");
        System.out.println("There are "
                + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: "
                + gs.peek() + "\n");
        System.out.println("There are still "
                + gs.size() + " items in the stack.\n");
        System.out.println("Popping everything:");
        while (gs.hasItems()) {
            System.out.println(gs.pop());
        }
        System.out.println("There are now "
                + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: "
                + gs.peek() + "\n");
    }
}

/*  Output
Pushing four items onto the stack.
There are 4 items in the stack.
The top item is: Four
There are still 4 items in the stack.
Popping everything:
Four
Three
Two
One
There are now 0 items in the stack.
The top item is: null
*/
