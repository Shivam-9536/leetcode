// Last updated: 1/18/2026, 1:42:27 PM
class Solution {
    public int minimumSum(int num) {
        int a=num%10; num/=10;
        int b=num%10; num/=10;
        int c=num%10; num/=10;
        int d=num;
        int[] x={a,b,c,d};
        Arrays.sort(x);
        return (x[0]*10+x[2])+(x[1]*10+x[3]);
    }
}