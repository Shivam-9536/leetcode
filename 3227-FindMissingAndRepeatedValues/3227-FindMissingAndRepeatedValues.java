// Last updated: 1/18/2026, 1:41:39 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] r:grid){
            for(int n:r){
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        int n=grid.length*grid.length;
        int rep=0,mis=0;
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i))
            mis=i;
            else if(map.get(i)>1)
            rep=i;
        }
        return new int []{rep,mis};
    }
}