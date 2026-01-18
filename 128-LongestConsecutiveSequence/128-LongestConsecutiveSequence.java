// Last updated: 1/18/2026, 1:45:16 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        return sol(nums);
        
    }
    public int sol(int arr[]){
        Arrays.sort(arr);
        int i=0;
        int ans=0;
        int cnt=1;
        while(i<arr.length-1){
            if(arr[i+1]-arr[i]==1){
                cnt+=1;

            }
            else if(arr[i]-arr[i+1]==0)
            {

            }
            else{
                ans=Math.max(ans,cnt);
                cnt=1;
            }
            i++;
        }
        ans=Math.max(cnt,ans);
        return ans;
    }
}