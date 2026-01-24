// Last updated: 1/24/2026, 2:45:28 PM
class Solution {
    public int maxWidthRamp(int[] arr) {
        ArrayDeque<Integer> st  = new ArrayDeque<>();
        for(int i = 0;i<arr.length;i++){
            if(st.size()==0){
                st.push(0);
            }
            else{

            if(arr[st.peek()]>arr[i]){
                st.push(i);
            }
            }
        }
        int max = 0;
        for(int i = arr.length-1;i>=0;i--){
            while(st.size()>0&&arr[st.peek()]<=arr[i]){

                max = Math.max(max,i-st.peek());
                st.pop();
            }

            
        }
      return max;  

    }
}