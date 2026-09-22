
//Write a program to read a set of integers and find the largest number among them.

import java.util.*;
public class largestNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int largest = Integer.MIN_VALUE;  // very small starting value
        do{
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num > largest){
                largest = num;
            }
        }while(true);
         System.out.println("Largest number is: " + largest);
    }  
}