// This application displays a hello message on
// the console by creating an instance of the
// Greeter class and then calling the Greeter
// object's sayHello method.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Hassan
 */
public class HelloApp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Greeter myGreeterObject = new Greeter();
        myGreeterObject.sayHello();
        
         Greeter2 myGreeterObject2 = new Greeter2();
        myGreeterObject2.sayHello();
    }

}
