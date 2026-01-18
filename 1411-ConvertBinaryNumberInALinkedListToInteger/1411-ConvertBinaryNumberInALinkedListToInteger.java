// Last updated: 1/18/2026, 1:43:36 PM
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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int result = 0;

        // Traverse the list and build the binary number.
        while (temp != null) {
            result = result * 2 + temp.val;
            temp = temp.next;
        }
        
        return result;
    }
}
