package _6functions;

import java.util.Scanner;

public class _2fact {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int fact= factorial(n);
        System.out.println("Factorial of "+ n +" is: "+ fact);
        sc.close();
    }
}
