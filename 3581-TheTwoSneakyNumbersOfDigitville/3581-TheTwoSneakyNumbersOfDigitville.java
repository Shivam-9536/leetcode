// Last updated: 1/18/2026, 1:41:15 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
            map.put(nums[i],map.get(nums[i])+1);
            else
            map.put(nums[i],1);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue()==2)
            l.add(e.getKey());
            //System.out.println(e.getKey() + " = " + e.getValue());
         }
        int[] arr=new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            arr[i]=l.get(i);   
        }
        return arr;
        
    }
}