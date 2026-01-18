// Last updated: 1/18/2026, 1:45:21 PM
class Solution {
    public int maxProfit(int[] prices) {
     int minbuy = Integer.MAX_VALUE;
     int max = 0;
     for(int i =0;i<prices.length;i++){
        minbuy = Math.min(prices[i],minbuy);
        max  = Math.max(max,prices[i]-minbuy);
     } 
     return max;  
    }
}