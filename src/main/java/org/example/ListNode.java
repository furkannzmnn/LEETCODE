package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public boolean hasNext(ListNode head) {
        return head != null;
    }
    public ListNode find(int val, int v) {
        if (val == v) {
            return this;
        }else
            return null;
    }

    public ListNode middleNode(ListNode head) {
      return head;
    }
}
