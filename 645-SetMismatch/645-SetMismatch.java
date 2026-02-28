// Last updated: 28/02/2026, 20:21:38
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n[]=new int[2];
        Arrays.sort(nums);
        int s=(nums.length+1)*nums.length/2;
        int n2=0,s1=0;
        for(int i=0;i<nums.length;i++){
            s1+=nums[i];
            if(i<nums.length-1&&nums[i]==nums[i+1]){
                n2=nums[i];
            }
        }
        n[0]=n2;
        n[1]=n2-(s1-s);
        return n;
    }
}