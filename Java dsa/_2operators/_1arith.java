package _2operators;

import java.util.Scanner;

public class _1arith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Addition "+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("divide "+(a/b));
        System.out.println("modulo "+(a%b));
        // unary
        int c = 10;
        int d= ++c;
        int e= c++;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        sc.close();
    }
}
