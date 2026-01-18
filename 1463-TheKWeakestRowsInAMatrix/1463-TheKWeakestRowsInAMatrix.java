// Last updated: 1/18/2026, 1:43:29 PM
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] count = new int[m][2]; // [soldierCount, index]

        for (int i = 0; i < m; i++) {
            int soldiers = 0;
            for (int num : mat[i]) {
                if (num == 1) soldiers++;
                else break; // because rows are sorted (all 1s then 0s)
            }
            count[i][0] = soldiers;
            count[i][1] = i;
        }

        Arrays.sort(count, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0]; // sort by soldiers
            return a[1] - b[1];                  // tie → sort by index
        });

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = count[i][1];
        return ans;
    }
}
