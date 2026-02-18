// Last updated: 18/02/2026, 21:10:50
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(pref)==0)
            c++;
        }
        return c;
    }
}