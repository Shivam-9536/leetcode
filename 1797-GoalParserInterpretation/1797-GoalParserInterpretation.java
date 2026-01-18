// Last updated: 1/18/2026, 1:43:02 PM
class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i<command.length()){
            char ch=command.charAt(i);
            if(ch=='G'){
                ans.append('G');
                i++;
            } 
            else if(ch=='('){
                if(command.charAt(i + 1)==')'){
                    ans.append('o');
                    i+=2;
                } 
                else{
                    ans.append("al");
                    i+=4;
                }
            }
        }
        return ans.toString();
    }
}
