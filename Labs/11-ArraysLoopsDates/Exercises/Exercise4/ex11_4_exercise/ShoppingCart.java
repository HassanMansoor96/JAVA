package ex11_4_exercise;

import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> items = new ArrayList<>();
        items.add("coke");
        items.add("coffee");
        items.add("muffin");

        System.out.println(items);

        // add (insert) another element at a specific index
        items.add(2, "chocolate");
        System.out.println(items);

        // Check for the existence of a specific String element.  
        if (items.contains("coke")) {
        //   If it exists, remove it.
            items.remove("coke");
        }
        System.out.println(items);
    }
}
