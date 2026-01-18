// Last updated: 1/18/2026, 1:44:03 PM
class Solution{
    public int search(int[] nums, int target){
        int n=nums.length;
        int s=0;
        int e=n-1;
        while(s<=e) {
            int mid=(s+e)/2;
            if(nums[mid]==target){
                return mid;  // Return the index where the target is found
            } else if(nums[mid]<target){
                s=mid+1;
            } else{
                e=mid-1;
            }
        }
        return -1;  // Return -1 if the target is not found
    }
}