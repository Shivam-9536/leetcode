// Last updated: 1/18/2026, 1:43:54 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int n:nums){
            if(!map.add(n))
            return n;
        }
        
        return -1;
    }
}