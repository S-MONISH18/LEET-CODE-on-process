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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        ListNode rabbit=head;
        ListNode tortoies=head;
       while(rabbit!=null&&rabbit.next!=null){
        tortoies=tortoies.next;
        rabbit=rabbit.next.next;
       }
       ListNode prev=null;
       ListNode next=null;
       while(tortoies!=null){
        next=tortoies.next;
        tortoies.next=prev;
        prev=tortoies;
        tortoies=next;
       }
       int sum=0;
       while(prev!=null){
        sum=Math.max(sum,head.val+prev.val);
        head=head.next;
        prev=prev.next;
       }
       return sum;
        
    }
}