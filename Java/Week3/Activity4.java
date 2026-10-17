package Java.Week3;

public class Activity4 {
    public static void main(String[] args) {
        String correctUser = "Shan";
        int correctPin = 1509; // change this to change pin it can be change to string but would have to change line 23 to equals
        double balance = 15000; //change this to change balance and tier
        double withdrawalAmount = 1500; // change this for how much cash you want to withdraw\

        String tier; 
        double dailyLimit;

        String reason = ""; //sets reason for later for print
        boolean canWithdraw = false;
        
        double feeRate;
        double fee;
        double newBalance = 0;

        // user credentials
        String enteredUser = "Shan"; // change this to get error Invalid Username or Pin
        int enteredPin = 1509; // change this to get incorrect pin

        // checks pin, user, and sets balance, tier, and daily limit
        if (correctUser.equals(enteredUser)) {
            if (correctPin == enteredPin) {
                if (balance >= 50000) {
                    tier = "Platinum";
                    dailyLimit = 25000;
                    System.out.println("Your Tier: " + tier);
                } else if (balance >= 25000) {
                    tier = "Gold";
                    dailyLimit = 15000;
                    System.out.println("Your Tier: " + tier);
                } else if (balance >= 10000) {
                    tier = "Silver";
                    dailyLimit = 10000;
                    System.out.println("Your Tier: " + tier);
                } else {
                    tier = "Bronze";
                    dailyLimit = 5000;
                    System.out.println("Your Tier: " + tier);
                }

                // checks for insufficient balance and daily limit exceeded
                if (withdrawalAmount <= balance) {
                    if (withdrawalAmount <= dailyLimit) {
                        canWithdraw = true;
                    } else{
                        reason = "Daily Limit Exceeded";                    
                    }
                } else {
                    reason = "Insufficient Balance";                
                }

                // checks tier and assigns fee rate
                switch (tier) {
                case "Platinum":
                    feeRate = 0.005;
                break;
                case "Gold":
                    feeRate = 0.010;
                break;
                case "Silver":
                    feeRate = 0.015;
                break;
                default:
                    feeRate = 0.020;
                break;
                }

                fee = withdrawalAmount * feeRate;
                newBalance = balance - withdrawalAmount - fee;

                if (canWithdraw) {
                    System.out.println("APPROVED");
                    System.out.println("Withdrawal Amount: " + withdrawalAmount);
                    System.out.println("Fee Rate: " + feeRate);
                    System.out.println("Fee: " + fee);
                    System.out.println("New Balance: " + newBalance);

                } else {
                    System.out.println("DENIED");
                    System.out.println("Reason: " + reason);
                }
            } else {
                System.out.println("Incorrect Pin");
            }
        }else {
            System.out.println("Invalid Username or Pin");
        }
    
    }
}  
