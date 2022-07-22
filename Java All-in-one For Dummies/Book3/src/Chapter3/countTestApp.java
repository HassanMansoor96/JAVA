/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

/**
 *
 * @author Hassan
 */

//this app is being incremented by 1 each timne until it reaches 10.

public class countTestApp {         //public class called countTestApp

    public static void main(String[] args) {           //main method
        printCount();                                  //printCount method is called
        for (int i = 0; i < 10; i++) {                 // i is being incremented as long as i is smaller than 10
            CountTest c1 = new CountTest();            // 
            printCount();                              //printCount method is called
        }
    }

    private static void printCount() {                  // printCount method
        System.out.println("There are now "             // system out print 
                + CountTest.getInstanceCount()          // getInstance method from CountTest class
                + " instances of the CountTest class.");
    }
}

class CountTest {                                       //CountTest class

    private static int instanceCount = 0;               // set instanceCount = 0

    public CountTest() {                                // CountTest method which increments instanceCount
        instanceCount++;
    }

    public static int getInstanceCount() {              // getInstanceCount method used to return instanceCount
        return instanceCount;
    }
}
