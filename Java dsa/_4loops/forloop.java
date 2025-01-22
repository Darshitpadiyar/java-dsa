package _4loops;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=10;i++){
            System.out.println(i);
        } 
        System.out.println("Enter a number");
        int n = sc.nextInt();
        // square pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
              System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
   
}
