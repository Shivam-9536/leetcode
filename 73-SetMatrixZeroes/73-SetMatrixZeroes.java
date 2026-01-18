// Last updated: 1/18/2026, 1:45:37 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];

        // Step 1: Find rows and columns that need to be zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Step 2: Set cells to zero if they are in a zero row or column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}