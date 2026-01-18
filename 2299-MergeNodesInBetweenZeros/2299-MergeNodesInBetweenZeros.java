// Last updated: 1/18/2026, 1:42:15 PM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode node=head.next;
        ListNode temp=node;
        while(temp!=null){
            int sum=0;
            while(temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }
            node.val=sum;//update value
            temp=temp.next;//move temp to next block
            node.next=temp;//connect to next block
            node =temp;//move to next block
        }
        head=head.next;
        return head;
    }
}