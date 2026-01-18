// Last updated: 1/18/2026, 11:01:29 PM
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> f=new HashMap<>();
        HashMap<Integer,Integer> l=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            map.put(n,map.getOrDefault(n,0)+1);
            if(!f.containsKey(n))
            f.put(n,i);
            l.put(n,i);
        }
        int max=0;
        for(int val:map.values()){
            if(val>max)
            max=val;
        }
        int ans=nums.length;
        for(int n:map.keySet()){
            if(map.get(n)==max){
                ans=Math.min(ans,l.get(n)-f.get(n));
            }
        }
        return ans+1;
    }
}