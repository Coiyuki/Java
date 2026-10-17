package Java.Week2;

public class Activity4 {
    public static void main (String[] args) {

        // puzzle 1: Arithmetic + Relational Operators
        int x = 2;
        int y = 4;
        //prediction of mine is true

        System.out.println(x + y * 3 > 10); 
        
        // I was correct because y * 3 is 12 and 12 + 2 is 14 which is greater than 10.

        // puzzle 2: Logical + Arithmetic Operators
        int age = 20;  
        boolean hasID = true;
       
          // my prediction is false as age is below 20 due to the subtraction on the age of -5 making the value of 20 into 15 which is not greater than or equal to 20 regardless if the person has an ID or not since it isn't an OR statement.
          //  I wrote my prediction under the println before commiting as my formula was inside the println but looking at the formatting rules in the slides I moved it upwards to fit
        System.out.println(age - 5 >= 20 && hasID);
       

        // I was correct on my assumption
        

        // puzzle 3: Arithmetic Operators + Increment/Decrement Operators
        int p3 = 5;
        // prediction of mine is 31, same as before I wrote my prediction under the println before commiting as my formula was inside the println but looking at the formatting rules in the slides I moved it upwards to fit
        System.out.println(p3++ * 5 + p3);
        // I was also correct since the first p3 only counts as 5 as a post-increment it will read as 5 * 5 = 25 then the last one since it has added the incremental value so 25 + 6 = 31


    }
}
