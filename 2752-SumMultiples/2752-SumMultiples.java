// Last updated: 1/18/2026, 1:41:58 PM
class Solution {
    public int sumOfMultiples(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                s += i;
            }
        }
        return s;
    }
}
