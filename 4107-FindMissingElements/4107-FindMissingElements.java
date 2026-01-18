// Last updated: 1/18/2026, 1:41:01 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int min=nums[0];
        int max=nums[0];
        for(int x:nums){
            set.add(x);
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i))
            l.add(i);
        }
        return l;

    }
}