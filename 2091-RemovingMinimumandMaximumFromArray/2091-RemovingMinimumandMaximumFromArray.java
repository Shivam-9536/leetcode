// Last updated: 02/09/2026, 17:03:02
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int min=Integer.MAX_VALUE;  
4        int max=Integer.MIN_VALUE;
5        int mni=-1;  
6        int mxi=-1;
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]>max){
9                max=nums[i];
10                mxi=i;
11            }
12            if(nums[i]<min){
13                min=nums[i];
14                mni=i;
15            }
16        }
17        int front = Math.max(mxi,mni)+1;
18        int back = nums.length-Math.min(mxi,mni);
19        int both = Math.min(mxi,mni)+1+ nums.length-Math.max(mxi,mni);
20        return Math.min(front,Math.min(back,both));
21    }
22}