package _9Sorting;

public class _1bubbleSort {
    public static void bubble(int number[]) {
        for (int i = 0; i < number.length-1; i++) {
            for (int j = 0; j < number.length-1-i; j++) {
                if (number[j]>number[j+1]) {
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
    }
    public static void main(String[] args) {
        int number[]={4,6,2,3,7};
bubble(number);
    }
}
