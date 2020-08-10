package com.leetcode.binarytree.solveproblemsrecursively;

import com.leetcode.binarytree.embed.TreeNode;

/**
 * Given a binary tree, count the number of uni-value subtrees.
 *
 * A Uni-value subtree means all nodes of the subtree have the same value.
 *
 * Example :
 *
 * Input:  root = [5,1,5,5,5,null,5]
 *
 *               5
 *              / \
 *             1   5
 *            / \   \
 *           5   5   5
 *
 * Output: 4
 */
public class CountUnivalueSubtrees {

    int count = 0;

    public int countUnivalSubtrees(TreeNode root) {
        if(root == null) return 0;

        helper(root);

        return count;
    }

    private boolean helper(TreeNode node) {

        //base case
        if(node.left == null && node.right == null) {
            count++;
            return true;
        }

        boolean isUnival = true;

        if(node.left != null) {
            isUnival = helper(node.left) && isUnival && node.left.val == node.val;
        }

        if(node.right != null) {
            isUnival = helper(node.right) && isUnival && node.right.val == node.val;
        }

        if(!isUnival) return false;

        count++;
        return true;
    }

    public int countUnivalSubtrees2(TreeNode root) {
        isUnivalSubtree(root, 0 );
        return count;
    }

    private boolean isUnivalSubtree(TreeNode node, int val) {

        if(node == null) return true;

        if(!isUnivalSubtree(node.left, node.val) | !isUnivalSubtree(node.right, node.val)) return false;

        count++;

        return node.val == val;

    }
}
