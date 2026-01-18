// Last updated: 1/18/2026, 1:43:22 PM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] target=new int[nums.length];
        for(int i=0;i<list.size();i++){
            target[i]=list.get(i);
        }
        return target;
    }
}