package com.leetcode.binarytree.conclusion;

/**
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 *
 *
 *
 * Follow up:
 *
 * You may only use constant extra space.
 * Recursive approach is fine, you may assume implicit stack space does not count as extra space for this problem.
 *
 *
 * Example 1:
 *
 *
 *
 * Input: root = [1,2,3,4,5,6,7]
 * Output: [1,#,2,3,#,4,5,6,7,#]
 * Explanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
 *
 *
 * Constraints:
 *
 * The number of nodes in the given tree is less than 4096.
 * -1000 <= node.val <= 1000
 */
public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if(root == null) return null;

        Node parentLevelStart = root;
        //parentLevelStart.next = null;
        Node parentLevelWalker = parentLevelStart;

        while(parentLevelStart.left != null) {
            while (parentLevelWalker != null) {
                parentLevelWalker.left.next = parentLevelWalker.right;
                if(parentLevelWalker.next != null) {
                    parentLevelWalker.right.next = parentLevelWalker.next.left;
                }else {
                    parentLevelWalker.right.next = null;
                }
                parentLevelWalker = parentLevelWalker.next;
            }
            parentLevelStart = parentLevelStart.left;
            parentLevelWalker = parentLevelStart;
        }
        return root;
    }


    public Node connectRecursive(Node root) {
        if(root == null) return null;

        helper(root);

        return root;

    }

    private void helper(Node root) {
        if(root.left == null) return;

        Node walker = root;

        while (walker != null) {
            walker.left.next = walker.right;
            if(walker.next != null) {
                walker.right.next = walker.next.left;
            }else {
                walker.right.next = null;
            }
            walker = walker.next;
        }

        helper(root.left);
    }

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};