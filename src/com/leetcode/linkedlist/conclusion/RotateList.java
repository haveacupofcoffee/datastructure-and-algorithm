package com.leetcode.linkedlist.conclusion;

import com.leetcode.linkedlist.common.ListNode;

/**
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 *
 * Example 1:
 *
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 * Example 2:
 *
 * Input: 0->1->2->NULL, k = 4
 * Output: 2->0->1->NULL
 * Explanation:
 * rotate 1 steps to the right: 2->0->1->NULL
 * rotate 2 steps to the right: 1->2->0->NULL
 * rotate 3 steps to the right: 0->1->2->NULL
 * rotate 4 steps to the right: 2->0->1->NULL
 */
public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode pseudoHead = new ListNode(0);
        pseudoHead.next = head;

        ListNode slow = pseudoHead;
        ListNode fast = pseudoHead;

        for(int i=1; i <= k; i++) {
            fast = fast.next;
            if(fast == null) {
                k = k % (i-1);
                i = 0;
                fast = pseudoHead;
                continue;
            }
        }

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if(slow == pseudoHead){
            return head;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;

    }
}
