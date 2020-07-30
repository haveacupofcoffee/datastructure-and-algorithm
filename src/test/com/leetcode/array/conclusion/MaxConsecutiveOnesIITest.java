package com.leetcode.array.conclusion;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import static org.junit.Assert.*;

/**
 * Input: [1,0,1,1,0]
 * Output: 4
 * Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
 *     After flipping, the maximum number of consecutive 1s is 4.
 */
public class MaxConsecutiveOnesIITest {

    @Test
    public void findMaxConsecutiveOnes() {
        int[] input = new int[]{1,0,1,1,0};
        int expect = 4;

        assertEquals(expect, MaxConsecutiveOnesII.findMaxConsecutiveOnes(input));
    }
}