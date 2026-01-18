// Last updated: 1/18/2026, 1:43:13 PM
class Solution {
    public int numSub(String s) {
        long ans = 0;
        long count = 0;
        long mod = 1_000_000_007;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;                    // 1s ka block badhao
            } else {
                ans += count * (count + 1) / 2; // block ka contribution
                ans %= mod;
                count = 0;                  // reset
            }
        }

        // last block agar 1 pe end hua ho
        ans += count * (count + 1) / 2;
        ans %= mod;

        return (int) ans;
    }
}
