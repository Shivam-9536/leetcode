// Last updated: 1/18/2026, 1:43:09 PM
class Solution {
    public int minPartitions(String n) {
        int max=Integer.MIN_VALUE;
        for(char ch:n.toCharArray()){
            int num=ch-'0';
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}