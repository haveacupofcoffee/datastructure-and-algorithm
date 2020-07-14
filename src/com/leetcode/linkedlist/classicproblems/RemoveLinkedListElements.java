package com.leetcode.linkedlist.classicproblems;

import com.leetcode.linkedlist.common.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */
public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        if(head == null) return  null;
        //delete head
        while(head != null && head.val == val) {
            head  = head.next;
        }

        if(head == null) return null;

        ListNode walker = head;
        while(walker.next != null) {
            if(walker.next.val == val) {
                walker.next = walker.next.next;
            }else {
                walker = walker.next;
            }
        }

        return head;
    }

    public static ListNode removeElementsTwoPointer(ListNode head, int val) {
        if(head == null) return  null;
        //delete head
        while(head != null && head.val == val) {
            head  = head.next;
        }

        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null) {
            if(fast.val != val) {
                slow.next = fast;
                slow = fast;
            }

            fast = fast.next;
        }
        slow.next = null;

        return head;
    }
}
