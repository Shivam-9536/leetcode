// Last updated: 1/18/2026, 1:41:14 PM
class Solution {
    public List<Integer> stableMountains(int[] arr, int threshold) {
        ArrayList<Integer> str = new ArrayList<Integer>();
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>threshold)
            str.add(i);
        }
        return str;
        
    }
}