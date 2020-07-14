package com.leetcode.array.searching;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example 1:
 *
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * Example 2:
 *
 * Input: arr = [7,1,14,11]
 * Output: true
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 * Example 3:
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 */
public class CheckIfNAndItsDoubleExistTest {

    @Test
    public void checkIfExist1() {
        int[] arr = new int[]{10,2,5,3};
        assertTrue(CheckIfNAndItsDoubleExist.checkIfExist(arr));
    }

    @Test
    public void checkIfExist2() {
        int[] arr = new int[]{7,1,14,11};
        assertTrue(CheckIfNAndItsDoubleExist.checkIfExist(arr));
    }

    @Test
    public void checkIfExist3() {
        int[] arr = new int[]{3,1,7,11};
        assertFalse(CheckIfNAndItsDoubleExist.checkIfExist(arr));
    }
}