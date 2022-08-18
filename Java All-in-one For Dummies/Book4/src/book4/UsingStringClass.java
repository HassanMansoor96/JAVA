
//Using the String Class

//The String class is the class you use to create string objects. It has a whole gaggle
//of methods that are designed to let you find out information about the string
//that’s represented by the String class.

//String Class Methods

//Method                                Description

//char charAt(int)                      Returns the character at the specified position in the string.

//int compareTo(String)                 Compares this string to another string, using alphabetical
//                                      order. Returns -1 if this string comes before the other string, 0
//                                      if the strings are the same, and 1 if this string comes after the
//                                      other string.

//int compareToIgnoreCase(String)       Similar to compareTo but ignores case.

//boolean contains(CharSequence)        Returns true if this string contains the parameter value.
//                                      The parameter can be a String, StringBuilder, or
//                                      StringBuffer.

//boolean endsWith(String)              Returns true if this string ends with the parameter string.

//boolean equals(String)                Returns true if this string has the same value as the
//                                      parameter string.

//boolean equalsIgnoreCase(String)      Similar to equals but ignores case.

//int indexOf(char)                     Returns the index of the first occurrence of the char parameter
//                                      in this string. Returns -1 if the character isn’t in the string.

//Complete table starting on page 378.


//The most important thing to remember about the String class is that in spite
//of the fact that it has a bazillion methods, none of those methods let you alter
//the string in any way. A String object is immutable, which means that it can’t be
//changed.

//Although you can’t change a string after you create it, you can use methods of the
//String class to create new strings that are variations of the original string. The
//following sections describe some of the more interesting things you can do with
//these methods.


//Finding the length of a string

//One of the most basic string operations is determining the length of a string. You
//do that with the length method. For example:

//String s = "A wonderful day for a neighbor.";
//int len = s.length();

//Here len is assigned a value of 31 because the string s consists of 30 characters.

//Making simple string modifications

//Several of the methods of the String class return modified versions of the original
//string. toLowerCase, for example, converts a string to all-lowercase letters:

//String s1 = "Oompa Loompa";
//String s2 = s1.toLowerCase();

//Here s2 is set to the string oompa loompa. The toUpperCase method works the
//same way but converts strings to all-uppercase letters.

//The trim method removes white-space characters (spaces, tabs, newlines, and so
//on) from the start and end of a word. Here’s an example:

//String s = " Oompa Loompa ";
//s = s.trim();

//Here the spaces before and after Oompa Loompa are removed. Thus, the resulting
//string is ten characters long.

//Bear in mind that because strings are immutable, these methods don’t actually
//change the String object. Instead, they create a new String with the modified
//value. A common mistake — especially for programmers who are new to Java but
//experienced in other languages — is to forget to assign the return value from one
//of these methods. The following statement has no effect on s:

//s.trim();

//Here the trim method trims the string — but then the program discards the
//result. The remedy is to assign the result of this expression back to s, like this:

//s = s.trim();


//Extracting characters from a string

//You can use the charAt method to extract a character from a specific position in a
//string.

//Here’s an example of a program that uses the charAt method to count the number
//of vowels in a string entered by the user:

//import java.util.Scanner;
//public class CountVowels
//{
//static Scanner sc = new Scanner(System.in);
//public static void main(String[] args)
//{
//System.out.print("Enter a string: ");
//String s = sc.nextLine();
//int vowelCount = 0;
//for (int i = 0; i < s.length(); i++)
//{
//char c = s.charAt(i);
//if ( (c == 'A') || (c == 'a')
//|| (c == 'E') || (c == 'e')
//|| (c == 'I') || (c == 'i')
//|| (c == 'O') || (c == 'o')
//|| (c == 'U') || (c == 'u') )
//vowelCount++;
//}
//System.out.println("That string contains "
//+ vowelCount + " vowels.");
//}
//}


//Here the for loop checks the length of the string to make sure that the index
//variable i doesn’t exceed the string length. Then each character is extracted and
//checked with an if statement to see whether it is a vowel. The condition expression
//in this if statement is a little complicated because it must check for five different
//vowels, both uppercase and lowercase.














package book4;

/**
 *
 * @author Hassan
 */
public class UsingStringClass {
    
}
