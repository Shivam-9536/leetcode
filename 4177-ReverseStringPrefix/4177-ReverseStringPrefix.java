// Last updated: 1/25/2026, 10:09:07 PM
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=k-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        sb.append(s.substring(k));
        return sb.toString();
    }
}