// Last updated: 1/18/2026, 1:43:04 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] n:accounts){
            int max1=0;
            for(int n2:n){
                max1+=n2;
            }
            if(max1>max)
            max=max1;
        }
        return max;
    }
}