package com.leetcode.binarytree.solveproblemsrecursively;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

        Queue<TreeNode> leftQueue = new LinkedList<>();
        Queue<TreeNode> rightQueue = new LinkedList<>();
        leftQueue.offer(root.left);
        rightQueue.offer(root.right);

        while(!leftQueue.isEmpty()) {
            int size = leftQueue.size();
            for(int i=0; i < size; i++) {
                TreeNode node = leftQueue.poll();
                TreeNode symmetricNode = rightQueue.poll();
                if(node == null && symmetricNode == null) continue;
                if(node == null || symmetricNode == null) return false;
                if(node.val != symmetricNode.val) return false;
                if(node != null) {
                    leftQueue.offer(node.left);
                    leftQueue.offer(node.right);
                }

                if(symmetricNode != null) {
                    rightQueue.offer(symmetricNode.right);
                    rightQueue.offer(symmetricNode.left);
                }

            }

        }

        return true;

    }
}
