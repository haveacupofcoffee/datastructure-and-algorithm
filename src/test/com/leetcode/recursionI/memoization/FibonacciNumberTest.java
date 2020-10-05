package com.leetcode.recursionI.memoization;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example 1:
 *
 * Input: 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * Example 2:
 *
 * Input: 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * Example 3:
 *
 * Input: 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 */
public class FibonacciNumberTest {

    @Test
    public void fib1() {
        int N = 2;
        int expect = 1;
        assertEquals(expect, FibonacciNumber.fib(N));
    }

    @Test
    public void fib2() {
        int N = 3;
        int expect = 2;
        assertEquals(expect, FibonacciNumber.fib(N));
    }

    @Test
    public void fib3() {
        int N = 4;
        int expect = 3;
        assertEquals(expect, FibonacciNumber.fib(N));
    }

    @Test
    public void fib4() {
        int N = 2;
        int expect = 1;
        assertEquals(expect, FibonacciNumber.fibWithRecursion(N));
    }

    @Test
    public void fib5() {
        int N = 3;
        int expect = 2;
        assertEquals(expect, FibonacciNumber.fibWithRecursion(N));
    }

    @Test
    public void fib6() {
        int N = 4;
        int expect = 3;
        assertEquals(expect, FibonacciNumber.fibWithRecursion(N));
    }
}