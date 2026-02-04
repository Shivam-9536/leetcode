// Last updated: 04/02/2026, 19:30:59
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int st = 0;
        int ed = letters.length-1;
        char ans = 'A';
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(letters[mid]>target){
                ans = letters[mid];
                ed = mid-1;
            }
            else{
                st=mid+1;
            }
        }
        if(ans!='A'){
            return letters[st];
        }
return letters[0];
    }
}