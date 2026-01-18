// Last updated: 1/18/2026, 1:44:18 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         ArrayList<Integer> n1=new ArrayList<Integer>();
        HashSet<Integer> set=new HashSet<>();
        for(int n: nums1){
            set.add(n);
        }
        for(int B:nums2){
            if(set.contains(B)){
                n1.add(B);
                set.remove(B);
            }
        }
        int arr[]=new int[n1.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=n1.get(i);

        }
        return arr;
    }
}