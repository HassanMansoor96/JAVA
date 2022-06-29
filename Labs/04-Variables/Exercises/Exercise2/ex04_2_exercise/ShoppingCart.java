
package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a " + itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
            double price = 20.00, tax = 2.00;
            double total;
            int quantity = 1;
        
        // Modify message to include quantity 
            message = custName+" wants to purchase "+quantity+ " "+itemDesc;
        
            System.out.println(message);
       
        // Calculate total and then print the total cost
            total = quantity * price * tax;
        
             System.out.println("Total cost with tax: R"+total);

        
    }    
}
