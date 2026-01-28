class Solution {
        public ListNode deleteMiddle(ListNode head) {
                ListNode slow = head;
                        ListNode fast = head;
                                ListNode prev = null;
                                        while (fast != null && fast.next != null){
                                                    prev = slow;
                                                                slow = slow.next;
                                                                            fast = fast.next.next;
                                                                                    }
                                                                                            if (prev == null){
                                                                                                        head = head.next;
                                                                                                                }
                                                                                                                        else {
                                                                                                                                prev.next = slow.next;
                                                                                                                                        slow.next = null;
                                                                                                                                                }
                                                                                                                                                        return head;
                                                                                                                                                            }
                                                                                                                                                            }
