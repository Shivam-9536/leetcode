// Last updated: 1/18/2026, 1:40:56 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:friends){
            // if(map.containsKey(num))
            // map.put(num,map.get(num)+1);
            // else
            map.put(num,1);
        }
        int arr[]=new int[friends.length];
        int c=0;
        for(int num:order){
            if(map.containsKey(num)){
                arr[c]=num;
                c++;
            }
            
        }
        return arr;
    }
}