package com.leetcode.queueandstack.conclusion;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    private Stack<Integer> stack;

    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {
        stack = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack.isEmpty()) {
            stack.push(x);
        }else {
            Stack<Integer> tempStack = new Stack<>();
            while (!stack.isEmpty()){
                tempStack.push(stack.pop());
            }

            stack.push(x);
            while (!tempStack.isEmpty()){
                stack.push(tempStack.pop());
            }
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
