// Last updated: 1/18/2026, 1:42:06 PM
class Solution {
    public int maximumCount(int[] nums) {
        int nc=0;
        int pc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
            pc++;
            if(nums[i]<0)
            nc++;
        }
        if(nc>pc)
        return nc;
        else
        return pc;
        
    }
}