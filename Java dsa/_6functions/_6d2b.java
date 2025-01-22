package _6functions;

import java.util.Scanner;

public class _6d2b {
    public static void decTobin(int n){
        int binNum=0;
        int pow=0;
        while (n>0) {
            int rem=n%2;
           binNum = binNum+(rem*(int)Math.pow(10,pow ));
           pow++;
           n=n/2;
           
        }
        System.out.println("Binary number ="+binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        decTobin(n);
        sc.close();
    }
}
