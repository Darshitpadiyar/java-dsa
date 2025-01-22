package _1variables;
import java.util.Scanner;

public class _4sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum = a+b;
        int product = a*b;
      
        System.out.println("sum is :"+sum);
        System.out.println("product is :"+product);
        System.out.println("Enter the radius of a circle");
        int r = sc.nextInt();
        double area = 3.14*r*r;
        System.out.println("area of circle a is :"+area);
        sc.close();
    }
}
