// Last updated: 20/02/2026, 10:35:39
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i += 2*k){
            int end = Math.min(i + k , s.length());
            for(int j = end - 1; j >= i; j--){
                ans.append(s.charAt(j));
            }
            int next = Math.min(i + 2*k , s.length());
            for(int j = end; j < next; j++){
                ans.append(s.charAt(j));
            }
        }
        return ans.toString();
    }
}