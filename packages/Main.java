package packages;

import p.p1;
import p.p2;

public class Main {
    public static void main(String[] args) {
        int sum = p1.add(5, 3);
        int difference = p1.subtract(5, 3);

        String upperCaseStr = p2.toUpperCase("hello");
        String lowerCaseStr = p2.toLowerCase("WORLD");

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Upper Case: " + upperCaseStr);
        System.out.println("Lower Case: " + lowerCaseStr);
    }
}
