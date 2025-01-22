package _3conditon;

import java.util.Scanner;

public class switchcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform");
        String op = sc.nextLine();
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (op) {
            case "+":
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case "-":
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case "*":
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case "/":
                System.out.println(a + "/" + b + "=" + (a / b));
                break;
            default:
                System.out.println("Enter correct operation symbol");
                break;
        }
        sc.close();
    }
}
