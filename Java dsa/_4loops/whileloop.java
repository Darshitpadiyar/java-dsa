package _4loops;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while ( i<=n) {
            System.out.println("hyy"+i);
            sum=sum+i;
            i++;
        }
        // reverse of a number
        int j=n;
        while (j>=1) {
            System.out.println(j);
            j--;
        }
        System.out.println("sum of all numbers is :"+sum);
        sc.close();
    }
}
