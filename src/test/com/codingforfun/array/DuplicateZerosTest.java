package test.com.codingforfun.array;

import com.leetcode.array.DuplicateZeros;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example 1:
 *
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 *
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 */
public class DuplicateZerosTest {

    @Test
    public void duplicateZerosTest1() {
        int[] input = new int[]{1,0,2,3,0,4,5,0};
        int[] expect = new int[]{1,0,0,2,3,0,0,4};

        DuplicateZeros.duplicateZeros(input);
        assertArrayEquals(expect, input);
    }

    @Test
    public void duplicateZerosTest2() {
        int[] input = new int[]{1,2,3};
        int[] expect = new int[]{1,2,3};

        DuplicateZeros.duplicateZeros(input);
        assertArrayEquals(expect, input);
    }
    @Test
    public void duplicateZerosTest3() {
        int[] input = new int[]{0,0,0,0,0,0,0};
        int[] expect = new int[]{0,0,0,0,0,0,0};

        DuplicateZeros.duplicateZeros(input);
        assertArrayEquals(expect, input);
    }
}