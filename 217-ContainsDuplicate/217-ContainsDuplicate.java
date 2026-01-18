// Last updated: 1/18/2026, 1:44:48 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            return true;
        }
        return false;
    }
}