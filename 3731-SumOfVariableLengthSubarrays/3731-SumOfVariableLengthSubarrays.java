// Last updated: 1/18/2026, 1:41:09 PM
class Solution {
    public int subarraySum(int[] nums) {
         int sum=0;
        for(int i=0;i<nums.length;i++){
            int curr=0;
            int start=i-nums[i];
            if(start<0) start=0;
            for(int j=start;j<=i;j++){
                curr+=nums[j];
            }
            sum+=curr;
        }
        return sum;
    }
}
