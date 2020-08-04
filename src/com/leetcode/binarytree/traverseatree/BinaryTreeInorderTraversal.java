package com.leetcode.binarytree.traverseatree;

import com.leetcode.binarytree.embed.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
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
 * Output: [1,3,2]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal {

    private List<Integer> inorderList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return inorderList;

        //left subtree
        inorderTraversal(root.left);

        inorderList.add(root.val);

        //right subtree

        inorderTraversal(root.right);

        return inorderList;
    }
}
