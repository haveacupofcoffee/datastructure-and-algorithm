package com.leetcode.queueandstack.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s == null || "".equals(s)) return true;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map= new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            }else {
                if(stack.isEmpty()) return false;
                char c = stack.pop();
                if(Character.compare(map.get(c), s.charAt(i)) != 0) return false;
            }
        }

        return stack.isEmpty();


    }
}
