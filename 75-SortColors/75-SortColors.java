// Last updated: 1/18/2026, 1:45:34 PM
class Solution {
    public void sortColors(int[] nums) {
         int a0_count=0;
        int a1_count=0;
        int a2_count=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==0)
            a0_count++;
            else if(nums[i]==1)
            a1_count++;
            else
            a2_count++;
            i++;
        }
       for(int l=0;l<a0_count;l++){
            nums[l]=0;}
        for(int j=a0_count;j<(a0_count+a1_count);j++){
            nums[j]=1;
        }
        for(int k=(a0_count+a1_count);k<nums.length;k++){
            nums[k]=2;
        }
    }
}