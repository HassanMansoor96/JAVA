
//Here the import statement imports all the classes in the com.lowewriter.util
//package. Then, the while loop in the main method repeatedly asks the user if he
//or she wants to keep going.

package Chapter8;

/**
 *
 * @author Hassan
 */
public class PackageTest {

    public static void main(String[] args) {
        while (Console.askYorN("Keep going?")) {
            System.out.println("D'oh!");
        }
    }   
}
