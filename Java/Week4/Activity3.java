package Java.Week4;

public class Activity3 {
    public static void main(String[] args) {
        int size = 6; 
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= row; col++) { //change row to size then it will be a rectangle
                if (col == 2) {
                    continue; /*Continue: skips the star when col is 2*/
                }
                if (col == 5){
                    break; /* Break: stops the inner loop when column 4 is reached */
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
