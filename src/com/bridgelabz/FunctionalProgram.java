/*
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.
 */
package com.bridgelabz;
import java.util.Scanner; //importing Scanner

public class FunctionalProgram {
    public static void main(String args[]) {
        //Determining rows and columns of 2D array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int M = sc.nextInt();
        System.out.println("Enter number of columns");
        int N = sc.nextInt();
        int twoD[][] = new int[M][N];
        //Assigning the values to the 2D array
        System.out.println("Enter the elements of the Array.");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                twoD[i][j] = sc.nextInt();
        }
        //Printing 2D array
        System.out.println("The 2D array is");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
