package com.leetcode.linkedlist.conclusion;

import com.leetcode.linkedlist.common.ListNode;
import org.junit.Test;

public class RotateListTest {

    @Test
    public void rotateRight() {
        ListNode head = new ListNode(0);
        ListNode secondNode = new ListNode(1);
        ListNode thirdNode = new ListNode(2);

        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = null;

        RotateList.rotateRight(head, 4);
    }
}