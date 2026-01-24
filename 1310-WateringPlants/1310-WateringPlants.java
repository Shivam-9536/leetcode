// Last updated: 1/24/2026, 2:45:22 PM
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int t=0;
        int c=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=c){
                t++;
                c=c-plants[i];
            }
            else{
                t=t+2*i+1;
                c=capacity-plants[i];
            }
        }
        return t;
    }
}