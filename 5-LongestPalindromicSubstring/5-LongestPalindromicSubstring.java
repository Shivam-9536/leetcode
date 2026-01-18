// Last updated: 1/18/2026, 1:46:22 PM
class Solution {
    public String longestPalindrome(String s) {
        int max=0,st=0,en=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPal(s,i,j)==true){
                    if((j-i+1)>max){
                        max=j-i+1;
                        st=i;
                        en=j;
                    }
                }
            }
        }
        return s.substring(st,en+1);
    }
    public boolean isPal(String s,int i,int j){
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2)
            return false;
            i++;
            j--;
        }
        return true;
    }
}