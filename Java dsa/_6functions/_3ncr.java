package _6functions;

import java.util.Scanner;

public class _3ncr {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomialCof(int n,int r){
        int nfact=factorial(n);
        int rfact= factorial(r);
        int nr= n-r;
        int nrfact= factorial(nr);

        int binocof= nfact/(rfact*nrfact);
        return binocof;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r= sc.nextInt();
        int ans = binomialCof(n, r);
        System.out.println(ans);
        sc.close();
    }
}
