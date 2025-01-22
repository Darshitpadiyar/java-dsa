package _1variables;
import java.util.Scanner;

public class _3input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("my name is :"+name);
        String fullname = sc.nextLine();
        System.out.println(fullname);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
  
}
