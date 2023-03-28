import java.util.*;
public class JavaBasics{
    public static int maxProfit(int prices[]){
        int buy=Integer.MAX_VALUE;
        int maxProfit=0;
        

        for(int i=1; i<prices.length; i++){
            if(buy <= prices[i]){
                int profit = prices[i]-buy;

                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buy=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}