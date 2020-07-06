package com.leetcode.array.inplace;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        int[] input = new int[]{0,1,0,3,12};
        int[] expect= new int[]{1,3,12,0,0};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(expect, input);
    }

    @Test
    public void moveZeroesTwoPointers() {
        int[] input = new int[]{0,1,0,3,12};
        int[] expect= new int[]{1,3,12,0,0};
        MoveZeroes.moveZeroesTwoPointer(input);
        assertArrayEquals(expect, input);
    }
}