// Last updated: 1/18/2026, 1:41:45 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }    
            else{
                map.put(nums[i],1);                                         
            }
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            int m=map.get(nums[i]);
            if(max<m)
            max=m;

        }
        int c=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(max==e.getValue())
            c=c+max;
        }
        return c;
        
    }
}