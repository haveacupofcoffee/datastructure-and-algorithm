package com.leetcode.recursionI.complexityanalysis;

import com.leetcode.recursionI.common.TreeNode;

/**
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 */
public class MaximumDepthOfBinaryTree {
    //non tail recursion
    public int maxDepthNonTailRecursion(TreeNode root) {
        //base case
        if(root == null) return 0;

        return Math.max(1+ maxDepthNonTailRecursion(root.left), 1+maxDepthNonTailRecursion(root.right));
    }


    //tail recursion
    public int maxDepthTailRecursion(TreeNode root) {
        //base case
        if(root == null) return 0;

        return helperTailRecursion(root, 0);
    }

    private int helperTailRecursion(TreeNode root, int preDepth) {
        if(root == null) {
            return preDepth;
        }

        return Math.max(helperTailRecursion(root.left, 1+ preDepth), helperTailRecursion(root.right, 1+ preDepth));
    }
}
