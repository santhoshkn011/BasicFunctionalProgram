/*
Q-5. Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:
w = 35.74 + 0.6215*t + (0.4275*t+35.75)*Math.pow(v,0.16)

Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).
*/
package com.bridgelabz;
import java.util.Scanner; //importing Scanner

public class WindChill {
    //Creating method for the WindChill, taking user input for t and v.
    public static int[] windCh(){
        Scanner sc = new Scanner(System.in);  //Make Scanner obj
        System.out.println("Enter Temperature(in Fahrenheit, t<=50) and Wind speed(in mph, 3<=v<=120): ");
        int t = sc.nextInt();  //Input Int
        int v = sc.nextInt();
        int wind[] = new int[2];   // array declaration and initialization
        wind[0]=t;
        wind[1]=v;
        return wind;
    }
    public static void main(String[] args) {
        int chill[]=windCh();  //Taking input choice, stores return value from the method.
        int t = chill[0];
        int v = chill[1];
        //the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3.
        while(t>50 || v>120 || v<3){
            chill=windCh();
            t = chill[0];
            v = chill[1];
        }
        double wc = 35.74 + 0.6215*t + (0.4275*t-35.75)*Math.pow(v,0.16); //WindChill formula
        System.out.println("The WindChill is : " + wc);
    }
}
