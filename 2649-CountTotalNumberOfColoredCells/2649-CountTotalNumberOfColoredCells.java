// Last updated: 1/18/2026, 1:42:01 PM
class Solution {
    public long coloredCells(int n) {
        long sum=1;
        for(int i=2; i<=n; i++){
            sum+=(i-1)*4; 
        }
        return sum;
    }
}