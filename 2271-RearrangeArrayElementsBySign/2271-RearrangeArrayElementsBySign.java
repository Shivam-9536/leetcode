// Last updated: 1/18/2026, 1:42:20 PM

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0, negIndex = 1;

        for (int i =0;i<nums.length ;i++) {
            if (nums[i] > 0) {
                result[posIndex] = nums[i];
                posIndex += 2; // Move to the next positive slot
            } else {
                result[negIndex] = nums[i];
                negIndex += 2; // Move to the next negative slot
            }
        }

        return result;
    }
}