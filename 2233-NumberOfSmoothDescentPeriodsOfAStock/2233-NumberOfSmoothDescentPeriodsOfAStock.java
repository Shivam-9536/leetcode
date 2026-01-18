// Last updated: 1/18/2026, 1:42:32 PM
class Solution {
    public long getDescentPeriods(int[] prices) {
        long total=0;
        int streak=0;
        for(int i=0;i<prices.length;i++){
            if(i>0&&prices[i]==prices[i-1]-1){
                streak++;
            }
            else{
                streak=1;
            }
            total+=streak;
        }
        return total;
    }
}
