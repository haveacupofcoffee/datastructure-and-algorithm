package com.review.leetcode.queueandstack.conclustion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++ ) {
            Character curr = s.charAt(i);
            if(curr != ']') {
                stack.push(curr);
            }else {
                List<Character> temp = new ArrayList<>();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    temp.add(stack.pop());
                }

                //skip "["
                stack.pop();

                int k = 0;
                int m = 1;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k += (stack.pop() - '0') * m;
                    m *= 10;
                }

                while (k > 0) {
                    for (int j=temp.size()-1; j>=0; j--) {
                        stack.push(temp.get(j));
                    }
                    k--;
                }

            }
        }

        char[] result = new char[stack.size()];
        for(int i=result.length - 1; i>=0; i--) {
            result[i] = stack.pop();
        }

        return new String(result);



    }
}
