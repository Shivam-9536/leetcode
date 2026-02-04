// Last updated: 04/02/2026, 19:30:06
class Solution {
    public int minSwaps(String s) {
        int cnt=0;
        for(char x : s.toCharArray()){
            if(x=='['){
                cnt++;
            }
            else if(x==']' && cnt>0){
                cnt--;
            }
        }
        if(cnt%2==0)return cnt/2;
        return (cnt/2)+1;
    }
}