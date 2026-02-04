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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tortoise=head;
        ListNode rabbit=head;

        while(n>0){
            rabbit=rabbit.next;
            n--;
        }
        if(rabbit==null) return head.next;
        while(rabbit!=null && rabbit.next!=null){
            rabbit=rabbit.next;
            tortoise=tortoise.next;
        }
        tortoise.next=tortoise.next.next;
        return head;
    }
}