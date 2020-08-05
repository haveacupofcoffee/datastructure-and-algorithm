package com.leetcode.linkedlist.conclusion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 *
 * Return a deep copy of the list.
 *
 * The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
 *
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if it does not point to any node.
 *
 *
 * Example 1:
 *
 *
 * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Example 2:
 *
 *
 * Input: head = [[1,1],[2,1]]
 * Output: [[1,1],[2,1]]
 * Example 3:
 *
 *
 *
 * Input: head = [[3,null],[3,0],[3,null]]
 * Output: [[3,null],[3,0],[3,null]]
 * Example 4:
 *
 * Input: head = []
 * Output: []
 * Explanation: Given linked list is empty (null pointer), so return null.
 *
 *
 * Constraints:
 *
 * -10000 <= Node.val <= 10000
 * Node.random is null or pointing to a node in the linked list.
 * Number of Nodes will not exceed 1000.
 */
public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {

        Map<Node, Node> deepCopyNodes = new HashMap<>();
        Node pseudoHead = new Node(0);
        Node newTail = pseudoHead;

        Node walker = head;
        while(walker != null) {
            Node newNode = new Node(walker.val);
            newNode.random = walker.random;
            newTail.next = newNode;
            deepCopyNodes.put(walker, newNode);
            newTail = newNode;
            walker = walker.next;
        }

        walker = pseudoHead.next;
        while(walker != null) {
            walker.random = deepCopyNodes.get(walker.random);
            walker = walker.next;
        }

        return pseudoHead.next;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}