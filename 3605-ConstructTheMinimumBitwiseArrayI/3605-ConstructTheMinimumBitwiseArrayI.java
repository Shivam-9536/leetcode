// Last updated: 1/21/2026, 9:37:11 PM
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];
        for(int i=0;i<nums.size();i++) {
            int x=nums.get(i);
            if(x==2)
                ans[i]=-1;
            else{
                int b=1;
                while((x&b)!=0) b<<=1;
                ans[i]=x^(b>>1);
            }
        }
        return ans;
    }
}