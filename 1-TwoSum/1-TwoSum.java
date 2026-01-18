// Last updated: 1/18/2026, 1:46:29 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int c=target-nums[i];
            if (map.containsKey(c)) {
                // Pair mil gaya: nums[i] + c = target
                return new int[]{map.get(c), i};
            }
            map.put(nums[i], i); // Current element store karo
        }
        return new int[]{}; // agar pair na mile
    }
}
