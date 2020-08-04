package com.leetcode.binarytree.traverseatree;

import com.leetcode.binarytree.embed.TreeNode;
import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> levelOrderList = new ArrayList<>();

        if(root == null) return levelOrderList;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode curr = root;
        queue.offer(curr);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelValueList = new ArrayList<>();
            for(int i=0; i<size; i++) {
                curr = queue.poll();
                levelValueList.add(curr.val);
                if(curr.left != null) {
                    queue.offer(curr.left);
                }

                if(curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            levelOrderList.add(levelValueList);
        }
        return levelOrderList;
    }
}
