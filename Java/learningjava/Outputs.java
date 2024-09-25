
import java.util.Scanner;

// printing 
public class Outputs {

    public static void main(String[] args) {
        // normal print statement
        System.out.println("Hello, ");

        // printing the arguments that are given while running the class file
        System.out.print(args[0] + " ");
        System.out.print(args[1] + "\n");

        // printing user inputs
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: \n");
            String name1 = scanner.nextLine();
            System.out.print("Enter your favourite number: \n");
            int num = scanner.nextInt();
            System.out.print("Your name is " + name1 + "Your favourite number is " + num);

        }
    }
}
