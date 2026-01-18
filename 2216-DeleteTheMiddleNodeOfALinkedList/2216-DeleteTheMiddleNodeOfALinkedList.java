// Last updated: 1/18/2026, 1:42:34 PM
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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)
        return head;
        ListNode s=head;
        ListNode f=head;
        ListNode p=null;
        while(f!=null && f.next!=null){
            p=s;
            s=s.next;
            f=f.next.next;
        }
        if(p==null)
        head=null;
        else{
            p.next=s.next;
            s.next=null;
        }
        return head;
    }
}