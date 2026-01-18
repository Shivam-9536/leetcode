// Last updated: 1/18/2026, 1:46:06 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

     int i =0;int j = 1;
     while(j<n){
        if(nums[i]!=nums[j]){
            i++;
            nums[i]=nums[j];
        }
        j++;
     }
     return i+1; 
    }
}