// arrays 
// syntax type[] arrayName = new type[size];

import java.util.*;

public class arrays {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // // 1D arrrays
        // int[] marks = new int[3]; // declaration
        // // initailization
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // // printing value
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // // printing value through for loop
        // for (int idx = 0; idx < marks.length; idx++) {
        //     System.out.println(marks[idx]);
        // }
        
        // int marks2[] = new int[5];
        // System.out.println("enter marks");
        // for (int idx = 0; idx < marks2.length; idx++) {
        //     marks2[idx] = sc.nextInt();
        // }
        // for (int idx = 0; idx < marks2.length; idx++) {
        //     System.out.println(marks2[idx]);
        // }

        // 2D arrays/matrix
        int matrix[][] = new int[3][3]; // 3x3 matrix -> declaration
        matrix[0][0] = 1; // initailization
        System.out.println(matrix[0][0]);
        System.out.println("taking inputs");
        // taking input through loop and printing the same
        for (int[] matrix1 : matrix) {
            for (int idxJ = 0; idxJ < matrix.length; idxJ++) {
                matrix1[idxJ] = sc.nextInt();
            }
        }

        // for (int idxI = 0; idxI < matrix.length; idxI++) {
        //     for (int idxJ = 0; idxJ < matrix.length; idxJ++ ) {
        //         System.out.println(matrix[idxI][idxJ]);
        //     }
        // } traditonal way of looping through a matrix

        System.out.println("print array: ");
        for (int[] matrix1 : matrix) { // newer and more efficient of looping through a matrix
            for (int idxJ = 0; idxJ < matrix.length; idxJ++) {
                System.out.println(matrix1[idxJ]);
            }
        }
    }    
}
