package com.leetcode.linkedlist.twopointer;

import com.leetcode.linkedlist.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * For example, the following two linked lists:

 * begin to intersect at node c1.

 * Example 1:
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
 * Output: Reference of the node with value = 8
 * Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 *
 * Example 2:
 * Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * Output: Reference of the node with value = 2
 * Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
 *
 * Example 3:
 * Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
 * Output: null
 * Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
 * Explanation: The two lists do not intersect, so return null.
 *
 * Notes:
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Each value on each linked list is in the range [1, 10^9].
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionOfTwoLinkedLists {
    /**
     * Time Complexity : O(m+n), Space Complexity : O(m) or O(n)
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNodeWithHashTable(ListNode headA, ListNode headB) {
        Set<ListNode> aSet = new HashSet<>();
        ListNode walker = headA;
        while(walker != null) {
            aSet.add(walker);
            walker = walker.next;
        }

        walker = headB;
        while(walker != null) {
            if(aSet.contains(walker)) {
                break;
            }
            walker = walker.next;
        }

        return walker;
    }

    /** Time Complexity : O(m+n), Space Complexity O(1)
     * Maintain two pointers pA and pB initialized at the head of A and B, respectively. Then let them both traverse
     * through the lists, one node at a time.
     * When pA reaches the end of a list, then redirect it to the head of B (yes, B, that's right.); similarly when
     * pB reaches the end of a list, redirect it the head of A.
     * If at any point pA meets pB, then pA/pB is the intersection node.
     * To see why the above trick would work, consider the following two lists: A = {1,3,5,7,9,11} and B = {2,4,9,11},
     * which are intersected at node '9'. Since B.length (=4) < A.length (=6), pB would reach the end of the merged
     * list first, because pB traverses exactly 2 nodes less than pA does. By redirecting pB to head A, and pA
     * to head B, we now ask pB to travel exactly 2 more nodes than pA would. So in the second iteration, they are
     * guaranteed to reach the intersection node at the same time.
     * If two lists have intersection, then their last nodes must be the same one. So when pA/pB reaches the end of
     * a list, record the last element of A/B respectively. If the two last elements are not the same one, then the two
     * lists have no intersections.
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNodeWithTwoPointer(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != null) {
            pA = pA.next;
            pB = pB.next;
            if(pB == null) {
                pB = headA;
            }
        }

        pA = headB;
        while(pA != null) {

            if(pA == pB) {
                return pA;
            }

            pA = pA.next;
            pB = pB.next;
            if(pB == null) {
                pB = headA;
            }
        }

        return null;


    }
}
