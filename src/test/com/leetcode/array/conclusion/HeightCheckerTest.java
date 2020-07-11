package com.leetcode.array.conclusion;

import org.junit.Test;

import java.awt.event.HierarchyBoundsAdapter;

import static org.junit.Assert.*;

/**
 * Example 1:
 *
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 * Explanation:
 * Current array : [1,1,4,2,1,3]
 * Target array  : [1,1,1,2,3,4]
 * On index 2 (0-based) we have 4 vs 1 so we have to move this student.
 * On index 4 (0-based) we have 1 vs 3 so we have to move this student.
 * On index 5 (0-based) we have 3 vs 4 so we have to move this student.
 * Example 2:
 *
 * Input: heights = [5,1,2,3,4]
 * Output: 5
 * Example 3:
 *
 * Input: heights = [1,2,3,4,5]
 * Output: 0
 */
public class HeightCheckerTest {

    @Test
    public void heightChecker1() {
        int[] input = new int[]{1,1,4,2,1,3};
        int expect = 3;
        assertEquals(expect, HeightChecker.heightChecker(input));
    }

    @Test
    public void heightChecker2() {
        int[] input = new int[]{5,1,2,3,4};
        int expect = 5;
        assertEquals(expect, HeightChecker.heightChecker(input));
    }

    @Test
    public void heightChecker3() {
        int[] input = new int[]{1,2,3,4,5};
        int expect = 0;
        assertEquals(expect, HeightChecker.heightChecker(input));
    }
}