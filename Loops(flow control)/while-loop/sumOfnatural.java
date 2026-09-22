import java.util.Scanner;

public class sumOfnatural{
    public static void main(String args[]){
        //Print sum of first n natural number

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i <= n){
            sum+=i;
            i++;
        }
        System.out.println("Sum is :"+ sum);
    }
}