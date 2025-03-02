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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode curr = head;  // The current node in the iteration
        ListNode prev = null;  // The previous node
        
        while (curr != null) {
            if (prev != null && curr.val == prev.val) {
                prev.next = curr.next;  // Remove the duplicate
            } else {
                prev = curr;  // Only move prev if no removal happened
            }
            curr = curr.next;  // Move to the next node
        }
        
        return head;
    }
}
