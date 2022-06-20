/* Q-3. Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
*/
package com.bridgelabz;
import java.util.Scanner; //importing Scanner

public class Distance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the co-ordinates (x,y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double distance = (double)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));  //Using Math.pow and Math.sqrt functions
        System.out.printf("The Euclidean Distance of the point(%d,%d) from origin is = ",x,y);
        System.out.println(Math.round(distance)+" Units"); //Math.round() method
    }
}
