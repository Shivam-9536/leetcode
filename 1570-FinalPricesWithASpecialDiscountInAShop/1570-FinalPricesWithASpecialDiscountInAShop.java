// Last updated: 04/02/2026, 19:30:29
class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                prices[i]=prices[i]-prices[j];
                break;}
            }
        }
        return prices;
    }
}