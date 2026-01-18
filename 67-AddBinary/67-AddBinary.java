// Last updated: 1/18/2026, 1:45:43 PM
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            // result bit is sum % 2, new carry is sum / 2
            result.append((char)('0' + (sum % 2)));
            carry = sum / 2;
        }

        if (carry != 0) {
            result.append('1');
        }

        return result.reverse().toString();
    }
}
