// conditional statements:

// if, else
// else if
// switch
// break

import java.util.*;

public class conditonalStatements { 
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // using if else for conditions
            System.out.println("Using if else for condition check");
            System.out.println("Enter Your age: ");
            int age = sc.nextInt();
            
            if (age < 18) {
                System.out.println("just a baby");
            } else if (age == 33){
                System.out.println("you are an ALPHA");
            } else {
                System.out.println("Not a baby");
            }
            // using switch for condition
            System.out.println("choose a number between 1-3");
            int choice = sc.nextInt();
            // traditional version of using switch
            // switch (choice) {
            //     case 1:
            //         System.out.println("you are number 1");
            //         break;
            //     case 2:
            //         System.out.println("BUhahahaha");
            //         break;
            //     case 3:
            //         System.out.println("NANNANANANANAN");
            //         break;
            //     default:
            //         System.out.println("DO WHAT YOU ARE TOLD TO DO");
            //         throw new AssertionError();  
            // }
            //shorter version of switch
            switch (choice) {
                case 1 -> System.out.println("you are number 1");
                case 2 -> System.out.println("BUhahahaha");
                case 3 -> System.out.println("NANNANANANANAN");
                default -> {
                    System.out.println("DO WHAT YOU ARE TOLD TO DO");
                    throw new AssertionError();
                }
            }
        } 
    }
} 
