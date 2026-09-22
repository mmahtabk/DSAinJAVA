//Write a program that reads a set of integers and finds the average of all even numbers.

import java.util.Scanner;

public class averageOfEvenNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int evenCount = 0;

        do{
            int num = sc.nextInt();

            if(num == 0){   //break a loop
                break;
            }
            if(num % 2 != 0){   //skip odd
                continue;
            }
                evenSum+=num;
                evenCount++;

        }while(true);
        if(evenCount > 0){
            int averageOfEven = evenSum / evenCount;
            System.out.println("Total even numbers : " + evenCount);
            System.out.println("Average of even numbers : " + averageOfEven);
        }else{
             System.out.println("No even numbers entered.");
        }



    }
}