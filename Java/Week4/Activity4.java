package Java.Week4;
import java.util.Scanner;

public class Activity4 {
    static boolean isValid(int qty) {
        if (qty >= 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[][] warehouse = {
        {50,100,150},
        {35,-1,20},
        {100,29,200}
        };
        int total = 0;
        int lowLimit = 40;
        boolean found = false;

        for (int r = 0; r < warehouse.length; r++){ // Worker A
            for (int c = 0; c < warehouse[r].length; c++) {
                if (warehouse[r][c] == -1) {
                    continue; /*it skips the -1 the broken shelf */
                }
                total += warehouse[r][c];
                System.out.print(warehouse[r][c] + " ");
            }
            System.out.println();
        }
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter restock amount: ");
        int qty = sc.nextInt();
        while (!isValid(qty)) {
            System.out.println("Invalid, try again: ");
            qty = sc.nextInt(); /*  loops the while loop if invalid input ;-;*/ 
        }
        System.out.println("Restocked: " + qty);
        int choice;
    do {
    System.out.println("1. Show total");
    System.out.println("2. Find low shelf");
    System.out.println("3. Restock");
    System.out.println("4. Exit");
    choice = sc.nextInt();
    if (choice == 1){
        System.out.println("Total: " + total);
    }
    if (choice == 2){
        found = false;
        System.out.println("Total: " + total);
            for (int r = 0; r < warehouse.length; r++){ // Worker B
            for (int c = 0; c < warehouse[r].length; c++) {
                if (warehouse[r][c] == -1) {
                    continue; /*it skips the -1 the broken shelf */
                }
                if (warehouse[r][c] <= lowLimit){
                    System.out.println("Low Shelf At Row " + r + " , Column " + c);
                    found = true;
                    break; /*Break: leaves the inner loop, stops checking this row */
                }
            }
            if (found){
                break; /*Break: leaves the outer loop, stops checking the other rows*/
            }
        }
    }
    if (choice == 3) {
        qty = 0;
        System.out.println("Enter restock amount: ");
        qty = sc.nextInt();
        while (!isValid(qty)) {
            System.out.println("Invalid, try again: ");
            qty = sc.nextInt(); /*  loops the while loop if invalid input ;-;*/ 
        }
        System.out.println("Restocked: " + qty);
    }
    } while (choice != 4);
        sc.close();
    }
}
