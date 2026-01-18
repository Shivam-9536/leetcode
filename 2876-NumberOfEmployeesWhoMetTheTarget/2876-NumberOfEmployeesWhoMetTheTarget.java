// Last updated: 1/18/2026, 1:41:54 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int n:hours){
            if(n>=target)
            c++;
        }
        return c;
    }
}