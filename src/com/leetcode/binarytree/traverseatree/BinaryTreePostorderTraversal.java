package com.leetcode.binarytree.traverseatree;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the postorder traversal of its nodes' values.
 *
 * Example:
 *
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Output: [3,2,1]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversalRecursivley(TreeNode root) {
        List<Integer> postorderList = new ArrayList<>();
        helper(root, postorderList);
        return postorderList;
    }

    private void helper(TreeNode root, List<Integer> postorderList) {
        if(root == null) return;

        //right subtree
        helper(root.right, postorderList);

        //left subtree
        helper(root.left, postorderList);

        //add value
        postorderList.add(root.val);

    }

    //reverse the order
    public List<Integer> postorderTraversalIteratively(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> postorderList = new ArrayList<>();

        if(root == null) return postorderList;
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            postorderList.add(curr.val);
            if(curr.left != null) {
                stack.push(curr.left);
            }

            if(curr.right != null) {
                stack.push(curr.right);
            }
        }

        Collections.reverse(postorderList);
        return postorderList;
    }

    /**
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversalIteratively2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> postorderList = new ArrayList<>();

        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()) {
            //push node with right -> node -> left
            while(curr != null) {
                if(curr.right != null) stack.push(curr.right);
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            //if the rigth subtree is not processed, if not left most, means there is right subtree
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
