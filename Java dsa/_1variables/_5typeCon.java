package _1variables;
import java.util.Scanner;

public class _5typeCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt();
        System.out.println(num);
        int a =7;
        float b=10.07f;
        b=a;
        System.out.println(b);
        a= (int)b;
        System.out.println(a);
        sc.close();
    }
}
