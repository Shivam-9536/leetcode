// Last updated: 1/18/2026, 1:42:31 PM
class Solution {
    public int minSwaps(int[] nums) {
        int c1=0;
        for(int n:nums){
            if(n==1)
            c1++;
        }
        int cur0=0;
        for(int i=0;i<c1;i++){
            if(nums[i]==0)
            cur0++;
        }
        int min0=cur0;
        int s=0;
        int e=c1-1;
        while(s<nums.length){
            if(nums[s]==0)
            cur0--;
            s++;
            e++;
            if(nums[e%nums.length]==0)
            cur0++;
            min0=Math.min(min0,cur0);
        }
        return min0;
    }
}