// Last updated: 1/18/2026, 1:45:19 PM
class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase();
        StringBuilder sb  =  new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(((int)ch>=97 && (int)ch <=122) || ((int) ch>=48 && (int) ch<=57)){
                sb.append(ch);
            }
        }
        String k = sb.toString();
        if(k.equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }
}