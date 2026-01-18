// Last updated: 1/18/2026, 1:44:53 PM
class Solution {
    public int countPrimes(int n) {
        int c = 0;
        if(n<2){
            return 0;
        }
        boolean arr[] = new boolean[n];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        for(int i = 2;i*i<n;i++){
            if(arr[i]){
                for(int j = 2*i;j<n;j+=i){
                    arr[j] = false;
                }
            }
        }
        for(boolean num:arr){
            if(num){
                c++;
            }
        }
        return c;
    }
}