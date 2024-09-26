// methods 
/*
 * syntax of a mehtod/function in java is like this
 * public(scope) static returnType functionName(type arg1, type arg2....){}
 */

import java.util.*;

public class methods{

    // non returning function
    public static void printName(String name1){
        System.out.println("Your name is " + name1);
    }

    // return function
    public static int summ(int num1, int num2) {
        return (num1 + num2);
    }

    // recursion
    public static int fact(int num1) {
        if (num1 == 1 || num1 == 0) {
            return 1;
        } else {
            return num1 * fact(num1 - 1);
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the following command you want to perform:");
        System.out.println("1 -> to print your name.");
        System.out.println("2 -> to find sum of 2 numbers.");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                String name1 = sc.next();
                printName(name1);
            }
            case 2 -> {
                System.out.println("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                //int sum = summ(num1, num2);
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + summ(num1, num2));
            }
            case 3 -> {
                System.out.println("Enter the number: ");
                int num1 = sc.nextInt();
                System.out.println("The fatorial of " + num1 + " is " + fact(num1));
            }
            default -> throw new AssertionError();
        }
        
       
    }
}