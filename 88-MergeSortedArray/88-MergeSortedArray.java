// Last updated: 1/18/2026, 1:45:31 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int n1 = m+n;
        int arr[] = new int[n1];
        
        // Copy elements from a[]
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }
        
        // Copy elements from b[]
        for (int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }
        
        // Sort the combined array
        Arrays.sort(arr);
         for (int i = 0; i < n1; i++) {
            nums1[i] = arr[i];
        }
        
    }
}