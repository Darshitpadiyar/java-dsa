package _8Arrays;
public class _6arrPair {
    public static void arrPair(int number[]){
        for (int i = 0; i < number.length; i++) {
            int current=number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.print("("+current+","+number[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={3,6,7,2,8,9,10};
arrPair(number);
    }
}