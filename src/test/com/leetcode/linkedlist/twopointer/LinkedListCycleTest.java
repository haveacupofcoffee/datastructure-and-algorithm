package com.leetcode.linkedlist.twopointer;

import com.leetcode.linkedlist.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *  * Example 1:
 *  * Input: head = [3,2,0,-4], pos = 1
 *  * Output: true
 *  * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 *  *
 *  * Example 2:
 *  * Input: head = [1,2], pos = 0
 *  * Output: true
 *  * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 *  *
 *  * Example 3:
 *  * Input: head = [1], pos = -1
 *  * Output: false
 *  * Explanation: There is no cycle in the linked list.
 */
public class LinkedListCycleTest {

    @Test
    public void hasCycleTest1() {
        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        head.next = secondNode;
        ListNode thirdNode = new ListNode(0);
        secondNode.next = thirdNode;
        ListNode fourthNode = new ListNode(-4);
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;

        assertTrue(LinkedListCycle.hasCycle(head));
    }

    @Test
    public void hasCycleTest2() {
        ListNode head = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        head.next = secondNode;
        secondNode.next = head;

        assertTrue(LinkedListCycle.hasCycle(head));
    }

    @Test
    public void hasCycleTest3() {
        ListNode head = new ListNode(1);


        assertFalse(LinkedListCycle.hasCycle(head));
    }
}