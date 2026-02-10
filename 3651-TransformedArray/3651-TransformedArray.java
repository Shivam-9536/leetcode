// Last updated: 10/02/2026, 22:23:44
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
            ans[i]=nums[(nums[i]+i)%n];
            if(nums[i]<0)
            ans[i]=nums[(n + (nums[i] + i) % n) % n];
            if(nums[i]==0)
            ans[i]=nums[i];
            
        }
        return ans;
    }
}