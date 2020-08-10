package com.leetcode.binarytree.conclusion;

import com.leetcode.binarytree.embed.TreeNode;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 * <p>
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 * <p>
 * Example:
 * <p>
 * You may serialize the following tree:
 * <p>
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * <p>
 * as "[1,2,3,null,null,4,5]"
 * Clarification: The above format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
 * <p>
 * Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 */
public class SerializeAndDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if (root == null) return "[]";

        StringBuffer stringBuffer = new StringBuffer("[");
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int count = 0;

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    stringBuffer.append(cur.val + ",");
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else {
                    queue.offer(null);
                    queue.offer(null);
                    count++;
                    stringBuffer.append("null,");
                }
            }

            if (count == size) {
                stringBuffer.substring(0, stringBuffer.length() - count * "null,".length());
            }

        }

        stringBuffer.append("]");
        return stringBuffer.toString();


    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if ("[]".equals(data)) return null;
        String[] nodesArray = data.substring(1, data.length() - 1).split(",");
        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode head= new TreeNode(Integer.valueOf(nodesArray[0]));
        queue.offer(head);
        int childLevelIndex = 1;

        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            TreeNode leftNode = "null".equals(nodesArray[childLevelIndex]) == true ? null : new TreeNode(Integer.valueOf(nodesArray[childLevelIndex]));
            childLevelIndex++;
            TreeNode rightNode = "null".equals(nodesArray[childLevelIndex]) == true ? null : new TreeNode(Integer.valueOf(nodesArray[childLevelIndex]));
            queue.offer(leftNode);
            queue.offer(rightNode);
            if(cur != null) {
                cur.left = leftNode;
                cur.right = rightNode;
            }
        }

        return head;

    }

}
