package com.leetcode.array.conclusion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * Example:
 *
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [5,6]
 */
public class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void findDisappearedNumbers() {
        int[] input = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(6);

        assertArrayEquals(expected.toArray(), FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(input).toArray());
    }
}