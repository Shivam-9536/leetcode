// Last updated: 1/18/2026, 1:44:43 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int arr[]=new int[c];
        ListNode ekor=head;
        for(int i=0;i<arr.length;i++){
            arr[i]=ekor.val;
            ekor=ekor.next;
        }
        for(int i=0;i<c/2;i++){
            if(arr[i]!=arr[c-1-i])
            return false;
        }
        return true;
        
    }
}