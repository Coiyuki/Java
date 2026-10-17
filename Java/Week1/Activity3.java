package Java.Week1;

public class Activity3 {
    public static void main(String[] args) {

        // Centimeters to meters and remaining centimeters
        double centimeters = 325.5;

        int meters = (int) (centimeters / 100);
        double remainingCentimeters = centimeters - (meters * 100);

        System.out.println("Whole Meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters + "\n\n");

        // Widening
       
        int wholeNumber = 100;
        double decimalNumber = wholeNumber;

        // no cast is needed because an int always fits in a double, so nothing is lost.
        System.out.println("Whole Number: " + wholeNumber);
        System.out.println("Decimal Number: " + decimalNumber + "\n\n");

        // Narrowing


        double decimalValue = 6.75;
        int integerValue = (int) decimalValue;
        
        // it doesnt round the decimal value to the nearest whole number, it just truncates the decimal part and keeps the whole number part. The decimal part is lost, so its considered a loss of data.
        System.out.println("Decimal Value: " + decimalValue);
        System.out.println("Integer Value: " + integerValue + "\n\n");
    }
}
