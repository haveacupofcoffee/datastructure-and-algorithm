package com.leetcode.recursionI.recurrencerelation;

/**
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList {

    public ListNode reverseListRecursively(ListNode head) {
        //base case
        if(head == null || head.next == null) return head;
        ListNode p = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return p;

    }


    public ListNode reverseListIteratively(ListNode head) {
        if (head == null) return null;
        ListNode cur = head.next;
        head.next = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }


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
    }
}
