package com.leetcode.linkedlist.twopointer;

import com.leetcode.linkedlist.common.ListNode;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example:
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 *
 * Given n will always be valid.
 *
 * Follow up:
 *
 * Could you do this in one pass?
 */
public class RemoveNthNodeFromEndofList {
    //two pass
    // TODO: 2020-07-14 Need to do it in one pass
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null ) return null;
        int size = 0;
        ListNode walker = head;
        while(walker != null) {
            size++;
            walker = walker.next;
        }

        //edge case, if delete the head
        if(n == size) {
            head = head.next;
            return head;
        }

        int index = 1;
        walker = head;
        while(walker != null) {
            if(index == size - n) {
                walker.next = walker.next.next;
                break;
            }
            index++;
            walker = walker.next;
        }

        return head;

        
    }
}
