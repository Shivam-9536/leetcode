// Last updated: 04/02/2026, 19:31:03
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String s : operations) {
            if (s.equals("+")) st.push(st.peek() + st.get(st.size() - 2));
            else if (s.equals("D")) st.push(st.peek() * 2);
            else if (s.equals("C")) st.pop();
            else st.push(Integer.parseInt(s));
        }
        int sum = 0;
        for (int x : st) sum += x;
        return sum;
    }
}