// Last updated: 04/02/2026, 19:30:42
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<min)
            min=arr[i+1]-arr[i];
        }
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min){
                List<Integer> t=new ArrayList<>();
                t.add(arr[i]);
                t.add(arr[i+1]);
                l.add(t);
            }
            
        }
        return l;
    }
}