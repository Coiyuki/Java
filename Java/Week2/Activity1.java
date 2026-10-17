package Java.Week2;

public class Activity1 {
    public static void main(String[] args) {
        // Declare two integer variables a and b, both positive numbers
        int a = 5;
        int b = 2;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("========================");
        System.out.println("Positive Numbers \n");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product); // Product will be positive because both numbers are positive
        System.out.println("Quotient: " + quotient); // Quotient will be positive because both numbers are positive
        System.out.println("Remainder: " + remainder + "\n\n"); // Remainder will be positive because both numbers are positive

        // Declare two integer variables c and d, one positive and one negative number
        int c = 10;
        int d = -3;
        int e = -10;
        int f = 3;

        int sum1 = c + d;
        int difference1 = c - d;
        int product1 = c * d;
        int quotient1 = c / d;
        int remainder1 = c % d;
        int quotient2 = e / f;
        int remainder2 = e % f;
        int quotient3 = f / e;
        int remainder3 = f % e;

        System.out.println("========================");
        System.out.println("Negative Numbers \n");
        System.out.println("Sum: " + sum1);
        System.out.println("Difference: " + difference1);
        System.out.println("Product: " + product1); // Product will be negative because one of the numbers is negative
        System.out.println("Quotient: " + quotient1); // Quotient will be negative because one of the numbers is negative
        System.out.println("Remainder: " + remainder1 + "\n"); // Remainder will be positive because the dividend is positive and the divisor is negative
        System.out.println("Quotient: " + quotient2); // Quotient will be negative because one of the numbers is negative
        System.out.println("Remainder: " + remainder2 + "\n"); // Remainder will be negative because the dividend is negative and the divisor is positive
        System.out.println("Quotient: " + quotient3); // Quotient will be 0 because the dividend is smaller than the divisor
        System.out.println("Remainder: " + remainder3 + "\n"); // Remainder will be positive because the dividend is positive and the divisor is negative
        

        // In summary, the product and quotient of two numbers will be positive if both numbers are positive or both numbers are negative. The product and quotient will be negative if one number is positive and the other is negative. The remainder will have the same sign as the dividend.
    }
}
 