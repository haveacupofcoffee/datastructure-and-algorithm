package com.leetcode.binarytree.conclusion;

import com.leetcode.binarytree.embed.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SerializeAndDeserializeBinaryTreeTest {

    @Test
    public void serialize() {
        TreeNode head = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        head.left = two;
        head.right = three;

        three.left = four;
        three.right = five;

        String expect = "[1,2,3,null,null,4,5,null,null,null,null]";

        assertEquals(expect, new SerializeAndDeserializeBinaryTree().serialize2(head));
    }

    @Test
    public void deserialize() {
        String input = "[1,2,3,null,null,4,5]";
        System.out.println(new SerializeAndDeserializeBinaryTree().deserialize(input));
    }
}