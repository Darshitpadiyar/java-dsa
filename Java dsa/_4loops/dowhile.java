package _4loops;

import java.util.Scanner;

public class dowhile {
 public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    do {
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(n);
        if (n%10==0) {
            break;
        }
    } while (true);
    int i=0;
    do {
        if (i==7) {
            break;
        }
        System.out.println("hyy"+i);

        i++;
    } while (i<=10);
    sc.close();

 }   
}
