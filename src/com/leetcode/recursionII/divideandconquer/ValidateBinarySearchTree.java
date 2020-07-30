package com.leetcode.recursionII.divideandconquer;

import com.leetcode.recursionII.common.TreeNode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 *
 * Example 1:
 *
 *     2
 *    / \
 *   1   3
 *
 * Input: [2,1,3]
 * Output: true
 * Example 2:
 *
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 *
 * Input: [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return helper(root);
    }


    private boolean helper(TreeNode root ) {
        //base case
        if(root == null) return true;

        if(root.left != null && root.left.val > root.val) return false;
        if(root.right != null && root.right.val < root.val) return false;

        if(!helper(root.left)) return false;
        if(!helper(root.right)) return false;

        return true;

    }
}
