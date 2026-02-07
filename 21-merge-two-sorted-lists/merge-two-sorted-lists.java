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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1=list1;
        ListNode head2=list2;
        ListNode dummy=new ListNode(0);
        ListNode listnode=dummy;
        if(head1==null && head2==null) return head1;
        if(head1!=null && head2==null) return head1;
        if(head1==null && head2!=null) return head2;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                listnode.next=head1;
                head1=head1.next;

            }
            else{
                listnode.next=head2;
                head2=head2.next;
            }
            listnode=listnode.next;

        }
        if(head1!=null)
        listnode.next=head1;
        else
        listnode.next=head2;
        




        return dummy.next;

        
    }
}