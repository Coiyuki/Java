package Java.Week3;

public class Activity3 {
    public static void main(String [] args) {
        String correctUser = "Shan";
        String correctPassword = "java1234";
        boolean isLocked = false; //change this to lock the account

        String enteredUser = "Shan";
        String passwordEntered = "java1234";

        if (correctUser.equals(enteredUser)) {
            if (correctPassword.equals(passwordEntered)) {
                if (!isLocked) {
                    System.out.println("Correct Credentials");
                } else {
                    System.out.println("Account is Locked");
                }
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            System.out.println("Invalid User & Password");
        }

    }
    
}
