// Last updated: 1/18/2026, 1:42:54 PM
class Solution {
    public boolean check(int[] nums) {
        int peakCount = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] < nums[i-1])peakCount++;
        }
        if(nums[nums.length - 1] > nums[0])peakCount++;
            if(peakCount<=1)return true;
            else return false;
        }
        
    }