
/*
Question 2 : Write a program that reads a set of integers, and then prints the sum of the
even and odd integers.
*/

import java.util.*;
public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evenTotal = 0;
        int oddTotal = 0;
        do{
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num % 2== 0){
                evenTotal +=num;
            }else{
                oddTotal +=num;
            }
        }while(true);
        System.out.println("Sum of even numbers: " + evenTotal);
        System.out.println("Sum of odd numbers: " + oddTotal);
    }
}