// Last updated: 08/04/2026, 14:38:01
class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int c = encodedText.length() / rows;
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < c; j++)
            for (int i = 0; i < rows && j + i < c; i++)
                res.append(encodedText.charAt(i * c + j + i));
        return res.toString().stripTrailing();
    }
}