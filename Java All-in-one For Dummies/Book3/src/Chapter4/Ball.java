/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter4;

//Protecting

//You’re already familiar with the public and private keywords, which are used
//to indicate whether class members are visible outside the class or not. When you
//inherit a class, all the public members of the superclass are available to the subclass,
//but the private members aren’t. They do become part of the derived class,
//but you can’t access them directly in the derived class.
//Java provides a third visibility option that’s useful when you create subclasses:
//protected. A member with protected visibility is available to subclasses but not
//to other classes.

public class Ball {

    private double weight;

    protected double getWeight() {
        return this.weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }
}

//Here, the getWeight and setWeight methods are declared with protected access,
//which means that they’re visible in the subclass BaseBall. These methods aren’t
//visible to classes that don’t extend Ball, however.
