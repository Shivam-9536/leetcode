// Last updated: 1/18/2026, 1:44:41 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }
}