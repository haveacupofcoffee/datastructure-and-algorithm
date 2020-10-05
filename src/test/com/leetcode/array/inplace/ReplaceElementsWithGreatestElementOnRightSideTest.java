package com.leetcode.array.inplace;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Example 1:
 *
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 */
public class ReplaceElementsWithGreatestElementOnRightSideTest {

    @Test
    public void replaceElements() {
        int[] arr = new int[]{17,18,5,4,6,1};
        int[] expect = new int[]{18,6,6,6,1,-1};
        assertArrayEquals(expect, ReplaceElementsWithGreatestElementOnRightSide.replaceElements(arr));
    }

    @Test
    public void replaceElementsFromRightToLeft() {
        int[] arr = new int[]{17,18,5,4,6,1};
        int[] expect = new int[]{18,6,6,6,1,-1};
        assertArrayEquals(expect, ReplaceElementsWithGreatestElementOnRightSide.replaceElementsFromRightToLeft(arr));
    }
}