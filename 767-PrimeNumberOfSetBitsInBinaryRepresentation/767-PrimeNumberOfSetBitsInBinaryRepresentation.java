// Last updated: 28/02/2026, 20:21:30
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            // prime check yahi pe
            if (bits >= 2) {
                boolean prime = true;
                for (int j = 2; j * j <= bits; j++) {
                    if (bits % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) count++;
            }
        }
        return count;
    }
}