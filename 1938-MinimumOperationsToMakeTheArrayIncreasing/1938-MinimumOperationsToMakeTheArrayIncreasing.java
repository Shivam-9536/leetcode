// Last updated: 04/02/2026, 19:30:14
class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;

        for(int i = 0;i<nums.length-1;i++){
          if(nums[i+1]>nums[i]){
            continue;
          }
          ans+=nums[i]-nums[i+1]+1;
          nums[i+1] = nums[i]+1;
        }
        return ans;
    }
}