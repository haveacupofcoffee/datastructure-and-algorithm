package com.leetcode.array.conclusion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *Example 1:
 * Input: [3, 2, 1]
 *
 * Output: 1
 *
 * Explanation: The third maximum is 1.
 * Example 2:
 * Input: [1, 2]
 *
 * Output: 2
 *
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * Example 3:
 * Input: [2, 2, 3, 1]
 *
 * Output: 1
 *
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 *
 * Example 4:
 *     [1,2,2,5,3,5]
 *     output: 2
 */
public class ThirdMaximumNumberTest {

    @Test
    public void thirdMax1() {
        int[] input = new int[]{3, 2, 1};
        int expect = 1;

        assertEquals(expect, ThirdMaximumNumber.thirdMax(input));
    }

    @Test
    public void thirdMax2() {
        int[] input = new int[]{1, 2};
        int expect = 2;

        assertEquals(expect, ThirdMaximumNumber.thirdMax(input));
    }

    @Test
    public void thirdMax3() {
        int[] input = new int[]{2, 2, 3, 1};
        int expect = 1;

        assertEquals(expect, ThirdMaximumNumber.thirdMax(input));
    }

    @Test
    public void thirdMax4() {
        int[] input = new int[]{1,2,2,5,3,5};
        int expect = 2;

        assertEquals(expect, ThirdMaximumNumber.thirdMax(input));
    }
}