// Last updated: 04/02/2026, 19:28:55
class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        String str="qwertyuiopasdfghjklzxcvbnm";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(str.indexOf(ch)>-1)
            st.push(ch);
            else if(!st.isEmpty())
            st.pop();
        }
        StringBuilder s1=new StringBuilder();
        while(!st.isEmpty()){
            s1.append(st.pop());
        }
        s1.reverse();
        return s1.toString();
    }
}