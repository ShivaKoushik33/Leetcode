/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode MS(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = Middle(head);
        // System.out.println(mid.val);

        ListNode right = mid;
      

        ListNode left = MS(head);
        right = MS(right);

        return Merge(left, right);

    }

    public ListNode Merge(ListNode left, ListNode right) {
        ListNode curr = new ListNode(0);
        ListNode temp = curr;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        while (left != null) {
            temp.next = left;
            left=left.next;
            temp=temp.next;
        } while(right!=null) {
            temp.next = right;
            right=right.next;
            temp=temp.next;

            
        }

        return curr.next;
    }

    public ListNode Middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev=null;
        while (fast != null && fast.next != null) {
            prev=slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev!=null){
            prev.next=null;
        }
        return slow;

    }

    public ListNode sortList(ListNode head) {

        return MS(head);

    }
}