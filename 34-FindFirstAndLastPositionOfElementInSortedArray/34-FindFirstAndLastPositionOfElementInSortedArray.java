// Last updated: 1/18/2026, 1:46:03 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=-1;
        int r=-1;
        int flag=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && flag==-1){
                l=i;
                r=i;
                flag=1;
            }
            else if(nums[i]==target){
                r=i;
            }
        }
        return new int[]{l,r};
    }
}