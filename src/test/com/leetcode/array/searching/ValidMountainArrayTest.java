package com.leetcode.array.searching;

import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Example 1:
 *
 * Input: [2,1]
 * Output: false
 * Example 2:
 *
 * Input: [3,5,5]
 * Output: false
 * Example 3:
 *
 * Input: [0,3,2,1]
 * Output: true
 *
 */
public class ValidMountainArrayTest {

    @Test
    public void validMountainArray1() {
        int[] input = new int[]{2, 1};
        boolean expect = false;
        assertEquals(expect, ValidMountainArray.validMountainArray(input));
    }

    @Test
    public void validMountainArray2() {
        int[] input = new int[]{3, 5, 5};
        boolean expect = false;
        assertEquals(expect, ValidMountainArray.validMountainArray(input));
    }

    @Test
    public void validMountainArray3() {
        int[] input = new int[]{0, 3, 2, 1};
        boolean expect = true;
        assertEquals(expect, ValidMountainArray.validMountainArray(input));

    }
}