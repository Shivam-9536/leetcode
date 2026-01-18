// Last updated: 1/18/2026, 1:43:24 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> l=new ArrayList<>();
        int max=0;
        for(int n:candies){
            if(n>max)
            max=n;
        }
        for(int m:candies){
            if(m+extraCandies>=max)
            l.add(true);
            else
            l.add(false);
        }
        return l;
    }
}