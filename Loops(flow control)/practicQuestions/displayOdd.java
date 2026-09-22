//Write a program to read integers until 0 is entered and display only odd numbers.

import java.util.Scanner;

public class displayOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Enter a odd number");
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num % 2 == 0){
                continue;
            }else{
                System.out.println("this is a odd number : "+num);
            }
        }while(true);
    }  
}