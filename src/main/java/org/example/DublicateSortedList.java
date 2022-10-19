package org.example;

public class DublicateSortedList {

    private static class ListNode {
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


        public static void main(String[] args) {
            DublicateSortedList a = new DublicateSortedList();
            ListNode L = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
            final ListNode listNode = deleteDuplicates(L);
            System.out.println();
        }

        public static ListNode deleteDuplicates(ListNode head) {
            ListNode root = head;

            if (head == null || head.next == null) {
                return head;
            }
            while (root.next != null) {
                if (root.val == root.next.val) {
                    root.next = root.next.next;
                } else {
                    root = root.next;
                }
            }
            return head;
        }
    }
}
