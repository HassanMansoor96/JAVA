
//Working with Strings

//Strings are among the most common types of objects in Java.

//Strings are reference types, not value types, such as int or boolean. As a
//result, a string variable holds a reference to an object created from the
//String class, not the value of the string itself.

//Even though strings aren’t primitive types, the Java compiler has some
//features designed to let you work with strings almost as though they were
//primitive types. Java lets you assign string literals to string variables, for
//example, like this:
//String line1 = "Oh what a beautiful morning!";

//Strings can include escape sequences that consist of a slash followed by
//another character. The most common escape sequences are \n for new line
//and \t for tab. If you want to include a back slash in a string, you must use the
//escape sequence \\. Here is a complete list of all the escape sequences you
//can use:

//Escape Sequence Explanation
//\n Newline
//\t Tab
//\b Backspace
//\r Carriage return
//\f Form feed
//\' Apostrophe
//\" Quotation mark
//\\ Back slash

//Strings and characters are different. String literals are marked by quotation
//marks; character literals are marked by apostrophes. Thus, "a" is a string
//literal that happens to be one character long. By contrast, 'a' is a character
//literal.

//You can combine, or concatenate, strings by using the + operator, like this:
//String line2 = line1 + “\nOh what a beautiful day!”;

//You can also use the += operator with strings, like this:
//line2 += “\nI’ve got a beautiful feeling”;

//When a primitive type is used in a concatenation expression, Java automatically
//converts the primitive type to a string. Thus Java allows the following:
//int empCount = 50;
//String msg = "Number of employees: " + empCount;

//The various primitive wrapper classes (such as integer and double) have
//parse methods that can convert string values to numeric types. Here’s an
//example:
//String s = "50";
//int i = Integer.parseInt(s);

//You can’t compare strings by using the equality operator (==). Instead, you
//should use the equals method. Here’s an example:
//if (lastName.equals("Lowe"))
//System.out.println("This is me!");

//The String class also has an equalsIgnoreCase method that compares
//strings without considering case. Here’s an example:
//if (lastName.equalsIgnoreCase("lowe"))
//System.out.println("This is me again!");







package book4;

/**
 *
 * @author Hassan
 */
public class Chapter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
