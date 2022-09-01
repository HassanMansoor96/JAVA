//Using the ArrayList Class

//Creating an ArrayList Object

//To create an array list, you first declare an ArrayList variable and then call the
//ArrayList constructor to instantiate an ArrayList object and assign it to the
//variable. You can do this on separate lines like this:

//ArrayList signs;
//signs = new ArrayList();

//Or,Alternatively, you can do it on a single line:

//ArrayList signs = new ArrayList();



//Adding Elements

//After you create an array list, you can use the add method to add objects to the
//array list. Here’s an example that adds strings to an array list:

//signs.add("Drink Pepsi");
//signs.add("No minors allowed");
//signs.add("Say Pepsi, Please");
//signs.add("7-Up: You Like It, It Likes You");
//signs.add("Dr. Pepper 10, 2, 4");

//If you specified a type when you created the array list, the objects you add via the
//add method must be of the correct type.

//You can insert an object at a specific position in the list by listing the position in
//the add method, consider these statements:

//ArrayList<String> nums = new ArrayList<String>();
//nums.add("One");
//nums.add("Two");
//nums.add("Three");
//nums.add("Four");
//nums.add(2, "Two and a half");

//After these statements execute, the nums array list contains the following strings:

//One
//Two
//Two and a half
//Three
//Four


//Accessing Elements

//To access a specific element in an array list, you can use the get method, which
//specifies the index value of the element you want to retrieve. Here’s a for loop
//that prints all the strings in an array list:

//for (int i = 0; i < nums.size(); i++)
//System.out.println(nums.get(i));

//Here the size method is used to set the limit of the for loop’s index variable.

//The easiest way to access all the elements in an array list is to use an enhanced for
//statement, which lets you retrieve the elements without bothering with indexes or
//the get method. For example:

//for (String s : nums)
//System.out.println(s);

//Here each String element in the nums array list is printed to the console.

//If you need to know the index number of a particular object in an array list, and you
//have a reference to the object, you can use the indexOf method. Here’s an enhanced
//for loop that prints the index number of each string along with the string:

//for (String s : nums)
//{
//int i = nums.indexOf(s);
//System.out.println("Item " + i + ": " + s);
//}

//Depending on the contents of the array list, the output from this loop may look
//something like this:

//Item 0: One
//Item 1: Two
//Item 2: Three
//Item 3: Four



//Printing an ArrayList

//The toString method of the ArrayList class (as well as other collection classes)
//is designed to make it easy to quickly print out the contents of the list. It returns
//the contents of the array list enclosed in a set of brackets, with each element value
//separated by commas. The toString method of each element is called to obtain
//the element value.

//Consider these statements:

//ArrayList<String> nums = new ArrayList<String>();
//nums.add("One");
//nums.add("Two");
//nums.add("Three");
//nums.add("Four");
//System.out.println(nums);

//When you run these statements, the following is displayed on the console:

//[One, Two, Three, Four]



//Updating Elements

//You can use the set method to replace an existing object with another object.
//Example:

//ArrayList<String> nums = new ArrayList<String>();
//nums.clear();
//nums.add("One");
//nums.add("Two");
//nums.add("Three");
//System.out.println(nums);
//nums.set(0, "Uno");
//nums.set(1, "Dos");
//nums.set(2, "Tres");
//System.out.println(nums);

//Here an array list is created with three strings, and the contents of the array list
//are printed to the console. Then each of the three strings is replaced by another
//string, and the contents print to the console again. When you run this code, the
//following is what you see printed on the console:

//[One, Two, Three]
//[Uno, Dos, Tres]


//Because array lists contain references to objects, not the objects themselves, any
//changes you make to an object in an array list are automatically reflected in the
//list. As a result, you don’t often have to use the set method.

//For example:

//ArrayList<Employee> emps = new ArrayList<Employee>();
//// add employees to array list
//emps.add(new Employee("Addams", "Gomez"));
//emps.add(new Employee("Taylor", "Andy"));
//emps.add(new Employee("Kirk", "James"));
//// print array list
//System.out.println(emps);
//// change one of the employee's names
//Employee e = emps.get(1);
//e.changeName("Petrie", "Robert");
//// print the array list again
//System.out.println(emps);

//This example uses the Employee class, whose constructor accepts an employee’s
//last name and first name to create a new employee object, as well as a changeName
//method that also accepts a last name and a first name. In addition, the Employee
//class overrides the toString method to return the employee’s first name and last
//name.

//The main method begins by creating an ArrayList object and adding three
//employees. Then it prints out the contents of the array list. Next, it retrieves the
//employee with index number 1 and changes that employee’s name. Finally, it
//prints the contents of the array list again.

//Here’s what this code produces on the console:

//[Gomez Addams, Andy Taylor, James Kirk]
//[Gomez Addams, Robert Petrie, James Kirk]

//Notice that the second employee’s name was changed, even though the program
//doesn’t use the set method to replace the changed Employee object in the collection.
//That’s because the array list merely stores references to the Employee objects.



//Deleting Elements

//The ArrayList class provides several methods that let you remove elements from
//the collection. To remove all the elements, use the clear method, like this:

//emps.clear();

//To remove a specific element, use the remove method. It lets you remove an element
//based on the index number, like this:

//emps.remove(0);

//Here the first element in the array list is removed.

//Alternatively, you can pass the actual object you want removed. This is useful if
//you don’t know the index of the object you want to remove, but you happen to
//have a reference to the actual object, as in this example:

//ArrayList<Employee> emps = new ArrayList<Employee>();
//// create employee objects
//Employee emp1 = new Employee("Addams", "Gomez");
//Employee emp2 = new Employee("Taylor", "Andy");
//Employee emp3 = new Employee("Kirk", "James");
//// add employee objects to array list
//emps.add(emp1);
//emps.add(emp2);
//emps.add(emp3);
//// print the array list
//System.out.println(emps);
//// remove one of the employees
//emps.remove(emp2);
//// print the array list again
//System.out.println(emps);

//Here’s what this code produces on the console:

//[Gomez Addams, Andy Taylor, James Kirk]
//[Gomez Addams, James Kirk]

//As you can see, the program was able to remove Andy Taylor from the list without
//knowing his index position.





package Chapter3;

/**
 *
 * @author Hassan
 */
public class ArrayList {
    
}
