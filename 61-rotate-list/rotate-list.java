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
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null|| k==0 ) return head;
        ListNode temp=head;
        ListNode t1;
        int count=1;
        int x=1;
        ListNode prev;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(k%count==0) return head;
        if(k>count){
            k=k%count;
        }
        temp=head;
        while(x<count-k){
            temp=temp.next;
            x++;
        }
        t1=temp.next;
        temp.next=null;

        prev=t1;
        while(prev.next!=null){
            prev=prev.next;
        }
        prev.next=head;
        return t1;
    }
}