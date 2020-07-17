package com.leetcode.linkedlist.conclusion;

import com.leetcode.linkedlist.common.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode pseudoHead = new ListNode(0);
        ListNode newListTail = pseudoHead;

        ListNode walker1 = l1;
        ListNode walker2 = l2;
        int quotient = 0;
        while(walker1 != null || walker2 != null || quotient != 0) {
            int val1 = walker1 == null ? 0 : walker1.val;
            int val2 = walker2 == null ? 0 : walker2.val;
            int sum = val1 + val2 + quotient;
            quotient = sum / 10;
            int mod = sum % 10;
            ListNode newNode = new ListNode(mod);
            newListTail.next = newNode;
            newListTail = newNode;
            walker1 = walker1 == null ? null : walker1.next;
            walker2 = walker2 == null ? null : walker2.next;
        }

        return pseudoHead.next;
    }
}
