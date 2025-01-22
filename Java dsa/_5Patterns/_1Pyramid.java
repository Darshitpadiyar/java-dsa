package _5Patterns;
public class _1Pyramid {

    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("&");
            }
            System.out.println(" ");
        }
    }
}