// patters 
// use i for rows and j for columns 

public class patterns {

    public static void main(String[] args) {
        //Q1 print this
        // *
        // *
        // *
        // *
        for (int i = 0; i <= 4; i++) {
            System.out.println("*");
        }
        // Q2 
        // ***
        // ***
        // ***
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*"); // dont use println as next * will move to next line
            }
            System.out.println();
        }
        // Q3
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        {
            int n = 4;
            int m = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (i == 1 || j == 1 || i == n || j == m) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        // Q4
        // *
        // **
        // ***
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Q5
        // ***
        // **
        // *
        for (int i = 3; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Q6
        //    *
        //   **
        //  ***
        {
            int p = 3;
            for (int i = 1; i <= p; i++) {
                // for loop -> space print
                for (int j = 1; j <= p-1; j++) {
                    System.out.print(" ");
                }
                // for loop -> * print
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        // Q7 
        // 1
        // 12
        // 123
        // 1234
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // same can be done with other examples
        // more advance questions
        // Q8 print a butter 
    {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= (2*(n-i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print("*");
            }
            for (int j = (2*(n-i)); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    }
}
