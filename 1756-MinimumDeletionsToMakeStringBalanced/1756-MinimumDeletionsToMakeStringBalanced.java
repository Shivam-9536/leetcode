// Last updated: 20/02/2026, 10:34:02
class Solution {
    public int minimumDeletions(String s) {
        int b=0;
        int del=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='b'){
                b++;
            }else{
                del=Math.min(del+1,b);
            }
        }
        return del;
    }
}