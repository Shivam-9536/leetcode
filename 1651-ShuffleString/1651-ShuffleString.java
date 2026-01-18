// Last updated: 1/18/2026, 1:43:10 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] t=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            t[indices[i]]=s.charAt(i);
        }
        return new String(t);
    }
}