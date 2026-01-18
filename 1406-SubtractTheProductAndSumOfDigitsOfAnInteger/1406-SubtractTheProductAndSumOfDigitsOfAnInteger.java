// Last updated: 1/18/2026, 1:43:38 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int p=1;
        while(n>0){
            sum+=n%10;
            p*=n%10;
            n=n/10;
        }
        return p-sum;
    }
}