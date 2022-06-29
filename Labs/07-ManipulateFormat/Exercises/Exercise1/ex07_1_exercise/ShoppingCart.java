
package ex07_1_exercise;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName, lastName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName. 
            spaceIdx= custName.indexOf(" ");
            System.out.println(spaceIdx);

        // Use the substring method parse out the first name and print it.
            firstName = custName.substring(0,spaceIdx);
            lastName = custName.substring(spaceIdx+1);
            System.out.println(lastName);
            System.out.println(firstName);

    }
}
