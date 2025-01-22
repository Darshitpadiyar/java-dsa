package _3conditon;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= sc.nextInt();
        if (age>=18) {
            System.out.println("You can drive");
         
        }else{
            if (age> 13&&age<=16) {
                System.out.println("teenage");
            }else{
            System.out.println("can't drive");
            }
        }
        sc.close();
    }
}
