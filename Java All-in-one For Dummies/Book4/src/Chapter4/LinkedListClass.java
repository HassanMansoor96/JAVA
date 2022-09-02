//Using the LinkedList Class

//Understanding the LinkedList Class

//A linked list is a collection in which every object in the list maintains with it a
//pointer to the following object in the list and another pointer to the preceding
//object in the list. No array is involved at all in a linked list. Instead, the list is managed
//entirely by these pointers.


//Creating a LinkedList

//As with any other kind of object, creating a linked list is a two-step affair. First,
//you declare a LinkedList variable; then you call one of the LinkedList constructors
//to create the object, as in this example:

//LinkedList officers = new LinkedList();

//Here a linked list is created and assigned to the variable officers.



//Adding Items to a LinkedList

//The LinkedList class gives you many ways to add items to the list. The most basic
//is the add method, which works pretty much the same way that it does for the
//ArrayList class. Here’s an example:

//LinkedList<String> officers = new LinkedList<String>();
//officers.add("Blake");
//officers.add("Burns");
//officers.add("Houlihan");
//officers.add("Pierce");
//officers.add("McIntyre");
//for (String s : officers)
//System.out.println(s);

//The add method adds these items to the end of the list. So the resulting output is this:

//Blake
//Burns
//Houlihan
//Pierce
//McIntyre

//The addLast method works the same way, but the addFirst method adds items to
//the front of the list. Consider these statements:

//LinkedList<String> officers = new LinkedList<String>();
//officers.addFirst("Blake");
//officers.addFirst("Burns");
//officers.addFirst("Houlihan");
//officers.addFirst("Pierce");
//officers.addFirst("McIntyre");
//for (String s : officers)
//System.out.println(s);

//Here the resulting output shows the officers in reverse order:

//McIntyre
//Pierce
//Houlihan
//Burns
//Blake

//To insert an object into a specific position into the list, specify the index in the add
//method, as in this example:

//LinkedList<String> officers = new LinkedList<String>();
//officers.add("Blake");
//officers.add("Burns");
//officers.add("Houlihan");
//officers.add("Pierce");
//officers.add("McIntyre");
//officers.add(2, "Tuttle");
//for (String s : officers)
//System.out.println(s);

//The console output from these statements is this:

//Blake
//Burns
//Tuttle
//Houlihan
//Pierce
//McIntyre


//Retrieving Items from a LinkedList

//As with the ArrayList class, you can use the get method to retrieve an item based
//on its index. If you pass it an invalid index number, the get method throws the
//unchecked IndexOutOfBoundsException.

//You can also use an enhanced for loop to retrieve all the items in the linked list.
//The examples in the preceding section use this enhanced for loop to print the
//contents of the officers linked list:

//for (String s : officers)
//System.out.println(s);

//The LinkedList class also has a variety of other methods that retrieve items from
//the list. Some of these methods remove the items as they are retrieved; some
//throw exceptions if the list is empty; others return null.



//Updating LinkedList Items

//As with the ArrayList class, you can use the set method to replace an object in
//a linked list with another object.Here’s how Java implements that :

//LinkedList<String> officers = new LinkedList<String>();
//// add the original officers
//officers.add("Blake");
//officers.add("Burns");
//officers.add("Tuttle");
//officers.add("Houlihan");
//officers.add("Pierce");
//officers.add("McIntyre");
//System.out.println(officers);
//// replace Tuttle with Murdock
//officers.set(2, "Murdock");
//System.out.println("\nTuttle is replaced:");
//System.out.println(officers);

//The output from this code looks like this:

//[Blake, Burns, Tuttle, Houlihan, Pierce, McIntyre]
//Tuttle is replaced:
//[Blake, Burns, Murdock, Houlihan, Pierce, McIntyre]

//As with an ArrayList, any changes you make to an object retrieved from a linked
//list are automatically reflected in the list. That’s because the list contains references
//to objects, not the objects themselves.


//Removing LinkedList Items

//You’ve already seen that several of the methods that retrieve items from a linked
//list also remove the items. In particular, the remove, removeFirst, and poll
//methods remove the first item from the list, and the removeLast method removes
//the last item.

//You can also remove any arbitrary item by specifying either its index number or
//a reference to the object you want to remove on the remove method. To remove
//item 3, for example, use a statement like this:

//officers.remove(3);

//If you have a reference to the item that you want to remove, use the remove
//method, like this:

//officers.remove(tuttle);

//To remove all the items from the list, use the clear method:

//officers.clear();




















package Chapter4;

/**
 *
 * @author Hassan
 */
public class LinkedListClass {
    
}
