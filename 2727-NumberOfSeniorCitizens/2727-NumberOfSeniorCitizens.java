// Last updated: 1/18/2026, 1:42:00 PM
class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String n:details){
            int c1=n.charAt(n.length()-4)-'0';
            int c2=n.charAt(n.length()-3)-'0';
            int s=c1*10+c2;
            if(s>60)
            c++;
        }
        return c;
    }
}