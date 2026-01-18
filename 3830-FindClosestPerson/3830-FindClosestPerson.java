// Last updated: 1/18/2026, 1:41:03 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z)>Math.abs(y-z))
        return 2;
        else if(Math.abs(y-z)>Math.abs(x-z))
        return 1;
        else
        return 0;
    }
}