//The type of a variable is indicated by following the variable name
//with a colon and the type: 
                            //connectionString: String

//A method’s return type is indicated in the same way:
                                                       //getCustomer(): Customer

//Parameters are listed within the parentheses, and both the name and type are
//listed. For example:
                    //getCustomer(custno: int): Customer

//Interfaces are drawn pretty much the same way as classes, but the class name is
//preceded by the word interface:
                                //<<interface>>
                                //ProductDB


//Drawing arrows

//Besides using rectangles to represent classes, class diagrams include arrows to
//represent relationships among classes. UML uses a variety of types of arrows.

//A solid line with a hollow closed arrow at one end represents inheritance.

//The arrow points to the base class. A dashed line with a hollow closed arrow at one
//end indicates that a class implements an interface.

//The arrow points to the interface. A solid line with an open arrow indicates an
//association.

//An association simply indicates that two classes work together. It may be that one
//of the classes creates objects of the other class or that one class requires an object
//of the other class to perform its work. Or perhaps instances of one class contain
//instances of the other class.
//You can add a name to an association arrow to indicate its purpose. If an association
//arrow indicates that instances of one class create objects of another class, you
//can place the word Creates next to the arrow.