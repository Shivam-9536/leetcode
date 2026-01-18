// Last updated: 1/18/2026, 1:43:33 PM
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        for(int i=0;i<=n;i++){
            int a=i;
            int b=n-i;
            String str=a+""+b;
            if(a+b==n&&!str.contains("0")){
                arr[0]=a;
                arr[1]=b;
                
                break;
            }
        }
        return arr;
    }
}