package com.leetcode.linkedlist.classicproblems;

import com.leetcode.linkedlist.common.ListNode;

/**
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {
    // TODO: 2020-07-16 need to think O(n) time with O(1) space 
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;

        ListNode newHead = null;
        ListNode walker = head;
        while(walker != null) {
            ListNode curr = new ListNode(walker.val);
            curr.next = newHead;
            newHead = curr;
            walker = walker.next;
        }

        ListNode oldWalker = head;
        ListNode newWalker = newHead;
        while(oldWalker != null) {
            if(oldWalker.val != newWalker.val) {
                return false;
            }

            oldWalker = oldWalker.next;
            newWalker = newWalker.next;

        }

        return true;
    }
}
