package com.leetcode.queueandstack.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaluateReversePolishNotationTest {

    @Test
    public void evalRPN1() {
        String[] input = new String[]{"2", "1", "+", "3", "*"};
        int expect = 9;

        assertEquals(expect, new EvaluateReversePolishNotation().evalRPN(input));
    }

    @Test
    public void evalRPN2() {
        String[] input = new String[]{"4", "13", "5", "/", "+"};
        int expect = 6;

        assertEquals(expect, new EvaluateReversePolishNotation().evalRPN(input));
    }

    @Test
    public void evalRPN3() {
        String[] input = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int expect = 22;

        assertEquals(expect, new EvaluateReversePolishNotation().evalRPN(input));
    }
}