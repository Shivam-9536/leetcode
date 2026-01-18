// Last updated: 1/18/2026, 1:41:22 PM
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        double minSum=Double.POSITIVE_INFINITY;
        for(int i=0;i<n/2;i++){
            minSum=Math.min(minSum,nums[i]+nums[n-1-i]);
        }
        return minSum/2.0;
    }
}