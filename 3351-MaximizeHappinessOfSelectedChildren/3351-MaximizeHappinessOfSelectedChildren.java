// Last updated: 1/18/2026, 1:41:29 PM
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int t=k;
        int i=happiness.length-1;
        while(k>0&&i>=0){
            int val=happiness[i]-(t-k);
            if(val>0)sum+=val;
            k--;
            i--;
        }
        return sum;
    }
}