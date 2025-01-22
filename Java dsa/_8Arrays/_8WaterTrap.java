package _8Arrays;

public class _8WaterTrap {
    public static int Trap(int height[]) {
        int n=height.length;
        int trapWater=0;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
   for (int i = 1; i <n; i++) {
    leftmax[i]=Math.max(leftmax[i-1],height[i]);
   }

   for (int i = n-2; i>=0; i--) {
    rightmax[i]=Math.max( rightmax[i+1],height[i]);

   }
   for (int i = 0; i < n; i++) {
    int waterlevel=Math.min(leftmax[i], rightmax[i]);
  trapWater+= waterlevel-height[i];
   }

return trapWater;
    }
  public static void main(String[] args) {
    int height[]={2,5,3,4,6,3,2,7};
    int totalWater=Trap(height);
    System.out.println(totalWater);
  }  
}
