/*
Question 3 : Write a Java program to input week number(1-7) and print day of week name
using switch case
*/

import java.util.*;

public class q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (1 - 7): ");
        int week = sc.nextInt();
        


        switch (week){
            case '1' : System.out.println("Sunday");
            case '2' : System.out.println("Monday");
            case '3' : System.out.println("Tuesday");
            case '4' : System.out.println("Wednesday");
            case '5' : System.out.println("Thursday");
            case '6' : System.out.println("Friday");
            case '7' : System.out.println("Saturday");
            default:
                    System.out.println("Invalid input! Please enter week number between1-7.");
        }


    }
}