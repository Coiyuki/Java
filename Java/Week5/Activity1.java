package Java.Week5;

public class Activity1 {
    public static void main(String[] args){
        String pets[] = {"Dog","Cat", "Parrot", "Lizard", "Spider"};
        
        for (int i = 0; i < pets.length; i++) {
            System.out.println((i + 1) + ". " + pets[i]); /*added 1 to i to set the numbering at 1 rather that 0 */
        }

    }
}
