package com.review.leetcode.traverseatree;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//2020-09-25
public class BinaryTreeInorderTraversal2 {

    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        if(root == null) return  inorderList;
        recursiveHelper(root, inorderList);
        return inorderList;
    }

    private void recursiveHelper(TreeNode node, List<Integer> inorderList) {
        if(node != null){

            //left subtree
            recursiveHelper(node.left, inorderList);

            inorderList.add(node.val);

            //right subtree
            recursiveHelper(node.right, inorderList);

        }

    }

    private void recursiveHelper2(TreeNode node, List<Integer> inorderList) {
            //left subtree
            if(node.left != null)recursiveHelper(node.left, inorderList);

            inorderList.add(node.val);
            //right subtree
            if(node.right != null) recursiveHelper(node.right, inorderList);


    }


    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()) {
            //find the leftmost node, store the parent node in the stack
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            //leftmost
            curr = stack.pop();
            inorderList.add(curr.val);
            curr = curr.right;

        }
        return inorderList;
    }

    public List<Integer> inorderTraversalMorris(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();

        TreeNode curr = root;

        while(curr != null) {
            if(curr.left == null) {
                inorderList.add(curr.val);
                curr = curr.right;
            }else {
                TreeNode rightMost = curr.left;
                while (rightMost.right != null) {
                    rightMost = rightMost.right;
                }

                rightMost.right = curr;
                curr = curr.left;
                rightMost.right.left = null;
            }
        }

        return inorderList;
    }
}
