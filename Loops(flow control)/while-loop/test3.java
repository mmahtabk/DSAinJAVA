import java.util.Scanner;

public class test3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number to give to print as your wise: ");
        int range = sc.nextInt();
        int counter = 1;
        
        while(counter <= range){
            System.out.print(counter +" ");
            counter++;
        }
        System.out.println();
    }
}