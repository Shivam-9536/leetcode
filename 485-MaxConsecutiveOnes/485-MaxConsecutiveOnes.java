// Last updated: 28/02/2026, 20:21:42
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                t++;
                max=Math.max(max,t);
            }
            else
            t=0;
        }
        return max;
    }
}