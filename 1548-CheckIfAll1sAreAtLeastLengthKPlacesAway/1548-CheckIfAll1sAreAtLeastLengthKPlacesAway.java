// Last updated: 1/18/2026, 1:43:19 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = - (k + 1);  // so first 1 always passes

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                // check gap between this 1 and previous 1
                if (i - prev - 1 < k) {
                    return false;
                }
                prev = i; // update last 1 position
            }
        }
        return true;
    }
}
