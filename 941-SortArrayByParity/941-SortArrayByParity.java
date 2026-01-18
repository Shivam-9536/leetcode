// Last updated: 1/18/2026, 1:44:00 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0;
        
        // Iterate through the array
        for (int j = 0; j < n; j++) {
            // If the number is even, move it to the front
            if (nums[j] % 2 == 0) {
                // Swap only if i and j are not the same
                if (i != j) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
                i++;
            }
        }
        return nums;
    }
}
