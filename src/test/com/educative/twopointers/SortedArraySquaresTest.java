package test.com.educative.twopointers;

import com.educative.twopointers.SortedArraySquares;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedArraySquaresTest {

    @Test
    public void makeSquares() {
        int[] testInput = new int[] {-2, -1, 0, 2, 3};

        int[] realOutput = SortedArraySquares.makeSquares(testInput);
        int[] expected = new int[]{0, 1, 4, 4, 9};

        assertArrayEquals(expected, realOutput);
    }

    @Test
    public void makeSquares2() {
        int[] testInput = new int[] {-3, -1, 0, 1, 2};

        int[] realOutput = SortedArraySquares.makeSquares(testInput);
        int[] expected = new int[]{0, 1, 1, 4, 9};

        assertArrayEquals(expected, realOutput);
    }
}