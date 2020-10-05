package com.leetcode.array.inplace;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortArrayByParityTest {

    @Test
    public void sortArrayByParity() {
        int[] input = new int[]{3,1,2,4};
        int[] expect = new int[]{2,4,3,1};
        assertArrayEquals(expect, SortArrayByParity.sortArrayByParity(input));
    }

    @Test
    public void sortArrayByParityTwoPointers() {
        int[] input = new int[]{3,1,2,4};
        int[] expect = new int[]{4,2,1,3};
        assertArrayEquals(expect, SortArrayByParity.sortArrayByParityTwoPinter(input));
    }


}