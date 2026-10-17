package Java.Week1;
public class Activity2 {
    public static void main(String[] args) {
        String storeName = "Shan Store";
        int quantity = 15;
        double unitPrice = 9.99;
        double totalCost = quantity * unitPrice; 

        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost); /* Total Cost shouldn't be an integer as the unitPrice is a double. Also, it should be formatted to show two decimal places because if it was int then it would show 149 rather than 149.85 */

    }
    
}
