import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int minBuy = prices.get(0);
        int maxProfit = 0;

        for (int index = 0; index < prices.size(); index++) {
            int cost = prices.get(index) - minBuy;
            maxProfit = Math.max(maxProfit, cost);
            minBuy = Math.min(minBuy, prices.get(index));
        }
        return maxProfit;
    }
}
