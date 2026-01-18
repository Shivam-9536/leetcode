// Last updated: 1/18/2026, 1:44:44 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> l =new ArrayList<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int max=nums.length/3;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
           if( e.getValue()>max)
           l.add(e.getKey());
        }
        return l;
    }
}