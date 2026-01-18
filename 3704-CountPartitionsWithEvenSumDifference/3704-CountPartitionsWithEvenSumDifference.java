// Last updated: 1/18/2026, 1:41:11 PM
class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            int sum2=0;
            sum+=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum2+=nums[j];
            }
            if((sum-sum2)%2==0) c++;
        }
        return c;
    }
}