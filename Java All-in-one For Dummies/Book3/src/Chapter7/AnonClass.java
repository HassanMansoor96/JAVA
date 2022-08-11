//Using Anonymous Inner Classes

//An anonymous class is a class that’s defined on the spot, right at the point where
//you want to instantiate it. Because you code the body of the class right where you
//need it, you don’t have to give it a name. (That’s why it’s called an anonymous class.)

//Creating an anonymous class

//The basic form for declaring and instantiating an anonymous class is this:
//new ClassOrInterface() { class-body }

//Here’s an example of a simple anonymous class:
package Chapter7;

public class AnonClass {

    public static void main(String[] args) {
        Ball b = new Ball() {
            public void hit() {
                System.out.println("You hit it!");
            }
        };
        b.hit();
    }

    interface Ball {

        void hit();
    }
}


//In this example, I create an interface named Ball that has a single method named
//hit. Then, back in the main method, I declare a variable of type Ball and use an
//anonymous class to create an object. The body of the anonymous class consists of
//an implementation of the hit method that simply displays the message You hit
//it! on the console. After the anonymous class is instantiated and assigned to the
//b variable, the next statement calls the hit method.

//When you run this program, the single line You hit it! is displayed on the console.
