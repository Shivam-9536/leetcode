// Last updated: 1/18/2026, 1:42:03 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[]=new int[nums.length];
        int rightSum[]=new int[nums.length];
        int array[]=new int[nums.length];
        int prefix = 0;
        int suffix = 0;
        if(nums.length<=1){
            array[0]=0;
            
        }
        
        else{
            for(int i=0;i<nums.length;i++){
                if(i>0){
                 prefix += nums[i - 1];}
                 leftSum[i] = prefix;
            }
            for(int j=nums.length-1;j>=0;j--){
                if(j<nums.length-1)
                suffix += nums[j + 1];
                rightSum[j] = suffix;
            }
            for(int k=0;k<nums.length;k++){
                array[k]=Math.abs(leftSum[k]-rightSum[k]);
            }

        }
        return array;
        
    }
}