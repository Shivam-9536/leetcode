// Last updated: 1/18/2026, 1:44:21 PM
class Solution {
    public void reverseString(char[] s) {
        
        Stack<Character> S=new Stack<>();
        for(int i=0;i<s.length;i++){
            S.push(s[i]);
        }
        int i=0;
        while(!S.isEmpty()){
            s[i]=S.pop();
            i++;
        }
        
    }
}