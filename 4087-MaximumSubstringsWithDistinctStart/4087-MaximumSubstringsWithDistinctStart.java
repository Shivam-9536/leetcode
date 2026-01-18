// Last updated: 1/18/2026, 1:40:55 PM
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
}