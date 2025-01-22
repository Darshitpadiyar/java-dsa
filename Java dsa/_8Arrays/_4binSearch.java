package _8Arrays;

public class _4binSearch {
    public static int binarySearch(int number[],int key) {
        int start=0;
        int end=number.length-1;
    
while (start<=end) {
    int mid=(start+end)/2;
    if(number[mid]==key){
        return mid;
    }
    if(number[mid]<key){
        start=mid+1;
        
    }else{
        end=mid-1;
    }
}
return -1;
}
    public static void main(String[] args) {
        int number[]={5,6,85,24,6,432,64,75};
        int key = 432;
       System.out.println("number found at index :"+binarySearch(number, key));
    }
}
