package com.leetcode.binarytree.conclusion;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.Arrays;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    // TODO: 2020-08-05 Review this quesion, think a better way
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0) return null;
        if(inorder.length == 1) return new TreeNode(inorder[0]);

        TreeNode root = new TreeNode(postorder[postorder.length-1]);

        int rootValue = postorder[postorder.length - 1];
        int rootIndexInorder = 0;
        for(int i=0; i<inorder.length; i++) {
            if(inorder[i] == rootValue) {
                rootIndexInorder = i;
                break;
            }
        }

        root.left = buildTree(Arrays.copyOfRange(inorder,0 ,rootIndexInorder), Arrays.copyOfRange(postorder, 0, rootIndexInorder));
        root.right = buildTree(Arrays.copyOfRange(inorder,rootIndexInorder+1 ,inorder.length), Arrays.copyOfRange(postorder, rootIndexInorder, postorder.length-1));

        return root;
    }

}
