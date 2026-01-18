// Last updated: 1/18/2026, 1:41:24 PM
class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(t.indexOf(ch)>-1)
            sum=sum+Math.abs(i-t.indexOf(ch));
        }
        return sum;
    }
}