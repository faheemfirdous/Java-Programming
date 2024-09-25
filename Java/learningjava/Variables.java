
import java.util.Scanner;

// adding two complex numbers

public class Variables {
    public static void main(String[] arg) {
        System.out.print("Hello \nEnter two complex numbers:");
        try (Scanner scanner = new Scanner(System.in)) {
            // primitive datatypes
            int num1 = scanner.nextInt();
            double num2 = scanner.nextDouble();
            float num3 = scanner.nextFloat();
            // short, long ...
            // non primitive data types
            String char1 = scanner.next();
            // class array linked list ....
        // to remove errors
            System.out.println(num1 + num2 + num3 + char1);

        }        
    }
}
