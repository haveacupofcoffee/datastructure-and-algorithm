package com.leetcode.queueandstack.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 *
 * Note:
 *
 * Division between two integers should truncate toward zero.
 * The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.
 * Example 1:
 *
 * Input: ["2", "1", "+", "3", "*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * Example 2:
 *
 * Input: ["4", "13", "5", "/", "+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * Example 3:
 *
 * Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
 * Output: 22
 * Explanation:
 *   ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> operators = new HashSet<>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");

        int result = 0;

        for(int i=0; i<tokens.length; i++) {
            if(operators.contains(tokens[i])) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                result = helper(op1,op2, tokens[i]);
                stack.push(result);
            }else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }

    private int helper(int op1, int op2, String operator) {
        if("+".equals(operator)) {
            return op1 + op2;
        }else if("-".equals(operator)) {
            return op1 - op2;
        }else if("*".equals(operator)) {
            return op1 * op2;
        }else{
            return op1 / op2;
        }
    }


}
