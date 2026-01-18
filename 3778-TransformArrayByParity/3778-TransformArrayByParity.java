// Last updated: 1/18/2026, 1:41:08 PM
class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int even = 0;
        int odd = 0;

        for(int i=0; i<n; i++){
            if(nums[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        int i=0;

        while(even > 0){
            nums[i] = 0;
            i++;
            even--;
        }
        
        while(odd > 0){
            nums[i] = 1;
            i++;
            odd--;
        }

        return nums;
    }
}