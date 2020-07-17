package com.leetcode.linkedlist.conclusion;

import com.leetcode.linkedlist.common.ListNode;

/**
 * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {
    //Time Complexity O(m+n), m is the length of l1, n is the length of l2, Space Complexity: O（1）
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pseudoHead = new ListNode(0);
        ListNode newListTail = pseudoHead;

        ListNode walker1 = l1;
        ListNode walker2 = l2;

        while(walker1 != null && walker2 != null) {
            if(walker1.val >= walker2.val) {
                newListTail.next = walker2;
                newListTail = walker2;
                walker2 = walker2.next;
            }else {
                newListTail.next = walker1;
                newListTail = walker1;
                walker1 = walker1.next;
            }
        }

        if(walker1 != null) {
            newListTail.next = walker1;
        }else {
            newListTail.next = walker2;
        }

        return pseudoHead.next;
    }
}
