// Last updated: 1/18/2026, 1:44:56 PM
class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int s = 0;
            for (; n > 0; n /= 10) {
                int d = n % 10;
                s += d * d;
            }
            n = s;
        }
        return n == 1;
    }
}