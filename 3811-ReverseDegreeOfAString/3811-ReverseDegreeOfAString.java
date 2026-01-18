// Last updated: 1/18/2026, 1:41:06 PM
class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(26-(s.charAt(i)-'a'))*(i+1);
        }
        return sum;
    }
}