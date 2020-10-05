package com.leetcode.binarytree.solveproblemsrecursively;

import com.leetcode.binarytree.embed.TreeNode;

/**
 *
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        //base case
        if(root == null) return 0;

        return helperTopDown(root, 0);
    }

    private int helperTopDown(TreeNode root, int depth) {
        int answer = 0;
        if(root == null) return 0;
        if(root.left != null && root.right != null) answer = Math.max(answer, depth);

        helperTopDown(root.left, depth+1);
        helperTopDown(root.right, depth+1);

        return answer;
    }

    public int maxDepthBottomUp(TreeNode root) {
        return helperBottonUp(root);
    }

    private int helperBottonUp(TreeNode root) {

        if(root == null) return 0;

        int leftDepth  = helperBottonUp(root.left);
        int rightDepth = helperBottonUp(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

}
