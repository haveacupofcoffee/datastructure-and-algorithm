package com.leetcode.binarytree.conclusion;

import com.leetcode.binarytree.embed.TreeNode;

public class LowestCommonAncestorOfABinaryTree {

    TreeNode ans  = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q);
        return ans;
    }

    private boolean helper(TreeNode node, TreeNode p, TreeNode q) {

        if(node == null) return false;

        int mid = (node == p || node == q)? 1:0;

        int left = helper(node.left,p,q)? 1:0;

        int right = helper(node.right, p, q)? 1: 0;

        if(mid + left + right >= 2) {
            ans = node;
        }

        return mid + left + right > 0;

    }


    private TreeNode helper2(TreeNode node, TreeNode p, TreeNode q) {

        if(node == null) return  null;

        if(node == p || node == q) return node;

        TreeNode ancestorInLeftSubtree = helper2(node.left, p, q);
        TreeNode ancestorInRightSubtree = helper2(node.right, p, q);

        if(ancestorInLeftSubtree != null && ancestorInRightSubtree != null) {
            return node;
        }

        return (ancestorInLeftSubtree != null) ? ancestorInLeftSubtree : ancestorInRightSubtree;

    }
}
