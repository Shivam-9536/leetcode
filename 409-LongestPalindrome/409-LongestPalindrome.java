// Last updated: 1/18/2026, 1:44:15 PM
class Solution {
    public int longestPalindrome(String s) {
        int[] freq=new int[128]; //ASCII chars
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        int c=0;
        for(int val:freq){
            c+=val/2*2;
        }
        return c<s.length()?c+1:c;
    }
}