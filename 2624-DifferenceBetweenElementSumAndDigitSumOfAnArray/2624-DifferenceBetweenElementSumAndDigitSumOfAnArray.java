// Last updated: 1/18/2026, 1:42:04 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int d=0,e=0;
        for(int num:nums){
            e+=num;
            int temp=num;
            while (temp > 0) {
                d+=temp%10;
                temp/=10;
            }
        }
        return Math.abs(e-d);
    }
}