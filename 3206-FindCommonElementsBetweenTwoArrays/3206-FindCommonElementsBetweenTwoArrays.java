// Last updated: 1/18/2026, 1:41:40 PM
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();

        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
        }
        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);           
        }
        int c1=0;
        int c2=0;
        for(int n:nums1){
            if(map.containsKey(n)){
            c1++;
            }
        }
        for(int n:nums2){
            if(map1.containsKey(n)){
                c2++;
            }
        }
        return new int[]{c1,c2};
    }
}