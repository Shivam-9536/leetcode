// Last updated: 04/02/2026, 19:29:20
class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
        }
        while(k-->0){
            int x = pq.poll();
            pq.add(x+1);
        }
        long prod = 1;
        int mod = (int)1e9+7;
        while(pq.size()>0){
           prod = (prod*pq.poll())%mod;
        }
        return (int)(prod);
    }
}