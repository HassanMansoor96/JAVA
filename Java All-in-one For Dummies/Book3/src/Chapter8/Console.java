
//Working with Packages

//A package is a group of classes that belong together.


//Importing classes and packages

//When you use import statements at the beginning of a Java source file, you make
//classes from the packages mentioned in the import statements available throughout
//the file.

//An import statement can import all the classes in a package by using an asterisk
//wildcard. Here all the classes in the java.util package are imported:

//import java.util.*;

//Alternatively, you can import classes one at a time. Here just the ArrayList class is imported:

//import java.util.ArrayList;

//Note: You don’t have to use an import statement to use a class from a package.
//But if you don’t use an import statement, you must fully qualify any references to
//the class. For example, you can use the ArrayList class without importing java.

//util:

//java.util.ArrayList = new java.util.ArrayList();

//Because fully qualified names are a pain to always spell out, you should always
//use import statements to import the packages or individual classes your application
//uses.

package Chapter8;

/**
 *
 * @author Hassan
 */
import java.util.Scanner;

public class Console {

    static Scanner sc = new Scanner(System.in);

    public static boolean askYorN(String prompt) {
        while (true) {
            String answer;
            System.out.print("\n" + prompt
                    + " (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}

//So you create a directory named c:\javaclasses\com\lowewriter\ util
//and save the source file to this directory. Then
//you compile the program so the Console.class file is stored in that directory too.
//And you add c:\javaclasses to your ClassPath environment variable.
