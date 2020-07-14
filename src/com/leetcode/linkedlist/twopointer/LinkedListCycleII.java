package com.leetcode.linkedlist.twopointer;

import com.leetcode.linkedlist.common.ListNode;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycleII {
    //use map
    public static ListNode detectCycle(ListNode head) {
        ListNode walker = head;
        int pos = 0;
        Map<ListNode, Integer> seen = new HashMap<>();
        while (walker != null) {
            if(seen.containsKey(walker)) {
                return walker;
            }else {
                seen.put(walker, pos++);
                walker = walker.next;
            }
        }
        return null;
    }

    //use two pointers
    public static ListNode detectCycleWithTwoPointer(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            if(fast == slow) {
                return fast;
            }
            slow = slow.next;
        }
        return  null;
    }


}
