
// Exception
/* Exception is an unexpected event that occurs during program execution. It 
 affects the flow of the program instructions which can cause the program to 
terminate abnormally. causes->
1. Invalid inputs 
2. Device failure
3. Loss of network
4. Physical limitation
5. code error
6. Opening an unavailable file

there are two types of exception 1. runtime exception
                                 2. IO exception
 */

public class tryCatchHandling {

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[3] = 30;
        //System.err.println(arr[8]);// this will through an error of arryy out of 
        //bound because we are trying to access an element which is not present in the array
        // and our program will end here only.

        try {
            System.out.println(arr[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Try to accessing element within the range.");
        }
        System.out.println("Prog continuesss");

        try {
            int num = 3 / 0;
            arr[8] = 9;
            System.out.println(num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array is out of bound"); // here we are having multiple catch blocks to c
            // catch all the exceptions in try block
        } catch (ArithmeticException e) {
            System.out.println(" you dividing 3/0");
            // various operation with exception object
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);
        }

        // java gives us provision to handle multiple exception in
        // one catch block by adding "|" this between exceptions
        try {
            int num = 30 / 0;
            arr[90] = 3;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("exception");
        }
        // Exception class is parent class of all the exceptions and we can simply
        // add exception class and create its object "e" to handle all the exception
        // this simplifies our code more
        // example 
        try {
        } catch (Exception e) {
        }
        // this limits our handling of different errors differently 
        System.out.println("Prog continuesss");
    }

}
