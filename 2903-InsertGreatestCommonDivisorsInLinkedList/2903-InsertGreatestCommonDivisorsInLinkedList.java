// Last updated: 1/18/2026, 1:41:57 PM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;

        while (cur != null && cur.next != null) {

            int a = cur.val, b = cur.next.val;

            // inline gcd
            while (b != 0) {
                int t = a % b;
                a = b;
                b = t;
            }

            ListNode node = new ListNode(a);
            node.next = cur.next;
            cur.next = node;

            cur = node.next;
        }

        return head;
    }
}
