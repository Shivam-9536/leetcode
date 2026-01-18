// Last updated: 1/18/2026, 1:46:25 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int nums3[]=new int[n];
        for(int i=0;i<nums1.length;i++){
            nums3[i]=nums1[i];
        }
        for(int i=nums1.length;i<n;i++){
            nums3[i]=nums2[i-nums1.length];
        }   
        Arrays.sort(nums3);
        if(nums3.length%2==0)
        return (double)((nums3[(nums3.length/2)]+nums3[(n/2-1)])/2.0);
        else
        return (double)(nums3[nums3.length/2]);
        
     }
}