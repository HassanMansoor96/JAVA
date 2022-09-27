/*
Using Recursion

Recursion is a basic programming technique in which a method calls itself to
solve some problem. A method that uses this technique is called recursive.
Many programming problems can be solved only by recursion, and some
problems that can be solved by other techniques are better solved by recursion.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package page524_nonRecursive;


public class nonRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        long fact;
        fact = factorial(n);
        System.out.println("The factorial of " + n + " is "
                + fact + ".");
    }
    
    /*
    This method uses a for loop to count from 1 to the number, keeping track of the
    product as it goes.
    */
    private static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
