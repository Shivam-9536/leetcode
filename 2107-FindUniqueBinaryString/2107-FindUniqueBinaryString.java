// Last updated: 08/04/2026, 14:38:04
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            char c=nums[i].charAt(i);
            ans.append(c=='0'?'1':'0');
        }
        return ans.toString();
    }
}