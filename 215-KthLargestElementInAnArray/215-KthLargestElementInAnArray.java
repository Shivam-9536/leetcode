// Last updated: 1/18/2026, 1:44:50 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }

         }
         
         return pq.poll();
    }
}