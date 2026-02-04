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
    public ListNode swapPairs(ListNode head) {
        // ListNode temp=head;
        // int d;

        // ListNode tadd=head;
        // while(temp!=null&& temp.next!=null){
        //     tadd=temp;
        //     temp=temp.next;
        //     temp.next=tadd;
        //     temp=temp.next.next;

        // }
        // return head;
        if(head==null||head.next==null) return head;

        ListNode extra=new ListNode();
        extra.next=head;
        ListNode d=extra;
        while(d.next!=null && d.next.next!=null){
            ListNode f=d.next;
            ListNode s=d.next.next;
            d.next=s;
            f.next=s.next;
            s.next=f;
            d=d.next.next;
        }
        return extra.next;

    }
}