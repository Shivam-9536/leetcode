// Last updated: 1/18/2026, 1:42:09 PM
class Solution {
    public int bestClosingTime(String customers) {
        int best=0,cur=0,time=0;
        for(int i=0;i<customers.length();i++){
            cur += customers.charAt(i)=='Y'?1:-1;
            if(cur>best){
                best=cur;
                time=i+1;
            }
        }
        return time;
    }
}