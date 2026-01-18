// Last updated: 1/18/2026, 1:44:34 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray();
        Arrays.sort(c1);
        String ss1 = new String(c1);
        char[] c2 = t.toCharArray();
        Arrays.sort(c2);
        String ss2 = new String(c2);
        if(ss1.equals(ss2))
        return true;
        else
        return false;
    }
}