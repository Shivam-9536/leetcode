// Last updated: 04/02/2026, 19:28:43
class Solution {
    public boolean isTrionic(int[] nums) {
        int p=-1,q=-1,r=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i])
            p=i;
            else
            break;
        }
        if(p==-1) return false;
            for(int i=p+1;i<nums.length-1;i++){
            if(nums[i+1]<nums[i])
            q=i;
            else
            break;
            }
        
         if (q == -1) return false;
            for(int i=q+1;i<nums.length-1;i++){
            if(nums[i+1]>nums[i])
            r=i;
            else
            break;
        }
        
        
        return r==nums.length-2;
    }
}