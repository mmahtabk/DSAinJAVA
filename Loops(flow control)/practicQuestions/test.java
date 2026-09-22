import java.util.Scanner;

public class test {
    public static void main(String args[]){
        //Display all numbers enter by user except multiples of 10.

        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter a number : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }

            System.out.println("Number is  : " + n);
        }while(true);
    }
}