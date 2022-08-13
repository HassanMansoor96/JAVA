//The toString Method
//The toString method returns a String representation of an object. By default, the
//toString method returns the name of the object’s class plus its hash code.
package Chapter6;

public class TestToString {

    public static void main(String[] args) {
        Employee emp = new Employee("Martinez",
                "Anthony");
        System.out.println(emp.toString());
    }
}

class Employee {

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + "]";
    }
}

//This code creates a new Employee object; then the result of its toString method
//is printed to the console.
