package _10_2DArr;

import java.util.Scanner;

public class _1basic {
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers of matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
             matrix[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to search");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
              if (matrix[i][j]==key) {
                System.out.println(i+","+j+" is the idex of the number");
              }
            }
          
        }
        sc.close();
    }
}
