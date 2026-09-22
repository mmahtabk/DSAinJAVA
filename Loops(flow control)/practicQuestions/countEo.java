import java.util.Scanner;

public class countEo {
    public static void main(String args[]){
        //Write a program that reads a set of integers and counts how many are even and how many are odd.

        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;


        do{
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }while(true);
        System.out.println("Total number of even count : " + evenCount);
        System.out.println("Total number of even count : " + oddCount);

    }
}