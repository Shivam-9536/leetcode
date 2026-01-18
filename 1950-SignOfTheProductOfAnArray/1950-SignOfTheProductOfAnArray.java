// Last updated: 1/18/2026, 1:42:50 PM
class Solution {
    public int arraySign(int[] nums) {
        int nc=0;
        for(int n:nums){
            if(n==0)return 0;
            if(n<0)nc++;
        }
        return (nc%2==0)?1:-1;
    }
}