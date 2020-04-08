package com.educative.fastslowpointers;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        // TODO: Write your code here
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer) {
                return true;
            }

        }

        return false;
    }
}

