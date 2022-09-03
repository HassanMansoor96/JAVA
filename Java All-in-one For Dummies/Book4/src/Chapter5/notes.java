//Creating Generic Collection Classes

//Creating a Generic Class

//Generics let you create classes that can be used for any type specified by the programmer
//at compile time. To accomplish that, the Java designers introduced a
//new feature to the language, called formal type parameters. To create a class that
//uses a formal type parameter, you list the type parameter after the class name
//in angle brackets. The type parameter has a name — Oracle recommends you
//use single uppercase letters for type parameter names — that you can then use
//throughout the class anywhere you’d otherwise use a type.

//For example, here’s a simplified version of the class declaration for the Array
//List class:

//public class ArrayList<E>
//I left out the extends and implements clauses to focus on the formal type parameter:
//<E>. The E parameter specifies the type of the elements that are stored in the
//list. Oracle recommends the type parameter name E (for Element) for any parameter
//that specifies element types in a collection.

//So consider this statement:

//ArrayList<Employee> empList;

//Here the E parameter is Employee, which simply means that the element type for
//this instance of the ArrayList class is Employee.

//Now take a look at the declaration for the add method for the ArrayList class:

//public boolean add(E o)
//{
//// body of method omitted (thank you)
//}

//Where you normally expect to see a parameter type, you see the letter E. Thus, this
//method declaration specifies that the type for the o parameter is the type specified
//for the formal type parameter E. If E is Employee, that means the add method only
//accepts Employee objects.











package Chapter5;

/**
 *
 * @author Hassan
 */
public class notes {
    
}
