// Last updated: 1/18/2026, 1:45:24 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l1=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            long an=1;
            ArrayList<Integer> l2=new ArrayList<>();
            for(int j=0;j<=i;j++){
                l2.add((int)an);
                an=an*(i-j)/(j+1);
            }
            l1.add(l2);
        }
        return l1;
    }
}