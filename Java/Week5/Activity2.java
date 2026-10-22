package Java.Week5;

public class Activity2 {
    public static void main(String[] args) {
        int[] scores = {85, 90, 72, 64, 98, 77, 88, 93};
        int sum = 0; /*sum is 667 */
        int highest = scores[0]; /*higest score is 98 */
        int lowest = scores[0]; /*lowest score is 64 */
        /*average score is 84.375 */

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            

            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        double average = (double) sum / scores.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

    }
    
}
