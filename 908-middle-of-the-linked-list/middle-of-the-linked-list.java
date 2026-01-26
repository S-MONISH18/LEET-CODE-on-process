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
    public ListNode middleNode(ListNode head) {
        ListNode rabbit=head;
        ListNode tortoise=head;
        while(rabbit!=null && rabbit.next!=null){
            rabbit=rabbit.next.next;
            tortoise=tortoise.next;

        }
        return tortoise;
    }
}