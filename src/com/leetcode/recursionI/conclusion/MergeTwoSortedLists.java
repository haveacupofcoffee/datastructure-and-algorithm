package com.leetcode.recursionI.conclusion;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = l1.val <= l2.val ? l1 : l2;
        ListNode nextRecursionHead = head.next;

        head.next = l1.val <= l2.val ? mergeTwoLists(nextRecursionHead, l2):mergeTwoLists(l1, nextRecursionHead);

        return head;

    }
}

class ListNode {
    int val;
     ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
