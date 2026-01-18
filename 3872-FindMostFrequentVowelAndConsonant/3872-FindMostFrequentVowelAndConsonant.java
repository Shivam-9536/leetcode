// Last updated: 1/18/2026, 1:40:53 PM
class Solution {
    public int maxFreqSum(String s) {
        int[] vow=new int[26];
        int[] con=new int[26];
        String vowels="aeiou";
        for(char ch:s.toCharArray()){
            if(vowels.indexOf(ch)>=0)
                vow[ch-'a']++;
            else
                con[ch-'a']++;
        }
        int vc=0,cc=0;
        for (int x:vow)
        vc=Math.max(vc, x);
        for (int x:con)
        cc = Math.max(cc, x);
        return vc + cc;
    }
}
