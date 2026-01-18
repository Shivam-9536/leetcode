// Last updated: 1/18/2026, 1:45:53 PM
class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length()+num2.length();
        int[] res=new int[n];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int d1=num1.charAt(i)-'0';
                int d2=num2.charAt(j)-'0';
                int mul=d1*d2;
                int pl=i+j+1;
                int ph=i+j;
                int sum=mul+res[pl];
                res[pl]=sum%10;
                res[ph]+=sum/10;            
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int num : res) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();

    }
}