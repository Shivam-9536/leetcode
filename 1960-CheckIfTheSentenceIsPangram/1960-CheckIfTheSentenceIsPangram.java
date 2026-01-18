// Last updated: 1/18/2026, 1:42:49 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char c='a';c<='z';c++){
            if(sentence.indexOf(c)==-1) return false;
        }
        return true;
    }
}
