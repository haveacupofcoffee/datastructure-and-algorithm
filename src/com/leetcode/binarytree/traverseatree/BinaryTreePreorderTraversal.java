package com.leetcode.binarytree.traverseatree;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
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
 * Output: [1,2,3]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePreorderTraversal {

    private List<Integer> preorderList = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return preorderList;
        preorderList.add(root.val);

        //left subtree
        preorderTraversal(root.left );

        //right subtree
        preorderTraversal(root.right);

        return preorderList;
    }


    public List<Integer> preorderTraversalWithHelper(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();

        if(root == null) return resultList;

        helper(root, resultList);

        return resultList;

    }

    private void helper(TreeNode root, List<Integer> resultList) {

        if(root == null) return;

        resultList.add(root.val);

        //left subtree
        helper(root.left,  resultList);

        //right subtree
        helper(root.right, resultList);

    }

    //iteratively

    public List<Integer> preorderTraversalIteratively(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if(root == null) return  resultList;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            resultList.add(cur.val);

            if(cur.right != null) {
                stack.push(cur.right);
            }

            if(cur.left != null) {
                stack.push(cur.left);
            }

        }

        return resultList;

    }


}


