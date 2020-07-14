package com.leetcode.linkedlist.classicproblems;

import com.leetcode.linkedlist.common.ListNode;

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
    public static ListNode reverseList(ListNode head) {
        if(head == null ) return null;
        ListNode cur = head.next;
        head.next = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }
}
