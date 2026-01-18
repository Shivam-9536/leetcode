// Last updated: 1/18/2026, 1:41:41 PM
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int a:apple)sum+=a;
        Arrays.sort(capacity);
        int cnt=0;
        for(int i=capacity.length-1;i>=0;i--){
            sum-=capacity[i];
            cnt++;
            if(sum<=0)return cnt;
        }
        return cnt; 
    }
}