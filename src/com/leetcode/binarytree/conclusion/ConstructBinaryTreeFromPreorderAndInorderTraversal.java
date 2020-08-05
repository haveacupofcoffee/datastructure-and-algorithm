package com.leetcode.binarytree.conclusion;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.Arrays;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    // TODO: 2020-08-05 Review this quesion, think a better way
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(inorder.length == 0) return null;
        if(inorder.length == 1) return new TreeNode(inorder[0]);

        TreeNode root = new TreeNode(preorder[0]);
        int rootIndexInorder = 0;
        for(int i=0; i<inorder.length;i++) {
            if(inorder[i] == root.val) {
                rootIndexInorder = i;
                break;
            }
        }

        root.left = buildTree(Arrays.copyOfRange(preorder, 1,rootIndexInorder+1), Arrays.copyOfRange(inorder,0,rootIndexInorder));
        root.right = buildTree(Arrays.copyOfRange(preorder, rootIndexInorder+1, preorder.length), Arrays.copyOfRange(inorder, rootIndexInorder+1, inorder.length));

        return root;

    }
}
