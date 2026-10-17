package Java.Week2;

public class Activity2 {
    public static void main(String[] args) {
        double avgGrade = 89.5;
        int numberofAbsences = 3;

        double avgGrade2 = 92.0;
        int numberofAbsences2 = 4;

        double avgGrade3 = 70.0;
        int numberofAbsences3 = 2;

        double avgGrade4 = 95.0;
        int numberofAbsences4 = 1;

        boolean isPassing = ( (avgGrade >= 75) && (numberofAbsences <= 3) ) || (avgGrade >= 90);
        boolean isPassing2 = ( (avgGrade2 >= 75) && (numberofAbsences2 <= 3) ) || (avgGrade2 >= 90);
        boolean isPassing3 = ( (avgGrade3 >= 75) && (numberofAbsences3 <= 3) ) || (avgGrade3 >= 90);
        boolean isPassing4 = ( (avgGrade4 >= 75) && (numberofAbsences4 <= 3) ) || (avgGrade4 >= 90);

        //Rule: PASS if (average >= 75 AND absences <= 3) OR average >= 90
        System.out.println("Rule: PASS if (average >= 75 AND absences <= 3) OR average >= 90\n\n");

         //output Student 1's average grade, number of absences, and passing status
        System.out.println("Student 1: Average Grade = " + avgGrade + ", Number of Absences = " + numberofAbsences + ", Passing = " + isPassing);
        if (isPassing) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
  
        //output Student 2's average grade, number of absences, and passing status
        System.out.println("Student 2: Average Grade = " + avgGrade2 + ", Number of Absences = " + numberofAbsences2 + ", Passing = " + isPassing2);
        if (isPassing2) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        
        //output Student 3's average grade, number of absences, and passing status
        System.out.println("Student 3: Average Grade = " + avgGrade3 + ", Number of Absences = " + numberofAbsences3 + ", Passing = " + isPassing3);
        if (isPassing3) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
       
        //output Student 4's average grade, number of absences, and passing status
        System.out.println("Student 4: Average Grade = " + avgGrade4 + ", Number of Absences = " + numberofAbsences4 + ", Passing = " + isPassing4);
        if (isPassing4) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
       
    }
}