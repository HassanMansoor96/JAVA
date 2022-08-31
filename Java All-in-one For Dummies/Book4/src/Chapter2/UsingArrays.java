//Understanding Arrays

//An array is a set of variables that is referenced by using a single variable name
//combined with an index number. Each item of an array is called an element. All
//the elements in an array must be of the same type. Thus the array itself has a type
//that specifies what kind of elements it can contain. An int array can contain int
//values, for example, and a String array can contain strings


//Creating Arrays

//Before you can create an array, you must declare a variable that refers to the array.
//This variable declaration should indicate the type of elements that are stored by the
//array followed by a set of empty brackets, like this:
//String[] names;
//Here a variable named names is declared. Its type is an array of String objects.

//Java also lets you
//put the brackets on the variable name rather than on the type. The following two
//statements both create arrays of int elements:

//int[] array1; // an array of int elements
//int array2[]; // another array of int elements


//Initializing an Array

//One way to initialize the values in an array is to simply assign them one by one:

//String[] days = new Array[7];
//Days[0] = "Sunday";
//Days[1] = "Monday";
//Days[2] = "Tuesday";
//Days[3] = "Wednesday";
//Days[4] = "Thursday";
//Days[5] = "Friday";
//Days[6] = "Saturday";

//Java has a shorthand way to create an array and initialize it with constant values:

//String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

//Here each element to be assigned to the array is listed in an array initializer. Here’s
//an example of an array initializer for an int array:

//int[] primes = { 2, 3, 5, 7, 11, 13, 17 };

//Note: The length of an array created with an initializer is determined by the number
//of values listed in the initializer.

//An alternative way to code an initializer is this:
//int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17 };

//To use this type of initializer, you use the new keyword followed by the array type
//and a set of empty brackets. Then you code the initializer.







package Chapter2;

/**
 *
 * @author Hassan
 */
public class UsingArrays {
    
}
