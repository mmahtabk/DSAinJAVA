import java.util.*;

public class test{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String type = (marks >= 33)?"Pass":"Fail";
        System.out.println(type);
    }
}