// LOOPS
/*
1. for Loop
2. while Loop
3. do while Loop
 */

public class Loops {
    public static void main(String[] args) { 
        // for loop 
        for(int i=1;i<=10;i++) {
            System.out.println("printing count with for loop: " + i);
        }  
        // while loop
        int i = 1;
        while(i <= 10) {
            System.out.println("printing count with while loop: " + i);
            i++;
        }
        int j = 1;
        do { 
            System.out.println("printing count with do while loop: " + j);
            j++;
        } while (j <= 10);

    }
}