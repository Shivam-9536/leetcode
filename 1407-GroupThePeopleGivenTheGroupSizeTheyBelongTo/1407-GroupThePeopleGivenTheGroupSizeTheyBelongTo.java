// Last updated: 1/18/2026, 1:43:39 PM
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            int size=groupSizes[i];
            map.putIfAbsent(size,new ArrayList<>());
            map.get(size).add(i);
            if(map.get(size).size()==size){
                ans.add(map.get(size));
                map.remove(size);
            }
        }
        return ans;
    }
}