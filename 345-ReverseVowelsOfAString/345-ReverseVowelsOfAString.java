// Last updated: 1/18/2026, 1:44:20 PM
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String k ="aeiouAEIOU";
        int st=0;
        int end=s.length()-1;
        while(st<end){
            if(k.indexOf(arr[st])!=-1&&k.indexOf(arr[end])!=-1){
                char temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;
                end--;
            }
            else if(k.indexOf(arr[st])!=-1&&k.indexOf(arr[end])==-1){
                end--;
            }
            else if(k.indexOf(arr[st])==-1&&k.indexOf(arr[end])!=-1){
                st++;
            }
            else{
                st++;
                end--;
            }
        }
        return new String(arr);
    }
}