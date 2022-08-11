
//Cloning refers to the process of making an exact duplicate of an object. Unfortunately,
//this process turns out to be a pretty difficult task in an object-oriented
//language such as Java.

package Chapter6;

//A simple example of a program that clones Employee objects.
//In a nutshell, this program overrides the clone method for the Employee class: It
//creates an Employee object, clones it, changes the name of the original Employee
//object, and prints out both objects to the console.

public class CloneTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");
        emp1.setSalary(40000.0);
        Employee emp2 = (Employee) emp1.clone();
        emp1.setLastName("Smith");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}

class Employee {

    private String lastName;
    private String firstName;
    private Double salary;

    public Employee(String lastName,
            String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Object clone() {
        Employee emp;
        emp = new Employee(
                this.lastName, this.firstName);
        emp.setSalary(this.salary);
        return emp;
    }

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}
