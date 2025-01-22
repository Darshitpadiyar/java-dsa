package _9Sorting;

public class _3InsertionSort {
    public static void InsertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" "); 
        }
    }
    public static void main(String[] args) {
        int arr[]={3,3,8,5,7,6,9,1};
        InsertionSort(arr);
    }
}
