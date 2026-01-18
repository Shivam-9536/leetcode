// Last updated: 1/18/2026, 1:43:31 PM
class Solution {
    public int maximum69Number (int num) {
        int t=num,p=1,a=0;
        while(t>0){
            if(t%10==6)a=3*p;
            t/=10;
            p*=10;
        }
        return num+a;
    }
}