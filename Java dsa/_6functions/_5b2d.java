
package _6functions;
import java.util.Scanner;
public class _5b2d {
    public static void binTodec(int n) {
        int ld;
        int decimal = 0;
        int pow = 0;
        while (n > 0) {
            ld = n % 10;
            decimal = decimal + (int) (ld * Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("Decimal number =" + decimal);;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n = sc.nextInt();
     binTodec(n);
       
        sc.close();
    }
}
