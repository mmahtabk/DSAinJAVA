
//Write a program to read integers until 0 is entered and find the sum of positive and negative numbers.

import java.util.Scanner;

public class negPos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sumPos = 0;
        int sumNeg = 0;

        do{
            int num = sc.nextInt();

            if(num == 0){
                break;
            }
            if(num <= 0){
                sumPos+= num;
            }else{
                sumNeg+= num;
            }
        }while(true);
        System.out.println("Sum of positive number :" + sumPos);
        System.out.println("Sum of Negative number :" + sumNeg);
    }
}