// Last updated: 1/18/2026, 1:44:14 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int k=0;
        int w=0;
        while(k<g.length && w<s.length){
            if(s[w]>=g[k]){
                k++;
                
            }
            
                w++;
            
        }
        return k;
    }
}