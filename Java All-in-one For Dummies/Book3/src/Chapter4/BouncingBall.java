/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter4;

//In Java, inheritance refers to a feature of object-oriented programming that lets
//you create classes that are derived from other classes. A class that’s based on
//another class is said to inherit the other class. The class that is inherited is called
//the parent class, the base class, or the superclass. The class that does the inheriting is
//called the child class, the derived class, or the subclass.

//The basic procedure for creating a subclass is simple: You just use the extends
//keyword on the declaration for the subclass. The basic format of a class declaration
//for a class that inherits a base class is this:

//Suppose that you have a class named Ball that defines a basic ball, and you want
//to create a subclass named BouncingBall that adds the ability to bounce:


public class BouncingBall extends Ball {
// methods and fields that add the ability to bounce
// to a basic Ball object:

    public void bounce() {
// the bounce method
    }
}

//Here I’m creating a class named BouncingBall that extends the Ball class.
//(Extends is Java’s word for inherits.)