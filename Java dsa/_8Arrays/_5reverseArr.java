package _8Arrays;

public class _5reverseArr {
    public static void revArr(int number[]){
        int start=0;
        int end=number.length-1;
        while (start<end) {
            int temp=number[start];
            number[start]=number[end];
           number[end]=temp;
           start++;
           end--;
        }
        for(int i=0;i<=number.length-1;i++){
            System.out.print(number[i]+" ");
        }
    }
    public static void main(String[] args) {
        int number[]={46,64,76,13,46,74,68,3,66,6,86,42};
revArr(number);
    }
}
