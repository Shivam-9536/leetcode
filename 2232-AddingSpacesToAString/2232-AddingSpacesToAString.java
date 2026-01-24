// Last updated: 1/24/2026, 10:49:10 PM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder st= new StringBuilder();
        int c=0;
        for(int i=0;i<spaces.length;i++){
            st.append(s.substring(c,spaces[i]));
            st.append(' ');
            c=spaces[i];
        }
        st.append(s.substring(spaces[spaces.length-1]));
        return st.toString();
    }
}