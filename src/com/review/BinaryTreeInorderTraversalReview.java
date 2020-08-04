package com.review;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversalReview {
    public List< Integer > inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> inorderList = new ArrayList<>();
        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            inorderList.add(curr.val);
            curr = curr.right;
        }

        return inorderList;
    }
}
