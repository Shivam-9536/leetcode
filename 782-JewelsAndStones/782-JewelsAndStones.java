// Last updated: 1/18/2026, 1:44:06 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int c=0;
        for(int i=0;i<stones.length();i++){
            if(map.containsKey(stones.charAt(i)))
            c++;
        }
        return c;
    }
}