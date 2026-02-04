// Last updated: 04/02/2026, 19:30:51
class Solution {
    public int minAddToMakeValid(String s) {
        int op=0,cl=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                op++;
            }
            else if(i==')' &&op>0){
                op--;
            }
            else{
                cl++;
            }
        }
        return op+cl;
    }
} 