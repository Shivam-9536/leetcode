// Last updated: 1/18/2026, 1:44:26 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Step 1: Sort intervals by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        // Step 2: Initialize
        int prevEnd = intervals[0][1];
        int count = 0;

        // Step 3: Traverse intervals
        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start < prevEnd) {
                // Overlap hua, remove karna padega
                count++;
            } else {
                // Overlap nahi, rakh lo
                prevEnd = end;
            }
        }

        return count;
    }
}
