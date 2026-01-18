// Last updated: 1/18/2026, 1:43:59 PM
class Solution {
    public static int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
         
        int[] ans = new int[n+m];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if (nums1[i] > nums2[j]){
                ans[k] = nums2[j];
                k++;
                j++;
            }
            else{
                ans[k] = nums1[i];
                k++;
                i++;
            }
        } 
        while(j<m){
            ans[k] = nums2[j];
            k++;
            j++;
        } 
        while(i<n){
            ans[k] = nums1[i];
            k++;
            i++;
        }
        return ans;
    }

    public static int[] sort(int arr[],int s,int e){
        if(s == e){
            int ans[] = new int[1];
            ans[0] = arr[s];
            return ans;
        }

        int mid = (s+e)/2;
        
        int[] x = sort(arr,s,mid);
        int[] y = sort(arr,mid+1,e);

        return merge(x,y);
    }
    public int[] sortArray(int[] nums) {
     return sort(nums,0,nums.length-1);   
    }
}