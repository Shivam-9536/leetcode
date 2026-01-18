// Last updated: 1/18/2026, 1:46:20 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if("[{(".indexOf(s.charAt(i))>-1)
            stack.push(s.charAt(i));
            else{
                if(stack.isEmpty())
                return false;
                if((stack.peek()=='['&&s.charAt(i)==']')||(stack.peek()=='('&&s.charAt(i)==')')||(stack.peek()=='{'&&s.charAt(i)=='}')){
                    stack.pop();
                }
                else
                return false;
            }
        }
        if(stack.isEmpty())
        return true;
        else
        return false;
    }
}