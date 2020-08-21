package com.leetcode.queueandstack.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 * Example 1:
 *
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 *
 * Output
 * [null,null,null,null,-3,null,0,-2]
 *
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 *
 *
 * Constraints:
 *
 * Methods pop, top and getMin operations will always be called on non-empty stacks.
 */
public class MinStack {

    private List<Node> data;

    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<>();
    }

    public void push(int x) {
       //first push
        Node node;
        if(data.size() == 0) {
            node = new Node(x, x);
        }else {
            node = new Node(Math.min(x, data.get(data.size() - 1).min), x);
        }

        data.add(node);
    }

    public void pop() {
        data.remove(data.size() - 1);
    }

    public int top() {
        return data.get(data.size() - 1).val;
    }

    public int getMin() {
        return data.get(data.size() - 1).min;
    }

    class Node {
        int min;
        int val;

        Node(int min, int val) {
            this.min = min;
            this.val = val;
        }
    }



}
