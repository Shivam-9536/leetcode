// Last updated: 04/02/2026, 19:30:22
class Solution {
    public int maxDepth(String s) {
        int currentDepth=0; // abhi kitne andar hain
        int maxDepth=0;// sabse zyada kitna andar gaye
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                currentDepth++;// ek level andar
                maxDepth = Math.max(maxDepth, currentDepth);
            }
            if(ch==')'){
                currentDepth--;                 // ek level bahar
            }
        }
        return maxDepth;
    }
}