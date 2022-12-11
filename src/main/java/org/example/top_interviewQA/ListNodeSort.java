package org.example.top_interviewQA;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ListNodeSort {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }

        while (head.next != null) {
            final int current = head.val;
            final int next = head.next.val;
            if (current > next) {
                head.next.val = current;
                head.val = next;
            }
        }

        return head;
    }
}
