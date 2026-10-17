package Java.Week2;

public class Activity3 {
    public static void main(String[] args) {

        // Initialize balance, deposit, and interest
        double balance = 1000.0;
        System.out.println("Initial Balance: " + balance);

        balance += 250.0; // grows by 250.0
        System.out.println("Balance after deposit: " + balance);

        balance *= 2; // interest is applied, doubling the balance
        System.out.println("Balance after interest: " + balance);

        balance += 100.0; // grows by 100.0
        System.out.println("Balance after deposit: " + balance);

        System.out.println("\n\n");

        // count
        
        //since the first count++ is post-increment, the first print statement will print 5, and then increment count to 6. The second print statement will print 6.
        int count = 5;
        System.out.println(count++);
        System.out.println(count);

       
        System.out.println("\n");

        // since ++count is pre-increment, the first print statement will increment count to 6, and then print 6. The second print statement will print 6.
        int count2 = 5;
        System.out.println(++count2);
        System.out.println(count2);
    }
}
