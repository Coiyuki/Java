package Java.Week3;

public class Activity2 {
    public static void main(String[] args) {
        double purchaseAmount = 50;
        double discount;
        double finalPrice;

        if (purchaseAmount >= 200 ) {
           discount = purchaseAmount * 0.15;
           finalPrice = purchaseAmount - discount;
           System.out.println("Discount Tier: 15%");
           System.out.println("Discounted Amount: " + discount);
           System.out.println("Final Price: $" + finalPrice);

        } else if (purchaseAmount >= 150) {
            discount = purchaseAmount * 0.10;
            finalPrice = purchaseAmount - discount;
            System.out.println("Discount Tier: 10%");
            System.out.println("Discounted Amount: " + discount);
            System.out.println("Final Price: $" + finalPrice);

        } else if (purchaseAmount >= 100) {
            discount = purchaseAmount * 0.05;
            finalPrice = purchaseAmount - discount;
            System.out.println("Discount Tier: 5%");
            System.out.println("Discounted Amount: " + discount);
            System.out.println("Final Price: $" + finalPrice);

        } else {
            System.out.println("Discount Tier: 0%");
            System.out.println("Discounted Amount: 0.0 ");
            System.out.println("Final Price: $" + purchaseAmount);
        }

    }
    
}
