// Last updated: 1/18/2026, 1:41:43 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=0;
        int t=x;
        while(t>0){
            s+=t%10;
            t/=10;
        }
        if(x%s==0)
        return s;
        else
        return -1;    }
}