package _3conditon;

import java.util.Scanner;

public class greatestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        if(a==b&&b==c){
            System.out.println("all are equal");
        }
        else if(a>=b&&a>=c){
            System.out.println(a);
        }
        else if(b>=c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    //     else if(a>b&&a>c){
    //         System.out.println(a+"is greatest");
    //     }
    //     else if(b>a&&b>c){
    //         System.out.println(b+"is greatest");
    //     }
    //     else if(c>a&&c>b){
    //         System.out.println(c+"is greatest");
    //     }
        sc.close();
    }
}
