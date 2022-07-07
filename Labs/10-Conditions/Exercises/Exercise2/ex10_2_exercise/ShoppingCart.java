
package ex10_2_exercise;

public class ShoppingCart {
    public static void main(String args[]) {
        Order order = new Order("Haasan Mansoor", 1000.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: " + order.getDiscount());
    }
}
