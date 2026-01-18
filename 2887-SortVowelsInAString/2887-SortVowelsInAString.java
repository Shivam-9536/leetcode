// Last updated: 1/18/2026, 1:41:52 PM
import java.util.*;

class Solution {
    public String sortVowels(String s) {
        // Step 1: collect vowels
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiouAEIOU".indexOf(c) > -1) {
                str.append(c);
            }
        }

        // Step 2: sort vowels
        char[] ch = str.toString().toCharArray();
        Arrays.sort(ch);

        // Step 3: build final string (replace vowels in order)
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiouAEIOU".indexOf(c) > -1) {
                sb.append(ch[idx++]); // take next sorted vowel
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
