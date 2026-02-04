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

        ListNode temp=new ListNode();
        ListNode prev=temp;
        prev.next=head;
        while(prev.next!=null && prev.next.next!=null){
            ListNode p1=prev.next;
            ListNode p2=p1.next;
            p1.next=p2.next;
            p2.next=p1;
            prev.next=p2;
            prev=p1;
        }
        return temp.next;

    }
}