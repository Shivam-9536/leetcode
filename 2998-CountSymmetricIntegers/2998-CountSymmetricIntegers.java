// Last updated: 1/18/2026, 1:41:49 PM
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            int len = s.length();
            if (len % 2 != 0) continue;
            int half=len/2;
            int s1=0,s2 =0;
            for(int j=0;j<half;j++){
                s1+=s.charAt(j)-'0';
            }
            for(int j=half;j<len;j++){
                s2+=s.charAt(j)-'0';
            }
            if(s1==s2) count++;
        }
        return count;
    }
}
