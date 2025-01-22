package _4loops;

import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        while (n>0) {
            int last=n%10;
            System.out.print(last+" ");
            n/=10; //n=n/10;
        }
        System.out.println("\n Enter another number");
        int m=sc.nextInt();
        int rev=0;
        while (m>0) {
            int last = m % 10;
            rev = (rev*10)+ last;
            m/=10;
        }
        System.out.println(rev);
        sc.close();
    }
}
