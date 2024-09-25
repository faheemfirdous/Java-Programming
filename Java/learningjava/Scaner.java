// taking input from user
import java.util.*;

class Scaner {

    public static void main(String args[]) {
        System.out.println("Enter two numbers: ");

        try (Scanner obj = new Scanner(System.in)) {
            int a, b, c;
            a = obj.nextInt();
            b = obj.nextInt();
            c = a + b;
            System.out.print("sum of " + a + " " + b + " is " + c);
        }
    }
}
