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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        int carry=0;
        while(l1!=null || l2!=null||carry!=0){
            int ans=carry;
            if(l1!=null){
                ans+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                ans+=l2.val;
                l2=l2.next;
            }
            carry=ans/10;
            cur.next=new ListNode(ans%10);
            cur=cur.next;


        }
        return dummy.next;
    }
}