package _6functions;

import java.util.Scanner;

public class _4isPrime {
    public static boolean prime(int n){
        boolean isprime=true;
        if (n==2) {
            isprime = true;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0) {
                    isprime=false;
                    break;
                }
               
             }
        }
       return isprime;
    }
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if (prime(i)) {
               System.out.print(i+" "); 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        primeRange(n);
        sc.close();
     
    }
}
