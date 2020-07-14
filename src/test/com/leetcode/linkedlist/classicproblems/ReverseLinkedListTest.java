package com.leetcode.linkedlist.classicproblems;

import com.leetcode.linkedlist.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */
public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ListNode head = new ListNode(1);
        ListNode tail = head;
        for(int i=2;i<=5; i++) {
            ListNode  nextNode = new ListNode(i);
            tail.next = nextNode;
            tail = nextNode;
        }

        ListNode newHead = head;



    }
}