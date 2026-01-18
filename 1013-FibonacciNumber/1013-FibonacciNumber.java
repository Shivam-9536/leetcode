// Last updated: 1/18/2026, 1:43:52 PM
class Solution {
    public int fib(int n) {
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        return fib(n - 1) + fib(n - 2);
    }
}