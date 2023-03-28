import java.util.*;
public class ArrayCC{
    public static int trappingRainWater(int height[]){
        int n=height.length;

        // to calculate leftmax Boundary       
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //to calculate rightmax boundary

        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2 ; i>=0 ; i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //loop
        int totaltrappedwater=0;
        for(int i=0; i<n; i++){
            //to calculate waterlevel
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            //to calculate totaltrappedwater
            totaltrappedwater+=waterlevel-height[i];
        }
        return totaltrappedwater;
    }
    public static void main(String args[]){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(height));
    }
}