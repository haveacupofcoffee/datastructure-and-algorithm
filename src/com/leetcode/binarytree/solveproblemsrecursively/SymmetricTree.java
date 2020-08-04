package com.leetcode.binarytree.solveproblemsrecursively;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode leftTree, TreeNode rightTree) {
        if(leftTree == null && rightTree == null) return true;
        if(leftTree == null || rightTree == null) return false;
        if(leftTree.val != rightTree.val) return false;

        return helper(leftTree.left, rightTree.right) & helper(leftTree.right, rightTree.left);
    }

    public boolean isSymmetriciteratively(TreeNode root) {
        if(root == null) return true;

        List<TreeNode> leftList = new ArrayList<>();
        List<TreeNode> rightList = new ArrayList<>();
        leftList.add(root.left);
        rightList.add(root.right);

        while(!leftList.isEmpty()) {
            int size = leftList.size();
            for(int i= 0, j = size -1; i<size; i++, j--) {

            }

        }

        return false;

    }
}
