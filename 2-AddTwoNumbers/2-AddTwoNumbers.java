// Last updated: 1/18/2026, 1:46:27 PM
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
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode d=new ListNode(0),c=d;
        int carry=0;
        while(a!=null||b!=null||carry!=0){
            int s=carry+(a!=null?a.val:0)+(b!=null?b.val:0);
            carry=s/10;
            c.next=new ListNode(s%10);
            c=c.next;
            if(a!=null)a=a.next;
            if(b!=null)b=b.next;
        }
        return d.next;
    }
}