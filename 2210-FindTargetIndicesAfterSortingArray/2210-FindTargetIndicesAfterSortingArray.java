// Last updated: 1/18/2026, 1:42:37 PM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> l=new ArrayList<>();
        int i=0;
        for(int n:nums){
            if(n==target)
            l.add(i);
            i++;
        }
        return l;
    }
}