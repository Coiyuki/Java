package Java.Week4;
import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n = sc.nextInt();
        int total = 0;

        while (n != -1) {
            total += n;
            n = sc.nextInt();
        }
        System.out.println("Total: " + total);
        sc.close();
    }
    /*My Tests:
    if positive integers it add the total so mine was
    5, 4, 3 = 12
    adding negative for example would minus the total
    5, 4, 3, -5, -4, -3 = 0
    
    and -1 doesn't count in the total*/
}
