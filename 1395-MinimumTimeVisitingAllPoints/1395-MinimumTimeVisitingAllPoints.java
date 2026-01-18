// Last updated: 1/18/2026, 1:43:41 PM
class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int t=0;
        for(int i=1;i<p.length;i++)
            t+=Math.max(Math.abs(p[i][0]-p[i-1][0]),Math.abs(p[i][1]-p[i-1][1]));
        return t;
    }
}