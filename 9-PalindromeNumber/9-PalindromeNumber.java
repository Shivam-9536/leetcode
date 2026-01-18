// Last updated: 1/18/2026, 1:46:21 PM
class Solution {
    public boolean isPalindrome(int x) {
        int palin=0;
        int temp=x;
        while(x>0){
            palin=x%10+palin*10;
            x=x/10;
        }
        if(temp==palin)
        return true;
        else
        return false;
    }
}