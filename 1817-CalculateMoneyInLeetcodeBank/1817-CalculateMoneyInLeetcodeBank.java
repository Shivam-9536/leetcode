// Last updated: 1/18/2026, 1:42:58 PM
class Solution {
    public int totalMoney(int n) {
        int s=0,w=0;
        for(int i=0;i<n;i++){
            s+=1+w+i%7;
            if(i%7==6)w++;
        }
        return s;
    }
}