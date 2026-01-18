// Last updated: 1/18/2026, 1:42:47 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int ans[] = new int[26];
        for(int i = 0;i<s.length();i++){
            int ch = s.charAt(i)-'a';
            ans[ch]++;

        }
    
        for(int i = 0;i<s.length()-1;i++){
            int ch = s.charAt(i)-'a';
            int ch2 = s.charAt(i+1)-'a';

           if(ans[ch]!=ans[ch2]){
            return false;
           }

    }
        return true;
}
}