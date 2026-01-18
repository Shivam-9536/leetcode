// Last updated: 1/18/2026, 1:42:17 PM
class Solution {
    public int countEven(int num) {
        int sumOfDigits = sumDigits(num);
        
        if (sumOfDigits % 2 == 0) {
            return num / 2;
        } else {
            return (num - 1) / 2;
        }
    }
    
    private int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }
        
        return num % 10 + sumDigits(num / 10);
    }
}
/*class Solution {
    public int countEven(int num) {
        int result=0;
        if(num==0)
        return 0;
        
        result=num%10 + countEven(num/10);
        
        
      if(result%2==0)
      return num/2;
      else
      return (num-1)/2; 
        
    }
}*/