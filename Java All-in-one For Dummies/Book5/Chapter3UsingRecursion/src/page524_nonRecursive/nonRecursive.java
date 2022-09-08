/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package page524_nonRecursive;

/**
 *
 * @author Brent
 */
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

    private static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
