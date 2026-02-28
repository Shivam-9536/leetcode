// Last updated: 28/02/2026, 20:21:27
class Solution {
    public int binaryGap(int n) {
        int last = -1, max = 0, pos = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                if (last != -1)
                    max = Math.max(max, pos - last);
                last = pos;
            }
            n /= 2;
            pos++;
        }
        return max;
    }
}