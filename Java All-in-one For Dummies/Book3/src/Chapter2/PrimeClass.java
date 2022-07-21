/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

import java.util.Scanner;

/**
 *
 * @author Hassan
 */
class PrimeClass {

    private Scanner sc = new Scanner(System.in);
    public int x = getX();

    private int getX() {
        System.out.print("Enter the starting value "
                + "for x: ");
        return sc.nextInt();
    }
}
