package com.leetcode.queueandstack.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        String input = "()";
        assertTrue(new ValidParentheses().isValid(input));
    }


    @Test
    public void isValid2() {
        String input = "()[]{}";
        assertTrue(new ValidParentheses().isValid(input));
    }


    @Test
    public void isValid3() {
        String input = "(]";
        assertFalse(new ValidParentheses().isValid(input));
    }


    @Test
    public void isValid4() {
        String input = "([)]";
        assertFalse(new ValidParentheses().isValid(input));
    }

    @Test
    public void isValid5() {
        String input = "{[]}";
        assertTrue(new ValidParentheses().isValid(input));
    }
}