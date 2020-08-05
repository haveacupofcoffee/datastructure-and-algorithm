package com.review.leetcode.traverseatree;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversalReview {
    //review on 2020-08-05
    public List<Integer> inorderTraversalWithStack(TreeNode root) {

        List<Integer> inorderList = new ArrayList<>();

        if(root == null) return inorderList;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()) {
            while (curr != null) {
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
