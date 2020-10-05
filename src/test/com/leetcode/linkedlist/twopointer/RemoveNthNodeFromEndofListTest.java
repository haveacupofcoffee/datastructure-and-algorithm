package com.leetcode.linkedlist.twopointer;

import com.leetcode.linkedlist.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  * Example:
 *  *
 *  * Given linked list: 1->2->3->4->5, and n = 2.
 */
public class RemoveNthNodeFromEndofListTest {

    // TODO: 2020-07-14 This test has problem , it's not right  
    @Test
    public void removeNthFromEnd() {
        ListNode head = new ListNode(1);
        ListNode tail = head;
        for(int i=2; i<=5;i++) {
            ListNode cur = new ListNode(i);
            tail.next = cur;
            tail = cur;
        }

        ListNode newHead = head;
        ListNode newTail = newHead;
        for(int i=2; i<=5;i++) {
            if(i != 4) {
                ListNode cur = new ListNode(i);
                newTail.next = cur;
                newTail = cur;
            }

        }

        assertEquals(newHead, RemoveNthNodeFromEndofList.removeNthFromEnd(head, 2));
    }
}