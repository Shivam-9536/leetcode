// Last updated: 08/04/2026, 14:36:04
class Solution {
    public int firstMatchingIndex(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                return i;
            }
            i++;
            j--;
        }
        return -1;
    }
}