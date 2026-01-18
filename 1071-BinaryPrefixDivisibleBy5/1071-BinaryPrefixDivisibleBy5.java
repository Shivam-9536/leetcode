// Last updated: 1/18/2026, 1:43:51 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int curr=0;
        for(int bit:nums){
            curr=(curr*2+bit)%5;  // naya prefix value (mod 5)
            ans.add(curr==0);          // divisible by 5?
        }
        return ans;
    }
}
