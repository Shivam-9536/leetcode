// Last updated: 1/18/2026, 1:45:45 PM
/*class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length==1){
            if(digits[digits.length-1]==9)
            
            
            else if{
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;}
        }
        if(digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
        return digits;}
        
            
            else{
                digits[digits.length-1]=0;
                digits[digits.length-2]=digits[digits.length-2]+1;
                return digits;
            }
        
        
    }
}*/
class Solution {
  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        ++digits[i];
        return digits;
      }
      digits[i] = 0;
    }

    int[] ans = new int[digits.length + 1];
    ans[0] = 1;
    return ans;
  }
}