package com.leetcode.binarytree.conclusion;

import com.leetcode.binarytree.embed.TreeNode;

public class LowestCommonAncestorOfABinaryTree {

    int lca = Integer.MAX_VALUE;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        return null;
    }

    private boolean helper(TreeNode node, TreeNode p, TreeNode q) {

        if(node == null) return false;

        if(node == p || node == q) return true;

        boolean findNodes = helper(node.left, p, q) || helper(node.right, p, q);

        if(!findNodes) return false;

        lca = Math.min(node.val, lca);

        return true;

    }
}
