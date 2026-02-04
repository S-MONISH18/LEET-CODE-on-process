# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        t=head
        while (t and t.next):
            data=t.val
            t.val=t.next.val
            t.next.val=data
            t=t.next.next

        return head
        