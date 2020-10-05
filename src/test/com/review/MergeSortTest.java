package com.review;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Given an array of integers nums, sort the array in ascending order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,2,3,1]
 * Output: [1,2,3,5]
 * Example 2:
 *
 * Input: nums = [5,1,1,2,0,0]
 * Output: [0,0,1,1,2,5]
 */
public class MergeSortTest {

    @Test
    public void sortArray1() {
        int[] input = new int[]{5,2,3,1};
        int[] expect = new int[]{1,2,3,5};

        assertArrayEquals(expect, MergeSort.sortArray(input));
    }

    @Test
    public void sortArray2() {
        int[] input = new int[]{5,1,1,2,0,0};
        int[] expect = new int[]{0,0,1,1,2,5};

        assertArrayEquals(expect, MergeSort.sortArray(input));
    }
}