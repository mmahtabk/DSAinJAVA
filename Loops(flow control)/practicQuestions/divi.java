//Write a program that reads a set of integers and prints only those numbers which are not divisible by 5.

import java.util.Scanner;

public class divi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        do{
            int num = sc.nextInt();
            if(num == 0){ // break the loop
                break;
            }
            if(num % 5 == 0){ // skip those divisible by 5
                continue;
            }
             System.out.println("Number not divisible by 5"+num);

        } while(true);
    }   
}