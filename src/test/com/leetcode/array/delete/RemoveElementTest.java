package com.leetcode.array.delete;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  * Example 1:
 *  *
 *  * Given nums = [3,2,2,3], val = 3,
 *  *
 *  * Your function should return length = 2, with the first two elements of nums being 2.
 *  *
 *  * It doesn't matter what you leave beyond the returned length.
 *  * Example 2:
 *  *
 *  * Given nums = [0,1,2,2,3,0,4,2], val = 2,
 *  Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 */
public class RemoveElementTest {

    @Test
    public void removeElementTest() {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int expected = 2;
        assertEquals(expected, RemoveElement.removeElement(nums, val));

    }

    @Test
    public void removeElementTest2() {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int expected = 5;
        assertEquals(expected, RemoveElement.removeElement(nums, val));

    }
}