// Last updated: 1/18/2026, 1:45:55 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int min=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min)
            break;
            if(nums[i]==min)
            min=min+1;
        }
        return min;
    }
}