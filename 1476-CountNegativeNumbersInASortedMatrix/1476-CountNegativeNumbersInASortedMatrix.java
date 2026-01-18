// Last updated: 1/18/2026, 1:43:25 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int[] num:grid){
            
            for(int i=0;i<num.length;i++){
                if(num[i]<0)c++;
            }
        }
        return c;
    }
}