// Last updated: 1/18/2026, 1:46:18 PM
class Solution {
    public int maxArea(int[] height) {
        int st=0;
        int end=height.length-1;
        int ans=0;
        while(st<=end){
            if(height[st]<=height[end]){
                ans=Math.max(ans,height[st]*(end-st));
                st++;
            }
            else{
                 ans=Math.max(ans,height[end]*(end-st));
                 end--;
            }
        }
         return ans;
    }
}