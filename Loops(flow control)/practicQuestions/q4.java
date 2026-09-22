/*
Question 4 : Write a program to print the multiplication table of a number N, entered by the
user.
*/

import java.util.*;
public class q4 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        for(int i =1; i<=10; i++){
            // int result = N*i;
            // System.out.println("Multiple of : "+ result);
            System.out.println(N+ " * " + i + " = " + N*i);

        }
        

        
    }
}