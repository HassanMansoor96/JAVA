//The Mother of All Classes: Object

//Object is the mother of all classes. In Java, every class ultimately inherits the Object
//class. This class provides a set of methods that is available to every Java object.

//Every object is an Object

//Any class that doesn’t have an extends clause implicitly inherits Object. Thus
//you never have to code a class like this:

//public class Product extends Object...

//If a subclass has an extends clause that specifies a superclass other than Object,
//the class still inherits Object. That’s because the inheritance hierarchy eventually
//gets to a superclass that doesn’t have an extends clause, and that superclass
//inherits Object and passes it down to all its subclasses.

//Suppose you have these classes:

//public class Manager extends SalariedEmployee...
//public class SalariedEmployee extends Employee...
//public class Employee extends Person...
//public class Person...

//Here the Manager class inherits the Object class indirectly because it inherits
//SalariedEmployee, which inherits Employee, which inherits Person, which
//inherits Object

//Object as a type

//If you don’t know or care about the type of an object referenced by a variable, you
//can specify its type as Object. The following example is perfectly legal:

//Object emp = new Employee();

//You can’t do anything useful with the emp variable, however, because the compiler
//doesn’t know that it’s an Employee. If the Employee class has a method named
//setLastName, the following code doesn’t work:

//Object emp = new Employee();
//emp.setLastName("Smith"); // error: won't compile

//Because emp is an Object, not an Employee, the compiler doesn’t know about the
//setLastName method.

//Note that you could still cast the object to an Employee:

//Object emp = new Employee();
//((Employee)emp).setLastName("Smith"); // this works

//Methods of the Object class

//Method                            What It Does
//protectedObject clone()           Returns a copy of this object.
//boolean equals(Object obj)        Indicates whether this object is equal to the
//                                  obj object.
//protected void finalize()         Is called by the garbage collector when the object
//                                  is destroyed.
//Class getClass()                  Returns a Class object that represents this
//                                  object’s runtime class.
//int hashCode()                    Returns this object’s hash code.
//void notify()                     Is used with threaded applications to wake up a
//                                  thread that’s waiting on this object.
//void notifyAll()                  Is used with threaded applications to wake up all
//                                  threads that are waiting on this object.
//String toString()                 Returns a String representation of this object.
//void wait()                       Causes this object’s thread to wait until another
//                                  thread calls notify or notifyAll.
//void wait(Long timeout)           Is a variation of the basic wait method.
//void wait(Long timeout,int nanos) Is yet another variation of the wait method

