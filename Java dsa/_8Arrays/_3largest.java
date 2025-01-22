package _8Arrays;

public class _3largest {
    public static void getLargest(int number[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if (number[i]>largest) {
                largest=number[i];
            }
            if(number[i]<smallest){
                smallest=number[i];
            }
        }
        System.out.println("largest number of the array is:"+largest);
        System.out.println("smallest number in the array is :"+smallest);
    }
   public static void main(String[] args) {
    int number[]={3,7,47,5,62,46};
 getLargest(number);
   } 
}
