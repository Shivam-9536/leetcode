// Last updated: 1/18/2026, 1:46:26 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int t=0,l=0,i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                set.remove(s.charAt(t));
                t++;
            }
            else{
                set.add(ch);
                l=Math.max(set.size(),l);
                i++;
            }
        }
        return l;
    }
}