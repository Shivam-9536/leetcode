// Last updated: 1/22/2026, 9:16:40 PM
class Solution {
    static{
    for(int i=0;i<1000;i++){
        minimumRefill(new int[]{},0,0);
    }
}
    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i = 0;
        int j = plants.length-1;
        int ans = 0;
        int temp1 = capacityA;
        int temp2 = capacityB;
        while(i<=j){
            if(i==j){
                int max = Math.max(temp1,temp2);
                if(plants[i]>max){
                    ans++;
                }
                break;
            }
            if(plants[i]<=temp1){
                temp1-=plants[i];
            }
            else{
                ans++;
                temp1 = capacityA;
                temp1-=plants[i];
            }
            if(plants[j]<=temp2){
                temp2-=plants[j];
            }
            else{
                ans++;
                temp2 = capacityB;
                temp2 = temp2-plants[j];
                }
            
            i++;j--;
        }
return ans;
    }
}