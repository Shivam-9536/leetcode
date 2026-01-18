// Last updated: 1/18/2026, 1:41:47 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)>=0)
            l.add(i);
        }
        return l;
    }
}