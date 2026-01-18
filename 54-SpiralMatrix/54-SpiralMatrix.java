// Last updated: 1/18/2026, 1:45:46 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         ArrayList<Integer> res=new ArrayList<>();
        int scol=0,ecol=matrix[0].length-1;
        int srow=0,erow=matrix.length-1;
        while(scol<=ecol && srow<=erow){
        for(int i=scol;i<=ecol;i++){
            res.add(matrix[srow][i]);
        }
        
        for(int i=srow+1;i<=erow;i++){
            res.add(matrix[i][ecol]);
        }
        
        for(int i=ecol-1;i>=scol;i--){
            if(erow==srow)
            break;
            res.add(matrix[erow][i]);
        }
        
        for(int i=erow-1;i>=srow+1;i--){
            if(ecol==scol)
            break;
            res.add(matrix[i][scol]);
        }
        scol++;srow++;ecol--;erow--;
        }
        return res;
    }
}