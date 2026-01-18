// Last updated: 1/18/2026, 1:41:34 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        for(int n:nums){
            if(n<k)
            c++;
        }
        return c;
    }
}