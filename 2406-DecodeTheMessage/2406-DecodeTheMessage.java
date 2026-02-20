// Last updated: 20/02/2026, 10:33:04
class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        int i = 0;
        for (char c : key.toCharArray())
            if (c != ' ' && map[c - 'a'] == 0)
                map[c - 'a'] = (char) ('a' + i++);
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray())
            sb.append(c == ' ' ? ' ' : map[c - 'a']);
        return sb.toString();
    }
}