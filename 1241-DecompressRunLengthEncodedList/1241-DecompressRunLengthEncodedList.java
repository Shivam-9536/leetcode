// Last updated: 1/18/2026, 1:43:46 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int f=nums[i];
            int v=nums[i+1];
            for(int j=0;j<f;j++){
                l.add(v);
            }
        }
        int[] r=new int[l.size()];
        for(int i=0;i<l.size();i++){
            r[i]=l.get(i);
        }
        return r;
    }
}
