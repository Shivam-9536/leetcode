// Last updated: 1/18/2026, 1:45:00 PM
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        // If no majority element is found (should not happen in LeetCode 169)
        return -1;
    }
}