// Last updated: 1/18/2026, 1:43:44 PM
class Solution {
    public int sumFourDivisors(int[] nums) {
        int s=0;
        for(int i:nums){
            int c=0,t=0;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    c++;
                    t+=j;
                    if (j!=i/j){
                        c++;
                        t+=i/j;
                    }
                }
            }
            if(c==4)
            s+=t;
        }
        return s;

    }
}