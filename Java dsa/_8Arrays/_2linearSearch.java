package _8Arrays;

public class _2linearSearch {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
  public static void main(String[] args) {
    int  number[]={1,4,7,34,65,35,67,87};
    int key=87;
    int ans=linearSearch(number, key);
    if (ans==-1) {
        System.out.println("Number not found in the array");
    }else{
        System.out.println("Number is at index:"+ans);
    }

  }  
}
