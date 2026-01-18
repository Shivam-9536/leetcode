// Last updated: 1/18/2026, 1:45:23 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> l=new ArrayList<>();
        long an=1;
        for(int i=1;i<rowIndex+2;i++){
            l.add((int)an);
            an=an*(rowIndex-i+1)/i;
        }
        return l;
    }
}