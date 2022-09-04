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

//So far, so good. Now take a look at how you can use a formal type parameter as a
//return type. Here’s the declaration for the get method:

//public E get(int index)
//{
//// body of method omitted (you're welcome)
//}

//Here E is specified as the return type. That means that if E is Employee, this
//method returns Employee objects.

//One final technique you need to know before moving on: You can use the formal
//type parameter within your class to create objects of any other class that accepts
//formal type parameters. For example, the clone method of the ArrayList class
//is written like this:

//public Object clone()
//{
//try
//{
//ArrayList<E> v = (ArrayList<E>) super.clone();
//v.elementData = (E[])new Object[size];
//System.arraycopy(elementData, 0,
//v.elementData, 0, size);
//v.modCount = 0;
//return v;
//}
//catch (CloneNotSupportedException e)
//{
//// this shouldn't happen since we're Cloneable
//throw new InternalError();
//}
//}


//You don’t need to look much at the details in this method; just notice that the first
//statement in the try block declares an ArrayList of type <E>. In other words, the
//ArrayList class uses its own formal type parameter to create another array list
//object of the same type. If you think about it, that makes perfect sense. After all,
//that’s what the clone method does: It creates another array list just like this one.
//The key benefit of generics is that this typing happens at compile time. Thus, after
//you specify the value of a formal type parameter, the compiler knows how to do
//the type checking implied by the parameter. That’s how it knows not to let you
//add String objects to an Employee collection.











package Chapter5;

/**
 *
 * @author Hassan
 */
public class notes {
    
}
