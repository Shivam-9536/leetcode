// Last updated: 1/18/2026, 1:44:52 PM
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
    public ListNode reverseList(ListNode head) {

        return sol(head);
        
    }
    public ListNode sol(ListNode head){
        ListNode strt=head;

        Stack<ListNode>s=new Stack();
        ListNode temp =head;
        while(temp != null){
            s.push(temp);
            temp =temp.next;
        }
        int cnt=0;
        int size=s.size();
        while(cnt<size/2){
            temp=s.pop();
            int val=temp.val;
            temp.val=head.val;
            head.val=val;
            cnt++;
            head=head.next;
        }
        return strt;
    }
}