package _3conditon;

import java.util.Scanner;

public class ternery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
       String s = ((num%2)==0) ?"even":"odd";
       System.out.println(s);
       //student pass or fail
       int marks= sc.nextInt();
       String result = (marks>=33)? "Pass":"Fail";
       System.out.println(result);
       sc.close();
    }
}