// Last updated: 1/18/2026, 1:42:07 PM
class Solution {
    public int countDigits(int num) {
        int n=num;
        int count=0;
        while(n>0){
            int digit=n%10;
            n/=10;
            if(num%digit==0) {
                count++;
            }
        }
        return count;
    }
}
