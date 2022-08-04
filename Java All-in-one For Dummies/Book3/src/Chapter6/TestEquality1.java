/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6;

//The equals Method

//Testing objects to see whether they are equal is one of the basic tasks of any
//object-oriented programming language.

public class TestEquality1 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");
        Employee emp2 = new Employee(
                "Martinez", "Anthony");
        if (emp1 == emp2) {
            System.out.println(
                    "These employees are the same.");
        } else {
            System.out.println(
                    "These are different employees.");
        }
    }
}

class Employee {

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}


//Here the main method creates two Employee objects with identical data and then
//compares them. Alas, the comparison returns false. Even though the Employee
//objects have identical data, they’re not considered to be equal because the equality
//operator (==) compares the object references, not the data contained by the
//objects. Thus the comparison returns true only if both emp1 and emp2 refer to the
//same instance of the Employee class.


//Using equals

//To test objects using the equals method rather than the equality operator, you
//simply rewrite the comparison expression like this:

//if (emp1.equals(emp2))
//System.out.println("These employees are the same.");
//else
//System.out.println
//("These are different employees.");

//Here, the equals method of emp1 is used to compare emp1 with emp2.
//By default, the equals operator returns the same result as the equality operator.
//So just replacing == with the equals method doesn’t have any effect