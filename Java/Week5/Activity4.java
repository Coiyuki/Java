package Java.Week5;

public class Activity4 {
    public static void main(String[] args){
        String[] names = {"Ana", "Ben", "Cara", "Dan", "Eli"};
        int[][] raw = {
        {80, 90, 85, 95},
        {70, 75, 80, 72},
        {90, 92, 88, 94},   
        {85, 85, 85, 85},
        {80, 90, 85, 95}
        };
                    

        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], raw[i]);
        }
        for (int pass = 0; pass < students.length - 1 ; pass++) {
            for (int i = 0; i < students.length - 1; i++) {
                if (students[i].getAverage() < students[i + 1].getAverage()){
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
        }
        int rank = 1;

        System.out.println("=== Leaderboard ===");
        for (int i = 0; i < students.length; i++) {
            if (i == 0 || students[i].getAverage() != students[i - 1].getAverage()) {
            rank = i + 1;
            }
            System.out.printf("%d. %-6s %.2f%n", rank, students[i].name, students[i].getAverage());
        }
        System.out.println("===========");
        // Finds The Index on where they are placed
        System.out.println(findIndex(students, "Eli"));
        System.out.println(findIndex(students, "Zed"));

        System.out.println("===========");

        // Finds the rank
        System.out.println(findRank(students, "Eli"));
        System.out.println(findRank(students, "Dan"));
        System.out.println(findRank(students, "Zed"));
    }
    static int findIndex(Student[] list, String name) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].name.equals(name)) {
                return i;
            }
        }
    return -1;
    }
    static int findRank(Student[] list, String name) {
    int index = findIndex(list, name);
    if (index == -1) {
        return -1;
    }
    int higher = 0;
    for (int i = 0; i < list.length; i++) {
        if (list[i].getAverage() > list[index].getAverage()) {
            higher++;
        }
    }
    return higher + 1;
    }
}
class Student {
    String name;
    int[] quizzes;

    Student(String n, int[] q) {
        this.name = n;
        this.quizzes = q;
    }
    double getAverage() {
    int sum = 0;
    for (int i = 0; i < quizzes.length; i++) {
        sum += quizzes[i];
    }
    return (double) sum / quizzes.length;
    }
}
