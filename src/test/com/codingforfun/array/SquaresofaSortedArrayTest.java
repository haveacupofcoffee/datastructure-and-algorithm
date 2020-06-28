package test.com.codingforfun.array;

import com.leetcode.array.SquaresofaSortedArray;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example 1:
 *
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 *
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class SquaresofaSortedArrayTest {

    @Test
    public void sortedSquaresTest1() {
        int[] input = new int[]{-4,-1,0,3,10};
        int[] expect = new int[]{0,1,9,16,100};

        assertArrayEquals(expect, SquaresofaSortedArray.sortedSquares(input));
    }

    @Test
    public void sortedSquaresTest2() {
        int[] input = new int[]{-7,-3,2,3,11};
        int[] expect = new int[]{4,9,9,49,121};

        assertArrayEquals(expect, SquaresofaSortedArray.sortedSquares(input));
    }
}