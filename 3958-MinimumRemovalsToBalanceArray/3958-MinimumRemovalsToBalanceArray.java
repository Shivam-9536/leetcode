// Last updated: 10/02/2026, 22:23:38
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int t=0;
        int min=nums[0];
        if(max<= (long)min*k)
        return 0;

        int j=0;

        for(int i=0;i<nums.length;i++){
            while(j<nums.length&&nums[j]<=(long)nums[i]*k){
                j++;
            }
            t=Math.max(t,j-i);
        }

        return nums.length-t;
    }
}