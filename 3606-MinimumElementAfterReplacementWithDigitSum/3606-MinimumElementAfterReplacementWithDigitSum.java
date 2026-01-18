// Last updated: 1/18/2026, 1:41:18 PM
class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int d=0;
            int n=nums[i];
            while(n>0){
                d+=n%10;
                n/=10;
            }
            nums[i]=d;
        }
        int min=nums[0];
        for(int n:nums){
            if(n<min)
            min=n;
        }
        return min;
    }
}