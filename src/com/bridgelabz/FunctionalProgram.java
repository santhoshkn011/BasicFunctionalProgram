/*
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.
 */
package com.bridgelabz;
import java.util.Scanner; //importing Scanner
import java.util.Arrays;  //Import arrays

public class FunctionalProgram {
    public static void main(String[] args) {
        int numberOfTriplets = 0; //Initially number of triplets whose sum is 0 is 0.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in the array: "); //Number of elements in array.
        int N = sc.nextInt();
        int tri[] = new int[N];
        System.out.println("Enter the elements in the array: "); //Entering the elements in array.
        for (int i=0; i<N;i++){
            tri[i]=sc.nextInt();
        }
        System.out.println("The Array of integers is "+ Arrays.toString(tri));
        //calculating number of triplets
        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    if (tri[i]+tri[j]+tri[k] == 0) {
                        System.out.print(tri[i] + " " + tri[j] + " " + tri[k]+"\n");
                        numberOfTriplets++;
                    }
                }
            }
        }
        System.out.println("Number of triples = "+numberOfTriplets);
    }
}
