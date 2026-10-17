package Java.Week1;

public class Activity4 {
    public static void main(String[] args) {
        //wrap around
        byte A = 127;
        A++;

        System.out.println(A + "\n\n");
        // it wraps around because 127 is the maximum value for a byte, since Java doesnt stop or crash, it wraps to the other end of the range which is -128.

        //String comparison
        String a = "...";
        String b = new String("...");
        String c = new String("...");

        boolean isEqual = a.equals(b);
        boolean isEqual2 = a == b;
        boolean isEqual3 = b == c;
        boolean isEqual4 = b.equals(c);
        boolean isEqual5 = a == c;
        boolean isEqual6 = a.equals(c);

        System.out.println("Using equals method: " + isEqual); // true because a and b checks the value inside the quote and they are the same value
        System.out.println("Using == operator: " + isEqual2); // false because a and b are two different objects in memory
        System.out.println("Using == operator: " + isEqual3); // false because b and c are two different objects in memory
        System.out.println("Using equals method: " + isEqual4); // true because b and c checks the value inside the quote and they are the same value
        System.out.println("Using == operator: " + isEqual5); // false because a and c are two different objects in memory
        System.out.println("Using equals method: " + isEqual6 + "\n\n"); // true because a and c checks the value inside the quote and they are the same value

        //Array reference
        // original array
        double arrRef[] = {1.0, 2.0, 3.0};
        double arrStor[] = arrRef;
        System.out.println("Value of arrStor: " + arrStor[2]); // 3.0 because arrStor is a reference to the same array as arrRef.
        System.out.println("Value of arrRef: " + java.util.Arrays.toString(arrRef)); // [1.0, 2.0, 3.0] because arrRef is a reference to the same array as arrStor.

        // update the shared array
        arrStor[0] = 5.0; // updates the shared array, just to see if they share the ref :>
        System.out.println("Value of arrStor: " + arrStor[0]); // 5.0 because arrStor is a reference to the same array as arrRef.
        System.out.println("Value of arrRef: " + java.util.Arrays.toString(arrRef)); //arrRef is also updated because arrStor is a reference to the same array as arrRef.

    }

}
