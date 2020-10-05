package com.review.leetcode.traverseatree;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversalReview {
    //review on 2020-08-05
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> postorderList = new LinkedList<>();
        if(root == null) return postorderList;


        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        stack.push(curr);
        while(!stack.isEmpty()) {
            curr = stack.pop();
            postorderList.addFirst(curr.val);

            if(curr.left != null) stack.push(curr.left);
            if(curr.right != null) stack.push(curr.right);

        }

        return postorderList;
    }


    //review on 2020-08-05
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> postorderList = new ArrayList<>();
        if(root == null) return postorderList;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()) {
            //push by right-node-left
            while(curr != null) {
                if(curr.right != null) {
                    stack.push(curr.right);
                }

                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            //check the right subtree
            if(!stack.isEmpty() && curr.right == stack.peek()) {
                stack.pop();
                stack.push(curr);
                curr = curr.right;
            }else {
                postorderList.add(curr.val);
                curr = null;
            }

        }

        return postorderList;
    }
}
