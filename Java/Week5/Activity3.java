package Java.Week5;
import java.util.Arrays;

public class Activity3 {
    public static void main(String[] args){
        int[] scores = {85, 90, 72, 64, 98, 77, 88, 93};        
        int target = 77;
        int result = linearSearch(scores, target); 
        int[] sorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sorted);
        /*
        I sort a copy because Arrays.sort() changes the array it is given.
        If I sorted scores directly the original order would be lost,
        and the index from linearSearch would no longer match the data.
        */

        if (result == -1) {
            System.out.println("Not found"); /*If the results/target isn't in the scores it will print Not found */
        } else {
            System.out.println("Found at index " + result); /*If the results/target is valid in the scores it will print Found at index __*/
        }
        // prints the output
        System.out.println("Original: " + Arrays.toString(scores));
        System.out.println("Sorted:   " + Arrays.toString(sorted));

    }
    static int linearSearch (int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) {
                return i;
            }
            return -1;

    }
}
