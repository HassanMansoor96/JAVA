
package ex07_2_exercise;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName, lastName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println("First Name:");
        System.out.println(firstName);
          
	//Instantiate and initialize sb to firstName.
            sb = new StringBuilder(firstName);
            
        //Last Name
            lastName = custName.substring(spaceIdx+1);
            System.out.println("Last Name :");
            System.out.println(lastName);
        

	// Put the full name back together, using StringBuilder append method.
	//   You can just enter the String literal for the last name.
	//   Print the full name.
        sb.append(" Smith");
        System.out.println("Full Name: ");
        System.out.println(sb);
        
    }
}
