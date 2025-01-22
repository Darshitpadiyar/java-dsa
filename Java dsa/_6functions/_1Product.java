package _6functions;

import java.util.Scanner;

public class _1Product {
    public static int product (int a ,int b){
       return a*b;
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter two numbers");
      int a=sc.nextInt();
      int b= sc.nextInt();
     int ans= product(a, b);
     System.out.println(ans);
      sc.close();
    }
}
