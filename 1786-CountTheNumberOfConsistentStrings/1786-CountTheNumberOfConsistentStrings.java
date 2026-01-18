// Last updated: 1/18/2026, 1:43:06 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Put allowed characters in a set
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        int count = 0;
        // For each word
        for (String w : words) {
            boolean ok = true;
            // Check each char
            for (char c : w.toCharArray()) {
                if (!set.contains(c)) {
                    ok = false;
                    break;
                }
            }
            if (ok) count++;
        }

        return count;
    }
}
