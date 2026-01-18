// Last updated: 1/18/2026, 1:41:04 PM
class Solution {
    public int minOperations(int[] nums, int k) {
         int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum%k;
    }
}