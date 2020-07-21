package com.leetcode.recursionI.memoization;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbingStairsTest {

    @Test
    public void climbStairs1() {
        int input = 2;
        int expect = 2;
        assertEquals(expect, new ClimbingStairs().climbStairs(input));
    }


    @Test
    public void climbStairs2() {
        int input = 3;
        int expect = 3;
        assertEquals(expect, new ClimbingStairs().climbStairs(input));
    }
}