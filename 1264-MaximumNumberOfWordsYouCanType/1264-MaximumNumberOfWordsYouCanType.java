// Last updated: 1/18/2026, 1:43:45 PM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" "); // split by space
        int c=0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<brokenLetters.length();i++){
            set.add(brokenLetters.charAt(i));
        }
        for(String w : words) {
            boolean  check = true;
           for(int j = 0;j<w.length();j++){
            if(set.contains(w.charAt(j))){
                check = false;
                break;
            }
           }
           if(check)
            c++;

        }
        return c;
    }
}