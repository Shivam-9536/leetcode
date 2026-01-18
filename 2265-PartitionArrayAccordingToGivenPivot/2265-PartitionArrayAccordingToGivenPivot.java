// Last updated: 1/18/2026, 1:42:25 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int first=0, last=nums.length-1;
        for(int x:nums) if(x<pivot) ans[first++]=x;
        for(int i=nums.length-1;i>=0;i--) if(nums[i]>pivot) ans[last--]=nums[i];
        while(first<=last) ans[first++]=pivot;
        return ans;
    }
}
