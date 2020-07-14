package com.leetcode.linkedlist.twopointer;

import com.leetcode.linkedlist.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleIITest {

    @Test
    public void detectCycleTest1() {
        ListNode head = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        head.next = secondNode;
        ListNode thirdNode = new ListNode(0);
        secondNode.next = thirdNode;
        ListNode fourthNode = new ListNode(-4);
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;

        assertEquals(secondNode, LinkedListCycleII.detectCycle(head));
        assertEquals(secondNode, LinkedListCycleII.detectCycleWithTwoPointer(head));
    }

    @Test
    public void detectCycleTest2() {
        ListNode head = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        head.next = secondNode;
        secondNode.next = head;

        assertEquals(head, LinkedListCycleII.detectCycle(head));
        assertEquals(head, LinkedListCycleII.detectCycleWithTwoPointer(head));
    }

    @Test
    public void detectCycleTest3() {
        ListNode head = new ListNode(1);

        assertEquals(null, LinkedListCycleII.detectCycle(head));
        assertEquals(null, LinkedListCycleII.detectCycleWithTwoPointer(head));
    }


}