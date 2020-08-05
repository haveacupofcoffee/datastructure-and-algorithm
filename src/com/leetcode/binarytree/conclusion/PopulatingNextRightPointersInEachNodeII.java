package com.leetcode.binarytree.conclusion;

public class PopulatingNextRightPointersInEachNodeII {
    public Node connect(Node root) {
        if(root == null) return null;

        Node parentLevelStart = root;
        Node parentLevelWalker = parentLevelStart;
        Node childLevelWalker  = null;

        while (parentLevelStart != null) {

            while(parentLevelWalker != null) {
                if(parentLevelWalker.left != null || parentLevelWalker.right != null) {
                    childLevelWalker = parentLevelWalker.left != null? parentLevelWalker.left : parentLevelWalker.right;
                    parentLevelStart = childLevelWalker;
                    if(childLevelWalker == parentLevelWalker.left && parentLevelWalker.right != null) {
                        childLevelWalker.next = parentLevelWalker.right;
                        childLevelWalker = childLevelWalker.next;

                    }
                    parentLevelWalker = parentLevelWalker.next;
                    break;
                }
                parentLevelWalker = parentLevelWalker.next;
            }

            if(childLevelWalker == null) {
                break;
            }

            while (parentLevelWalker != null) {
                if(parentLevelWalker.left != null) {
                    Node next =  parentLevelWalker.left;
                    childLevelWalker.next = next;
                    childLevelWalker = next;
                }

                if(parentLevelWalker.right != null) {
                    Node next =  parentLevelWalker.right;
                    childLevelWalker.next = next;
                    childLevelWalker = next;
                }

                parentLevelWalker = parentLevelWalker.next;
            }

            childLevelWalker = null;
            parentLevelWalker = parentLevelStart;



        }

        return root;


    }
}
