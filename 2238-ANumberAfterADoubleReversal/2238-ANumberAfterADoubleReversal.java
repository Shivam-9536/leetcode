// Last updated: 1/18/2026, 1:42:29 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int s=0;
        while(temp>0){
            s=s*10+temp%10;
            temp/=10;
        }
        int t=0;
        while(s>0){
            t=t*10+s%10;
            s/=10;
        }
        return t==num;
    }
}