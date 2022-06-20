/*
Q-4). Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
*/
package com.bridgelabz;
import java.util.Scanner; //importing Scanner

public class Quadratic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients a,b,c of the quadratic equation : ");
        int a = scanner.nextInt(); //User input
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double D = b*b - 4*a*c;
        double root1 = (-b + Math.sqrt(D))/(2*a);  //Quadratic Equation
        double root2 = (-b - Math.sqrt(D))/(2*a);
        System.out.printf("The roots of the equation equation (%d)x2 + (%d)x + (%d) = 0 are \n",a,b,c);
        System.out.println(root1 + " and " + root2); //printing the roots value.
    }
}
